_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public void setProperty(String name, Object value) {

    /**
     * Set property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public Object getProperty(String name) {

    /**
     * Get property value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public void setFeature(String name, boolean value) {

    /**
     * Set feature
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public void setServicesMechnism(boolean flag) {

    /**
     * Set the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public boolean useServicesMechnism() {

    /**
     * Return the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public synchronized void releaseXMLReader(XMLReader reader) {

    /**
     * Mark the cached XMLReader as available.  If the reader was not
     * actually in the cache, do nothing.
     *
     * @param reader The XMLReader that's being released.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public synchronized XMLReader getXMLReader() throws SAXException {

    /**
     * Retrieves a cached XMLReader for this thread, or creates a new
     * XMLReader, if the existing reader is in use.  When the caller no
     * longer needs the reader, it must release it with a call to
     * {@link #releaseXMLReader}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public static XMLReaderManager getInstance(boolean useServicesMechanism) {

    /**
     * Retrieves the singleton reader manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    private XMLReaderManager() {

    /**
     * Hidden constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    private String _accessExternalDTD = XalanConstants.EXTERNAL_ACCESS_DEFAULT;

     /**
     * protocols allowed for external DTD references in source file and/or stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    private HashMap m_inUse;

    /**
     * Keeps track of whether an XMLReader object is in use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    private ThreadLocal m_readers;

    /**
     * Cache of XMLReader objects
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    private static SAXParserFactory m_parserFactory;

    /**
     * Parser factory to be used to construct XMLReader objects
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
public class XMLReaderManager {

/**
 * Creates XMLReader objects and caches them for re-use.
 * This class follows the singleton pattern.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public void setProperty(String name, Object value) {

    /**
     * Set property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public Object getProperty(String name) {

    /**
     * Get property value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public void setFeature(String name, boolean value) {

    /**
     * Set feature
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public void setServicesMechnism(boolean flag) {

    /**
     * Set the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public boolean useServicesMechnism() {

    /**
     * Return the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public synchronized void releaseXMLReader(XMLReader reader) {

    /**
     * Mark the cached XMLReader as available.  If the reader was not
     * actually in the cache, do nothing.
     *
     * @param reader The XMLReader that's being released.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public synchronized XMLReader getXMLReader() throws SAXException {

    /**
     * Retrieves a cached XMLReader for this thread, or creates a new
     * XMLReader, if the existing reader is in use.  When the caller no
     * longer needs the reader, it must release it with a call to
     * {@link #releaseXMLReader}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    public static XMLReaderManager getInstance(boolean useServicesMechanism) {

    /**
     * Retrieves the singleton reader manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    private XMLReaderManager() {

    /**
     * Hidden constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    private String _accessExternalDTD = XalanConstants.EXTERNAL_ACCESS_DEFAULT;

     /**
     * protocols allowed for external DTD references in source file and/or stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    private HashMap m_inUse;

    /**
     * Keeps track of whether an XMLReader object is in use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    private ThreadLocal m_readers;

    /**
     * Cache of XMLReader objects
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
    private static SAXParserFactory m_parserFactory;

    /**
     * Parser factory to be used to construct XMLReader objects
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLReaderManager.java
public class XMLReaderManager {

/**
 * Creates XMLReader objects and caches them for re-use.
 * This class follows the singleton pattern.
 */
