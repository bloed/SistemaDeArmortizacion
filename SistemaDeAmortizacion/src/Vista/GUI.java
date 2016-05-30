package Vista;

import Controlador.AbstractAmortizacionController;
import Controlador.AmortizacionController;
import DTOs.DTOModeloVista;
import DTOs.DTOVistaModelo;
import Modelo.Cuotas.CuotaConcreta;
import Validaciones.Validaciones;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame implements IVista{

    private AbstractAmortizacionController controlador;
    public GUI() {
        controlador = new AmortizacionController(this);
        initComponents();
    }


    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_ResultadoFinales = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_Prestamo = new javax.swing.JTextField();
        txt_NombreCliente = new javax.swing.JTextField();
        txt_PeriodosTotales = new javax.swing.JTextField();
        txt_InteresAnaul = new javax.swing.JTextField();
        txt_SistemaArmotizacion = new javax.swing.JTextField();
        txt_Moneda = new javax.swing.JTextField();

        jScrollPane2.setViewportView(jEditorPane1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sistema de Armotización");

        txt_ResultadoFinales.setColumns(20);
        txt_ResultadoFinales.setRows(5);
        jScrollPane1.setViewportView(txt_ResultadoFinales);

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre del cliente:");

        jLabel3.setText("Monto del préstamo:");

        jButton2.setText("PROCESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Períodos totales:");

        jLabel5.setText("Interés anual:");

        jLabel6.setText("Sistema de armotización:");

        jLabel7.setText("[Aleman | Frances | Americano]");

        jLabel8.setText("Moneda:");

        jLabel9.setText("[Colon | Dolar]");

        txt_Prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PrestamoActionPerformed(evt);
            }
        });

        txt_NombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreClienteActionPerformed(evt);
            }
        });

        txt_PeriodosTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PeriodosTotalesActionPerformed(evt);
            }
        });

        txt_InteresAnaul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_InteresAnaulActionPerformed(evt);
            }
        });

        txt_SistemaArmotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SistemaArmotizacionActionPerformed(evt);
            }
        });

        txt_Moneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MonedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(194, 194, 194))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_Moneda, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_SistemaArmotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_InteresAnaul, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_PeriodosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_Prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(197, 197, 197)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(178, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_PeriodosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_InteresAnaul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_SistemaArmotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_Moneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9)
                        .addGap(73, 73, 73)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 277, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        enviarDatos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_PrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PrestamoActionPerformed

    private void txt_NombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreClienteActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txt_PeriodosTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PeriodosTotalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PeriodosTotalesActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void txt_InteresAnaulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_InteresAnaulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_InteresAnaulActionPerformed

    private void txt_SistemaArmotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SistemaArmotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SistemaArmotizacionActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void txt_MonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MonedaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField txt_InteresAnaul;
    private javax.swing.JTextField txt_Moneda;
    private javax.swing.JTextField txt_NombreCliente;
    private javax.swing.JTextField txt_PeriodosTotales;
    private javax.swing.JTextField txt_Prestamo;
    private javax.swing.JTextArea txt_ResultadoFinales;
    private javax.swing.JTextField txt_SistemaArmotizacion;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarError(String pError) {
        JOptionPane.showMessageDialog(this, "Error: " + pError);
    }

    @Override
    public void mostrarPantallaInicial() {
        this.setVisible(true);
        this.txt_ResultadoFinales.setVisible(false);
    }

    @Override
    public void mostrarPantallaFinal(DTOModeloVista dto) {
        this.txt_ResultadoFinales.setVisible(true);
        this.txt_InteresAnaul.setVisible(false);
        this.txt_Moneda.setVisible(false);
        this.txt_NombreCliente.setVisible(false);
        this.txt_PeriodosTotales.setVisible(false);
        this.txt_Prestamo.setVisible(false);
        this.txt_SistemaArmotizacion.setVisible(false);
        this.jLabel2.setVisible(false);
        this.jLabel3.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jLabel5.setVisible(false);
        this.jLabel6.setVisible(false);
        this.jLabel7.setVisible(false);
        this.jLabel8.setVisible(false);
        this.jLabel9.setVisible(false);
        
        String resultado = "";
        resultado += "Tipo de cambio compra BCCR: " + String.valueOf(dto.getTipoCambio()) + "\n";
        resultado += "Datos de la consulta: \n";
        resultado += "Cliente: " + this.txt_NombreCliente.getText() + "\n";
        resultado += "Monto del préstamo otorgado: " + this.txt_Prestamo.getText()
            + " de clones. Se muestran los resultados en " + this.txt_Moneda.getText() + "\n";
        resultado += "Plazo del préstamo: " + this.txt_PeriodosTotales.getText() + " años \n";
        resultado += "Interés anual: " + this.txt_InteresAnaul.getText() + "% \n";
        resultado += "Sistema de armotización: " + this.txt_SistemaArmotizacion.getText() + " \n";
        resultado += "\n";
        resultado += "Tabla de Armotización \n";
        resultado += CuotaConcreta.getCuotas(dto.getCuotas());
        resultado += "\n\n";
        resultado += "Chuky Date And Time: " + dto.getFechaChucky();
    
        this.txt_ResultadoFinales.append(resultado);
    }

    @Override
    public void enviarDatos() {
        if (validarEntradaDatos()){
            controlador.crearSistemaArmotizacion(new DTOVistaModelo(
                this.txt_NombreCliente.getText(), Double.parseDouble(this.txt_Prestamo.getText()), Integer.parseInt(this.txt_PeriodosTotales.getText()),
                    Double.parseDouble(this.txt_InteresAnaul.getText()), this.txt_SistemaArmotizacion.getText(), this.txt_Moneda.getText())); 
        }
    }

    @Override
    public Boolean validarEntradaDatos() {
        try{
            Validaciones.esDouble(this.txt_Prestamo.getText());
            Validaciones.esDouble(this.txt_InteresAnaul.getText());
            Validaciones.esInteger(this.txt_PeriodosTotales.getText());
            Validaciones.validarMoneda(this.txt_Moneda.getText());
            Validaciones.validarSistema(this.txt_SistemaArmotizacion.getText());
            return true;
        }
        catch(Exception e){
            mostrarError(e.getMessage());
            mostrarPantallaInicial();
            return false;
        }
    }
}
