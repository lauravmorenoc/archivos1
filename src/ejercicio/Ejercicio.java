/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import java.io.*;
import java.util.*;
/**
 *
 * @author lamorenoca
 */
public class Ejercicio {
/*Gestion de archivos
Tipos
-Caracter:Es secuencial, necesita formato de archivo
-Binario:No importa el formato de archivo para almacenar información
Accesos:
-Secuencial: Se lee desde la posición 0,0
-Aleatorio: Se elige la posición desde la cual se lee el archivo
  agiliza la búsqueda de información

Se hace referencia con la clase File
Se lee con la clase Scanner

Rutas absolutas: Se pone toda la ruta del archivo, no es buena idea 
puesto que no todos los usuarios tienen el archivo en la misma carpeta
Rutas relativas: No necesita toda la información de la ruta del archivo de modo
que esta puede cambiar.*/
    
    public static void main(String[] args) throws FileNotFoundException {
        File directorio =new File("folder");
     //   File archivo2=new File("hamlet.txt");//Esta es la ruta relativa
        File archivo3=new File("other1.txt");
        /*puede ser archivo o directorio, cualquiera de los dos los lee
        Se puede usar el método list para retornar un array de string con los 
        nombres de los archivos contenidos en el directorio dado
        Se puede preguntar si lo dado es un directorio o un archivo
        El directorio o archivo se debe encontrar en la carpeta madre del proyecto,
        para asegurar que pueda leerse*/
        System.out.println("exists returns "+directorio.exists());/*retorna 
        falso si el archivo no ha sido creado*/
        System.out.println("canRead returns "+directorio.canRead());
        System.out.println("longitud archivo que no esta en carpeta raíz retorna: "
                           + archivo3.length());//a menos que especifique la carpeta
        //en la que esta el archivo, como en la linea 19
     //   System.out.println("lenght returns "+archivo2.length()); /*Solo retorna
        //la longitud del archivo (cantida de caracteres) si el archivo esta en la 
       // carpeta madre*/
        System.out.println();
        System.out.println("getAbsolutePath returns "+directorio.getAbsolutePath());
        System.out.println(directorio.isDirectory());
        if(directorio.isDirectory()){
            String lista[]=directorio.list();
            for(String nombre :lista){
                System.out.println(nombre);
            }
        }
        
        
        Scanner input=new Scanner(new File("hamlet.txt"));
        int count=0;
        String text[]=new String[10];
        
        while(input.hasNext()){
            text[count]=input.next();/*Este lee métodos de tipo String. Se puede leer el tipo de dato que uno quiera
            es decir, podría ser input.nextDouble(); input.nextInteger(); etc */
            count++;
        }
        System.out.println("total words = " + count);
        for (String text1 : text) {
            System.out.print(text1 + " ");
        }
    /*También se puede ler el archivo por lineas usando  input.hasNextLine();*/
        //Lo siguiente se realiza para escribir en un archivo de text:
        PrintStream output=new PrintStream(new File("hamlet.txt"));
        output.println("Texto sobreescrito");
        output.println();
        output.println("hola");
    }    
    }
    