_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    static class EmptyAttributeSet implements AttributeSet, Serializable {

    /**
     * An AttributeSet that is always empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public String toString() {

    /**
     * Converts the attribute set to a String.
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public boolean equals(Object obj) {

    /**
     * Compares this object to the specified object.
     * The result is <code>true</code> if the object is an equivalent
     * set of attributes.
     * @param     obj   the object to compare this attribute set with
     * @return    <code>true</code> if the objects are equal;
     *            <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public int hashCode() {

    /**
     * Returns a hashcode for this set of attributes.
     * @return     a hashcode value for this set of attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public Object clone() {

    /**
     * Clones a set of attributes.
     *
     * @return the new set of attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public void setResolveParent(AttributeSet parent) {

    /**
     * Sets the resolving parent.
     *
     * @param parent the parent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public AttributeSet getResolveParent() {

    /**
     * Gets the resolving parent.  This is the set
     * of attributes to resolve through if an attribute
     * isn't defined locally.  This is null if there
     * are no other sets of attributes to resolve
     * through.
     *
     * @return the parent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public void removeAttributes(AttributeSet attributes) {

    /**
     * Removes a set of attributes from the list.
     *
     * @param attributes the set of attributes to remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public void removeAttributes(Enumeration<?> names) {

    /**
     * Removes a set of attributes from the list.
     *
     * @param names the set of names to remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public void removeAttribute(Object name) {

    /**
     * Removes an attribute from the list.
     *
     * @param name the attribute name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public void addAttributes(AttributeSet attributes) {

    /**
     * Adds a set of attributes to the list.
     *
     * @param attributes the set of attributes to add
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public void addAttribute(Object name, Object value) {

    /**
     * Adds an attribute to the list.
     *
     * @param name the attribute name
     * @param value the attribute value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public boolean containsAttributes(AttributeSet attributes) {

    /**
     * Checks whether the attribute list contains all the
     * specified name/value pairs.
     *
     * @param attributes the attribute list
     * @return true if the list contains all the name/value pairs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public boolean containsAttribute(Object name, Object value) {

    /**
     * Checks whether the attribute list contains a
     * specified attribute name/value pair.
     *
     * @param name the name
     * @param value the value
     * @return true if the name/value pair is in the list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public Object getAttribute(Object name) {

    /**
     * Gets the value of an attribute.
     *
     * @param name the attribute name
     * @return the value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public Enumeration<?> getAttributeNames() {

    /**
     * Gets the names of the attributes in the set.
     *
     * @return the names as an <code>Enumeration</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public AttributeSet copyAttributes() {

    /**
     * Makes a copy of the attributes.
     *
     * @return the copy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public boolean isEqual(AttributeSet attr) {

    /**
     * Compares two attribute sets.
     *
     * @param attr the second attribute set
     * @return true if the sets are equal, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public boolean isDefined(Object attrName) {

    /**
     * Tells whether a given attribute is defined.
     *
     * @param attrName the attribute name
     * @return true if the attribute is defined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public int getAttributeCount() {

    /**
     * Gets a count of the number of attributes.
     *
     * @return the count
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public boolean isEmpty()

    /**
     * Checks whether the set of attributes is empty.
     *
     * @return true if the set is empty else false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public SimpleAttributeSet(AttributeSet source) {

    /**
     * Creates a new attribute set based on a supplied set of attributes.
     *
     * @param source the set of attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public SimpleAttributeSet() {

    /**
     * Creates a new attribute set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
    public static final AttributeSet EMPTY = new EmptyAttributeSet();

    /**
     * An empty attribute set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/SimpleAttributeSet.java
public class SimpleAttributeSet implements MutableAttributeSet, Serializable, Cloneable

/**
 * A straightforward implementation of MutableAttributeSet using a
 * hash table.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author Tim Prinzing
 */
