import java.util.Map;
import java.util.stream.Collectors;

class RaindropConverter {

    String convert(int number) {
        if(number == 0)
            return "0";
        if(number == 1)
            return "1";
        Map<Integer,String> numberMapping =
                Map.of(3,"Pling",5,"Plang",7,"Plong");
        return numberMapping.entrySet().stream()
        .filter(entry -> entry.getKey() % number == 0)
        .map(entry -> numberMapping.get(entry))
        .collect(Collectors.joining());
    }

}
