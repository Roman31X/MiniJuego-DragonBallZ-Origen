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
        OPCIONES = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        Ocho = new javax.swing.JLabel();
        Uno = new javax.swing.JLabel();
        Dos = new javax.swing.JLabel();
        Tres = new javax.swing.JLabel();
        Cuatro = new javax.swing.JLabel();
        Cinco = new javax.swing.JLabel();
        Seis = new javax.swing.JLabel();
        Nueve = new javax.swing.JLabel();
        Siete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 599));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        INICIAR.setBackground(new java.awt.Color(255, 0, 0));
        INICIAR.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        INICIAR.setForeground(new java.awt.Color(255, 255, 255));
        INICIAR.setText("INICIAR");
        INICIAR.setFocusTraversalPolicy(null);
        jPanel1.add(INICIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 100, 30));

        OPCIONES.setBackground(new java.awt.Color(255, 0, 0));
        OPCIONES.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        OPCIONES.setForeground(new java.awt.Color(255, 255, 255));
        OPCIONES.setText("OPCIONES");
        jPanel1.add(OPCIONES, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 100, 30));

        SALIR.setBackground(new java.awt.Color(255, 0, 0));
        SALIR.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        SALIR.setForeground(new java.awt.Color(255, 255, 255));
        SALIR.setText("SALIR");
        SALIR.setBorderPainted(false);
        jPanel1.add(SALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 100, 30));

        Ocho.setBackground(new java.awt.Color(255, 255, 255));
        Ocho.setOpaque(true);
        Ocho.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 160, 170));

        Uno.setBackground(new java.awt.Color(255, 255, 255));
        Uno.setOpaque(true);
        Uno.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 175));

        Dos.setBackground(new java.awt.Color(255, 255, 255));
        Dos.setOpaque(true);
        Dos.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 160, 180));

        Tres.setBackground(new java.awt.Color(255, 255, 255));
        Tres.setOpaque(true);
        Tres.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 160, 180));

        Cuatro.setBackground(new java.awt.Color(255, 255, 255));
        Cuatro.setOpaque(true);
        Cuatro.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, 170));

        Cinco.setBackground(new java.awt.Color(255, 153, 51));
        Cinco.setOpaque(true);
        Cinco.setPreferredSize(new java.awt.Dimension(155, 159));
        jPanel1.add(Cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, 159));

        Seis.setBackground(new java.awt.Color(255, 255, 255));
        Seis.setOpaque(true);
        Seis.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 160, 160));

        Nueve.setBackground(new java.awt.Color(255, 255, 255));
        Nueve.setOpaque(true);
        Nueve.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 160, 170));

        Siete.setBackground(new java.awt.Color(255, 255, 255));
        Siete.setOpaque(true);
        Siete.setPreferredSize(new java.awt.Dimension(189, 200));
        jPanel1.add(Siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 160, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
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
    public javax.swing.JLabel Nueve;
    public javax.swing.JButton OPCIONES;
    public javax.swing.JLabel Ocho;
    public javax.swing.JButton SALIR;
    public javax.swing.JLabel Seis;
    public javax.swing.JLabel Siete;
    public javax.swing.JLabel Tres;
    public javax.swing.JLabel Uno;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
