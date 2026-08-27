import java.util.function.BinaryOperator;

public class Oppg1b {

    public static void main(String[] args) {

        int sum = beregn(12, 13, (a, b) -> a + b);
        System.out.println(sum);

        int storst = beregn(-5, 3, Math::max);
        System.out.println(storst);

        int diff = beregn(54, 45, (a, b) -> Math.abs(a - b));
        System.out.println(diff);

    }

    public static int beregn(int a, int b, BinaryOperator<Integer> op){
        return op.apply(a,b);
    }
}
