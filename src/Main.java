public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);


        /**
         * Ошибка при выполнении calc.devide.apply(a, b) возникает в результате деления на ноль.
         * Способы решения разные, можно в такой ситуации возвращать "0", либо сделать обработку исключения с описание ошибки.
         */

        System.out.println();
        calc.println.accept(c);

    }
}
