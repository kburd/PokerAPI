package com.kburd.pokerAPI;

import com.kburd.pokerAPI.enums.Rank;
import com.kburd.pokerAPI.enums.Suit;
import com.kburd.pokerAPI.model.Card;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Rest {
    
    @RequestMapping("/ping")
    public String ping() {
        return "Success";
    }


    
}
