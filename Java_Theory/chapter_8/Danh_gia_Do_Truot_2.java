package chapter_8;

class Student {

    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    void checkPassFail() {

        if (this.score >= 35) {
            System.out.println(this.name + " passed the exam.");
        } else {
            System.out.println(this.name + " failed the exam.");
        }
    }
}

// Main Class
class Danh_gia_Do_Truot_2 {
    public static void main(String[] args) {

        // create objects
        Student student1 = new Student("Jack", 78);
        Student student2 = new Student("Rosa", 32);

        // check if student1 passed the exam
        student1.checkPassFail();

        // check if student2 passed the exam
        student2.checkPassFail();
    }
}
