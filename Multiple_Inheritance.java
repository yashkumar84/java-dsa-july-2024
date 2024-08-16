interface CNG_Car {
    // Abstract methods
    void drive();

    void cng_kit();
}

interface Petrol_Car {
    // Abstract methods
    void drive();

    void petrol_kit();
}

class Hybrid_Car implements Petrol_Car, CNG_Car {
    public void drive() {
        System.out.println("Driving a hybrid Car");
    }

    public void cng_kit() {
        System.out.println("Using the Cng kit for hybrid car");
    }

    public void petrol_kit() {
        System.out.println("Using the petrol kit for hybrid Car");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        Hybrid_Car obj = new Hybrid_Car();

        obj.drive();
        obj.cng_kit();
        obj.petrol_kit();
    }
}
