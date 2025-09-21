package dshandson.minproject;

import java.util.Arrays;
import java.util.NoSuchElementException;

class MyArrayList {
    private Consonant[] consArray;
    private int size;

    public MyArrayList(int capacity) {
        consArray = new Consonant[capacity];
    }

    public MyArrayList () {
        int CAPACITY = 5;
        consArray = new Consonant[CAPACITY];
        this.size = 0;
    }

    public void add(Consonant c) {
        if (c ==  null)
            throw new NullPointerException("Cannot add a null element in the list.");

        if (size == consArray.length)
            resize();
        consArray[size++] = c;
    }

    public void add(Consonant target, int pos) {
        if (target == null) throw new NullPointerException("Invalid object");
        if (pos < 0 || pos > size) throw new IndexOutOfBoundsException("pos=" + pos);

        if (size == consArray.length)
            resize();

        if (pos < size) {
            System.arraycopy(consArray, pos, consArray, pos + 1, size - pos);
        }

//        for (int j = size; j > pos; j--) {
//            consArray[j] = consArray[j - 1];
//        }
        consArray[pos] = target;
        size++;
    }

    public void addFirst(Consonant target) {
        add(target, 0);
    }

    public void removeLast() {
        if (size == 0) return;
        consArray[size - 1] = null;
        size--;
    }

    public boolean remove(Consonant c) {
        if (c == null || isEmpty()) return false;

        int idx = indexOf(c);
        if (idx == - 1) return false;

        if (idx == size - 1) {
            consArray[--size] = null;
            return true;
        }

        System.arraycopy(consArray, idx + 1, consArray, idx, size - 1 - idx);
//        for (int j = idx; j < size - 1; j++) {
//            consArray[j] = consArray[j + 1];
//        }
        consArray[--size] = null;
        return true;
    }

    private boolean isFull() {
        return size == consArray.length;
    }

    private boolean isEmpty() { return size == 0; }

    private int indexOf(Consonant c) {
        for (int i = 0; i < size; i++) {
            if (c.equals(consArray[i]))
                return i;
        }
        return -1;
    }

    private void resize() {
        System.out.println("resizing...");
        Consonant[] temp = new Consonant[consArray.length * 2];
        System.arraycopy(consArray, 0, temp, 0, consArray.length);
        consArray = temp;
    }

    public Consonant get(Consonant target) {
        if (target == null)
            throw new NoSuchElementException("Invalid input");

        for (int i = 0; i < size; i++) {
            if (target.equals(consArray[i]))
                return consArray[i];
        }
        return null;
    }

    public int size() {
        return size;
    }

    /******* sorting methods ********/
    public void sort() {
        if (size <= 1) return;

        for (int i = 0; i < size - 1; i++) {
            int nextMinPos = minPos(i, size);
            swap(i, nextMinPos);
        }
    }
    private int minPos(int bottom, int topExclusive) {
        if (bottom < 0 || bottom >= size)
            throw new IndexOutOfBoundsException("bottom " + bottom);
        if (topExclusive < bottom + 1 || topExclusive > size)
            throw new IndexOutOfBoundsException("top " + topExclusive);

        int minIndex = bottom;
        int min = consArray[minIndex].asciiValue;

        for (int i = bottom + 1; i < topExclusive; i++) {
            if (consArray[i].asciiValue < min) {
                min = consArray[i].asciiValue;
                minIndex = i;
            }
        }
        return minIndex;
    }

    private void swap(int i, int j) {
        Consonant temp = consArray[i];
        consArray[i] = consArray[j];
        consArray[j] = temp;
    }
    /********* end sorting methods ********/

    /******** binary search methods ********/
    public boolean binarySearch(Consonant target) {
        sort();
        return binSearch(0, size - 1, target);
    }
    private boolean binSearch(int b, int t, Consonant target) {
        if (b > t) return false;

        int mid = (b + t) / 2;

        int cmp = Integer.compare(consArray[mid].asciiValue, target.asciiValue);
        if(cmp == 0)
            return true;
        if (cmp < 0)
            return binSearch(mid + 1, t, target);
        else {
            return binSearch(b, mid - 1, target);
        }
    }
    /********* end binary search methods *****/

    public Consonant[] toArray() {
        return Arrays.copyOf(consArray, size);
    }

    @Override
    public String toString() {
        if (consArray == null || size == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(consArray[i]).append(", ");
        }
        sb.append(consArray[size - 1]).append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyArrayList consonants = new MyArrayList();
        Consonant a = new Consonant("a", 'a');
        Consonant b = new Consonant("b", 'b');
        Consonant d = new Consonant("d", 'd');
        Consonant z = new Consonant("z", 'z');
        Consonant v = new Consonant("a", 'a');

        consonants.add(a);
        consonants.add(b);
        consonants.add(new Consonant("c", 'c'));
        consonants.add(d, 0);
        consonants.add(z, 1);

        boolean found = consonants.binarySearch(a);
        System.out.println("Found " + a + " - > " + found);

        Consonant res = consonants.get(v);
        System.out.println("get -> " + res);

        int minPosition = consonants.minPos(0, consonants.size());
        System.out.println("Min position -> " + minPosition);
        System.out.println("Size -> " + consonants.size());

        consonants.sort();
        System.out.println(consonants);
    }
}
