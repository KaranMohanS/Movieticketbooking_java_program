import java.util.*;
import java.util.Scanner; 
public class main{
    public static void main(String[] args) {

        loginpage obj=new loginpage();
        obj.USERNAME();
        obj.PASSWORD();
    }
}


interface login{
    abstract void USERNAME();
    abstract void PASSWORD();

}                            //USER NAME
class loginpage implements login{
    public void USERNAME(){
        System.out.println("USERNAME");
        System.out.println("************************");
        Scanner user=new Scanner(System.in);
        String un=user.nextLine();
        if(un.contains("karan"))
        {
            System.out.println("");
        }
        else
        {
            System.out.println("user name error");
            
        }
       // System.out.println(un);
        

    }                        //PASSWORD
    public void PASSWORD(){
        System.out.println("PASSWORD");
        System.out.println("************************");
        Scanner pass=new Scanner(System.in);
        String pw=pass.nextLine();
        if(pw.contains("1234"))
        {
            System.out.println("WELLCOME");
        }
        else{
            System.out.println("password error");
            
        }
        //System.out.println(pw);
    
    }
}  
