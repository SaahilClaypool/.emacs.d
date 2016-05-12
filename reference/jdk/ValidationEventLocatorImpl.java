_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public String toString() {

    /**
     * Returns a string representation of this object in a format
     * helpful to debugging.
     *
     * @see Object#equals(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public void setNode( Node _node ) {

    /**
     * Set the Node field on this event locator.  Null values are allowed.
     *
     * @param _node the Node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public Node getNode() {

    /**
     * @see javax.xml.bind.ValidationEventLocator#getNode()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public void setObject( Object _object ) {

    /**
     * Set the Object field on this event locator.  Null values are allowed.
     *
     * @param _object the java content object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public Object getObject() {

    /**
     * @see javax.xml.bind.ValidationEventLocator#getObject()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public void setColumnNumber( int _columnNumber ) {

    /**
     * Set the columnNumber field on this event locator.
     *
     * @param _columnNumber the column number
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public int getColumnNumber() {

    /**
     * @see javax.xml.bind.ValidationEventLocator#getColumnNumber()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public void setLineNumber( int _lineNumber ) {

    /**
     * Set the lineNumber field on this event locator.
     *
     * @param _lineNumber the line number
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public int getLineNumber() {

    /**
     * @see javax.xml.bind.ValidationEventLocator#getLineNumber()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public void setOffset( int _offset ) {

    /**
     * Set the offset field on this event locator.
     *
     * @param _offset the offset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public int getOffset() {

    /**
     * @see javax.xml.bind.ValidationEventLocator#getOffset()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public void setURL( URL _url ) {

    /**
     * Set the URL field on this event locator.  Null values are allowed.
     *
     * @param _url the url
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public URL getURL() {

    /**
     * @see javax.xml.bind.ValidationEventLocator#getURL()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    private static URL toURL( String systemId ) {

    /** Converts a system ID to an URL object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public ValidationEventLocatorImpl(Object _object) {

    /**
     * Constructs an object that points to a JAXB content object.
     *
     * The object's Object becomes available. ColumnNumber, LineNumber, Node,
     * Offset, and URL are not available.
     *
     * @param _object the Object that will be used to populate this
     * event locator.
     * @throws IllegalArgumentException if the Object is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public ValidationEventLocatorImpl(Node _node) {

    /**
     * Constructs an object that points to a DOM Node.
     *
     * The object's Node becomes available.  ColumnNumber, LineNumber, Object,
     * Offset, and URL are not available.
     *
     * @param _node the DOM Node object that will be used to populate this
     * event locator.
     * @throws IllegalArgumentException if the Node is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public ValidationEventLocatorImpl( SAXParseException e ) {

    /**
     * Constructs an object from the location information of a SAXParseException.
     *
     * The object's ColumnNumber, LineNumber, and URL become available from the
     * values returned by the locator's getColumnNumber(), getLineNumber(), and
     * getSystemId() methods respectively. Node, Object, and Offset are not
     * available.
     *
     * @param e the SAXParseException object that will be used to populate this
     * event locator.
     * @throws IllegalArgumentException if the SAXParseException is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public ValidationEventLocatorImpl( Locator loc ) {

    /**
     * Constructs an object from an org.xml.sax.Locator.
     *
     * The object's ColumnNumber, LineNumber, and URL become available from the
     * values returned by the locator's getColumnNumber(), getLineNumber(), and
     * getSystemId() methods respectively. Node, Object, and Offset are not
     * available.
     *
     * @param loc the SAX Locator object that will be used to populate this
     * event locator.
     * @throws IllegalArgumentException if the Locator is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
    public ValidationEventLocatorImpl() {

    /**
     * Creates an object with all fields unavailable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventLocatorImpl.java
public class ValidationEventLocatorImpl implements ValidationEventLocator

/**
 * Default implementation of the ValidationEventLocator interface.
 *
 * <p>
 * JAXB providers are allowed to use whatever class that implements
 * the ValidationEventLocator interface. This class is just provided for a
 * convenience.
 *
 * @author <ul><li>Kohsuke Kawaguchi, Sun Microsystems, Inc.</li></ul>
 * @see javax.xml.bind.Validator
 * @see javax.xml.bind.ValidationEventHandler
 * @see javax.xml.bind.ValidationEvent
 * @see javax.xml.bind.ValidationEventLocator
 * @since JAXB1.0
 */
