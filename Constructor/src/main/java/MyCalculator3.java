import java.util.Scanner;

public class MyCalculator3 implements  Calculator{


    @Override
    public void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter You num1");
        int i = scan.nextInt();
        System.out.println("Enter You num2");
        int j = scan.nextInt();
        if(i==0 || j==0){
            System.out.println("invalid");


        }else {
            System.out.println(i+j);
        }

    }

    @Override
    public void sub() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter You num1");
        int i = scan.nextInt();
        System.out.println("Enter You num2");
        int j = scan.nextInt();
        if(i==0 || j==0){
            System.out.println("invalid");


        }else {
            System.out.println(i-j);
        }

    }


    // @Specilized methos
    public void mul(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter You num1");
        int i = scan.nextInt();
        System.out.println("Enter You num2");
        int j = scan.nextInt();
        double m = i * j;
        System.out.println(m);


    }
}
