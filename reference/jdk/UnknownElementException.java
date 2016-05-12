_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/UnknownElementException.java
    public Object getArgument() {

    /**
     * Returns the additional argument.
     *
     * @return the additional argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/UnknownElementException.java
    public Element getUnknownElement() {

    /**
     * Returns the unknown element.
     * The value may be unavailable if this exception has been
     * serialized and then read back in.
     *
     * @return the unknown element, or {@code null} if unavailable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/UnknownElementException.java
    public UnknownElementException(Element e, Object p) {

    /**
     * Creates a new {@code UnknownElementException}.  The {@code p}
     * parameter may be used to pass in an additional argument with
     * information about the context in which the unknown element was
     * encountered; for example, the visit methods of {@link
     * ElementVisitor} may pass in their additional parameter.
     *
     * @param e the unknown element, may be {@code null}
     * @param p an additional parameter, may be {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/UnknownElementException.java
public class UnknownElementException extends UnknownEntityException {

/**
 * Indicates that an unknown kind of element was encountered.  This
 * can occur if the language evolves and new kinds of elements are
 * added to the {@code Element} hierarchy.  May be thrown by an
 * {@linkplain ElementVisitor element visitor} to indicate that the
 * visitor was created for a prior version of the language.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see ElementVisitor#visitUnknown
 * @since 1.6
 */
