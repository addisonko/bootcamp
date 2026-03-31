public class PrimitivesMath {
  public static void main(String[] args) {
    int count = 3;
    int price = 10;

    // int value * int value --> int value 
    // assign int value into int variable (total)
    int total = count * price;
    System.out.println(total); //30

    int totalScore = 750;
    int peopleCount = 8;

    // Java: int value / int value --> int value 
    int average = totalScore / peopleCount; 
    System.out.println(average); //93

    double average2 = totalScore / peopleCount;
    System.out.println(average2);
    
    int k = 100 + 300;
    System.out.println(k);

    // Re-assignment 
    k = 900; 

    // byte b1 = -128;
    // Step 1: byte value - int value --> int value 
    // System.out.println(b1 - 1); // -129

    // i take my own risk 
    // b1 = (byte) (b1 - 1);
    // System.out.println(b1);

    int amount = 2_100_000_000;
    // int value + int value = int value
    // assign int value into int variable
    amount = amount + 100_000_000;
    System.out.println(amount);

    // how do you use long to solve? 
    // int value + long value -> long value 
    amount = 2_100_000_000;
    long newAmount = amount + 100_000_000L;
    System.out.println(newAmount);

    double k2 = 0.1;
    double k3 = 0.2;
    System.out.println(k2 + k3);

  }
}
