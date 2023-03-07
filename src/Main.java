import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day = 0;
        int month = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dwie liczby oddzielone przecinkiem(dzień,miesiąc):");
        String input = scanner.nextLine();
        String[] table = input.split(",");

        if (table.length == 2) {
            for (int i = 0; i < table.length; i++) {
                day = Integer.parseInt(table[0]);
                month = Integer.parseInt(table[1]);
            }
        } else {
            System.out.println("Error!. podaj dokładnie dwie liczby oddzielone przecinkiem!");
        }
        if (month > 12 || month < 1) {
            System.out.println("Podałeś nieprawidłową liczbę miesięcy");
            return;
        }
        if (day > 31 || day < 1) {
            System.out.println("Podano nieprawidłową liczbę dni ");
            return;
        }
        //day name:
        String dayName = getDayName(day);

        // month name + print answer:
        getMonthName(day, month, dayName);

//              OLD VERSION:
//        String d = null;
//        int[] dayOfWeek = new int[5];
//        int i;
//        dayOfWeek[0] = 1;
//        for (i = 1; i < dayOfWeek.length; i++) {
//            dayOfWeek[i] = dayOfWeek[i - 1] + 7;
//        }
//        for (i = 0; i < dayOfWeek.length; i++) {
//            if (day == dayOfWeek[i]) {
//                d = "Monday";
//                break;
//            }
//        }
//
//        dayOfWeek[0] = 2;
//        for (i = 1; i < dayOfWeek.length; i++) {
//            dayOfWeek[i] = dayOfWeek[i - 1] + 7;
//        }
//        for (i = 0; i < dayOfWeek.length; i++) {
//            if (day == dayOfWeek[i]) {
//                d = "Tuesday";
//                break;
//            }
//        }
//
//        dayOfWeek[0] = 3;
//        for (i = 1; i < dayOfWeek.length; i++) {
//            dayOfWeek[i] = dayOfWeek[i - 1] + 7;
//        }
//        for (i = 0; i < dayOfWeek.length; i++) {
//            if (day == dayOfWeek[i]) {
//                d = "Wednesday";
//                break;
//            }
//        }
//        dayOfWeek[0] = 4;
//        for (i = 1; i < dayOfWeek.length; i++) {
//            dayOfWeek[i] = dayOfWeek[i - 1] + 7;
//        }
//        for (i = 0; i < dayOfWeek.length; i++) {
//            if (day == dayOfWeek[i]) {
//                d = "Thursday";
//                break;
//            }
//        }
//        dayOfWeek[0] = 5;
//        for (i = 1; i < dayOfWeek.length; i++) {
//            dayOfWeek[i] = dayOfWeek[i - 1] + 7;
//        }
//        for (i = 0; i < dayOfWeek.length; i++) {
//            if (day == dayOfWeek[i]) {
//                d = "Friday";
//                break;
//            }
//        }
//        dayOfWeek[0] = 6;
//        for (i = 1; i < dayOfWeek.length; i++) {
//            dayOfWeek[i] = dayOfWeek[i - 1] + 7;
//        }
//        for (i = 0; i < dayOfWeek.length; i++) {
//            if (day == dayOfWeek[i]) {
//                d = "Saturday";
//                break;
//            }
//        }
//        dayOfWeek[0] = 7;
//        for (i = 1; i < dayOfWeek.length; i++) {
//            dayOfWeek[i] = dayOfWeek[i - 1] + 7;
//        }
//        for (i = 0; i < dayOfWeek.length; i++) {
//            if (day == dayOfWeek[i]) {
//                d = "Sunday";
//                break;
//            }
//        }
//        String m;
//        if (month == 1) {
//            m = "Styczeń";
//        } else if (month == 2) {
//            m = "Luty";
//        } else if (month == 3) {
//            m = "Marzec";
//        } else if (month == 4) {
//            m = "Kwiecień";
//        } else if (month == 5) {
//            m = "Maj";
//        } else if (month == 6) {
//            m = "Czerwiec";
//        } else if (month == 7) {
//            m = "Lipiec";
//        } else if (month == 8) {
//            m = "Sierpień";
//        } else if (month == 9) {
//            m = "Wrzesień";
//        } else if (month == 10) {
//            m = "Październik";
//        } else if (month == 11) {
//            m = "Listopad";
//        } else if (month == 12) {
//            m = "Grudzień";
//        } else {
//            m = null;
//        }
    }

    private static void getMonthName(int day, int month, String dayName) {
        String monthName = "";
        if (month == 1) {
            monthName = "Styczeń";
        } else if (month == 2) {
            if (day > 28) {
                System.out.println("niepoprawne dane");
                return;
            }
            monthName = "Luty";
            System.out.println("W miesiącu: " + monthName + " dzień nr:" + day + " to: " + dayName);
        } else if (month == 3) {
            monthName = "Marzec";
            System.out.println("W miesiącu: " + monthName + " dzień nr:" + day + " to: " + dayName);
        } else if (month == 4) {
            if (day > 30) {
                System.out.println("Niepoprawne dane");
                return;
            }
            monthName = "Kwiecień";
            System.out.println("W miesiącu: " + monthName + " dzień nr:" + day + " to: " + dayName);
        } else if (month == 5) {
            monthName = "Maj";
            System.out.println("W miesiącu: " + monthName + " dzień nr:" + day + " to: " + dayName);
        } else if (month == 6) {
            if (day > 30) {
                System.out.println("Niepoprawne dane");
                return;
            }
            monthName = "Czerwiec";
            System.out.println("W miesiącu: " + monthName + " dzień nr:" + day + " to: " + dayName);

        } else if (month == 7) {
            monthName = "Lipiec";
            System.out.println("W miesiącu: " + monthName + " dzień nr:" + day + " to: " + dayName);
        } else if (month == 8) {
            monthName = "Sierpień";
            System.out.println("W miesiącu: " + monthName + " dzień nr:" + day + " to: " + dayName);
        } else if (month == 9) {
            if (day > 30) {
                System.out.println("Niepoprawne dane");
                return;
            }
            monthName = "Wrzesień";
            System.out.println("W miesiącu: " + monthName + " dzień nr:" + day + " to: " + dayName);
        } else if (month == 10) {
            monthName = "Październik";
            System.out.println("W miesiącu: " + monthName + " dzień nr:" + day + " to: " + dayName);
        } else if (month == 11) {
            if (day > 30) {
                System.out.println("Niepoprawne dane");
                return;
            }
            monthName = "Listopad";
            System.out.println("W miesiącu: " + monthName + " dzień nr:" + day + " to: " + dayName);
        } else if (month == 12) {
            monthName = "Grudzień";
            System.out.println("W miesiącu: " + monthName + " dzień nr:" + day + " to: " + dayName);
        }
    }

    private static String getDayName(int day) {
        String dayName = "";
        if (day % 7 == 1) {
            dayName = "Poniedziałek";
        } else if (day % 7 == 2) {
            dayName = "Wtorek";
        } else if (day % 7 == 3) {
            dayName = "Środa";
        } else if (day % 7 == 4) {
            dayName = "Czwartek";
        } else if (day % 7 == 5) {
            dayName = "Piątek";
        } else if (day % 7 == 6) {
            dayName = "Sobota";
        } else if (day % 7 == 7) {
            dayName = "Niedziela";
        }
        return dayName;
    }
}



