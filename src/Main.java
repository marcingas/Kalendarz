import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day = 0;
        int month = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dwie liczby oddzielone przecinkiem(dzień, miesiąc):");
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
        if (month > 12) {
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


            String m;
            if(month == 1){
                m="Styczeń";
            }else if(month == 2){
                m = "Luty";
            }else if(month == 3){
                m = "Marzec";
            }else if (month == 4){
                m="Kwiecień";
            }else if(month == 5){
                m= "Maj";
            }else if(month == 6){
                m = "Czerwiec";
            }else if(month == 7){
                m = "Lipiec";
            }else if(month == 8){
                m = "Sierpień";
            }else if(month == 9){
                m = "Wrzesień";
            }else if(month == 10){
                m = "Październik";
            }else if(month == 11){
                m = "Listopad";
            }else if(month == 12){
                m = "Grudzień";
            }else{
                m= null;
            }

            if ((month == 2 && day > 28) || (month==4 && day> 30) || (month == 6 && day > 30) || (month == 9 && day > 30) || (month == 11 && day > 30)  ) {
                System.out.println("podano za dużo dni!");
            } else {
                System.out.println("W miesiącu: " + m + " dzień nr:" + day + " to: " + d);
            }
        }


    }


}
