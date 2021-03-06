/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import bd.MarcaDAO;
import entidades.Marca;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson, Emile, Gustavo, Maira
 */
public class FrameProp extends javax.swing.JFrame {

    private JFrame origem;
    private MarcaDAO marcaDAO;
    /**
     * Creates new form FrameMarcas
     */
    public FrameProp(JFrame origem) {
        initComponents();
        this.origem = origem;
        marcaDAO = new MarcaDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        ConsultarPropriedade = new javax.swing.JLabel();
        AlterarPropriedade = new javax.swing.JLabel();
        InserirPropriedade = new javax.swing.JLabel();
        ExcluirPropriedade = new javax.swing.JLabel();
        BuscarCodigoProprietario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        VoltarCidade = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Proprietário"));

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        ConsultarPropriedade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/consultar.png"))); // NOI18N
        ConsultarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConsultarPropriedade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultarPropriedadeMouseClicked(evt);
            }
        });

        AlterarPropriedade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/atualizar.png"))); // NOI18N
        AlterarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AlterarPropriedade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlterarPropriedadeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AlterarPropriedadeMouseEntered(evt);
            }
        });

        InserirPropriedade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inserir.png"))); // NOI18N
        InserirPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InserirPropriedade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InserirPropriedadeMouseClicked(evt);
            }
        });

        ExcluirPropriedade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancelar.png"))); // NOI18N
        ExcluirPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExcluirPropriedade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExcluirPropriedadeMouseClicked(evt);
            }
        });

        BuscarCodigoProprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        BuscarCodigoProprietario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarCodigoProprietario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarCodigoProprietarioMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cadastroproprietario.png"))); // NOI18N

        VoltarCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/voltar.png"))); // NOI18N
        VoltarCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltarCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarCidadeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                            .addComponent(txtNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarCodigoProprietario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(InserirPropriedade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExcluirPropriedade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AlterarPropriedade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConsultarPropriedade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VoltarCidade)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(BuscarCodigoProprietario))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InserirPropriedade)
                    .addComponent(ExcluirPropriedade)
                    .addComponent(ConsultarPropriedade)
                    .addComponent(AlterarPropriedade)
                    .addComponent(VoltarCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            this.origem.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_formKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
         this.origem.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing
        public int getID(){
        int numero = Integer.parseInt(txtCodigo.getText());
        return numero;
    }
    public Marca exibe(){
        Marca marca = new Marca();
        txtNome.setText(marca.getNomeMarca());
        
        return marca;
    }
    
    private void ConsultarPropriedadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarPropriedadeMouseClicked
        // TODO add your handling code here:
         marcaDAO.busca(getID());
        exibe();
    }//GEN-LAST:event_ConsultarPropriedadeMouseClicked

    private void AlterarPropriedadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlterarPropriedadeMouseClicked
        Marca marca = leCampos();
        marcaDAO.alterar(marca);
    }//GEN-LAST:event_AlterarPropriedadeMouseClicked

    private void InserirPropriedadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InserirPropriedadeMouseClicked
       Marca marca = leCampos();
        marcaDAO.inserir(marca);   
        JOptionPane.showMessageDialog(this,"Inserido proprietário, com sucesso!");
        limpa();
    }//GEN-LAST:event_InserirPropriedadeMouseClicked

    private void ExcluirPropriedadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExcluirPropriedadeMouseClicked
        // TODO add your handling code here:
       int codMarca = Integer.parseInt(txtCodigo.getText());
        if(marcaDAO.excluir(codMarca)>0){
            JOptionPane.showMessageDialog(null,"Excluído");
        }else{
            JOptionPane.showMessageDialog(null,"Não excluído");
        }
    }//GEN-LAST:event_ExcluirPropriedadeMouseClicked

    private void AlterarPropriedadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlterarPropriedadeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AlterarPropriedadeMouseEntered

    private void BuscarCodigoProprietarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarCodigoProprietarioMouseClicked
        // TODO add your handling code here:
         int codMarca = Integer.parseInt(txtCodigo.getText());
        Marca marca = marcaDAO.busca(codMarca);
        if(marca!=null){
            txtNome.setText(marca.getNomeMarca());
        }else{
            JOptionPane.showMessageDialog(null,"Não encontrado");
        }
    }//GEN-LAST:event_BuscarCodigoProprietarioMouseClicked

    private void VoltarCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarCidadeMouseClicked
        // TODO add your handling code here:
        origem.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VoltarCidadeMouseClicked

    private Marca leCampos(){
        Marca marca = new Marca();
        int codMarca = Integer.parseInt(txtCodigo.getText());
        marca.setCodMarca(codMarca);
        marca.setNomeMarca(txtNome.getText());
        return marca;
    }
  
    public void limpa(){
     txtCodigo.setText("");
     txtNome.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlterarPropriedade;
    private javax.swing.JLabel BuscarCodigoProprietario;
    private javax.swing.JLabel ConsultarPropriedade;
    private javax.swing.JLabel ExcluirPropriedade;
    private javax.swing.JLabel InserirPropriedade;
    private javax.swing.JLabel VoltarCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
