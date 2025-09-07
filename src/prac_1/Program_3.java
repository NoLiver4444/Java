package prac_1;

record Car(String model, String license, String color, int year) {
    public Car() {
        this("None", "None", "None", 0);
    }

    public Car(String model, String color, int year) {
        this(model, "None", color, year);
    }

    @Override
    public String toString() {
        return "Model - " + this.model + "\nLicense - "
                + this.license + "\nColor - " + this.color +
                "\nYear - " + this.year;
    }
}

public class Program_3 {
    public static void main(String[] args) {
        Car car_1 = new Car("Audi", "AAAA", "Blue", 2024);
        Car car_2 = new Car();
        Car car_3 = new Car("Audi", "Black", 2022);

        System.out.println(car_1 + "\n");
        System.out.println(car_2 + "\n");
        System.out.println(car_3 + "\n");
    }
}
