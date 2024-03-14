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
    public static void main(String[] args) {
        throwfile obj=new throwfile();
        System.out.println( obj.div(10,0));
    }
    
}
