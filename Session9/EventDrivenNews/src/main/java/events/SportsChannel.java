package events;

import events.data.News;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class SportsChannel implements PropertyChangeListener {
    private News news;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        News news = (News) evt.getNewValue();
        if(news.category().equalsIgnoreCase("sports")) {
            setNews(news);
        }
    }
    public void setNews(News news) {
        this.news = news;
    }

    public News getNews() {
        return news;
    }
}
