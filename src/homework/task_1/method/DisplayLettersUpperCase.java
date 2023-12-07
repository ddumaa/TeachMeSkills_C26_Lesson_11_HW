package homework.task_1.method;

public class DisplayLettersUpperCase {
        public static void displayLettersUpperCase(String documents){
            StringBuilder str = new StringBuilder(documents.toUpperCase());
            char[] array = documents.toUpperCase().toCharArray();
            System.out.println("Letters:" + str.substring(5,8) + str.substring(14,17) +array[19] + array[21]);
    }
}
