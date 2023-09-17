package Class7;

import java.sql.Array;
//1. Напишіть метод, який ділить кожен елемент масива на задане число і виводить на
//екран новий масив елементів із поділеними елементами попереднього. Додайте
//опрацювання виняткових ситуацій

public class DevidedNumbers {
    public static double[] devideNumbers(double[] array, double number) {
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] / number;
        }
        return newArray;
    }
    public static void main(String[] args) {
        double[] myArray = {0.5, 200.0, 88.0, 392.0};
        double number = 5.0;
        double[] result = devideNumbers(myArray, number);

        System.out.print("Result: ");
        for (double num : result) {
            System.out.print(num + " ");
        }
    }
}
