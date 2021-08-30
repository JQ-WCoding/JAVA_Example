package Class.enumClass;


interface Color {
    public String getColor();
}

public enum Sex implements Color {
    // 각 구분마다 오버라이딩한 메소드를 재정의 해주어야한다....
    MAN {
        @Override
        public String getColor() {
            return "Blue";
        }
    },
    WOMAN {
        @Override
        public String getColor() {
            return "Red";
        }
    };
}
