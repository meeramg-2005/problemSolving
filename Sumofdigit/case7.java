import java.util.*;
public class case7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i=0;
        int count=0;
        while(i<n){
            System.out.println("Enter the value :");
            a[i]=sc.nextInt();
            i=i+1;
        }
        

        
        while(i<n){
            System.out.println("Enter the value :"+a[i]);
            
            i=i+1;
            
        }
        for(i=0;i<n;i++)
        count=count+a[i];
        System.out.println(count);
    



        
        
    }
} 