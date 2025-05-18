interface Computer {
    void compile();
}

class PC implements Computer{  // PC, laptop is being used in the other file
    public void compile(){
        System.out.println("Compiling in Laptop...");
    }
}

class Desktop implements Computer{
    public void compile(){
        System.out.println("Compiling in Desktop...");
    }
}

class Developer{  //Developer, Programmer is being used in the other file
    public void code(Computer com){
        System.out.println("Coding...");
        com.compile();
    }
}

public class LooseCoupling {
    public static void main(String[] args) {
        Computer pc = new PC();
        Computer desktop = new Desktop();
        Developer developer = new Developer();
        developer.code(pc);
        developer.code(desktop);
        //an Analogy of this whole case, can be a developer saying he will still work while provided a computer, either pc or desktop or a new system
    }
}
