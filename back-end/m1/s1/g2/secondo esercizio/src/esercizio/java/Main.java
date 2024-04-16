package esercizio.java;

public class Main {
    public static boolean dueLength(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            return true;
        } else {
            return false;
        }
        public static boolean annoBisestile( int year) {
            boolean divisibilePerQuattro = year % 4 == 0;
            boolean divisibilePerCento = year % 100 == 0;
            boolean divisibilePerQuattrocento = year % 400 == 0;
            if (divisibilePerQuattro ||(divisibilePerCento && divisibilePerQuattrocento)) {
                return true;
            }else{
                return false;
            }
        }
    }


    public static void main(String[] args) {
        String str = "Nadia";
        int year = 2039;
        System.out.println("la parola '" + str + "' è pari?" + dueLength(str));
        System.out.println("l'anno '" + year + "' è bisestile?" + annoBisestile(year));

    }

}

