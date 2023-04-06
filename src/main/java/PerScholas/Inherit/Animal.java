package PerScholas.Inherit;

public class Animal {
    private String type;
    private String size;
    private double weight;

    public Animal (){
    }
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
