 class parent{
        public void add(){
            System.out.println("Hello world");
        }
    }
    class child extends parent{
        void display(){

        add();
    }
    }
    class third extends child{
        void helper(){
            display();
    }
    }
    public class demo9{
        public static void main(String args[]){
            child obj=new child();
            obj.display();
        }
    }
    