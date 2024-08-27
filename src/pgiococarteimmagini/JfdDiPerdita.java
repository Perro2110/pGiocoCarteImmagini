/*    🃏 Benvenuto! nel gioco di memoria con le carte 🃏
 🃏 Ti verrano mostrate 5 carte per pochi secondi, 
 🃏 dopodichè al click del mouse sul mazzo/tavolo da gioco pescherai  
 🃏 quando ritieni di aver individuato 1 delle 5 carte 
 🃏 clicca sul titolo!, ATTENZIONE hai solo una possibilità.
 🃏🃏🃏🃏🃏🃏                    BY Marco Perrotta                🃏🃏🃏🃏🃏🃏
 */
package pgiococarteimmagini;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static pgiococarteimmagini.GrandeInizio.jf;

/**_______🙈🙉🙊_________
 * @author perrotta 🃏 *
 *____________________*/
public class JfdDiPerdita 
{
    private  JFrame jfw;
      private  JButton bGiusto,bGiusto2;
      private  Icon iGiusto,iGiusto2;
      private  GridLayout gl;
      

    public JfdDiPerdita() {
        
        
                 //creo il Frame
        jfw =new JFrame("Hai Perso?!");
        jfw.setSize(600,600);
        jfw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfw.setResizable(false);

            //creo i Label
            //creo le immagini
        iGiusto=new ImageIcon("Lose_MP.GIF");
    iGiusto2=new ImageIcon("Lose_MP.png");
            //creo i bottoni e li assoocio  alle immagini
        bGiusto=new JButton(iGiusto);
        bGiusto2=new JButton(iGiusto2);
        gl=new GridLayout(0,1);
            //associo il Layout al frame
        jfw.setLayout(gl);
            //aggiungo i componenti al frame   
       bGiusto2.setBackground(Color.decode("#ffffff"));
       bGiusto.setBackground(Color.decode("#ffffff"));
         jfw.add(bGiusto2);
         jfw.add(bGiusto);
        jfw.setVisible(true);  //rende il tutto VISIBILE
    }
}