public class SampleProgram {

    public static void main(String[] args) {

        WhiteShirt whiteShirtObject = new WhiteShirt();

        BlueShirt blueShirtObject = new BlueShirt();

        Uniform uniformObject = new Uniform();

        uniformObject.todaysDressCode(whiteShirtObject);
        uniformObject.todaysDressCode(blueShirtObject);

    }

}

abstract class Shirt {
    public abstract String color();
}

class WhiteShirt extends Shirt {

    public String color() {

        return "White";

    }
}

class BlueShirt extends Shirt {

    public String color() {

        return "Blue";

    }
}

class Uniform {
    public void todaysDressCode(Shirt s) {
        System.out.println(s.color());
    }
}