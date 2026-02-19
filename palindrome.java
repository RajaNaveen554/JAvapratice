import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the String:");
        String n=sc.nextLine();
        boolean b=true;
        int l=n.length();
        for(int i=0;i<l/2;i++)
        {
            if(n.charAt(i)!=n.charAt(l-i-1))
            {
                b=false;
                break;
            }
        }
        if(b)
        {
            System.out.print("Given " + n + " is palindrome");
        }
        else{
            System.out.print("Given " + n + " is not palindrome");


        }
        
    }
    
}
