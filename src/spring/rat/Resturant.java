package spring.rat;

import java.util.List;

/**
 * Created by ratnesh on 14/3/16.
 */

public class Resturant {
    public void setWelcomeNote(String welcomeNote) {
        this.welcomeNote = welcomeNote;
    }

    public  String welcomeNote;

    public void greeting()
    {
        System.out.println(welcomeNote);
    }
}
