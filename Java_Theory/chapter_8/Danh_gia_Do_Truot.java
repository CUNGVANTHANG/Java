package chapter_8;

class Student {

    String name;
    int score;

    void checkPassFail() {

        if (this.score >= 35) {
            System.out.println(this.name + " passed the exam.");
        } else {
            System.out.println(this.name + " failed the exam.");
        }
    }
}

// Main Class
class Main {
    public static void main(String[] args) {

        // create first object
        Student student1 = new Student();
        student1.name = "Jack";
        student1.score = 78;

        // method call using student1
        student1.checkPassFail();

        // create second object
        Student student2 = new Student();
        student2.name = "Rosa";
        student2.score = 32;

        // method call using student2
        student2.checkPassFail();
    }
}
