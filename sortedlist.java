import java.util.Scanner;  
import java.util.Collections;
import java.util.ArrayList;

public class sortedlist{
    public static void main(String args[])
    {
        
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>(10);
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        System.out.println("Before Sorting");
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println("After Sorting");
        System.out.println(arr);

    }
}
