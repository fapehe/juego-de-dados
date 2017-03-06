/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodados;

/**
 *
 * @author fapehe
 */
public class Maquina {
    
    int apuesta;
    int resultado;
    int ganancia;

    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }


    
    
    public String mensaje(){
        
        switch(resultado)
        {
            case 2:
            { 
                ganancia=apuesta*(-1);
                return"Pierde la apuesta";
            }
            case 3:
            {
                ganancia=apuesta*(-2);
                return"Pierde el doble de la apuesta";
            }
            case 7:
            {
                ganancia=apuesta*(2);
                return"Gana el doble de la apuesta";
            }
            case 11:
            {
                ganancia=apuesta*(0);
                return"No pierde nada";
            }
            case 12:
            {
                ganancia=apuesta*(-2);
                return"Gana la apuesta";
            }
            default:
            {
                ganancia=(int) (apuesta*(-1.5));
                return"Pierde el 1.5 de la apuesta";
            }
            
        }
        
    }
    
}
