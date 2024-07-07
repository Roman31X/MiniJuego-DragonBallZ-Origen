package com.roman31x.minijuego.dragonballz.origen.Vista_Panel_Inicio;

import com.roman31x.minijuego.dragonballz.origen.Modelo.FondoPanel;

/**
 *
 * @author Roman31X
 */
public class Start_DragonBallZ_Origen extends javax.swing.JFrame {

    public FondoPanel fondo = new FondoPanel("Inicio.jpg");
    
    public Start_DragonBallZ_Origen() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel("Inicio.jpg");
        INICIAR = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        Seis = new javax.swing.JLabel();
        Uno = new javax.swing.JLabel();
        Dos = new javax.swing.JLabel();
        Tres = new javax.swing.JLabel();
        Naranja = new javax.swing.JLabel();
        Cuatro = new javax.swing.JLabel();
        Cinco = new javax.swing.JLabel();
        Siete = new javax.swing.JLabel();
        Ocho = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 599));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        INICIAR.setBackground(new java.awt.Color(204, 204, 204));
        INICIAR.setFont(new java.awt.Font("Wide Latin", 3, 10)); // NOI18N
        INICIAR.setForeground(new java.awt.Color(255, 0, 0));
        INICIAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/inicioGris.png"))); // NOI18N
        jPanel1.add(INICIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 130, 30));

        SALIR.setBackground(new java.awt.Color(204, 204, 204));
        SALIR.setFont(new java.awt.Font("Wide Latin", 3, 12)); // NOI18N
        SALIR.setForeground(new java.awt.Color(255, 0, 0));
        SALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/finGris.png"))); // NOI18N
        SALIR.setBorderPainted(false);
        jPanel1.add(SALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 130, 30));

        Seis.setBackground(new java.awt.Color(255, 153, 51));
        Seis.setOpaque(true);
        Seis.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 404, 129, 160));

        Uno.setBackground(new java.awt.Color(51, 51, 255));
        Uno.setOpaque(true);
        Uno.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 72, 131, 160));

        Dos.setBackground(new java.awt.Color(255, 153, 0));
        Dos.setOpaque(true);
        Dos.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 72, 129, 160));

        Tres.setBackground(new java.awt.Color(51, 51, 255));
        Tres.setOpaque(true);
        Tres.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 72, 129, 160));

        Naranja.setBackground(new java.awt.Color(255, 255, 255));
        Naranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/MedioFondo (1).gif"))); // NOI18N
        Naranja.setOpaque(true);
        Naranja.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Naranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 238, 131, 160));

        Cuatro.setBackground(new java.awt.Color(255, 153, 51));
        Cuatro.setOpaque(true);
        Cuatro.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 238, 129, 160));

        Cinco.setBackground(new java.awt.Color(51, 51, 255));
        Cinco.setOpaque(true);
        Cinco.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 405, 129, 160));

        Siete.setBackground(new java.awt.Color(51, 51, 255));
        Siete.setOpaque(true);
        Siete.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 404, 129, 160));

        Ocho.setBackground(new java.awt.Color(255, 153, 51));
        Ocho.setOpaque(true);
        Ocho.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 238, 130, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Cinco;
    public javax.swing.JLabel Cuatro;
    public javax.swing.JLabel Dos;
    public javax.swing.JButton INICIAR;
    public javax.swing.JLabel Naranja;
    public javax.swing.JLabel Ocho;
    public javax.swing.JButton SALIR;
    public javax.swing.JLabel Seis;
    public javax.swing.JLabel Siete;
    public javax.swing.JLabel Tres;
    public javax.swing.JLabel Uno;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
