
package centsible.functions;


import static centsible.functions.GeneralFunction.list;
import java.text.DecimalFormat;
import java.util.Random;

public class OTPGenerator {
    
    public String generateVerifyCode() throws Exception {
        DecimalFormat df = new DecimalFormat("000000");
        Random ran = new Random();
        String code = df.format(ran.nextInt(1000000));  //  Random from 0 to 999999
        while (checkDuplicateCode(code)) {
            code = df.format(ran.nextInt(1000000));
        }
        return code;
    }

    public boolean checkDuplicateCode(String code) {
        boolean duplicate = false;

        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i).getOtp();
            if (temp.equals(code)) {
                duplicate = true;
            }
        }
        return duplicate;
    }
    
}
