import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Requirements:
 * =============
 * + System replaces variable placeholders like ${firstname} in template with values provided at runtime
 * + Attempt to send template with undefined variables raises error
 * + System ignores variables that aren’t in the template
 */
public class Template {

    private String text;
    private Map<String, String> variables;  //An object that maps keys to values. 
                                            //A map cannot contain duplicate keys; 
                                            //each key can map to at most one value.

    public Template(String text)
    {
        this.text = text;
        this.variables = new HashMap<>();
    }

    public void set(String var, String value)
    {
        variables.put(var, value);
    }

    public String evaluate()
    {
        String result = replaceVariables(text);
        checkForMissingValues(result);
        return result;
    }

    private void checkForMissingValues(String result) {
        Matcher m = Pattern.compile("\\$\\{.+\\}").matcher(result);
        if(m.find()) {
            throw new MissingValueException("No value for " + m.group());
        }
    }

    private String replaceVariables(String value) {
        for(Map.Entry<String,String> entry: variables.entrySet()) {
            String regex = "\\$\\{" + entry.getKey() + "\\}";
            value = value.replaceAll(regex, entry.getValue());
        }
        return value;
    }
}
