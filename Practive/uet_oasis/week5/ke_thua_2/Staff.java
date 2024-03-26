package uet_oasis.week5.ke_thua_2;

public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * constructor.
     * 
     * @param name    name.
     * @param address address.
     * @param school  school.
     * @param pay     pay.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}
