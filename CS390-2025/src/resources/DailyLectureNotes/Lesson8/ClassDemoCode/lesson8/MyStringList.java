package lesson8;

public class MyStringList {
    String[] list;
    final int SIZE = 4;// Default Capacity
    int size;
    MyStringList(){
        list = new String[SIZE];
        size = 0;
    }

    MyStringList(int newCapcity){
        list = new String[newCapcity];
        size = 0;
    }
    // End of the list
    public void add(String s){
        if (s==null) return;
        if(size == list.length) resize();
        list[size] = s;
        size++;
    }
    // Add into the specific position
    public void add(int index, String s){

    }
    public String remove(int pos){
        return null;
    }
    public String remove(String s){
        return null;
    }
    public boolean contains(String s){
        return false;
    }
    public int size(){
        return size;
    }

    public String set(int index, String data){
        return null;
    }
    public String get(int index){
        return null;
    }
    private void resize(){

    }
}
