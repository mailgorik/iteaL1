package p2;

/*
    2. У класі Month створити метод, у якого 1 параметр типу даних
    int. Цей параметр буде означати порядковий номер місяця.
    Використовуючи switch, вивести на екран кількість днів
    цього місяця (2023 рік). Перевірити роботу даного метода в
    main
 */
public class Month {
    int month = 9, year = 2023;

    static void monthsAndYears(int args) {

        int month = 10;
        int year = 2023;
        switch (month) {
            // Cases for 31 Days
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of days is 31");
                break;

            // Cases for 30 Days
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of days is 30");
                break;

            // Case for 28/29 Days
            case 2:
                if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
                    System.out.println("Number of days is 29");
                else System.out.println("Number of days is 28");
                break;

            default:
                System.out.println("Invalid Month.");
                break;
        }

    }

    ;

    public static void main(String[] args) {
        monthsAndYears(0);
    }


}



