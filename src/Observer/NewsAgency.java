package Observer;

import java.util.ArrayList;
import java.util.List;

class NewsAgency implements Observable {
    private final List<Observer> observers = new ArrayList<>();
    private String latestNews;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }

    public void setLatestNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }
}