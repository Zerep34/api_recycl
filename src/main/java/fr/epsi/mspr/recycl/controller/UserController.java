package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.EMPLOYE;
import fr.epsi.mspr.recycl.model.view.V_EMPLOYE;
import fr.epsi.mspr.recycl.repository.EmployeRepository;
import fr.epsi.mspr.recycl.repository.service.EmployeService;
import fr.epsi.mspr.recycl.repository.service.V_EMPLOYEService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private V_EMPLOYEService V_EMPLOYEService;

    @Autowired
    private EmployeService employeService;

    @Autowired
    EmployeRepository employeRepository;

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
                return "compte bloque";
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

    @PostMapping("/less_tournee")
    public @ResponseBody String less_tournee(@RequestParam int nb){
        Iterable<EMPLOYE> myIterator = employeRepository.emp_tournee(nb);
        List<EMPLOYE> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }
}
