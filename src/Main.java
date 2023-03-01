import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day = 0;
        int miesiac = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dwie liczby oddzielone przecinkiem(dzień, miesiąc):");
        String input = scanner.nextLine();
        String[] table = input.split(",");


        if (table.length == 2) {
            for (int i = 0; i < table.length; i++) {
                day = Integer.parseInt(table[0]);
                miesiac = Integer.parseInt(table[1]);

            }
        } else {
            System.out.println("Error!. podaj dokładnie dwie liczby oddzielone przecinkiem!");
        }
        if (miesiac > 12) {
            System.out.println("Podałeś nieprawidłową liczbę miesięcy");
        } else if (day > 31) {
            System.out.println("Podano nieprawidłową liczbę dni ");
        } else {



            String d = null;
            int[]mond = new int[5];
            int i;
            mond[0]=1;
            for(i = 1; i < mond.length; i++){
                mond[i]=mond[i-1] + 7;
            }
            for(i = 0; i < mond.length; i++) {
                if (day == mond[i]) {
                    d = "Monday";
                    break;
                }
            }

            mond[0]=2;
            for(i = 1; i < mond.length; i++){
                mond[i]=mond[i-1] + 7;
            }
            for(i = 0; i < mond.length; i++) {
                if (day == mond[i]) {
                    d = "Tuesday";
                    break;
                }
            }

            mond[0]=3;
            for(i = 1; i < mond.length; i++){
                mond[i]=mond[i-1] + 7;
            }
            for(i = 0; i < mond.length; i++) {
                if (day == mond[i]) {
                    d = "Wednesday";
                    break;
                }
            }

            mond[0]=4;
            for(i = 1; i < mond.length; i++){
                mond[i]=mond[i-1] + 7;
            }
            for(i = 0; i < mond.length; i++) {
                if (day == mond[i]) {
                    d = "Thursday";
                    break;
                }
            }

            mond[0]=5;
            for(i = 1; i < mond.length; i++){
                mond[i]=mond[i-1] + 7;
            }
            for(i = 0; i < mond.length; i++) {
                if (day == mond[i]) {
                    d = "Friday";
                    break;
                }
            }
            mond[0]=6;
            for(i = 1; i < mond.length; i++){
                mond[i]=mond[i-1] + 7;
            }
            for(i = 0; i < mond.length; i++) {
                if (day == mond[i]) {
                    d = "Saturday";
                    break;
                }
            }

            mond[0]=7;
            for(i = 1; i < mond.length; i++){
                mond[i]=mond[i-1] + 7;
            }
            for(i = 0; i < mond.length; i++) {
                if (day == mond[i]) {
                    d = "Sunday";
                    break;
                }
            }


            String m = "false";
            switch (miesiac) {
                case 1:
                    m = "Styczeń";
                    break;
                case 2:
                    if (day <= 28) {
                        m = "Luty";
                    } else {
                        System.out.println("Luty ma tylko 28 dni");
                        break;
                    }
                    break;
                case 3:
                    m = "Marzec";
                    break;
                case 4:
                    if (day <= 30) {
                        m = "Kwiecień";
                    } else {
                        System.out.println("Kwiecień ma tylko 30 dni!");
                        break;
                    }
                    break;
                case 5:
                    m = "Maj";
                    break;
                case 6:
                    if (day <= 30) {
                        m = "Czerwiec";
                    } else {
                        System.out.println("Czerwiec ma tylko 30 dni");
                        break;
                    }
                    break;
                case 7:
                    m = "Lipiec";
                    break;
                case 8:
                    m = "Sierpień";
                    break;
                case 9:
                    if (day <= 30) {
                        m = "Wrzesień";
                    } else {
                        System.out.println("Wrzesień ma tylko 30 dni ");
                        break;
                    }
                    break;
                case 10:
                    m = "Październik";
                    break;
                case 11:
                    if (day <= 30) {
                        m = "Listopad";
                    } else {
                        System.out.println("Listopad ma tylko 30 dni");
                        break;
                    }
                    break;
                case 12:
                    m = "Grudzień";
                    break;
            }


            if (m == "false") {
                System.out.println("podano za dużo dni!");
            } else {
                System.out.println("W miesiącu: " + m + " dzień nr:" + day + " to: " + d);
            }
        }


    }


}
