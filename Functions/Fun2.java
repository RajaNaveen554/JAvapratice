package Functions;
//Arguments pass but No Return value
import java.util.*;
public class Fun2 {
    public static void getArea(float r)
    {
        float PI=3.147f,area;
        area=PI*r*r;
        System.out.println("The Area of Circle with raius "+ r +"is"+area);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float r;
        System.out.println("Enter radius:");
        r=sc.nextFloat();
        getArea(r);
        System.out.println("Enter radius:");
        r=sc.nextFloat();
        getArea(r);
        System.out.println("Enter radius:");
        r=sc.nextFloat();
        getArea(r);
    }
    
}
