public class DemoOperator {
  public static void main(String[] args) {
    // + - * / 

    // % 
    int remainder = 5 % 2;
    System.out.println(remainder);

    System.out.println(5 % 6);

    // ++ -- 
    // += 
    int a = 10;
    a = a + 1;
    a += 1;
    a++;
    ++a;
    System.out.println(a); //14

    int b = 20;
    b = b - 1;
    b--;
    --b;
    b -= 1;
    System.out.println(b); //16

    // + 2 

    int c = 10; 
    c = c + 2;
    c += 2;

    double hourRate = 40.5; 
    int hoursPerDay = 7;
    double todaySalary = hourRate * hoursPerDay; 
    System.out.println(todaySalary);

    // pre / post 
    int g = 10;
    g++;
    ++g; 

    // post ++ 
    g = g++ * 2;


  }
  
}
