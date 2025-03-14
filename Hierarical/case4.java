 class Parent{
        public void add(){
            System.out.println("Hello world");
        }
    }
    class Child extends Parent{
        void display(){

        add();
    }
    }
    class Third extends Parent{
        void helper(){
            add();
    }
    }
    public class case4{
        public static void main(String args[]){
            Child obj=new Child();
            obj.display();
            Third sc=new Third();
            sc.helper();
    }
    }
    