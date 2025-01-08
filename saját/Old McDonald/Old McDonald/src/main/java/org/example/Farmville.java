package org.example;

class Tier {
    private String name;
    private int alter;

    public Tier(String name, int alter) {
        this.name = name;
        this.alter = alter;
        }

    public String getName() {
        return name;
    }

    public void zeigeDetails() {
        System.out.println("Name: " + name + ", Alter: " + alter + " Jahre");
    }

}

class Kuh extends Tier {
    double milkProduction;
    public Kuh(String name, int alter, double milkProduction) {
        super(name, alter);
        this.milkProduction = milkProduction;
    }
    @Override
        public void zeigeDetails() {
            super.zeigeDetails();
            System.out.println("Milk production: " + milkProduction + " liter pro Tag");
        }
}

class Schaf extends Tier {
    double Wolle;
    public Schaf(String name, int alter, double Wolle) {
        super(name, alter);
        this.Wolle = Wolle;
    }
    @Override
    public void zeigeDetails() {
        super.zeigeDetails();
        System.out.println("Wolle: " + Wolle + " kg pro Jahr");
    }

}

class Huhn extends Tier {
    int EierProTag;
    public Huhn(String name, int alter, int EierProTag) {
        super(name, alter);
        this.EierProTag = EierProTag;
    }
    @Override
    public void zeigeDetails() {
        super.zeigeDetails();
        System.out.println("EierProTag: " + EierProTag + " Eier pro Tag");
    }
}

public class Farmville {
    public static void main(String[] args) {
        Tier Bessie = new Kuh("Bessie", 5, 3.6);
        Tier Wolli = new Schaf("Wolli", 5, 7.8);
        Tier Heyhey = new Huhn("Heyhey", 5, 3);
        //Bessie.zeigeDetails();
        //Wolli.zeigeDetails();
        //Heyhey.zeigeDetails();

        Tier[] Tiere = {Bessie, Wolli, Heyhey};
        sucheTier(Tiere, "Bessie");


    }
    public static void sucheTier(Tier[] Tiere, String name) {
        for (Tier tier : Tiere) {
            if (tier.getName().equals(name)) {
                System.out.println("Tier gefunden:");
                tier.zeigeDetails();
            }
        }
    }
}