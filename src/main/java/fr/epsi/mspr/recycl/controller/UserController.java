package fr.epsi.mspr.recycl.controller;

import fr.epsi.mspr.recycl.model.view.V_EMPLOYE;
import fr.epsi.mspr.recycl.repository.service.EmployeService;
import fr.epsi.mspr.recycl.repository.service.V_EMPLOYEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @Autowired
    private V_EMPLOYEService V_EMPLOYEService;

    @Autowired
    private EmployeService employeService;

    @PostMapping("/user")
    public @ResponseBody String getUser(@RequestParam String login, @RequestParam String password) throws Exception {
        try{
            V_EMPLOYE e = V_EMPLOYEService.findByLogin(login, password);
            if(e != null){
                if(!e.isBlocked()){
                    Date ajd = new Date();
                    long diff = e.getDate_mdp().getTime() - ajd.getTime();
                    float res = Math.abs(diff / (1000*60*60*24));
                    System.out.println(res);
                    if(res < 60){
                        return e.getLogin();
                    }
                    this.employeService.updateBlocked(login);
                    return "compte bloqué";
                }return "compte bloqué";
            }
            return "false";
        }catch (Exception e){
            return "false";
        }

    }

}
