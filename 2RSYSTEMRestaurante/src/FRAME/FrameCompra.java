package FRAME;

import RESTAURANTE.DAO.CompraDAO;
import RESTAURANTE.DAO.IMPL.CompraDAOIMPL;
import RESTAURANTE.DAO.IMPL.ProdutoDaCompraDAOIMPL;
import RESTAURANTE.DAO.ProdutoDAO;
import RESTAURANTE.DAO.ProdutoDaCompraDAO;
import RESTAURANTE.MODEL.*;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class FrameCompra extends javax.swing.JFrame {

    public FrameCompra() {
        initComponents();
        jbtExcluir.setVisible(false);
        jbtAlterar.setVisible(false);
        setLocation(200, 100);
        novaCompra();
        tableModel = new DefaultTableModel();
        compraDao = new CompraDAOIMPL();
        produtoDaCompraDao = new ProdutoDaCompraDAOIMPL();
        produtosDaCompra = new ArrayList<ProdutosDaCompra>();
        jtbProdutosCompra.setAutoResizeMode(jtbProdutosCompra.AUTO_RESIZE_OFF);
        jtbProdutosCompra.getColumnModel().getColumn(0).setPreferredWidth(100);
        jtbProdutosCompra.getColumnModel().getColumn(1).setPreferredWidth(430);
        jtbProdutosCompra.getColumnModel().getColumn(2).setPreferredWidth(110);
        jtbProdutosCompra.getColumnModel().getColumn(3).setPreferredWidth(112);
        jtbProdutosCompra.getColumnModel().getColumn(4).setPreferredWidth(114);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtNovo = new javax.swing.JButton();
        jbtAlterar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProdutosCompra = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfValorCompra = new javax.swing.JLabel();
        jbtFinalizarCompra = new javax.swing.JButton();
        jbtExcluirProduto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtfColaborador = new javax.swing.JTextField();
        jbtColaborador = new javax.swing.JButton();
        jtfFornecedor = new javax.swing.JTextField();
        jbtPesquisaFornecedor = new javax.swing.JButton();
        jdcDataCompra = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbtPesquisarCompra = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compra de Mercadoria");
        setResizable(false);

        jbtNovo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtNovo.setText("Novo");
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        jbtAlterar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtAlterar.setText("Alterar");
        jbtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAlterarActionPerformed(evt);
            }
        });

        jbtExcluir.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtExcluir.setText("Excluir");
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });

        jbtSair.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtSair.setText("Sair");
        jbtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Hiragino Sans GB", 0, 24)); // NOI18N
        jLabel1.setText("Compra de Mercadoria");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jtbProdutosCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Quantidade", "Valor UN", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbProdutosCompra.setColumnSelectionAllowed(true);
        jtbProdutosCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtbProdutosCompraKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtbProdutosCompra);
        jtbProdutosCompra.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtbProdutosCompra.getColumnModel().getColumn(0).setResizable(false);
        jtbProdutosCompra.getColumnModel().getColumn(1).setResizable(false);
        jtbProdutosCompra.getColumnModel().getColumn(2).setResizable(false);
        jtbProdutosCompra.getColumnModel().getColumn(3).setResizable(false);
        jtbProdutosCompra.getColumnModel().getColumn(4).setResizable(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("P busca produtos");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Valor da Compra");

        jtfValorCompra.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jtfValorCompra.setForeground(new java.awt.Color(255, 255, 255));

        jbtFinalizarCompra.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtFinalizarCompra.setText("Finalizar Compra");
        jbtFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFinalizarCompraActionPerformed(evt);
            }
        });

        jbtExcluirProduto.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtExcluirProduto.setText("Excluir Produto");
        jbtExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtFinalizarCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtExcluirProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jbtFinalizarCompra)
                        .addComponent(jbtExcluirProduto))
                    .addComponent(jtfValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtfColaborador.setEditable(false);
        jtfColaborador.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jbtColaborador.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtColaborador.setText("Buscar");
        jbtColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtColaboradorActionPerformed(evt);
            }
        });

        jtfFornecedor.setEditable(false);
        jtfFornecedor.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jbtPesquisaFornecedor.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtPesquisaFornecedor.setText("Buscar");
        jbtPesquisaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisaFornecedorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel3.setText("*Data Compra");

        jtfCodigo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel2.setText("*Código");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel6.setText("*Fornecedor");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel7.setText("*Colaborador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jdcDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtPesquisaFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtColaborador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtColaborador)
                            .addComponent(jtfColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtPesquisaFornecedor)
                                .addComponent(jtfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtPesquisarCompra.setText("Pesquisar Compra");
        jbtPesquisarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisarCompraActionPerformed(evt);
            }
        });

        jbtCancelar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtPesquisarCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbtPesquisarCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtNovo)
                    .addComponent(jbtAlterar)
                    .addComponent(jbtExcluir)
                    .addComponent(jbtSair)
                    .addComponent(jbtCancelar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtPesquisaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisaFornecedorActionPerformed
        buscaFornecedor();
    }//GEN-LAST:event_jbtPesquisaFornecedorActionPerformed

    private void jbtColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtColaboradorActionPerformed
        buscaColaborador();
    }//GEN-LAST:event_jbtColaboradorActionPerformed

    private void jbtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbtSairActionPerformed

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        limpaCampos();
        limpaTabela();
        jbtAlterar.setVisible(false);
        jbtExcluir.setVisible(false);
        jbtExcluirProduto.setVisible(true);
        jbtFinalizarCompra.setVisible(true);
        novaCompra();
        produtosDaCompra.removeAll(produtosDaCompra);
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jtbProdutosCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbProdutosCompraKeyPressed

        //pega tecla enter mas aplica função da tecla tab
        InputMap imap = jtbProdutosCompra.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        imap.put(KeyStroke.getKeyStroke("pressed ENTER"), "selectNextColumnCell");
        //identifica o indice da linha e coluna
        int linha = jtbProdutosCompra.getSelectedRow();
        int coluna = jtbProdutosCompra.getSelectedColumn();
        //seta o foco na celula que esta sendo editada
        jtbProdutosCompra.setSurrendersFocusOnKeystroke(true);
        //se for precionado F3 abre tela de pesquisa de produto
        if (evt.getKeyCode() == KeyEvent.VK_P) {
            buscaProduto();
        }
        try {
            //se houver um enter na coluna 2 seta a quantidade no produto
            if (evt.getKeyCode() == KeyEvent.VK_ENTER && jtbProdutosCompra.getSelectedColumn() == 2) {
                Object qtd = jtbProdutosCompra.getValueAt(linha, coluna);
                produtoDaCompra.setQuantidade(Float.parseFloat(String.valueOf(qtd)));
            } //se houver um enter na coluna 3 seta o valor UN do produto e calcula o total para a coluna 4
            else if (evt.getKeyCode() == KeyEvent.VK_ENTER && jtbProdutosCompra.getSelectedColumn() == 3) {
                Object unit = jtbProdutosCompra.getValueAt(linha, coluna);
                produtoDaCompra.setValorUnitario(Float.parseFloat(String.valueOf(unit)));
                jtbProdutosCompra.setValueAt(calculaTotalDoProduto(), linha, 4);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Preencha os campos em branco!");
        }
        //se houver um enter na coluna 4 adiciona o item da linha na lista, cria nova linha e calcula o total da venda
        if (evt.getKeyCode() == 10 && jtbProdutosCompra.getSelectedColumn() == 4) {
            produtosDaCompra.add(produtoDaCompra);
            inserirLinha();
            jtfValorCompra.setText(String.valueOf(calculaTotalCompra()));
        }

    }//GEN-LAST:event_jtbProdutosCompraKeyPressed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null,
                    "Deseja realmente excluir a compra?",
                    "Atenção!", JOptionPane.YES_NO_OPTION) == 0) {
                produtoDaCompraDao.removerAllProdutosDaCompra(produtoDaCompra);

                compraDao.remover(compra);
                novaCompra();

                produtosDaCompra.removeAll(produtosDaCompra);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!\nMotivo: "
                    + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtPesquisarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarCompraActionPerformed
        buscarCompra();
    }//GEN-LAST:event_jbtPesquisarCompraActionPerformed

    private void jbtFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFinalizarCompraActionPerformed
        //insere compra
        try {
            compra.setCodigo(Integer.valueOf(jtfCodigo.getText()));
            compra.setDataCompra(jdcDataCompra.getDate());
            try {
                compraDao.inserir(compra);
                JOptionPane.showMessageDialog(null, "Documento Salvo com Sucesso");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Salvar!\nMotivo: "
                        + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
            try {
                for (ProdutosDaCompra prod : this.produtosDaCompra) {
                    prod.setCompra(compra);
                    produtoDaCompraDao.inserir(prod);
                }
               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Salvar!\nMotivo: " 
                        + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Campo não preenchido \n" + e.getMessage());
        }

    }//GEN-LAST:event_jbtFinalizarCompraActionPerformed

    private void jbtExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirProdutoActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null,
                    "Deseja realmente excluir este produto?",
                    "Atenção!", JOptionPane.YES_NO_OPTION) == 0) {
                int linha = jtbProdutosCompra.getSelectedRow();
                produtoDaCompra = produtosDaCompra.get(linha);
                compra.setValorCompra(compra.getValorCompra() - produtoDaCompra.getValorTotal());
                produtosDaCompra.remove(produtosDaCompra.get(linha));
                ((DefaultTableModel) jtbProdutosCompra.getModel()).removeRow(linha);
                jtfValorCompra.setText(String.valueOf(compra.getValorCompra()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!\nMotivo: " 
                    + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtExcluirProdutoActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        limpaCampos();
        limpaTabela();
        jbtAlterar.setVisible(false);
        jbtExcluir.setVisible(false);
        jbtExcluirProduto.setVisible(true);
        jbtFinalizarCompra.setVisible(true);
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAlterarActionPerformed

        try {
            compra.setCodigo(Integer.valueOf(jtfCodigo.getText()));
            compra.setDataCompra(jdcDataCompra.getDate());
            try {
                compraDao.alterar(compra);
                JOptionPane.showMessageDialog(null, "Documento Salvo com Sucesso");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Salvar!\nMotivo: "
                        + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
            try {
                produtoDaCompra.setCompra(compra);
                produtoDaCompraDao.removerAllProdutosDaCompra(produtoDaCompra);
                int linha = 0;
                while (linha < jtbProdutosCompra.getRowCount() - 1) {
                    if (produtosDaCompra.get(linha) != null) {
                        produtoDaCompra = produtosDaCompra.get(linha);
                        produtoDaCompra.setCompra(compra);

                        produtoDaCompraDao.inserir(produtoDaCompra);
                    }

                    linha++;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Salvar!\nMotivo: "
                        + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Campo não preenchido \n" + e.getMessage());
        }
    }//GEN-LAST:event_jbtAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCompra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAlterar;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtColaborador;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtExcluirProduto;
    private javax.swing.JButton jbtFinalizarCompra;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtPesquisaFornecedor;
    private javax.swing.JButton jbtPesquisarCompra;
    private javax.swing.JButton jbtSair;
    private com.toedter.calendar.JDateChooser jdcDataCompra;
    private javax.swing.JTable jtbProdutosCompra;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfColaborador;
    private javax.swing.JTextField jtfFornecedor;
    private javax.swing.JLabel jtfValorCompra;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel tableModel;
    private Compra compra;
    private CompraDAO compraDao;
    private Produto produto;
    private ProdutoDAO produtoDao;
    private List<ProdutosDaCompra> produtosDaCompra;
    private ProdutosDaCompra produtoDaCompra;
    private ProdutoDaCompraDAO produtoDaCompraDao;

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    private void novaCompra() {
        setCompra(new Compra(new Fornecedor(), new Colaborador(),
                new ArrayList<ProdutosDaCompra>()));
        limpaCampos();
        compra.setValorCompra(0f);
    }

    private void limpaCampos() {
        jtfCodigo.setText("");
        jdcDataCompra.setDate(new Date());
        jtfFornecedor.setText("");
        jtfColaborador.setText("");
        jtfValorCompra.setText("");
        limpaTabela();
    }

    public void buscaFornecedor() {
        //cria a tela de busca como modal
        FramePesquisaFornecedor tela_busca = new FramePesquisaFornecedor();
        tela_busca.setModal(true);
        //exibe
        tela_busca.setVisible(true);
        //recupera os dados
        Fornecedor f = new Fornecedor();
        f = tela_busca.retornaFornecedor();
        this.compra.setFornecedor(f);
        //seta na tela
        if (compra.getFornecedor() != null) {
            jtfFornecedor.setText(compra.getFornecedor().getRazaoSocial());
        }
    }

    public void buscaColaborador() {
        //cria a tela de busca como modal
        FramePesquisaColaborador tela_busca = new FramePesquisaColaborador();
        tela_busca.setModal(true);
        //exibe
        tela_busca.setVisible(true);
        //recupera os dados
        Colaborador c = new Colaborador();
        c = tela_busca.retornaColaborador();
        this.compra.setColaborador(c);
        //seta na tela
        if (compra.getColaborador() != null) {
            jtfColaborador.setText(compra.getColaborador().getPessoa().getNome());
        }
    }

    public void buscaProduto() {
        //instancia produto
        Produto p = new Produto();
        //instancia produto da compra
        produtoDaCompra = new ProdutosDaCompra();
        //cria a tela de busca como modal
        FramePesquisaProduto tela_busca = new FramePesquisaProduto();
        tela_busca.setModal(true);
        //exibe a tela de pesquisa do produto
        tela_busca.setVisible(true);
        //recupera os dados
        p = tela_busca.retornaProduto();
        //seta o produto para o produto da compra
        produtoDaCompra.setProduto(p);
        //seta na tela o produto da compra
        if (produtoDaCompra.getProduto() != null) {
            Integer linhaSelecionada = jtbProdutosCompra.getSelectedRow();
            jtbProdutosCompra.setValueAt(p.getCodigo(), linhaSelecionada, 0);
            jtbProdutosCompra.setValueAt(p.getDescricao(), linhaSelecionada, 1);
            jtbProdutosCompra.setValueAt(p.getPrecoVenda(), linhaSelecionada, 3);
        }
    }

    public void buscarCompra() {
        produtoDaCompra = new ProdutosDaCompra();
        //cria a tela de busca como modal
        FramePesquisaCompra tela_busca = new FramePesquisaCompra();
        tela_busca.setModal(true);
        //exibe
        tela_busca.setVisible(true);
        //recupera os dados
        Compra comp = new Compra();
        comp = tela_busca.retornaCompra();
        //seta na tela
        if (comp != null) {
            limpaCampos();
            limpaTabela();
            jbtAlterar.setVisible(true);
            jbtExcluir.setVisible(true);
            jbtExcluirProduto.setVisible(true);
            jbtFinalizarCompra.setVisible(false);

            this.compra.setCodigo(comp.getCodigo());
            this.compra.setDataCompra(comp.getDataCompra());
            this.compra.setFornecedor(comp.getFornecedor());
            this.compra.setColaborador(comp.getColaborador());
            this.compra.setValorCompra(comp.getValorCompra());
            produtoDaCompra.setCompra(comp);

            jtfCodigo.setText(String.valueOf(compra.getCodigo()));
            jdcDataCompra.setDate(compra.getDataCompra());
            jtfFornecedor.setText(compra.getFornecedor().getPessoa().getNome());
            jtfColaborador.setText(compra.getColaborador().getPessoa().getNome());

            produtosDaCompra = produtoDaCompraDao.buscarPorCompra(this.compra);

            int linha = 0;
            for (ProdutosDaCompra prods : produtosDaCompra) {
                jtbProdutosCompra.getModel().setValueAt(prods.getProduto().getCodigo(), linha, 0);
                jtbProdutosCompra.getModel().setValueAt(prods.getProduto().getDescricao(), linha, 1);
                jtbProdutosCompra.getModel().setValueAt(prods.getQuantidade(), linha, 2);
                jtbProdutosCompra.getModel().setValueAt(prods.getValorUnitario(), linha, 3);
                jtbProdutosCompra.getModel().setValueAt(prods.getValorTotal(), linha, 4);
                linha++;
                inserirLinha();
            }
            jtfValorCompra.setText(String.valueOf(this.compra.getValorCompra()));
        }
    }

    private Float calculaTotalDoProduto() {
        Float preco;
        Float quant;
        Float total = null;
        preco = produtoDaCompra.getValorUnitario();
        quant = produtoDaCompra.getQuantidade();
        total = quant * preco;
        produtoDaCompra.setValorTotal(total);
        return produtoDaCompra.getValorTotal();
    }

    private Float calculaTotalCompra() {
        compra.setValorCompra(produtoDaCompra.getValorTotal() + compra.getValorCompra());
        return compra.getValorCompra();
    }

    private void inserirLinha() {
        int linha = jtbProdutosCompra.getSelectedRow();
        ((DefaultTableModel) jtbProdutosCompra.getModel()).addRow(new Vector());
        int coluna = -1;
        jtbProdutosCompra.changeSelection(linha, coluna, false, false);
    }

    private void limpaTabela() {
        ((DefaultTableModel) jtbProdutosCompra.getModel()).setNumRows(0);
        jtbProdutosCompra.updateUI();
        inserirLinha();
    }
}
