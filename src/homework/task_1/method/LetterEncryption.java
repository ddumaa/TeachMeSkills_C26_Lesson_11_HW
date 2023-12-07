package homework.task_1.method;

public class LetterEncryption {
    public static void letterEncryption (String numberDocuments){
        char[] array = numberDocuments.toCharArray();
        array[5] = '*';
        array[6] = '*';
        array[7] = '*';
        array[14] = '*';
        array[15] = '*';
        array[16] = '*';
        String str = new String(array);
        System.out.println(str);
    }
}
