import java.util.*;

public class ClassesUseCase {
    private int num;
    private int num1;
    private int num2;
    private char opr;

    public void set1(int n) {
        num = n;
    }

    public void set2(int n1, int n2, char op) {
        num1 = n1;
        num2 = n2;
        opr = op;
    }
    
    public void show(){
    System.out.println(" Number is even/Odd");
    }

    public void evenOdd() {
        if (num % 2 == 0)
            System.out.println("Given Number is even");
        else
            System.out.println("Given Number is odd");
    }

    public void positiveNegative() {
        if (num < 0)
            System.out.println("Given Number is Negative");
        else if (num > 0)
            System.out.println("Given Number is Positive");
        else
            System.out.println("Given Number is Zero");
    }

    public void square() {
        System.out.println("Square = " + (num * num));
    }

    public void calculator() {
        switch (opr) {
            case '+':
                System.out.println("Sum is " + (num1 + num2));
                break;
            case '-':
                System.out.println("Difference is " + (num1 - num2));
                break;
            case 'x':
                System.out.println("Product is " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Quotient is " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid Operand");
        }
    }

    public void pattern() {
        System.out.println("Pattern: ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 1) || (i == 5) || (j == 1) || (j == 5) || ((i == 3) && (j == 3)))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ClassesUseCase obj = new ClassesUseCase();
        int c, n, n1;
        char op;
        System.out.println("Enter Your Choice (1: even/odd 2: positive/negative 3: Square 4: Calculator 5: Pattern):");
        c = input.nextInt();

        if (c == 1) {
            System.out.println("Enter a Number ");
            n = input.nextInt();
            obj.set1(n);
            obj.evenOdd();
        } else if (c == 2) {
            System.out.println("Enter a Number ");
            n = input.nextInt();
            obj.set1(n);
            obj.positiveNegative();
        } else if (c == 3) {
            System.out.println("Enter a Number ");
            n = input.nextInt();
            obj.set1(n);
            obj.square();
        } else if (c == 4) {
            System.out.println("Enter Two Numbers ");
            n = input.nextInt();
            n1 = input.nextInt();
            System.out.println("Enter an Operand(+, -, x, /)");
            op = input.next().charAt(0);
            obj.set2(n, n1, op);
            obj.calculator();
        } else if (c == 5)
            obj.pattern();
        else
            System.out.println("Invalid Choice");
    }  
}
