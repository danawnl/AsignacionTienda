import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Nacional>ProductosNacionales=new ArrayList<>();
        ProductosNacionales.add(new Nacional("Manzana",1001,"DI002"));
        ProductosNacionales.add(new Nacional("Chocolate",0203,"DI120"));
        ProductosNacionales.add(new Nacional("Pañales",3005,"DI050"));

        System.out.println("--------Productos NACIONALES--------");
        for (Nacional nacional:ProductosNacionales){
            System.out.println("Nombre Producto: " + nacional.getNombre() +
                    " Codigo Producto: " + nacional.getCodigo() +
                    " Registro DIAN: " + nacional.getRegistroDIAN());
        }

        int CodigoNacionalBuscado=1001;
        boolean ProductoEncontrado=false;

        for (Nacional nacional:ProductosNacionales){
            nacional.buscar(CodigoNacionalBuscado);
            if (nacional.getCodigo() == CodigoNacionalBuscado) {
                System.out.println("El Producto correspondiente al Codigo: " + CodigoNacionalBuscado + " Es: " + nacional.getNombre());
                ProductoEncontrado= true;
            }break;
        }
        if (!ProductoEncontrado) {
            System.out.println("No existe en el registro un producto con dicho codigo");
        }


        ArrayList<Importado>ProductosImportados= new ArrayList<>();
        ProductosImportados.add(new Importado("Atun",0201,"DI425"));
        ProductosImportados.add(new Importado("Aceite",4009,"DI328"));
        ProductosImportados.add(new Importado("Vino",3502,"DI212"));

        System.out.println("---------PRODUCTOS IMPORTADOS-------");
        for (Importado importado:ProductosImportados){
            System.out.println("Nombre Producto: " + importado.getNombre() +
                    " Codigo Producto: " + importado.getCodigo() +
                    " Licencia de Importación: " + importado.getLicenciaImportacion());
        }

        int CodigoImportadoBuscado= 2002;
        boolean productoencontrado=false;

        for (Importado importado:ProductosImportados){
            importado.buscar(CodigoImportadoBuscado);
            if (importado.getCodigo() == CodigoImportadoBuscado) {
                System.out.println("El Producto correspondiente al Codigo: " + CodigoImportadoBuscado + " Es: " + importado.getNombre());
                productoencontrado= true;
            }break;
        }
        if (!productoencontrado) {
            System.out.println("No existe en el registro un producto con dicho codigo");
        }
    }
}