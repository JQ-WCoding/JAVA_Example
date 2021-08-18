package Base;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lamda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList( "JAVA", "Scala", "Groovy" );
        list.sort( new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        } );
        // 람다식으로 깔끔하게 사용 가능 -> 사용 이유 : 재사용이 필요없는 단일 메소드를 사용하고 싶을 때
        list.sort( (String s1, String s2) -> s1.length() - s2.length() );

        for ( String s : list ) {
            System.out.println( s );
        }

        list.forEach( System.out::println );
        list.forEach( s -> System.out.println( s ) );
    }
}
