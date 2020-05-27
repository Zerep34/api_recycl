package fr.epsi.mspr.recycl.controller;

import fr.epsi.mspr.recycl.model.Employe_View;
import fr.epsi.mspr.recycl.repository.service.EmployeService;
import fr.epsi.mspr.recycl.repository.service.Employe_ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class UserController {

    @Autowired
    private Employe_ViewService employe_viewService;

    @Autowired
    private EmployeService employeService;

    @PostMapping("/user")
    public @ResponseBody String getUser(@RequestParam String login, @RequestParam String password) throws Exception {
        Employe_View e = employe_viewService.findByLogin(login, password);
        if(e != null){
            if(!e.isBlocked()){
                Date ajd = new Date();
                long diff = e.getDate_mdp().getTime() - ajd.getTime();
                float res = (diff / (1000*60*60*24));
                if(res < 60){
                    return e.toString();
                }
                this.employeService.updateBlocked(login);
                return "compte boqué";
            }return "false";

        }
        return "false";
    }

}
