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
       if(miesiac> 12){
                  System.out.println("Podałeś nieprawidłową liczbę miesięcy");
       }  else if(dzien > 31){
                  System.out.println("Podano nieprawidłową liczbę dni ");
       }  else {


                 String d = "Niedziela";
                 switch (dzien){
           case 1, 8, 15, 22, 29 : d = "Poniedziałek";
           break;
           case 2,9,16,23,30 : d = "Wtorek";
           break;
           case 3, 10, 17, 24, 31 : d = "Środa";
           break;
           case 4,11,18,25 : d = "Czwartek";
           break;
           case 5,12,19,26 : d = "Piątek";
           break;
           case 6,13,20,27 : d = "Sobota";
           break;
           case 7,14,21,28 : d = "Niedziela";
           break;
       }


                 String m = "false";
                 switch (miesiac){
           case 1 : m = "Styczeń";
            break;
           case 2 : if(dzien <= 28){m = "Luty";
           }else{
               System.out.println("Luty ma tylko 28 dni");
               break;
           }
           break;
           case 3: m = "Marzec";
           break;
           case 4: if(dzien <= 30){m = "Kwiecień";
           }  else{
               System.out.println("Kwiecień ma tylko 30 dni!");
               break;
           }
           break;
           case 5: m = "Maj";
           break;
           case 6: if(dzien<= 30){m = "Czerwiec";
           }else{
               System.out.println("Czerwiec ma tylko 30 dni");
               break;
           }
           break;
           case 7: m = "Lipiec";
           break;
           case 8: m = "Sierpień";
           break;
           case 9:if(dzien<=30) {m = "Wrzesień";
           } else {
               System.out.println("Wrzesień ma tylko 30 dni ");
               break;
           }
           break;
           case 10: m = "Październik";
           break;
           case 11:if(dzien<= 30) {m = "Listopad";
           } else {
               System.out.println("Listopad ma tylko 30 dni");
               break;
           }
           break;
           case 12: m = "Grudzień";
           break;
       }

                if(m =="false"){
            System.out.println("podano za dużo dni!");
       } else{
                System.out.println("W miesiącu: " + m + " dzień nr:" + dzien + " to: " + d);
                 }
              }




        }


    }
