public class Triangulo extends FiguraGeometrica{

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double base;
    private double altura;


    @Override
    public double area() {
        double dArea = 0;

        dArea = getBase() * getAltura() / 2;

        return dArea;
    }
}
