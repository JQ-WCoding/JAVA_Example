package Class.genericsClass;

import java.util.Arrays;
import java.util.List;

public class GenericsClass<T> {
    private T data;

    public GenericsClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public static <E> List<E> toList(E e) {
        return Arrays.asList( e );
    }
}
