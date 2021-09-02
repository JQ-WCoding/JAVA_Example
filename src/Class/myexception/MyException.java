package Class.myexception;

import java.util.List;

public class MyException extends Exception {
    @Override
    public String toString() {
        return "error";
    }

    // 권장하지 않는 메소드
    @Deprecated
    public String getMessage() {
        return "not recommended method";
    }

    // 강제 문구 출력
    @SuppressWarnings ( "rawtypes" )
    public List getMessageList() {
        return null;
    }

}
