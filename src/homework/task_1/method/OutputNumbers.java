package homework.task_1.method;

public class OutputNumbers {
    public static void outputNumbers(String documents){
        String[] array = documents.split("-");
        System.out.println(array[0] +"-"+ array[2]);
    }
}
