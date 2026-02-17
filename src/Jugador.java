import java.util.Random;

import javax.swing.JPanel;

public class Jugador {
    private final int TOTAL_CARTAS = 10;
    private Random r = new Random();
    private Carta [] cartas = new Carta[TOTAL_CARTAS];
    public void repartir () 
    {   
    for (int i = 0 ; i<TOTAL_CARTAS; i++)
    {
        cartas[i]= new Carta(r);
    }

    }
    public void mostrar (JPanel pnl){
        pnl.removeAll();
        for (int i = 0 ; i<TOTAL_CARTAS; i++)
    {
        cartas[i].Mostrar(i*50, 10, pnl);
    }
    pnl.repaint();
        
    }

}
