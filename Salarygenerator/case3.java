import java.util.*;
public class case3{
 public static void main(String args[]){
    System.out.println("1.Developer\n 2. Manager");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Employee:");
    int a =sc.nextInt();
    System.out.println("Enter salary:");
    int b=sc.nextInt();
 
 if(a==1){
 float c=b*0.1f;
 float d=b+c;
 System.out.println(d);
 }
 if(a==2){
    float e=b*0.2f;
    float f=b+e;
    System.out.println(f);
 }

 }
}
