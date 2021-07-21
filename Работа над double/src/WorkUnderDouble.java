import java.util.Scanner;


public class WorkUnderDouble {


    //public class Main{

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите операцию над double:");
            System.out.println("1. Сравнить");
            System.out.println("2. Округлить");
            System.out.println("3. Отбросить дробную часть");

            byte operation = scanner.nextByte();
            if (operation < 0 || operation > 3) {
                System.out.println("Вы ввели не правильное значение");
                return;
            }

            if (operation == 1) {
                System.out.println("Введите первое число:");
                double value1 = scanner.nextDouble();

                System.out.println("Введите второе число:");
                double value2 = scanner.nextDouble();

                //compareNumbers(value1, value2);
                if (Math.abs(value1 - value2) < 0.0000001) {
                    System.out.println(value1 + " = " + value2);
                } else if (value1 < value2) {
                    System.out.println(value1 + " < " + value2);
                } else {
                    System.out.println(value1 + " > " + value2);

                }
        }   else if (operation == 2) {
                System.out.println("Введите число:");
                double value3 = scanner.nextDouble();
                System.out.println(Math.round(value3));
            }
            else {
                System.out.println("Введите число:");
                double value4 = scanner.nextDouble();
                System.out.println((long) value4);



    }}

//        private static void completeOperation(byte operation, double value1, double value2) {
//            switch(operation) {
//                case 1: {
//                    compareNumbers(value1, value2);
//                    break;
//                }
//                case 2: {
//                    System.out.println(Math.round(value1));
//                    System.out.println(Math.round(value2));
//                    break;
//                }
//                case 3: {
//                    System.out.println((long) value1);
//                    System.out.println((long) value2);
//                    break;
//                }
            }


        //private static void compareNumbers(double value1, double value2) {
//            if (Math.abs(value1 - value2) < 0.0000001) {
//                System.out.println(value1 + " = " + value2);
//            } else if (value1 < value2) {
//                System.out.println(value1 + " < " + value2);
//            } else {
//                System.out.println(value1 + " > " + value2);
//
//            }
        //}
    //}

