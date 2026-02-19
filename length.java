import java.util.Scanner;
public class length {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the String:");
        String n=sc.nextLine();
        int c=0;
        for(int i=0;i<n.length();i++)
        {
            c++;

        }
        System.out.println("The Length of String:"+c);
    }
    
}
