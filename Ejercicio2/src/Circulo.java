public class Circulo extends FiguraGeometrica{

    private final double dPi = 3.14;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    private double radio;


    @Override
    public double area() {

       return getRadio()*getRadio()*dPi;
    }
}
