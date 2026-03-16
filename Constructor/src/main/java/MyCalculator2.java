import java.util.Scanner;

public class MyCalculator2 implements Calculator{

    @Override
    public void add() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your num1");
        int i = scan.nextInt();
        System.out.println("Enter Your num2");
        int j = scan.nextInt();
        System.out.println(i+j);

    }

    @Override
    public void sub() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your num1");
        int i = scan.nextInt();
        System.out.println("Enter Your num2");
        int j = scan.nextInt();
        System.out.println(i-j);

    }
}
