package uet_oasis;

public class Student1 {
    private String name;
    private String id;
    private String group;
    private String email;

    Student1() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    Student1(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    Student1(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    Student1(Student1 s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}
