package com.roman31x.minijuego.dragonballz.origen.Vista_Panel_Inicio;

import com.roman31x.minijuego.dragonballz.origen.Modelo.FondoPanel;

/**
 *
 * @author Roman31X
 */
public class Menu_Minijuegos extends javax.swing.JFrame {

    public FondoPanel fondo = new FondoPanel("fondoMenu.png");
    
    public Menu_Minijuegos() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel("fondoMenu.png");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Combate = new javax.swing.JLabel();
        Atras = new javax.swing.JLabel();
        Memoria = new javax.swing.JLabel();
        Laberinto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 65, 65));

        jLabel2.setFont(new java.awt.Font("Wide Latin", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/menu.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 25, 460, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/gifMenuPrincipal.gif"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 200, 260));

        jLabel4.setBackground(new java.awt.Color(0, 0, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/combate.gif"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, 80));

        jLabel5.setBackground(new java.awt.Color(0, 0, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/memoria.gif"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, 80));

        jLabel6.setBackground(new java.awt.Color(0, 0, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/corre.gif"))); // NOI18N
        jLabel6.setText("jLabel4");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 205, 80, 80));

        Combate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/combateGris.png"))); // NOI18N
        jPanel1.add(Combate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 260, 50));

        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Atras.png"))); // NOI18N
        Atras.setText("jLabel8");
        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 355, 40, 40));

        Memoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/juegoMemoria.png"))); // NOI18N
        jPanel1.add(Memoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 260, 50));

        Laberinto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/laberintoGris.png"))); // NOI18N
        jPanel1.add(Laberinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 260, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Atras;
    public javax.swing.JLabel Combate;
    public javax.swing.JLabel Laberinto;
    public javax.swing.JLabel Memoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
