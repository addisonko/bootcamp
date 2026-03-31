public class DemoString {
  public static void main(String[] args) {
    // Print String value 
    System.out.println("hello");

    // "" -> define String value 
    String s1 = "hello";
    s1 = s1 + "!!!";
    System.out.println(s1);

    // 1. length () --> int 
    System.out.println(s1. length());

    // 2. charAt () --> char 
    String s2 = "hello";
    // find the third character 
    System.out.println(s2.charAt(2));

    // Find the last character of s2 
    System.out.println(s2.charAt(s2.length() - 1));

    // 3. equals() --> boolean 
    String s3 = "hello";
    System.out.println(s2.equals(s3)); // true

    System.out.println(s2.equals(s1)); // false


  }
  
}
