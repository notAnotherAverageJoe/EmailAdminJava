import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength =10;
    private int mailboxCapacity= 10;
    private String alternateEmail;
    private String companySuffix = "ByteBrewmaster.com";


    //constructor
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
        System.out.println("Department is: " + this.department);


        //call a method that sets random password
        this.password = generateRandomPassword(defaultPasswordLength);
        System.out.println("Your password is " + this.password);

        email = firstName.toLowerCase() + "." +
                lastName.toLowerCase() +"@" +department +"."+ companySuffix;


    }

    // Method to set department based on user input
    private String setDepartment() {
        System.out.println("New Employee: " + firstName +
                "\nEnter the department" +
                "\n1 for Sales " +
                "\n2 for Development " +
                "\n3 for Accounting" +
                "\n0 for none. ");
        System.out.print("Enter Department code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1) {
            return "Sales";
        } else if (deptChoice == 2) {
            return "Development";
        } else if (deptChoice == 3) {
            return "Accounting";
        } else {
            return "None";
        }
    }

    // Method to generate a random password
    private String generateRandomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail (String altEmail){
        this.alternateEmail=altEmail;
    }
    public void changePassword(String password){
        this.password=password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }
    public String showInfo() {
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nMailbox Capacity: " + mailboxCapacity + "gb";
    }




}