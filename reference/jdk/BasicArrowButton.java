_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicArrowButton.java
        public void paintTriangle(Graphics g, int x, int y, int size,
                                        int direction, boolean isEnabled) {

        /**
         * Paints a triangle.
         *
         * @param g the {@code Graphics} to draw to
         * @param x the x coordinate
         * @param y the y coordinate
         * @param size the size of the triangle to draw
         * @param direction the direction in which to draw the arrow;
         *        one of {@code SwingConstants.NORTH},
         *        {@code SwingConstants.SOUTH}, {@code SwingConstants.EAST} or
         *        {@code SwingConstants.WEST}
         * @param isEnabled whether or not the arrow is drawn enabled
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicArrowButton.java
        public boolean isFocusTraversable() {

        /**
         * Returns whether the arrow button should get the focus.
         * {@code BasicArrowButton}s are used as a child component of
         * composite components such as {@code JScrollBar} and
         * {@code JComboBox}. Since the composite component typically gets the
         * focus, this method is overriden to return {@code false}.
         *
         * @return {@code false}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicArrowButton.java
        public Dimension getMaximumSize() {

        /**
         * Returns the maximum size of the {@code BasicArrowButton}.
         *
         * @return the maximum size
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicArrowButton.java
        public Dimension getMinimumSize() {

        /**
         * Returns the minimum size of the {@code BasicArrowButton}.
         *
         * @return the minimum size
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicArrowButton.java
        public Dimension getPreferredSize() {

        /**
         * Returns the preferred size of the {@code BasicArrowButton}.
         *
         * @return the preferred size
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicArrowButton.java
            if (getBorder() != null && !(getBorder() instanceof UIResource)) {

            /// Draw the proper Border
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicArrowButton.java
        public void setDirection(int direction) {

        /**
         * Sets the direction of the arrow.
         *
         * @param direction the direction of the arrow; one of
         *        of {@code SwingConstants.NORTH},
         *        {@code SwingConstants.SOUTH},
         *        {@code SwingConstants.EAST} or {@code SwingConstants.WEST}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicArrowButton.java
        public int getDirection() {

        /**
         * Returns the direction of the arrow.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicArrowButton.java
        public BasicArrowButton(int direction) {

        /**
         * Creates a {@code BasicArrowButton} whose arrow
         * is drawn in the specified direction.
         *
         * @param direction the direction of the arrow; one of
         *        {@code SwingConstants.NORTH}, {@code SwingConstants.SOUTH},
         *        {@code SwingConstants.EAST} or {@code SwingConstants.WEST}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicArrowButton.java
        public BasicArrowButton(int direction, Color background, Color shadow,
                         Color darkShadow, Color highlight) {

        /**
         * Creates a {@code BasicArrowButton} whose arrow
         * is drawn in the specified direction and with the specified
         * colors.
         *
         * @param direction the direction of the arrow; one of
         *        {@code SwingConstants.NORTH}, {@code SwingConstants.SOUTH},
         *        {@code SwingConstants.EAST} or {@code SwingConstants.WEST}
         * @param background the background color of the button
         * @param shadow the color of the shadow
         * @param darkShadow the color of the dark shadow
         * @param highlight the color of the highlight
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicArrowButton.java
        protected int direction;

        /**
         * The direction of the arrow. One of
         * {@code SwingConstants.NORTH}, {@code SwingConstants.SOUTH},
         * {@code SwingConstants.EAST} or {@code SwingConstants.WEST}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicArrowButton.java
public class BasicArrowButton extends JButton implements SwingConstants

/**
 * JButton object that draws a scaled Arrow in one of the cardinal directions.
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
