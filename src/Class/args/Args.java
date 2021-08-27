package Class.args;

public class Args {
    public static void main(String[] args) {
        method();

        method( "a" );
        // 인수 여러개 사용가능
        method( "a", "b" );
    }

    // 인수가 여러개이면 ...으로 사용한다
    static void method(String... args) {
        for ( String arg : args ) {
            System.out.println( arg );
        }
    }
}
