package Base;

import java.text.NumberFormat;
import java.util.Locale;

public class Math_sample {
    public static void main(String[] args) {
        // abs 절대값
        int result = Math.abs( -12 );
        System.out.println( result );

        // sin, cos, tan 삼각함수 계산도 가능
        double result1 = Math.cos( 45 );
        System.out.println( result1 );

        result1 = Math.sin( 30 );
        System.out.println( result1 );

        result1 = Math.tan( 70 );
        System.out.println( result1 );

        // 제곱 계산 방법
        result1 = Math.pow( 3, 2 );
        System.out.println( result1 );

        // 원환로 변경
        String result2 = NumberFormat.getCurrencyInstance().format( 100000 );
        System.out.println( result2 );

        // 퍼센트로 변경
        String result3 = NumberFormat.getPercentInstance().format( 0.8 );
        System.out.println( result3 );

        // 외화로 변경할때 (파운드로 하기)
        Locale locale = Locale.UK;
        String result4 = NumberFormat.getCurrencyInstance( locale ).format( 100000 );
        System.out.println( result4 );
    }
}
