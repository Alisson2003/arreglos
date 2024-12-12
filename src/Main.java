import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        personas[] personas = new personas[3];

        personas[0] = new personas("Carlos","Perez","Quito", 22);
        personas[1] = new personas("Nancy","Pulamarin","Cayambe", 40);
        personas[2] = new personas("Maria","Hidalgo","Latacunga", 66);

        //acceso individual
        System.out.println("La edad de " + personas[1].getNombre() + " es " + personas[1].getEdad());

        //acceso a todos
        for (int i = 0; i < personas.length; i++) {
            personas[i].imprimirDatos();
        }

        //para setear

        
        mascotas[] mascotas = new mascotas[3];

        mascotas[0] = new mascotas("Estrella","perro",4);
        mascotas[1] = new mascotas("Blu","Loro", 2);
        mascotas[2] = new mascotas("Michu","Gato", 4);
        
        for (int i = 0; i < mascotas.length; i++) {
            sc.nextLine();
            mascotas[i].cambiarValoresM();
            mascotas[i].mostrarMascotas();
        }

    }
}