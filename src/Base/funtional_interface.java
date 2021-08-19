package Base;

public class funtional_interface {
    @FunctionalInterface
    public interface TriFunction {
        public int apply(int a, int b, int c);
    }
    // 위의 메소드를 람다식으로 변경할 경우
    public static void main(String[] args) {
        TriFunction function = (a, b, c) -> a + b + c;
    }
}
