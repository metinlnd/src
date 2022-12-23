package day39_Recap.Shapetask;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.name == null) {
            System.err.println("Name can not be null");

            System.exit(0);
        }


        if (this.name.isEmpty() || this.name.isBlank()) {

            System.err.println("Invalid name");
            System.exit(1);

        }


        this.name = this.name;


    }


    public Shape(String name) {

        setName(name);


    }


    public double area() {
        return 0;
    }


    public double perimeter() {

        return 0;
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}