import java.util.Scanner;

class CheckLeapYear{
    int year;
    public CheckLeapYear(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        year = scanner.nextInt();
    }

    public void PrintLeapYear(){
        if (year % 4 == 0) {
            System.out.println(year + " " + "is a leap year.");
        }
        else{
            System.out.println(year + " " + "is not a leap year.");
        }
    }
}

public class LeapYear {
    public static void main(String[] args) {
        CheckLeapYear check = new CheckLeapYear();
        check.PrintLeapYear();
    }
}
