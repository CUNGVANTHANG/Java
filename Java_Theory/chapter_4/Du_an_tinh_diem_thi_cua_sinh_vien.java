package chapter_4;

public class Du_an_tinh_diem_thi_cua_sinh_vien {
    double getAverageScore(int scores[]) {
        double sumScore = 0;
        for(double score : scores) {
            sumScore += score;
        }
        return sumScore / scores.length;
    }

    char computeGrade(double averageScore) {
        if (averageScore >= 80) {
            return 'A';
        }
        else if (averageScore >= 60) {
            return 'B';
        }
        else if (averageScore >= 50) {
            return 'C';
        }
        else return 'F';
    }

    public static void main(String[] args) {
        int scores[] = {55, 64, 75, 80, 65};
        Du_an_tinh_diem_thi_cua_sinh_vien obj = new Du_an_tinh_diem_thi_cua_sinh_vien();

        double averageScore = obj.getAverageScore(scores);
        char result = obj.computeGrade(averageScore);

        System.out.println("Avergae Score: " + averageScore);
        System.out.println("Grade: " + result);
    }
} 
