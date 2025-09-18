package W3L9_HW_Asgmt.prob2;

public class LinkedListStackTest {
    public static void main(String[] args) {
        LinkedListStack st = new LinkedListStack();

        st.push(1);
        st.push(2);
        st.push(15);
        st.push(20);
        st.push(25);

        System.out.println("Stack: " + st);
        System.out.println("Is Empty -> " + st.isEmpty());
        System.out.println("Size -> " + st.size());

        Integer peek = st.peek();
        System.out.println("Peek -> " + peek);

        Integer pop = st.pop();
        System.out.println("Pop -> " + pop);

        System.out.println("After pop: " + st);
        System.out.println("Is Empty -> " + st.isEmpty());
    }
}
