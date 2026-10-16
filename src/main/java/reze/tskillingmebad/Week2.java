package reze.tskillingmebad
import java.util.Scanner;

public class Week2 {
  public static void main (String[] args) {
    double total;
    Scanner reze = new Scanner (System.in);

    System.out.println ("----------------------------------");

    System.out.println ("Enter first number: ");
    double num1 = reze.nextInt();
    System.out.println ("Enter second number: ");
    double num2 = reze.nextInt();

    System.out.println ("Choose an operator [1-4]: ");
    int choice = reze.nextInt();

    switch (choice) {
      case 1:
        total = num1 + num2;
        System.out.print ("Addition : " + total);
        break;

      case 2:
        total = num1 - num2;
        System.out.print ("Subtraction: " + total);
        break;

      case 3:
        total = num1 / num2;
        System.out.print ("Division: " + total);
        break;

      case 4:
        total = num1 * num2;
        System.out.print ("Multiplication: " + total);
        break;

      default:
        System.out.print ("Invalid Input.");

    }

    System.out.println ("----------------------------------");
    int average = 72, absences = 3;

    if (average >= 75 && absences <= 3 || average >= 90) {
      System.out.println ("\nStudent Passed, grades exceeded the minimun requirement");
    }
    else if (average < 75) {
      System.out.println ("\Student Failed, grades did not meet the minimum requirement");
  }
  else {
    System.out.println ("\Average can't be invalid.");
  }

  System.out.println ("----------------------------------");

  double balance = 1000.00;
  System.out.println ("Initial Value: " + balance);

  balance += 1.30;
  System.out.println ("Adding Value: " + balance);

  balance *= 69.69;
  System.out.println ("Multiplying Value: " + balance);

  balance += 420;
  System.out.println ("Final Value: " + balance + "\n");

  int count = 10;

  System.out.println ("--POSTFIXING VALUE--");

  System.out.println ("Count++ Value: " + count++);
  System.out.println ("Without Count++: " + count);

  System.out.println ("--PREFIXING VALUE--");

  System.out.println ("++Count Value: " + ++count);
  System.out.println ("Without ++Count: " + count);
  

 /*
With count++, the current value is printed first, then count is increased by 1.
That is why it prints 10 first and becomes 11 afterward.
With ++count, count is increased by 1 first, then the new value is printed.
That is why it prints 12 instead of 11.
*/

    








    

  }
}
