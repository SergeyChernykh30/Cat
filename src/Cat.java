
public class Cat
{
    private final double ORIGIN_WEIGHT;
    private double weight;

    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;
    private static final int EYE_COUNT = 2;
    private static int count;
    private CatColor catColor;
    private String name;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        ORIGIN_WEIGHT = weight;
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
        return weight - ORIGIN_WEIGHT;
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

    public void fullCopyCat(Cat catForCopy)
    {
        Cat copyCat = new Cat();

        this.setORIGIN_WEIGHT(catForCopy.getORIGIN_WEIGHT());
        this.setWeight(catForCopy.getWeight());
        this.setName(catForCopy.getName());
        this.setCatColor(catForCopy.getCatColor());

        //return copyCat;
    }

    public void setCatColor(CatColor catColor) {this.catColor =  catColor;}
    /*public void SetCatColor(CatColor setCatColor)
    {
        this.catColor =  setCatColor;
    }*/

    public static int getCount()
    {
        return count;
    }

    public Double getWeight()
    {
        return weight;
    }
    
    public void setWeight(Double setWeight)
    {
        this.weight = setWeight;
    }

    public Double getORIGIN_WEIGHT()
    {
        return ORIGIN_WEIGHT;
    }

    public void setORIGIN_WEIGHT(Double setOriginWeight)
    {
        this.weight = setOriginWeight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            return "Exploded";
        }
        else if(weight > ORIGIN_WEIGHT) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public CatColor getCatColor()
    {
        return catColor;
    }

    public void SetCatColor(CatColor setCatColor)
    {
        this.catColor =  setCatColor;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String setName)
    {
        this.name = setName;
    }
}