import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        List<String> lines = new ArrayList<>();
        String s2 = scanner.nextLine();
        String[] s3 = s2.split(" ");
        
        for (int i = 0; i < total; i++) {
            lines.add(scanner.nextLine());
        }
        List<List<Integer>> list = new ArrayList<>();
        for (String line : lines) {
            String[] s = line.split(" ");
            List<Integer> each = new ArrayList<>();
            for (String s1 : s) {
                each.add(Integer.parseInt(s1));
            }
            list.add(each);
        }
        System.out.println(list);
    }
}
