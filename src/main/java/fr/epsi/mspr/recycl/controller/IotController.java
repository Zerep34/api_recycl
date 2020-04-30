package fr.epsi.mspr.recycl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class IotController {

    ArrayList<String> test = new ArrayList<>();

    @PostMapping("/greeting")
    public HttpStatus greeting(@RequestBody String body) {
        System.out.println(body);
        return HttpStatus.OK;
    }

}
