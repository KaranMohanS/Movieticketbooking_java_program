import java.util.*;
import java.util.Scanner; 
public class main{
    public static void main(String[] args) {

     normal obj3=new normal();
     obj3.seat();
     obj3.sofaseat();
     obj3.diamondseat();
     obj3.normalseat();
      
    }
}

  //SEATSTYPE

class seats{
    void seat(){
        System.out.println("available seats type");
        System.out.println("************************");


    }
}
    class sofa extends seats{
        void sofaseat(){
        System.out.println("sofa seat rate --->200RS");
    }
}
    class diamond extends sofa{
        void diamondseat(){
        System.out.println("diamond seat rate --->160RS");
    }
}
    class normal extends diamond{
        void normalseat(){
        System.out.println("normal seat rate --->130RS");
        }
    }