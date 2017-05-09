import java.util.HashMap;

/**
 * Created by 时光与你 on 2017/5/9.
 */
public class youngNullHashMap {
    public static void main(String[]args){
        HashMap hashMap = new HashMap();
        //HashMap中key不能重复，可以有多项的values为null
        hashMap.put(null,null);//前者为key，后者为values
        hashMap.put(null,null);
        hashMap.put("a",null);
        System.out.println(hashMap);
    }
}
