import java.util.EnumMap;

/**
 * Created by 时光与你 on 2017/5/10.
 */
enum Siji{
    SPRING,SUMMER,FALL,WINTER
}
public class TestEnumMap {
    //使用EnumMap类，必须指定一个枚举类，按照自然顺序排列
    public static void main(String[]args){
        EnumMap enumMap = new EnumMap(Siji.class);
        enumMap.put(Siji.SUMMER,"热啊");
        enumMap.put(Siji.WINTER,"冷啊");
        System.out.println(enumMap);
    }
}
