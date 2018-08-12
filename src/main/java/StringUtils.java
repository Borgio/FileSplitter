import java.io.File;

public class StringUtils
{

    static final String TAB="\t";

    public static String getCompanyCodeFromFileMapping(File aInFile)
    {

        return aInFile.getName().
                substring(aInFile.getName().indexOf("_") + 1, aInFile.getName().indexOf(".")) + "";
    }
    public static String getPremnoFromline(String aInLine)
    {
        return aInLine.substring(0,aInLine.indexOf(TAB));


    }
}
