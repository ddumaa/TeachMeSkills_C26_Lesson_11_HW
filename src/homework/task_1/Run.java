package homework.task_1;

import homework.task_1.method.CheckDocumentNumberEndsWithSequence;
import homework.task_1.method.CheckDocumentNumberStartsWithSequence;
import homework.task_1.method.CheckingSequenceLettersAndOutput;
import homework.task_1.method.LetterEncryption;

public class Run {
    public static void main(String[] args) {
        String numberDocuments = "0872-AbC-0001-NnY-4G9e";

        LetterEncryption.letterEncryption(numberDocuments);
        CheckingSequenceLettersAndOutput.checkingSequenceLettersAndOutput(numberDocuments, "abc");
        CheckDocumentNumberStartsWithSequence.checkDocumentNumberStartsWithSequence(numberDocuments, "555");
        CheckDocumentNumberEndsWithSequence.checkDocumentNumberEndsWithSequence(numberDocuments, "1a2b");
    }
}
