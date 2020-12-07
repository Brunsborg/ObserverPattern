package XPExcercise;

public class Main {

    public static void main(String[] args) {
        //Create objects
	    NewsLetter newsLetter = new NewsLetter("Good Morning!");
	    Employee employee = new Employee();
	    Employee employee2 = new Employee();

	    //register observers
	    newsLetter.registerObserver(employee);
	    newsLetter.registerObserver(employee2);
        //update state
	    newsLetter.setNews("Pizza Day!");

        System.out.println(employee.getNewsLetter());
        System.out.println(employee2.getNewsLetter());

        //remove observer
        newsLetter.removeObserver(employee);
        System.out.println("\nObserver Removed!");

        //update state
        newsLetter.setNews("The business has bought a new building!");

        //state should remain unchanged for employee
        System.out.println(employee.getNewsLetter());
        //state should've change
        System.out.println(employee2.getNewsLetter());
    }
}
