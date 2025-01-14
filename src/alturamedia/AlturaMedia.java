/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alturamedia;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class AlturaMedia {

  
    public static void main(String[] args) throws Exception {
        
        
        
    BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

     //creamos el ArrayList que contendrá la altura de los alumnos
     ArrayList<Double> altura = new ArrayList<Double>();
     int N;
     double media;
     //obtenemos el número de alumnos de la clase
     N = numeroAlumnos(teclado);
     //leemos la altura de los N alumnos
     leerAlturas(altura, N,teclado);
     //calculamos la media
     media = calcularMedia(altura);
     //mostramos los resultados
     mostrarResultados(altura, media);
  }

  //Método para pedir por teclado el número de alumnos de la clase
  public static int numeroAlumnos(BufferedReader buff) throws Exception{
     
     int n;
     
           System.out.print("Introduce número de alumnos: ");
           n = Integer.parseInt(buff.readLine());
     
   
     return n;
  }

  //Este método recibe el ArrayList y el número de alumnos de la clase
  //Pide por teclado la altura de todos los alumnos y las guarda en el ArrayList
  public static void leerAlturas(ArrayList<Double> a, int n, BufferedReader buff) throws Exception
  {
     int i;
     double alto;
     for (i = 1; i <= n; i++) {
          
                System.out.print("Alumno " + i + " altura: ");
                alto = Double.parseDouble(buff.readLine());
          
          a.add(alto); //añade la altura al final del ArrayList
     }

 }

  //Este método recibe el ArrayList con todas las alturas
  //calcula y devuelve la media
  public static double calcularMedia(ArrayList<Double> a) {
     double media = 0;
     for (Double d : a) {
           media = media + d;
     }
     return media / a.size();
  }

  //Muestra la altura de todos los alumnos, la media y calcula y muestra
  //cuantos alumnos hay con altura superior a la media
  //y cuántos con altura inferior
  public static void mostrarResultados(ArrayList<Double> a, double media) {
     int superior = 0, inferior = 0;
     System.out.println("alturas introducidas: ");
     System.out.println(a);
     for (Double d : a) {
           if (d > media)
               superior++;
           else if (d < media)
                      inferior++;
     }
     System.out.printf("Media: %.2f %n", media);
     System.out.println("Hay " + superior + " alumnos más altos que la media");
     System.out.println("Hay " + inferior + " alumnos más bajos que la media");

        
        // TODO code application logic here
        // comentario adicional para visualizar cambio en repositorio GIT
    }
    
}
