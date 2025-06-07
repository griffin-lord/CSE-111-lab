
abstract class Car
{
    public abstract void drive(int speed);

    public void playMusic()
    {
        System.out.println("Playing the music..");
    }
}

abstract class Aesthetic extends Car
{
    public abstract void Color(String c);

    public void measureSize(int l,int m)
    {
        System.out.println("The size is " + l*m);
    }
}


class Audi extends Aesthetic
{
    @Override
    public void Color(String c) {
        System.out.println("It is " + c +" in color");
    }

    @Override
    public void drive(int s) {
        System.out.println("It is accelerating at " + s +"km/h");
    }
}

public class ABSTRACT {

    public static void main(String []args)
    {
       Audi au = new Audi();
       au.drive(3);
       au.Color("pink");
       au.playMusic();
       au.measureSize(4,5);
    }
}