package homework.task_1.method;

public class LetterEncryption {
    public static void letterEncryption (String numberDocuments){
        StringBuffer sb = new StringBuffer(numberDocuments);
        sb.replace(5,8,"***");
        sb.replace(14,17,"***");
        System.out.println(sb);
    }
}
