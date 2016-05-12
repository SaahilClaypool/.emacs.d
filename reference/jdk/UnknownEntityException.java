_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/UnknownEntityException.java
    protected UnknownEntityException(String message) {

    /**
     * Creates a new {@code UnknownEntityException} with the specified
     * detail message.
     *
     * @param message the detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/UnknownEntityException.java
public class UnknownEntityException extends RuntimeException {

/**
 * Superclass of exceptions which indicate that an unknown kind of
 * entity was encountered.  This situation can occur if the language
 * evolves and new kinds of constructs are introduced.  Subclasses of
 * this exception may be thrown by visitors to indicate that the
 * visitor was created for a prior version of the language.
 *
 * <p>A common superclass for those exceptions allows a single catch
 * block to have code handling them uniformly.
 *
 * @author Joseph D. Darcy
 * @see javax.lang.model.element.UnknownElementException
 * @see javax.lang.model.element.UnknownAnnotationValueException
 * @see javax.lang.model.type.UnknownTypeException
 * @since 1.7
 */
