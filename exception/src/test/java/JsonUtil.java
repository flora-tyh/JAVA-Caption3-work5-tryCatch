import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

  private JsonUtil() {
  }
  private static final ObjectMapper objectMapper = new ObjectMapper();

  public static String convertToJson(Object object) {
    //TODO: change the code to pass the test
    try {
      return objectMapper.writeValueAsString(object);
    } catch (Exception e) {
      return null;
    }
  }
}
