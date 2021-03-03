import model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class JavaObjectWorkshop {
    @Test
    public void workWithObjects() {
        Student dima = new Student();

       // dima.setFirstName("Dmitrijs");
        //dima.setLastName("Terepa");
       // dima.setAge(19);
      //  dima.setEmail("boyboy@gmail.com");

        Student marija = new Student("Marija", "Shilova" , 18, "girl@gmail.com");



        // System.out.println(dima.getFirstName() + " " + dima.getLastName());
      //  System.out.println(dima.getFullName());
        // System.out.println(marija.getFirstName() + " " + marija.getLastName());
      //  System.out.println(marija.getFullName());

        List<Student> students = new ArrayList<Student>();
        students.add(dima);
        students.add(marija);
        //students.add(new Student("Dmitrijs"));



    }

}
