import java.util.Random;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
                colors[i][j] = random.nextInt(256);
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", colors[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("Поворачиваем на 90 градусов!");
        System.out.println(" ");

        int[][] rotatedColors = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[i][j] = colors[SIZE - j - 1][i];
                System.out.format("%4d", rotatedColors[i][j]);
            }
            System.out.println();
            }

     }}
