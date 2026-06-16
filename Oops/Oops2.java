import java.util.Scanner;
public class Oops2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the code:");
        int code=sc.nextInt();
        System.out.print("Enter Name:");
        String name=sc.next();
        Student s=new Student();
        s.setData(code,name);
        s.showData();
    }
}
