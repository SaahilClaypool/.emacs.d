_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/DomHandler.java
    Source marshal( ElementT n, ValidationEventHandler errorHandler );

    /**
     * This method is called when a JAXB provider needs to marshal an element
     * to XML.
     *
     * <p>
     * If non-null, the returned {@link Source} must contain a whole document
     * rooted at one element, which will then be weaved into a bigger document
     * that the JAXB provider is marshalling.
     *
     * @param errorHandler
     *      Receives any errors happened during the process of converting
     *      an element into a {@link Source}.
     *
     *      The caller must provide a non-null error handler.
     *
     * @return
     *      null if there was an error. The error should have been reported
     *      to the handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/DomHandler.java
    ElementT getElement(ResultT rt);

    /**
     * Once the portion is sent to the {@link Result}. This method is called
     * by a JAXB provider to obtain the unmarshalled element representation.
     *
     * <p>
     * Multiple invocations of this method may return different objects.
     * This method can be invoked only when the whole sub-tree are fed
     * to the {@link Result} object.
     *
     * @param rt
     *      The {@link Result} object created by {@link #createUnmarshaller(ValidationEventHandler)}.
     *
     * @return
     *      null if the operation fails. The error must have been reported
     *      to the error handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/DomHandler.java
public interface DomHandler<ElementT,ResultT extends Result> {

/**
 * Converts an element (and its descendants)
 * from/to DOM (or similar) representation.
 *
 * <p>
 * Implementations of this interface will be used in conjunction with
 * {@link XmlAnyElement} annotation to map an element of XML into a representation
 * of infoset such as W3C DOM.
 *
 * <p>
 * Implementations hide how a portion of XML is converted into/from such
 * DOM-like representation, allowing JAXB providers to work with arbitrary
 * such library.
 *
 * <P>
 * This interface is intended to be implemented by library writers
 * and consumed by JAXB providers. None of those methods are intended to
 * be called from applications.
 *
 * @author Kohsuke Kawaguchi
 * @since JAXB2.0
 */
