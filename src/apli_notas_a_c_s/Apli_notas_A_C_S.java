/*Dadas 6 notas, escribir la cantidad de estudiantes aprobados (A), 
 cantidad condicionado (C) y la cantidad de suspendidos (S). A >=5; C=4 y S <4.
 n=nota; x=número de veces que se repite nota
 b=aprobados,  z=condicionados, r=reprobados*/
package apli_notas_a_c_s;

import javax.swing.JOptionPane;

public class Apli_notas_A_C_S {

    public static void main(String[] args) {
        //Declarar variables
        float n;
        int aprobado=0, condicionado=0, suspendido=0;

        //Bucle for para pedir hasta 6 notas
        for (int x = 1; x <= 6; x++) {

            //Las notas deben estar entre 0 - 10
            do {
                n = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota entre 0 a 10:"));
            } while (n < 0 || n > 10);
            
            if (n == 4) {//Si nota es igual a 4
                condicionado++;
             } 
            else if (n >= 5) {//Si nota es mayor o igual a 5
                aprobado++;
            }    
            //En caso contrario que no sea igual a 4 ni mayor o igual a 5    
                else { 
                suspendido++;//Entonces sume las demás notas
             }
            
            }//Terminar el bucle, porque si no, salen mensajes cada vez que digita un número
        JOptionPane.showMessageDialog (null, 
                    "\nEstudiantes aprobados:\n" +aprobado+
                    "\nEstudiantes condicionados:\n" +condicionado+
                    "\nEstudiantes suspendidos:\n" +suspendido); 
        }
    }