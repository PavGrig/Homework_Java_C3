import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ex {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(15, 5, 17, 26, 15, 78, 35, 4, 18, 3, 89));

        System.out.println(array);

        Iterator<Integer> iter = array.iterator();
        while(iter.hasNext()){
            int num = iter.next();
            if(num % 2 == 0){
                iter.remove();
            }
        }
        System.out.println(array);
        
        int max = array.get(0);
        int min = array.get(0);

        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) > max){
                max = array.get(i);
            }
            else if(array.get(i) < min){
                min = array.get(i);
            }
        }

        System.out.println("Максимальное значение списка: " + max);
        System.out.println("Минимальное значение списка: " + min);
        
        int sum = 0;

        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }    
        
        int meanArith = sum / array.size();

        System.out.println("Среднее арифметическое значение списка: " + meanArith);
    }
}