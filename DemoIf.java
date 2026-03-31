public class DemoIf {
  public static void main(String[] args) {
    // if 
    int age = 23;

    // >, <, >=, <=
    if (age < 13) {
      System.out.println("adult");
    } else {
      System.out.println("child");
    }

    // 8 Primitives + 1 String 
    boolean gender = true;

    if (gender = false) {
      System.out.println("Male");
    } else {
      System.out.println("Female");
    }

    // vincent version 
    // = (assignment)
    // == (check if equals)
    age = 70;
    boolean isElderly = age>= 65; //true 
    if (isElderly) {
      System.out.println("Fee=2");
    }

    // && || 
    int a = 10;
    if (a >= 5 && a <= 20) {
      System.out.println("a is between 5 and 20.");
    }

        if (a >= 5 || a <= 20) {
      System.out.println("a is either >= 5 or <= 20.");
    } else {
      
    }


  }
  
}
