public class Pig implements Domesticatable, Tradable {

    public Pig() {
    }

    @Override
    public String sound() {
        return "Oink!";
    }

    @Override
    public int getPrice() {
        return 5;
    }

    // hello

    @Override
    public String toString(){
        String id = super.toString();
        return id;
    }
}
