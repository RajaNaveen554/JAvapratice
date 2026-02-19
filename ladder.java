//if..else lader
import java.util.*;
class lader
{
    public static void main(String args[])
    {
        String playername,rank="";
        int score;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Player Name :");
        playername=in.next();
        System.out.println("Enter Score:");
        score=in.nextInt();
        if(score==0)
        {
            rank="Dockout";
        }
        else 
        {
            if(score>0 && score<50)
            {
                rank="Below Half Century";
            }
            else 
            {
                if(score==50)
                    {
                    rank="Half Century";
                    }
                else
                    {
                        if(score>50 && score<100)
                            {
                                rank="Above Half Century";
                            }
                        else 
                        {
                            if(score==100)
                                {
                                    rank="Century";
                                }
                            else
                            {
                                if(score>100 && score<150)
                                    {
                                        rank="Above Century";
                                    }
                                    else
                                    {
                                        if(score==150)
                                            {
                                                rank="One and Half Century";
                                            }
                                            else 
                                            {
                                                if(score>150 && score<200)
                                                {
                                                    rank="Above one and Half Century";
                                                }
                                                else 
                                                {
                                                    if(score==200)
                                                    {
                                                        rank="Double Century";
                                                    }
                                                    else 
                                                    {
                                                        if(score>200)
                                                            {
                                                                rank="Above Double century";
                                                            }
                                                    }
                                                }
                                            }
                                    }
                            }
                        }
                    }
            }
        }
       
        
    System.out.println(playername + " played score is " + score + " he got rank is " + rank);
    }
}