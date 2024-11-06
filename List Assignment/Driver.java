public class Driver {
    public static void main(String[] args) {
        List<Integer> list = new List<Integer>();

        list.add(10);
        list.add(2);
        System.out.print("\nList after initially adding items: ");
        joinAndPrint(list);

        list.remove(list.size() - 1);
        System.out.print("\nList after removing element at the last index: ");
        joinAndPrint(list);

        list.add(1, 200);
        System.out.print("\nList after adding 200 at index 1: ");
        joinAndPrint(list);

        list.add(20, 65);
        System.out.print("\nList after trying to add 65 at index 20: ");
        joinAndPrint(list);

        list.add(-1, 99);
        System.out.print("\nList after trying to add 99 at index -1: ");
        joinAndPrint(list);

        list.add(6);
        list.add(5);
        list.add(56);
        list.add(43);
        list.add(45);
        list.add(98);
        System.out.print("\nList after adding more items: ");
        joinAndPrint(list);

        list.remove(3);
        System.out.print("\nList after removing element at index 3: ");
        joinAndPrint(list);

        list.remove(12);
        System.out.print("\nList after removing element at index 12: ");
        joinAndPrint(list);

        list.remove(-2);
        System.out.print("\nList after removing element at index -2: ");
        joinAndPrint(list);

        list.set(10, 600);
        System.out.print("\nList after calling set at index 10: ");
        joinAndPrint(list);

        list.set(-1, 5400);
        System.out.print("\nList after calling set at index -1: ");
        joinAndPrint(list);

        list.set(2, 50);
        System.out.print("\nList after calling set at index 2: ");
        joinAndPrint(list);

        System.out.print("\nCalling get() with index 2: " + list.get(2));

        System.out.print("\nCalling get() with index 12: " + list.get(12));

        System.out.print("\nCalling get() with index -5: " + list.get(-5));

        list.remove(Integer.valueOf(2));
        System.out.print("\nList after removing element value 2: ");
        joinAndPrint(list);
        
        
    }

    public static void joinAndPrint(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
