/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;
import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.modelo.Telefono;
import java.util.List;
import java.util.Vector;
/**
 *
 * @author Dutan2000
 */
public class TelefonoVista extends javax.swing.JFrame {
    VentanaSecundaria ventanaSecundaria;
    ControladorTelefono cntrlTelfono;
    /**
     * Creates new form telefonoLista
     */
    public TelefonoVista(VentanaSecundaria ventanasec,ControladorTelefono tlf) {
        ventanaSecundaria=ventanasec;
        cntrlTelfono=tlf;
        initComponents();
        
    }
    
    public void listar(){
        List<Telefono> listaTelefono=cntrlTelfono.verTelefonos();
        int aux=0;
        String vector[]= new String[listaTelefono.size()];
        for (Telefono telefono : listaTelefono) {
            vector[aux]=telefono.toString();
            aux=aux+1;
        }
     listInterface.setListData(vector);
 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listInterface = new javax.swing.JList<>();
        labelLista = new javax.swing.JLabel();
        botonSalirTelefonos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listInterface.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listInterface);

        labelLista.setText("Lista de telefonos");
        labelLista.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        botonSalirTelefonos.setText("Salir");
        botonSalirTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirTelefonosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(botonSalirTelefonos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(labelLista)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(labelLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonSalirTelefonos)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirTelefonosActionPerformed
        ventanaSecundaria.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_botonSalirTelefonosActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalirTelefonos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLista;
    private javax.swing.JList<String> listInterface;
    // End of variables declaration//GEN-END:variables
}
