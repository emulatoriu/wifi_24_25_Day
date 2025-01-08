package mypackage;

class Auto {
    String marke;
    int jahrgang;

    void setMarke(String marke) {
        this.marke = marke;
    }
    void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }
}

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setMarke("Audi");
    }
}
