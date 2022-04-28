//*
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
 * @author João Paulo Gomes (jumbo.com)
 * @version 2.0
 */
package adm.com.jumbo.cadastros.cliente;

import adm.com.jumbo.padrao.java.Constantes;
import javax.swing.JOptionPane;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.util.client.ClientUtils;
import org.openswing.swing.util.java.Consts;

public class TransportadoraDetalheController extends FormController {

    private TransportadoraDetalhe transportadoraDetalhe = null;
    private String pk = null;
    private TransportadoraGrid transportadoraGrid = null;
    private String acaoServidor;

    public TransportadoraDetalheController(TransportadoraGrid transportadoraGrid, String pk) {
        this.transportadoraGrid = transportadoraGrid;
        this.pk = pk;
        this.acaoServidor = "transportadoraDetalheAction";
        transportadoraDetalhe = new TransportadoraDetalhe(this);
        transportadoraDetalhe.setParentFrame(this.transportadoraGrid);
        this.transportadoraGrid.pushFrame(transportadoraDetalhe);
        MDIFrame.add(transportadoraDetalhe);

        if (pk != null) {
            transportadoraDetalhe.getForm1().setMode(Consts.READONLY);
            transportadoraDetalhe.getForm1().reload();
        } else {
            transportadoraDetalhe.getForm1().setMode(Consts.INSERT);
        }
    }

    @Override
    public Response loadData(Class valueObjectClass) {
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.LOAD, pk});
    }

    @Override
    public Response insertRecord(ValueObject newPersistentObject) throws Exception {
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.INSERT, newPersistentObject});
    }

    @Override
    public void afterInsertData() {
        transportadoraGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(transportadoraDetalhe, "Dados salvos com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public Response updateRecord(ValueObject oldPersistentObject, ValueObject persistentObject) throws Exception {
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.UPDATE, oldPersistentObject, persistentObject});
    }

    @Override
    public void afterEditData() {
        transportadoraGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(transportadoraDetalhe, "Dados alterados com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }
}
