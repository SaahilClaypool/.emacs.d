_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/MimeHeaders.java
    public Iterator getNonMatchingHeaders(String[] names) {

    /**
     * Returns all of the <code>MimeHeader</code> objects whose name does not
     * match a name in the given array of names.
     *
     * @param names an array of <code>String</code> objects with the names
     *         for which to search
     * @return  an <code>Iterator</code> object over the <code>MimeHeader</code>
     *          objects whose name does not match one of the names in the given list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/MimeHeaders.java
    public Iterator getMatchingHeaders(String[] names) {

    /**
     * Returns all the <code>MimeHeader</code> objects whose name matches
     * a name in the given array of names.
     *
     * @param names an array of <code>String</code> objects with the names
     *         for which to search
     * @return  an <code>Iterator</code> object over the <code>MimeHeader</code>
     *          objects whose name matches one of the names in the given list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/MimeHeaders.java
    public Iterator getAllHeaders() {

    /**
     * Returns all the <code>MimeHeader</code>s in this <code>MimeHeaders</code> object.
     *
     * @return  an <code>Iterator</code> object over this <code>MimeHeaders</code>
     *          object's list of <code>MimeHeader</code> objects
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/MimeHeaders.java
    public void removeAllHeaders() {

    /**
     * Removes all the header entries from this <code>MimeHeaders</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/MimeHeaders.java
    public void removeHeader(String name) {

    /**
     * Remove all <code>MimeHeader</code> objects whose name matches the
     * given name.
     *
     * @param   name a <code>String</code> with the name of the header for
     *          which to search
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/MimeHeaders.java
    public void addHeader(String name, String value)

    /**
     * Adds a <code>MimeHeader</code> object with the specified name and value
     * to this <code>MimeHeaders</code> object's list of headers.
     * <P>
     * Note that RFC822 headers can contain only US-ASCII characters.
     *
     * @param   name a <code>String</code> with the name of the header to
     *          be added
     * @param   value a <code>String</code> with the value of the header to
     *          be added
     *
     * @exception IllegalArgumentException if there was a problem in the
     * mime header name or value being added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/MimeHeaders.java
    public void setHeader(String name, String value)

    /**
     * Replaces the current value of the first header entry whose name matches
     * the given name with the given value, adding a new header if no existing header
     * name matches. This method also removes all matching headers after the first one.
     * <P>
     * Note that RFC822 headers can contain only US-ASCII characters.
     *
     * @param   name a <code>String</code> with the name of the header for
     *          which to search
     * @param   value a <code>String</code> with the value that will replace the
     *          current value of the specified header
     *
     * @exception IllegalArgumentException if there was a problem in the
     * mime header name or the value being set
     * @see #getHeader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/MimeHeaders.java
    public String[] getHeader(String name) {

    /**
     * Returns all of the values for the specified header as an array of
     * <code>String</code> objects.
     *
     * @param   name the name of the header for which values will be returned
     * @return a <code>String</code> array with all of the values for the
     *         specified header
     * @see #setHeader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/MimeHeaders.java
    public MimeHeaders() {

   /**
    * Constructs a default <code>MimeHeaders</code> object initialized with
    * an empty <code>Vector</code> object.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/MimeHeaders.java
public class MimeHeaders {

/**
 * A container for <code>MimeHeader</code> objects, which represent
 * the MIME headers present in a MIME part of a message.
 *
 * <p>This class is used primarily when an application wants to
 * retrieve specific attachments based on certain MIME headers and
 * values. This class will most likely be used by implementations of
 * <code>AttachmentPart</code> and other MIME dependent parts of the SAAJ
 * API.
 * @see SOAPMessage#getAttachments
 * @see AttachmentPart
 */
