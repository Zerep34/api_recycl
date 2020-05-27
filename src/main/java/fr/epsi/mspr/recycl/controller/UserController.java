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
            V_EMPLOYE e_login = V_EMPLOYEService.findByLogin(login);
            if(e_login != null){
                if(!e_login.isBlocked()){
                    Date ajd = new Date();
                    long diff = e_login.getDate_mdp().getTime() - ajd.getTime();
                    float res = Math.abs(diff / (1000*60*60*24));
                    System.out.println(res);
                    if(res < 60){
                        V_EMPLOYE e_pass = V_EMPLOYEService.findByLoginWithPass(login, password);
                        return e_login.getLogin();
                    }
                    this.employeService.updateBlocked(login);
                    return "compte bloque";
                }
            }
            return "false";
        }catch (Exception e){
            if(e.getMessage().equals("No User Found")){
                return "user";
            }
            else if(e.getMessage().equals("No Pass Found")){
                return "pass";
            }
            return "other";
        }
    }

    @PostMapping("/block_account")
    public @ResponseBody String block(@RequestParam String login) throws Exception {
        try{
            V_EMPLOYE e = V_EMPLOYEService.findByLogin(login);
            if(e != null){
                employeService.updateBlocked(login);
                return "done";
            }
            else{
                return "false";
            }
        }catch (Exception e){
            return "false";
        }
    }
}
