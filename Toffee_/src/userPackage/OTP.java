package userPackage;

import java.util.Properties;

public class OTP {
    private String otpString;
    OTP(){
        otpString=getAlphaNumericString(5);
    }
    /**
     * this function return the otp code for my program to match them
     * @return the otp code
     */
    public String getOtpString() {
        return otpString;
    }
    /**
     * this function send a rondomly generated text for user to put
     * @param to to the user
     * @param from from my the websites email
     * @return
     */
    public boolean sendEmail(String to,String from){
        Properties p=new Properties();
        p.put("mail.smtp.auth",true);
        p.put("mail.smtp.starttls.enable", true);
        p.put("mail.smtp.port", "587");
        p.put("mail.smtp.host", "smtp.gmail.com");
        //session
        
        return false;
    }
    /**
     * set the id's for the all generated users or items
     * @param n
     * @return
     */
    static String getAlphaNumericString(int n){
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "0123456789"+ "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index= (int)(AlphaNumericString.length()* Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }
}
