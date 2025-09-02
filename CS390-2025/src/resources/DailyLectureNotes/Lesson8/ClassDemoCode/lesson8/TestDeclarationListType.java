package lesson8;

import java.util.ArrayList;
import java.util.List;

public class TestDeclarationListType {
    public static void main(String[] args) {
        List<String> ob;
       // List<int> ob1 ; // Not correct
        List<List<String>> ob1;
        List<int[]> ob2;
        var ob3 = new ArrayList<>();
    }
}
