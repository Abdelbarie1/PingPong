package com.nespresso.exercises.pingpong;

import java.util.ArrayList;
import java.util.List;

public class PingPong {

    private final int matches;
    private List<Player> players=new ArrayList<>();

    public PingPong(int matches) {
        this.matches=matches;
        this.players.add(new Player("I"));
        this.players.add(new Player("O"));

    }

    public String print() {
        return getGameString(matches);

    }

    public String getGameString(int matches){
        StringBuilder gameString=new StringBuilder();
        for(int counter=0;counter<matches;counter++) {
            int numberPoints=counter*2;
            gameString.append(players.get(0).getName()+printPoints(numberPoints)+players.get(1).getName());
        }
        return gameString.toString();
    }

    public String printPoints(int quantity){
        String strPoints="";
        for(int counter=0;counter<quantity;counter++){
            strPoints+=".";
        }
        return strPoints;
    }
}
