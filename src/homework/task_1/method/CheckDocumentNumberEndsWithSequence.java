package homework.task_1.method;

public class CheckDocumentNumberEndsWithSequence {
    public static void checkDocumentNumberEndsWithSequence(String documents, String subsequence){
        if (documents.endsWith(subsequence)){
            System.out.println("The document ends with the sequence - "+ subsequence);
        } else {
            System.out.println("The document does not end with sequence - "+ subsequence);
        }
    }
}
