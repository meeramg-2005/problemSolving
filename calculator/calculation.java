public class calculation{
    public int add(int num1,int num2){
        int num3=num1+num2;
        return num3;
    }
    public int subtract(int num1,int num2){
        int num3=num1-num2;
        return num3;
    }
    public int multiply(int num1,int num2){
        int num3=num1*num2;
        return num3;
    }
    public int division(int num1,int num2){
        int num3=num1/num2;
        return num3;
    }
    public static void main(String[] args){
        calculation obj=new calculation();
        int a=obj.add(10,5);
        System.out.println(a);
        int b=obj.subtract(10,4);
        System.out.println(b);
        int c=obj.multiply(10,5);
        System.out.println(c);
        int d=obj.division(10,5);
        System.out.println(d);
    }
}