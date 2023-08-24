package p1;

/**
 *
 */

public class Car1 {
    //поля/змінні відповідають за стан класу
    String color;
    float weight;
    String size;

    // методи відповідають за ??
    // звертати увагу на неймінг!! можуть бути проблеми на code review
    void printColorAndWeight(){
        System.out.println(color + " " + weight + " " + size);
    }

    static int sumOfTwoNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }

    // public - метод доступний для запуску з будь-якого місця
    public static void main(String[] args) {
        System.out.println();
    }
}
