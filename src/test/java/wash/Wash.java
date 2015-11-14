package wash;

public interface Wash {
    void wash();

    default void washInfo() {
        System.out.println("this : "+this.getClass().getSimpleName());
    }
}
