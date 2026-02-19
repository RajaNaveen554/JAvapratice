import java.util.*;
public class Switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a,b values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        do{
        System.out.println("1.Add");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.modulus");
        System.out.println("6.Exit");
        System.out.println("Enter choice:");
        c=sc.nextInt();
        switch(c)
        {
            case 1:
                System.out.println("A+B:"+(a+b));
                break;
            case 2:
                System.out.println("A-B:"+(a-b));
                break;
            case 3:
                System.out.println("AXB:"+(a*b));
                break;
            case 4:
                System.out.println("A/B:"+(a/b));
                break;
            case 5:
                System.out.println("A%B:"+(a%b));
                break;
            case 6:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Your choice is out of bound");
        }
        }while(c<6);
        
    }

    
}
