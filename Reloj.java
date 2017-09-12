/**
 * Clase reloj, tiene como atributos la hora, minutos y segundos; permite
 * cambiar cada uno de estos atributos a través de métodos, al igual que
 * adelantar y decrementar por segundos.
 * 
 * @author Lida Heliana Arenas Mogollón
 * @version 24-08-2017
 */
public class Reloj{
    //atributos
    private int hora, min, seg;

    //Métodos
    public boolean cambiarHora(int h){
        if(h >= 0 && h < 24){
            hora = h;
            return true;
        }
        return false;
    }

    public boolean cambiarMinutos(int m){
        if(m >= 0 && m < 60){
            min = m;
            return true;
        }
        return false;
    }

    public boolean cambiarSegundos(int s){
        if(s >= 0 && s < 60){
            seg = s;
            return true;
        }
        return false;
    }

    public void avanzaSegundo(){
        seg++;
        if(seg == 60){
            seg = 0;
            min++;
        }
        if(min == 60){
            min = 0;
            hora++;
        }
        if(hora == 24){
            hora = 0;
        }
    }

    public void retrocedeSegundo(){
        seg--;
        if(seg == -1){
            seg = 59;
            min--;
        }
        if(min == -1){
            min = 59;
            hora--;
        }
        if(hora == -1){
            hora = 23;
        }
    }

    public int obtenerHora(){
        return hora;
    }

    public int obtenerMinutos(){
        return min;
    }

    public int obtenerSegundos(){
        return seg;
    }

    //Método constructor de la clase
    public Reloj(){
        hora = 0;
        min = 0;
        seg = 0;
    }
}