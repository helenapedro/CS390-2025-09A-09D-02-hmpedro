package dshandson.arraylist;

import java.util.NoSuchElementException;

public class StringArrayList{
    private String[] strArray;
    private int count;

    public StringArrayList() {
        int CAPACITY = 10;
        strArray = new String[CAPACITY];
        count = 0;
    }

    public void add(String target) {
        if (isFull()) resize();
        strArray[count++] = target;
    }

    public void insert(String target, int pos) {
        if (target == null)
            throw new NullPointerException("Target must not be null");
        if (pos < 0 || pos > count)
            throw new ArrayIndexOutOfBoundsException("pos " + pos);

        if (isFull()) resize();

        System.arraycopy(strArray, pos, strArray, pos + 1, count - pos);
        strArray[pos] = target;
        count++;
    }

    public String removeLast() {
        if (strArray == null)
            throw new NullPointerException("Array is null");
        String last = getLast();
        strArray [--count] = null;
        return last;
    }

    public boolean remove(String target) {
        if (target == null)
            throw new NullPointerException("Target must not be null");

        int idx = foundIndex(target);
        if (idx < 0) throw new ArrayIndexOutOfBoundsException("Target not found");

        System.arraycopy(strArray, idx + 1, strArray, idx, count - 1 - idx);

        strArray [--count] = null;
        return true;
    }

    public String get(int i) {
        String found = "";
        for (int j = 0; j < count; j++) {
            if (j == i)
                found = strArray[j];
        }
        return found;
    }

    public String getLast() {
        if (count == 0) throw new NoSuchElementException("Array is empty");
        return strArray[count - 1];
    }

    private int foundIndex(String target) {
        for (int i = 0; i < count; i++) {
            if (target.equals(strArray[i]))
                return i;
        }
        return - 1;
    }

    public boolean find(String target) {
        int index = foundIndex(target);
        String found = get(index);
        return target.equals(found);
    }

    public void resize() {
        int len = strArray.length;
        String[] temp = new String[len * 2];
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
//        System.out.println("get -> " + arr.get(1));
//        System.out.println("indexOf -> " + a + " -> " + arr.foundIndex(a));
//        System.out.println("found -> " + arr.find("C"));
//        System.out.println("size -> " + arr.size());
//        System.out.println("isEmpty -> " + arr.isEmpty());
//        System.out.println("isFull -> " + arr.isFull());
    }
}
