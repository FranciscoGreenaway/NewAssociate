import java.util.*;

public class Associate {

    private String firstName;
    private String lastName;
    private String userName;
    private String emailAddress;
    private String password;
    private String department;
    private String companyName = "Publicks";
    private int passwordLength = 10;


    // Constructor used to get first and last name
    public Associate(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;


        this.userName = createUserName(firstName, lastName);
        this.emailAddress = createEmailAddress(userName);
        this.password = createRandomPassword(passwordLength);
        this.department = setDepartment();
    }

    // Create Random UserName
    private String createUserName(String firstName, String lastName){
        // Get first letter of First name in lowercase
        char fnfl = firstName.toLowerCase().charAt(0);

        // Randomize 4 digit character
        int randomInt = (int)(Math.random() * 9000) + 1000;

        // Username is first initial + lastname + randomized 4 digit int
        userName = fnfl + lastName.toLowerCase() + randomInt;
        System.out.println("Here's your username: " + userName);

        return userName;
    }

    // Create email address with randomized username
    private String createEmailAddress(String userName){
        emailAddress = userName + "@" + companyName + ".com";
        System.out.println("Here's your E-mail Address: " + emailAddress);
        return emailAddress;
    }

    // Create Random Password
    private String createRandomPassword(int passwordLength){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefhijklmnopqrstuvwxyz!@#$%^&*";
        char[] password = new char[passwordLength];

        for (int i = 0; i < passwordLength; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        System.out.println("Here's your Password: " + new String(password) + "\nDo NOT Share It With Anyone!!!");
        return new String(password);
    }

    private String  setDepartment() {
        System.out.println("Which Department are you in?");
        System.out.println("ENTER: Meat, Seafood, Grocery, Produce, Bakery, Customer Service, Deli or Pharmacy");

        Scanner sc = new Scanner(System.in);
        String dept = sc.nextLine().toLowerCase();
        //Using switch to match user input with possible department options
            switch (dept) {
                case "meat":
                    department = dept;
                    break;
                case "seafood":
                    department = dept;
                    break;
                case "grocery":
                    department = dept;
                    break;
                case "produce":
                    department = dept;
                    break;
                case "bakery":
                    department = dept;
                    break;
                case "customer service":
                    department = dept;
                    break;
                case "deli":
                    department = dept;
                    break;
                case "pharmacy":
                    department = dept;
                    break;
                default:
                    System.out.println("Incorrect Input");
                    break;
            }

        if (department == dept) {
            System.out.println("Good luck in the " + department + " department we are glad to have you!");
        }

        return department;
    }




}

