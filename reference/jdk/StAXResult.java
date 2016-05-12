_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stax/StAXResult.java
    public String getSystemId() {

    /**
     * <p>The returned system identifier is always <code>null</code>.</p>
     *
     * @return The returned system identifier is always <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stax/StAXResult.java
    public void setSystemId(final String systemId) {

    /**
     * <p>In the context of a <code>StAXResult</code>, it is not appropriate
     * to explicitly set the system identifier.
     * The <code>XMLEventWriter</code> or <code>XMLStreamWriter</code>
     * used to construct this <code>StAXResult</code> determines the
     * system identifier of the XML result.</p>
     *
     * <p>An {@link UnsupportedOperationException} is <strong>always</strong>
     * thrown by this method.</p>
     *
     * @param systemId Ignored.
     *
     * @throws UnsupportedOperationException Is <strong>always</strong>
     *   thrown by this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stax/StAXResult.java
    public XMLStreamWriter getXMLStreamWriter() {

    /**
     * <p>Get the <code>XMLStreamWriter</code> used by this
     * <code>StAXResult</code>.</p>
     *
     * <p><code>XMLStreamWriter</code> will be <code>null</code>
     * if this <code>StAXResult</code> was created with a
     * <code>XMLEventWriter</code>.</p>
     *
     * @return <code>XMLStreamWriter</code> used by this
     *   <code>StAXResult</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stax/StAXResult.java
    public XMLEventWriter getXMLEventWriter() {

    /**
     * <p>Get the <code>XMLEventWriter</code> used by this
     * <code>StAXResult</code>.</p>
     *
     * <p><code>XMLEventWriter</code> will be <code>null</code>
     * if this <code>StAXResult</code> was created with a
     * <code>XMLStreamWriter</code>.</p>
     *
     * @return <code>XMLEventWriter</code> used by this
     *   <code>StAXResult</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stax/StAXResult.java
    public StAXResult(final XMLStreamWriter xmlStreamWriter) {

    /**
     * <p>Creates a new instance of a <code>StAXResult</code>
     * by supplying an {@link XMLStreamWriter}.</p>
     *
     * <p><code>XMLStreamWriter</code> must be a
     * non-<code>null</code> reference.</p>
     *
     * @param xmlStreamWriter <code>XMLStreamWriter</code> used to create
     *   this <code>StAXResult</code>.
     *
     * @throws IllegalArgumentException If <code>xmlStreamWriter</code> ==
     *   <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stax/StAXResult.java
    public StAXResult(final XMLEventWriter xmlEventWriter) {

    /**
     * <p>Creates a new instance of a <code>StAXResult</code>
     * by supplying an {@link XMLEventWriter}.</p>
     *
     * <p><code>XMLEventWriter</code> must be a
     * non-<code>null</code> reference.</p>
     *
     * @param xmlEventWriter <code>XMLEventWriter</code> used to create
     *   this <code>StAXResult</code>.
     *
     * @throws IllegalArgumentException If <code>xmlEventWriter</code> ==
     *   <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stax/StAXResult.java
    private String systemId = null;

    /** <p>System identifier for this <code>StAXResult</code>.<p> */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stax/StAXResult.java
    private XMLStreamWriter xmlStreamWriter = null;

    /**
     * <p><code>XMLStreamWriter</code> to be used for
     * <code>Result</code> output.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stax/StAXResult.java
    private XMLEventWriter xmlEventWriter = null;

    /**
     * <p><code>XMLEventWriter</code> to be used for
     * <code>Result</code> output.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stax/StAXResult.java
public class StAXResult implements Result {

/**
 * <p>Acts as a holder for an XML {@link Result} in the
 * form of a StAX writer,i.e.
 * {@link XMLStreamWriter} or {@link XMLEventWriter}.
 * <code>StAXResult</code> can be used in all cases that accept
 * a <code>Result</code>, e.g. {@link javax.xml.transform.Transformer},
 * {@link javax.xml.validation.Validator} which accept
 * <code>Result</code> as input.
 *
 * @author <a href="mailto:Neeraj.Bajaj@Sun.com">Neeraj Bajaj</a>
 * @author <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a>
 *
 * @see <a href="http://jcp.org/en/jsr/detail?id=173">
 *  JSR 173: Streaming API for XML</a>
 * @see XMLStreamWriter
 * @see XMLEventWriter
 *
 * @since 1.6
 */
