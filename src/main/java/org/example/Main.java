import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CarWithLombok {
    private String model, brand, color;
    private int year, price, quantity;
}

class CarDemoWithLombok {
    public static void main(String[] args) {
        CarWithLombok CarWithLombok1 = new CarWithLombok("Mustang", "Ford", "black", 2025, 900_000, 10);
        CarWithLombok CarWithLombok2 = new CarWithLombok("Sierra", "NotFord", "white", 1997, 300_000, 2);
        System.out.println(CarWithLombok1);
        System.out.println(CarWithLombok2);
        System.out.println(CarWithLombok1.getColor());
        int year = CarWithLombok1.getYear();
        CarWithLombok1.setColor("green");
        System.out.println("Are these objects equal?" + CarWithLombok1.equals(CarWithLombok2));
        System.out.println("The HashCode of this object is: " + CarWithLombok2.hashCode());
        System.out.println("The HashCode of this object is: " + CarWithLombok1.hashCode());
    }
}