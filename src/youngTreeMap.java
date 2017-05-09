import java.util.TreeMap;

/**
 * Created by 时光与你 on 2017/5/9.
 */
/*
类RR重写了equals方法，count相等返回true
重写了compareTo(Object obj)方法,count相等返回0
 */
class RR implements Comparable{
    int count;

    public RR(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RR rr = (RR) o;

        return count == rr.count;
    }

    @Override
    public int hashCode() {
        return count;
    }

    @Override
    public String toString() {
        return "RR{" +
                "count=" + count +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        RR r = (RR)o;
        if (this.count > r.count){
            return 1;
        }else if(this.count == r.count){
            return 0;
        }else {
            return -1;
        }
    }
}
/*
TreeMap基本使用
 */
public class youngTreeMap {
    public static void main(String[]args){
        /*
        正如Set接口派生了SortedSet子接口，SortedSet接口有一个TreeSet实现类一样
        Map接口也派生了一个SortedMap子接口，SortedMap也有一个TreeMap实现类
        与TreeSet类似，TreeMap也是基于红黑树算法对TreeMap中所有key进行排序
        分为自然排序和定制排序
         */
        TreeMap tm = new TreeMap();
        tm.put(new RR(3),"android江湖");
        tm.put(new RR(-5),"会当凌绝顶");
        tm.put(new RR(9),"一览众山小");
        System.out.println(tm);
        //返回第一个Entry对象
        System.out.println(tm.firstEntry());
        //返回最后一个key值
        System.out.println(tm.lastKey());
        //返回比new R(2)大的最小key值
        System.out.println(tm.higherKey(new RR(2)));
        //返回比new R(2)小的最大key-values值
        System.out.println(tm.lowerEntry(new RR(2)));
        //返回该TreeMap的子TreeMap
        System.out.println(tm.subMap(new RR(-1),new RR(4)));
    }
}

