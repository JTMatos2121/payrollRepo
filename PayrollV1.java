import java.util.Scanner;

public class PayrollV1{
    public static void main(String[] args){
        System.out.print("Welcome to Simple Payroll program\n");

        Scanner keyboard = new Scanner(System.in);

        //Gets user name
        System.out.print("Enter Employee's Name: ");
        String name = keyboard.nextLine();

        //Gets employee hours worked and convert imput string into integer
        System.out.print("Enter employee hours worked: ");
        String hoursWorked =keyboard.nextLine();
        int hoursWorkedi = Integer.parseInt(hoursWorked);

        //Gets hourly rate and converts input string into integer
        System.out.print("Enterhourly rate: ");
        String rate = keyboard.nextLine();
        double rate_i = Double.parseDouble(rate);

        //Get User gross pay due by multiplying hourly rate by hours worked
        System.out.println(name+" "+"gross pay due is"+" "+ rate_i* hoursWorkedi);


    }
}

