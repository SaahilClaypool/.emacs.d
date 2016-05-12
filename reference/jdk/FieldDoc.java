_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/FieldDoc.java
    String constantValueExpression();

    /**
     * Get the value of a constant field.
     *
     * @return the text of a Java language expression whose value
     * is the value of the constant. The expression uses no identifiers
     * other than primitive literals. If the field is
     * not constant, returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/FieldDoc.java
    Object constantValue();

    /**
     * Get the value of a constant field.
     *
     * @return the value of a constant field. The value is
     * automatically wrapped in an object if it has a primitive type.
     * If the field is not constant, returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/FieldDoc.java
    SerialFieldTag[] serialFieldTags();

    /**
     * Return the serialField tags in this FieldDoc item.
     *
     * @return an array of <tt>SerialFieldTag</tt> objects containing
     *         all <code>@serialField</code> tags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/FieldDoc.java
    boolean isVolatile();

    /**
     * Return true if this field is volatile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/FieldDoc.java
    boolean isTransient();

    /**
     * Return true if this field is transient
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/FieldDoc.java
    Type type();

    /**
     * Get type of this field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/FieldDoc.java
public interface FieldDoc extends MemberDoc {

/**
 * Represents a field in a java class.
 *
 * @see MemberDoc
 *
 * @since 1.2
 * @author Robert Field
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/FieldDoc.java
    String constantValueExpression();

    /**
     * Get the value of a constant field.
     *
     * @return the text of a Java language expression whose value
     * is the value of the constant. The expression uses no identifiers
     * other than primitive literals. If the field is
     * not constant, returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/FieldDoc.java
    Object constantValue();

    /**
     * Get the value of a constant field.
     *
     * @return the value of a constant field. The value is
     * automatically wrapped in an object if it has a primitive type.
     * If the field is not constant, returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/FieldDoc.java
    SerialFieldTag[] serialFieldTags();

    /**
     * Return the serialField tags in this FieldDoc item.
     *
     * @return an array of <tt>SerialFieldTag</tt> objects containing
     *         all <code>@serialField</code> tags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/FieldDoc.java
    boolean isVolatile();

    /**
     * Return true if this field is volatile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/FieldDoc.java
    boolean isTransient();

    /**
     * Return true if this field is transient
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/FieldDoc.java
    Type type();

    /**
     * Get type of this field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/FieldDoc.java
public interface FieldDoc extends MemberDoc {

/**
 * Represents a field in a java class.
 *
 * @see MemberDoc
 *
 * @since 1.2
 * @author Robert Field
 */
