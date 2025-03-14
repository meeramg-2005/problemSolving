
import java.util.*;
public class demo{
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public void sub(int a,int b){
        int c=a-b;
        System.out.println(c);
    }
    public void multiply(int a,int b){
        int c=a*b;
        System.out.println(c);
    }
    public void division(int a,int b){
        int c=a/b;
        System.out.println(c);
    }

    
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in); 
    System.out.println("Enter value of a:");
    int a=sc.nextInt();
    System.out.println("Enter value of b:");
    int b=sc.nextInt();
    System.out.print("Enter your choice");
    int choice=sc.nextInt();
    if(choice==1){
        demo obj=new demo();
        obj.add(a,b);

    }  
    if(choice==2){
        demo obj=new demo();
        obj.sub(a,b);
    }
    if(choice==3){
        demo obj=new demo();
        obj.multiply(a,b);
    }
    if(choice==4){
        demo obj=new demo();
        obj.division(a,b);
    }
    }
}