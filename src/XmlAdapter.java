import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
//this class is for implementing the adapter design pattern that will ba as an interface between two incompatable classes
public class XmlAdapter implements json {

   private XmlClass xml1;

    public XmlAdapter(XmlClass xml1) {
        this.xml1=xml1;
    }
    public XmlClass getxml(){
        return this.xml1;
    }
    @Override
    public void writeJson() {
        //this code is for converting xml to json
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(this.getxml().getTEST_XML_STRING());
            String jsonPrettyPrintString = xmlJSONObj.toString(Main.PRETTY_PRINT_INDENT_FACTOR);
            System.out.println(jsonPrettyPrintString);
        } catch (JSONException je) {
            System.out.println(je.toString());
        }

    }
}
