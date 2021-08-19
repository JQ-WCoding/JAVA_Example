package Base;

public class AddString {
    public static void main(String[] args) {
        // 비효율적인 문자열 처리 방법
        String str = "";
        for ( long i = 0; i < Long.MAX_VALUE; i++ ) {
            str += str + "";
        }

        // StringBuilder 와 append 를 사용하여 문자열을 연결하는 것이 더욱 효율적이다
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append( "Hello" );
        stringBuilder.append( "World!" );

        String str2 = stringBuilder.toString();
    }
}
