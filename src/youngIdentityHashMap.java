import java.util.IdentityHashMap;

/**
 * Created by 时光与你 on 2017/5/10.
 */
public class youngIdentityHashMap {
    public static void main(String[]args){
        //使用IdentityHashMap类，不保证顺序，不保证顺序随时间推移保持不变
        IdentityHashMap ihm = new IdentityHashMap();
        ihm.put(new String("语文"),89);
        ihm.put(new String("数学"),90);
        ihm.put("java",97);
        ihm.put("java",78);
        System.out.println(ihm);
    }
}
