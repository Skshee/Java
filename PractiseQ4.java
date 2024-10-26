class Engine{
    void start(){
        System.out.println("Starting Engine");
    }
}

class Car{
    Engine engine;
    Car(Engine e){
        engine = new Engine();  // THIS IS CALLED "Has A relation"
    }
    void startCar(){
        engine.start();
    }
}

class PractiseQ4 {
    public static void main(String[] args) {
        Car c = new Car(new Engine());
        c.startCar();
    }
}
