package PerScholas;

public class StudentRecord1Main {
    public static void main(String[] args) {
        StudentRecord1 student1 = new StudentRecord1();
        student1.setName("Paul");
        student1.setMathScore(95);
        student1.setScienceScore(92);
        student1.setAlgebraScore(95);
        StudentRecord1 student2 = new StudentRecord1();
        student2.setName("Liz");
        student2.setMathScore(100);
        student2.setScienceScore(91);
        student2.setAlgebraScore(100);
        StudentRecord1 student3
                = new StudentRecord1("tony", 90,90,90);

        int numberOfStudents1 = student1.getNumberOfStudents();
        System.out.println("Total number of students: " + numberOfStudents1);
        System.out.printf(" Average of %.2f\n", student1.getAverageScore());
        student1.print(student1.getName());
        student1.print(student1.getName() , student1.getAverageScore());

        int numberOfStudents2 = student2.getNumberOfStudents();
        System.out.printf(student2.getName() + " has an average of %.2f\n",
                student2.getAverageScore());
        student2.print(student2.getName());
        student2.print(student2.getName() , student2.getAverageScore());
    }

    public static class StudentRecord1 {

        //---------Instance Variables ---------
        private String name;
        private double mathScore;
        private double scienceScore;
        private double algebraScore;
        private static int numberOfStudents;

        //------------------Constructors--------------------------
        public StudentRecord1() {
            numberOfStudents++;
        }
        public StudentRecord1(String name) {
            this.name = name;
        }

        public StudentRecord1(String name, double mathScore) {
            this(name);
            this.mathScore = mathScore;
        }

        public StudentRecord1(String name, double mathScore, double sciScore, double algebraScore) {
            this(name, mathScore);
            this.scienceScore = sciScore;
            this.algebraScore = algebraScore;
        }

        //---------------Getter and Setters----------------------------

        public void print (String name) {
            System.out.println("Student name: " + name);
        }

        public void print (String name , double averageScore) {
            System.out.println("Student name: " + name + " average score of " + averageScore);
        }


        public double getAverageScore () {
            return (getAlgebraScore() + getMathScore() + getScienceScore()) /3;}

        public double getMathScore() {
            return mathScore;
        }

        public void setMathScore(double mathScore) {
            this.mathScore = mathScore;
        }

        public double getScienceScore() {
            return scienceScore;
        }

        public void setScienceScore(double scienceScore) {
            this.scienceScore = scienceScore;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getAlgebraScore() {
            return algebraScore;
        }

        public void setAlgebraScore(double algebraScore) {
            this.algebraScore = algebraScore;
        }

        public int getNumberOfStudents() {
            return numberOfStudents;
        }


    }
}
