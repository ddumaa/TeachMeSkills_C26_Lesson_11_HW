package homework.task_1.method;

public class CheckDocumentNumberStartsWithSequence {
    public static void checkDocumentNumberStartsWithSequence(String documents, String number){
        if (documents.startsWith(number)){
            System.out.println("The document begins with the sequence - "+ number);
        } else {
            System.out.println("The document does not start with the sequence - "+ number);
        }
    }
}
