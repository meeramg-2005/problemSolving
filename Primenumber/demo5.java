import java.util.Scanner;

public class demo5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
    
        if (number <= 1) {
            System.out.println("It is not prime number");
        } else {
            int count=0;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    count=count+1;
                    break;
                }
                    
                    
                }
                if(count==0){

                 
                System.out.println("It is  prime number");
                }
                else{
                    System.out.println("It is not a prime number");
                }

                
            }
        }
        
        
        
    }


