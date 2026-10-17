<<<<<<< HEAD
<<<<<<< HEAD
/**
 * testSinglyLinkedList
=======
=======
>>>>>>> 6286f669ef277f2168983dfcfa2e2f1703e0716c
import java.util.Arrays;

/**
 * testDoublyLinkedList
<<<<<<< HEAD
>>>>>>> 25d796d251d4beeb5119e771d167e384aac717b6
=======
>>>>>>> 6286f669ef277f2168983dfcfa2e2f1703e0716c
 */
public class testDoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
<<<<<<< HEAD
<<<<<<< HEAD
      linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(6);
        System.out.println(linkedList.get(2)); // menghasilkan nilai 3
        System.out.println(linkedList.get(12)); //Terjadi exception error
        System.out.println(linkedList.indexOf(4));// menghasilkan 5
        System.out.println(linkedList.indexOf(10));// menghasilkan -1
        linkedList.printReverse(); // Menghasilkan 6,5,4,3,2,1
        System.out.println(linkedList.remove(3)); // Menghasilkan True
        System.out.println(linkedList.remove(8)); // Menghasilkan False
        System.out.println(linkedList.toArray()); //Menghasilkan [6,5,4,3,2,1]
=======
=======
>>>>>>> 6286f669ef277f2168983dfcfa2e2f1703e0716c
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);

        System.out.println(linkedList.get(2));       // 3
        linkedList.get(12);                          // mencetak pesan error
        System.out.println(linkedList.indexOf(4));   // 3
        System.out.println(linkedList.indexOf(10));  // -1
        linkedList.printReverse();                   // 6,5,4,3,2,1
        System.out.println(linkedList.remove(3));    // true
        System.out.println(linkedList.remove(8));    // false
        System.out.println(Arrays.toString(linkedList.toArray())); // [1, 2, 4, 5, 6]
<<<<<<< HEAD
>>>>>>> 25d796d251d4beeb5119e771d167e384aac717b6
=======
>>>>>>> 6286f669ef277f2168983dfcfa2e2f1703e0716c
    }
}