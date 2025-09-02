package lesson8;

import java.util.Arrays;

public class TestStringList {
    public static void main(String[] args) {
        MyStringList list = new MyStringList();
        list.add("C++");
       String pos0 =  list.get(0);
        System.out.println(pos0);
        String[] arr = new String[10];
        arr[0] = "C++";
        System.out.println(Arrays.toString(arr));

    }
}
