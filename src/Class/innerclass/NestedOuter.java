package Class.innerclass;

public class NestedOuter {
    private String outerField = "outer";

    public static class Nested {
        private String nestedField = "nested";

        public String nestedMethod() {
            return nestedField;
        }
    }

    public void outerMethod() {
        Nested nested = new Nested();

        System.out.println( nested.nestedField );
        System.out.println( nested.nestedMethod() );
    }
}
