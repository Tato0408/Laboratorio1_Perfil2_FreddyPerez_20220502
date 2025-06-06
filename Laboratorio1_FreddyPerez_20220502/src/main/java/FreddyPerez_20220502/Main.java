package FreddyPerez_20220502;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.MissingResourceException;
import java.util.Scanner;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean respuestaMain;
        Estudiantes objEStudiantes = new Estudiantes(1, "Freddy", " 17", 8.0);
        TreeMap<Integer, Estudiantes> listaEstudiantes = new TreeMap<>();
        listaEstudiantes.put(1, new Estudiantes(1, "Freddy", "17", 8.0));
        listaEstudiantes.put(2, new Estudiantes(2, "Camila Mariana", "17", 10));
        listaEstudiantes.put(3, new Estudiantes(3, "Juan Pablo", "17", 9.0));
        do {
            System.out.println("Sistema de Getsión de Estdiantes");
            System.out.println("Que acción desea proceder?");
            System.out.println("1. Agregar un estudiante");
            System.out.println("2. Ver la informacion de un estudiante");
            System.out.println("3. Actualizar la informacion de un estudiante");
            System.out.println("4. Eliminar un estudiante");
            System.out.println("5. Buscar un estudiante");
            int respuesta = sc.nextInt();
            switch(respuesta){
                case 1:
                    System.out.println("Ingrese los datos del nuevo estudiante");
                    System.out.println("Id del estudiante: ");
                    int idEstudiante = sc.nextInt();
                    System.out.println("Nombre del Estudiante");
                    String nombreEstudiante = sc.next();
                    System.out.println("Edad del estudiante");
                    String edadEstudiante = sc.next();
                    System.out.println("Promedio del estudinte");
                    double promedioEstudiante = sc.nextDouble();
                    listaEstudiantes.put(idEstudiante, new Estudiantes(idEstudiante, nombreEstudiante, edadEstudiante, promedioEstudiante));
                    System.out.println("Estudiante Agregado");
                    respuestaMain = true;
                    break;
                case 2:
                    System.out.println("Todos los estudiantes: ");
                    for (Map.Entry <Integer, Estudiantes> entrada : listaEstudiantes.entrySet()){
                        System.out.println("Clave: "+ entrada.getKey() + " Estudiantes" + entrada.getValue());
                    }
                    respuestaMain = true;
                    break;
                case 3:
                    System.out.println(" Ingrese el estudiante que quiere actualizar por medio de su clave y los datos del estudiante: ");
                    System.out.println("Clave: ");
                    int clave = sc.nextInt();
                    System.out.println("Datos del estudiante :");
                    System.out.println("Id: ");
                    int cambioiD = sc.nextInt();
                    System.out.println(" Nombre: ");
                    String cambioNombre = sc.next();
                    System.out.println(" Edad: ");
                    String cambioEdad = sc.next();
                    System.out.println(" Promedio: ");
                    double cambioPromedio = sc.nextDouble();
                    listaEstudiantes.replace(clave,new Estudiantes(cambioiD, cambioNombre, cambioEdad, cambioPromedio));
                    System.out.println("Datos Cambiados");
                    respuestaMain = true;
                    break;
                case 4:
                    System.out.println("Ingrese la Clave del estudiante que desea eliminar: ");
                    int eliminarEstudiante = sc.nextInt();
                    listaEstudiantes.remove(eliminarEstudiante);
                    System.out.println("Estudiante Eliminado");
                    break;
                case 5:
                    System.out.println("Ingrese la clave del estudiante quedesea buscar: ");
                    int buscarPorClave = sc.nextInt();
                    System.out.println(listaEstudiantes.containsKey(buscarPorClave));
                    break;
                default:
                    System.out.println("El valor ingresado es incorrecto");
                    break;

        }
    }
        while(respuestaMain = true);
}
}
