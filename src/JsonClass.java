//this class takes json string then print it as it is
public class JsonClass  implements json{
    String TEST_JSON_STRING;
    public JsonClass(String TEST_JSON_STRING ) {
        this.TEST_JSON_STRING=TEST_JSON_STRING;
    }

    public void writeJson(){
        System.out.println("TEST_JSON_STRING");
    };

}
