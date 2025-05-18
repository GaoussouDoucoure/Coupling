class Laptop {
    public void compile(){
        System.out.println("Compiling...");
    }
}

class Programmer {
    public void code(Laptop lap) {
        System.out.println("Coding...");
        lap.compile();
    }
}

public class TightCoupling {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Programmer programmer = new Programmer();
        programmer.code(laptop); //the argument being passed has to specifically be the object created using Laptop class
        // because that has been used as Parameter for Programmer class, hence why it is tight coupling
        // an Analogy of this whole case, can be a developer wanting to specifically only working using a laptop and nothing else
    }
}