package UdemyPracticePackage;

public class Main_ClassesandObjects {
    public static void main(String[] args) {
        ClassesAndObjects car = new ClassesAndObjects();

        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("");
        car.describeCar();
    }
}
