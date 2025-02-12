package obervablePattern;

import java.util.List;

public class NewsAgency {
    private String news;
    private final List<NewsChannel> newsChannels;

    public NewsAgency(List<NewsChannel> newsChannels) {
        this.newsChannels = newsChannels;
    }

    public void addObserver(NewsChannel newsChannel) {
        newsChannels.add(newsChannel);
    }

    public void setNews(String news) {
        for(NewsChannel newsChannel : newsChannels) {
            newsChannel.update(news);
        }
        this.news = news;
    }
}
