
public class Loader
{
    public static Cat CreateNewCat(double weight)
    {
        Cat cat10 = new Cat(weight);
        return cat10;
    }

    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = CreateNewCat(3000.0);

        cat1.SetCatColor(CatColor.BLACK);
        System.out.println("Cat1 color is " + cat1.getCatColor());

        //System.out.println(CatColor.BLACK.getCatColor());
        cat2.SetCatColor(CatColor.GRAY);
        System.out.println("Cat2 color is " + cat2.getCatColor());

        cat3.SetCatColor(CatColor.MULTICOLOR);
        System.out.println("Cat3 color is " + cat3.getCatColor());
    }


}