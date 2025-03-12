public class meth1{
    public void add(int num1,int num2){
        int num3=num1+num2;
        System.out.println(num3);
    }
    public static void main(String[] args){
        int num1=10;
        int num2=20;
        meth1 obj=new meth1();
        obj.add(num1,num2);
    }
}