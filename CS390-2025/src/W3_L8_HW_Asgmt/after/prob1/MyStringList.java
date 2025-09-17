package W3_L8_HW_Asgmt.after.prob1;

import java.util.Arrays;

public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private String[] strArray;
    private int size;

    public MyStringList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    // Return the position (index) of the first occurrence of s in the list.
    public int indexOf(String s) {
        if (s == null) return -1;

        for (int i = 0; i < size; i++) {
            if (s.equals(strArray[i])) {
                return i;
            }
        }
        return -1;
    }

    // Remove the element at the given position.
    public String removeAt(int index) {
        if (index < 0 || index >= size) { //throw new IndexOutOfBoundsException();
            return null;
        }
        String removedElement = strArray[index];
        for (int i = index; i < size - 1; i++) {
            strArray[i] = strArray[i+1];
        }
        size--;
        return removedElement;
    }

    // Remove all elements from the list so that it becomes empty.
    public void clear() {
        if (strArray == null) return;

        for (int i = 0; i < size; i++) {
            strArray[i] = null;
        }
        size = 0;
    }

    // Replace the element at position index with s
    public String set(int index, String s) {
        if (index < 0 || index >= size) return null;
        if (s == null) throw new NullPointerException("The input string cannot be null");

        String old = strArray[index];
        strArray[index] = s;
        return old;
    }
    // Return true if the current list contains every element of other.
    public boolean containsAll(MyStringList other){
        if (other == null) return false;

        for (int i = 0; i < other.size(); i++) {
            var s = other.get(i);
            if (!find(s)) return false;
        }
        return true;
    }
    // Return a new MyStringList containing elements from index start to end - 1.
    public MyStringList subList(int start, int end) {
        MyStringList sub = new MyStringList();

        if (start < 0 || end > size || start > end) {
            return sub;
        }

        for (int i = start; i < end; i++) {
            sub.add(strArray[i]);
        }
        return sub;
    }


    // Add an element in last
    public void add(String s) {
        if(s==null) return;// throw new NullPointerException();
        //Check for Array is Full
        if (size == strArray.length)
            resize(); // Array is full
        // Add at the end of the list.
        strArray[size] = s;
        size++; // Increment index to insert the new elements
        // strArray[size++] = s;
    }

    public String get(int i) {
        if (i < 0 || i > size - 1) {
            // throw new IndexOutOfBoundsException("Invalid index i" + i);
            return null;
        }
        return strArray[i];
    }

    public boolean find(String s) {
        if (s == null)
            return false;
        for (int i = 0; i < size; i++)// for (String test: strArray)
        {
            if (s.equals(strArray[i]))
                return true;

        }
        return false; // The element is not in the list
    }

    /* 1. Using System.arrayopy()
      public void insert(String s, int pos){
         if(pos > size-1 || pos<0 )
             return;//allowed to add 0 to size-1
      if(s==null) return;
      if(pos == strArray.length) {
          resize();
       }
      String[] temp = new String[strArray.length];
       System.arraycopy(strArray,0,temp,0,pos); // src, spos,des,dspos,number of elements temp[pos] = s;
        temp[pos] = s;
      System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);// count =size - pos

      strArray = temp;
      ++size;
       }
     */
	/* 2. Without Temp array
	// Shift elements to the right to make space for the new element
        for (int i = size; i > pos; i--) {
            array[i] = array[i - 1];
        }
        // Insert the new element
        array[pos] = s;
        size++;
    }

	 */
    // can insert the elements 0 to size position
    public void insert(String s, int pos) {
        if (pos < 0 || pos > size)
            return;
        // If the array gets full
        if (size == strArray.length) {
            resize();
        }
        String[] temp = new String[strArray.length];

        for (int i = 0; i < pos; i++)
            temp[i] = strArray[i];
        temp[pos] = s;

        for (int i = pos + 1; i < size; i++)
            temp[i] = strArray[i - 1];

        strArray = temp;
        ++size;
    }

    public boolean remove(String s) {
        if (size == 0)
            return false; // the list is empty
        if (s == null)
            return false;
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (strArray[i].equals(s)) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return false; // s is not found in the list
        String[] temp = new String[strArray.length];
        System.arraycopy(strArray, 0, temp, 0, index);
        System.arraycopy(strArray, index + 1, temp, index,
                strArray.length - (index + 1));
        strArray = temp;
        --size;
        return true;
    }

    private void resize() {
        System.out.println("resizing");
        int len = strArray.length;// Original array length
        int newlen = 2 * len; // Twice the original length
        // String[] temp = new String[newlen];
        // System.arraycopy(strArray,0,temp,0,len);
        // strArray = temp;
        strArray = Arrays.copyOf(strArray, newlen);

    }

    public String toString() {
        if (size == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < size - 1; ++i) {
            sb.append(strArray[i] + ", ");
        }

        sb.append(strArray[size - 1] + "]");
        return sb.toString();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        /*
         * if(size==0) return false; else return true;
         */
        return (size == 0);
    }
}

