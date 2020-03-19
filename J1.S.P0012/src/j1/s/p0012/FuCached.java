/*
 * Name: Vo Nhu Khang
 * Class: SE1403
 * MSSV: DE140179
 */
package j1.s.p0012;

import java.util.Date;

/**
 *
 * @author khangvn
 */
public class FuCached {

    private Object data;
    private Date ExpiredDate;

    public FuCached() {
    }

    public FuCached(Object data, Date ExpiredDate) {
        this.data = data;
        this.ExpiredDate = ExpiredDate;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Date getExpiredDate() {
        return ExpiredDate;
    }

    public void setExpiredDate(Date ExpiredDate) {
        this.ExpiredDate = ExpiredDate;
    }

    
}
