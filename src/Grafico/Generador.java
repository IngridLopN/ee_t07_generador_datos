/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import Clases.Generar_datos;
import com.csvreader.CsvWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author IngridNiño
 */
public class Generador extends javax.swing.JFrame {
    private String titulo="";
    /**
     * Creates new form Generador
     */
    private Generar_datos gn=new Generar_datos();
    public Generador() {
        initComponents();
        this.setResizable(false);
        this.setTitle("GENERADOR DE DATOS ALEATORIOS");
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/List2.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selecciona uno ó varios campos");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Apellido_Materno");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Ciudad");
        jCheckBox2.setOpaque(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Apellido_Paterno");
        jCheckBox3.setOpaque(false);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Codigo_Postal");
        jCheckBox4.setOpaque(false);
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Direccion");
        jCheckBox5.setOpaque(false);
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Edad");
        jCheckBox6.setOpaque(false);
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("Email");
        jCheckBox7.setOpaque(false);
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("Estado_Civil");
        jCheckBox8.setOpaque(false);
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setText("Fecha_Nacimiento");
        jCheckBox9.setOpaque(false);
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("Nacionalidad");
        jCheckBox10.setOpaque(false);
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jCheckBox11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox11.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setText("Nombre");
        jCheckBox11.setOpaque(false);
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        jCheckBox12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox12.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setText("Numero_Telefono");
        jCheckBox12.setOpaque(false);
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox13.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox13.setText("Sueldo");
        jCheckBox13.setOpaque(false);
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jCheckBox14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox14.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox14.setText("Peso");
        jCheckBox14.setOpaque(false);
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jCheckBox15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox15.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox15.setText("RFC");
        jCheckBox15.setOpaque(false);
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        jCheckBox16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox16.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox16.setText("Empresa");
        jCheckBox16.setOpaque(false);
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox11)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox16)
                            .addComponent(jCheckBox15)
                            .addComponent(jCheckBox14)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox12)))
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox13)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox14))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox15))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox16))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8))
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 380));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Número de datos a generar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 167, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre archivo a generar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 170, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Carácter delimitador");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 130, 20));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 167, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 20, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMorado-iloveimg-resized.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String delimitador=jTextField2.getText();
        int datosTotales=0;
        int cont=0,cont2=0;
        String frase = "";
        try{
           datosTotales=Integer.parseInt(jTextField3.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Por favor, introduce sólo números", "Error",JOptionPane.ERROR_MESSAGE);
        }
        
        System.out.println();
        CsvWriter writer = new CsvWriter ("C:/Users/yingy/Desktop/" + jTextField1.getText() + ".csv");
        try {
            titulo=titulo.replace(',',delimitador.charAt(0));
            writer.write(titulo.substring(0,titulo.length()-1));
            writer.endRecord();
            
        } catch (IOException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(cont<datosTotales){
            
              if(jCheckBox1.isSelected()){
            frase += gn.generar_apellidos_maternos() + delimitador;
        }
              if(jCheckBox2.isSelected()){
            frase += gn.generar_ciudades() + delimitador;
        }
              if(jCheckBox3.isSelected()){
            frase += gn.generar_apellidos_paternos() + delimitador;
        }
              if(jCheckBox4.isSelected()){
            frase += gn.generar_codigo_postal() + delimitador;
        }
              if(jCheckBox5.isSelected()){
            frase += gn.generar_direcciones()  + delimitador;
        }
              if(jCheckBox6.isSelected()){
            frase += gn.generar_edad() + delimitador;
        }
              if(jCheckBox7.isSelected()){
            frase += gn.generar_emails() + delimitador;
        }
              if(jCheckBox8.isSelected()){
            frase += gn.generar_estado_civil() + delimitador;
        }
              if(jCheckBox9.isSelected()){
            frase += gn.generar_fecha_nacimiento() + delimitador;
        }
              if(jCheckBox10.isSelected()){
            frase +=gn.generar_nacionalidades() + delimitador;
        }
              if(jCheckBox11.isSelected()){
            frase += gn.generar_nombres() + delimitador;
        }
              if(jCheckBox12.isSelected()){
            frase += gn.generar_numeros_telefono() + delimitador;
        }
              if(jCheckBox13.isSelected()){
            frase += gn.generar_sueldo() + delimitador;
        }
              if(jCheckBox14.isSelected()){
            frase += gn.generar_peso() + delimitador;
        }
              if(jCheckBox15.isSelected()){
            frase += gn.generar_rfc() + delimitador;
        }
              if(jCheckBox16.isSelected()){
            frase += gn.generar_empresas() + delimitador;
        }
        try {
            writer.write(frase.substring(0, frase.length()-1));
            writer.endRecord();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

        }
              frase="";
              cont++;
      }
        writer.close();
              delimitador="";
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       if(jCheckBox1.isSelected()){
            gn.cargar_apellidos_maternos();
            titulo+= jCheckBox1.getText() + ",";
        }else{
           titulo +="";
           gn.setApellidos_maternos(null); 
       }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected()){
            gn.cargar_ciudades();
            titulo+= jCheckBox2.getText() + ",";
        }else{
            titulo +="";
            gn.setCiudades(null);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if(jCheckBox3.isSelected()){
            gn.cargar_apellidos_paternos();
            titulo+= jCheckBox3.getText() + ",";
        }else{ 
            titulo +="";
            gn.setApellidos_paternos(null);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if(jCheckBox4.isSelected())
            titulo+= jCheckBox4.getText() + ",";
        else
            titulo +="";
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if(jCheckBox5.isSelected()){
            gn.cargar_direcciones();
            titulo+= jCheckBox5.getText() + ",";
        }else{
            titulo +="";
            gn.setDirecciones(null);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if(jCheckBox6.isSelected())
            titulo+= jCheckBox6.getText() + ",";
        else
            titulo +="";
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        if(jCheckBox7.isSelected()){
            gn.cargar_emails();
            titulo+= jCheckBox7.getText() + ",";
        }else{
            titulo +="";
            gn.setEmails(null);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        if(jCheckBox8.isSelected())
            titulo+= jCheckBox8.getText() + ",";
        else
            titulo +="";
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        if(jCheckBox9.isSelected())
            titulo+= jCheckBox9.getText() + ",";
        else
            titulo +="";
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        if(jCheckBox10.isSelected()){
            gn.cargar_nacionalidades();
            titulo+= jCheckBox10.getText() + ",";
        }else{
            titulo +="";
            gn.setNacionalidades(null);
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        if(jCheckBox11.isSelected()){
            gn.cargar_nombres();
            titulo+= jCheckBox11.getText() + ",";
        }else{
            titulo +="";
            gn.setNombres(null);
        }
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        if(jCheckBox12.isSelected())
            titulo+= jCheckBox12.getText() + ",";
        else
            titulo +="";
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        if(jCheckBox13.isSelected())
            titulo+= jCheckBox13.getText() + ",";
        else
            titulo +="";
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        if(jCheckBox14.isSelected())
            titulo+= jCheckBox14.getText() + ",";
        else
            titulo +="";
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        if(jCheckBox15.isSelected()){
            gn.cargar_rfc();
            titulo+= jCheckBox15.getText() + ",";
        }else{
            titulo +="";
            gn.setRfc(null);
        }
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        if(jCheckBox16.isSelected()){
            gn.cargar_empresas();
            titulo+= jCheckBox16.getText() + ",";
        }else{
            titulo +="";
            gn.setEmpresas(null);
        }
    }//GEN-LAST:event_jCheckBox16ActionPerformed

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
            java.util.logging.Logger.getLogger(Generador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
