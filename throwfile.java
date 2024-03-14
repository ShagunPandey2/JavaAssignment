import java.util.Scanner;

public class throwfile {
    int div(int a,int b)
    {
        if (b==0)
        {
            throw new ArithmeticException("HEY Thats 0 you cant divide a number by ZERO");
        }
        else{
            return a/b;
        }
        
        
    }
    public static void main(String[] args) throws ArithmeticException {
        throwfile obj=new throwfile();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(obj.div(a,b));
        sc.close();
        
    }
    
}
