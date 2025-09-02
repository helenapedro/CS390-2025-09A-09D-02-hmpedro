package lesson8;

import java.util.Comparator;

public class ConsistComparator implements Comparator<Apple> {
    @Override
    public int compare(Apple o1, Apple o2) {
        // New Advanced style of consist comparator
        //Comparator.comparing(Apple::getColor).thenComparing(Apple::getPrice).thenComparing(Apple::getWt);
        // Primary key, Secondary keys
        if(o1.getColor().compareTo(o2.getColor())!=0)
            return o1.getColor().compareTo(o2.getColor());
            else
                if(Double.compare(o1.getPrice(),o2.getPrice())!=0)
                    return Double.compare(o1.getPrice(),o2.getPrice());
              else
                  return Double.compare(o1.getWt(),o2.getWt());
    }

}
