package Sept26;

public class MagnetShroom extends Mushroom{
    public MagnetShroom() {
        super(100, DEFAULT_HP, 10);
    }

    void absorb_metal(HasMetallic z) {
        z.takeMetal();
    }
}
