package com.tuwaiq.excercise1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class welcomeController {

    @GetMapping("GET/name")
    public String name(){
        return "My name is: Mohammed";
    }

    @GetMapping("GET/age")
    public String age(){
        return String.format("My age is %d", 26);
    }

    @GetMapping("GET/check/status")
    public String checkStatus(){
        return "Everything ok";
    }

    @GetMapping("GET/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping("GET/names")
    public String[] names() {
        return new String[]{"mohammed" , "ahmed", "saleh"};
    }

    @GetMapping("GET/names2")
    public ArrayList<String> names2() {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(new String[]{"mohammed" , "ahmed", "saleh"}));
        return names;
    }
}
