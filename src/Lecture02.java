import java.util.*;

class Lecture02 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 02");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #1 here:
        // 1. What is an ArrayList? In what cases should you use an ArrayList rather
        // than an array?
        // An ArrayList is a data structure very similar to Arrays, however, it is resizable.
        // Cases when you should use an ArrayList over an Array are:
        // When you're unsure of how many elements you will have or need
        // When you value built-in methods and convenience over raw performance

        // Put your answer for #3 here:
        // 3. Write the code to declare an ArrayList containing these elements. What is
        // the size of the list? What is its type?
        ArrayList<String> list = new ArrayList<>(Arrays.asList("It", "was", "a", "stormy", "night"));

        // The current size of the list is 5
        // The type of the list is String

        // Put your answer for #4 here:
        // 4. Write code to insert two additional elements, "dark" and "and", at the
        // proper places in the list to produce the following ArrayList as the result:
        // ["It", "was", "a", "dark", "and", "stormy", "night"]
        list.add(3, "dark");
        list.add(4, "and");
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println(list);

        // Put your answer for #5 here:
        // 5. Write code to change the second element’s value to "IS", producing the
        // following ArrayList as the result:
        // ["It", "IS", "a", "dark", "and", "stormy", "night"]
        list.set(1, "IS");
        System.out.println(list);

        // Put your answer for #7 here:
        // 7. Write code to declare an ArrayList holding the first 10 multiples of 2: 0,
        // 2, 4,..., 18. Use a loop to fill the list with the proper elements.
        int listLength = 10;
        ArrayList<Integer> multiplesOf2 = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            multiplesOf2.add(i * 2);
        }
        for (Integer num : multiplesOf2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Put your answer for #9 here:
        // 9. Write code to print out whether or not a list of Strings contains the
        // value "IS". Do not use a loop.
        System.out.println(list.contains("IS"));

        // Put your answer for #14 here:
        // 14. What is a wrapper class? Describe the difference between an int and an
        // Integer.
        // A wrapper class is used because Java treats everything like an object except for primitive data types.
        // So we encapsulate the primitive data type with a Wrapper class which gives it an object's appearance.


        // Put your answer for #13 here:
        // 13. The code that follows does not compile. Why not? Explain how to fix it.
        // The code does not work because we are initializing the ArrayList with a primitive data type
        // We need to instead use a Wrapper class (Integer)

        // ArrayList<int> numbers = new ArrayList<>();
        // numbers.add(7);
        // numbers.add(19);
        // System.out.println(numbers);

        // Put your answer for #15 here:
        // 15. Write the output produced when the following method is passed each of the
        // following lists:

         ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(2, 6, 1, 8));
         ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(30, 20, 10, 60, 50, 40));
         ArrayList<Integer> listC = new ArrayList<>(Arrays.asList(-4, 16, 9, 1, 64, 25, 36, 4, 49));

        // A. *[1, 2, 6, 8]*
        // B. [40, 30, 20, 10, 60, 50]
        // B. [40, 30, 20, 10, 60, 50]
        // B. [10, 40, 30, 20, 60, 50]
        // B. [30, 10, 40, 20, 60, 50]
        // B. *[10, 30, 40, 20, 60, 50]*
        // C. [-4, 16, 9, 1, 64, 25, 36, 4, 49]
        // C. [4, -4, 16, 9, 1, 64, 25, 36, 49]
        // C. [25, 4, -4, 16, 9, 1, 64, 36, 49]
        // C. [1, 25, 4, -4, 16, 9, 64, 36, 49]
        // C. [1, 25, 4, -4, 16, 9, 64, 36, 49]
        // C. *[-4, 1, 25, 4, 16, 9, 64, 36, 49]*

        mystery1(listA);
        mystery1(listB);
        mystery1(listC);

    }
    public static void mystery1(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) < list.get(i - 1)) {
                int element = list.get(i);
                list.remove(i);
                list.add(0, element);
            }
        }
        System.out.println(list);
    }
}
