import java.util.*;

public class Email {
    
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 10;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "RoyalNeverGiveUp.com";

    // Constructor to receive the first name and last name
    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Asking for the department - return the department
        this.department = setDepartment();
        
        // Return a random password
        this.password = randomPassword(defaultPasswordLength);
        
        // Generate an email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() 
        	+ "@" + department.toLowerCase() + "." + companySuffix.toLowerCase();
    }

    // Ask for the department 
    private String setDepartment() {
        System.out.print("Choose a department: "
        		+ "\n1: Sales "
        		+ "\n2: Development "
        		+ "\n3: Accounting "
        		+ "\nAny Other Number: Other Departments"
        		+ "\nEnter your choice: ");
        
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        if (choice == 1) {
            return "Sales";
        } else if (choice == 2) {
            return "Development";
        } else if (choice == 3) {
            return "Accounting";
        } else {
            return "staff";
        }
    }

    // Generate a random password
    private String randomPassword(int length) {
    	String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890,./?!@#$%^&*_+";
    	char[] password = new char[length];
    	
    	for (int i = 0; i < length; i++) {
    		int random = (int) (Math.random() * passwordSet.length());
    		password[i] = passwordSet.charAt(random);
    	}
    	
    	return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int mailboxCapacity) {
    	this.mailboxCapacity = mailboxCapacity;
    }

    // Set the alternate email 
    public void setAlternateEmail(String alternateEmail) {
    	this.alternateEmail = alternateEmail;
    }

    // Change the password 
    public void changePassword(String password) {
    	this.password = password;
    }
    
    public int getMailboxCapacity() {
    	return mailboxCapacity;
    }
    
    public String getAlternateEmail() {
    	return alternateEmail;
    }
    
    public String getPassword() {
    	return password;
    }
    
    public String information() {
    	return "1. Employee Name: " + firstName + " " + lastName 
    			+ "\n2. Department: " + department
    			+ "\n3. Company Email: " + email 
    			+ "\n4. Email Password: " + password 
    			+ "\n5. Mailbox Capacity: " + mailboxCapacity + "GB"
    			+ "\n6. Alternate Email: " + alternateEmail;
    }
}
