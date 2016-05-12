_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public Object clone() {

    /**
     * Create a copy of this object.
     * @return     a copy of this <code>Insets</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public String toString() {

    /**
     * Returns a string representation of this <code>Insets</code> object.
     * This method is intended to be used only for debugging purposes, and
     * the content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return  a string representation of this <code>Insets</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public int hashCode() {

    /**
     * Returns the hash code for this Insets.
     *
     * @return    a hash code for this Insets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public boolean equals(Object obj) {

    /**
     * Checks whether two insets objects are equal. Two instances
     * of <code>Insets</code> are equal if the four integer values
     * of the fields <code>top</code>, <code>left</code>,
     * <code>bottom</code>, and <code>right</code> are all equal.
     * @return      <code>true</code> if the two insets are equal;
     *                          otherwise <code>false</code>.
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public void set(int top, int left, int bottom, int right) {

    /**
     * Set top, left, bottom, and right to the specified values
     *
     * @param       top   the inset from the top.
     * @param       left   the inset from the left.
     * @param       bottom   the inset from the bottom.
     * @param       right   the inset from the right.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public Insets(int top, int left, int bottom, int right) {

    /**
     * Creates and initializes a new <code>Insets</code> object with the
     * specified top, left, bottom, and right insets.
     * @param       top   the inset from the top.
     * @param       left   the inset from the left.
     * @param       bottom   the inset from the bottom.
     * @param       right   the inset from the right.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public int right;

    /**
     * The inset from the right.
     * This value is subtracted from the Right of the rectangle
     * to yield a new location for the Right edge.
     *
     * @serial
     * @see #clone()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public int bottom;

    /**
     * The inset from the bottom.
     * This value is subtracted from the Bottom of the rectangle
     * to yield a new location for the Bottom.
     *
     * @serial
     * @see #clone()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public int left;

    /**
     * The inset from the left.
     * This value is added to the Left of the rectangle
     * to yield a new location for the Left edge.
     *
     * @serial
     * @see #clone()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public int top;

    /**
     * The inset from the top.
     * This value is added to the Top of the rectangle
     * to yield a new location for the Top.
     *
     * @serial
     * @see #clone()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
public class Insets implements Cloneable, java.io.Serializable {

/**
 * An <code>Insets</code> object is a representation of the borders
 * of a container. It specifies the space that a container must leave
 * at each of its edges. The space can be a border, a blank space, or
 * a title.
 *
 * @author      Arthur van Hoff
 * @author      Sami Shaio
 * @see         java.awt.LayoutManager
 * @see         java.awt.Container
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public Object clone() {

    /**
     * Create a copy of this object.
     * @return     a copy of this <code>Insets</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public String toString() {

    /**
     * Returns a string representation of this <code>Insets</code> object.
     * This method is intended to be used only for debugging purposes, and
     * the content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return  a string representation of this <code>Insets</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public int hashCode() {

    /**
     * Returns the hash code for this Insets.
     *
     * @return    a hash code for this Insets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public boolean equals(Object obj) {

    /**
     * Checks whether two insets objects are equal. Two instances
     * of <code>Insets</code> are equal if the four integer values
     * of the fields <code>top</code>, <code>left</code>,
     * <code>bottom</code>, and <code>right</code> are all equal.
     * @return      <code>true</code> if the two insets are equal;
     *                          otherwise <code>false</code>.
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public void set(int top, int left, int bottom, int right) {

    /**
     * Set top, left, bottom, and right to the specified values
     *
     * @param       top   the inset from the top.
     * @param       left   the inset from the left.
     * @param       bottom   the inset from the bottom.
     * @param       right   the inset from the right.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public Insets(int top, int left, int bottom, int right) {

    /**
     * Creates and initializes a new <code>Insets</code> object with the
     * specified top, left, bottom, and right insets.
     * @param       top   the inset from the top.
     * @param       left   the inset from the left.
     * @param       bottom   the inset from the bottom.
     * @param       right   the inset from the right.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public int right;

    /**
     * The inset from the right.
     * This value is subtracted from the Right of the rectangle
     * to yield a new location for the Right edge.
     *
     * @serial
     * @see #clone()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public int bottom;

    /**
     * The inset from the bottom.
     * This value is subtracted from the Bottom of the rectangle
     * to yield a new location for the Bottom.
     *
     * @serial
     * @see #clone()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public int left;

    /**
     * The inset from the left.
     * This value is added to the Left of the rectangle
     * to yield a new location for the Left edge.
     *
     * @serial
     * @see #clone()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
    public int top;

    /**
     * The inset from the top.
     * This value is added to the Top of the rectangle
     * to yield a new location for the Top.
     *
     * @serial
     * @see #clone()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Insets.java
public class Insets implements Cloneable, java.io.Serializable {

/**
 * An <code>Insets</code> object is a representation of the borders
 * of a container. It specifies the space that a container must leave
 * at each of its edges. The space can be a border, a blank space, or
 * a title.
 *
 * @author      Arthur van Hoff
 * @author      Sami Shaio
 * @see         java.awt.LayoutManager
 * @see         java.awt.Container
 * @since       JDK1.0
 */
