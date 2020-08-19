
package rut160929472;

/**
 *
 * @author ncarrasco
 */
public class Computador {
    //Atributos
    private String sistemaOperativo;
    private String marca;
    private String modelo;
    private int peso;
    static final int RAM = 4;
    private boolean disco;
    
    //Constructor
    public Computador(String sistemaOperativo, String marca, String modelo, int peso, boolean disco) {
        this.sistemaOperativo = sistemaOperativo;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        //this.ram = 4;
        this.disco = disco;
        
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getRam() {
        return RAM;
    }

    public boolean getDisco() {
        return disco;
    }

    public void setDisco(boolean disco) {
        this.disco = disco;
    }
    
    //Metodo de la clase Padre
    public void mostrarDatos(){
        System.out.println("Sistema Operativo : " + sistemaOperativo);
        System.out.println("Marca             : " + marca);
        System.out.println("Modelo            : " + modelo);
        System.out.println("Peso              : " + peso + " kilos");
        System.out.println("Ram original      : " + RAM);
    }
}
