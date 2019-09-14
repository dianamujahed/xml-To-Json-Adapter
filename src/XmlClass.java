//this class takes xml string then print it as it is
public class XmlClass implements xml {
    private  String TEST_XML_STRING;
    public XmlClass(String TEST_XML_STRING) {
        this.TEST_XML_STRING=TEST_XML_STRING;
    }
public String getTEST_XML_STRING(){
        return this.TEST_XML_STRING;
}
    @Override
    public void writeXml() {
System.out.println(this.TEST_XML_STRING);
    }
}
