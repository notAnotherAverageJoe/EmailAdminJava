# 📧 Email Administration Application

This Java application is designed to manage employee email accounts for a company named ByteBrewmaster. It allows for creating new email accounts, setting and changing passwords, specifying departments, and managing mailbox capacities. 

## 🚀 Features

- Create a new email account for an employee
- Automatically generate a random password
- Set the employee's department
- Set an alternate email address
- Change the password
- Display employee information

## 🛠️ Installation

1. **Clone the repository**:
    ```sh
    git clone https://github.com/yourusername/email-administration.git
    cd email-administration
    ```

2. **Compile the code**:
    ```sh
    javac Email.java
    ```

3. **Run the application**:
    ```sh
    java Email
    ```

## 📝 Usage

To create a new email account, instantiate the `Email` class with the employee's first and last name:

```java
public class Main {
    public static void main(String[] args) {
        Email email = new Email("John", "Doe");
        System.out.println(email.showInfo());
    }
}
//example below
New Employee: Jane
Enter the department
1 for Sales
2 for Development
3 for Accounting
0 for none. 
Enter Department code: 2
Department is: Development
Your password is: A1B2C3D4E5
Display Name: Jane Smith
Company Email: jane.smith@development.bytebrewmaster.com
Mailbox Capacity: 10gb
```
## 📄 Class and Methods
Email Class
Constructor: Email(String firstName, String lastName)

Initializes a new email account with the provided first and last names.
Sets the department based on user input.
Generates a random password.
Creates the email address in the format: firstname.lastname@department.company.com.
Methods:
```java
private String setDepartment(): Prompts user for department and returns it.
private String generateRandomPassword(int length): Generates a random password of given length.
public void setMailboxCapacity(int capacity): Sets the mailbox capacity.
public void setAlternateEmail(String altEmail): Sets an alternate email address.
public void changePassword(String password): Changes the password.
public int getMailboxCapacity(): Returns the mailbox capacity.
public String getAlternateEmail(): Returns the alternate email address.
public String getPassword(): Returns the current password.
public String showInfo(): Returns a string containing the employees display name, email address, and mailbox capacity.
```
## 🤝 Contributing
Feel free to fork this repository and contribute by submitting a pull request. Contributions are welcome!
## Special thanks to:
## ATGTG
