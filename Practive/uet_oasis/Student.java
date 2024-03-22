package uet_oasis;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * constructor.
     * 
     * @param name    name.
     * @param address address.
     * @param program program.
     * @param year    year.
     * @param fee     fee.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program="
                + program + ",year=" + year + ",fee=" + fee + "]";
    }
}
