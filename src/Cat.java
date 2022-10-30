
public class Cat
{
    private double originWeight;
    private double weight;

    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;
    private static final int EYE_COUNT = 2;
    private static int count;
    private String catColor;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count += 1;
    }

    public Cat(double weight)
    {
        this();
        this.weight = weight;
    }

    public void meow()
    {
        weight = weight - 1;
        if(weight < MIN_WEIGHT) {
            count -= 1;
        }
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;

        if(weight > MAX_WEIGHT) {
        count -= 1;
        }
    }

    public Double getFeedAmount()
    {
        return weight - originWeight;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public void toilet()
    {
        weight = weight - 10;
        System.out.println("Cat is go to toilet :)");
    }

    public static int getCount()
    {
        return count;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public String getCatColor()
    {
        return catColor;
    }

    public void SetCatColor(CatColor setCatColor)
    {
        catColor =  setCatColor.name();
    }
}