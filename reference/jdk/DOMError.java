_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMError.java
    public DOMLocator getLocation();

    /**
     * The location of the error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMError.java
    public Object getRelatedData();

    /**
     *  The related <code>DOMError.type</code> dependent data if any.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMError.java
    public Object getRelatedException();

    /**
     * The related platform dependent exception if any.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMError.java
    public String getType();

    /**
     *  A <code>DOMString</code> indicating which related data is expected in
     * <code>relatedData</code>. Users should refer to the specification of
     * the error in order to find its <code>DOMString</code> type and
     * <code>relatedData</code> definitions if any.
     * <p ><b>Note:</b>  As an example,
     * <code>Document.normalizeDocument()</code> does generate warnings when
     * the "split-cdata-sections" parameter is in use. Therefore, the method
     * generates a <code>SEVERITY_WARNING</code> with <code>type</code>
     * <code>"cdata-sections-splitted"</code> and the first
     * <code>CDATASection</code> node in document order resulting from the
     * split is returned by the <code>relatedData</code> attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMError.java
    public String getMessage();

    /**
     * An implementation specific string describing the error that occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMError.java
    public short getSeverity();

    /**
     * The severity of the error, either <code>SEVERITY_WARNING</code>,
     * <code>SEVERITY_ERROR</code>, or <code>SEVERITY_FATAL_ERROR</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMError.java
    public static final short SEVERITY_FATAL_ERROR      = 3;

    /**
     * The severity of the error described by the <code>DOMError</code> is
     * fatal error. A <code>SEVERITY_FATAL_ERROR</code> will cause the
     * normal processing to stop. The return value of
     * <code>DOMErrorHandler.handleError()</code> is ignored unless the
     * implementation chooses to continue, in which case the behavior
     * becomes undefined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMError.java
    public static final short SEVERITY_WARNING          = 1;

    /**
     * The severity of the error described by the <code>DOMError</code> is
     * warning. A <code>SEVERITY_WARNING</code> will not cause the
     * processing to stop, unless <code>DOMErrorHandler.handleError()</code>
     * returns <code>false</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMError.java
public interface DOMError {

/**
 * <code>DOMError</code> is an interface that describes an error.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document Object Model (DOM) Level 3 Core Specification</a>.
 * @since DOM Level 3
 */
