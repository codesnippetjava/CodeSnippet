package solid.d;

public class BuyComputerApp {
    public static void main(String[] args) {
        StandardKeyboard keyboard = new StandardKeyboard();
        keyboard.setBrand("HP");
        Monitor monitor = new Monitor();
        monitor.setBrand("Dell");
        AppleComputer computer =
                new AppleComputer(keyboard,monitor);
    }
}
