/*
 * Name: Vo Nhu Khang
 * Class: SE1403
 * MSSV: DE140179
 */
package j1.s.p0012;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 *
 * @author khangvn
 */
public class FuMemoryCached {

    private static final HashMap<String, FuCached> cached = new HashMap<>();

    public boolean putObject(String key, Object object, int timeTolive) {
        synchronized (cached) {
            if (!cached.containsKey(key)) {
                Calendar calendar = new GregorianCalendar();
                calendar.add(Calendar.DATE, timeTolive);
                cached.put(key.toUpperCase(), new FuCached(object, calendar.getTime()));
            }
            HashMap<String, FuCached> cached1 = cached;
            return true;
        }
    }

    public Object getObject(String key) {
        synchronized (cached) {
            Date date = new Date();
            if (cached.containsKey(key.toUpperCase())) {
                if (cached.get(key.toUpperCase()).getExpiredDate().before(date)) {
                    cached.remove(key.toUpperCase());
                    return null;
                } else {
                    Object obj = cached.get(key.toUpperCase()).getData();
                    return obj;
                }
            } else {
                return null;
            }
        }
    }

    public boolean clean(String key) {
        synchronized (cached) {
            try {
                cached.remove(key.toUpperCase());
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }

    public boolean cleanAll() {
        synchronized (cached) {
            if (cached.isEmpty()) {
                return false;
            }
            cached.clear();
            return true;
        }
    }
}
