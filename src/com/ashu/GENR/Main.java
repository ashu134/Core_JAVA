package com.ashu.GENR;
//Generics

interface Player{
    String name();
}
record BaseballPlayer(String name,String position) implements Player{
}
record FootballPlayer(String name,String position) implements Player{
}
record VolleyballPlayer(String name,String position) implements Player{
}
public class Main {
    public static void main(String[] args) {
        BaseballTeam europe= new BaseballTeam("Philadelphia");
        BaseballTeam india = new BaseballTeam("Patna");
        //ScoreResult(europe,3,india,4);
        ScoreResult(europe,4,india,1);
        System.out.println("");

        SportsTeam europe1= new SportsTeam("Philadelphia");
        SportsTeam india1= new SportsTeam("Patna");
        ScoreResult(europe1,3,india1,4);
        //ScoreResult(europe,4,india,1);
        System.out.println();

        Team<BaseballPlayer> europe2= new Team<>("Philadelphia");
        Team<BaseballPlayer> india2= new Team<>("Patna");
        ScoreResult(europe2,3,india2,4);
        //ScoreResult(europe,4,india,1);
        System.out.println();

        var sunil = new BaseballPlayer("Sunil tharpakar","center");
        var akshay= new BaseballPlayer("Akshay kumar","left corner");
        india.addTeamMember(sunil);
        india.addTeamMember(akshay);
        india.listTeamMembers();

        SportsTeam ifc = new SportsTeam("JamsedPur FC");
        var tex = new FootballPlayer("Gingua for team","Right Corner");
        ifc.addTeamMember(tex);
        ifc.listTeamMembers();


        Team<VolleyballPlayer> Kolkata= new Team<VolleyballPlayer>("Kolkata FC");
        Kolkata.addTeamMember(new VolleyballPlayer("N kotes","Middle"));
        Kolkata.listTeamMembers();
        ScoreResult(Kolkata,1,india2,8);


        //generica Cannot be used with primitive datatypes like int
        //Team<Integer> myteam= new Team<>("My Football club");
    }
    public  static void ScoreResult(BaseballTeam team1,int t1_score,
                                    BaseballTeam team2, int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s,%s,%s",team1,message,team2);
    }
    public  static void ScoreResult(SportsTeam team1,int t1_score,
                                    SportsTeam team2, int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s,%s,%s",team1,message,team2);
    }

    public  static void ScoreResult(Team team1,int t1_score,
                                    Team team2, int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s,%s,%s",team1,message,team2);
    }
}
