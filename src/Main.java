import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dzien = 0;
        int miesiac = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dwie liczby oddzielone przecinkiem(dzień, miesiąc):");
        String input = scanner.nextLine();
        String[]table = input.split(",");


        if(table.length == 2) {
            for (int i = 0; i < table.length; i++) {
                dzien = Integer.parseInt(table[0]);
                miesiac = Integer.parseInt(table[1]);

            }
        } else {
            System.out.println("Error!. podaj dokładnie dwie liczby oddzielone przecinkiem!");
        }
        System.out.println("dzień to: " + dzien);
        System.out.println("miesiąc to: " + miesiac);


String s = "Niedziela";
       switch (dzien){
           case 1, 8, 15, 22, 29 : s = "Poniedziałek";
           break;
           case 2,9,16,23,30 : s = "Wtorek";
           break;
           case 3, 10, 17, 24, 31 : s = "Środa";
           break;
           case 4,11,18,25 : s = "Czwartek";
           break;
           case 5,12,19,26 : s = "Piątek";
           break;
           case 6,13,20,27 : s = "Sobota";
           break;
           case 7,14,21,28 : s = "Niedziela";
           break;
       }
        System.out.println("Wybrany dzień tygodnia to : " + s);

        }


    }
