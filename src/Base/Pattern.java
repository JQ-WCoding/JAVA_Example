package Base;

import java.util.regex.Matcher;

public class Pattern {
    public static void main(String[] args) {
        // 정규식
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile( ".*many.*" );

        Matcher matcher = pattern.matcher( "Java has many many many Recipes" );

        boolean result = matcher.matches();

        System.out.println( result );

        // matcher 에는 reset 을 통해 다시 초기화 시켜야할 필요가 있음
        matcher.reset();

        // 반복문을 통한 정규표현 찾기
        pattern = java.util.regex.Pattern.compile( "Recipe." );

        matcher = pattern.matcher( "Java Recipe has may Recipes!!" );

        while ( matcher.find() ) {
            // 정규표현에 일치된 문자열을 group 에 초기화
            String group = matcher.group();
            System.out.println( group );
        }

        String replaceString = "레시피";

        String result1 = matcher.replaceFirst( replaceString );
        System.out.println( result1 );

        matcher.reset();

        String result2 = matcher.replaceAll( replaceString );
        System.out.println( result2 );

        matcher.reset();

        StringBuffer replacedString = new StringBuffer();

        while ( matcher.find() ) {
            matcher.appendReplacement( replacedString, replaceString );

            StringBuffer result3 = matcher.appendTail( replacedString );
            System.out.println( result3 );
        }
    }
}
