package dshandson.arraylist;

public interface ArrayListADT {
    void add(Object target);

    void add(Object target, int pos);

    Object get(int i);

    boolean find(Object target);

    boolean remove(Object target);

//    void sort();
//
//    void swap(int i, int j);
//
//    int minpos(int bottom, int top);
//
//    boolean binSearch(String val);
//
//    boolean binSearch(int a, int b, Object target);

    void resize();

    int size();

    boolean isEmpty();

    boolean isFull();

    String toString();
}
