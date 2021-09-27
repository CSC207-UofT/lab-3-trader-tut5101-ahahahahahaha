public abstract class Dog implements Tradable{

    private final String color;

    public Dog(String color){
        this.color = color;
    }

    public String getColor(){return this.color;}

    public int getPrice() {
        return 20;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " Color is" + this.color;
    }
}

