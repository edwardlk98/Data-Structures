public class List<T> {
    private T[] items = (T[])new Object[10];
    private int size = 0;


    public void add(T a) {
        if (items.length == this.size) {
            // resize the array.
            this.resize();
        }

        this.items[size] = a;
        this.size++;
    }
    public void add(int a, T b){
        if (items.length == this.size) {
            this.resize();
        }
        if (a > -1 && a < size) {
            this.items[a] = b;
        }
        
    }

    public void remove(int a){
        //remove method
        if (a > -1 && a < size) {
            for (int i = a; i < size - 1; i++) {
                items[i] = items[i + 1];
            }
            items[size - 1] = null;
            size--;
        }

        
        
        
    };
    public void remove(T object){
        for (int i = 0; i<size; i++){
            if (items[i] != null && items[i].equals(object)) {
                remove(i);
                return;
            }
        }
    };

    public void set(int index, T element){
        if (index > -1 && index < size) {
            items[index] = element;
        }
    };
    public int size(){
        return this.size;
    }

    public T get(int index) {
        if (index > -1 && index < this.size) {
            return this.items[index];
        }
        return null;
    }

    private void resize() {
        T[] newItems =(T[]) new Object[this.items.length * 2];

        for (int i = 0; i < this.items.length; i++) {
            newItems[i] = this.items[i];
        }

        this.items = newItems;
    }

}
