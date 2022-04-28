package calculat.program;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a;
        boolean n;
        int n1, n2;
do {
    System.out.println("Enter the First Value : ");
    n1 = input.nextInt();
    System.out.println("Enter the Second Value : ");
    n2 = input.nextInt();
    System.out.println("\t 1.Addition \n \t 2.Subtraction \n \t 3.Multiplication \n \t 4.Division");
    System.out.print("Enter your choice : ");
    int num = input.nextInt();


    switch (num) {
        case 1:


            System.out.println("The sum of two digits are : " + (n1 + n2));
            break;
        case 2:
//            System.out.println("Enter the First Value : ");
//            n1 = input.nextInt();
//            System.out.println("Enter the Second Value : ");
//            n2 = input.nextInt();

            System.out.println("The sub of two digits are : " + (n1 - n2));
            break;
        case 3:
//            System.out.println("Enter the First Value : ");
//            n1 = input.nextInt();
//            System.out.println("Enter the Second Value : ");
//            n2 = input.nextInt();
            System.out.println("The multiplication of two digits are : " + (n1 * n2));
            break;
        case 4:
//            System.out.println("Enter the First Value : ");
//            n1 = input.nextInt();
//            System.out.println("Enter the Second Value : ");
//            n2 = input.nextInt();
            System.out.println("The Division of two digits are : " + (n1 / n2));
            break;
        default:
            System.out.println("Choice correct option");
    }
    System.out.println("Do you want to continue(Y/N) : ");
    a = input.next();
    n= a.charAt(0) == 'y' || a.charAt(0) == 'Y';
}while (n);
input.close();
    }
}
