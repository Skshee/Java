class Animal1{
    void eat(){
        System.out.println("Eating");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
}

class Dog extends Animal1{
    void bark(){
        System.out.println("Barking");
    }
}


class Practiseq3 {
    public static void main(String[] args) {
        Animal1 dog = new Dog();
        dog.bark();
        dog.eat();

        if (dog instanceof Dog) {
            Dog myDog = (Dog)dog;
            myDog.
        }
    }
}
