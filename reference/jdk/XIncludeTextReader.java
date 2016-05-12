_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    protected void setBufferSize(int bufferSize) {

    /**
     * Sets the buffer size property for the reader which decides the chunk sizes that are parsed
     * by the reader at a time and passed to the handler
     *
     * @param bufferSize The size of the buffer desired
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    protected boolean isValid(int ch) {

    /**
     * Returns true if the specified character is a valid XML character
     * as per the rules of XML 1.0.
     *
     * @param ch The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    public void close() throws IOException {

    /**
     * Closes the stream.  Call this after parse(), or when there is no longer any need
     * for this object.
     *
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    public void setInputSource(XMLInputSource source) {

    /**
     * Sets the input source on this text reader.
     *
     * @param source The XMLInputSource to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    public void parse() throws IOException {

    /**
     * Read the input stream as text, and pass the text on to the XIncludeHandler
     * using calls to characters().  This will read all of the text it can from the
     * resource.
     *
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    protected String getEncodingName(byte[] b4) {

    /**
     * REVISIT: This code is taken from com.sun.org.apache.xerces.internal.impl.XMLEntityManager.
     *          Is there any way we can share the code, without having it implemented twice?
     *          I think we should make it public and static in XMLEntityManager. --PJM
     *
     * Returns the IANA encoding name that is auto-detected from
     * the bytes specified, with the endian-ness of that encoding where appropriate.
     *
     * @param b4    The first four bytes of the input.
     * @return the encoding name, or null if no encoding could be detected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    protected String consumeBOM(InputStream stream, String encoding)

    /**
     * Removes the byte order mark from the stream, if
     * it exists and returns the encoding name.
     *
     * @param stream
     * @param encoding
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    protected String getEncodingName(InputStream stream) throws IOException {

    /**
     * XMLEntityManager cares about endian-ness, since it creates its own optimized
     * readers. Since we're just using generic Java readers for now, we're not caring
     * about endian-ness.  If this changes, even more code needs to be copied from
     * XMLEntity manager. -- PJM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
                if (contentType.equals("text/xml")) {

                /**  The encoding of such a resource is determined by:
                    1 external encoding information, if available, otherwise
                         -- the most common type of external information is the "charset" parameter of a MIME package
                    2 if the media type of the resource is text/xml, application/xml, or matches the conventions text/*+xml or application/*+xml as described in XML Media Types [IETF RFC 3023], the encoding is recognized as specified in XML 1.0, otherwise
                    3 the value of the encoding attribute if one exists, otherwise
                    4 UTF-8.
                 **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    protected Reader getReader(XMLInputSource source) throws IOException {

    /**
     * Return the Reader for given XMLInputSource.
     *
     * @param source The XMLInputSource to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    public void setErrorReporter(XMLErrorReporter errorReporter) {

    /**
     * Sets the XMLErrorReporter used for reporting errors while
     * reading the text include.
     *
     * @param errorReporter the XMLErrorReporter to be used for
     * reporting errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    public XIncludeTextReader(XMLInputSource source, XIncludeHandler handler, int bufferSize)

    /**
     * Construct the XIncludeReader using the XMLInputSource and XIncludeHandler.
     *
     * @param source The XMLInputSource to use.
     * @param handler The XIncludeHandler to use.
     * @param bufferSize The size of this text reader's buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
public class XIncludeTextReader {

/**
 * This class is used for reading resources requested in &lt;include&gt; elements,
 * when the parse attribute of the &lt;include&gt; element is "text".  Using this
 * class will open the location, detect the encoding, and discard the byte order
 * mark, if applicable.
 *
 * REVISIT:
 * Much of the code in this class is taken from XMLEntityManager.  It would be nice
 * if this code could be shared in some way.  However, since XMLEntityManager is used
 * for reading files as XML, and this needs to read files as text, there would need
 * to be some refactoring done.
 *
 * @author Michael Glavassevich, IBM
 * @author Peter McCracken, IBM
 * @author Ankit Pasricha, IBM
 * @author Arun Yadav, Sun Microsystems Inc.
 *
 *
 * @see XIncludeHandler
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    protected void setBufferSize(int bufferSize) {

    /**
     * Sets the buffer size property for the reader which decides the chunk sizes that are parsed
     * by the reader at a time and passed to the handler
     *
     * @param bufferSize The size of the buffer desired
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    protected boolean isValid(int ch) {

    /**
     * Returns true if the specified character is a valid XML character
     * as per the rules of XML 1.0.
     *
     * @param ch The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    public void close() throws IOException {

    /**
     * Closes the stream.  Call this after parse(), or when there is no longer any need
     * for this object.
     *
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    public void setInputSource(XMLInputSource source) {

    /**
     * Sets the input source on this text reader.
     *
     * @param source The XMLInputSource to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    public void parse() throws IOException {

    /**
     * Read the input stream as text, and pass the text on to the XIncludeHandler
     * using calls to characters().  This will read all of the text it can from the
     * resource.
     *
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    protected String getEncodingName(byte[] b4) {

    /**
     * REVISIT: This code is taken from com.sun.org.apache.xerces.internal.impl.XMLEntityManager.
     *          Is there any way we can share the code, without having it implemented twice?
     *          I think we should make it public and static in XMLEntityManager. --PJM
     *
     * Returns the IANA encoding name that is auto-detected from
     * the bytes specified, with the endian-ness of that encoding where appropriate.
     *
     * @param b4    The first four bytes of the input.
     * @return the encoding name, or null if no encoding could be detected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    protected String consumeBOM(InputStream stream, String encoding)

    /**
     * Removes the byte order mark from the stream, if
     * it exists and returns the encoding name.
     *
     * @param stream
     * @param encoding
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    protected String getEncodingName(InputStream stream) throws IOException {

    /**
     * XMLEntityManager cares about endian-ness, since it creates its own optimized
     * readers. Since we're just using generic Java readers for now, we're not caring
     * about endian-ness.  If this changes, even more code needs to be copied from
     * XMLEntity manager. -- PJM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
                if (contentType.equals("text/xml")) {

                /**  The encoding of such a resource is determined by:
                    1 external encoding information, if available, otherwise
                         -- the most common type of external information is the "charset" parameter of a MIME package
                    2 if the media type of the resource is text/xml, application/xml, or matches the conventions text/*+xml or application/*+xml as described in XML Media Types [IETF RFC 3023], the encoding is recognized as specified in XML 1.0, otherwise
                    3 the value of the encoding attribute if one exists, otherwise
                    4 UTF-8.
                 **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    protected Reader getReader(XMLInputSource source) throws IOException {

    /**
     * Return the Reader for given XMLInputSource.
     *
     * @param source The XMLInputSource to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    public void setErrorReporter(XMLErrorReporter errorReporter) {

    /**
     * Sets the XMLErrorReporter used for reporting errors while
     * reading the text include.
     *
     * @param errorReporter the XMLErrorReporter to be used for
     * reporting errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
    public XIncludeTextReader(XMLInputSource source, XIncludeHandler handler, int bufferSize)

    /**
     * Construct the XIncludeReader using the XMLInputSource and XIncludeHandler.
     *
     * @param source The XMLInputSource to use.
     * @param handler The XIncludeHandler to use.
     * @param bufferSize The size of this text reader's buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeTextReader.java
public class XIncludeTextReader {

/**
 * This class is used for reading resources requested in &lt;include&gt; elements,
 * when the parse attribute of the &lt;include&gt; element is "text".  Using this
 * class will open the location, detect the encoding, and discard the byte order
 * mark, if applicable.
 *
 * REVISIT:
 * Much of the code in this class is taken from XMLEntityManager.  It would be nice
 * if this code could be shared in some way.  However, since XMLEntityManager is used
 * for reading files as XML, and this needs to read files as text, there would need
 * to be some refactoring done.
 *
 * @author Michael Glavassevich, IBM
 * @author Peter McCracken, IBM
 * @author Ankit Pasricha, IBM
 * @author Arun Yadav, Sun Microsystems Inc.
 *
 *
 * @see XIncludeHandler
 */
