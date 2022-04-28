package calculat.program;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    char operator;
    Double N1, N2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: Add, substract, multiply, or divide");
    operator = input.next().toUpperCase().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    N1 = input.nextDouble();

    System.out.println("Enter second number");
    N2 = input.nextDouble();

    switch (operator) {

      // performs addition between numbers
      case 'A':
        result = N1 + N2;
        System.out.println(N1 + " + " + N2 + " = " + result);
        break;

      // performs subtraction between numbers
      case 'S':
        result = N1 - N2;
        System.out.println(N1 + " - " + N2 + " = " + result);
        break;

      // performs multiplication between numbers
      case 'M':
        result = N1 * N2;
        System.out.println(N1 + " * " + N2 + " = " + result);
        break;

      // performs division between numbers
      case 'D':
        result = N1 / N2;
        System.out.println(N1 + " / " + N2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}