import java.util.Scanner;

class Inputs {
    int P;
    int r;
    int t;

    public Inputs(){
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter initial principle balance(P): ");
        P = scanner.nextInt();

        System.out.println("Enter actual interest rate(r): ");
        r = scanner.nextInt();

        System.out.println("Enter time in year(t): ");
        t = scanner.nextInt();
    }
 
    public void calculate(){
        int A = P*(1 + ((r/100)*t));
        System.out.println("Simple interest: " + A);
    }
}

public class SimpleInterest {
    public static void main(String[] args) {
        Inputs A = new Inputs();
        A.calculate();
    }   
}
