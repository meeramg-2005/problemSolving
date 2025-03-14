public class demo8{
     public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public void add(int a,int b,int c){
        int d=a+b+c;
        System.out.println(d);

    }
    public static void main(String args[]){
        demo8 obj=new demo8();
        obj.add(10,20);
        obj.add(10,20,30);
    }
    }