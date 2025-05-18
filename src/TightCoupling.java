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
        programmer.code(laptop);
    }
}