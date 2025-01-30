package logic;

import data.Person;

public class StartsWithName implements Checker{
    @Override
    public boolean check(Person p) {
        return p.name().startsWith("A");
    }
}
