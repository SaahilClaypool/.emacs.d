_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/Option.java
    public String getValue() {

    /**
     * Convenience method to return the string associated
     * with the <code>value</code> attribute.  If the
     * value has not been specified, the label will be
     * returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/Option.java
    public boolean isSelected() {

    /**
     * Fetches the selection state associated with this option.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/Option.java
    protected void setSelection(boolean state) {

    /**
     * Sets the selected state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/Option.java
    public String toString() {

    /**
     * String representation is the label.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/Option.java
    public AttributeSet getAttributes() {

    /**
     * Fetch the attributes associated with this option.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/Option.java
    public String getLabel() {

    /**
     * Fetch the label associated with the option.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/Option.java
    public void setLabel(String label) {

    /**
     * Sets the label to be used for the option.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/Option.java
    public Option(AttributeSet attr) {

    /**
     * Creates a new Option object.
     *
     * @param attr the attributes associated with the
     *  option element.  The attributes are copied to
     *  ensure they won't change.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/Option.java
public class Option implements Serializable {

/**
 * Value for the ListModel used to represent
 * &lt;option&gt; elements.  This is the object
 * installed as items of the DefaultComboBoxModel
 * used to represent the &lt;select&gt; element.
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
 * @author  Timothy Prinzing
 */
