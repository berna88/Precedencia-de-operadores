/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precedencia.de.operadores;

/**
 *
 * @author berni
 */
public class PrecedenciaDeOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Primer Ejemplo de procedencia de operadores");
        int x = 5;
        int y = 10;
        int z = ++x * y--;
        
        message("x = " + x);
        message("y = " + y);
        message("z = " + z);
        message("Ejemplo Evaluacion");
        message(""+4 + 5 * 6 / 3);
        message(""+(4+5) * (6/3));
        message("Otro Ejemplo de evaluacion");
        System.out.println(1+2-3*4/5);
        System.out.println((1+2) - (3*(4/5)));
        message("\n Otro ejemplo");
        // Si detecta una cadena los demas seran cadenas
        message("1 + 2 = "+ 1 + 2);
        // Los parentesis rompen la regla ya que tiene mayor prioridad
        message("(1 + 2) = "+ (1 + 2));
        message("\n Otro ejemplo");
        //El operador + es asociativo a la izquierda
        message(1+2+"abc");// detecta una operacion primero
        message("abc"+1+2);// Detecta una cadena primero
               
    }
    
    public static void message(String message){
        System.out.println(message);
    }
    
}
