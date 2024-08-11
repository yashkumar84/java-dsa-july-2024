class A{
    A(){

    }

    public void show(){
        System.out.println("This is Class A");
    }

    public void printA(){
        System.out.println("This is the PrintA");
    }
}


class B extends A{
    public void show(){
        super.show();
        System.out.println("This is the Class B");
    }

    public void printB(){
        System.out.println("THis is The printB function ");
    }
}

class C extends B{
    C(){
        super();
    }
   

    @Override
    public void show(){
        super.show();
        System.out.println("This is the Class C");
    }




}


public class InheritanceDemo {
    public static void main(String[] args) {
        
        C obj = new C();
        obj.show();
        obj.printB();
        obj.printA();
        
    }
    
}
