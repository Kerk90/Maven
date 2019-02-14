package Observer2;

public class JobSearch {

    public static void main(String[] args) {
        JavaDeveLopersJobSite jobSite = new JavaDeveLopersJobSite();

        Observer fierstSubscriber = new Subscriber("Elene Petrova");
        Observer secondSubscriber = new Subscriber("Tim Hex");
        Observer thirdSubscriber = new Subscriber("Aaron Gimp");

        jobSite.addObserver(fierstSubscriber);
        jobSite.addObserver(secondSubscriber);
        jobSite.addObserver(thirdSubscriber);

        jobSite.addVacancy("Java developer in Tallinn");
        jobSite.addVacancy("Java developer in Parnu");
        jobSite.addVacancy("Java developer in Tartu");

        jobSite.removeVacancy("Java developer in Tallinn");
        //jobSite.thirdSubscriber(thirdSubscriber);
    }
}
