package com.ashu.POLY;
public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie(){
        String instanceType= this.getClass().getSimpleName();
        System.out.println(title+ " Is a "+ instanceType+ " Film.");
    }
    public static Movie getmovie(String type, String title){
        //Call different Method based on inputs
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new SiFi(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Pleasant Movie",
                "Scary Music",
                "Something bad happens");
    }
}
class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Something funny happens",
                "Something More happier",
                "Happy ending ");
    }
}
class SiFi extends Movie{
    public SiFi(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "BAd alliens came to the planet",
                "Fight happens with locals",
                "Planet blown up");
    }
}