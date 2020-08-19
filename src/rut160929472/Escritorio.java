package rut160929472;
/**
 *
 * @author ncarrasco
 */
public class Escritorio extends Computador{
    //Atributo de la clase
    private String modeloFuente;
    private int ramAdicional;

    //Constructor de la clase, con los atributo heredados de la clase padre
    public Escritorio(String modeloFuente, int ramAdicional,String sistemaOperativo, String marca, String modelo, int peso, boolean disco) {
        super(sistemaOperativo, marca, modelo, peso, disco);
        this.modeloFuente = modeloFuente;
    }
    
    //Metodos get t setter de los atributos de la clase
    public int getRamAdicional() {
        return ramAdicional;
    }

    public void setRamAdicional(int ramAdicional) {
        this.ramAdicional = ramAdicional;
    }
    

    public String getModeloFuente() {
        return modeloFuente;
    }

    public void setModeloFuente(String modeloFuente) {
        this.modeloFuente = modeloFuente;
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
    //Metodo para mostar informacion por pantalla
    @Override
     public void mostrarDatos(){
         System.out.println("\nPC");
        super.mostrarDatos();
        System.out.println("Ram adicional     : " + getRamAdicional());
        System.out.println("Total RAM         : " + calculoRam());
        System.out.println("Tipo disco        : " + detalleDisco());
        System.out.println("Modelo Fuente     : " + getModeloFuente());
    }
    
}
