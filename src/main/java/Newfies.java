public class Newfies extends Dog implements Domesticatable, Drivable{

    private int maxSpeed;

    public Newfies(String color){
        super(color);
        this.maxSpeed = 1;
    }

    @Override
    public String sound() {
        return "Bark";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 2;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed-=1;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + "Color is " + this.getColor() + " and the Max speed is " + this.maxSpeed;
    }
}
