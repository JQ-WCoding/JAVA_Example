package Class.innerclass;

// 외부 클래스
public class Outer {
    private String outerField = "outer";

    // 내부 클래스
    public class Inner {
        private String innerField = "inner";

        // 내부 메소드
        public String innerMethod() {
            // 외부 메소드 사용
            outerMethod();
            return outerField + innerField;
        }
    }
    // 외부 메소드
    public void outerMethod() {
        Inner inner = new Inner();

        System.out.println( inner.innerField );
        System.out.println( inner.innerMethod() );
    }

    // -> 순서는
}
