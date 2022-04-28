package adm.com.jumbo.cadastros.cliente;

import adm.com.jumbo.cadastros.java.PapelFuncaoVO;
import adm.com.jumbo.cadastros.java.PapelVO;
import adm.com.jumbo.padrao.java.Constantes;
import java.util.List;
import javax.swing.JOptionPane;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.util.client.ClientUtils;
import org.openswing.swing.util.java.Consts;

/**
* <p>Title: T2Ti ERP</p>
* <p>Description: Classe de controle da tela PapelDetalhe.</p>
*
* <p>The MIT License</p>
*
* <p>Copyright: Copyright (C) 2010 JUMBO SISTEMAS
*
* Permission is hereby granted, free of charge, to any person
* obtaining a copy of this software and associated documentation
* files (the "Software"), to deal in the Software without
* restriction, including without limitation the rights to use,
* copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the
* Software is furnished to do so, subject to the following
* conditions:
*
* The above copyright notice and this permission notice shall be
* included in all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
* EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
* OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
* NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
* HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
* WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
* FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
* OTHER DEALINGS IN THE SOFTWARE.
*
*        The author may be contacted at:
*            jumbosistemas@gmail.com</p>
*
* @author Claudio de Barros (jumbosistemas@gmail.com)
* @version 1.0
*/
public class PapelDetalheController extends FormController {

    private PapelDetalhe papelDetalhe = null;
    private String pk = null;
    private PapelGrid papelGrid = null;
    private String acaoServidor;

    public PapelDetalheController(PapelGrid papelGrid, String pk) {
        this.papelGrid = papelGrid;
        this.pk = pk;
        this.acaoServidor = "papelDetalheAction";
        papelDetalhe = new PapelDetalhe(this);
        papelDetalhe.setParentFrame(this.papelGrid);
        this.papelGrid.pushFrame(papelDetalhe);
        MDIFrame.add(papelDetalhe);

        if (pk != null) {
            papelDetalhe.getForm1().setMode(Consts.READONLY);
            papelDetalhe.getForm1().reload();
        } else {
            papelDetalhe.getForm1().setMode(Consts.INSERT);
            papelDetalhe.getGridControl1().reloadData();
        }
    }

    @Override
    public Response loadData(Class valueObjectClass) {
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.LOAD, pk});
    }

    @Override
    public void loadDataCompleted(boolean error) {
        PapelVO papel = (PapelVO) papelDetalhe.getForm1().getVOModel().getValueObject();
        this.pk = papel.getId().toString();

        papelDetalhe.getGridController().setPk(pk);
        papelDetalhe.getGridControl1().reloadData();
    }

    @Override
    public void createPersistentObject(ValueObject PersistentObject) throws Exception {
        PapelVO papel = (PapelVO) PersistentObject;
        papel.setAcessoCompleto("N");
    }

    @Override
    public Response insertRecord(ValueObject newPersistentObject) throws Exception {
        List<PapelFuncaoVO> funcoes = papelDetalhe.getGridControl1().getVOListTableModel().getDataVector();

        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.INSERT, newPersistentObject, funcoes});
    }

    @Override
    public void afterInsertData() {
        papelGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(papelDetalhe, "Dados salvos com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public Response updateRecord(ValueObject oldPersistentObject, ValueObject persistentObject) throws Exception {
        List<PapelFuncaoVO> funcoes = papelDetalhe.getGridControl1().getVOListTableModel().getDataVector();
        
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.UPDATE, oldPersistentObject, persistentObject, funcoes});
    }

    @Override
    public void afterEditData() {
        papelGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(papelDetalhe, "Dados alterados com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }
}