/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Ventana1 extends javax.swing.JFrame {
    DefaultListModel model = new DefaultListModel();
    DefaultListModel model1 = new DefaultListModel();
    /**
     * Creates new form Ventana1
     */
    public Ventana1() {
        initComponents();
        
        jTextField1.requestFocus();
        
        jButton4.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jLabel2.setVisible(false);
        jLabel5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(738, 630));

        jPanel1.setBackground(new java.awt.Color(247, 246, 246));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jpanel1focusjtextfield(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jScrollPane1.setViewportView(jList1);

        jTextField1.setText("Digite el código aquí");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jText1(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IngEnter(evt);
            }
        });

        jButton1.setText("Registrar");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setText("Cargar ");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Guardar");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ticket (Unidad)");

        jLabel2.setText("</ubicación/nombrearchivo.xls>");
        jLabel2.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(267, 267, 267)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton6)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tickets", jPanel1);

        jPanel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                vvv(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jButton3.setText("Registrar");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                regEnter(evt);
            }
        });

        jTextField2.setText("Digite el código aquí");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                busEnter(evt);
            }
        });

        jButton4.setText("Volver");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Buscar");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Sin registrar");

        jLabel4.setText("Registrados");

        jLabel5.setText("</ubicacion/nombrearchivo.xls>");

        jList3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList3.setEnabled(false);
        jScrollPane3.setViewportView(jList3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))))
                    .addComponent(jLabel3)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(0, 262, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Registrar", jPanel2);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/banner.gif"))); // NOI18N

        jPanel3.setBackground(java.awt.Color.black);
        jPanel3.setForeground(java.awt.Color.black);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/gpslogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // ingresar - ticket
        
        if (evt.getSource().equals(jButton1)) {
            if (! jTextField1.getText().trim().equals("")) {
                if (!jTextField1.getText().trim().equals("Digite el código aquí")) {
                    
                    //comprobar q el ticket no se encuentra en la lista
                    
                    
                    int size = model.getSize();
                    // comprobar si el elemento a ingresar ya esta en la lista de regristrados
                    
                    int size1 = model1.getSize();
                    String texto = jTextField1.getText();
                    boolean sw1=false;
                    for (int i = 0; i < size1; i++) {
                        String textol = model1.getElementAt(i).toString();
                        if ( textol.equals(texto)) {                    
                            jList2.setSelectedIndex(i);
                            sw1=true;
                        }

                    }      
                    if (sw1==true) {
                            JOptionPane.showMessageDialog(null, "Código ya esta registrado");
                    }else{
                    
                    
                        if (size==0) { //si lista vacía entonces ingrese

                            model.addElement(jTextField1.getText());
                            this.jList1.setModel(model);
                            this.jList3.setModel(model);

                            jButton2.setEnabled(true);
                        } else { //si no comprobar q el ticket no se encuentre en la lista misma

                            boolean sw = false;

                            for (int i = 0; i < size; i++) { // recorro la lista buscando el elemento
                                String textol = model.getElementAt(i).toString();
                                if ( textol.equals(jTextField1.getText())) {
                                    sw=true;    // encontrado
                                }
                            }
                            if (sw==true) { 
                                JOptionPane.showMessageDialog(null, "Código repetido");

                            } else {    // si no encontrado agregarlo
                                model.addElement(jTextField1.getText());
                                this.jList1.setModel(model);
                                this.jList3.setModel(model);

                                jButton2.setEnabled(true);    
                            }
                        }
                    }
                    
                    
                    jTextField1.setText(null);
                    
                    this.jTextField1.requestFocus();
                    
                    
                    }else{
                        jTextField1.setText(null);
                        this.jTextField1.requestFocus();
                    }
                }else{
                    jTextField1.setText(null);
                    this.jTextField1.requestFocus();
                }
            }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        // dialogo cargar
       Cargar c = new Cargar();
       c.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        /*  Guardar 
         * 
        c = new Guardar();
        c.setVisible(true);*/
        
        // 
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int resultado = fileChooser.showSaveDialog(this);
        
        if (resultado == JFileChooser.CANCEL_OPTION) {
            return;
        }
        File archivo = fileChooser.getSelectedFile();
        
        try {
            PrintWriter salido = new PrintWriter(new FileWriter(archivo+".csv"));
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jText1(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText1
        // TODO add your handling code here:
        jTextField1.setText(null);
        jButton1.setEnabled(true);
        
    }//GEN-LAST:event_jText1

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // eliminar - ticket
        
        if (jList1.getSelectedValue()!=null) {
            
            int a = jList1.getSelectedIndex();
            model.remove(a);
            int size = model.getSize();
            if (size == 0) { 
                jButton2.setEnabled(false);
            }else{
                if (a == model.getSize()) {
                    //removed item in last position
                    a--;
                }

                jList1.setSelectedIndex(a);
                jList1.ensureIndexIsVisible(a);
                jList3.setSelectedIndex(a);
                jList3.ensureIndexIsVisible(a);
            }
        } else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un ticket para eliminar");
        }       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2
        // TODO add your handling code here:
        //focus jtextfield2
        jTextField2.setText(null);
        jButton5.setEnabled(true);
        jButton3.setEnabled(false);
        
    }//GEN-LAST:event_jTextField2

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //buscar
        
        if (!jTextField2.getText().trim().equals("")) {
            int size = model.getSize();
            String texto = jTextField2.getText();
            boolean sw=false;
            for (int i = 0; i < size; i++) {
                String textol = model.getElementAt(i).toString();
                if ( textol.equals(texto)) {                    
                    jList3.setSelectedIndex(i);
                    jButton3.setEnabled(true);
                    sw=true;
                    jButton3.requestFocus();
                }
                
            }      
            if (sw==false) {
                    JOptionPane.showMessageDialog(null, "Código no encontrado");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Digite un código a buscar");
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
        // registrar
        if (!jTextField2.getText().trim().equals("")) {
            
            
            
            model1.addElement(jTextField2.getText());
            jList2.setModel(model1);

            int a = jList3.getSelectedIndex();
            model.remove(a);
            jButton3.setEnabled(false);
            
            
        }
        jTextField2.setText(null);
        jButton4.setEnabled(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // devolver
        int a = jList2.getSelectedIndex();
        if (a==-1) {
            JOptionPane.showMessageDialog(null, "Seleccione un elemento para devolver");
        } else {
        }
        model.addElement(model1.getElementAt(a));
        jList3.setModel(model);
        
        model1.remove(a);
        jButton4.setEnabled(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        // TODO add your handling code here:
        jButton4.setEnabled(true);
    }//GEN-LAST:event_jList2ValueChanged

    private void IngEnter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngEnter
        // TODO add your handling code here:
        
        // Enter - jtextfield1 ingresar
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           
            // ingresar - ticket
            if (! jTextField1.getText().trim().equals("")) {
                if (!jTextField1.getText().trim().equals("Digite el código aquí")) {
                    //comprobar q el ticket no se encuentra en la lista
                    int size = model.getSize();
                    if (size==0) { //si lista vacía entonces ingrese
                        
                        model.addElement(jTextField1.getText());
                        this.jList1.setModel(model);
                        this.jList3.setModel(model);
                        
                        jButton2.setEnabled(true);
                    } else { //si no comprobar q el ticket no se encuentre en la lista
                        
                        boolean sw = false;
                        
                        for (int i = 0; i < size; i++) { // recorro la lista buscando el elemento
                            String textol = model.getElementAt(i).toString();
                            if ( textol.equals(jTextField1.getText())) {
                                sw=true;    // encontrado
                            }
                        }
                        if (sw==true) { // enviar mensaje de repetido
                            JOptionPane.showMessageDialog(null, "Código repetido");
                            
                        } else {    // si no encontrado agregarlo
                            model.addElement(jTextField1.getText());
                            this.jList1.setModel(model);
                            this.jList3.setModel(model);

                            jButton2.setEnabled(true);    
                        }
                    }
                    
                    jTextField1.setText(null);                    
                    this.jTextField1.requestFocus();                    
                    }else{
                        jTextField1.setText(null);
                        this.jTextField1.requestFocus();
                    }
                }else{
                    jTextField1.setText(null);
                    this.jTextField1.requestFocus();
                }
            
            
        }
        
    }//GEN-LAST:event_IngEnter

    private void busEnter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busEnter
        // TODO add your handling code here:
        
        // enter - buscar
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if (!jTextField2.getText().trim().equals("")) {
                int size = model.getSize();
                String texto = jTextField2.getText();
                boolean sw = false;    
                for (int i = 0; i < size; i++) {
                    String textol = model.getElementAt(i).toString();
                    if ( textol.equals(texto)) {
                        jList3.setSelectedIndex(i);
                        jButton3.setEnabled(true);
                        jButton3.requestFocus();              
                        sw=true;
                    }
                } 
                if (sw==false) {
                    JOptionPane.showMessageDialog(null, "Código no encontrado");
                }
                
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Digite un código a buscar");
            }
        }
    }//GEN-LAST:event_busEnter

    private void regEnter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regEnter
        // TODO add your handling code here:        
        jTextField2.requestFocus();
    }//GEN-LAST:event_regEnter

    private void vvv(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_vvv
        // TODO add your handling code here:
        jTextField2.requestFocus();
    }//GEN-LAST:event_vvv

    private void jpanel1focusjtextfield(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jpanel1focusjtextfield
        // TODO add your handling code here:
        jTextField1.requestFocus();
    }//GEN-LAST:event_jpanel1focusjtextfield

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
