package Functions;
//Arguments pass and   Return value
import java.util.*;
public class Fun3 {
    public static float getArea(float r)
    {
        float PI=3.147f,area;
        area=PI*r*r;
        return (area);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float r,area;
        System.out.println("Enter radius are:");
        r=sc.nextFloat();
        area=getArea(r);
        System.out.println("Area is:"+area);
        System.out.println("Enter radius are:");
        r=sc.nextFloat();
        area=getArea(r);
        System.out.println("Area is:"+area);
        System.out.println("Enter radius are:");
        r=sc.nextFloat();
        area=getArea(r);
        System.out.println("Area is:"+area);
    }

    
}
