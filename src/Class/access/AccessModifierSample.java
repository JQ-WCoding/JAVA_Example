package Class.access;

public class AccessModifierSample {
    private String name;

    // 모든 클래스 참조 가능
    public String getName() {
        return this.name;
    }

    // 현재 클래스 내 및 같은 패키지 내에서 참조 가능
    protected void setName() {
        this.name = name;
    }

    // 현재 클래스와 같은 패키지 내에서 참조 가능
    void printName() {
        System.out.println( this.name );
    }
}
