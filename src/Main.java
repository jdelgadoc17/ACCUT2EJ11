/*Ejercicio 1 - Deportistas
Implementa la clase Deportista para gestionar la sección de deportes de un club social. Los
atributos serán el DNI, el nombre, la fecha de nacimiento y el deporte que practica
(enumerado), que deberá ser uno de los que ofrece el club: natación, remo, vela y
waterpolo. Escribe una aplicación que gestione los datos de los deportistas, utilizando una
estructura de datos cuya longitud deberá ajustarse con las altas y bajas, y un menú que
incluya las opciones:
1. Alta.
2. Baja.
3. Modificación de datos (todos los atributos salvo el DNI, que es inalterable);
4. Listar por orden alfabético de nombres
5. Listar por orden de edad.
6. Salir.
Los datos se guardarán en un archivo binario, de donde se leerán al arrancar la aplicación y
volverán a grabarse actualizados al salir.
*/

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static int pedOpc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una opcion");
        int opc = sc.nextInt();
        return opc;
    }

    public static Deportista alta(){
        Deportista dep = new Deportista();
        return dep;
    }

    public static void addDeportista(ArrayList<Deportista> lista_dep, Path pathdado){
        try{
            OutputStream is = Files.newOutputStream(pathdado);
            ObjectOutputStream oos = new ObjectOutputStream(is);

            Deportista dep = alta();
            lista_dep.add(dep);
            oos.writeObject(lista_dep);




        } catch (IOException e) {
            System.out.println("Error: "+e.getLocalizedMessage());
        }



    }




    public static void main(String[] args) {

        ArrayList<Deportista> lista_dep = new ArrayList<>();
        Path pathdado = Paths.get("Res/data.bin");

        int opc = pedOpc();

        do{

            opc=pedOpc();

            switch (opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;

            }

        }while (opc!=6);




    }
}