package Optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {
    public static void main(String[] args) {
        System.out.println("*** VALOR INTEIRO OPCIONAL ***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("*** VALOR DECIMAL OPCIONAL ***");
        OptionalDouble.of(12.1).ifPresent(System.out::println);

        System.out.println("*** VALOR LONGO OPCIONAL ***");
        OptionalLong.of(12).ifPresent(System.out::println);


    }
}
