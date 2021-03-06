package jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 *
 * @author Angela
 * This program uses the methods and classes learned in class to create a 
 * program that draws the St. Edmund Campion
 * New Change
 */
public class CampionLogo extends javax.swing.JFrame {

    /**
     * Creates new form St. Edmund Campion
     */
    public CampionLogo() {
        initComponents();
        this.setTitle("St. Edumund Campion");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        Color blue = new Color(0, 0, 81);
        getContentPane().setBackground(blue);

    }

    @Override
    public void paint(Graphics g) {
        
        // Repaints the frame and its components
        super.paint(g);
        
       // Declare and initialize a Graphics2D object
        Graphics2D circle = (Graphics2D) g;
        Graphics2D logo = (Graphics2D) g;
        Graphics2D words = (Graphics2D) g;
        //getContentPane().setBackground(Color.BLUE);
        circle.setStroke(new BasicStroke(10));
        circle.setPaint(new Color(218, 184, 81)); 
        circle.draw(new Ellipse2D.Double(100, 100, 400, 400));
        circle.setPaint(Color.WHITE);
        circle.fill(new Ellipse2D.Double(100, 100, 400, 400));
        ImageIcon img = new ImageIcon(this.getClass().getResource("BearsLogo.gif"));
        logo.drawImage(img.getImage(), 150, 150, this);
        Font f = new Font("Papyrus", Font.BOLD, 24);
        Color gold = new Color(218, 184, 81);
        words.setFont(f);
        words.setPaint(gold); 
        words.drawString("NAMED, CALLED, CHOSEN", 90, 550); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RadiationSymbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadiationSymbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadiationSymbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadiationSymbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CampionLogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
