import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class FrmJuego extends JFrame{
    JPanel pnlJugador1 = new JPanel();
    JPanel pnlJugador2 = new JPanel();
    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();

public FrmJuego()
{
    setTitle("Juguemos Apuntado");
    setSize(600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    JButton btnRepartir = new JButton("Repartir");
    btnRepartir.setBounds(10,10, 100,25);
    add(btnRepartir);
    JButton btnVerificar = new JButton("Verificar");
    btnVerificar.setBounds(120,10, 100,25);
    add(btnVerificar);
    JTabbedPane tpJugadores = new JTabbedPane();
    tpJugadores.setBounds(10,40,getWidth()-40,150);
    add(tpJugadores);

    
    pnlJugador1.setBackground(new Color(0,255,0));
    pnlJugador2.setBackground(new Color(0,255,255));
    tpJugadores.add(pnlJugador1,"Vicente Fernandez");
    tpJugadores.add(pnlJugador2,"Raul Vidal");

    btnRepartir.addActionListener(e->
        {
            repartir();
        });
    btnVerificar.addActionListener(e -> {
            verificar();
        });

}
private void repartir()
{
    jugador1.repartir();
    jugador2.repartir();
    jugador1.mostrar(pnlJugador1);
    jugador2.mostrar(pnlJugador2);
}
private void verificar()
{

}
}
