import java.util.Hashtable;

/**
 * Created by 时光与你 on 2017/5/9.
 */
/*
HashMAp,Hashtable中存储获取对象及基本操作！！！
 */
class AAA{
    int count;

    public AAA(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (o != null && o.getClass() == AAA.class){
            AAA a = (AAA) o;
            if (this.count == a.count){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return count;
    }
}
class BBB{
    public boolean equals(Object o){
        return true;
    }
}
public class yongHashtable {
    public static void main(String[]args){
        Hashtable ht = new Hashtable();
        ht.put(new AAA(6000),"android江湖");
        ht.put(new AAA(87563),"会当凌绝顶");
        ht.put(new AAA(1232),new BBB());
        System.out.println(ht);
        //只要两个对象通过equals比较返回true，Hashtable就认为他们是相等的values
        //因为Hashtable中只有一个B对象，他与任何对象通过equals比较都相等，故下面输出true
        System.out.println(ht.containsValue("测试字符串"));
        //只要两个对象的count属性相等，他们通关equals比较返回true，且HashCode相等
        //Hashtable即认为他们拥有相同的key，输出true
        System.out.println(ht.containsKey(new AAA(87563)));
        //删除最后一个key-values对
        ht.remove(new AAA(1232));
        for (Object key:ht.keySet()){
            System.out.print(key+"--->");
            System.out.print(ht.get(key)+"\n");
        }
    }
}
