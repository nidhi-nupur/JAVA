public class OOPs_AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.username = "Nidhi Nupur";
        System.out.println(myAccount.username);
        // myAccount.password = "!@#$%^&*()_+"; // Can't be accessible.
        // System.out.println(myAccount.password); // It will show error Because password is accessible within "BankAccount" class only.
        

        myAccount.setPassword("!@#$%^&*()_+"); // Now we can change the password because we call the "Public" function "setPassword()" to change the password. 
        // System.out.println(myAccount.setPassword(password)); // Doubt // Required the concepts of Getter and Setter.




        // 1. Private - It restrict the visibility to the same class only.
        // 2. Default - If no Access Modifiers is specified, the default access Modifiers is used.
        //            - It allows access to classes, methods, or fields "within the same package".
        // 3. Protected - Allows visibility within the same package or sub-classes in different packages.
        // 4. Public - Allows visibility everywhere, across different packages.
    }
}

class BankAccount {
    public String username; // public = accessible to everyone.
    private String password; // private = accessible within this class only.

    public void setPassword(String pass) { // Now it is accessible outside of "BankAccount" class.
        password = pass;
    }
}



