package PatternExcercise;

public class Employee implements Observer{
    private String newsLetter;

    public Employee(){
    }

    @Override
    public void update(Object update) {
        this.newsLetter = (String) update;
    }

    public String getNewsLetter(){
        return newsLetter;
    }
}
