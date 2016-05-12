_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static int getStringLength(String str) {

    /**
     *  Utility method to calculate string-length as a number of code points,
     *  to avoid possible errors with string that contains
     *  complementary characters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String mapQNameToJavaName (String base ) {

    /**
     * Utility method to allow setting parameters of the form
     * {namespaceuri}localName
     * which get mapped to an instance variable in the class
     * Hence  a parameter of the form "{http://foo.bar}xyz"
     * will be replaced with the corresponding values
     * by the BasisLibrary's utility method mapQNametoJavaName
     * and thus get mapped to legal java variable names
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String replace(String base, char ch, String str) {

    /**
     * Replace a certain character in a string with a new substring.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void runTimeError(String code) {

    /**
     * Print a run-time error message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    private static int prefixIndex = 0;

    /**
     * This function is used in the execution of xsl:element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String getPrefix(String qname) {

    /**
     * This function is used in the execution of xsl:element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String startXslElement(String qname, String namespace,
        SerializationHandler handler, DOM dom, int node)

    /**
     * Utility function for the implementation of xsl:element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void checkQName(String name) {

    /**
     * Utility function to check if a name is a valid qname
     * This method should only be invoked if the attribute value is an AVT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void checkNCName(String name) {

    /**
     * Utility function to check if a name is a valid ncname
     * This method should only be invoked if the attribute value is an AVT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void checkAttribQName(String name) {

    /**
     * Utility function to check if xsl:attribute has a valid qname
     * This method should only be invoked if the name attribute is an AVT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    private static char[] _characterArray = new char[32];

    /**
     * Utility function: used in xsl:copy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static DTMAxisIterator getSingleNode(DTMAxisIterator iterator) {

    /**
     * Utility function: used with nth position filters to convert a sequence
     * of nodes to just one single node (the one at position n).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static DOM referenceToResultTree(Object obj) {

    /**
     * Utility function used to convert references to DOMs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static DTMAxisIterator nodeList2Iterator(
                                        org.w3c.dom.NodeList nodeList,
                                        Translet translet, DOM dom)

    /**
     * Utility function used to convert a w3c NodeList into a internal
     * DOM iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    private static DTMAxisIterator nodeList2IteratorUsingHandleFromNode(
                                        org.w3c.dom.NodeList nodeList,
                                        Translet translet, DOM dom)

    /**
     * In a perfect world, this would be the implementation for
     * nodeList2Iterator. In reality, though, this causes a
     * ClassCastException in getDTMHandleFromNode because SAXImpl is
     * not an instance of DOM2DTM. So we use the more lengthy
     * implementation below until this issue has been addressed.
     *
     * @see org.apache.xml.dtm.ref.DTMManagerDefault#getDTMHandleFromNode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static DTMAxisIterator node2Iterator(org.w3c.dom.Node node,
        Translet translet, DOM dom)

    /**
     * Utility function used to convert a w3c Node into an internal DOM iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String referenceToString(Object obj, DOM dom) {

    /**
     * Utility function: used to convert reference to String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static boolean referenceToBoolean(Object obj) {

    /**
     * Utility function: used to convert reference to boolean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static double referenceToDouble(Object obj) {

    /**
     * Utility function: used to convert reference to double.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static long referenceToLong(Object obj) {

    /**
     * Utility function: used to convert reference to long.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static org.w3c.dom.Node referenceToNode(Object obj, DOM dom) {

    /**
     * Utility function: used to convert reference to org.w3c.dom.Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static NodeList referenceToNodeList(Object obj, DOM dom) {

    /**
     * Utility function: used to convert reference to org.w3c.dom.NodeList.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static DTMAxisIterator referenceToNodeSet(Object obj) {

    /**
     * Utility function: used to convert references to node-sets. If the
     * obj is an instanceof Node then create a singleton iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    private static FieldPosition _fieldPosition = new FieldPosition(0);

    /**
     * Utility function: used to format/adjust  a double to a string. The
     * DecimalFormat object comes from the 'formatSymbols' map in
     * AbstractTranslet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static int realToInt(double d) {

    /**
     * Utility function: used in RealType to convert a real to an integer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String realToString(double d) {

    /**
     * Utility function: used in RealType to convert a real to a string.
     * Removes the decimal if null. Uses a specialized formatter object
     * for very large and very small numbers that ignores locales, thus
     * using always using "." as a decimal separator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static int stringToInt(String s) {

    /**
     * Utility function: used in StringType to convert a string to an int.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static double stringToReal(String s) {

    /**
     * Utility function: used in StringType to convert a string to a real.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static boolean testLanguage(String testLang, DOM dom, int node) {

    /**
     * Utility function: used to test context node's language
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static boolean compare(DTMAxisIterator left, final String rstring,
                                  int op, DOM dom) {

    /**
     * Utility function: node-set/string comparison.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static boolean compare(DTMAxisIterator left, final double rnumber,
                                  final int op, DOM dom) {

    /**
     * Utility function: node-set/number compare.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static boolean compare(DTMAxisIterator left, DTMAxisIterator right,
                                  int op, DOM dom) {

    /**
     * Utility function: node-set/node-set compare.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static DTMAxisIterator nodesetF(Object obj) {

    /**
     * Implements the nodeset() extension function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String objectTypeF(Object obj)

    /**
     * Implements the object-type() extension function.
     *
     * @see <a href="http://www.exslt.org/">EXSLT</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String namespace_uriF(int node, DOM dom) {

    /**
     * XSLT Standard function namespace-uri().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String system_propertyF(String name) {

    /**
     * XSLT Standard function system-property(name)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String namespace_uriF(DTMAxisIterator iter, DOM dom) {

    /**
     * XSLT Standard function namespace-uri(node-set).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void unsupported_ElementF(String qname, boolean isExtension) {

    /**
     * Utility function to throw a runtime error for an unsupported element.
     *
     * This is only used in forward-compatibility mode, when the control flow
     * cannot be determined. In 1.0 mode, the error message is emitted at
     * compile time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void unallowed_extension_elementF(String name) {

    /**
     * Utility function to throw a runtime error on the use of an extension
     * element when the secure processing feature is set to true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void unallowed_extension_functionF(String name) {

    /**
     * Utility function to throw a runtime error on the use of an extension
     * function when the secure processing feature is set to true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void unresolved_externalF(String name) {

    /**
     * External functions that cannot be resolved are replaced with a call
     * to this method. This method will generate a runtime errors. A good
     * stylesheet checks whether the function exists using conditional
     * constructs, and never really tries to call it if it doesn't exist.
     * But simple stylesheets may result in a call to this method.
     * The compiler should generate a warning if it encounters a call to
     * an unresolved external function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String getLocalName(String value) {

    /**
     * utility function for calls to local-name().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String generate_idF(int node) {

    /**
     * XSLT Standard function generate-id().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String normalize_spaceF(String value) {

    /**
     * XSLT Standard function normalize-space(string).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String normalize_spaceF(int node, DOM dom) {

    /**
     * XSLT Standard function normalize-space().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String translateF(String value, String from, String to) {

    /**
     * XSLT Standard function translate().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String substring_beforeF(String value, String substring) {

    /**
     * XSLT Standard function substring-before().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String substring_afterF(String value, String substring) {

    /**
     * XSLT Standard function substring-after().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String substringF(String value, double start, double length) {

    /**
     * XSLT Standard function substring(). Must take a double because of
     * conversions resulting into NaNs and rounding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String substringF(String value, double start) {

    /**
     * XSLT Standard function substring(). Must take a double because of
     * conversions resulting into NaNs and rounding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static boolean booleanF(Object obj) {

    /**
     * XSLT Standard function boolean()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static double roundF(double d) {

    /**
     * XSLT Standard function round()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static double numberF(Object obj, DOM dom) {

    /**
     * XSLT Standard function number(value)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static double numberF(int node, DOM dom) {

    /**
     * XSLT Standard function number()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String stringF(Object obj, int node, DOM dom) {

    /**
     * XSLT Standard function string(value)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String stringF(Object obj, DOM dom) {

    /**
     * XSLT Standard function string(value)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String stringF(int node, DOM dom) {

    /**
     * XSLT Standard function string()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static double sumF(DTMAxisIterator iterator, DOM dom) {

    /**
     * XSLT Standard function sum(node-set).
     * stringToDouble is inlined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static int positionF(DTMAxisIterator iterator) {

    /**
     * Standard function position()
     * @deprecated This method exists only for backwards compatibility with old
     *             translets.  New code should not reference it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static int countF(DTMAxisIterator iterator) {

    /**
     * Standard function count(node-set)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    private static final ThreadLocal<StringBuffer> threadLocalStringBuffer =

    /**
     * ThreadLocal for StringBuffer used
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    private static final ThreadLocal<StringBuilder> threadLocalStringBuilder =

    /**
     * Re-use a single instance of StringBuffer (per thread) in the basis library.
     * StringBuilder is better, however, DecimalFormat only accept StringBuffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
public final class BasisLibrary {

/**
 * Standard XSLT functions. All standard functions expect the current node
 * and the DOM as their last two arguments.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static int getStringLength(String str) {

    /**
     *  Utility method to calculate string-length as a number of code points,
     *  to avoid possible errors with string that contains
     *  complementary characters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String mapQNameToJavaName (String base ) {

    /**
     * Utility method to allow setting parameters of the form
     * {namespaceuri}localName
     * which get mapped to an instance variable in the class
     * Hence  a parameter of the form "{http://foo.bar}xyz"
     * will be replaced with the corresponding values
     * by the BasisLibrary's utility method mapQNametoJavaName
     * and thus get mapped to legal java variable names
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String replace(String base, char ch, String str) {

    /**
     * Replace a certain character in a string with a new substring.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void runTimeError(String code) {

    /**
     * Print a run-time error message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    private static int prefixIndex = 0;

    /**
     * This function is used in the execution of xsl:element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String getPrefix(String qname) {

    /**
     * This function is used in the execution of xsl:element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String startXslElement(String qname, String namespace,
        SerializationHandler handler, DOM dom, int node)

    /**
     * Utility function for the implementation of xsl:element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void checkQName(String name) {

    /**
     * Utility function to check if a name is a valid qname
     * This method should only be invoked if the attribute value is an AVT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void checkNCName(String name) {

    /**
     * Utility function to check if a name is a valid ncname
     * This method should only be invoked if the attribute value is an AVT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void checkAttribQName(String name) {

    /**
     * Utility function to check if xsl:attribute has a valid qname
     * This method should only be invoked if the name attribute is an AVT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    private static char[] _characterArray = new char[32];

    /**
     * Utility function: used in xsl:copy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static DTMAxisIterator getSingleNode(DTMAxisIterator iterator) {

    /**
     * Utility function: used with nth position filters to convert a sequence
     * of nodes to just one single node (the one at position n).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static DOM referenceToResultTree(Object obj) {

    /**
     * Utility function used to convert references to DOMs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static DTMAxisIterator nodeList2Iterator(
                                        org.w3c.dom.NodeList nodeList,
                                        Translet translet, DOM dom)

    /**
     * Utility function used to convert a w3c NodeList into a internal
     * DOM iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    private static DTMAxisIterator nodeList2IteratorUsingHandleFromNode(
                                        org.w3c.dom.NodeList nodeList,
                                        Translet translet, DOM dom)

    /**
     * In a perfect world, this would be the implementation for
     * nodeList2Iterator. In reality, though, this causes a
     * ClassCastException in getDTMHandleFromNode because SAXImpl is
     * not an instance of DOM2DTM. So we use the more lengthy
     * implementation below until this issue has been addressed.
     *
     * @see org.apache.xml.dtm.ref.DTMManagerDefault#getDTMHandleFromNode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static DTMAxisIterator node2Iterator(org.w3c.dom.Node node,
        Translet translet, DOM dom)

    /**
     * Utility function used to convert a w3c Node into an internal DOM iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String referenceToString(Object obj, DOM dom) {

    /**
     * Utility function: used to convert reference to String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static boolean referenceToBoolean(Object obj) {

    /**
     * Utility function: used to convert reference to boolean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static double referenceToDouble(Object obj) {

    /**
     * Utility function: used to convert reference to double.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static long referenceToLong(Object obj) {

    /**
     * Utility function: used to convert reference to long.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static org.w3c.dom.Node referenceToNode(Object obj, DOM dom) {

    /**
     * Utility function: used to convert reference to org.w3c.dom.Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static NodeList referenceToNodeList(Object obj, DOM dom) {

    /**
     * Utility function: used to convert reference to org.w3c.dom.NodeList.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static DTMAxisIterator referenceToNodeSet(Object obj) {

    /**
     * Utility function: used to convert references to node-sets. If the
     * obj is an instanceof Node then create a singleton iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    private static FieldPosition _fieldPosition = new FieldPosition(0);

    /**
     * Utility function: used to format/adjust  a double to a string. The
     * DecimalFormat object comes from the 'formatSymbols' map in
     * AbstractTranslet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static int realToInt(double d) {

    /**
     * Utility function: used in RealType to convert a real to an integer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String realToString(double d) {

    /**
     * Utility function: used in RealType to convert a real to a string.
     * Removes the decimal if null. Uses a specialized formatter object
     * for very large and very small numbers that ignores locales, thus
     * using always using "." as a decimal separator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static int stringToInt(String s) {

    /**
     * Utility function: used in StringType to convert a string to an int.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static double stringToReal(String s) {

    /**
     * Utility function: used in StringType to convert a string to a real.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static boolean testLanguage(String testLang, DOM dom, int node) {

    /**
     * Utility function: used to test context node's language
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static boolean compare(DTMAxisIterator left, final String rstring,
                                  int op, DOM dom) {

    /**
     * Utility function: node-set/string comparison.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static boolean compare(DTMAxisIterator left, final double rnumber,
                                  final int op, DOM dom) {

    /**
     * Utility function: node-set/number compare.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static boolean compare(DTMAxisIterator left, DTMAxisIterator right,
                                  int op, DOM dom) {

    /**
     * Utility function: node-set/node-set compare.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static DTMAxisIterator nodesetF(Object obj) {

    /**
     * Implements the nodeset() extension function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String objectTypeF(Object obj)

    /**
     * Implements the object-type() extension function.
     *
     * @see <a href="http://www.exslt.org/">EXSLT</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String namespace_uriF(int node, DOM dom) {

    /**
     * XSLT Standard function namespace-uri().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String system_propertyF(String name) {

    /**
     * XSLT Standard function system-property(name)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String namespace_uriF(DTMAxisIterator iter, DOM dom) {

    /**
     * XSLT Standard function namespace-uri(node-set).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void unsupported_ElementF(String qname, boolean isExtension) {

    /**
     * Utility function to throw a runtime error for an unsupported element.
     *
     * This is only used in forward-compatibility mode, when the control flow
     * cannot be determined. In 1.0 mode, the error message is emitted at
     * compile time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void unallowed_extension_elementF(String name) {

    /**
     * Utility function to throw a runtime error on the use of an extension
     * element when the secure processing feature is set to true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void unallowed_extension_functionF(String name) {

    /**
     * Utility function to throw a runtime error on the use of an extension
     * function when the secure processing feature is set to true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static void unresolved_externalF(String name) {

    /**
     * External functions that cannot be resolved are replaced with a call
     * to this method. This method will generate a runtime errors. A good
     * stylesheet checks whether the function exists using conditional
     * constructs, and never really tries to call it if it doesn't exist.
     * But simple stylesheets may result in a call to this method.
     * The compiler should generate a warning if it encounters a call to
     * an unresolved external function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String getLocalName(String value) {

    /**
     * utility function for calls to local-name().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String generate_idF(int node) {

    /**
     * XSLT Standard function generate-id().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String normalize_spaceF(String value) {

    /**
     * XSLT Standard function normalize-space(string).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String normalize_spaceF(int node, DOM dom) {

    /**
     * XSLT Standard function normalize-space().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String translateF(String value, String from, String to) {

    /**
     * XSLT Standard function translate().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String substring_beforeF(String value, String substring) {

    /**
     * XSLT Standard function substring-before().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String substring_afterF(String value, String substring) {

    /**
     * XSLT Standard function substring-after().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String substringF(String value, double start, double length) {

    /**
     * XSLT Standard function substring(). Must take a double because of
     * conversions resulting into NaNs and rounding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String substringF(String value, double start) {

    /**
     * XSLT Standard function substring(). Must take a double because of
     * conversions resulting into NaNs and rounding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static boolean booleanF(Object obj) {

    /**
     * XSLT Standard function boolean()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static double roundF(double d) {

    /**
     * XSLT Standard function round()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static double numberF(Object obj, DOM dom) {

    /**
     * XSLT Standard function number(value)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static double numberF(int node, DOM dom) {

    /**
     * XSLT Standard function number()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String stringF(Object obj, int node, DOM dom) {

    /**
     * XSLT Standard function string(value)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String stringF(Object obj, DOM dom) {

    /**
     * XSLT Standard function string(value)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static String stringF(int node, DOM dom) {

    /**
     * XSLT Standard function string()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static double sumF(DTMAxisIterator iterator, DOM dom) {

    /**
     * XSLT Standard function sum(node-set).
     * stringToDouble is inlined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static int positionF(DTMAxisIterator iterator) {

    /**
     * Standard function position()
     * @deprecated This method exists only for backwards compatibility with old
     *             translets.  New code should not reference it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    public static int countF(DTMAxisIterator iterator) {

    /**
     * Standard function count(node-set)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    private static final ThreadLocal<StringBuffer> threadLocalStringBuffer =

    /**
     * ThreadLocal for StringBuffer used
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
    private static final ThreadLocal<StringBuilder> threadLocalStringBuilder =

    /**
     * Re-use a single instance of StringBuffer (per thread) in the basis library.
     * StringBuilder is better, however, DecimalFormat only accept StringBuffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/BasisLibrary.java
public final class BasisLibrary {

/**
 * Standard XSLT functions. All standard functions expect the current node
 * and the DOM as their last two arguments.
 */
