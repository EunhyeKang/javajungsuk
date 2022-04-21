

import java.util.Arrays;

public class SungJuk_Dar2{

    public static void main(String[] args) {
        Student[] s = {new Student(100), new Student(95), new Student(50),
                new Student(75), new Student(78), new Student(89),
                new Student(82), new Student(83), new Student(81)
        };

        A a = new A();

        a.insertScore(s);
        a.getTotalScore();
        a.getAverage();
        System.out.println("A클래스 이용: "+a);


        B b = new B();

        b.insertScore(s);
        b.getTotalScore();
        b.getAverage();
        b.getStudentBelowAvg();
        System.out.println("B클래스 이용: "+b);

        C c = new C();

        c.insertScore(s);
        c.getTotalScore();
        c.getAverage();
        c.getStudentBelowAvg();
        c.getGrade();
        c.getGradeCnt();
        System.out.println("---------------");
        System.out.println("C클래스 이용: ");
        c.printGraph();

    }
}

class Student {
    int score;
    String grade;

    Student() {
    }

    Student(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", grade='" + grade + '\'' +
                '}';
    }
}

class A {
    int totalScore;
    Student[] students;
    double average;

    public void insertScore(Student[] student) {
        this.students = student;
    }

    public int getTotalScore() {
        for (Student s : students) {
            totalScore += s.score;
        }

        return totalScore;
    }

    public double getAverage() {
        average = (double)totalScore / students.length;
        return average;
    }

    public String toString() {
        return "총합 " + students.length + "명 (평균 " + (int)(average*10)/10f + "점)";
    }
}

class B extends A {
    int belowAvg = 0;

    public void getStudentBelowAvg() {
        for (Student s : students) {
            if (s.score < average) {
                belowAvg++;
            }
        }
    }

    public String toString() {
        return "총합 " + students.length + "명 (평균 " + (int)(average*10)/10f + "점) (평균 미만 "+belowAvg+"명)";
    }
}

class C extends B {
    String[] grades = {"A", "B", "C", "D", "F"};
    int[] gradesCnt = new int[grades.length];

    public void getGrade() {
        for (Student s : students) {
            if (s.score >= 90) {
                s.grade = "A";
            } else if (s.score >= 80) {
                s.grade = "B";
            } else if (s.score >= 70) {
                s.grade = "C";
            } else if (s.score >= 60) {
                s.grade = "D";
            } else {
                s.grade = "F";
            }
        }
    }

    public void getGradeCnt() {
        for (Student s : students) {
            switch (s.grade) {
                case "A":
                    gradesCnt[0]++;
                    break;
                case "B":
                    gradesCnt[1]++;
                    break;
                case "C":
                    gradesCnt[2]++;
                    break;
                case "D":
                    gradesCnt[3]++;
                    break;
                default:
                    gradesCnt[4]++;
            }
        }
    }

    public String toString(){
        return "총합 " + students.length + "명 (평균 " + (int)(average*10)/10f + "점)";
    }

    public void printGraph() {
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("%s(%d)|",grades[i],gradesCnt[i]);
            for (int j = 0; j < gradesCnt[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------");
        System.out.println(toString());
    }
}