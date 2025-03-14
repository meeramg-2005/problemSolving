import java.util.*;
public class demo5{
    public static void main(String args[]){
        String v[]={"a","e","i","o","u"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        String n= sc.nextLine();
        int detect=0;
        int i=0;
        while(i<=4){
            if(n.equals(v[i])){
                detect=1;
            }
            i=i+1;
        }
            if(detect==1){
                System.out.println("vowel");
            }
            else{
                System.out.println("Not vowel");
            }
        }
        
        

        
        }
        
            

        
    




