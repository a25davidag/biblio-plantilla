import java.time.LocalDate;

public abstract class Item {
    private String titulo;
    private int año;
    private Genero genero;

    public Item(String titulo, Genero genero, int año) {
        this.titulo = titulo;
        this.genero = genero;
        setAño(año);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if (año < LocalDate.now().getDayOfYear()) {
            this.año = año;
        } else {
            new IllegalArgumentException("el año es incorrecto");
        }
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public abstract String info();
}
