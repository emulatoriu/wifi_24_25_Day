package data;

public class Adult extends Person{

    private String profession;
    public Adult(String name, int age, String favouriteHobby, String profession) {
        super(name, age, favouriteHobby);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
