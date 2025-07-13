import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

interface Car {
    default void engine() {
        System.out.println("Vooo..oooo");
    }

    void music();

    void airBag();
}

class Mahindra implements Car {
    public void music() {
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
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Predicate<Integer>p = new Predicate<Integer>() {
        //     public boolean test(Integer num) {
        //         if(num % 2 == 0){
        //             return true;
        //         }
        //         else{
        //             return false;
        //         }
        //     }
            
        // };
        // Function<Integer,Integer>f = new Function<Integer,Integer>() {
        //     public Integer apply(Integer num){
        //         return num*2;
        //     }
        // };
        // Consumer<Integer>c = new Consumer<Integer>() {
        //     public void accept(Integer num){
        //         System.out.println(num);
        //     }
        // };
        array.stream().filter(p->p%2==0).map(f->f*2).forEach(n->System.out.println(n));
        System.out.println("Sinha is a Java developer.");
    }
}