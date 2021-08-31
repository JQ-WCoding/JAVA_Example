package Class.enumClass;

import java.util.EnumMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        EnumMap<Sex, Integer> map = new EnumMap<Sex, Integer>( Sex.class );

        map.put( Sex.WOMAN, 1 );
        map.put( Sex.MAN, 2 );

        // 너무 고수다.... 이해하기 힘들어서 몇번 보는중
        for ( Map.Entry<Sex, Integer> entry : map.entrySet() ) {
            System.out.println( entry.getKey() + ":" + entry.getValue() );
        }
    }
}
