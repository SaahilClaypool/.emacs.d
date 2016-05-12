_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/W3CDomHandler.java
    public W3CDomHandler(DocumentBuilder builder) {

    /**
     * Constructor that allows applications to specify which DOM implementation
     * to be used.
     *
     * @param builder
     *      must not be null. JAXB uses this {@link DocumentBuilder} to create
     *      a new element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/W3CDomHandler.java
    public W3CDomHandler() {

    /**
     * Default constructor.
     *
     * It is up to a JAXB provider to decide which DOM implementation
     * to use or how that is configured.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/W3CDomHandler.java
public class W3CDomHandler implements DomHandler<Element,DOMResult> {

/**
 * {@link DomHandler} implementation for W3C DOM (<code>org.w3c.dom</code> package.)
 *
 * @author Kohsuke Kawaguchi
 * @since JAXB2.0
 */
