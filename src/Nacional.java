public class Nacional extends Producto {
    public String registroDIAN;
    public Nacional(String nombre, int codigo, String registroDIAN) {
        super(nombre, codigo);
        this.registroDIAN = registroDIAN;
    }
    public String getRegistroDIAN() {
        return registroDIAN;
    }
    @Override
    public void buscar(int Codigo) {
        super.buscar(Codigo);
    }
}
