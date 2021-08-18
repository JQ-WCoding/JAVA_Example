package Base;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Optional {
    public static void main(String[] args) throws Exception {
        String value = "hi";
        java.util.Optional<String> optional = java.util.Optional.of( value );

        // Optional 을 이용한 람다식 사용
        String getValue = optional.orElseGet( () -> {
            return new SimpleDateFormat( "yyyyMMddHHmmSS" ).format( new Date() );
        } );

        String getValue2 = optional.orElseThrow( () -> new Exception( "값이 없습니다" ) );
    }
}
