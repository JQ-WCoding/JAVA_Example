package Base;

import java.security.SecureRandom;
import java.util.Random;

public class Random_sample {
    public static void main(String[] args) {
        // 일반적인 난수를 생성하는 방법 -> 하지만 시드값 (시간을 이용) 하기 때문에 추리가 가능하다
        double random = Math.random();

        // 좀 더 보안적으로 사용하고 싶은 경우
        Random random2 = new SecureRandom();
        // 정수로 변환
        int value = random2.nextInt();
    }
}
