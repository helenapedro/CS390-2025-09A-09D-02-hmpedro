package dshandson.arraylist;

import java.util.NoSuchElementException;

public class StringArrayList{
    private Object[] strArray;
    private int count;

    public StringArrayList() {
        int CAPACITY = 10;
        strArray = new Object[CAPACITY];
        count = 0;
    }

    public void add(Object target) {
        if (isFull()) resize();
        strArray[count++] = target;
    }

    public void insert(Object target, int pos) {
        if (target == null)
            throw new NullPointerException("Target must not be null");
        if (pos < 0 || pos > count)
            throw new ArrayIndexOutOfBoundsException("pos " + pos);

        if (isFull()) resize();

        System.arraycopy(strArray, pos, strArray, pos + 1, count - pos);
        strArray[pos] = target;
        count++;
    }

    public Object removeLast() {
        if (count == 0)
            throw new NoSuchElementException("Array is null");
        Object last = strArray[--count];
        strArray [count] = null;
        return last;
    }

    public boolean remove(Object target) {
        if (target == null) throw new NullPointerException("Target must not be null");

        int idx = foundIndex(target);
        if (idx < 0) return false;

        System.arraycopy(strArray, idx + 1, strArray, idx, count - 1 - idx);

        strArray [--count] = null;
        return true;
    }

    public Object removeAt(int index) {
        if (index < 0 || index >= count) throw new ArrayIndexOutOfBoundsException("index=" + index);
        Object removed = strArray[index];
        System.arraycopy(strArray, index + 1, strArray, index, count - 1 - index);
        strArray[--count] = null;
        return removed;
    }

    public Object get(int i) {
        if (i < 0 || i >= count) throw new ArrayIndexOutOfBoundsException("i=" + i);
        return strArray[i];
    }


    public Object getLast() {
        if (count == 0) throw new NoSuchElementException("Array is empty");
        return strArray[--count];
    }

    private int foundIndex(Object target) {
        for (int i = 0; i < count; i++) {
            if (target.equals(strArray[i]))
                return i;
        }
        return - 1;
    }

    public boolean find(Object target) {
        return foundIndex(target) >= 0;
    }

    public void resize() {
        int len = strArray.length;
        Object[] temp = new Object[len * 2];
        System.arraycopy(strArray, 0, temp, 0, len);
        strArray = temp;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == strArray.length;
    }

    public String toString() {
        if (count == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < count - 1; i++)
            sb.append(strArray[i]).append(", ");
        sb.append(strArray[count - 1]).append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        StringArrayList arr = new StringArrayList();
        String a = "A";
        String b = "B";

        arr.insert(a, 0);
        arr.add(b);
        arr.insert("D", 2);
        arr.add("C");
        arr.add("J");

        System.out.println(arr);
        System.out.println("Removed C -> " + arr.remove("C"));
        System.out.println(arr);
        System.out.println("get -> " + arr.get(1));
        System.out.println("getLast -> " + arr.getLast());
//        System.out.println("indexOf -> " + a + " -> " + arr.foundIndex(a));
//        System.out.println("found -> " + arr.find("C"));
//        System.out.println("size -> " + arr.size());
//        System.out.println("isEmpty -> " + arr.isEmpty());
//        System.out.println("isFull -> " + arr.isFull());
    }
}
