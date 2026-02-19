package Functions;
//Functions Over Loading
class Fun5
{
    public static int sum(int arg1,int arg2)
    {
        return(arg1+arg2);
    }
    public static int sum(int arg1,int arg2,int arg3)
    {
        return(arg1+arg2+arg3);
    }
    public static int sum(int arg1,int arg2,int arg3,int arg4)
    {
        return(arg1+arg2+arg3+arg4);
    }
    public static float sum(int arg1,float arg2)
    {
        return(arg1+arg2);
    }
    public static float sum(float arg1,int arg2)
    {
        return(arg1+arg2);
    }
    public static float sum(float arg1,float arg2)
    {
        return(arg1+arg2);
    }
    public static void main(String args[])
    {
        int a=10,b=20,c=30,d=40;
        float e=13.45f,f=45.456f;
        System.out.println("Two Ints Sum     " + sum(a,b));
        System.out.println("Three Ints Sum   " + sum(a,b,c));
        System.out.println("Four Ints Sum    " + sum(a,b,c,d));
        System.out.println("Int,Float  Sum   " + sum(a,e));
        System.out.println("Float,int  Sum   " + sum(e,a));
        System.out.println("Float,Float  Sum " + sum(e,f));
        
    }
}