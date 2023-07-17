import java.util.*;
import java.util.Scanner; 
public class main{
    public static void main(String[] args) {

        numberofseats obj5=new numberofseats();
        obj5.seats();
    }
}

//SEATBOOKING
class numberofseats{
    void seats(){
        Scanner ns=new Scanner(System.in);
        System.out.println("number of  seat");
        System.out.println("************************");
        int st=ns.nextInt();
        System.out.println("number of  seat your selected --->"+st);
        System.out.println("seat type");
        System.out.println("************************");
        Scanner seattype=new Scanner(System.in);
        String sts=seattype.nextLine();

        if(sts.contains("sofa"))
        {
            System.out.println("************************");
            System.out.println("your selected seats --->"+sts);
            System.out.println("total --->"+st*200);
        }
        else if(sts.contains("diamond"))
        {
            System.out.println("************************");
            System.out.println("your selected seats --->"+sts);
            System.out.println("total --->"+st*160);
        }
        else if(sts.contains("normal"))
        {
            System.out.println("************************");
            System.out.println("your selected seats --->"+sts);
            System.out.println("total --->"+st*130);
        }
        else 
        {
            System.out.println("available seat type [sofa,diamond,normal]");
        }
        }
        }
