import java.util.*;
import java.util.Scanner; 
public class main{
    public static void main(String[] args) {

      dateandtime obj4=new dateandtime();
      obj4.dt();
    }
}

class dateandtime 
{
void dt(){
    System.out.println("available dates");
    System.out.println("************************");
    System.out.println("[mon-10,thu-11,wed-12]");
    Scanner date=new Scanner(System.in);
    System.out.println("select date");
    System.out.println("************************");
    String dt=date.nextLine();
    if(dt.contains("mon-10"))
    {
        System.out.println("your selected --->"+dt);
    }
    else if(dt.contains("thu-11"))
    {
        System.out.println("your selected --->"+dt);
    }
    else if(dt.contains("wed-12"))
    {
        System.out.println("your selected --->"+dt);
    }
    else
    {
        System.out.println("your selected available date wrong");
    }
    //System.out.println("your selected --->"+dt);
    System.out.println("available times");
    System.out.println("************************");
    System.out.println("[9am,12pm,3pm,6pm,9pm,12am,3am");
    Scanner time=new Scanner(System.in);
    System.out.println("select time");
    System.out.println("************************");
    String t=time.nextLine();
     if(t.contains("9am"))
     {
        System.out.println("your selected --->"+t);
     }
     else if(t.contains("12pm"))
     {
        System.out.println("your selected --->"+t);
     }
     else if(t.contains("3pm"))
     {
        System.out.println("your selected --->"+t);
     }
     else if(t.contains("6pm"))
     {
        System.out.println("your selected --->"+t);
     }
     else if(t.contains("9pm"))
     {
        System.out.println("your selected --->"+t);
     }
     else if(t.contains("12am"))
     {
        System.out.println("your selected --->"+t);
     }
     else if(t.contains("3am"))
     {
        System.out.println("your selected --->"+t);
     }
     else
     {
        System.out.println("your selected available time wrong");
     }
     
    //System.out.println("your selected --->"+t);
    


}
}
