package Base;

public class String_equals {
    public static void main(String[] args) {
        String source = "Hello";

        // 문자열의 대소문자도 비교한다
        boolean result1 = source.equals( "Hello" );

        // 문자열의 대소문자를 무시하고 비교한다
        boolean result2 = source.equalsIgnoreCase( "hello" );

        // == 은 사용하지 않는 습관 들이기
    }
}
