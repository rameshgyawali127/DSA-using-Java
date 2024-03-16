class Vechicle {
    void displayVechicle() {
        System.out.println("I am in Base class!");
    }
}

class Tata extends Vechicle {
    void display() {
        System.out.println("I am in child class !!");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Vechicle nw = new Tata();
        nw.displayVechicle();
        nw.displayVechicle();
        Tata na = new Tata();
        n.display();

    }
}

