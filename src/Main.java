import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bai5 b5 = new Bai5();

        Bai15 b15 = new Bai15();
        Main m = new Main();
        m.Menu();

        int option;
        System.out.println("Select option: ");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        while (option != 4) {
            switch (option) {
                case 1:
                    b5.indexOfCharacter();
                    break;
                case 2:
                    String str = "You only live once, but if you do it right, once is enough";
                    System.out.println("Số từ có trong chuỗi là: "+countWords(str));
                    break;
                case 3:
                    b15.numberOfCharacter();
                    break;
            }

            System.out.println("Select option: ");
            option = sc.nextInt();
        }
    }


    static int countWords(String str){
        if (str.isEmpty()){   //Kiểm tra xem chuỗi có rỗng hay không
            return -1;
        }
        int count = 0;  //KHởi tạo biến count để đếm số từ
        boolean notCounted = true;  //KHởi tạo biến notCounted có giá trị true
        for (int i = 0; i <str.length(); i++){    //Tạo vòng lặp để duyệt các ký tự

            if (str.charAt(i) != ' ' && str.charAt(i) != '\t' && str.charAt(i) != '\n') {
                //Nếu các ký tự không phải là khoảng trắng, tab hay xuống dòng
                if (notCounted){  //nếu notCounted = true
                    count++;      //Tăng đếm
                    notCounted = false;   //Gán notCounted = false
                }
            }else{
                notCounted = true;   //Gán notCounted = true
            }
        }
        return count;  //Trả về kết quả
    }

    void Menu() {
        System.out.println("===================");
        System.out.println("==Please select an option==");
        System.out.println("==1. Bai 5 ==");
        System.out.println("==2. Bai 8 ==");
        System.out.println("==3. Bai 15==");
        System.out.println("==4. Quit");
        System.out.println("===================");
    }
}



