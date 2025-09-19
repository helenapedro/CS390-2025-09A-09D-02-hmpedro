package W3L10_HW_Asgmt.after.prob1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> map = new HashMap<>();
        for (Student st : students) {
            Key key = new Key(st.getFirstName(), st.getLastName());
            map.put(key, st);
        }
		return map;
	}

    public static void show() {
        List<Student> list = new ArrayList<Student>() {
            {
                add(new Student("Joe", "Smith", 3.2, Standing.FRESHMAN));
                add(new Student("Tom", "Rogers", 3.5, Standing.SENIOR));
                add(new Student("HeLing", "Wu", 2.9, Standing.JUNIOR));
                add(new Student("Pierre", "Fromage", 2.8, Standing.FRESHMAN));
                add(new Student("Ihaku", "Tamataku", 3.9, Standing.JUNIOR));
                add(new Student("Richard", "Wong", 2.8, Standing.SOPHOMORE));
            }
        };

        HashMap<Key, Student> map = processStudents(list);
        map.forEach((key, value) ->
            System.out.printf(
                    "%s -> GPA: %.1f, Standing: %s%n",
                    key, value.getGpa(), value.getStanding()
            )
        );
    }
}
