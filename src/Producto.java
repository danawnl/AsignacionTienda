public class Producto {
    public String Nombre;
    private int Codigo;
    public Producto(String nombre, int codigo) {
        Nombre = nombre;
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public void buscar(int Codigo){}
}
