
public class Loader
{
    public static Cat createNewCat(double weight)
    {
        return new Cat(weight);
    }



    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = createNewCat(3000.0);
        //Cat cat4 = new Cat();

        cat1.setCatColor(CatColor.BLACK);
        System.out.println("Cat1 color is " + cat1.getCatColor());

        cat2.setCatColor(CatColor.GRAY);
        System.out.println("Cat2 color is " + cat2.getCatColor());

        cat3.setCatColor(CatColor.MULTICOLOR);
        System.out.println("Cat3 color is " + cat3.getCatColor());

        cat1.setName("Myrka");

        Cat cat4 = cat1.makeDeepCopy();
        assert cat1 != cat4; //проверяет что это не один и тот же объект
        assert cat1.equals(cat4); //проверяет что объекты одинаковые

        System.out.println("Cat1 weight is " + cat1.getWeight());
        System.out.println("Cat4 weight is " + cat4.getWeight());
        System.out.println("Cat1 name is " + cat1.getName());
        System.out.println("Cat4 name is " + cat4.getName());
        System.out.println("Cat4 color is " + cat4.getCatColor());

        System.out.println(cat1);
        System.out.println(cat4);
    }


}