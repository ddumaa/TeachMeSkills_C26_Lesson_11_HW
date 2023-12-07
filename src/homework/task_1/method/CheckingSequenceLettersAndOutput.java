package homework.task_1.method;

public class CheckingSequenceLettersAndOutput {
    public static void checkingSequenceLettersAndOutput(String documents, String letters){
        if (documents.toLowerCase().contains(letters)){
            System.out.println("The document contains the sequence - " + letters);
        } else {
            System.out.println("The document does not contain the sequence - " + letters);
        }
    }
}
