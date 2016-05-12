_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/MutableAttributeSet.java
    public void setResolveParent(AttributeSet parent);

    /**
     * Sets the resolving parent.  This is the set
     * of attributes to resolve through if an attribute
     * isn't defined locally.
     *
     * @param parent the parent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/MutableAttributeSet.java
    public void removeAttributes(AttributeSet attributes);

    /**
     * Removes a set of attributes with the given <code>name</code>.
     *
     * @param attributes the set of attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/MutableAttributeSet.java
    public void removeAttributes(Enumeration<?> names);

    /**
     * Removes an attribute set with the given <code>names</code>.
     *
     * @param names the set of names
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/MutableAttributeSet.java
    public void removeAttribute(Object name);

    /**
     * Removes an attribute with the given <code>name</code>.
     *
     * @param name the attribute name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/MutableAttributeSet.java
    public void addAttributes(AttributeSet attributes);

    /**
     * Creates a new attribute set similar to this one except that it contains
     * the given attributes and values.
     *
     * @param attributes the set of attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/MutableAttributeSet.java
    public void addAttribute(Object name, Object value);

    /**
     * Creates a new attribute set similar to this one except that it contains
     * an attribute with the given name and value.  The object must be
     * immutable, or not mutated by any client.
     *
     * @param name the name
     * @param value the value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/MutableAttributeSet.java
public interface MutableAttributeSet extends AttributeSet {

/**
 * A generic interface for a mutable collection of unique attributes.
 *
 * Implementations will probably want to provide a constructor of the
 * form:<tt>
 * public XXXAttributeSet(ConstAttributeSet source);</tt>
 *
 */
