package events;

import events.data.News;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class NewsAgency {
    private News news;

    public void setNews(News news) {
        this.news = news;
    }

    private PropertyChangeSupport propertyChangeSupport;

    public NewsAgency() {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener newsChannel) {
        propertyChangeSupport.addPropertyChangeListener(newsChannel);
    }

    public void notifyNews(News news) {
        propertyChangeSupport.firePropertyChange("news", this.news, news);
        this.news = news;
    }
}
