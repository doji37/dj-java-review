package com.cydeo;

import java.util.ArrayList;
// <T> for generic type
// extends Player means that the Team will only accept Player. Will do type checking to prevent different objects that are not children of Player
public class Team<T extends Player> {

    private String name;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }
}
