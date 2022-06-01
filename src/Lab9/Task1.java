package Lab9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static List removeRepeats(List input){
        Set tmp = new HashSet();
        tmp.addAll(input);
        List result = new ArrayList();
        result.addAll(tmp);
        return result;
    }
}
