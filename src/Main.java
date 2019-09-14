
public class Main {

    public static int PRETTY_PRINT_INDENT_FACTOR = 4;
    public static String TEST_XML_STRING =
            "<?xml version=\"2.0\" ?><test attrib=\"moretest1\">Turn this to JSON</test>";

    public static void main(String[] args) {
        //this code usees the xmladapter class to convert from xml  to json
        XmlClass xml1=new XmlClass(TEST_XML_STRING);
        json xmladapter =new XmlAdapter(xml1);
        xmladapter.writeJson();

    }
}