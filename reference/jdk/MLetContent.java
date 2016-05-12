_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    private String getParameter(String name) {

    /**
     * Gets the value of the specified
     * attribute of the <CODE>MLET</CODE> tag.
     *
     * @param name A string representing the name of the attribute.
     * @return The value of the specified
     * attribute of the <CODE>MLET</CODE> tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    public List<String> getParameterValues() {

    /**
     * Gets the list of values of the <code>VALUE</code> attribute in
     * each nested &lt;PARAM&gt; tag within the <code>MLET</code>
     * tag.
     * @return the list of values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    public List<String> getParameterTypes() {

    /**
     * Gets the list of values of the <code>TYPE</code> attribute in
     * each nested &lt;PARAM&gt; tag within the <code>MLET</code>
     * tag.
     * @return the list of types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    public String getVersion() {

    /**
     * Gets the value of the <CODE>VERSION</CODE>
     * attribute of the <CODE>MLET</CODE> tag.
     * @return The value of the <CODE>VERSION</CODE>
     * attribute of the <CODE>MLET</CODE> tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    public String getName() {

    /**
     * Gets the value of the <CODE>NAME</CODE>
     * attribute of the <CODE>MLET</CODE> tag.
     * @return The value of the <CODE>NAME</CODE>
     * attribute of the <CODE>MLET</CODE> tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    public String getSerializedObject() {

    /**
     * Gets the value of the <CODE>OBJECT</CODE>
     * attribute of the <CODE>MLET</CODE> tag.
     * @return The value of the <CODE>OBJECT</CODE>
     * attribute of the <CODE>MLET</CODE> tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    public String getCode() {

    /**
     * Gets the value of the <CODE>CODE</CODE>
     * attribute of the <CODE>MLET</CODE> tag.
     * @return The value of the <CODE>CODE</CODE>
     * attribute of the <CODE>MLET</CODE> tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    public String getJarFiles() {

    /**
     * Gets the list of <CODE>.jar</CODE> files specified by the <CODE>ARCHIVE</CODE>
     * attribute of the <CODE>MLET</CODE> tag.
     * @return A comma-separated list of <CODE>.jar</CODE> file names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    public URL getCodeBase() {

    /**
     * Gets the code base URL.
     * @return The code base URL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    public URL getDocumentBase() {

    /**
     * Gets the MLet text file's base URL.
     * @return The MLet text file's base URL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    public Map<String,String> getAttributes() {

    /**
     * Gets the attributes of the <CODE>MLET</CODE> tag.  The keys in
     * the returned map are the attribute names in lowercase, for
     * example <code>codebase</code>.  The values are the associated
     * attribute values.
     * @return A map of the attributes of the <CODE>MLET</CODE> tag
     * and their values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    public MLetContent(URL url, Map<String,String> attributes,
                       List<String> types, List<String> values) {

    /**
     * Creates an <CODE>MLet</CODE> instance initialized with attributes read
     * from an <CODE>MLET</CODE> tag in an MLet text file.
     *
     * @param url The URL of the MLet text file containing the
     * <CODE>MLET</CODE> tag.
     * @param attributes A map of the attributes of the <CODE>MLET</CODE> tag.
     * The keys in this map are the attribute names in lowercase, for
     * example <code>codebase</code>.  The values are the associated attribute
     * values.
     * @param types A list of the TYPE attributes that appeared in nested
     * &lt;PARAM&gt; tags.
     * @param values A list of the VALUE attributes that appeared in nested
     * &lt;PARAM&gt; tags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    private URL documentURL;

    /**
     * The MLet text file's base URL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    private List<String> values;

    /**
     * An ordered list of the VALUE attributes that appeared in nested
     * &lt;PARAM&gt; tags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    private List<String> types;

    /**
     * An ordered list of the TYPE attributes that appeared in nested
     * &lt;PARAM&gt; tags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
    private Map<String,String> attributes;

    /**
     * A map of the attributes of the <CODE>MLET</CODE> tag
     * and their values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetContent.java
public class MLetContent {

/**
 * This class represents the contents of the <CODE>MLET</CODE> tag.
 * It can be consulted by a subclass of {@link MLet} that overrides
 * the {@link MLet#check MLet.check} method.
 *
 * @since 1.6
 */
