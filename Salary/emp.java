import java.util.*;
class Employee{
    int calculateSalary(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        int baseSalary =sc.nextInt();
        return baseSalary;
    }
}
class Manager extends Employee{
    void salary1(){
        int baseSalary=calculateSalary();
        double a=baseSalary*0.2;
        double b=baseSalary+a;
        System.out.println("Generator salary:"+b);
    }
}
class Developer extends Manager{
    void salary2(){
        int baseSalary=calculateSalary();
        double c=baseSalary*0.1;
        double d=baseSalary+c;
        System.out.println("Generator salary:"+d);
    }
}
public class emp{
    public static void main(String args[]){
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter times of process:");
        int n=sc.nextInt();
        while(i<n){
            System.out.println("1.Developer\n2.Manager");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            if(choice==1){
                Manager obj=new Manager();
                obj.salary1();
            }
            if(choice==2){
                Developer obj=new Developer();
                obj.salary2();
            }
            i=i+1;
        }
    }
}
