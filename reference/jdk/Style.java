_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Style.java
    public void removeChangeListener(ChangeListener l);

    /**
     * Removes a listener that was tracking attribute changes.
     *
     * @param l the change listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Style.java
    public void addChangeListener(ChangeListener l);

    /**
     * Adds a listener to track whenever an attribute
     * has been changed.
     *
     * @param l the change listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Style.java
    public String getName();

    /**
     * Fetches the name of the style.   A style is not required to be named,
     * so <code>null</code> is returned if there is no name
     * associated with the style.
     *
     * @return the name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Style.java
public interface Style extends MutableAttributeSet {

/**
 * A collection of attributes to associate with an element in a document.
 * Since these are typically used to associate character and paragraph
 * styles with the element, operations for this are provided.  Other
 * customized attributes that get associated with the element will
 * effectively be name-value pairs that live in a hierarchy and if a name
 * (key) is not found locally, the request is forwarded to the parent.
 * Commonly used attributes are separated out to facilitate alternative
 * implementations that are more efficient.
 *
 * @author  Timothy Prinzing
 */
