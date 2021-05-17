import java.util.Scanner;

public class Bai15 {
    public void numberOfCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Chuỗi: ");
        String str = sc.nextLine();
        System.out.println("Nhập kí tự cần đếm số lượng: ");
        String ch = sc.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String kyTu = String.valueOf(str.charAt(i));
            if (ch.equals(kyTu)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự "+ch+ " là: " +count);
    }
}
