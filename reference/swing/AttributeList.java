_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/AttributeList.java
    static Hashtable<Object, Object> attributeTypes = new Hashtable<Object, Object>();

    /**
     * Create a hashtable of attribute types.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/AttributeList.java
    public String toString() {

    /**
     * @return string representation
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/AttributeList.java
    public AttributeList getNext() {

    /**
     * @return the next attribute in the list
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/AttributeList.java
    public String getValue() {

    /**
     * @return default attribute value
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/AttributeList.java
    public Enumeration<?> getValues() {

    /**
     * @return possible attribute values
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/AttributeList.java
    public int getModifier() {

    /**
     * @return attribute modifier
     * @see DTDConstants
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/AttributeList.java
    public int getType() {

    /**
     * @return attribute type
     * @see DTDConstants
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/AttributeList.java
    public String getName() {

    /**
     * @return attribute name
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/AttributeList.java
    public AttributeList(String name, int type, int modifier, String value, Vector<?> values, AttributeList next) {

    /**
     * Create an attribute list element.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/AttributeList.java
    public AttributeList(String name) {

    /**
     * Create an attribute list element.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/AttributeList.java
public final

/**
 * This class defines the attributes of an SGML element
 * as described in a DTD using the ATTLIST construct.
 * An AttributeList can be obtained from the Element
 * class using the getAttributes() method.
 * <p>
 * It is actually an element in a linked list. Use the
 * getNext() method repeatedly to enumerate all the attributes
 * of an element.
 *
 * @see         Element
 * @author      Arthur Van Hoff
 *
 */
