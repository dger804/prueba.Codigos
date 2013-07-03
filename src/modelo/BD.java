/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class BD {
    
    public void escribir(String ruta, String cadena ){
        File bd = new File(ruta);
        try {
            FileWriter EscribirBD = new FileWriter(bd,true);
            BufferedWriter buffer = new BufferedWriter(EscribirBD);
            buffer.write(cadena);
            buffer.newLine();
            buffer.close();
        } catch (Exception e) {
        }
    }
    
    public String leer(String ruta){
        ArrayList array = new ArrayList();
        String linea = "";
        String retornar = "";
        File archivo = new File(ruta);
        try {
            FileReader leerArchivo = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(leerArchivo);
            while ((linea = buffer.readLine()) != null){
                retornar += linea + "\n";
            }
            buffer.close();
        }catch (Exception ex){
        }
    return retornar;
    } 
}
