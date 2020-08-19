package rut160929472;

/**
 *
 * @author ncarrasco
 */
public class Notebook extends Computador{
    //Atributo de la clase
    private int ramAdicional;
    private boolean adaptadorCaddy;
    
    //Constructor de la clase, con los atributo heredados de la clase padre
    public Notebook(int ramAdicional, boolean adaptadorCaddy,String sistemaOperativo, String marca, String modelo, int peso, boolean disco) {
        super(sistemaOperativo, marca, modelo, peso, disco);
        this.ramAdicional = ramAdicional;
        this.adaptadorCaddy = adaptadorCaddy;
    }
    
    //Metodos get t setter de los atributos de la clase
    public int getRamAdicional() {
        return ramAdicional;
    }

    public void setRamAdicional(int ramAdicional) {
        this.ramAdicional = ramAdicional;
    }

    public boolean getAdaptadorCaddy() {
        return adaptadorCaddy;
    }

    public void setAdaptadorCaddy(boolean adaptadorCaddy) {
        this.adaptadorCaddy = adaptadorCaddy;
    }
    
    //Metodo que me permite sumar a mi constante RAM
    public int calculoRam(){
        int total = getRam() + ramAdicional;
        return total;
    }
    //Metodo que permite establecer un valor segun sea verdadero o falso
    public String detalleDisco(){
       if(getDisco() == true){
           return "Disco estado ssd";
       }else{
           return "Disco magnetico";
       }
    }
    
    //Metodo que permite establecer un valor segun sea verdadero o falso
    public String detalleAdaptador(){
        if(getAdaptadorCaddy() == true){
            return "Si";
        }
        else{
            return "No";
        }
    }
    
    //Metodo para mostar informacion por pantalla
    @Override
    public void mostrarDatos(){
    System.out.println("\nNotebook");
    super.mostrarDatos();
    System.out.println("Ram adicional     : " + getRamAdicional());
    System.out.println("Total RAM         : " + calculoRam());
    System.out.println("Tipo disco        : " + detalleDisco());
    System.out.println("Adaptador Caddy   : " + detalleAdaptador());
    }
}
