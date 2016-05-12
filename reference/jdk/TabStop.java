_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabStop.java
    public int hashCode() {

    /**
     * Returns the hashCode for the object.  This must be defined
     * here to ensure 100% pure.
     *
     * @return the hashCode for the object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabStop.java
    public boolean equals(Object other)

    /**
     * Returns true if the tabs are equal.
     * @return true if the tabs are equal, otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabStop.java
    public int getLeader() {

    /**
     * Returns the leader of the tab.
     * @return the leader of the tab
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabStop.java
    public int getAlignment() {

    /**
     * Returns the alignment, as an integer, of the tab.
     * @return the alignment of the tab
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabStop.java
    public float getPosition() {

    /**
     * Returns the position, as a float, of the tab.
     * @return the position of the tab
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabStop.java
    public TabStop(float pos, int align, int leader) {

    /**
     * Creates a tab with the specified position <code>pos</code>,
     * alignment <code>align</code> and leader <code>leader</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabStop.java
    public TabStop(float pos) {

    /**
     * Creates a tab at position <code>pos</code> with a default alignment
     * and default leader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabStop.java
    private int alignment;

    /** Tab type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabStop.java
    public static final int ALIGN_CENTER  = 2;

    /** Characters following tab are positioned such that all following
     * characters up to next tab/newline are centered around the tabs
     * location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabStop.java
    public static final int ALIGN_LEFT    = 0;

    /** Character following tab is positioned at location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabStop.java
public class TabStop implements Serializable {

/**
 * This class encapsulates a single tab stop (basically as tab stops
 * are thought of by RTF). A tab stop is at a specified distance from the
 * left margin, aligns text in a specified way, and has a specified leader.
 * TabStops are immutable, and usually contained in TabSets.
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
 */
