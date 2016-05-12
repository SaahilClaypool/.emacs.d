_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Gets the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         *   object (AccessibleRole.FILLER)
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
    @SuppressWarnings("serial")

    /**
     * This class implements accessibility support for the
     * <code>Box</code> class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this Box.
     * For boxes, the AccessibleContext takes the form of an
     * AccessibleBox.
     * A new AccessibleAWTBox instance is created if necessary.
     *
     * @return an AccessibleBox that serves as the
     *         AccessibleContext of this Box
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
// Accessibility support for Box

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
            public AccessibleRole getAccessibleRole() {

            /**
             * Gets the role of this object.
             *
             * @return an instance of AccessibleRole describing the role of
             *   the object (AccessibleRole.FILLER)
             * @see AccessibleRole
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
        @SuppressWarnings("serial")

        /**
         * This class implements accessibility support for the
         * <code>Box.Filler</code> class.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
        public AccessibleContext getAccessibleContext() {

        /**
         * Gets the AccessibleContext associated with this Box.Filler.
         * For box fillers, the AccessibleContext takes the form of an
         * AccessibleBoxFiller.
         * A new AccessibleAWTBoxFiller instance is created if necessary.
         *
         * @return an AccessibleBoxFiller that serves as the
         *         AccessibleContext of this Box.Filler.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
// Accessibility support for Box$Filler

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
        protected void paintComponent(Graphics g) {

        /**
         * Paints this <code>Filler</code>.  If this
         * <code>Filler</code> has a UI this method invokes super's
         * implementation, otherwise if this <code>Filler</code> is
         * opaque the <code>Graphics</code> is filled using the
         * background.
         *
         * @param g the <code>Graphics</code> to paint to
         * @throws NullPointerException if <code>g</code> is null
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
        public void changeShape(Dimension min, Dimension pref, Dimension max) {

        /**
         * Change the size requests for this shape.  An invalidate() is
         * propagated upward as a result so that layout will eventually
         * happen with using the new sizes.
         *
         * @param min   Value to return for getMinimumSize
         * @param pref  Value to return for getPreferredSize
         * @param max   Value to return for getMaximumSize
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
        @ConstructorProperties({"minimumSize", "preferredSize", "maximumSize"})

        /**
         * Constructor to create shape with the given size ranges.
         *
         * @param min   Minimum size
         * @param pref  Preferred size
         * @param max   Maximum size
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
    @SuppressWarnings("serial")

    /**
     * An implementation of a lightweight component that participates in
     * layout but has no view.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
    protected void paintComponent(Graphics g) {

    /**
     * Paints this <code>Box</code>.  If this <code>Box</code> has a UI this
     * method invokes super's implementation, otherwise if this
     * <code>Box</code> is opaque the <code>Graphics</code> is filled
     * using the background.
     *
     * @param g the <code>Graphics</code> to paint to
     * @throws NullPointerException if <code>g</code> is null
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
    public void setLayout(LayoutManager l) {

    /**
     * Throws an AWTError, since a Box can use only a BoxLayout.
     *
     * @param l the layout manager to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
    public static Component createVerticalGlue() {

    /**
     * Creates a vertical glue component.
     *
     * @return the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
    public static Component createHorizontalGlue() {

    /**
     * Creates a horizontal glue component.
     *
     * @return the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
    public static Component createGlue() {

    /**
     * Creates an invisible "glue" component
     * that can be useful in a Box
     * whose visible components have a maximum width
     * (for a horizontal box)
     * or height (for a vertical box).
     * You can think of the glue component
     * as being a gooey substance
     * that expands as much as necessary
     * to fill the space between its neighboring components.
     *
     * <p>
     *
     * For example, suppose you have
     * a horizontal box that contains two fixed-size components.
     * If the box gets extra space,
     * the fixed-size components won't become larger,
    * so where does the extra space go?
     * Without glue,
     * the extra space goes to the right of the second component.
     * If you put glue between the fixed-size components,
     * then the extra space goes there.
     * If you put glue before the first fixed-size component,
     * the extra space goes there,
     * and the fixed-size components are shoved against the right
     * edge of the box.
     * If you put glue before the first fixed-size component
     * and after the second fixed-size component,
     * the fixed-size components are centered in the box.
     *
     * <p>
     *
     * To use glue,
     * call <code>Box.createGlue</code>
     * and add the returned component to a container.
     * The glue component has no minimum or preferred size,
     * so it takes no space unless excess space is available.
     * If excess space is available,
     * then the glue component takes its share of available
     * horizontal or vertical space,
     * just like any other component that has no maximum width or height.
     *
     * @return the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
    public static Component createVerticalStrut(int height) {

    /**
     * Creates an invisible, fixed-height component.
     * In a vertical box,
     * you typically use this method
     * to force a certain amount of space between two components.
     * In a horizontal box,
     * you might use this method
     * to force the box to be at least the specified height.
     * The invisible component has no width
     * unless excess space is available,
     * in which case it takes its share of available space,
     * just like any other component that has no maximum width.
     *
     * @param height the height of the invisible component, in pixels &gt;= 0
     * @return the component
     * @see #createHorizontalStrut
     * @see #createGlue
     * @see #createRigidArea
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
    public static Component createHorizontalStrut(int width) {

    /**
     * Creates an invisible, fixed-width component.
     * In a horizontal box,
     * you typically use this method
     * to force a certain amount of space between two components.
     * In a vertical box,
     * you might use this method
     * to force the box to be at least the specified width.
     * The invisible component has no height
     * unless excess space is available,
     * in which case it takes its share of available space,
     * just like any other component that has no maximum height.
     *
     * @param width the width of the invisible component, in pixels &gt;= 0
     * @return the component
     * @see #createVerticalStrut
     * @see #createGlue
     * @see #createRigidArea
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
    public static Component createRigidArea(Dimension d) {

    /**
     * Creates an invisible component that's always the specified size.
     * <!-- WHEN WOULD YOU USE THIS AS OPPOSED TO A STRUT? -->
     *
     * @param d the dimensions of the invisible component
     * @return the component
     * @see #createGlue
     * @see #createHorizontalStrut
     * @see #createVerticalStrut
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
    public static Box createVerticalBox() {

    /**
     * Creates a <code>Box</code> that displays its components
     * from top to bottom. If you want a <code>Box</code> that
     * respects the component orientation you should create the
     * <code>Box</code> using the constructor and pass in
     * <code>BoxLayout.PAGE_AXIS</code>, eg:
     * <pre>
     *   Box lineBox = new Box(BoxLayout.PAGE_AXIS);
     * </pre>
     *
     * @return the box
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
    public static Box createHorizontalBox() {

    /**
     * Creates a <code>Box</code> that displays its components
     * from left to right. If you want a <code>Box</code> that
     * respects the component orientation you should create the
     * <code>Box</code> using the constructor and pass in
     * <code>BoxLayout.LINE_AXIS</code>, eg:
     * <pre>
     *   Box lineBox = new Box(BoxLayout.LINE_AXIS);
     * </pre>
     *
     * @return the box
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
    public Box(int axis) {

    /**
     * Creates a <code>Box</code> that displays its components
     * along the the specified axis.
     *
     * @param axis  can be {@link BoxLayout#X_AXIS},
     *              {@link BoxLayout#Y_AXIS},
     *              {@link BoxLayout#LINE_AXIS} or
     *              {@link BoxLayout#PAGE_AXIS}.
     * @throws AWTError if the <code>axis</code> is invalid
     * @see #createHorizontalBox
     * @see #createVerticalBox
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Box.java
@SuppressWarnings("serial")

/**
 * A lightweight container
 * that uses a BoxLayout object as its layout manager.
 * Box provides several class methods
 * that are useful for containers using BoxLayout --
 * even non-Box containers.
 *
 * <p>
 * The <code>Box</code> class can create several kinds
 * of invisible components
 * that affect layout:
 * glue, struts, and rigid areas.
 * If all the components your <code>Box</code> contains
 * have a fixed size,
 * you might want to use a glue component
 * (returned by <code>createGlue</code>)
 * to control the components' positions.
 * If you need a fixed amount of space between two components,
 * try using a strut
 * (<code>createHorizontalStrut</code> or <code>createVerticalStrut</code>).
 * If you need an invisible component
 * that always takes up the same amount of space,
 * get it by invoking <code>createRigidArea</code>.
 * <p>
 * If you are implementing a <code>BoxLayout</code> you
 * can find further information and examples in
 * <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/layout/box.html">How to Use BoxLayout</a>,
 * a section in <em>The Java Tutorial.</em>
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
 * @see BoxLayout
 *
 * @author  Timothy Prinzing
 */
