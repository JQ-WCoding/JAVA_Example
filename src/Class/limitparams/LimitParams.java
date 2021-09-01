package Class.limitparams;

import java.io.OutputStream;
import java.io.Serializable;

public class LimitParams {

}

class FileStore<T extends OutputStream> {
    // &를 이용해서 파라미터의 수량을 제한 가능
    private <E extends Serializable & Comparable<E>> int compare(E data1, E data2) {
        return data1.compareTo( data2 );
    }
}
