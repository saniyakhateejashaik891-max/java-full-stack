import java.util.HashMap;
import java.util.Map;
class Hash{
    public static void main(String[] args) {
        
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Saboor",1 );
        map.put("sidra",2);
        map.put("Hania", 3);
        map.put("yumna", 4);

        System.out.println(map.containsKey("Inayat"));
        map.get("Hania");
        
        //Iteration
        for(Map.Entry<String,Integer> e:map.entrySet()){
            e.getKey();
            e.getValue();
        }
    }
}
