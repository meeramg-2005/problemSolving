 class parent{
        void display(){

        }
        }
    
    class child extends parent{
        void display(){
            System.out.println("hello");
        
    }
    }
    public class case4{
        public static void main(String args[]){
            child obj=new child();
            obj.display();
        }
    }
    