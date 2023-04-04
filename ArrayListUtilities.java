import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUtilities {
    public static int getListMax(ArrayList<Integer> items) {
        int maxNum = 0;
        for(int num : items){
            if(num > maxNum){
                maxNum = num;
            }
        }
        return maxNum;
    }

    public static ArrayList<String> withoutLongWords(ArrayList<String> longWords){
        ArrayList<String> shortWords = new ArrayList<String>();
        for(int i = 0; i < longWords.size()-1; i ++){
            if(longWords.get(i).length() <= 5){
                shortWords.add(longWords.get(i));
            }
        }
        return shortWords;
    }

    public static void removeLongWords(ArrayList<String> longWords){
        for(int i = 0; i < longWords.size(); i ++){
            if(longWords.get(i).length() > 5){
                longWords.remove(i);
            }
        }
    }

    public static ArrayList<Double> reversed(ArrayList<Double> normal){
        ArrayList<Double> reverse = new ArrayList<>();
        for(int i = normal.size() - 1; i >= 0; i --){
            reverse.add(normal.get(i));
        }
        return reverse;
    }

    public static void reverseInPlace (ArrayList<Double> normal){
        final ArrayList<Double> copy =  new ArrayList<Double>(normal);
        int num = 0;
        for(int i = normal.size() - 1; i >= 0; i --){
            normal.set(num, copy.get(i));
            num ++;
        }
    }


    public static void main(String[] args) {
        ArrayList<Double> original = new ArrayList<>(Arrays.asList(5.7,2.4,1.1,9.3,8.3));
    
        ArrayListUtilities.reverseInPlace(original);
}
}