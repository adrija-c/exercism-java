
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class PythagoreanTriplet {
    public final Integer a;
    public final int b;
    public final double c;

    public PythagoreanTriplet(Integer a, int b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triplets makeTripletsList() {
        return new Triplets();
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PythagoreanTriplet other)
            return this.hashCode() == other.hashCode();
        return false;
    }

}

class Triplets {
    private double num;
    private int limit = 0;

    public Triplets thatSumTo(double num) {
        this.num = num;
        return this;
    }

    public Triplets withFactorsLessThanOrEqualTo(int limit) {
        this.limit = limit;
        return this;
    }

    public List < PythagoreanTriplet > build() {
        int start = (int) Math.sqrt(num);
        if (limit == 0)
            limit = (int) num / 2;
        return IntStream.rangeClosed(start, limit).parallel().boxed()
            .flatMap(a -> IntStream.rangeClosed(a, limit).parallel()
                .filter(b -> {
                    var c = Math.sqrt(a * a + b * b);
                    return c % 1 == 0 && c <= limit && a + b + c == num;
                })
                .mapToObj(b -> new PythagoreanTriplet(a, b, Math.sqrt(a * a + b * b))))
            .toList();
    }
}

