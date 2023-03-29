import java.util.ArrayList;

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
        ArrayList<String> shortWords = new ArrayList<String>;
        for(int i; i < longWords.size()-1; i ++){
            if(longWords.get(i).length() <= 5){
                shortWords.add(longWords(i));
            }
        }
    }
}