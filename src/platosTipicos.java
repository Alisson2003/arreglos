import java.util.Scanner;

public class platosTipicos {
    String nombre;
    double precio;
    String descripcion;

    public platosTipicos(String nombre, double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrarPlato(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Descripcion: " + descripcion);
    }

    public void cambiarValores() {

        Scanner sc = new Scanner(System.in);

        nombre = sc.nextLine();
        precio = sc.nextDouble();
        descripcion = sc.nextLine();
    }

}
