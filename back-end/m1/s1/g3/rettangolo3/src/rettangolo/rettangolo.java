package rettangolo;

public class Rettangolo {
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
