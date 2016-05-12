_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/TextSyntax.java
    public String toString(){

    /**
     * Returns a String identifying this text attribute. The String is
     * the attribute's underlying text string.
     *
     * @return  A String identifying this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/TextSyntax.java
    public boolean equals(Object object) {

    /**
     * Returns whether this text attribute is equivalent to the passed in
     * object. To be equivalent, all of the following conditions must be true:
     * <OL TYPE=1>
     * <LI>
     * <CODE>object</CODE> is not null.
     * <LI>
     * <CODE>object</CODE> is an instance of class TextSyntax.
     * <LI>
     * This text attribute's underlying string and <CODE>object</CODE>'s
     * underlying string are equal.
     * <LI>
     * This text attribute's locale and <CODE>object</CODE>'s locale are
     * equal.
     * </OL>
     *
     * @param  object  Object to compare to.
     *
     * @return  True if <CODE>object</CODE> is equivalent to this text
     *          attribute, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/TextSyntax.java
    public int hashCode() {

    /**
     * Returns a hashcode for this text attribute.
     *
     * @return  A hashcode value for this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/TextSyntax.java
    public Locale getLocale() {

    /**
     * Returns this text attribute's text string's natural language (locale).
     * @return the locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/TextSyntax.java
    public String getValue() {

    /**
     * Returns this text attribute's text string.
     * @return the text string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/TextSyntax.java
    protected TextSyntax(String value, Locale locale) {

    /**
     * Constructs a TextAttribute with the specified string and locale.
     *
     * @param  value   Text string.
     * @param  locale  Natural language of the text string. null
     * is interpreted to mean the default locale for as returned
     * by <code>Locale.getDefault()</code>
     *
     * @exception  NullPointerException
     *     (unchecked exception) Thrown if <CODE>value</CODE> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/TextSyntax.java
    private Locale locale;

    /**
     * Locale of this text attribute.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/TextSyntax.java
    private String value;

    /**
     * String value of this text attribute.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/TextSyntax.java
public abstract class TextSyntax implements Serializable, Cloneable {

/**
 * Class TextSyntax is an abstract base class providing the common
 * implementation of all attributes whose value is a string. The text attribute
 * includes a locale to indicate the natural language. Thus, a text attribute
 * always represents a localized string. Once constructed, a text attribute's
 * value is immutable.
 * <P>
 *
 * @author  David Mendenhall
 * @author  Alan Kaminsky
 */
