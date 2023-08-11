package chapter_9;

class Polygon {
    void display() {
        System.out.println("A Polygon is created");
    }
}

// inherit Rectangle and Triangle class from Polygon
class Rectangle extends Polygon {

}

class Triangle extends Polygon {

}

class Nhieu_lop_ke_thua_mot_lop {
    public static void main(String[] args) {

        // create object of both Rectangle and Triangle
        Rectangle rect = new Rectangle();
        Triangle trian = new Triangle();

        // access the method of Polygon using rect and trian
        rect.display();
        trian.display();
    }
}
