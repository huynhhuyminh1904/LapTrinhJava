package communityuni.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChuongTrinhDemSoAm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập chuỗi bất kỳ: ");
        String input = sc.nextLine();
        
        System.out.println("Các số nguyên âm trong chuỗi là:");
        NegativeNumberInStrings(input);
        
        sc.close();
    }

    /**
     * Hàm tìm và xuất các số nguyên âm trong chuỗi
     */
 
    public static void NegativeNumberInStrings(String str) {
        Pattern pattern = Pattern.compile("-\\d+");
        Matcher matcher = pattern.matcher(str);

        boolean coSoAm = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            coSoAm = true;
        }

        if (!coSoAm) {
            System.out.println("(Không tìm thấy số nguyên âm nào)");
        }
    }
}