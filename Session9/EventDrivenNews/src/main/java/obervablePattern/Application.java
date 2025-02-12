package obervablePattern;



import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency(new ArrayList<>());
        NewsChannel sportsChannel = new SportsChannel();
        NewsChannel politicsChannel = new PoliticsChannel();
        newsAgency.addObserver(sportsChannel);
        newsAgency.addObserver(politicsChannel);
        newsAgency.setNews("Tolle news");

    }
}
