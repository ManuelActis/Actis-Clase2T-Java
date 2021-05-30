public class Rectangulo extends FiguraGeometrica{

    private double base;

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

    private double altura;



    @Override
    public double area() {
        double dArea = 0;

        dArea = getAltura()*getBase();

        return dArea;
    }
}
