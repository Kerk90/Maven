import Decorator0.Developer;
import java.util.ArrayList;
import java.util.List;

//package Composite1;


public class Team {
       private List<Developer> developers = new ArrayList<>();
    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }
    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }
    
    public void createProject() {
            System.out.println("Team creats project...\n");
            developers.forEach((developer) -> {
                developer.writeCode();
            });
        }
    }
 

