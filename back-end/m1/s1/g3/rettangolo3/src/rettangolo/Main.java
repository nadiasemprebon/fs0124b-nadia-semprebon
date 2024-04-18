package rettangolo;

public class Main {
    public static void stampaRettangolo(Rettangolo rtn) {
        System.out.println("area" + rtn.area() + "perimetro" + rtn.perimetro);
    }
    public static void main(String[] args) {

    Rettangolo rtn1 = new Rettangolo(b : 1 h : 2);
            StampaRettangolo(rtn1)
        ;
    }

    public static class Rettangolo {
        public double base;
        public double altezza;

        public double getBase(){
            return base;
        }

        public double getAltezza(){
            return altezza;
        }
        public rettangolo(double b, double h){
            base = 0;
            altezza = 0;
        }

        public double area(){
            return base * altezza;
        }
        public double perimetro(){
            return 2 * base + 2* altezza;
        }

    }
}