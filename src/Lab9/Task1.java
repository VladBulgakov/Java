package Lab9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static List<Integer> removeRepeats(List<Integer> input){
        Set<Integer> tmp = new HashSet();
        tmp.addAll(input);
        List<Integer> result = new ArrayList();
        result.addAll(tmp);
        return result;
    }
}
