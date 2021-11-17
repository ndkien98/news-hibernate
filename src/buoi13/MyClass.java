package buoi13;

public class MyClass <T> implements Containment<T>{

    T[] arrayRef;

    int maxSize = 10;
    int currentSize = 0;
    public MyClass() {
    }

    public MyClass(T[] arrayRef) {
        this.arrayRef = arrayRef;
    }

    public void add(T data){
       arrayRef[currentSize] = data;
       currentSize++;
    }

    @Override
    public boolean contains(T obj) {
        for (T x:arrayRef
             ) {
            if (x.equals(obj)) return true;
        }
        return false;
    }
}
