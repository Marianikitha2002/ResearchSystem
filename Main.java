package RMS;

public class Main {

    public static void main(String args[]) {
        System.out.println("Welcome to Research Material System");
        System.out.println("Draft Contract is as follows:");
        String[] address = new String[5];
        address[0] = "9535329656";
        address[1] = "Bangalore";
        Lawyer X = new Lawyer("Mrinalini", address, 10000, "lawyer");
        X.Draft_Contract();
    }

}