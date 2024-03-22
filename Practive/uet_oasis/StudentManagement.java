package uet_oasis;

public class StudentManagement {
    private Student1[] students;
    private int numStudents;

    public StudentManagement() {
        students = new Student1[100];
        numStudents = 0;
    }

    public Student1[] getStudents() {
        return students;
    }

    public void setStudents(Student1[] students) {
        this.students = students;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    public int getNumStudents() {
        return numStudents;
    }

    static boolean sameGroup(Student1 s1, Student1 s2) {
        return s1 != null && s2 != null && s1.getGroup() != null && s2.getGroup() != null
                && s1.getGroup().equals(s2.getGroup());
    }

    void addStudent(Student1 newStudent) {
        if (newStudent == null) {
            return;
        }

        if (numStudents < 100) {
            students[numStudents] = newStudent;
            numStudents++;
        } else {
            return;
        }
    }

    String studentsByGroup() {
        String result = "";
        String[] group = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            group[i] = students[i].getGroup();
        }

        for (int i = 0; i < numStudents; i++) {
            if (group[i] != null) {
                String check = group[i];
                result += group[i] + "\n";
                for (int j = i; j < numStudents; j++) {
                    if (check == students[j].getGroup()) {
                        result += students[j].getInfo() + "\n";
                        group[j] = null;
                    }
                }
            }
        }
        return result;
    }

    void removeStudent(String id) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < numStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numStudents - 1] = null;
                numStudents--;
                break;
            }
        }
    }
}
