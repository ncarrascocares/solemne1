
package rut160929472;

/**
 *
 * @author ncarrasco
 */
public class Rut160929472 {


    public static void main(String[] args) {
        //Escritorio esc = new Escritorio("a-1122",4,"windows 10", "Lenovo", "leno1122", 5, false);
        Notebook not = new Notebook(4,false, "windows 8", "Samsung", "think", 3,true );
        Notebook not2 = new Notebook(8,true, "windows 10", "dell", "del2020", 3,true );
        Notebook not3 = new Notebook(0,false, "linux", "Acer", "acer9000", 2,false );
        not.mostrarDatos();
        not2.mostrarDatos();
        not3.mostrarDatos();
        //esc.mostrarDatos();
    }
    
}
