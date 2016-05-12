_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public abstract Source getContent() throws SOAPException;

    /**
     * Returns the content of the SOAPEnvelope as a JAXP <code>Source</code>
     * object.
     *
     * @return the content as a <code>javax.xml.transform.Source</code> object
     *
     * @exception SOAPException if the implementation cannot convert
     *                          the specified <code>Source</code> object
     * @see #setContent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public abstract void setContent(Source source) throws SOAPException;

    /**
     * Sets the content of the <code>SOAPEnvelope</code> object with the data
     * from the given <code>Source</code> object. This <code>Source</code>
     * must contain a valid SOAP document.
     *
     * @param source the <code>javax.xml.transform.Source</code> object with the
     *        data to be set
     *
     * @exception SOAPException if there is a problem in setting the source
     * @see #getContent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public abstract Iterator getNonMatchingMimeHeaders(String[] names);

    /**
     * Retrieves all <code>MimeHeader</code> objects whose name does
     * not match a name in the given array.
     *
     * @param names a <code>String</code> array with the name(s) of the
     *        MIME headers not to be returned
     * @return  all of the MIME headers in this <code>SOAPPart</code> object
     *          except those that match one of the names in the
     *           given array.  The nonmatching MIME headers are returned as an
     *           <code>Iterator</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public abstract Iterator getMatchingMimeHeaders(String[] names);

    /**
     * Retrieves all <code>MimeHeader</code> objects that match a name in
     * the given array.
     *
     * @param names a <code>String</code> array with the name(s) of the
     *        MIME headers to be returned
     * @return  all of the MIME headers that match one of the names in the
     *           given array, returned as an <code>Iterator</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public abstract Iterator getAllMimeHeaders();

    /**
     * Retrieves all the headers for this <code>SOAPPart</code> object
     * as an iterator over the <code>MimeHeader</code> objects.
     *
     * @return  an <code>Iterator</code> object with all of the Mime
     *          headers for this <code>SOAPPart</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public abstract void addMimeHeader(String name, String value);

    /**
     * Creates a <code>MimeHeader</code> object with the specified
     * name and value and adds it to this <code>SOAPPart</code> object.
     * If a <code>MimeHeader</code> with the specified name already
     * exists, this method adds the specified value to the already
     * existing value(s).
     * <P>
     * Note that RFC822 headers can contain only US-ASCII characters.
     *
     * @param   name    a <code>String</code> giving the header name
     * @param   value   a <code>String</code> giving the value to be set
     *                  or added
     * @exception IllegalArgumentException if there was a problem with
     *            the specified mime header name or value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public abstract void setMimeHeader(String name, String value);

    /**
     * Changes the first header entry that matches the given header name
     * so that its value is the given value, adding a new header with the
     * given name and value if no
     * existing header is a match. If there is a match, this method clears
     * all existing values for the first header that matches and sets the
     * given value instead. If more than one header has
     * the given name, this method removes all of the matching headers after
     * the first one.
     * <P>
     * Note that RFC822 headers can contain only US-ASCII characters.
     *
     * @param   name    a <code>String</code> giving the header name
     *                  for which to search
     * @param   value   a <code>String</code> giving the value to be set.
     *                  This value will be substituted for the current value(s)
     *                  of the first header that is a match if there is one.
     *                  If there is no match, this value will be the value for
     *                  a new <code>MimeHeader</code> object.
     *
     * @exception IllegalArgumentException if there was a problem with
     *            the specified mime header name or value
     * @see #getMimeHeader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public abstract String[] getMimeHeader(String name);

    /**
     * Gets all the values of the <code>MimeHeader</code> object
     * in this <code>SOAPPart</code> object that
     * is identified by the given <code>String</code>.
     *
     * @param name the name of the header; example: "Content-Type"
     * @return a <code>String</code> array giving all the values for the
     *         specified header
     * @see #setMimeHeader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public abstract void removeAllMimeHeaders();

    /**
     * Removes all the <code>MimeHeader</code> objects for this
     * <code>SOAPEnvelope</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public abstract void removeMimeHeader(String header);

    /**
     * Removes all MIME headers that match the given name.
     *
     * @param header a <code>String</code> giving the name of the MIME header(s) to
     *               be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public void setContentLocation(String contentLocation)

    /**
     * Sets the value of the MIME header "Content-Location"
     * to the given <code>String</code>.
     *
     * @param contentLocation a <code>String</code> giving the value
     *        of the MIME
     *        header "Content-Location"
     * @exception IllegalArgumentException if there is a problem in
     *            setting the content location.
     * @see #getContentLocation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public void setContentId(String contentId)

    /**
     * Sets the value of the MIME header named "Content-Id"
     * to the given <code>String</code>.
     *
     * @param contentId a <code>String</code> giving the value of the MIME
     *        header "Content-Id"
     *
     * @exception IllegalArgumentException if there is a problem in
     * setting the content id
     * @see #getContentId
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public String getContentLocation() {

    /**
     * Retrieves the value of the MIME header whose name is "Content-Location".
     *
     * @return a <code>String</code> giving the value of the MIME header whose
     *          name is "Content-Location"
     * @see #setContentLocation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public String getContentId() {

    /**
     * Retrieves the value of the MIME header whose name is "Content-Id".
     *
     * @return a <code>String</code> giving the value of the MIME header
     *         named "Content-Id"
     * @see #setContentId
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
    public abstract SOAPEnvelope getEnvelope() throws SOAPException;

    /**
     * Gets the <code>SOAPEnvelope</code> object associated with this
     * <code>SOAPPart</code> object. Once the SOAP envelope is obtained, it
     * can be used to get its contents.
     *
     * @return the <code>SOAPEnvelope</code> object for this
     *           <code>SOAPPart</code> object
     * @exception SOAPException if there is a SOAP error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPPart.java
public abstract class SOAPPart implements org.w3c.dom.Document, Node {

/**
 * The container for the SOAP-specific portion of a <code>SOAPMessage</code>
 * object. All messages are required to have a SOAP part, so when a
 * <code>SOAPMessage</code> object is created, it will automatically
 * have a <code>SOAPPart</code> object.
 *<P>
 * A <code>SOAPPart</code> object is a MIME part and has the MIME headers
 * Content-Id, Content-Location, and Content-Type.  Because the value of
 * Content-Type must be "text/xml", a <code>SOAPPart</code> object automatically
 * has a MIME header of Content-Type with its value set to "text/xml".
 * The value must be "text/xml" because content in the SOAP part of a
 * message must be in XML format.  Content that is not of type "text/xml"
 * must be in an <code>AttachmentPart</code> object rather than in the
 * <code>SOAPPart</code> object.
 * <P>
 * When a message is sent, its SOAP part must have the MIME header Content-Type
 * set to "text/xml". Or, from the other perspective, the SOAP part of any
 * message that is received must have the MIME header Content-Type with a
 * value of "text/xml".
 * <P>
 * A client can access the <code>SOAPPart</code> object of a
 * <code>SOAPMessage</code> object by
 * calling the method <code>SOAPMessage.getSOAPPart</code>. The
 * following  line of code, in which <code>message</code> is a
 * <code>SOAPMessage</code> object, retrieves the SOAP part of a message.
 * <PRE>
 *   SOAPPart soapPart = message.getSOAPPart();
 * </PRE>
 * <P>
 * A <code>SOAPPart</code> object contains a <code>SOAPEnvelope</code> object,
 * which in turn contains a <code>SOAPBody</code> object and a
 * <code>SOAPHeader</code> object.
 * The <code>SOAPPart</code> method <code>getEnvelope</code> can be used
 * to retrieve the <code>SOAPEnvelope</code> object.
 * <P>
 */
