import java.util.Arrays;
import java.util.Scanner;

class main {

    public static void main(String[] args) {

        Scanner console1 = new Scanner(System.in); // считывает (принимаем)
        String[] products = new String[1000]; // Создаём массив String размером в size
        for (int i = 0; i < products.length; i++) {
            products[i] = console1.nextLine(); // Заполняем массив элементами, введёнными с клавиатуры
            // (название продуктов)
        }

//        products[0] = "Milk";
//        products[1] = "Bread";
//        products[2] = "Chease";


        Scanner console2 = new Scanner(System.in); // считывает (принимаем)
        int[] prices = new int[1000]; // Создаём массив int размером в size
        for (int y = 0; y < prices.length; y++) {
            prices[y] = console2.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            // (стоимость продуктов)
        }

        //int[] prices = new int[3];
//        prices[0] = 50;
//        prices[1] = 30;
//        prices[2] = 600;

        //выводим список продуктов и стоимость
        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.toString(prices));


//        int pos1 = 0;  // pos - сокр. от position
//        int pos2 = 0;
//        int pos3 = 0;


        Scanner sc = new Scanner(System.in);

        while (!sc.equals("end")) {
            System.out.println("Введите номер товара (начиная с 1) и количество или введите End");
            String input = sc.nextLine(); //сканер считывает
            int spacePos = input.indexOf(" ");
            String first = input.substring(0, spacePos);
            String second = input.substring(spacePos + 1, input.length());
            int x1 = Integer.parseInt(first);
            int x2 = Integer.parseInt(second);
            //int pos = 0;);
            //            }












            // НЕ ЗАПУСКАЕТСЯ ЦИКЛ. Остановился здесь

            for (x1: products) {
                System.out.println(products[i]
            }}}

//            if (x1 == 1) {
//                milk = milk + 1;
//            } else if (x1 == 2) {
//                bread = bread + 1;
//            } else if (x1 == 3) {
//                cheese = cheese + 1;
//            }}}}
//







//import java.util.Arrays;
//import java.util.Scanner;
//
//class main {
//
//    public static void main(String[] args) {
//        String[] products = new String[3];
//
//        products[0] = "Молоко";
//        products[1] = "Хлеб";
//        products[2] = "Сыр";
//
//        int[] prices = new int[3];
//
//        prices[0] = 50;
//        prices[1] = 30;
//        prices[2] = 600;
//
//        int[] productCount = new int[3]; // в этом массиве считаю кол-во продукта
//
//        productCount[0] = 0; //молоко
//        productCount[1] = 0; //хлеб
//        productCount[2] = 0; //сыр
//
//        System.out.println(Arrays.toString(products));
//        System.out.println(Arrays.toString(prices));
//
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Введите номер товара (от 1 до 3) и количество или введите End");
//
//            String input = sc.nextLine();
//            if (input.equals("end"))
//                break;
//
//            String[] order = input.split(" "); // убираем пробел и отправляем в массив
//            int product = Integer.parseInt(order[0]) -1; //переводим значение в число
//            int count = Integer.parseInt(order[1]); //переводим значение в число
//
//            if (product == 0 ) {    //если первое число равно 1, то Молоку добавляем 2е значение
//                productCount[0] = productCount[0] + count;
//            } else if (product == 1) {  //если второе число равно 1, то Хлебу добавляем 2е значение
//                productCount[1] = productCount[1] + count;
//            } else if (product == 2) {     //если второе число равно 1, то Сыру добавляем 2е значение
//                productCount[2] = productCount[2] + count;
//            }}
//           // Считаем
//        // Молоко
//        int pos1 = productCount[0]*prices[0];
//        int pos2 = productCount[1]*prices[1];
//        int pos3 = productCount[2]*prices[2];
//
//        //Выводим
//        System.out.println("Ваша покупка:");
//        System.out.println("1. "+ products[0] + " "  + productCount[0] + "шт. "
//                + pos1);
//        System.out.println("2. "+ products[1] + "   "  + productCount[1] + "шт. "
//                + productCount[1]*prices[1] );
//        System.out.println("3. "+ products[2] + "    "  + productCount[2] + "шт. "
//                + productCount[2]*prices[2] );
//        System.out.println("Итого:         " + (pos1 + pos2 + pos3));
//        System.out.println("СПАСИБО ЗА ПОКУПКУ!");
//    }}
//






//        System.out.println("1. "+ products[0] + " "  + productCount[0] + "шт. "
//                + pos1);
//        System.out.println("2. "+ products[1] + "   "  + productCount[1] + "шт. "
//                + productCount[1]*prices[1] );
//        System.out.println("3. "+ products[2] + "    "  + productCount[2] + "шт. "
//                + productCount[2]*prices[2] );
//        System.out.println("Итого:         " + (pos1 + pos2 + pos3));
//        System.out.println("СПАСИБО ЗА ПОКУПКУ!");
//    }}









//            if (product == 0 ) {    //если первое число равно 1, то Молоку добавляем 2е значение
//                int Product1 = ProductCount.indexOf(product);
//            } else if (product == 1) {  //если второе число равно 1, то Хлебу добавляем 2е значение
//                productCount[1] = productCount[1] + count;
//            } else if (product == 2) {     //если второе число равно 1, то Сыру добавляем 2е значение
//                productCount[2] = productCount[2] + count;
//            }}







//           // Считаем
//        // Молоко
//        int pos1 = productCount[0]*prices[0];
//        int pos2 = productCount[1]*prices[1];
//        int pos3 = productCount[2]*prices[2];
//
//        //Выводим
//        System.out.println("Ваша покупка:");
//        System.out.println("1. "+ products[0] + " "  + productCount[0] + "шт. "
//                + pos1);
//        System.out.println("2. "+ products[1] + "   "  + productCount[1] + "шт. "
//                + productCount[1]*prices[1] );
//        System.out.println("3. "+ products[2] + "    "  + productCount[2] + "шт. "
//                + productCount[2]*prices[2] );
//        System.out.println("Итого:         " + (pos1 + pos2 + pos3));
//        System.out.println("СПАСИБО ЗА ПОКУПКУ!");
//    }}
//












//        System.out.println("Изначальный размер al: " + products.size());
//        for (int i = 0; i < products.size; i++) {
//            products = console1.nextLine();

      //  String[] products = new String[100]; // Создаём массив String размером в size
         // Заполняем массив элементами, введёнными с клавиатуры
            // (название продуктов)
        }

//        products[0] = "Milk";
//        products[1] = "Bread";
//        products[2] = "Chease";


        Scanner console2 = new Scanner(System.in); // считывает (принимаем)
        int[] prices = new int[100]; // Создаём массив int размером в size
        for (int y = 0; y < prices.length; y++) {
            prices[y] = console2.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            // (стоимость продуктов)
        }

        //int[] prices = new int[3];
//        prices[0] = 50;
//        prices[1] = 30;
//        prices[2] = 600;

         //выводим список продуктов и стоимость
        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.toString(prices));

        int[] busket = new int[100];

//        int pos1 = 0;  // pos - сокр. от position
//        int pos2 = 0;
//        int pos3 = 0;


        Scanner sc = new Scanner(System.in);

        while (!sc.equals("end")) {
            System.out.println("Введите номер товара (от 1 до 3) и количество или введите End");
            String input = sc.nextLine(); //сканер считывает
            int spacePos = input.indexOf(" ");
            String first = input.substring(0, spacePos);
            String second = input.substring(spacePos + 1, input.length());
            int x1 = Integer.parseInt(first);
            int x2 = Integer.parseInt(second);}}}
            //int pos = 0;);
            //            }

           // НЕ ЗАПУСКАЕТСЯ ЦИКЛ. Остановился здесь

//            for (int : busket) {
//                System.out.println(products[i]
//                        }}}

//            if (x1 == 1) {
//                milk = milk + 1;
//            } else if (x1 == 2) {
//                bread = bread + 1;
//            } else if (x1 == 3) {
//                cheese = cheese + 1;
//            }}}}
//







//import java.util.Arrays;
//import java.util.Scanner;
//
//class main {
//
//    public static void main(String[] args) {
//        String[] products = new String[3];
//
//        products[0] = "Молоко";
//        products[1] = "Хлеб";
//        products[2] = "Сыр";
//
//        int[] prices = new int[3];
//
//        prices[0] = 50;
//        prices[1] = 30;
//        prices[2] = 600;
//
//        int[] productCount = new int[3]; // в этом массиве считаю кол-во продукта
//
//        productCount[0] = 0; //молоко
//        productCount[1] = 0; //хлеб
//        productCount[2] = 0; //сыр
//
//        System.out.println(Arrays.toString(products));
//        System.out.println(Arrays.toString(prices));
//
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Введите номер товара (от 1 до 3) и количество или введите End");
//
//            String input = sc.nextLine();
//            if (input.equals("end"))
//                break;
//
//            String[] order = input.split(" "); // убираем пробел и отправляем в массив
//            int product = Integer.parseInt(order[0]) -1; //переводим значение в число
//            int count = Integer.parseInt(order[1]); //переводим значение в число
//
//            if (product == 0 ) {    //если первое число равно 1, то Молоку добавляем 2е значение
//                productCount[0] = productCount[0] + count;
//            } else if (product == 1) {  //если второе число равно 1, то Хлебу добавляем 2е значение
//                productCount[1] = productCount[1] + count;
//            } else if (product == 2) {     //если второе число равно 1, то Сыру добавляем 2е значение
//                productCount[2] = productCount[2] + count;
//            }}
//           // Считаем
//        // Молоко
//        int pos1 = productCount[0]*prices[0];
//        int pos2 = productCount[1]*prices[1];
//        int pos3 = productCount[2]*prices[2];
//
//        //Выводим
//        System.out.println("Ваша покупка:");
//        System.out.println("1. "+ products[0] + " "  + productCount[0] + "шт. "
//                + pos1);
//        System.out.println("2. "+ products[1] + "   "  + productCount[1] + "шт. "
//                + productCount[1]*prices[1] );
//        System.out.println("3. "+ products[2] + "    "  + productCount[2] + "шт. "
//                + productCount[2]*prices[2] );
//        System.out.println("Итого:         " + (pos1 + pos2 + pos3));
//        System.out.println("СПАСИБО ЗА ПОКУПКУ!");
//    }}
//
