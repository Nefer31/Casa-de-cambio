/**
 * Main de un ejemplo que modela una Casa de Cambio de Bolívares usando POO
 * 
 * @author (Milton Jesús Vera Contreras)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 * History: Abril 2008 / Marzo 2018
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CasaDeCambio casaDeCambio = new CasaDeCambio();
       FrmCasaDeCambio gui = new FrmCasaDeCambio(casaDeCambio);
       gui.setVisible(true);
    }

}
