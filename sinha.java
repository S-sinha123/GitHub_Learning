interface Car {
    default void engine() {
        System.out.println("Vooo..oooo");
    }

    void music();

    void airBag();
}

class Mahindra implements Car {
    public void music(){
        System.out.println("Playing music in Mahindra");
    }
    public void airBag() {
        System.out.println("Airbag deployed in Mahindra");
    }
}

class sinha {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Mahindra mahindra = new Mahindra();
        mahindra.engine();
        mahindra.music();
        mahindra.airBag();
        System.out.println("This is a Mahindra car.");
    }
}