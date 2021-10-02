import java.util.LinkedList;

class Linkedlist {
    public static void main(String[] args) {
        // create an LinkedList
        LinkedList<String> languages = new LinkedList<>();

        // add elements

        languages.add("Java");
        languages.add("C");
        languages.add("Python");

        System.out.println("LinkedList : " + languages);
        
        // add element at the 3nd position
        languages.add(3,"JavaScript");

        System.out.println("Updated LinkedList : " + languages);


        // remove elements from the front
        String str1 = languages.poll();

        // print the removed element
        System.out.println("Removed element : " + str1);
        System.out.println("LinkedList after poll(): " + languages);

        // add  element at the back
        languages.offer("Swift");
        System.out.println("LinkedList after offer(): " + languages);

        
        // create an LinkedList of Integer type
        LinkedList<Integer> numbers = new LinkedList<>();

        // add elements
        numbers.add(5);
        numbers.add(15);
        numbers.add(50);


        System.out.println("LinkedList : " + numbers);

        // add an element at the start
        numbers.addFirst(7);
        System.out.println("LinkedList after addFirst(7) : " + numbers);

        // add an element at the end
        numbers.addLast(8);
        System.out.println("LinkedList after addLast(8) : " + numbers);

        // remove the first element
        numbers.removeFirst();
        System.out.println("LinkedList after removeFirst() : " + numbers);

        // remove the last element
        numbers.removeLast();
        System.out.println("LinkedList after removeLast() : " + numbers);
        
        // access elements one by one

        for(int number : numbers) {
            System.out.println(number);
        }
        

    }
}
