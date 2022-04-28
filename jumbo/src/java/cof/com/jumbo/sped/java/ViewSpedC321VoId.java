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
package cof.com.jumbo.sped.java;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "view_sped_c321")
public class ViewSpedC321VoId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private ViewSpedC321VO viewC321Vo;

    /**
     * @return the viewC321Vo
     */
    public ViewSpedC321VO getViewC321Vo() {
        return viewC321Vo;
    }

    /**
     * @param viewC321Vo the viewC321Vo to set
     */
    public void setViewC321Vo(ViewSpedC321VO viewC321Vo) {
        this.viewC321Vo = viewC321Vo;
    }
}
