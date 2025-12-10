import java.util.ArrayList;

public class Autor {
    private int id;
    private String nombre;
    private String apellidos;
    ArrayList<Libro> libros = new ArrayList<>();


    public Autor(int id, String nombre,String apellidos) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

}
