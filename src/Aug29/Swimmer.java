package Aug29;

public interface Swimmer extends Breather {
    void swim();

    @Override
    default void breathe() {
        System.out.println("using gills maybe");
    }
}
