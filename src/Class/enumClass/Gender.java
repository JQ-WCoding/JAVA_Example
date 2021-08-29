package Class.enumClass;

public enum Gender {
    MAN, WOMAN
}

// enum을 통해 클래스의 형태를 알아볼 수 있다 -> 열거형
class GenderClass {
    public void compare(Gender gender) {
        switch ( gender ) {
            case MAN -> System.out.println( "MAN" );
            case WOMAN -> System.out.println( "WOMAN" );
        }
    }
}