package lesson8;

public class MyStringList {
    private String[] arr;
   private int size; // Index
    private final int CAPACITY = 11;
    public MyStringList(){
        arr = new String[CAPACITY];
        int size=0;
    }
    public MyStringList(int newSize){
        arr = new String[newSize];
        int size=0;
    }
    // Practice all the unimplemented methods
    private void resize(){

    }
    // Behaviours - add into the end
    public void add(String item){


    }
    public void add(int index, String item){

    }
    public String remove(int index){
        return null;
    }
    public String remove(String data){
        return null;
    }
    public int getSize(){
        return  0;
    }
    public String get(int index){
        return null;

    }
    public String set(int index, String value){
        return null;
    }
    public boolean contains(String target){
        return false;
    }
    public int indexOf(String item){
        return -1;
    }
    public int lastIndexOf(String item){
        return -1;
    }
    // Add an array collection into the end of the list
    public void addAll(String[] s){

    }
}
