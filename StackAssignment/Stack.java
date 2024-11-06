import java.util.EmptyStackException;


public class Stack<T extends Comparable<T>> implements StackInterface<T> {
    
    private int size = 0;
    private T[] stack = (T[]) new Comparable[10];

    // Implement your Stack here..

    public void push(T elemenT){
        if (stack.length == this.size) {
            resize();
        }
        this.stack[size] = elemenT;
        this.size++;
        
    };
    public T pop(){
        if (size == 0) { 
        throw new EmptyStackException();
    }
        T topItem = stack[size -1];
        stack[size-1] = null;
        size--;
        
        return topItem;
        
    };
    public T peek(){
        if (this.size == 0) {
            return null;
        }
        return stack[size-1];

    };
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }
        return false;
    };
    public int size(){
        return this.size;
    };

    private void resize() {
        T[] newstack =(T[]) new Comparable[this.stack.length * 2];

        for (int i = 0; i < this.stack.length; i++) {
            newstack[i] = this.stack[i];
        }

        this.stack = newstack;
    }
}
