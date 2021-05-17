import java.util.Scanner;

public class Bai5 {
    public void indexOfCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Chuỗi: ");
        String str = sc.nextLine();
        System.out.println("Nhập kí tự cần lấy index: ");
        String ch = sc.next();

        for (int i = 0; i < str.length(); i++) {
            String kyTu = String.valueOf(str.charAt(i));
            if (ch.equals(kyTu)) {
                System.out.println(i);
            }
        }
    }
}
