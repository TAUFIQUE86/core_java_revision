




public class MyCalculator1  implements Calculator {




    @Override
    public void add() {

        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println(c);

    }

    @Override
    public void sub() {

        int a = 10;
        int b = 20;
        int c = a-b;
        System.out.println(c);

    }


}