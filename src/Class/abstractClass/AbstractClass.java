package Class.abstractClass;

public abstract class AbstractClass {
    public abstract int calculate(int value1, int value2);

    public void execute() {
        System.out.println( calculate( 10, 20 ) );
    }
}


class SubClass extends AbstractClass {
    @Override
    public int calculate(int value1, int value2) {
        return value1 + value2;
    }

}


class acting {
    public static void main(String[] args) {
        AbstractClass instance = new SubClass();

        instance.execute();
    }
}