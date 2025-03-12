public class case1{
    public static int add(int num1,int num2){
        int num3=num1+num2;
        return num3;
    }
    
public static void main(String[] args){
    int num1=10;
    int num2=20;
    case1 obj=new case1();
    int result=obj.add(num1,num2);
    System.out.println(result);

}

}