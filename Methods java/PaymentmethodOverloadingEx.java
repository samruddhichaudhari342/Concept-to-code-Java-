import java.util.Scanner;
 class Payments {
    // 1.Cash payment
    void makePayment(double amt){
        System.err.println("Paid $"+amt+" using cash");
    }
    //2. Card payment
    void makePayment(double amt, long cardno){
        System.err.println("Paid $"+amt+ "using card");
    }
    // 3. UPI payment
    void makePayment(double amt, int no){
        System.err.println("Paid $"+amt+" using UPI");
    }
}

class PaymentmethodOverloadingEx{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        Payments pay=new Payments();//object of payment

        System.err.print("Enter amt: ");
        double amt= sc.nextDouble();

        System.out.println();
        System.err.println("choose payment method: ");
        System.err.println("1.Cash");
        System.err.println("2.Card");
        System.err.println("3.UPI");

        System.err.println();
        System.out.print("Enter choise: ");
        int choice= sc.nextInt();
        switch(choice){
            case 1:{
                pay.makePayment(amt);
                break;
            }
            case 2:{
                System.err.print("Enter card number: ");
                long card= sc.nextLong();
                pay.makePayment(amt ,card);
                break;
            }
            case 3:{
                System.err.print("Enter UPI no:");
                int upiId=sc.nextInt();
                pay.makePayment(amt,upiId);
                break;
            }
            default: {
                System.out.println("Invalid op");
            }
        }
    }
}