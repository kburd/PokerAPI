package com.kburd.pokerAPI;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Rest {
    
    @RequestMapping("/ping")
    public String ping() {
        return "Success";
    }
    
}
