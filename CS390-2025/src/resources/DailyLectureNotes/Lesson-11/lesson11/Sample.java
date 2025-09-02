package lesson11;

import java.util.Objects;

public class Sample {
    int x;
    boolean b;
    double d;
    String s;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sample sample = (Sample) o;
        return x == sample.x && b == sample.b && Double.compare(d, sample.d) == 0 && Objects.equals(s, sample.s);
    }
    @Override
    public int hashCode() {
     int hc = 31;
     long dhash = Double.doubleToLongBits(d);
     int dhash1 = (int) (dhash ^ (dhash >>> 32));

        hc = 31 * hc + s.hashCode() + x + (b?1:0) +dhash1;
        return hc;
    }
}
