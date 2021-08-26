package Class.comparator;

import java.util.Comparator;

public class ComparatorSample {
    // 익명 클래스 -> 추상 클래스와 인터페이스의 구현을 할 때 처리가 간단하고 앞으로 재사용할 가능성이 없는 일회성 처리 경우 사용
    Comparator<String> comparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return 0;
        }
    };
}
