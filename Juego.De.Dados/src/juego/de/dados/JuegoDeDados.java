/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.de.dados;

/**
 *
 * @author labing506
 */
public class JuegoDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dado miDado1 =new Dado();
        Dado miDado2 =new Dado();
        Jugador miJug=new Jugador();
        Grafico miGraf=new Grafico();
        
        miGraf.dadoGraf1=miDado1;
        miGraf.dadoGraf2=miDado2;
        miGraf.juga1=miJug;
        miGraf.setVisible(true);
    }
    
}
