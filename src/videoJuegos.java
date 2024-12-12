import java.util.Scanner;

public class videoJuegos {
    String nombre;
    String genero;
    String dificultad;

    public videoJuegos(String nombre, String genero, String dificultad) {
        this.nombre = nombre;
        this.genero = genero;
        this.dificultad = dificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public void imprimirJuegos() {
        System.out.println(" VIDEO jUEGOS ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Dificultad: " + dificultad);
    }

    public void cambiarValores() {

        Scanner sc = new Scanner(System.in);

        nombre = sc.nextLine();
        genero = sc.nextLine();
        dificultad = sc.nextLine();
    }
}
