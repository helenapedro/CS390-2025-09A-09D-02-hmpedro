package lesson11;

import java.util.*;
import java.util.Map.Entry;

public class HashCollection {
    public static void main(String[] args) {
      //  Map<String, Course> map = new HashMap<>();
        HashMap<String, Course> map = new HashMap<>();
        map.put("CS390", new Course("CS390","FPP"));
        map.put("CS401", new Course("CS401","MPP"));
        map.put("CS472", new Course("CS472","Algorithms"));
        map.put("CS475", new Course("CS475","Android"));
        map.put("CS572", new Course("CS572","Advanced Algorithms"));
        map.put(null, null);
        //System.out.println(map);
       //Map<String,Course> table = new Hashtable<>();
        Hashtable<String,Course> table = new Hashtable<>();

        table.put("CS390", new Course("CS390","FPP"));
        table.put("CS401", new Course("CS401","MPP"));
        table.put("CS472", new Course("CS472","Algorithms"));
        table.put("CS475", new Course("CS475","Android"));
        table.put("CS572", new Course("CS572","Advanced Algorithms"));
       //  table.put(null,null); // Throw NPE

        // How to process the Map collection
        System.out.println("1. Key Set Approach");
        Set<String> set1 = table.keySet();
        for(String s: set1){
           Course c =  table.get(s);
           if(c.getCname().startsWith("A"))
               System.out.println(c);
        }
        System.out.println("2. Iterator Approach");
            Iterator<String> it =  table.keySet().iterator();
            while (it.hasNext()){
                String s = it.next();
                Course c =  table.get(s);
                if(c.getCname().startsWith("A"))
                    System.out.println(c);
            }
        System.out.println("3. Entry Approach");
            Set<Entry<String, Course>>  ent =  table.entrySet();
            for (Entry<String, Course> e: ent){
                // You have a getter for Course and Key
                String key = e.getKey();
                Course c = e.getValue();
                if(c.getCname().startsWith("A"))
                    System.out.println(c);
            }
        System.out.println("4. Only Accessing Values not depends on Key");
          Collection<Course> col =   table.values();
          for (Course c: col){
              if(c.getCname().startsWith("A"))
                  System.out.println(c);
          }
        System.out.println("5. Enumeration only for Hashtable");
        Enumeration<Course> col1 = table.elements();
        while (col1.hasMoreElements()){
            Course c = col1.nextElement();
            if(c.getCname().startsWith("A"))
                System.out.println(c);
        }
      //   int count = 0;
        System.out.println("6. Using Lambda");
        table.forEach((k,v)->{
        //    count ++; // Final or Effectively
            if(v.getCname().startsWith("A"))
                System.out.println(v);
        });

    }
}
