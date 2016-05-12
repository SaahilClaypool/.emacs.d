_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/XmlSupport.java
    static void importMap(InputStream is, Map<String, String> m)

    /**
     * Import Map from the specified input stream, which is assumed
     * to contain a map document as per the prefs DTD.  This is used
     * as the internal (undocumented) format for FileSystemPrefs.  The
     * key-value pairs specified in the XML document will be put into
     * the specified Map.  (If this Map is empty, it will contain exactly
     * the key-value pairs int the XML-document when this method returns.)
     *
     * @throws IOException if reading from the specified output stream
     *         results in an <tt>IOException</tt>.
     * @throws InvalidPreferencesFormatException Data on input stream does not
     *         constitute a valid XML document with the mandated document type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/XmlSupport.java
    static void exportMap(OutputStream os, Map<String, String> map) throws IOException {

    /**
     * Export the specified Map<String,String> to a map document on
     * the specified OutputStream as per the prefs DTD.  This is used
     * as the internal (undocumented) format for FileSystemPrefs.
     *
     * @throws IOException if writing to the specified output stream
     *         results in an <tt>IOException</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/XmlSupport.java
    private static void ImportPrefs(Preferences prefsNode, Element map) {

    /**
     * Import the preferences described by the specified XML element
     * (a map from a preferences document) into the specified
     * preferences node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/XmlSupport.java
    private static void ImportSubtree(Preferences prefsNode, Element xmlNode) {

    /**
     * Recursively traverse the specified preferences node and store
     * the described preferences into the system or current user
     * preferences tree, as appropriate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/XmlSupport.java
    private static final void writeDoc(Document doc, OutputStream out)

    /**
     * Write XML document to the specified output stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/XmlSupport.java
    private static Document loadPrefsDoc(InputStream in)

    /**
     * Load an XML document from specified input stream, which must
     * have the requisite DTD URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/XmlSupport.java
    private static Document createPrefsDoc( String qname ) {

    /**
     * Create a new prefs XML document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/XmlSupport.java
    static void importPreferences(InputStream is)

    /**
     * Import preferences from the specified input stream, which is assumed
     * to contain an XML document in the format described in the Preferences
     * spec.
     *
     * @throws IOException if reading from the specified output stream
     *         results in an <tt>IOException</tt>.
     * @throws InvalidPreferencesFormatException Data on input stream does not
     *         constitute a valid XML document with the mandated document type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/XmlSupport.java
    private static void putPreferencesInXml(Element elt, Document doc,
               Preferences prefs, boolean subTree) throws BackingStoreException

    /**
     * Put the preferences in the specified Preferences node into the
     * specified XML element which is assumed to represent a node
     * in the specified XML document which is assumed to conform to
     * PREFS_DTD.  If subTree is true, create children of the specified
     * XML node conforming to all of the children of the specified
     * Preferences node and recurse.
     *
     * @throws BackingStoreException if it is not possible to read
     *         the preferences or children out of the specified
     *         preferences node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/XmlSupport.java
    static void export(OutputStream os, final Preferences p, boolean subTree)

    /**
     * Export the specified preferences node and, if subTree is true, all
     * subnodes, to the specified output stream.  Preferences are exported as
     * an XML document conforming to the definition in the Preferences spec.
     *
     * @throws IOException if writing to the specified output stream
     *         results in an <tt>IOException</tt>.
     * @throws BackingStoreException if preference data cannot be read from
     *         backing store.
     * @throws IllegalStateException if this node (or an ancestor) has been
     *         removed with the {@link Preferences#removeNode()} method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/XmlSupport.java
    private static final String EXTERNAL_XML_VERSION = "1.0";

    /**
     * Version number for the format exported preferences files.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/XmlSupport.java
class XmlSupport {

/**
 * XML Support for java.util.prefs. Methods to import and export preference
 * nodes and subtrees.
 *
 * @author  Josh Bloch and Mark Reinhold
 * @see     Preferences
 * @since   1.4
 */
