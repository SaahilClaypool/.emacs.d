_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabSet.java
    public String toString() {

    /**
     * Returns the string representation of the set of tabs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabSet.java
    public int hashCode() {

    /**
     * Returns a hashcode for this set of TabStops.
     * @return  a hashcode value for this set of TabStops.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabSet.java
    public boolean equals(Object o) {

    /**
     * Indicates whether this <code>TabSet</code> is equal to another one.
     * @param o the <code>TabSet</code> instance which this instance
     *  should be compared to.
     * @return <code>true</code> if <code>o</code> is the instance of
     * <code>TabSet</code>, has the same number of <code>TabStop</code>s
     * and they are all equal, <code>false</code> otherwise.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabSet.java
    public int getTabIndexAfter(float location) {

    /**
     * Returns the index of the Tab to be used after <code>location</code>.
     * This will return -1 if there are no tabs after <code>location</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabSet.java
    public int getTabIndex(TabStop tab) {

    /**
     * @return the index of the TabStop <code>tab</code>, or -1 if
     * <code>tab</code> is not contained in the receiver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabSet.java
    public TabStop getTabAfter(float location) {

    /**
     * Returns the Tab instance after <code>location</code>. This will
     * return null if there are no tabs after <code>location</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabSet.java
    public TabStop getTab(int index) {

    /**
     * Returns the TabStop at index <code>index</code>. This will throw an
     * IllegalArgumentException if <code>index</code> is outside the range
     * of tabs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabSet.java
    public int getTabCount() {

    /**
     * Returns the number of Tab instances the receiver contains.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabSet.java
    public TabSet(TabStop[] tabs) {

    /**
     * Creates and returns an instance of TabSet. The array of Tabs
     * passed in must be sorted in ascending order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabSet.java
    private TabStop[]              tabs;

    /** TabStops this TabSet contains. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/TabSet.java
public class TabSet implements Serializable

/**
 * A TabSet is comprised of many TabStops. It offers methods for locating the
 * closest TabStop to a given position and finding all the potential TabStops.
 * It is also immutable.
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
 * @author  Scott Violet
 */
