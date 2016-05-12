_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/EmptyBorder.java
    public boolean isBorderOpaque() { return false; }

    /**
     * Returns whether or not the border is opaque.
     * Returns false by default.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/EmptyBorder.java
    public Insets getBorderInsets() {

    /**
     * Returns the insets of the border.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/EmptyBorder.java
    public Insets getBorderInsets(Component c, Insets insets) {

    /**
     * Reinitialize the insets parameter with this Border's current Insets.
     * @param c the component for which this border insets value applies
     * @param insets the object to be reinitialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/EmptyBorder.java
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {

    /**
     * Does no drawing by default.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/EmptyBorder.java
    @ConstructorProperties({"borderInsets"})

    /**
     * Creates an empty border with the specified insets.
     * @param borderInsets the insets of the border
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/EmptyBorder.java
    public EmptyBorder(int top, int left, int bottom, int right)   {

    /**
     * Creates an empty border with the specified insets.
     * @param top the top inset of the border
     * @param left the left inset of the border
     * @param bottom the bottom inset of the border
     * @param right the right inset of the border
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/EmptyBorder.java
@SuppressWarnings("serial")

/**
 * A class which provides an empty, transparent border which
 * takes up space but does no drawing.
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
 * @author David Kloba
 */
