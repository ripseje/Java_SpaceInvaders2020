/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.Timer;

/**
 *
 * @author jorgecisneros
 */
public class VentanaJuego extends javax.swing.JFrame {
    
    static int ANCHOPANTALLA = 800;
    static int ALTOPANTALLA = 600;
    
    int filasMarcianos = 5;
    int columnasMarcianos = 10;
    
    BufferedImage buffer = null;
    Marciano miMarciano = new Marciano(ANCHOPANTALLA);
    
    //bucle de animación del juego
    //en este caso es un hilo de ejecución nuevo que se encarga
    //de refrescar el contenido de la pantalla
    
    Timer temporizador = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //TODO: código de la animación
            bucleDelJuego();
        }
    });
    
    
    
    /**
     * Creates new form VentanaJuego
     */
    public VentanaJuego() {
        initComponents();
        setSize(ANCHOPANTALLA, ALTOPANTALLA);
        
        buffer = (BufferedImage) jPanel1.createImage(ANCHOPANTALLA, ALTOPANTALLA);
        buffer.createGraphics();
        
        //arranco el temporizador para que empiece el juego
        temporizador.start();
        
        
        ////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////
        
    }
    
    private void bucleDelJuego(){
        //este método gobierna el redibujado de los objetos en jpanel1
        
        //primero borro todo lo que hay en el buffer
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, ANCHOPANTALLA, ALTOPANTALLA);
        
        ////////////////////////////////////////////////////////////////////////
        g2.drawImage(miMarciano.imagen1, 10, 10, null);
        ////////////////////////////////////////////////////////////////////////
        
        //dibijo de golpe todo el buffer sobre el jpanel
        g2 = (Graphics2D) jPanel1.getGraphics();
        g2.drawImage(buffer, 0, 0, null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
