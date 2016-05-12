_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
} // class XPathMatcher

    /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    /***

    /** Main program. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    private String normalize(String s) {

    /** Normalizes text. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
        StringBuffer str = new StringBuffer();

        /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    public String toString() {

    /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    public void endElement(QName element, XSTypeDefinition type, boolean nillable, Object value, short valueType, ShortList itemValueType) {

    /**
       * @param element
       *        name of the element.
       * @param type
       *        content type of this element. IOW, the XML schema type
       *        of the <tt>value</tt>. Note that this may not be the type declared
       *        in the element declaration, but it is "the actual type". For example,
       *        if the XML is &lt;foo xsi:type="xs:string">aaa&lt;/foo>, this
       *        parameter will be "xs:string".
       * @param nillable - nillable
       *        true if the element declaration is nillable.
       * @param value - actual value
       *        the typed value of the content of this element.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    public void startElement(QName element, XMLAttributes attributes){

    /**
     * The start of an element. If the document specifies the start element
     * by using an empty tag, then the startElement method will immediately
     * be followed by the endElement method, with no intervening methods.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     *
     * @throws SAXException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    public void startDocumentFragment(){

    /**
     * The start of the document fragment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected void matched(Object actualValue, short valueType, ShortList itemValueType, boolean isNil) {

    /**
     * This method is called when the XPath handler matches the
     * XPath expression. Subclasses can override this method to
     * provide default handling upon a match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    public boolean isMatched() {

    /**
     * Returns value of first member of fMatched that
     * is nonzero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    public XPathMatcher(XPath xpath) {

    /**
     * Constructs an XPath matcher that implements a document fragment
     * handler.
     *
     * @param xpath   The xpath.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    private int [] fNoMatchDepth;

    /**
     * No match depth. The value of this field will be zero while
     * matching is successful for the given xpath expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    private int[] fCurrentStep;

    /** Current step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    private IntStack[] fStepIndexes;

    /** Integer stack of step indexes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected Object fMatchedString;

    /** The matching string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    private int[] fMatched;

    /** True if XPath has been matched. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    private XPath.LocationPath[] fLocationPaths;

    /** XPath location path. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected static final boolean DEBUG_ANY = DEBUG_METHODS ||

    /** Don't touch this value unless you add more debug constants. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected static final boolean DEBUG_STACK = false || DEBUG_ALL;

    /** Compile to true to debug step index stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected static final boolean DEBUG_MATCH = false || DEBUG_ALL;

    /** Compile to true to debug match. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected static final boolean DEBUG_METHODS3 = false || DEBUG_METHODS || DEBUG_ALL;

    /** Compile to true to debug the <em>really</em> important methods. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected static final boolean DEBUG_METHODS2 = false || DEBUG_METHODS || DEBUG_ALL;

    /** Compile to true to debug important method callbacks. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected static final boolean DEBUG_METHODS = false || DEBUG_ALL;

    /** Compile to true to debug method callbacks. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected static final boolean DEBUG_ALL = false;

    /** Compile to true to debug everything. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
public class XPathMatcher {

/**
 * XPath matcher.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
} // class XPathMatcher

    /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    /***

    /** Main program. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    private String normalize(String s) {

    /** Normalizes text. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
        StringBuffer str = new StringBuffer();

        /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    public String toString() {

    /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    public void endElement(QName element, XSTypeDefinition type, boolean nillable, Object value, short valueType, ShortList itemValueType) {

    /**
       * @param element
       *        name of the element.
       * @param type
       *        content type of this element. IOW, the XML schema type
       *        of the <tt>value</tt>. Note that this may not be the type declared
       *        in the element declaration, but it is "the actual type". For example,
       *        if the XML is &lt;foo xsi:type="xs:string">aaa&lt;/foo>, this
       *        parameter will be "xs:string".
       * @param nillable - nillable
       *        true if the element declaration is nillable.
       * @param value - actual value
       *        the typed value of the content of this element.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    public void startElement(QName element, XMLAttributes attributes){

    /**
     * The start of an element. If the document specifies the start element
     * by using an empty tag, then the startElement method will immediately
     * be followed by the endElement method, with no intervening methods.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     *
     * @throws SAXException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    public void startDocumentFragment(){

    /**
     * The start of the document fragment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected void matched(Object actualValue, short valueType, ShortList itemValueType, boolean isNil) {

    /**
     * This method is called when the XPath handler matches the
     * XPath expression. Subclasses can override this method to
     * provide default handling upon a match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    public boolean isMatched() {

    /**
     * Returns value of first member of fMatched that
     * is nonzero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    public XPathMatcher(XPath xpath) {

    /**
     * Constructs an XPath matcher that implements a document fragment
     * handler.
     *
     * @param xpath   The xpath.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    private int [] fNoMatchDepth;

    /**
     * No match depth. The value of this field will be zero while
     * matching is successful for the given xpath expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    private int[] fCurrentStep;

    /** Current step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    private IntStack[] fStepIndexes;

    /** Integer stack of step indexes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected Object fMatchedString;

    /** The matching string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    private int[] fMatched;

    /** True if XPath has been matched. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    private XPath.LocationPath[] fLocationPaths;

    /** XPath location path. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected static final boolean DEBUG_ANY = DEBUG_METHODS ||

    /** Don't touch this value unless you add more debug constants. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected static final boolean DEBUG_STACK = false || DEBUG_ALL;

    /** Compile to true to debug step index stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected static final boolean DEBUG_MATCH = false || DEBUG_ALL;

    /** Compile to true to debug match. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected static final boolean DEBUG_METHODS3 = false || DEBUG_METHODS || DEBUG_ALL;

    /** Compile to true to debug the <em>really</em> important methods. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected static final boolean DEBUG_METHODS2 = false || DEBUG_METHODS || DEBUG_ALL;

    /** Compile to true to debug important method callbacks. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected static final boolean DEBUG_METHODS = false || DEBUG_ALL;

    /** Compile to true to debug method callbacks. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
    protected static final boolean DEBUG_ALL = false;

    /** Compile to true to debug everything. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/XPathMatcher.java
public class XPathMatcher {

/**
 * XPath matcher.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 *
 */
