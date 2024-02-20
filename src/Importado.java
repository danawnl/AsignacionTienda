public class Importado extends Producto{
    public String LicenciaImportacion;
    public Importado(String nombre, int codigo, String LicenciaImportacion) {
        super(nombre, codigo);
        this.LicenciaImportacion=LicenciaImportacion;
    }
    public String getLicenciaImportacion() {
        return LicenciaImportacion;
    }
    @Override
    public void buscar(int Codigo) {
        super.buscar(Codigo);
    }
}
