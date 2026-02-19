package Functions;
import java.util.Scanner;
public class Fun1 {
    public static void getArea()
    {
        float r,PI=3.147f,area;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius:");
         r=sc.nextInt();
        area=PI*r*r;
        System.out.print("The Area of Circle with radius " + r +"is"+area); 
    }
    public static void main(String[] args) {
        getArea();
    }
    
}
