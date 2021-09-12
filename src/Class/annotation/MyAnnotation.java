package Class.annotation;

import Class.limitparams.LimitParams;

import java.lang.annotation.Repeatable;

@interface Check {
    // 마커 어노테이션 -> 속성없이 표시만을 위한 어노테이션
}

@interface Checking{
    // 단일 값 어노테이션 -> value 속성이 정의되어 있음
    String value();
}

@interface Checked{
    // 풀 어노테이션
    String value();
    int id();
}

@Repeatable( LimitParams.class)
public @interface Schedule{
    // -> 메타 어노테이션을 사용해서 여러개 지정 가능
    String limitParam();
}