package chapter_11;

class Hello {

    // main() method
    public static void main(String[] args) {

        // create an object of the Hello class
        Hello obj = new Hello();

        // check if the created object is the object of Hello class
        boolean result = obj instanceof Hello;

        // print the result
        System.out.println(result);
    }
}
