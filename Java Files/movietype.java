import java.util.*;
import java.util.Scanner; 
public class main{
    public static void main(String[] args) {

        movietype obj2=new movietype();
        obj2.movies();
  
    }
}

class movietype{
    void movies(){
    System.out.println("available movie types");
    System.out.println("************************");
    System.out.println("[tamil,english]");
    Scanner movietype=new Scanner(System.in);
    System.out.println("select movie type");
    System.out.println("************************");
    String movie=movietype.nextLine();
   // System.out.println(movie);

    if(movie.contains("tamil"))
    {
        System.out.println("your selectrd tamil movies");
        System.out.println("available movies");
        System.out.println("************************");
        System.out.println("[LEO,THUNIVU]");
        Scanner tamilmovie=new Scanner(System.in);
        System.out.println("select movie");
        System.out.println("************************");
        String tamil=tamilmovie.nextLine();
        if(tamil.contains("LEO"))
        {
            System.out.println("your selected LEO MOVIE");
        }
        else if(tamil.contains("THUNIVU"))
        {
            System.out.println("your selected THUNIVU MOVIE");
        }
        else 
        {
            System.out.println("your selected available movie wrong");
        }
        System.out.println("your selected --->"+tamil);

    }
    else if(movie.contains("english"))
    {
        System.out.println("your selectrd tamil movies");
        System.out.println("available english movies");
        System.out.println("************************");
        System.out.println("[FLASH.THOR]");
        Scanner englishmovie=new Scanner(System.in);
        System.out.println("select movie");
        System.out.println("************************");
        String english=englishmovie.nextLine();
        if(english.contains("FLASH"))
        {
            System.out.println("your selected FLASH MOVIE");
        }
        else if(english.contains("THOR"))
        {
            System.out.println("your selected THOR MOVIE");
        }
        else 
        {
            System.out.println("selecte available movie");
        }
        System.out.println("your selected --->"+english);

    }
    else
    {
        System.out.println("select correct movietype[tamil or english]");
    }
    }
}
