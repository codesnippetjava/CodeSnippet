package solid.o;

public class GuitarApplication {
    public static void main(String[] args) {
        Guitar guitar =
                new Guitar("Maker",
                        "Model",
                        10);
        SuperCoolGuitarsWithFlames guitarsWithFlames
                = new SuperCoolGuitarsWithFlames("Maker",
                "Model",
                10,"yellowFlames");
        System.out.println(guitar.getMake());
        System.out.println(guitarsWithFlames.getFlameColor());
    }
}
