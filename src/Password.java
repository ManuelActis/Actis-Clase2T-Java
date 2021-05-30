import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Password {

    public String getiValue() {
        return iValue;
    }

    public void setiValue(String iValue) throws Exception {

        if(bMatchea(iValue, getiRegex()))
        {
            this.iValue = iValue;
        }

        else
        {
            String sMsg = "La contraseña no cumple el regex";
            throw new Exception(sMsg);
        }

    }

    public String getiRegex() {
        return iRegex;
    }

    public void setiRegex(String iRegex) {
        this.iRegex = iRegex;
    }

    private String iValue;
    private String iRegex;

    public Password(String reg)
    {
        this.iRegex = reg;
    }

    private boolean bMatchea(String val, String reg)
    {
        boolean ret = false;

        //digito + minuscula + mayuscula + simbolo
        //"^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$"


        //hace el match del regex

        Pattern pattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(val);

        ret = matcher.find();



        return ret;
    }






}
