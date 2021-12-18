/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package adm.com.jumbo.cadastros.servidor;

import adm.com.jumbo.padrao.servidor.HibernateUtil;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.type.Type;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.send.java.GridParams;
import org.openswing.swing.server.Action;
import org.openswing.swing.server.UserSessionParameters;
import org.openswing.swing.util.server.HibernateUtils;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Importação dos dados do papel.</p>
 *
 * <p>The MIT License</p>
 *
 * <p>Copyright: Copyright (C) 2010 T2Ti.COM</p>
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
 *       The author may be contacted at:
 *           t2ti.com@gmail.com</p>
 *
 * @author Claudio de Barros (T2Ti.COM)
 * @version 1.0
 */
public class ImportaPapelAction implements Action{

    public ImportaPapelAction() {
    }

    /**
     * @return request name
     */
    public final String getRequestName() {
        return "importaPapel";
    }

    /**
     * Business logic to execute.
     */
    public final Response executeCommand(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        Session session = null;
        String baseSQL = "select PAPEL from adm.com.jumbo.cadastros.java.PapelVO as PAPEL";
        try {
            GridParams pars = new GridParams();
            session = HibernateUtil.getSessionFactory().openSession();
            Response res = HibernateUtils.getAllFromQuery(
                    pars.getFilteredColumns(),
                    pars.getCurrentSortedColumns(),
                    pars.getCurrentSortedVersusColumns(),
                    adm.com.jumbo.cadastros.java.PapelVO.class,
                    baseSQL,
                    new Object[0],
                    new Type[0],
                    "PAPEL",
                    HibernateUtil.getSessionFactory(),
                    session);
            return res;

        } catch (Exception ex) {
            return new ErrorResponse(ex.getMessage());
        } finally {
            try {
                session.close();
            } catch (Exception ex1) {
            }
        }
    }
}