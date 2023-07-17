//CANCELLATION 
import java.util.*;
import java.util.Scanner; 
public class main{
    public static void main(String[] args) {

        cancellation obj7=new cancellation();
     obj7.cancel();
        
    }
}



class cancellation{ 
        
    void cancel(){
        System.out.println("cancellation available");
        System.out.println("************************");
        Scanner cancellation=new Scanner(System.in);
        System.out.println("two options[yes or no]");
        System.out.println("************************");
        //cancel.add("YES");
        //cancel.add("NO");
        //System.out.println(cancel);
        System.out.println("select method");
        System.out.println("************************");
        String c=cancellation.nextLine();
        
        if(c.contains("no"))
        
        {
            System.out.println("*** BOOKING CONFIRM ***");
        }
        else if(c.contains("yes")){
            System.out.println("*** BOOKING CANCEL ***");
            System.out.println("your payment returns brfore 24 hours");
            
        }
        else 
        {
            System.out.println("select corret options[yes or no]");
        }
        
    }
}
    


















