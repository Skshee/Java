import java.util.Scanner;

class Palindrome {
    static void Palindrome(String s1, String s2) {
        StringBuilder s3 = new StringBuilder(s1).append(s2);
        StringBuilder s4 = s3.reverse();
        System.out.println("The concatenated string is: " + s3);
        
        // To check for palindrome
        //String reverse = s3.reverse().toString();
        
        if (s4.equals(s3)) {
            System.out.println("It is a palindrome");
        } else {
            throw new Exception("The concatenated string is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String s2 = sc.nextLine();
        try{
            Palindrome(s1, s2);
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}