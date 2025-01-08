package data;

public class Person {
    private String name;
    private int age;
    private String favouriteHobby;

    public Person(String name, int age, String favouriteHobby) {
        this.name = name;
        this.age = age;
        this.favouriteHobby = favouriteHobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavouriteHobby() {
        return favouriteHobby;
    }

    public void setFavouriteHobby(String favouriteHobby) {
        this.favouriteHobby = favouriteHobby;
    }
}
