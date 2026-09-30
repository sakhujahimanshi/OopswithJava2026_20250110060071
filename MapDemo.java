import java.util.*;
public class MapDemo{
    public static void main(String[]args){
Map<Integer,Integer> LN=new HashMap<>();
LN.put(0,89);
LN.put(2,89);
LN.put(1,76);
LN.put(4,101);
LN.put(5,90);
LN.put(6,80);
for(Map.Entry<Integer,Integer>i: LN.entrySet()){
    System.out.println(i.getKey()+" "+i.getValue());
}
if(LN.containsKey(4)){
    System.out.println(LN.get(4));
}
    
    else
        {
        System.out.println("detail not found");
    }
    LN.put(9, 101);
    LN.remove(5);
    for(Map.Entry<Integer,Integer>i:LN.entrySet()){
        System.out.println(i.getKey()+" "+i.getValue());
    }
}
}