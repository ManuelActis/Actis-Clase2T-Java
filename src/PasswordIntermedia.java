import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordIntermedia extends Password{
    public PasswordIntermedia(String reg) {
        super(reg);
    }

    @Override
    public void setiValue(String iValue) throws Exception {

        if (this.bMatchea(getiValue()))
        {
            super.setiValue(iValue);
        }

    }

    private boolean bMatchea(String val)
    {

        boolean ret = false;


        //hace el match del regex con mayus y nro

        Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])");
        Matcher matcher = pattern.matcher(val);

        ret = matcher.find();



        return ret;
    }
}
