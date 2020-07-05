package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.EMPLOYE;
import fr.epsi.mspr.recycl.model.view.V_EMPLOYE;
import fr.epsi.mspr.recycl.repository.Employe_Repository;
import fr.epsi.mspr.recycl.repository.service.EMPLOYE_Service;
import fr.epsi.mspr.recycl.repository.service.V_EMPLOYE_Service;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private V_EMPLOYE_Service V_EMPLOYE_Service;

    @Autowired
    private EMPLOYE_Service EMPLOYE_Service;

    @Autowired
    Employe_Repository employeRepository;

    @PostMapping("/user")
    public @ResponseBody String getUser(@RequestParam String login, @RequestParam String password) throws Exception {
        try{
            V_EMPLOYE e_login = V_EMPLOYE_Service.findByLogin(login);
            if(e_login != null){
                if(!e_login.isBlocked()){
                    Date ajd = new Date();
                    long diff = e_login.getDate_mdp().getTime() - ajd.getTime();
                    float res = Math.abs(diff / (1000*60*60*24));
                    System.out.println(res);
                    if(res < 60){
                        V_EMPLOYE e_pass = V_EMPLOYE_Service.findByLoginWithPass(login, password);
                        return e_login.getLogin();
                    }
                    this.EMPLOYE_Service.updateBlocked(login);
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
            V_EMPLOYE e = V_EMPLOYE_Service.findByLogin(login);
            if(e != null){
                EMPLOYE_Service.updateBlocked(login);
                return "done";
            }
            else{
                return "false";
            }
        }catch (Exception e){
            return "false";
        }
    }

    @PostMapping("/add_user")
    public @ResponseBody String addUser(@RequestParam String nom,
                                        @RequestParam String prenom,
                                        @RequestParam String date_naissance,
                                        @RequestParam String adresse,
                                        @RequestParam int antenne,
                                        @RequestParam int ville,
                                        @RequestParam int fonction,
                                        @RequestParam String motdepasse,
                                        @RequestParam int blocked,
                                        @RequestParam String login,
                                        @RequestParam String date_mdp) throws ParseException {
        Date dateNaissance = new SimpleDateFormat("yyyy-MM-dd").parse(date_naissance);
        Date dateMdp = new SimpleDateFormat("yyyy-MM-dd").parse(date_mdp);
        boolean tempBlocked;
        if(blocked == 1){
            tempBlocked = true;
        }
        else{
            tempBlocked = false;
        }
        EMPLOYE employe = new EMPLOYE(nom, prenom, dateNaissance, adresse, antenne, ville, fonction, motdepasse, tempBlocked, login, dateMdp);
        employeRepository.save(employe);
        return "saved";
    }
}
