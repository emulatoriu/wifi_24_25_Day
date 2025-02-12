package obervablePattern;

public class SportsChannel implements NewsChannel{
    @Override
    public void update(String news) {
        System.out.println("Sports channel here: %s".formatted(news));
    }
}
