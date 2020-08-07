package InterfacesandADTs;

public interface MakesSound {

    String makeNoise();
}

class Cat implements MakesSound{
    public String makeNoise(){ //System.out.println("Meow");
        return "Meow";
    }
}
class Dog implements MakesSound{
    public String makeNoise(){
        //System.out.println("Hoof");
        return "Woof!";
    }
}
class Cow implements MakesSound{
    public String makeNoise(){
        //System.out.println("Moo");
        return "Moo!";
    }
}
