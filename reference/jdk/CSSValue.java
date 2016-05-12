_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSValue.java
    public short getCssValueType();

    /**
     *  A code defining the type of the value as defined above.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSValue.java
    public String getCssText();

    /**
     *  A string representation of the current value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSValue.java
    public static final short CSS_VALUE_LIST            = 2;

    /**
     * The value is a <code>CSSValue</code> list and an instance of the
     * <code>CSSValueList</code> interface can be obtained by using
     * binding-specific casting methods on this instance of the
     * <code>CSSValue</code> interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSValue.java
    public static final short CSS_INHERIT               = 0;

    /**
     * The value is inherited and the <code>cssText</code> contains "inherit".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSValue.java
public interface CSSValue {

/**
 *  The <code>CSSValue</code> interface represents a simple or a complex
 * value. A <code>CSSValue</code> object only occurs in a context of a CSS
 * property.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document Object Model (DOM) Level 2 Style Specification</a>.
 * @since DOM Level 2
 */
