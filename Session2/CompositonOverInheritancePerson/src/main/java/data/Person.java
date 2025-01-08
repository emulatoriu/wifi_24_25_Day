package data;

public class Person {
    private String name;
    private int age;
    private String socialInsurance;

    public Person(String name, int age, String socialInsurance) {
        this.name = name;
        this.age = age;
        this.socialInsurance = socialInsurance;
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

    public String getSocialInsurance() {
        return socialInsurance;
    }

    public void setSocialInsurance(String socialInsurance) {
        this.socialInsurance = socialInsurance;
    }
}
