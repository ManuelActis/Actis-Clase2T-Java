import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordSimple extends Password{
    public PasswordSimple(String reg) {
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


        //hace el match del regex con que tenga nros

        Pattern pattern = Pattern.compile("^(?=.*[0-9])");
        Matcher matcher = pattern.matcher(val);

        ret = matcher.find();



        return ret;
    }
}
