import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CheckExceptions extends Throwable {

    public void wordsCountCheck (String data) throws wordsCountCheckException{
        int count = data.split(" ").length;
        if (count != 5) {
            throw new wordsCountCheckException("The entered line contains an incorrect amount of data. Repeat the input");
        }
    }

    public void birthDateCheck (String data) throws birthDateCheckException {
        DateFormat df = new SimpleDateFormat("dd.mm.yyyy");
        try {
            df.parse(data);
        }
        catch (ParseException e){
            throw new birthDateCheckException("Incorrect Date format");
        }
    }

    public User wordsCheck(ArrayList <String> list){
        User user = new User();

        for (String str: list) {
            try {
                birthDateCheck(str);
                user.setBirthDate(str);
            }
            catch (birthDateCheckException ex){
                try {
                    user.setPhoneNumber(Long.parseLong(str));
                } catch (NumberFormatException e) {
                    if (str.length() > 1) {
                        if (user.getLastName() == null || user.getLastName().isEmpty())
                            user.setLastName(str);
                        else
                            user.setFirstName(str);
                    } else
                        if (str.equals("M") ||
                                str.equals("m") ||
                                str.equals("F") ||
                                str.equals("f")) {
                            user.setGender(str);
                        }
                }
            }
        }

//        System.out.println(user.toString());
        return user;
    }
}

//    private static String[] date_formats = {
//            "yyyy-MM-dd",
//            "yyyy/MM/dd",
//            "dd/MM/yyyy",
//            "dd-MM-yyyy",
//            "yyyy MMM dd",
//            "yyyy dd MMM",
//            "dd MMM yyyy",
//            "dd MMM yyyy"
//    };
//    /**
//     * A brute-force workaround for Java's failure to accept "any arbitrary date format"
//     */
//    public static Date tryDifferentFormats (String sDate) {
//        Date myDate = null;
//        for (String formatString : date_formats) {
//            try {
//                SimpleDateFormat format = new SimpleDateFormat(formatString);
//                format.setLenient(false);
//                myDate = format.parse(sDate);
//                break;
//            }
//            catch (ParseException e) {
//                // System.out.println("  fmt: " + formatString + ": FAIL");
//            }
//        }
//        return myDate;
//    }