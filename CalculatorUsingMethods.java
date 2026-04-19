import java.util.Scanner;
public class CalculatorUsingMethods {
    public static void main(String[] args){
       Scanner sc= new Scanner (System.in);
       System.out.print("Enter the first no.:  "); 
       double n1 = sc.nextDouble();
       System.out.print("Enter the Second no. :  ");
       double n2 = sc.nextDouble();
       System.out.print("Enter operator :  ");
       char opt = sc.next().charAt(0); 

       switch(opt){
        case('+') :{
            System.out.println("Addition is "+add(n1,n2));
            break;
        }
        case('-') :{
            System.out.println("Substraction is "+sub(n1,n2));
            break;
        }
        case('*') :{
            System.out.println("Product is "+multi(n1,n2));
            break;
        }
        case('/') :{
            System.out.println("Division is " +division(n1,n2));
            break;
        }
        case('%') :{
            System.out.println("Remender is "+modulus(n1,n2));
            break;
        }
        default :{
           System.out.println("invalid operator");
           break;
        }
        
       }
    }
    public static double add(double  a, double b){
        return a + b;
    }
    public static double sub(double  a, double b){
        return a - b;
    }
    public static double multi(double  a, double b){
        return a * b;
    }
    public static double division(double  a, double b){
        return a / b;
    }
    public static double modulus(double  a, double b){
        return a % b;
    }
    
}
