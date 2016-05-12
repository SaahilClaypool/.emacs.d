_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public String getSystemId() {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public String getPublicId() {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public int getLineNumber() {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public int getColumnNumber() {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public Object getProperty(String name) throws SAXNotRecognizedException,

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public void setProperty(String name, Object value) throws

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public void setErrorHandler(ErrorHandler handler) throws

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public EntityResolver getEntityResolver() {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public void setEntityResolver(EntityResolver resolver) throws

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public void setDTDHandler(DTDHandler handler) throws NullPointerException {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public void parse(String sysId) throws IOException, SAXException {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public void setFeature(String name, boolean value) throws

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public boolean getFeature(String name) throws SAXNotRecognizedException,

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public ErrorHandler getErrorHandler() {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public DTDHandler getDTDHandler() {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    private void parse(Node node) throws IOException, SAXException {

    /**
     * Traverse the DOM and generate SAX events for a handler. A
     * startElement() event passes all attributes, including namespace
     * declarations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    private static String getLocalName(Node node) {

    /**
     * If the DOM was created using a DOM 1.0 API, the local name may be
     * null. If so, get the local name from the qualified name before
     * generating the SAX event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    private boolean startPrefixMapping(String prefix, String uri)

    /**
     * Begin the scope of namespace prefix. Forward the event to the
     * SAX handler only if the prefix is unknown or it is mapped to a
     * different URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
public class DOM2SAX implements XMLReader, Locator {

/**
 * @author G. Todd Miller
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public String getSystemId() {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public String getPublicId() {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public int getLineNumber() {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public int getColumnNumber() {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public Object getProperty(String name) throws SAXNotRecognizedException,

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public void setProperty(String name, Object value) throws

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public void setErrorHandler(ErrorHandler handler) throws

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public EntityResolver getEntityResolver() {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public void setEntityResolver(EntityResolver resolver) throws

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public void setDTDHandler(DTDHandler handler) throws NullPointerException {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public void parse(String sysId) throws IOException, SAXException {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public void setFeature(String name, boolean value) throws

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public boolean getFeature(String name) throws SAXNotRecognizedException,

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public ErrorHandler getErrorHandler() {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    public DTDHandler getDTDHandler() {

    /**
     * This class is only used internally so this method should never
     * be called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    private void parse(Node node) throws IOException, SAXException {

    /**
     * Traverse the DOM and generate SAX events for a handler. A
     * startElement() event passes all attributes, including namespace
     * declarations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    private static String getLocalName(Node node) {

    /**
     * If the DOM was created using a DOM 1.0 API, the local name may be
     * null. If so, get the local name from the qualified name before
     * generating the SAX event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
    private boolean startPrefixMapping(String prefix, String uri)

    /**
     * Begin the scope of namespace prefix. Forward the event to the
     * SAX handler only if the prefix is unknown or it is mapped to a
     * different URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/DOM2SAX.java
public class DOM2SAX implements XMLReader, Locator {

/**
 * @author G. Todd Miller
 */
