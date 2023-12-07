package homework.task_1.method;

public class LetterOutput {
    public static void letterOutput(String documents){
        StringBuilder str = new StringBuilder(documents.toLowerCase());
        char[] array = documents.toLowerCase().toCharArray();
        System.out.println(str.substring(5,8) + str.substring(14,17) +array[19] + array[21]);
    }
}
