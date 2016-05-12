_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBIntrospector.java
    public static Object getValue(Object jaxbElement) {

    /**
     * <p>Get the element value of a JAXB element.</p>
     *
     * <p>Convenience method to abstract whether working with either
     *    a javax.xml.bind.JAXBElement instance or an instance of
     *    <tt>&#64XmlRootElement</tt> annotated Java class.</p>
     *
     * @param jaxbElement  object that #isElement(Object) returns true.
     *
     * @return The element value of the <code>jaxbElement</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBIntrospector.java
    public abstract QName getElementName(Object jaxbElement);

    /**
     * <p>Get xml element qname for <code>jaxbElement</code>.</p>
     *
     * @param jaxbElement is an object that {@link #isElement(Object)} returned true.
     *
     * @return xml element qname associated with jaxbElement;
     *         null if <code>jaxbElement</code> is not a JAXB Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBIntrospector.java
    public abstract boolean isElement(Object object);

    /**
     * <p>Return true if <code>object</code> represents a JAXB element.</p>
     * <p>Parameter <code>object</code> is a JAXB element for following cases:
     * <ol>
     *   <li>It is an instance of <code>javax.xml.bind.JAXBElement</code>.</li>
     *   <li>The class of <code>object</code> is annotated with
     *       <code>&#64XmlRootElement</code>.
     *   </li>
     * </ol>
     *
     * @see #getElementName(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBIntrospector.java
public abstract class JAXBIntrospector {

/**
 * Provide access to JAXB xml binding data for a JAXB object.
 *
 * <p>
 * Intially, the intent of this class is to just conceptualize how
 * a JAXB application developer can access xml binding information,
 * independent if binding model is java to schema or schema to java.
 * Since accessing the XML element name related to a JAXB element is
 * a highly requested feature, demonstrate access to this
 * binding information.
 *
 * The factory method to get a <code>JAXBIntrospector</code> instance is
 * {@link JAXBContext#createJAXBIntrospector()}.
 *
 * @see JAXBContext#createJAXBIntrospector()
 * @since JAXB2.0
 */
