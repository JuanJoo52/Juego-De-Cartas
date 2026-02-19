import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class Carta {

    private int indice;
    public Carta(Random r)
    {
        this.indice=r.nextInt(52)+1;


        
    }
    public int getIndice()
    {
        return this.indice;
    }
    public void Mostrar (int x, int y,JPanel pnl){
        JLabel lbl = new JLabel();
        String nombreArchivo ="/imagenes/CARTA"+this.indice+".JPG";
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreArchivo));
        lbl.setIcon(imagen);
        lbl.setBounds(x,y,imagen.getIconWidth(),imagen.getIconHeight());
        pnl.add(lbl);
        lbl.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent evt){
                JOptionPane.showMessageDialog(null,getnombre().toString()+" de "+ getPinta().toString());
            }
        });

    }
    public Pinta getPinta()
    {
        if(indice <= 13){
            return Pinta.TREBOL;
        } else if (indice<=26){
            return Pinta.PICA;
        } else if (indice <=39){
            return Pinta.CORAZON;
        } else {
            return Pinta.DIAMANTE;
        }


    }
    public NumeroCarta getnombre() {
        int residuo =  indice % 13;
        if (residuo == 0) 
            residuo = 13;
        
    return NumeroCarta.values()[residuo-1];
    }



}
