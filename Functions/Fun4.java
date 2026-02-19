package Functions;
//No Arguments pass but   Return value
import java.util.Scanner;
public class Fun4 {
    public static float getArea()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        float r,PI=3.147f,area;
         r=sc.nextFloat();
        area=PI*r*r;
        return (area);
    }
    public static void main(String[] args) {
        float r,area;
        area=getArea();
        System.out.println("Area is:"+area);
        area=getArea();
        System.out.println("Area is:"+area);
        area=getArea();
        System.out.println("Area is:"+area);
    }
    
}
