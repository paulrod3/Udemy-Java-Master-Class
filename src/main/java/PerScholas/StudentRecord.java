package PerScholas;

public class StudentRecord {

        private String name;
        private double mathScore;
        private double sciScore;

        private static int numberOfStudents;

        public StudentRecord() {
            numberOfStudents++;
        }

        public double getMathScore() {
            return mathScore;
        }

        public void setMathScore(double mathScore) {
            this.mathScore = mathScore;
        }

        public double getSciScore() {
            return sciScore;
        }

        public void setSciScore(double sciScore) {
            this.sciScore = sciScore;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public  int getNumberOfStudents() {
            return numberOfStudents;
        }
    }

    class Main4 {
        public static void main(String[] args) {
            StudentRecord student1 = new StudentRecord();
            student1.setName("Robert");
            student1.setMathScore(3.9);
            student1.setSciScore(3.2);
            StudentRecord student2 = new StudentRecord();
            student2.setName("Alisa");
            student2.setMathScore(3.7);
            student2.setSciScore(3.5);
            new StudentRecord();

            int numberOfStudents1 = student1.getNumberOfStudents();
            System.out.println(numberOfStudents1);

            int numberOfStudents2 = student2.getNumberOfStudents();
            System.out.println(numberOfStudents2);
        }
    }
