package homework.task_1;

import homework.task_1.method.*;

public class Run {
    public static void main(String[] args) {
        String numberDocuments = "0872-AbC-0001-NnY-4G9e";

        OutputNumbers.outputNumbers(numberDocuments);
        LetterEncryption.letterEncryption(numberDocuments);
        LetterOutput.letterOutput(numberDocuments);
        DisplayLettersUpperCase.displayLettersUpperCase(numberDocuments);
        CheckingSequenceLettersAndOutput.checkingSequenceLettersAndOutput(numberDocuments, "abc");
        CheckDocumentNumberStartsWithSequence.checkDocumentNumberStartsWithSequence(numberDocuments, "555");
        CheckDocumentNumberEndsWithSequence.checkDocumentNumberEndsWithSequence(numberDocuments, "1a2b");
    }
}
