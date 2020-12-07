package XPExcercise;

import java.util.ArrayList;

public class NewsLetter implements Subject{
    private String news;
    private ArrayList<Observer> observerList;

    public NewsLetter(String news){
        this.news = news;
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList){
            o.update(news);
        }
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
}
