# Ký tự đặc biệt
\' -> ' (Dấu nháy đơn)
\'' -> " (Dấu nháy kép)
\\ -> \ (Dấu gạch ngược)
\n (Xuống dòng)
\t (Tab)
\b (Backspace)
\r (Carriage return)
\f (Formfeed)

# Ví dụ:
```java
class Main {
    public static void main(String[] args) {
        
        System.out.println("We are TEK4.VN, the \"free and high quality\" learning resource.");
        System.out.println("It\'s right.");
        System.out.println("The character \\ is called backslash.");

        // We are TEK4.VN, the "free and high quality" learning resource.
        // It's right.
        // The character \ is called backslash.
    }
}
```

```java
class Main {
    public static void main(String[] args) {
        
        int age = 25;
        double salary = 54875.67;
        
        // print age and salary together
        System.out.println("Age is " + age + ".\nSalary is " + salary);
        // Age is 25.
        // Salary is 54875.67
    }
}
```
