import java.util.Scanner;

public class mascotas {
    String nombre;
    String raza;
    int num_patas;

    public mascotas() {

    }

    public mascotas(String nombre,String raza, int num_patas) {
        setNombre(nombre);
        setRaza(raza);
        setNum_patas(num_patas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNum_patas() {
        return num_patas;
    }

    public void setNum_patas(int num_patas) {
        this.num_patas = num_patas;
    }

    public void mostrarMascotas(){
        System.out.println("--- Caracteristicas de las mascotas ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Num patas: " + num_patas);
    }

    public void cambiarValoresM() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();

        System.out.println("Ingrese la raza: ");
        String raza = sc.nextLine();

        System.out.println("Ingrese el numero de patas: ");
        num_patas = sc.nextInt();
    }
}
