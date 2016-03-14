package spring.rat;

/**
 * Created by ratnesh on 14/3/16.
 */

public class Resturant {
    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    String noteContent;

    public void gretting(){
        //use setter to diplay message and set propert to xml file for nodeContent
        System.out.println(noteContent);
    }
}
