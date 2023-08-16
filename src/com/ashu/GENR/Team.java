package com.ashu.GENR;

import java.util.ArrayList;
import java.util.List;


public class Team<T extends Player> {
    private String teamName;
    private List<T> teamMember= new ArrayList<>();
    private int totalWins=0;
    private int totalLoss=0;
    private int totalTies=0;

    public Team(String teamName) {
        this.teamName = teamName;
    }
    public void addTeamMember(T t){
        if(!teamMember.contains(t)){
            teamMember.add(t);
        }
    }

    public void listTeamMembers(){
        System.out.println(teamName+ " Roster :");
        for(T t:teamMember){
            System.out.println(t.name());
        }
    }
    public int ranking(){
        return (totalLoss*2)+totalTies+1;
    }

    public String setScore(int ourScore, int theirScore){
        String message = "Lost to";
        if (ourScore>theirScore){
            totalWins++;
            message="beat";
        }else if(ourScore==theirScore){
            totalTies++;
            message="Ties";
        }else {
            totalLoss++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + " (ranked " + ranking()+ ")";
    }
}
