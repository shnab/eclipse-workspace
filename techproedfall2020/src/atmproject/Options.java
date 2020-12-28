package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Options extends Account {

    Scanner scan = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat();
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void login(){
        boolean flag = true;
        do{
            data.put(12345,1234);
            data.put(23456,2345);
            data.put(34567,3456);
            data.put(45678,4567);

            System.out.println("Hi, Welcome to ATM...");
            try {
                System.out.print("Enter account number: ");
                setAccountNumber(scan.nextInt());
                System.out.print("Enter your pin number: ");
                setPinNumber(scan.nextInt());
            }catch(Exception e){
                System.out.println("You entered invalid characters, please enter an integer to proceed or press 'Q' to exit");
                scan.nextLine();
                String exit = scan.next().toLowerCase();
                if(exit.equals("q")){
                    flag = false;
                }
            }
            int count =0;
            for(Map.Entry<Integer,Integer> w : data.entrySet()){
                if(w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPinNumber())){
                    getAccountTypes();
                }else{
                    count++;
                }
            }
            if(count==data.size()){
                System.out.println("Account number or pin number is not matching");
                System.out.println("Press any integer to try again or 'Q' to quit");
                String exit = scan.next().toLowerCase();
                if(exit.equals("q")){
                    flag = false;
                }
            }

        }while(flag==true);

    }

    public void getAccountTypes(){
        System.out.println("Select the account you want to access...");
        System.out.println("1: Checking Account");
        System.out.println("2: Saving Account");
        System.out.println("3: Quit");

        int selection = scan.nextInt();

        switch(selection){
            case 1:
                System.out.println("You are in checking account");//Create a method
                break;
            case 2:
                System.out.println("You are in saving account");//Create a method
                break;
            case 3:
                System.out.println("Thanks for using ATM, see you later...");
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2 or 3");
                getAccountTypes();
        }
    }
}
