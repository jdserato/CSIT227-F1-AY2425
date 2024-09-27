package Sept26;

public class MagnetShroom extends Mushroom{
    public MagnetShroom() {
        super(100, DEFAULT_HP);
    }

    void absorb_metal(HasMetallic z) {
        z.takeMetal();
    }
}
