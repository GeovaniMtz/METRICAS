        /**
 *  Programa que permitirá realizar
 *  operaciones con puntos en la forma P = (x,y)
 *
 *  NOTA: DEBEN IMPLEMENTAR LOS MÉTODOS
 *
 *  Curso: Matemáticas para ciencias Aplicadas
 *
 *  Temas:  Función distancia, producto punto y
 *          su aplicación para obtener el área
 *
 *  @author Roberto Méndez Méndez
 *  @version  22-Septiembre-22
 */


package Funciones.Metricas1;    

public class OperacionesConPuntos2D {


    public static double norma(Punto2D p) {
        double norma = metricaEuclidiana(new Punto2D(),p);
        return norma;
    }


    public static double metricaEuclidiana(Punto2D a, Punto2D b) {
        double resultado = Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
        return resultado;
    }


    public static double metricaTaxista(Punto2D a, Punto2D b) {
        double metrica = Math.abs(b.getX()-a.getX())+Math.abs(b.getY()-a.getY());
        return metrica;
    }


    public static double dotProduct(Punto2D a, Punto2D b) {
        double dotP = (b.getX()*a.getX())+(a.getY()*b.getY());
        return dotP;
    }


    public static double area(Punto2D a, Punto2D b) {
        Punto2D per = new Punto2D((-1*a.getY()),a.getX());
    Double ar = dotProduct(per,b);
    return ar;  
    }
}
