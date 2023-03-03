import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


    //dzien 1,8,15,22,29 -> d = Poniedziałek int dzień = 1
    int day = 17;
    String d = null;
    int[]mond = new int[5];
    int i;
    mond[0]=1;
    for(i = 1; i < mond.length; i++){
        mond[i]=mond[i-1] + 7;
    }
    for(i = 0; i < mond.length; i++) {
        if (day == mond[i]) {
            d = "Tuesday";
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
    int month = 0;
    String m = null;
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
    }else{
        m = "Grudzień";
    }

        System.out.println(d);









//
//
//
//    }
//    for(i = 2; i <31; i+=7){
//        dayNr =i;
//        d = "Tuesday";
//    }
//    i=8;
//        System.out.println(d);
//    }






    }}


