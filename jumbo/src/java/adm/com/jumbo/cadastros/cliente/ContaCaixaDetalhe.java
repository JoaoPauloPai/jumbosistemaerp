/*
 * The MIT License
 * 
 * Copyright: Copyright (C) 2014 JUMBO SISTEMAS
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * 
 * The author may be contacted at: jumbosistemas@gmail.com
 *
 * @author Joao Paulo Gomes (jumbo.com)
 * @version 2.0
 */
package adm.com.jumbo.cadastros.cliente;

import adm.com.jumbo.padrao.cliente.LookupDataLocatorGenerico;
import java.awt.Dimension;
import org.openswing.swing.lookup.client.LookupController;
import org.openswing.swing.mdi.client.InternalFrame;

public class ContaCaixaDetalhe extends InternalFrame {

    private LookupController contaContabilController = new LookupController();
    private LookupController agenciaController = new LookupController();

    public ContaCaixaDetalhe(ContaCaixaDetalheController controller) {
        initComponents();

        form1.setFormController(controller);

        /*
         * Configurações do lookup da conta contabil
         */
        contaContabilController.setLookupValueObjectClassName("adm.com.jumbo.contabilidade.java.ContabilContaVO");
        contaContabilController.addLookup2ParentLink("id", "contabilConta.id");
        contaContabilController.addLookup2ParentLink("descricao", "contabilConta.descricao");
        contaContabilController.setHeaderColumnName("id", "ID");
        contaContabilController.setHeaderColumnName("descricao", "Descrição");
        contaContabilController.setFrameTitle("Importa Conta Contábil");

        contaContabilController.setVisibleStatusPanel(true);
        contaContabilController.setVisibleColumn("id", true);
        contaContabilController.setVisibleColumn("descricao", true);
        contaContabilController.setFramePreferedSize(new Dimension(600, 500));

        contaContabilController.setLookupDataLocator(new LookupDataLocatorGenerico(contaContabilController.getLookupValueObjectClassName()));
        codLookupControl2.setLookupController(contaContabilController);

        /*
         * Configurações do lookup da agencia banco
         */
        agenciaController.setLookupValueObjectClassName("adm.com.jumbo.cadastros.java.AgenciaBancoVO");
        agenciaController.addLookup2ParentLink("id", "agenciaBanco.id");
        agenciaController.addLookup2ParentLink("nome", "agenciaBanco.nome");
        agenciaController.setHeaderColumnName("id", "ID");
        agenciaController.setHeaderColumnName("nome", "Nome");
        agenciaController.setFrameTitle("Importa Agência Banco");

        agenciaController.setVisibleStatusPanel(true);
        agenciaController.setVisibleColumn("id", true);
        agenciaController.setVisibleColumn("nome", true);
        agenciaController.setFramePreferedSize(new Dimension(600, 500));

        agenciaController.setLookupDataLocator(new LookupDataLocatorGenerico(agenciaController.getLookupValueObjectClassName()));
        codLookupControl4.setLookupController(agenciaController);

    }

    /**
     * @return the form1
     */
    public org.openswing.swing.form.client.Form getForm1() {
        return form1;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        editButton1 = new org.openswing.swing.client.EditButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        saveButton1 = new org.openswing.swing.client.SaveButton();
        form1 = new org.openswing.swing.form.client.Form();
        labelControl1 = new org.openswing.swing.client.LabelControl();
        codLookupControl2 = new org.openswing.swing.client.CodLookupControl();
        textControl2 = new org.openswing.swing.client.TextControl();
        labelControl3 = new org.openswing.swing.client.LabelControl();
        codLookupControl4 = new org.openswing.swing.client.CodLookupControl();
        textControl4 = new org.openswing.swing.client.TextControl();
        labelControl5 = new org.openswing.swing.client.LabelControl();
        textControl5 = new org.openswing.swing.client.TextControl();
        labelControl6 = new org.openswing.swing.client.LabelControl();
        labelControl7 = new org.openswing.swing.client.LabelControl();
        textControl7 = new org.openswing.swing.client.TextControl();
        labelControl8 = new org.openswing.swing.client.LabelControl();
        labelControl9 = new org.openswing.swing.client.LabelControl();
        comboBoxControl9 = new org.openswing.swing.client.ComboBoxControl();
        textControl6 = new org.openswing.swing.client.TextControl();
        textAreaControl1 = new org.openswing.swing.client.TextAreaControl();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("JUMBO - Cadastros");
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta Caixa"));
        jPanel1.setLayout(new java.awt.FlowLayout(0));
        jPanel1.add(editButton1);
        jPanel1.add(reloadButton1);
        jPanel1.add(saveButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        form1.setVOClassName("adm.com.jumbo.cadastros.java.ContaCaixaVO");
        form1.setEditButton(editButton1);
        form1.setFunctionId("contaCaixa");
        form1.setReloadButton(reloadButton1);
        form1.setSaveButton(saveButton1);
        form1.setLayout(new java.awt.GridBagLayout());

        labelControl1.setLabel("Contabil Conta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        form1.add(labelControl1, gridBagConstraints);

        codLookupControl2.setAllowOnlyNumbers(true);
        codLookupControl2.setAttributeName("contabilConta.id");
        codLookupControl2.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = -70;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        form1.add(codLookupControl2, gridBagConstraints);

        textControl2.setAttributeName("contabilConta.descricao");
        textControl2.setEnabled(false);
        textControl2.setEnabledOnEdit(false);
        textControl2.setEnabledOnInsert(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        form1.add(textControl2, gridBagConstraints);

        labelControl3.setLabel("Agencia Banco:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        form1.add(labelControl3, gridBagConstraints);

        codLookupControl4.setAttributeName("idagenciabanco.id");
        codLookupControl4.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = -70;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        form1.add(codLookupControl4, gridBagConstraints);

        textControl4.setAttributeName("agenciaBanco.nome");
        textControl4.setEnabled(false);
        textControl4.setEnabledOnEdit(false);
        textControl4.setEnabledOnInsert(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        form1.add(textControl4, gridBagConstraints);

        labelControl5.setLabel("Codigo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        form1.add(labelControl5, gridBagConstraints);

        textControl5.setAttributeName("codigo");
        textControl5.setEnabled(false);
        textControl5.setMaxCharacters(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        form1.add(textControl5, gridBagConstraints);

        labelControl6.setLabel("Digito:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        form1.add(labelControl6, gridBagConstraints);

        labelControl7.setLabel("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        form1.add(labelControl7, gridBagConstraints);

        textControl7.setAttributeName("nome");
        textControl7.setEnabled(false);
        textControl7.setLinkLabel(labelControl7);
        textControl7.setMaxCharacters(50);
        textControl7.setRequired(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        form1.add(textControl7, gridBagConstraints);

        labelControl8.setLabel("Descricao:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        form1.add(labelControl8, gridBagConstraints);

        labelControl9.setLabel("Tipo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        form1.add(labelControl9, gridBagConstraints);

        comboBoxControl9.setAttributeName("tipo");
        comboBoxControl9.setDomainId("tipoContaCaixa");
        comboBoxControl9.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        form1.add(comboBoxControl9, gridBagConstraints);

        textControl6.setAttributeName("digito");
        textControl6.setEnabled(false);
        textControl6.setMaxCharacters(1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        form1.add(textControl6, gridBagConstraints);

        textAreaControl1.setAttributeName("descricao");
        textAreaControl1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        form1.add(textAreaControl1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        form1.add(jSeparator1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(form1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.client.CodLookupControl codLookupControl2;
    private org.openswing.swing.client.CodLookupControl codLookupControl4;
    private org.openswing.swing.client.ComboBoxControl comboBoxControl9;
    private org.openswing.swing.client.EditButton editButton1;
    private org.openswing.swing.form.client.Form form1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private org.openswing.swing.client.LabelControl labelControl1;
    private org.openswing.swing.client.LabelControl labelControl3;
    private org.openswing.swing.client.LabelControl labelControl5;
    private org.openswing.swing.client.LabelControl labelControl6;
    private org.openswing.swing.client.LabelControl labelControl7;
    private org.openswing.swing.client.LabelControl labelControl8;
    private org.openswing.swing.client.LabelControl labelControl9;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.client.SaveButton saveButton1;
    private org.openswing.swing.client.TextAreaControl textAreaControl1;
    private org.openswing.swing.client.TextControl textControl2;
    private org.openswing.swing.client.TextControl textControl4;
    private org.openswing.swing.client.TextControl textControl5;
    private org.openswing.swing.client.TextControl textControl6;
    private org.openswing.swing.client.TextControl textControl7;
    // End of variables declaration//GEN-END:variables

}
