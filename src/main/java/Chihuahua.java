public class Chihuahua extends Dog implements Domesticatable {

    public Chihuahua(String color){
        super(color);
    }

    @Override
    public String sound() {
        return "Tiny Woof";
    }

    @Override
    public int getPrice() {
        return 15;
    }
}
