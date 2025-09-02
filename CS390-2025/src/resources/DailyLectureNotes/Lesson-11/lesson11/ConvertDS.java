package lesson11;

import java.util.*;

public class ConvertDS {
    public static void main(String[] args) {
        Course c1 = new Course("CS390","FPP");
        Course c2 = new Course("CS401","MPP");
        Course c3 = new Course("CS472","Android");
        Course c4 = new Course("CS511","ASD");
        Course c5 = new Course("CS444","WAP");
        List<Course> col = new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5));
       Map<String, Course> map =  convertHash(col);
        System.out.println(map);
       List<String> list = CourseStartwith(map,"A");
        System.out.println(list);
    }

    // If the Key is Object type like Pair, Student, you must override equals() and hashCode() inside Pair and Student
    public static Map<String, Course> convertHash(List<Course> list){
        Map<String, Course> map = new HashMap<>();
        for(Course c : list){
            String key = c.getCid();
            Course val = c;
            map.put(key,val);
        }
        return map;
    }
    // Return the Course names starswith sw
    public static List<String> CourseStartwith(Map<String, Course> map, String sw) {
        List<String> temp = new ArrayList<>();
         map.forEach((k,v)->{
            if(v.getCname().startsWith(sw))
                temp.add(v.getCname());
        });
        return temp;
    }
}
