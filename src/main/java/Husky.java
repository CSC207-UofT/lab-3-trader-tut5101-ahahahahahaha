public class Husky implements Drivable, Domesticatable, Tradable {
    int maxSpeed;
    String sound;
    int price;

    public Husky(int maxSpeed, int price){
        this.maxSpeed = maxSpeed;
        this.sound = "Husky Husky Husky, woooohoooooo!!!!";
        this.price = price;
    }

    public Husky(){
        this.maxSpeed = 99;
        this.sound = "Husky Husky Husky, woooohoooooo!!!!";
        this.price = 999999;
    }

    /**
     * Upgrade your husky's speed by 10.
     */
    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 10;
    }

    /**
     * Downgrade your husky's speed by10.
     */
    @Override
    public void downgradeSpeed(){
        this.maxSpeed -= 10;

    }


    /**
     * FLAWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW
     * @return max speed
     */
    @Override
    public int getMaxSpeed(){
        return this.maxSpeed - 1000000;
    }

    /**
     * @return sound of the husky
     */

    @Override
    public String sound() {
        return this.sound;
    }

    /**
     * @return husky's price
     */
    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")" + " (Price: " + this.getPrice() +")";
    }
}
