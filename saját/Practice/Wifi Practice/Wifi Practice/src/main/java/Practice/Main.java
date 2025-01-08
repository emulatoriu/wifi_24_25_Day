package Practice;

public class Main {
    public static void main(String[] args) {
        Person Person1 = new Person("NN", "NN", 99);
        Person1.setVorname("Pablo");
        Person1.setNachname("Picasso");
        Person1.setAlter(37);
        System.out.println(Person1.getVorname() + " " + Person1.getNachname() + " " + Person1.getAlter());
    }
}

class Person {
    private String Vorname;
    private String Nachname;
    private int Alter;
    public Person(String Vorname, String Nachname, int Alter) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Alter = Alter;
    }
    public String getVorname() {
        return Vorname;
    }
    public void setVorname(String Vorname) {
        this.Vorname = Vorname;
    }
    public String getNachname() {
        return Nachname;
    }
    public void setNachname(String Nachname) {
        this.Nachname = Nachname;
    }
    public int getAlter() {
        return Alter;
    }
    public void setAlter(int Alter) {
        this.Alter = Alter;
    }
}
