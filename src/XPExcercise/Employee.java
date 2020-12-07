package XPExcercise;

public class Employee implements Observer<String>{
    private String newsLetter;

    public Employee(){
    }

    @Override
    public void update(String update) {
        this.newsLetter = update;
    }

    public String getNewsLetter(){
        return newsLetter;
    }
}
