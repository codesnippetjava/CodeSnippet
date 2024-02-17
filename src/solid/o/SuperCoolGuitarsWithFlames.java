package solid.o;

public class SuperCoolGuitarsWithFlames extends Guitar{
    private String flameColor;

    public SuperCoolGuitarsWithFlames(String make,
                                      String model,
                                      int volume,
                                      String flameColor) {
        super(make, model, volume);
        this.flameColor=flameColor;
    }

    public String getFlameColor() {
        return flameColor;
    }

    public void setFlameColor(String flameColor) {
        this.flameColor = flameColor;
    }
}
