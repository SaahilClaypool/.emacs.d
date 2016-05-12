_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMException.java
    public static final short TYPE_MISMATCH_ERR         = 17;

    /**
     *  If the type of an object is incompatible with the expected type of the
     * parameter associated to the object.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMException.java
    public static final short INVALID_ACCESS_ERR        = 15;

    /**
     * If a parameter or an operation is not supported by the underlying
     * object.
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMException.java
    public static final short INVALID_MODIFICATION_ERR  = 13;

    /**
     * If an attempt is made to modify the type of the underlying object.
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMException.java
    public static final short INVALID_STATE_ERR         = 11;

    /**
     * If an attempt is made to use an object that is not, or is no longer,
     * usable.
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMException.java
    public static final short NOT_SUPPORTED_ERR         = 9;

    /**
     * If the implementation does not support the requested type of object or
     * operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMException.java
    public static final short NO_MODIFICATION_ALLOWED_ERR = 7;

    /**
     * If an attempt is made to modify an object where modifications are not
     * allowed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMException.java
    public static final short INVALID_CHARACTER_ERR     = 5;

    /**
     * If an invalid or illegal character is specified, such as in an XML name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMException.java
    public static final short HIERARCHY_REQUEST_ERR     = 3;

    /**
     * If any <code>Node</code> is inserted somewhere it doesn't belong.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMException.java
    public static final short INDEX_SIZE_ERR            = 1;

    /**
     * If index or size is negative, or greater than the allowed value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMException.java
public class DOMException extends RuntimeException {

/**
 * DOM operations only raise exceptions in "exceptional" circumstances, i.e.,
 * when an operation is impossible to perform (either for logical reasons,
 * because data is lost, or because the implementation has become unstable).
 * In general, DOM methods return specific error values in ordinary
 * processing situations, such as out-of-bound errors when using
 * <code>NodeList</code>.
 * <p>Implementations should raise other exceptions under other circumstances.
 * For example, implementations should raise an implementation-dependent
 * exception if a <code>null</code> argument is passed when <code>null</code>
 *  was not expected.
 * <p>Some languages and object systems do not support the concept of
 * exceptions. For such systems, error conditions may be indicated using
 * native error reporting mechanisms. For some bindings, for example,
 * methods may return error codes similar to those listed in the
 * corresponding method descriptions.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document Object Model (DOM) Level 3 Core Specification</a>.
 */
