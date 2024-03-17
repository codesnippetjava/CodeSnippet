package Shortcuts;

public class IntellijMethodExtraction {

    public static void main(String[] args) {
        // Original code
        String firstName = "John";
        String lastName = "Cena";
        String fullName = getFullName(firstName, lastName);
        System.out.println("Full Name: " + fullName);
    }

    private static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

}
