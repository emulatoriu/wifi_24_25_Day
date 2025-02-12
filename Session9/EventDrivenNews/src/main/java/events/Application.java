package events;

import events.data.News;

import java.beans.PropertyChangeSupport;

public class Application {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        PoliticsChannel politicsChannel = new PoliticsChannel();
        SportsChannel sportsChannel = new SportsChannel();

        newsAgency.addPropertyChangeListener(politicsChannel);
        newsAgency.addPropertyChangeListener(sportsChannel);

        newsAgency.setNews(new News("", ""));
        newsAgency.notifyNews(new News("Koalition geplatzt!", "politics"));
        System.out.println(politicsChannel.getNews());
        System.out.println(sportsChannel.getNews());
    }
}
