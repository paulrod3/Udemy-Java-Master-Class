package UdemyPracticePackage;

public class Main_ClassesandObjects {
    public static void main(String[] args) {
        ClassesAndObjects car = new ClassesAndObjects();

        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");

        ClassesAndObjects targa = new ClassesAndObjects();

        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("");
        car.describeCar();
    }
}
