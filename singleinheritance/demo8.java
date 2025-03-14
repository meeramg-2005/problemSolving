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
    public class demo8{
        public static void main(String args[]){
            child obj=new child();
            obj.display();
        }
    }
    