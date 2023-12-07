package homework.task_3.method;

public class DuplicatingLetters {
    public static void duplicatingLetters(String string){
        StringBuilder sb = new StringBuilder();
        for (char i: string.toCharArray()){
            sb.append(i);
            sb.append(i);
        }
        System.out.println(sb.toString());
    }
}
