public interface StackInterface<T extends Comparable<T>> {

    /** 
     * Adds an element to the top of the stack. 
     * @param element the element to add to the stack
    */
   void push(T element);

   /**
    * Removes and returns an element from the top of the stack.
    * If the stack is empty, throw EmptyCollectionException
    * @return the element from top of the stack.
    */
    T pop() throws RuntimeException;

    /**
    * Returns an element from the top of the stack or null if the stack is empty.
    * @return the element from top of the stack.
    */
    T peek();


    /**
     * Returns true if the stack is empty else false.
     * @return true if the stack is empty.
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the stack.
     * @return size of the stack
     */
    int size();
}