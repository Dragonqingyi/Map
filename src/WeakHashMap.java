import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by 时光与你 on 2017/5/9.
 */
public class WeakHashMap {
    //使用WeakHashMap类，弱引用
    public static void main(String[]args){
        String a = new String("a");
        String b = new String("b");
        Map weakmp = new java.util.WeakHashMap();
        Map map = new HashMap();
        map.put(a,"aaa");
        map.put(b,"bbb");
        weakmp.put(a,"aaa");
        weakmp.put(b,"bbb");
        map.remove(a);
        a = null;
        b = null;
        System.gc();
        Iterator i = map.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry en = (Map.Entry)i.next();
            System.out.println("map:"+en.getKey()+":"+en.getValue());
        }
        Iterator j =map.entrySet().iterator();
        while (j.hasNext()){
            Map.Entry en = (Map.Entry)j.next();
            System.out.println("map:"+en.getKey()+":"+en.getValue());
        }
    }
}
