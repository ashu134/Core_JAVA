package com.ashu.POLY;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       /*
       Movie movie=new Adventure("SpaceWar");
        Movie comedy=new Comedy("The Family");
        Movie scienceFiction=new SiFi("Altered carbon");
        movie.watchMovie();
        comedy.watchMovie();
        scienceFiction.watchMovie();

        Movie film= Movie.getmovie("S","GolMAl");
        film.watchMovie();
*/
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter type (A for Adventure" +
                    "C for Comedy " +
                    "S for scienceFiction " +
                    "Q for quit)");
            String type = sc.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Please Enter Movie Name");
            String title = sc.nextLine();
            Movie movie1 = Movie.getmovie(type, title);
            movie1.watchMovie();
        }

    }
}
