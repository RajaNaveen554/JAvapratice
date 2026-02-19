import java.util.*;
public class circle {
    public static void main(String[] args) {
        float r,area,PI=3.1416f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The radius:");
        r=sc.nextFloat();
        area=PI*r*r;
        System.out.println("Area is"+area);
    }
    
}
