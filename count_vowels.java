import java.util.Scanner;
public class  count_vowels{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String n=sc.nextLine();
        String vowels="AEIOUaeiou";
        int v=0;
        int c=0;
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            if(ch>='A' && ch<='Z'|| ch>='a' && ch<='z')
            {
                if(vowels.indexOf(ch)!=-1)
                {
                    v++;
                }
                else
                {
                    c++;
                }
            }
        }
        System.out.println("The vowels count is"+v);
        System.out.println("The consonants count is"+c);
    }
}
