

        
import java.util.Scanner;

public class AgeValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int a = sc.nextInt();

        try {
            checkAge(a);
        } catch (AgeInvalidException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) throws AgeInvalidException {
        if (age < 18)
            throw new AgeInvalidException("Age is less than 18. Not eligible to vote.");

        System.out.println("Age is valid for voting.");
    }
}

class AgeInvalidException extends RuntimeException {

    AgeInvalidException(String msg) {
        super(msg);
    }
}