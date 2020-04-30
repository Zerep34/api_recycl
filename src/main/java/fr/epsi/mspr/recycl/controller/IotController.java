package fr.epsi.mspr.recycl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class IotController {

    ArrayList<String> test = new ArrayList<>();

    @PostMapping("/greeting")
    @ResponseStatus(HttpStatus.OK)
    public void greeting(@RequestBody String body) {
        System.out.println(body);
    }

}
