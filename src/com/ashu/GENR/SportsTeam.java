package com.ashu.GENR;

import java.util.ArrayList;
import java.util.List;


public class SportsTeam {
    private String teamName;
    private List<Player> teamMember= new ArrayList<>();
    private int totalWins=0;
    private int totalLoss=0;
    private int totalTies=0;

    public SportsTeam(String teamName) {
        this.teamName = teamName;
    }
    public void addTeamMember(Player player){
        if(!teamMember.contains(player)){
            teamMember.add(player);
        }
    }

    public void listTeamMembers(){
        System.out.println(teamName+ " Roster :");
        System.out.println(teamMember);
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
