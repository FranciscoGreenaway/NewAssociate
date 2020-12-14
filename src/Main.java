import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello New Publicks Associate! Let's Get You Started!");

        // 3 Second Timer To let the New Associate Read
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("What is your first name?");
        String fname = sc.nextLine();
        System.out.println("What is your last name?");
        String lname = sc.nextLine();

        Associate as1 = new Associate(fname, lname);

        // 2 second delay
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }






    }
}
