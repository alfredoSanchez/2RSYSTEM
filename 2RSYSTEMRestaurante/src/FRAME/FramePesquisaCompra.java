/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FRAME;

import RESTAURANTE.DAO.CompraDAO;
import RESTAURANTE.DAO.IMPL.CompraDAOIMPL;
import RESTAURANTE.MODEL.Compra;
import java.util.*;

/**
 *
 * @author RANGEL
 */
public class FramePesquisaCompra extends javax.swing.JDialog {

    /**
     * Creates new form FramePesquisaCompra
     */
    public FramePesquisaCompra() {
        initComponents();
        setLocation(290, 190);
        compraDao = new CompraDAOIMPL();
        defineParametrosPesquisa();
        atualizaTabela();
        jtbCompras.setAutoResizeMode(jtbCompras.AUTO_RESIZE_OFF);
        jtbCompras.getColumnModel().getColumn(0).setPreferredWidth(78);
        jtbCompras.getColumnModel().getColumn(1).setPreferredWidth(90);
        jtbCompras.getColumnModel().getColumn(2).setPreferredWidth(176);
        jtbCompras.getColumnModel().getColumn(3).setPreferredWidth(176);
        jtbCompras.getColumnModel().getColumn(4).setPreferredWidth(100);
        retornaPrimeiroEUltimoDiaMes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        btnGroupPesquisa = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCompras = new javax.swing.JTable();
        jbtPesquisar = new javax.swing.JButton();
        jtfPesquisar = new javax.swing.JTextField();
        jbtConfirmar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jdtDataInicial = new com.toedter.calendar.JDateChooser();
        jdtDataFinal = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jrbData = new javax.swing.JRadioButton();
        jrbDocumento = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pesquisa De Compra");

        jtbCompras.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${compras}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jtbCompras);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Documento");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataCompra}"));
        columnBinding.setColumnName("Data Compra");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornecedor.pessoa.nome}"));
        columnBinding.setColumnName("Fornecedor");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${colaborador.pessoa.nome}"));
        columnBinding.setColumnName("Colaborador");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorCompra}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Float.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jtbCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbComprasMouseClicked(evt);
            }
        });
        jtbCompras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtbComprasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtbCompras);

        jbtPesquisar.setText("Pesquisar");
        jbtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisarActionPerformed(evt);
            }
        });

        jtfPesquisar.setToolTipText("Busca por: Fornecedor, data, colaborador, documento");
        jtfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisarActionPerformed(evt);
            }
        });

        jbtConfirmar.setText("Confirmar");
        jbtConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtConfirmarActionPerformed(evt);
            }
        });

        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Data Inicial");

        jLabel3.setText("Data final");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnGroupPesquisa.add(jrbData);
        jrbData.setText("Pesquisar por data");
        jrbData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDataActionPerformed(evt);
            }
        });

        btnGroupPesquisa.add(jrbDocumento);
        jrbDocumento.setText("Pesquisar por documento");
        jrbDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDocumentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbData)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jrbDocumento)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbDocumento)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(75, 75, 75))
                                            .addComponent(jdtDataInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jdtDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jbtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtPesquisar))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtConfirmar)
                    .addComponent(jbtCancelar))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfirmarActionPerformed
        if (jtbCompras.getSelectedRow() != -1) {
            compra = compras.get(jtbCompras.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jbtConfirmarActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed
        executaPesquisa();
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jtbComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbComprasMouseClicked
        if (evt.getClickCount() == 2) {
            compra = compras.get(jtbCompras.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jtbComprasMouseClicked

    private void jtfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisarActionPerformed
        executaPesquisa();
    }//GEN-LAST:event_jtfPesquisarActionPerformed

    private void jtbComprasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbComprasKeyPressed
        if (evt.getKeyCode() == 10) {
            compra = compras.get(jtbCompras.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jtbComprasKeyPressed

    private void jrbDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDocumentoActionPerformed
        verificaRadioButton();
    }//GEN-LAST:event_jrbDocumentoActionPerformed

    private void jrbDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDataActionPerformed
        verificaRadioButton();
    }//GEN-LAST:event_jrbDataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePesquisaCompra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtConfirmar;
    private javax.swing.JButton jbtPesquisar;
    private com.toedter.calendar.JDateChooser jdtDataFinal;
    private com.toedter.calendar.JDateChooser jdtDataInicial;
    private javax.swing.JRadioButton jrbData;
    private javax.swing.JRadioButton jrbDocumento;
    private javax.swing.JTable jtbCompras;
    private javax.swing.JTextField jtfPesquisar;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private Compra compra;
    private List<Compra> compras;
    private CompraDAO compraDao;
   

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        List<Compra> comprasOld = this.compras;
        this.compras = compras;
        firePropertyChange("compras", comprasOld, this.compras);
    }

    public void atualizaTabela() {
        setCompras(compraDao.buscarTodos());
        if (compraDao.buscarTodos().isEmpty()) {
        } else {
            jtbCompras.addRowSelectionInterval(0, 0);
        }
    }

    public Compra retornaCompra() {
        return this.compra;
    }

    private void executaPesquisa() {
        Compra compraI = new Compra();
        Compra compraF = new Compra();

        if (jrbDocumento.isSelected()) {
            setCompras(compraDao.buscarCampoPesquisa(jtfPesquisar.getText()));
            if (compraDao.buscarCampoPesquisa(jtfPesquisar.getText()).isEmpty()) {
            } else {
                jtbCompras.addRowSelectionInterval(0, 0);
            }

        } else if (jrbData.isSelected()) {
            compraI.setDataCompra(jdtDataInicial.getDate());
            compraF.setDataCompra(jdtDataFinal.getDate());
            setCompras(compraDao.buscarPorPeriodo(compraI.getDataCompra(), compraF.getDataCompra()));
            if (compraDao.buscarPorPeriodo(compraI.getDataCompra(), compraF.getDataCompra()).isEmpty()) {
            } else {
                jtbCompras.addRowSelectionInterval(0, 0);
            }
        }
    }

    private void verificaRadioButton() {
        if (jrbDocumento.isSelected()) {
            jdtDataInicial.setEnabled(false);
            jdtDataFinal.setEnabled(false);
            jtfPesquisar.setEnabled(true);
        } else if (jrbData.isSelected()) {
            jdtDataInicial.setEnabled(true);
            jdtDataFinal.setEnabled(true);
            jtfPesquisar.setEnabled(false);
        }
    }

    private void defineParametrosPesquisa() {
        jrbData.setSelected(true);
        jdtDataInicial.setDate(new Date());
        jdtDataFinal.setDate(new Date());
        verificaRadioButton();
    }

    private void retornaPrimeiroEUltimoDiaMes() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        final Date primeiroDia = new Date(calendar.getTimeInMillis());
        jdtDataInicial.setDate(primeiroDia);

        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        final Date ultimoDia = new Date(calendar.getTimeInMillis());
        jdtDataFinal.setDate(ultimoDia);
    }
    /*funcionando
 
     //metodo concatena todos os elementos da lista de compras
     private void concatenaDadosCompra() {
     pesquisa = new ArrayList<String>();
     for (Compra comp : compras) {
     pesquisa.add(comp.getCodigo()
     + " - " + comp.getFornecedor().getPessoa().getNome()
     + " - " + comp.getColaborador().getPessoa().getNome());
     }
     }

     //este metodo faz busca dentro da Lista de compras 
     private void pesquisaParametro(String parametro) {
     List<String> result = new ArrayList<String>();
     int i = 0;
     String co = null;
     while (i < pesquisa.size()) {
     //pega o elemento da linha e add na string
     co = pesquisa.get(i);            
     //se o parametro esta na string co add a lista de resultado (substring)
     if (co.contains(parametro)) {
     result.add(co);
     }
     i++;
     }
        
     System.out.println("------------------");
     for (String string : result) {
     System.out.println(string);
     }
     }
     * 
     */
}
