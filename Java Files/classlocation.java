import java.util.*;
import java.util.Scanner; 
public class main{
    public static void main(String[] args) {

        locaction obj1=new locaction();
      obj1.locations();
    }
}

                    //LOCATION AND THEATERS
class locaction{
    void locations(){
        System.out.println("available locations");
        System.out.println("************************");
        System.out.println("[chennai,coimbatore]");
        Scanner loc=new Scanner(System.in);
        System.out.println("select location");
        System.out.println("************************");
        String lo=loc.nextLine();
        System.out.println("your selected location --->"+lo);
        if(lo.contains("coimbatore"))
        {
            System.out.println("your selected coimbatore");
            System.out.println("available theaters ");
            System.out.println("************************");
            System.out.println("[gk cinemas,jazz cinemas]");
            System.out.println("select theater");
            System.out.println("************************");
            Scanner theater=new Scanner(System.in);
            String th=theater.nextLine();
            if(th.contains("gk cinemas"))
            {
                System.out.println("your selecte ---> "+th);
            }
            else if(th.contains("jazz cinemas"))
            {
                System.out.println("your selecte ---> "+th);
            }
            else {
                System.out.println(" selecte correct theatres[gk cinemas or jazz cinemas] ");
            }
           // System.out.println("your selecte ---> "+th);
            
        }
        else if(lo.contains("chennai"))
        {
            System.out.println("your selected chennai");
            System.out.println("available theaters");
            System.out.println("************************");
            System.out.println("[brook fields,kg cinemas]");
            System.out.println("select theater");
            System.out.println("************************");
            Scanner theaters=new Scanner(System.in);
            String the=theaters.nextLine();
            if(the.contains("brook fields"))
            {
                System.out.println("your selecte ---> "+the);
            }
            else if(the.contains("kg cinemas"))
            {
                System.out.println("your selecte ---> "+the);
            }
            else 
            {
                System.out.println("select correct theater");
            }
            System.out.println("your selecte ---> "+the);
        }
        else
        {
            System.out.println("enter correct location");
            System.out.println("************************");
            System.out.println("available locations[coimbatore,chennai]");
        }
    }
}                