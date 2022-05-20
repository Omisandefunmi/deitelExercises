package chapter9.Abstraction;

public interface List {
    void add (String item);
    void add (int index, String item);
    String get(int index);
    void remove(String item);
    void remove(int index);
    int size();

    boolean isFull();

    void replace(int index, String item);
}
