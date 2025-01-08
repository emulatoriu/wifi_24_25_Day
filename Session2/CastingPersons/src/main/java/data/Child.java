package data;

public class Child extends Person{
    private String school;
    public Child(String name, int age, String favouriteHobby, String school) {
        super(name, age, favouriteHobby);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
