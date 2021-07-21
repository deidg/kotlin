import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

class main {

    public static void main(String[] args) {
      String[] products = new String[3];

      products[0] = "Milk";
      products[1] = "Bread";
      products[2] = "Chease";

      int[] prices = new int[3];

      prices[0] = 50;
      prices[1] = 30;
      prices[2] = 600;

        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.toString(prices));

        int milk = 0;
        int bread = 0;
        int cheese = 0;

//         int productNumber = 0;
//         int productCount = 0;
         //int currentPrice = prices[productNumber];

        Scanner sc = new Scanner(System.in);

        while (!sc.equals("end")) {
            System.out.println("Введите номер товара (от 1 до 3) и количество или введите End");
            String input = sc.nextLine(); //сканер считывает
            int spacePos = input.indexOf(" ");
            String first = input.substring(0, spacePos);
            String second = input.substring(spacePos + 1, input.length());
            int x1 = Integer.parseInt(first);
            int x2 = Integer.parseInt(second);
            if (x1 == 1) {
                milk = milk + 1;
            } else if (x1 == 2) {
                bread = bread + 1;
            } else if (x1 == 3) {
                cheese = cheese + 1;
            }
            //System.out.println(String.length());
        }}}
//            System.out.println("Итого:");
//            System.out.println(milk);
//            System.out.println(bread);
//            System.out.println(cheese);

    //}}
//            int a = 2;
//            System.out.println(a + 4);


            //
//            System.out.println(x1+1);
//            System.out.println(x2+1);



//            String[] positionInBasket = input.split(" "); //разбиваем введеные данные на продукт и его количество
//            int p1 = Integer.parseInt()
            //            int positionInBasket = Integer.parseInt();
//            int productCount = Integer.parseInt()
//            int x1 = Integer.parseInt();

            //int productNumber = Integer.parseInt(parts[0]);


//            int productNumber1 = sc.nextInt();
//            int productCount1 = sc.nextInt();
//        }



//        while ()
//         System.out.println("Выберите товар и количество или введите End");
//
//          Scanner sc = new Scanner(System.in);
//          String input = sc.nextLine();




          // проверить чтобы вводимое число было от 0 до 2
//          int spacePos = input.indexOf(" ");
//          String first = input.substring(0, spacePos);
//          String second = input.substring(spacePos + 1, input.length());
//          int x1 =  Integer.parseInt(first);
//          int x2 = Integer.parseInt(second);


//        System.out.println(x1);
//        System.out.println(x2);



        //!text.equals("End")





        //int currentPrice = prices[productNumber];

    //}

//    String[] products = new String[]{"Молоко", "Хлеб", "Сыр"};
//    int[] prices = new int[]{50, 30, 600};

//    System.out.println(Arrays.toString(products));
//    System.out.println(Arrays.toString(prices));
//}
//}


//          int productNumber = sc.nextInt();
//          int productCount = sc.nextInt();