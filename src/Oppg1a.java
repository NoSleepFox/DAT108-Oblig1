import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Oppg1a {

    public static void main(String[] args){

        List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");

        Collections.sort(listen, (x, y) -> Integer.compare(Integer.parseInt(x), Integer.parseInt(y)));

        for (String s : listen){
            System.out.println(s);
        }
    }

}
