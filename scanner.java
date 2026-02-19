import java.util.Scanner;;
public class scanner {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  a,b values:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.print("A = " + a + " B=" + b + " sum= " + (a+b));
    }
    
}
