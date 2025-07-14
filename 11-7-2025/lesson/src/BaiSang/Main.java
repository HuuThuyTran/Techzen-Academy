package BaiSang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        // a.
        String dateStr = "07/11/2025";
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = dateFormat.parse(dateStr);
        System.out.println("Date: " + date);

        // b.
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();
        String formattedDate = simpleDateFormat.format(currentDate);
        System.out.println("Ngày đã định dạng: " + formattedDate);
    }
}
