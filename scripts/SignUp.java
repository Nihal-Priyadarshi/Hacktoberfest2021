/*
    @author: Maiara Mendes
    @Link: www.github.com/maiaramendes
 */

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SignUp {

    static Scanner scanner = new Scanner(System.in);
    static String name, email, password;
    static User user = new User();

    public static void main(String[] args) throws InterruptedException {
        SignUp.createAccount();
    }

    private static void createAccount() throws InterruptedException {
        System.out.println("Hello, welcome! ");
        System.out.println("Let's create your account? :)\n\n");

        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        } while (User.verifyIfValidName(name) == false);

        do {
            System.out.println("Enter your mail: ");
            email = scanner.nextLine();
        } while (User.verifyIfValidMail(email) == false);

        do {
            System.out.println("Enter your password: ");
            password = scanner.nextLine();
        } while (User.verifyIfValidPassword(password) == false);

        user.setUser(name, email, password);
        System.out.println("\n\nAccount successfully created!  ");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("\n\n\n\n\n");
        login();
    }

    private static void login() throws InterruptedException {
        System.out.println("----------------------------------------------");

        do {
            System.out.println("Enter your mail: ");
            email = scanner.nextLine();

            System.out.println("Enter your password: ");
            password = scanner.nextLine();
        } while(User.verifyAccount(email, password) == false);

        System.out.println("\n\nLogging...  ");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("\n\n\n\n\n\n");
        System.out.println("Welcome back, " + user.getName() + " :)");
        System.out.println("\n\n\n\n\n\n");
    }

    private static class User {
        private String name;
        private String password;
        private String email;

        public String getName() {
            return name;
        }

        public String getPassword() {
            return password;
        }

        public String getEmail() {
            return email;
        }

        public User() {
            super();
        }

        public void setUser(final String name,
                            final String email,
                            final String password) {
            this.name = name;
            this.email = email;
            this.password = password;
        }

        private static boolean verifyIfValidName(final String name) {
            if(name.length() > 50) {
                System.out.println("\nError! Invalid name, maximum of 50 characters!\n");
                return false;
            }

            if(name.length() < 5) {
                System.out.println("\nError! Invalid name, enter at least 6 characters!\n");
                return false;
            }
            return true;
        }

        private static boolean verifyIfValidMail(final String mail) {
            if(mail.length() >= 300) {
                System.out.println("Error! Invalid mail, maximum of 300 characters!");
                return false;
            }

            if(mail.length() < 8) {
                System.out.println("Error! Invalid mail, enter at least 6 characters!");
                return false;
            }

            if(!mail.contains("@")) {
                System.out.println("Error! Invalid mail, enter your mail again!");
                return false;
            }
            return true;
        }

        private static boolean verifyIfValidPassword(final String password) {
            if(password.length() > 13) {
                System.out.println("\nError! Invalid password, maximum of 12 characters!\n");
                return false;
            }

            if(password.length() < 5) {
                System.out.println("\nError! Invalid password, enter at least 6 characters!\n");
                return false;
            }
            return true;
        }

        private static boolean verifyAccount(final String email,
                                             final String password) {
            if(!user.getEmail().equalsIgnoreCase(email)) {
                System.out.println("\nIncorrect mail or user not found. ");
                return false;
            }

            if(!user.getPassword().equalsIgnoreCase(password)) {
                System.out.println("\nIncorrect password! Try again. ");
                return false;
            }
            return true;
        }
    }
}
