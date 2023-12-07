package homework.task_2.method;

public class SearchLongAndShortWords {
    public static void searchLongAndShortWords(String sentence){
        String[] s = sentence.trim().split(" ");
        int min = 0;
        int max = 0;
        for (int i = 0; i < s.length; i ++){
            if(s[min].length() <=s [i].length()){
                min = i;
            }
            if(s[max].length() >=s [i].length()){
                max = i;
            }
        }
        System.out.println("The shortest word: "+ s[min]);
        System.out.println("Longest word: "+ s[max]);
    }
}
