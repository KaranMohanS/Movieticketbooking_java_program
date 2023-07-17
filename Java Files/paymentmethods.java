import java.util.*;
import java.util.Scanner; 
public class main{
    public static void main(String[] args) {

        payment obj6=new payment();
        obj6.pay();
   
    }
}

class payment{          //PAYMENT METHOD
    void pay(){
        System.out.println("payment methods");
        System.out.println("************************");
        System.out.println("[upi,bank transfer]");
        Scanner payments=new Scanner(System.in);
        System.out.println("select payment options");
        System.out.println("************************");
        String pm=payments.nextLine();
        if(pm.contains("upi"))
        {
            System.out.println("your selected payment option --->"+pm);
            System.out.println("*** payment successful ***");
        }
        else if(pm.contains("bank transfer"))
        {
            System.out.println("your selected payment option --->"+pm);
            System.out.println("*** payment successful ***");
        }
        else 
        {
            System.out.println(" selecte available payment option ");
        }
        //System.out.println("your selected payment option --->"+pm);
        //noSystem.out.println("*** payment successful ***");

    }
}
    