package data;

//public class Adult extends Person {
//    public Adult(String name, int age, String socialInsurance) {
//        super(name, age, socialInsurance);
//    }
//}
// Design principle composition over inheritance
public class Adult {
    private final Person person;
    public Adult(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}
