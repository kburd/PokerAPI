
package com.kburd.pokerAPI.model;

import com.kburd.pokerAPI.enums.Rank;
import com.kburd.pokerAPI.enums.Suit;

public class Card{

    Suit suit;
    Rank rank;

    public Card(Suit suit, Rank rank){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString(){
        return this.suit + " " + this.rank;
    }

}
