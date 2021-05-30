import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordFuerte extends Password{

    //genero el constructor que matchee con la superclase
    public PasswordFuerte(String reg) {
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


        //hace el match del regex con digito, mayuscula, minuscula y nro

        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
        Matcher matcher = pattern.matcher(val);

        ret = matcher.find();



        return ret;
    }
}
