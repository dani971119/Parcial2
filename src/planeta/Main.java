/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package planeta;

/**
 *
 * @author ne_la
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Planeta planeta = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        planeta.calcularDensidad();
        planeta.imprimir();
        
        Planeta planeta2 = new Planeta("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);
        planeta2.calcularDensidad();
        planeta2.imprimir();
    }

}
