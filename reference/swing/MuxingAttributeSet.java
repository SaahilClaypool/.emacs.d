_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
        private Enumeration currentEnum;

        /** Enumeration from attrs. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
        private int attrIndex;

        /** Index into attrs the current Enumeration came from. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    private class MuxingAttributeNameEnumeration implements Enumeration {

    /**
     * An Enumeration of the Attribute names in a MuxingAttributeSet.
     * This may return the same name more than once.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    private AttributeSet[] attrs;

    /**
     * The <code>AttributeSet</code>s that make up the resulting
     * <code>AttributeSet</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    public AttributeSet getResolveParent() {

    /**
     * Returns null, subclasses may wish to do something more
     * intelligent with this.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    public boolean containsAttributes(AttributeSet attrs) {

    /**
     * Checks whether the attribute set contains all of
     * the given attributes.
     *
     * @param attrs the attributes to check
     * @return true if the element contains all the attributes
     * @see AttributeSet#containsAttributes
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    public boolean containsAttribute(Object name, Object value) {

    /**
     * Checks whether a given attribute name/value is defined.
     *
     * @param name the attribute name
     * @param value the attribute value
     * @return true if the name/value is defined
     * @see AttributeSet#containsAttribute
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    public Enumeration getAttributeNames() {

    /**
     * Gets the names of all attributes.
     *
     * @return the attribute names
     * @see AttributeSet#getAttributeNames
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    public Object getAttribute(Object key) {

    /**
     * Gets the value of an attribute.  If the requested
     * attribute is a StyleConstants attribute that has
     * a CSS mapping, the request will be converted.
     *
     * @param key the attribute name
     * @return the attribute value
     * @see AttributeSet#getAttribute
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    public AttributeSet copyAttributes() {

    /**
     * Copies a set of attributes.
     *
     * @return the copy
     * @see AttributeSet#copyAttributes
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    public boolean isEqual(AttributeSet attr) {

    /**
     * Checks whether two attribute sets are equal.
     *
     * @param attr the attribute set to check against
     * @return true if the same
     * @see AttributeSet#isEqual
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    public boolean isDefined(Object key) {

    /**
     * Checks whether a given attribute is defined.
     * This will convert the key over to CSS if the
     * key is a StyleConstants key that has a CSS
     * mapping.
     *
     * @param key the attribute key
     * @return true if the attribute is defined
     * @see AttributeSet#isDefined
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    public int getAttributeCount() {

    /**
     * Gets the number of attributes that are defined.
     *
     * @return the number of attributes
     * @see AttributeSet#getAttributeCount
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    protected synchronized void removeAttributeSetAt(int index) {

    /**
     * Removes the AttributeSet at <code>index</code>. This assumes
     * the value of <code>index</code> is greater than or equal to 0,
     * and less than attrs.length.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    protected synchronized void insertAttributeSetAt(AttributeSet as,
                                                     int index) {

    /**
     * Inserts <code>as</code> at <code>index</code>. This assumes
     * the value of <code>index</code> is between 0 and attrs.length,
     * inclusive.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    protected synchronized AttributeSet[] getAttributes() {

    /**
     * Returns the <code>AttributeSet</code>s multiplexing too. When the
     * <code>AttributeSet</code>s need to be referenced, this should be called.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    protected synchronized void setAttributes(AttributeSet[] attrs) {

    /**
     * Directly sets the <code>AttributeSet</code>s that comprise this
     * <code>MuxingAttributeSet</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    protected MuxingAttributeSet() {

    /**
     * Creates an empty <code>MuxingAttributeSet</code>. This is intended for
     * use by subclasses only, and it is also intended that subclasses will
     * set the constituent <code>AttributeSet</code>s before invoking any
     * of the <code>AttributeSet</code> methods.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
    public MuxingAttributeSet(AttributeSet[] attrs) {

    /**
     * Creates a <code>MuxingAttributeSet</code> with the passed in
     * attributes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MuxingAttributeSet.java
class MuxingAttributeSet implements AttributeSet, Serializable {

/**
 * An implementation of <code>AttributeSet</code> that can multiplex
 * across a set of <code>AttributeSet</code>s.
 *
 */
