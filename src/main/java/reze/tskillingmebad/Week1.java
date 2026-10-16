package reze.tskillingmebad;
import java.util.Scanner;
import java.util.Arrays;

public class Week1 {
  public static void main (String[] args) {

    int age = 19;
    double height = 167.64;
    char initial = 'P';
    boolean status = true;

    String name = "Bumanglag, Jan Robien";

    System.out.println ("Your name is : " + name + " " + initial + ".");
    System.out.println ("Your age is: " + age);
    System.out.println ("Your height is: " + height);
    System.out.println ("Is the student enrolled? " + status);

    System.out.println ("----------------------------------------");

    int quantity = 30;
    double unitPrice = 165.67;
    double totalCost = quantity * unit;


    String storeName = "SARI-SARI STORE NI MANANG BIDANG";
    System.out.println ("----" + storeName + "----");
    System.out.println ("Item name: handkerchief");
    System.out.println ("Quantity: " + quantity);
    System.out.println ("Unit Price: " + unitPrice);
    System.out.println ("Total Cost: " + totalCost);

    /*totalCost should not be declared as int because the calculation may produce decimal values.*/

    
    System.out.println ("----------------------------------------");

    Scanner reze = new Scanner (System.in);

    System.out.println ("Enter Centimeter Value: ");
    double cm = scanner.nextDouble();

    int whole = (int)(cm / 100);
    double remaining = (cm % 100);

    System.out.println ("Result is " + whole + "m with a remainder of " + remaining + "cm");

    int intValue = 90;
    int convertedInt = intValue;

    System.out.println ("The value " + intValue + " is converted to " + convertedInt);
    /*No cast is needed because int can be automatically widened to double.*/

    double doubleValue = 90.30
    int convertedDouble = (int)doubleValue;

    System.out.println ("The value " + doubleValue + " is converted to " + convertedDouble);
    /*Explicit narrowing is needed because converting double to int removes the decimal part (.30).*/

    System.out.println ("----------------------------------------");

    byte maxValue = 127;
    System.out.println ("Initial byte value before increment " + maxValue);

    maxValue++;
    System.out.println ("Byte value after increment " + maxValue);

    String first = new String ("Java");
    String second = new String ("Java");
    String third = "Java";

    System.out.println ("is first == second? " + (first == second));
    System.out.println ("first.equals(second)? " + first.equals(second));
    
    System.out.println ("is second == third? " + (second == third));
    System.out.println ("second.equals(third)? " + (second.equals(third));

    /*
== compares the object references, not the actual string contents.
first and second are different String objects, so first == second is false.
second and third are also different object references, so second == third is false.
However, .equals() compares the actual contents of the strings.
Since first, second, and third all contain "Java", both .equals() comparisons are true.
*/

    System.out.println ("---ARRAY MODIFICATION---");
    int[] original = {20, 40, 60}
    int[] shared = original;

    System.out.println ("Before modification: ");
    System.out.println ("Original Array: " + Arrays.toString(original));
    System.out.println ("Shared array from the original: " + Arrays.toString(shared));

    shared[0] = 60;
    shared[1] = 40;

    System.out.println ("After modification: ");
    System.out.println ("Original Array: " + Arrays.toString(original));
    System.out.println ("Shared array from the original: " + Arrays.toString(shared));
    
  }
}
