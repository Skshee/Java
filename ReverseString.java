import java.util.*;
public class ReverseString {
    public static void main(String []args)
    {
    System.out.println("Enter the string:");
    StringBuilder sb = new StringBuilder("Hello");
    int i;
    // Reversing the string
    for(i=0;i<sb.length()/2;i++)
    {
      char FrontChar = sb.charAt(i);
      char BackChar = sb.charAt(sb.length()-i-1);

      sb.setCharAt(i, BackChar);
      sb.setCharAt(sb.length()-i-1,FrontChar);
    }
    System.out.println(sb);
}
}
