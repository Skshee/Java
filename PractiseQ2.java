interface Flyable{
    void performfly();
}

interface Swimmable{
    void performswim();
}

class Duck implements Flyable,Swimmable{
    @Override
    public void performfly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void performswim() {
        System.out.println("Duck is Swimming");
    }
}


class PractiseQ2 {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.performfly();
        d.performswim();
    }
}
