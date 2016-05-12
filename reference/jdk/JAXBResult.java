_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/util/JAXBResult.java
    private static Unmarshaller assertionFailed() throws JAXBException {

    /**
     * Hook to throw exception from the middle of a contructor chained call
     * to this
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/util/JAXBResult.java
    public Object getResult() throws JAXBException {

    /**
     * Gets the unmarshalled object created by the transformation.
     *
     * @return
     *      Always return a non-null object.
     *
     * @exception IllegalStateException
     *  if this method is called before an object is unmarshalled.
     *
     * @exception JAXBException
     *      if there is any unmarshalling error.
     *      Note that the implementation is allowed to throw SAXException
     *      during the parsing when it finds an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/util/JAXBResult.java
    private final UnmarshallerHandler unmarshallerHandler;

    /**
     * Unmarshaller that will be used to unmarshal
     * the input documents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/util/JAXBResult.java
    public JAXBResult( Unmarshaller _unmarshaller ) throws JAXBException {

    /**
     * Creates a new instance that uses the specified
     * Unmarshaller to unmarshal an object.
     *
     * <p>
     * This JAXBResult object will use the specified Unmarshaller
     * instance. It is the caller's responsibility not to use the
     * same Unmarshaller for other purposes while it is being
     * used by this object.
     *
     * <p>
     * The primary purpose of this method is to allow the client
     * to configure Unmarshaller. Unless you know what you are doing,
     * it's easier and safer to pass a JAXBContext.
     *
     * @param _unmarshaller the unmarshaller.  This parameter must not be null.
     * @throws JAXBException if an error is encountered while creating the
     * JAXBResult or the Unmarshaller parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/util/JAXBResult.java
    public JAXBResult( JAXBContext context ) throws JAXBException {

    /**
     * Creates a new instance that uses the specified
     * JAXBContext to unmarshal.
     *
     * @param context The JAXBContext that will be used to create the
     * necessary Unmarshaller.  This parameter must not be null.
     * @exception JAXBException if an error is encountered while creating the
     * JAXBResult or if the context parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/util/JAXBResult.java
public class JAXBResult extends SAXResult {

/**
 * JAXP {@link javax.xml.transform.Result} implementation
 * that unmarshals a JAXB object.
 *
 * <p>
 * This utility class is useful to combine JAXB with
 * other Java/XML technologies.
 *
 * <p>
 * The following example shows how to use JAXB to unmarshal a document
 * resulting from an XSLT transformation.
 *
 * <blockquote>
 *    <pre>
 *       JAXBResult result = new JAXBResult(
 *         JAXBContext.newInstance("org.acme.foo") );
 *
 *       // set up XSLT transformation
 *       TransformerFactory tf = TransformerFactory.newInstance();
 *       Transformer t = tf.newTransformer(new StreamSource("test.xsl"));
 *
 *       // run transformation
 *       t.transform(new StreamSource("document.xml"),result);
 *
 *       // obtain the unmarshalled content tree
 *       Object o = result.getResult();
 *    </pre>
 * </blockquote>
 *
 * <p>
 * The fact that JAXBResult derives from SAXResult is an implementation
 * detail. Thus in general applications are strongly discouraged from
 * accessing methods defined on SAXResult.
 *
 * <p>
 * In particular it shall never attempt to call the setHandler,
 * setLexicalHandler, and setSystemId methods.
 *
 * @author
 *      Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
