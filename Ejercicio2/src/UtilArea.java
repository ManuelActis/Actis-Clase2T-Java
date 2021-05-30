import java.util.concurrent.RecursiveAction;

public class UtilArea {

    public static  double areaPromedio (FiguraGeometrica arr[]){
        double dAreaPromedio = 0;

        //Recorro todas las figuras geometricas del vector
        for(FiguraGeometrica x: arr)
        {
            //En cada figura tomo su nombre y los comparo con las clases para hacer uso de su metodo area
            if(x.getClass().getSimpleName()=="Triangulo")
            {
                Triangulo t = new Triangulo();
                dAreaPromedio += t.area();

            }

            else
            {
                if(x.getClass().getSimpleName()=="Circulo")
                {
                    Circulo t = new Circulo();
                    dAreaPromedio += t.area();
                }

                else
                {
                    if(x.getClass().getSimpleName()=="Rectangulo")
                    {
                        Rectangulo t = new Rectangulo();
                        dAreaPromedio += t.area();

                    }
                }
            }



            //divide el acumulador total por la cantidad de elementos del array
            dAreaPromedio = dAreaPromedio / arr.length;
        }


        return dAreaPromedio;
    }



}
