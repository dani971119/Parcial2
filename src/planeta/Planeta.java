package planeta;

import javax.swing.JOptionPane;

/**
 *
 * @author ne_la
 */
public class Planeta {

    String nombre;
    int cantidadSatelites;
    double masa;
    double volumen;
    double diametro;
    double distanciaSol;
    boolean esObservable;
    double densidad;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro, double distanciaSol, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.esObservable = esObservable;
    }

    public double calcularDensidad() {
        this.densidad = this.masa / this.volumen;
        return densidad;
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre
                + "\nCantidad de satelites: " + this.cantidadSatelites
                + "\nMasa: " + this.masa
                + "\nVolume: " + this.volumen
                + "\nDiametro: " + this.diametro
                + "\nDistancia del sol: " + this.distanciaSol
                + "\nEs observable: " + this.esObservable
                + "\nDensidad: " + this.densidad
        );
    }
}
