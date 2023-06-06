import java.util.regex.Pattern;

public class JsonParser {
  private static final Pattern REGEX_ITEMS = Pattern.compile(".*\\[(.+)\\].*"); //  "items": [ ... ]  //  "items": [ ... ]    
  private static final Pattern REGEX_ATRIBUTOS_JSON = Pattern.compile("\"(.+?)\":\"(.*?)\""); //  "atributo": "valor"  //  "atributo": "valor"  

  public List<Map<String, String>> parse(String json) {

  }
}