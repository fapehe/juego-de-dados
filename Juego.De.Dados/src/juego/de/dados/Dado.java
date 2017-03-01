/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juego.de.dados;

import java.util.Random;

/**
 *
 * @author labing506
 */
public class Dado {
    
    int numero;
    Random miRam=new Random();
    
    public void Lanzar(){
       
        numero=miRam.nextInt(7);
      
       
    }
            
}
