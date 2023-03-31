package UdemyPracticePackage;

public class ClassesAndObjects { //public class Car {
    // ---------these are fields because they are defined in the body of a class and not in the method
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {

        if ( make == null) make = "Unknown";
        String lowercasemake = make.toLowerCase();
        switch (lowercasemake){
            case "holden" , "porsche" , "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    //-------methods give users a way to interact with the private objects above
    public void describeCar() {
        System.out.println(doors + "-Door " +
               color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
