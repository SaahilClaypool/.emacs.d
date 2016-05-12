_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public String stringValue() {

    /**
     * Return a string representation of the value. If there is an actual
     * value, use toString; otherwise, use the normalized value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public void reset() {

    /**
     * reset the state of this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public ShortList itemValueTypes;

    /**
     * In the case the value is a list or a list of unions, this value
     * indicates the type(s) of the items in the list.
     * For a normal list, the length of the array is 1; for list of unions,
     * the length of the array is the same as the length of the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public XSSimpleType[] memberTypes;

    /**
     * If
     * 1. the type is a union type where one of the member types is a list, or
     *    if the type is a list; and
     * 2. the item type of the list is a union type
     * then an array of member types used to validate the values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public XSSimpleType memberType;

    /**
     * If the type is a union type, then the member type which
     * actually validated the string value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public short actualValueType;

    /**
     * The type of the actual value. It's one of the _DT constants
     * defined in XSConstants.java. The value is used to indicate
     * the most specific built-in type.
     * (i.e. short instead of decimal or integer).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public Object actualValue;

    /**
     * The actual value from a string value (QName, Boolean, etc.)
     * An array of Objects if the type is a list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public String normalizedValue;

    /**
     * The normalized value of a string value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
public class ValidatedInfo {

/**
 * Class to get the information back after content is validated. This info
 * would be filled by validate().
 *
 * @xerces.internal
 *
 * @author Neeraj Bajaj, Sun Microsystems, inc.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public String stringValue() {

    /**
     * Return a string representation of the value. If there is an actual
     * value, use toString; otherwise, use the normalized value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public void reset() {

    /**
     * reset the state of this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public ShortList itemValueTypes;

    /**
     * In the case the value is a list or a list of unions, this value
     * indicates the type(s) of the items in the list.
     * For a normal list, the length of the array is 1; for list of unions,
     * the length of the array is the same as the length of the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public XSSimpleType[] memberTypes;

    /**
     * If
     * 1. the type is a union type where one of the member types is a list, or
     *    if the type is a list; and
     * 2. the item type of the list is a union type
     * then an array of member types used to validate the values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public XSSimpleType memberType;

    /**
     * If the type is a union type, then the member type which
     * actually validated the string value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public short actualValueType;

    /**
     * The type of the actual value. It's one of the _DT constants
     * defined in XSConstants.java. The value is used to indicate
     * the most specific built-in type.
     * (i.e. short instead of decimal or integer).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public Object actualValue;

    /**
     * The actual value from a string value (QName, Boolean, etc.)
     * An array of Objects if the type is a list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
    public String normalizedValue;

    /**
     * The normalized value of a string value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/ValidatedInfo.java
public class ValidatedInfo {

/**
 * Class to get the information back after content is validated. This info
 * would be filled by validate().
 *
 * @xerces.internal
 *
 * @author Neeraj Bajaj, Sun Microsystems, inc.
 *
 */
