public class builder{
    public String add(String a,String b){
        String c=a+b;
        return c;
    }
    public static void main(String[] args){
        String a= "computer";
        String b="programming";
        builder obj=new builder();
        String result=obj.add (a,b);
        System.out.println(result);
    }
}