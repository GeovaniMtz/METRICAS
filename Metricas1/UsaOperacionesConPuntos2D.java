/**
 *  Programa que muestra el uso de las clases
 *  Punto2D y OperacionesConPuntos2D
 *
 *  Actividad a realizar:
 *  1.- Pedir los datos en enorno gráfico
 *  2.- Probar los métodos de OperacionesConPuntos2D
 *
 *   @version 22/Sep/22
 */

package Funciones.Metricas1;
import javax.swing.JOptionPane;

public class UsaOperacionesConPuntos2D {

    public static void main(String... something){
        double X1= Double.parseDouble(JOptionPane.showInputDialog("Dame el valor de X1: "));
        double Y1= Double.parseDouble(JOptionPane.showInputDialog("Dame el valor de Y1: "));
        double X2= Double.parseDouble(JOptionPane.showInputDialog("Dame el valor de X2: "));
        double Y2= Double.parseDouble(JOptionPane.showInputDialog("Dame el valor de Y2: "));
        Punto2D a = new Punto2D(X1,Y1);
        Punto2D b = new Punto2D(X2,Y2);
        double norma = OperacionesConPuntos2D.norma(a);
        double resultado = OperacionesConPuntos2D.metricaEuclidiana(a,b);
        double metrica = OperacionesConPuntos2D.metricaTaxista(a,b);
        double dotP = OperacionesConPuntos2D.dotProduct(a,b);
        double ar = OperacionesConPuntos2D.area(a,b);
        System.out.println("La norma de " + a + " es : " + norma);
        System.out.println("La Metirca Euclidiana de " +a +","+b  + " es : " + resultado);
        System.out.println("La Métrica Taxista de " +a + ","+b +" es: "+metrica);
        System.out.println("El dotProduct de "+a+","+b+ " es: "+ dotP);
        System.out.println("El area de "+a+","+b+ " es: "+ ar);



    }
}
