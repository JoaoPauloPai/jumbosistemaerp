package adm.com.jumbo.cadastros.cliente;

import adm.com.jumbo.cadastros.java.UsuarioVO;
import adm.com.jumbo.padrao.java.Biblioteca;
import adm.com.jumbo.padrao.java.Constantes;
import javax.swing.JOptionPane;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOResponse;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.util.client.ClientUtils;
import org.openswing.swing.util.java.Consts;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Classe de controle da tela UsuarioDetalhe.</p>
 *
 * <p>The MIT License</p>
 *
 * <p>Copyright: Copyright (C) 2010 T2Ti.COM
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
 *            t2ti.com@gmail.com</p>
 *
 * @author Claudio de Barros (t2ti.com@gmail.com)
 * @version 1.0
 */
public class UsuarioDetalheController extends FormController {

    private UsuarioDetalhe usuarioDetalhe = null;
    private String pk = null;
    private UsuarioGrid usuarioGrid = null;
    private String acaoServidor;

    public UsuarioDetalheController(UsuarioGrid usuarioGrid, String pk) {
        this.usuarioGrid = usuarioGrid;
        this.pk = pk;
        this.acaoServidor = "usuarioDetalheAction";
        usuarioDetalhe = new UsuarioDetalhe(this);
        usuarioDetalhe.setParentFrame(this.usuarioGrid);
        this.usuarioGrid.pushFrame(usuarioDetalhe);
        MDIFrame.add(usuarioDetalhe);

        if (pk != null) {
            usuarioDetalhe.getForm1().setMode(Consts.READONLY);
            usuarioDetalhe.getForm1().reload();
        } else {
            usuarioDetalhe.getForm1().setMode(Consts.INSERT);
        }
    }

    @Override
    public Response loadData(Class valueObjectClass) {
        Response res = ClientUtils.getData(acaoServidor, new Object[]{Constantes.LOAD, pk});
        if (!res.isError()) {
            UsuarioVO usuario = (UsuarioVO) ((VOResponse) res).getVo();
            usuario.setSenha(null);
        }
        return res;
    }

    @Override
    public Response insertRecord(ValueObject newPersistentObject) throws Exception {
        UsuarioVO usuario = (UsuarioVO) newPersistentObject;
        if (usuario.getSenha() != null) {
            if (!usuario.getSenha().equals("")) {
                usuario.setSenha(Biblioteca.MD5String(usuario.getLogin() + usuario.getSenha()));
            } else {
                return new ErrorResponse("É necessário definir uma senha para o usuário!");
            }
        }

        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.INSERT, newPersistentObject});
    }

    @Override
    public void afterInsertData() {
        usuarioGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(usuarioDetalhe, "Dados salvos com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
        usuarioDetalhe.dispose();
    }

    @Override
    public Response updateRecord(ValueObject oldPersistentObject, ValueObject persistentObject) throws Exception {
        UsuarioVO usuario = (UsuarioVO) persistentObject;
        if (usuario.getSenha() != null) {
            if (!usuario.getSenha().equals("")) {
                usuario.setSenha(Biblioteca.MD5String(usuario.getLogin() + usuario.getSenha()));
         //   } else {
             //   usuario.setSenha(usuario.getSenhaAnterior());
            }
        }
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.UPDATE, oldPersistentObject, persistentObject});
    }

    @Override
    public void afterEditData() {
        usuarioGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(usuarioDetalhe, "Dados alterados com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
        usuarioDetalhe.dispose();
    }
}
