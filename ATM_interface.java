import java.util.Scanner;
public class ATM_interface {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int pin,pinin,balance=1000, withdraw,deposit=0,ch;
    System.out.println("-----------------------------ATM Machine-------------------------");
    System.out.println();
    System.out.println();
    System.out.println("Create Your ATM pin First:");
    System.out.println();
    System.out.println("Enter 4 digit PIN to create :");
    pin=sc.nextInt();
    System.out.println();
    System.out.println("PIN is created ");
    System.out.println();
    

    while(true){
         
         System.out.println("1. for Withdraw");
         System.out.println("2. for Deposite");
         System.out.println("3. for Check Balance");
         System.out.println("4. for Exit");
         System.out.println();
         System.out.println("Choose the option :");
         ch=sc.nextInt();

         switch(ch){
            case 1:
                System.out.println("Enter Your PIN first :");
                 pinin=sc.nextInt();
                if(pin==pinin){
                    System.out.println();
                    System.out.println("YOU ARE WELCOME");
                    System.out.println();
                    System.out.println("Enter the Amount to Withdraw :");
                    withdraw=sc.nextInt();
                    balance=balance-withdraw;
                    System.out.println();
                    System.out.println("YOUR Remaining Balance is : "+ balance);
                    System.out.println();
                    System.out.println();
                    
                }
                else {
                    System.out.println("Wrong PIN ");
                    System.out.println();
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Enter Your PIN first :");
                 pinin=sc.nextInt();
                if(pin==pinin){
                    System.out.println();
                    System.out.println("YOU ARE WELCOME");
                    System.out.println();
                    System.out.println("Enter the Amount to Deposite :");
                    deposit=sc.nextInt();
                    balance=balance+deposit;
                    System.out.println();
                    System.out.println("Now YOUR Current Balance is : "+ balance);
                    System.out.println();
                    System.out.println();
                    
                }
                else {
                    System.out.println("Wrong PIN ");
                    System.out.println();
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Enter Your PIN first :");
                 pinin=sc.nextInt();
                if(pin==pinin){
                    System.out.println();
                    System.out.println("YOU ARE WELCOME");
                    System.out.println();
                    System.out.println();
                    System.out.println("YOUR Account Balance is : "+ balance);
                    System.out.println();
                    System.out.println();
                    
                }
                else {
                    System.out.println("Wrong PIN ");
                    System.out.println();
                    System.out.println();
                }
                break;
            case 4:
                return;
            default :
                System.out.println("Enter right choice :");
                break;


         }


    }
   }
}
