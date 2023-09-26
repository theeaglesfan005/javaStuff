public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth = -1;

        if ((month < 1 || month > 12) || ((year < 1 || year > 9999))) {
            return daysInMonth;
        } else {
            if (isLeapYear(year)) {
                daysInMonth = switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 4, 6, 9, 11 -> 30;
                    default -> 29;
                };
            } else {
                daysInMonth = switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 4, 6, 9, 11 -> 30;
                    default -> 28;
                };
            }
        }
        return daysInMonth;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
}