_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public int addCharacterData(String newData) {

    /**
     * Add literal text to char arrays that will be used to store character
     * data in the stylesheet.
     * @param newData String data to be added to char arrays.
     *                Pre-condition:  <code>newData.length() &le; 21845</code>
     * @return int offset at which character data will be stored
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public int getCharacterDataCount() {

    /**
     * Get the number of char[] arrays, thus far, that will be created to
     * store literal text in the stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public String getCharacterData(int index) {

    /**
     * Retrieve a string representation of the character data to be stored
     * in the translet as a <code>char[]</code>.  There may be more than
     * one such array required.
     * @param index The index of the <code>char[]</code>.  Zero-based.
     * @return String The character data to be stored in the corresponding
     *               <code>char[]</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean debug() {

    /**
     * Get current debugging message setting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setDebug(boolean debug) {

    /**
     * Turn debugging messages on/off
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void outputToJar() throws IOException {

    /**
     * Generate output JAR-file and packages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private String entryName(File f) throws IOException {

    /**
     * File separators are converted to forward slashes for ZIP files.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public String getHelperClassName() {

    /**
     * Returns a unique name for every helper class needed to
     * execute a translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public int registerNamespace(String namespaceURI) {

    /**
     * Registers a namespace and gives it a type so that it can be mapped to
     * DOM namespace types at run-time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public int registerNamespacePrefix(QName name) {

     /**
      * Registers a namespace prefix and gives it a type so that it can be mapped to
      * DOM namespace types at run-time.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public int registerElement(QName name) {

    /**
     * Registers an element and gives it a type so that it can be mapped to
     * DOM element types at run-time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public int registerAttribute(QName name) {

    /**
     * Registers an attribute and gives it a type so that it can be mapped to
     * DOM attribute types at run-time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public Stylesheet getStylesheet() {

    /**
     * Returns the top-level stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setStylesheet(Stylesheet stylesheet) {

    /**
     * Set the top-level stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setJarFileName(String jarFileName) {

    /**
     * Set the name of an optional JAR-file to dump the translet and
     * auxiliary classes to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setPackageName(String packageName) {

    /**
     * Set an optional package name for the translet and auxiliary classes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean setDestDirectory(String dstDirName) {

    /**
     * Set the destination directory for the translet.
     * The current working directory will be used by default.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private File getOutputFile(String className) {

    /**
     * Generate an output File object to send the translet to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private String classFileName(final String className) {

    /**
     * Convert for Java class name of local system file name.
     * (Replace '.' with '/' on UNIX and replace '.' by '\' on Windows/DOS.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public String getClassName() {

    /**
     * Get the class name for the generated translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setClassName(String className) {

    /**
     * Set the class name for the generated translet. This class name is
     * overridden if multiple stylesheets are compiled in one go using the
     * compile(Vector urls) method.
     * @param className The name to assign to the translet class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    protected void setCallsNodeset(boolean flag) {

    /**
     * This method is called by the XPathParser when it encounters a call
     * to the nodeset() extension function. Implies multi document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    protected void setMultiDocument(boolean flag) {

    /**
     * This method is called by the XPathParser when it encounters a call
     * to the document() function. Affects the DOM used by the translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void printWarnings() {

    /**
     * Print all compile warning messages to standard output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void printErrors() {

    /**
     * Print all compile error messages to standard output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public Vector getWarnings() {

    /**
     * Get a Vector containing all compile warning messages
     * @return A Vector containing all compile error messages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public Vector getErrors() {

    /**
     * Get a Vector containing all compile error messages
     * @return A Vector containing all compile error messages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public XMLReader getXMLReader() {

    /**
     * Get the XMLReader to use for parsing the next input stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setXMLReader(XMLReader reader) {

    /**
     * Set the XMLReader to use for parsing the next input stylesheet
     * @param reader XMLReader (SAX2 parser) to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public byte[][] compile(String name, InputSource input) {

    /**
     * Compiles a stylesheet pointed to by a URL. The result is put in a
     * set of byte arrays. One byte array for each generated class.
     * @param name The name of the translet class to generate
     * @param input An InputSource that will pass in the stylesheet contents
     * @return JVM bytecodes that represent translet class definition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public byte[][] compile(String name, InputSource input, int outputType) {

    /**
     * Compiles a stylesheet pointed to by a URL. The result is put in a
     * set of byte arrays. One byte array for each generated class.
     * @param name The name of the translet class to generate
     * @param input An InputSource that will pass in the stylesheet contents
     * @param outputType The output type
     * @return JVM bytecodes that represent translet class definition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public byte[][] getBytecodes() {

    /**
     * Returns an array of bytecode arrays generated by a compilation.
     * @return JVM bytecodes that represent translet class definition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean compile(Vector stylesheets) {

    /**
     * Compiles a set of stylesheets pointed to by a Vector of URLs
     * @param stylesheets A Vector containing URLs pointing to the stylesheets
     * @return 'true' if the compilation was successful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean compile(InputSource input, String name) {

    /**
     * Compiles an XSL stylesheet passed in through an InputStream
     * @param input An InputSource that will pass in the stylesheet contents
     * @param name The name of the translet class to generate - can be null
     * @return 'true' if the compilation was successful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean compile(InputStream stream, String name) {

    /**
     * Compiles an XSL stylesheet passed in through an InputStream
     * @param stream An InputStream that will pass in the stylesheet contents
     * @param name The name of the translet class to generate
     * @return 'true' if the compilation was successful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean compile(URL url, String name) {

    /**
     * Compiles an XSL stylesheet pointed to by a URL
     * @param url An URL containing the input XSL stylesheet
     * @param name The name to assign to the translet class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean compile(URL url) {

    /**
     * Compiles an XSL stylesheet pointed to by a URL
     * @param url An URL containing the input XSL stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setPIParameters(String media, String title, String charset) {

    /**
     * Set the parameters to use to locate the correct <?xml-stylesheet ...?>
     * processing instruction in the case where the input document to the
     * compiler (and parser) is an XML document.
     * @param media The media attribute to be matched. May be null, in which
     * case the prefered templates will be used (i.e. alternate = no).
     * @param title The value of the title attribute to match. May be null.
     * @param charset The value of the charset attribute to match. May be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean getTemplateInlining() {

     /**
     * Return the state of the template inlining feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setTemplateInlining(boolean templateInlining) {

    /**
     * Set a flag indicating if templates are to be inlined or not. The
     * default is to do inlining, but this causes problems when the
     * stylesheets have a large number of templates (e.g. branch targets
     * exceeding 64K or a length of a method exceeding 64K).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setSourceLoader(SourceLoader loader) {

    /**
     * Defines an external SourceLoader to provide the compiler with documents
     * referenced in xsl:include/import
     * @param loader The SourceLoader to use for include/import
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private void reset() {

    /**
     * Initializes the compiler to produce a new translet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void init() {

    /**
     * Initializes the compiler to compile a new stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public Properties getOutputProperties() {

    /**
     * Only for user by the internal TrAX implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setOutputType(int type) {

    /**
     * Only for user by the internal TrAX implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public Parser getParser() {

    /**
     * Only for user by the internal TrAX implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setProperty(String name, Object value) {

    /**
     * Set allowed protocols for accessing external stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public Object getProperty(String name) {

    /**
     * Return allowed protocols for accessing external stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean getFeature(Feature name) {

     /**
     * Return the value of the specified feature
     * @param name name of the feature
     * @return true if the feature is enabled, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setServicesMechnism(boolean flag) {

    /**
     * Set the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean useServicesMechnism() {

    /**
     * Return the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean isSecureProcessing() {

    /**
     * Return the state of the secure processing feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setSecureProcessing(boolean flag) {

    /**
     * Set the state of the secure processing feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public XSLTC(boolean useServicesMechanism, FeatureManager featureManager) {

    /**
     * XSLTC compiler constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private final Map<String, Class> _externalExtensionFunctions;

    /**
    *  HashMap with the loaded classes
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    /* Class loader reference that will be used for external extension functions loading */

    /**
    *  Extension function class loader variables
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private String _accessExternalStylesheet = XalanConstants.EXTERNAL_ACCESS_DEFAULT;

    /**
     * protocols allowed for external references set by the stylesheet processing instruction, Import and Include element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private boolean _isSecureProcessing = false;

    /**
     * State of the secure processing feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private boolean _templateInlining = false;

    /**
     * Set to true if template inlining is requested. Template
     * inlining used to be the default, but we have found that
     * Hotspots does a better job with shorter methods, so the
     * default is *not* to inline now.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
public final class XSLTC {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author G. Todd Miller
 * @author Morten Jorgensen
 * @author John Howard (johnh@schemasoft.com)
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public int addCharacterData(String newData) {

    /**
     * Add literal text to char arrays that will be used to store character
     * data in the stylesheet.
     * @param newData String data to be added to char arrays.
     *                Pre-condition:  <code>newData.length() &le; 21845</code>
     * @return int offset at which character data will be stored
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public int getCharacterDataCount() {

    /**
     * Get the number of char[] arrays, thus far, that will be created to
     * store literal text in the stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public String getCharacterData(int index) {

    /**
     * Retrieve a string representation of the character data to be stored
     * in the translet as a <code>char[]</code>.  There may be more than
     * one such array required.
     * @param index The index of the <code>char[]</code>.  Zero-based.
     * @return String The character data to be stored in the corresponding
     *               <code>char[]</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean debug() {

    /**
     * Get current debugging message setting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setDebug(boolean debug) {

    /**
     * Turn debugging messages on/off
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void outputToJar() throws IOException {

    /**
     * Generate output JAR-file and packages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private String entryName(File f) throws IOException {

    /**
     * File separators are converted to forward slashes for ZIP files.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public String getHelperClassName() {

    /**
     * Returns a unique name for every helper class needed to
     * execute a translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public int registerNamespace(String namespaceURI) {

    /**
     * Registers a namespace and gives it a type so that it can be mapped to
     * DOM namespace types at run-time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public int registerNamespacePrefix(QName name) {

     /**
      * Registers a namespace prefix and gives it a type so that it can be mapped to
      * DOM namespace types at run-time.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public int registerElement(QName name) {

    /**
     * Registers an element and gives it a type so that it can be mapped to
     * DOM element types at run-time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public int registerAttribute(QName name) {

    /**
     * Registers an attribute and gives it a type so that it can be mapped to
     * DOM attribute types at run-time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public Stylesheet getStylesheet() {

    /**
     * Returns the top-level stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setStylesheet(Stylesheet stylesheet) {

    /**
     * Set the top-level stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setJarFileName(String jarFileName) {

    /**
     * Set the name of an optional JAR-file to dump the translet and
     * auxiliary classes to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setPackageName(String packageName) {

    /**
     * Set an optional package name for the translet and auxiliary classes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean setDestDirectory(String dstDirName) {

    /**
     * Set the destination directory for the translet.
     * The current working directory will be used by default.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private File getOutputFile(String className) {

    /**
     * Generate an output File object to send the translet to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private String classFileName(final String className) {

    /**
     * Convert for Java class name of local system file name.
     * (Replace '.' with '/' on UNIX and replace '.' by '\' on Windows/DOS.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public String getClassName() {

    /**
     * Get the class name for the generated translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setClassName(String className) {

    /**
     * Set the class name for the generated translet. This class name is
     * overridden if multiple stylesheets are compiled in one go using the
     * compile(Vector urls) method.
     * @param className The name to assign to the translet class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    protected void setCallsNodeset(boolean flag) {

    /**
     * This method is called by the XPathParser when it encounters a call
     * to the nodeset() extension function. Implies multi document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    protected void setMultiDocument(boolean flag) {

    /**
     * This method is called by the XPathParser when it encounters a call
     * to the document() function. Affects the DOM used by the translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void printWarnings() {

    /**
     * Print all compile warning messages to standard output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void printErrors() {

    /**
     * Print all compile error messages to standard output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public Vector getWarnings() {

    /**
     * Get a Vector containing all compile warning messages
     * @return A Vector containing all compile error messages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public Vector getErrors() {

    /**
     * Get a Vector containing all compile error messages
     * @return A Vector containing all compile error messages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public XMLReader getXMLReader() {

    /**
     * Get the XMLReader to use for parsing the next input stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setXMLReader(XMLReader reader) {

    /**
     * Set the XMLReader to use for parsing the next input stylesheet
     * @param reader XMLReader (SAX2 parser) to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public byte[][] compile(String name, InputSource input) {

    /**
     * Compiles a stylesheet pointed to by a URL. The result is put in a
     * set of byte arrays. One byte array for each generated class.
     * @param name The name of the translet class to generate
     * @param input An InputSource that will pass in the stylesheet contents
     * @return JVM bytecodes that represent translet class definition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public byte[][] compile(String name, InputSource input, int outputType) {

    /**
     * Compiles a stylesheet pointed to by a URL. The result is put in a
     * set of byte arrays. One byte array for each generated class.
     * @param name The name of the translet class to generate
     * @param input An InputSource that will pass in the stylesheet contents
     * @param outputType The output type
     * @return JVM bytecodes that represent translet class definition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public byte[][] getBytecodes() {

    /**
     * Returns an array of bytecode arrays generated by a compilation.
     * @return JVM bytecodes that represent translet class definition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean compile(Vector stylesheets) {

    /**
     * Compiles a set of stylesheets pointed to by a Vector of URLs
     * @param stylesheets A Vector containing URLs pointing to the stylesheets
     * @return 'true' if the compilation was successful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean compile(InputSource input, String name) {

    /**
     * Compiles an XSL stylesheet passed in through an InputStream
     * @param input An InputSource that will pass in the stylesheet contents
     * @param name The name of the translet class to generate - can be null
     * @return 'true' if the compilation was successful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean compile(InputStream stream, String name) {

    /**
     * Compiles an XSL stylesheet passed in through an InputStream
     * @param stream An InputStream that will pass in the stylesheet contents
     * @param name The name of the translet class to generate
     * @return 'true' if the compilation was successful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean compile(URL url, String name) {

    /**
     * Compiles an XSL stylesheet pointed to by a URL
     * @param url An URL containing the input XSL stylesheet
     * @param name The name to assign to the translet class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean compile(URL url) {

    /**
     * Compiles an XSL stylesheet pointed to by a URL
     * @param url An URL containing the input XSL stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setPIParameters(String media, String title, String charset) {

    /**
     * Set the parameters to use to locate the correct <?xml-stylesheet ...?>
     * processing instruction in the case where the input document to the
     * compiler (and parser) is an XML document.
     * @param media The media attribute to be matched. May be null, in which
     * case the prefered templates will be used (i.e. alternate = no).
     * @param title The value of the title attribute to match. May be null.
     * @param charset The value of the charset attribute to match. May be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean getTemplateInlining() {

     /**
     * Return the state of the template inlining feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setTemplateInlining(boolean templateInlining) {

    /**
     * Set a flag indicating if templates are to be inlined or not. The
     * default is to do inlining, but this causes problems when the
     * stylesheets have a large number of templates (e.g. branch targets
     * exceeding 64K or a length of a method exceeding 64K).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setSourceLoader(SourceLoader loader) {

    /**
     * Defines an external SourceLoader to provide the compiler with documents
     * referenced in xsl:include/import
     * @param loader The SourceLoader to use for include/import
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private void reset() {

    /**
     * Initializes the compiler to produce a new translet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void init() {

    /**
     * Initializes the compiler to compile a new stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public Properties getOutputProperties() {

    /**
     * Only for user by the internal TrAX implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setOutputType(int type) {

    /**
     * Only for user by the internal TrAX implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public Parser getParser() {

    /**
     * Only for user by the internal TrAX implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setProperty(String name, Object value) {

    /**
     * Set allowed protocols for accessing external stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public Object getProperty(String name) {

    /**
     * Return allowed protocols for accessing external stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean getFeature(Feature name) {

     /**
     * Return the value of the specified feature
     * @param name name of the feature
     * @return true if the feature is enabled, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setServicesMechnism(boolean flag) {

    /**
     * Set the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean useServicesMechnism() {

    /**
     * Return the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public boolean isSecureProcessing() {

    /**
     * Return the state of the secure processing feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public void setSecureProcessing(boolean flag) {

    /**
     * Set the state of the secure processing feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    public XSLTC(boolean useServicesMechanism, FeatureManager featureManager) {

    /**
     * XSLTC compiler constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private final Map<String, Class> _externalExtensionFunctions;

    /**
    *  HashMap with the loaded classes
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    /* Class loader reference that will be used for external extension functions loading */

    /**
    *  Extension function class loader variables
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private String _accessExternalStylesheet = XalanConstants.EXTERNAL_ACCESS_DEFAULT;

    /**
     * protocols allowed for external references set by the stylesheet processing instruction, Import and Include element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private boolean _isSecureProcessing = false;

    /**
     * State of the secure processing feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
    private boolean _templateInlining = false;

    /**
     * Set to true if template inlining is requested. Template
     * inlining used to be the default, but we have found that
     * Hotspots does a better job with shorter methods, so the
     * default is *not* to inline now.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XSLTC.java
public final class XSLTC {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author G. Todd Miller
 * @author Morten Jorgensen
 * @author John Howard (johnh@schemasoft.com)
 */
