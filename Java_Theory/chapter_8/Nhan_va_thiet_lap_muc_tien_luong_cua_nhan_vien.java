package chapter_8;

class Employee {
    // fields
    String name;
    double currentSalary;
    private double newSalary;

    // initialize value of name and currentSalary
    Employee(String name, double currentSalary) {
        this.name = name;
        this.currentSalary = currentSalary;
    }

    // compute new salary
    public void setSalary(double percentage) {
        this.newSalary = this.currentSalary + (percentage / 100.0) * currentSalary;

    }

    // return the new salary
    public double getSalary() {
        return this.newSalary;
    }
}

class Nhan_va_thiet_lap_muc_tien_luong_cua_nhan_vien {
    public static void main(String[] args) {

        // compute salary of Felix
        Employee employee1 = new Employee("Felix", 25213.53);

        // increase salary by 20%
        employee1.setSalary(20.00);
        double newSalary = employee1.getSalary();
        System.out.println("Name: " + employee1.name + "\nNew Salary: " + newSalary);

        // compute salary of Maria
        Employee employee2 = new Employee("Maria", 873223.32);

        // increase salary by 15.37%
        employee2.setSalary(15.37);
        newSalary = employee2.getSalary();
        System.out.println("Name: " + employee2.name + "\nNew Salary: " + newSalary);
    }
}
