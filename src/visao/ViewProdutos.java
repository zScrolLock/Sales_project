/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ProdutoControle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Caixa;
import modelo.Produto;
import modelo.ProdutoStatus;
import modelo.ProdutoTipo;
import modelo.Usuario;

/**
 *
 * @author zscrollock
 */
public class ViewProdutos extends javax.swing.JDialog {

    private Usuario user;
    private Caixa caixa;
    /**
     * Creates new form ViewProdutos
     */
    public ViewProdutos(java.awt.Frame parent, boolean modal, Usuario user, Caixa caixa) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.user = user;
        this.caixa = caixa;
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent we){
                ProdutoControle prod_cotrol = new ProdutoControle();
                DefaultTableModel produtosTable = (DefaultTableModel) jTable1.getModel();
                List<Produto> lista_produto = prod_cotrol.findAllOrder();
                
                for(Produto p : lista_produto){
                    produtosTable.addRow(new Object[]{p.getIdProduto(), p.getNome(), p.getPreco(), p.getQuantidade()});
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_nome = new javax.swing.JTextField();
        jTextField_cod = new javax.swing.JTextField();
        jTextField_preco = new javax.swing.JTextField();
        jTextField_qnt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton_ali = new javax.swing.JRadioButton();
        jRadioButton_geral = new javax.swing.JRadioButton();
        jRadioButton_emb = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Estoque");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??digo", "Nome", "Pre??o", "Quantidade"
            }
        ));
        jTable1.setFocusable(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adicionar produto");

        jTextField_nome.setText("Nome do Produto");
        jTextField_nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_nomeFocusGained(evt);
            }
        });

        jTextField_cod.setText("C??digo do Produto");
        jTextField_cod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_codFocusGained(evt);
            }
        });

        jTextField_preco.setText("Pre??o do Produto");
        jTextField_preco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_precoFocusGained(evt);
            }
        });

        jTextField_qnt.setText("Quantidade do Produto");
        jTextField_qnt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_qntFocusGained(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Adicionar Produto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo do Produto");

        buttonGroup1.add(jRadioButton_ali);
        jRadioButton_ali.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_ali.setSelected(true);
        jRadioButton_ali.setText("Alimenticio");

        buttonGroup1.add(jRadioButton_geral);
        jRadioButton_geral.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_geral.setText("Geral");

        buttonGroup1.add(jRadioButton_emb);
        jRadioButton_emb.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_emb.setText("Embalagem");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton_ali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton_emb))
                    .addComponent(jRadioButton_geral))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_ali)
                    .addComponent(jRadioButton_emb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_geral)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_nome)
                            .addComponent(jTextField_cod)
                            .addComponent(jTextField_preco)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_qnt)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_qnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTextField_cod.getAccessibleContext().setAccessibleName("C??digo do Produto");
        jTextField_cod.getAccessibleContext().setAccessibleDescription("Digite o Codigo do Produto");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Clique aqui para remover ou Alterar um Produto");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Alterar ou Remover");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Menu principal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ProdutoControle prod_cotrol = new ProdutoControle();
        DefaultTableModel produtosTable = (DefaultTableModel) jTable1.getModel();
        List<Produto> lista_produto = prod_cotrol.findAllOrder();
        produtosTable.setRowCount(0);
                
        for(Produto p : lista_produto){
            produtosTable.addRow(new Object[]{p.getIdProduto(), p.getNome(), p.getPreco(), p.getQuantidade()});
        }
        jTextField_cod.setText("C??digo do Produto");
        jTextField_nome.setText("Nome do Produto");
        jTextField_preco.setText("Pre??o do Produto");
        jTextField_qnt.setText("Quantidade do Produto");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        List<Produto> lista;
        String nome = jTextField_nome.getText();
        int codigo = Integer.parseInt(jTextField_cod.getText());
        float preco = Float.parseFloat(jTextField_preco.getText());
        int quantide = Integer.parseInt(jTextField_qnt.getText());
        Produto prod = new Produto();
        ProdutoControle prod_control = new ProdutoControle();
        
        if(!nome.equals("") || !jTextField_cod.getText().equals("") || !jTextField_preco.getText().equals("") || !jTextField_qnt.getText().equals("")){
            if(!nome.equals(" ") || !jTextField_cod.getText().equals(" ") || !jTextField_preco.getText().equals(" ") || !jTextField_qnt.getText().equals(" ")){
                prod.setIdProduto(codigo);
                prod.setNome(nome);
                prod.setPreco(preco);
                prod.setQuantidade(quantide);
                prod.setQuantidade_min(3);
                prod.setStatus(ProdutoStatus.DISPONIVEL);
                
                if(jRadioButton_ali.isSelected()){
                    prod.setTipo(ProdutoTipo.ALIMENTICIO);
                }else if(jRadioButton_geral.isSelected()){
                    prod.setTipo(ProdutoTipo.GERAL);
                }else if(jRadioButton_emb.isSelected()){
                    prod.setTipo(ProdutoTipo.EMBALAGENS);
                }else{
                   JOptionPane.showMessageDialog(null, "Selecione o tipo do Produto", "Alerta", JOptionPane.WARNING_MESSAGE); 
                }
                lista = prod_control.findByCode(codigo);
                    if(lista.isEmpty()){
                        prod_control.inserir(prod);
                        JOptionPane.showMessageDialog(null, "Produto inserido com sucesso", "Informa????o", JOptionPane.INFORMATION_MESSAGE);
                        jTextField_cod.setText("");
                        jTextField_nome.setText("");
                        jTextField_preco.setText("");
                        jTextField_qnt.setText("");
                        buttonGroup1.clearSelection();
                    }else{
                        JOptionPane.showMessageDialog(null, "C??digo j?? Existente", "Alerta", JOptionPane.WARNING_MESSAGE);
                        jTextField_cod.setText("");
                        jTextField_cod.requestFocus();
                    }                               
            }else{
                JOptionPane.showMessageDialog(null, "Campos incompletos", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campos incompletos", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_codFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_codFocusGained
        // TODO add your handling code here:
        jTextField_cod.setText("");
    }//GEN-LAST:event_jTextField_codFocusGained

    private void jTextField_nomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_nomeFocusGained
        // TODO add your handling code here:
        jTextField_nome.setText("");
    }//GEN-LAST:event_jTextField_nomeFocusGained

    private void jTextField_precoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_precoFocusGained
        // TODO add your handling code here:
        jTextField_preco.setText("");
    }//GEN-LAST:event_jTextField_precoFocusGained

    private void jTextField_qntFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_qntFocusGained
        // TODO add your handling code here:
        jTextField_qnt.setText("");
    }//GEN-LAST:event_jTextField_qntFocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ViewProdutos_2 tela_prod_2 = new ViewProdutos_2(null, false, user, caixa);
        tela_prod_2.setTitle("Controle de Produtos - Software GEP");
        tela_prod_2.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ViewMenuPrincipal menu = new ViewMenuPrincipal(null, false, user, caixa);
        menu.setTitle("Menu principal - Software GEP");
        menu.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton_ali;
    private javax.swing.JRadioButton jRadioButton_emb;
    private javax.swing.JRadioButton jRadioButton_geral;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_cod;
    private javax.swing.JTextField jTextField_nome;
    private javax.swing.JTextField jTextField_preco;
    private javax.swing.JTextField jTextField_qnt;
    // End of variables declaration//GEN-END:variables
}
