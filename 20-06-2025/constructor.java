class Car {
    String model;
    Car(String m) {
        model = m;
    }
    void display() {
        System.out.println("Model: " + model);
    }
    public static void main(String[] args) {
        Car c = new Car("Toyota");
        c.display();
    }
}
