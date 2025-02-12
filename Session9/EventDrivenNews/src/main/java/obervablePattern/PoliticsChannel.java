package obervablePattern;

public class PoliticsChannel implements NewsChannel{
    @Override
    public void update(String news) {
        System.out.println("Politics channel here: %s".formatted(news));
    }
}
