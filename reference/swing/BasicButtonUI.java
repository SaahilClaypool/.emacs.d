_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicButtonUI.java
    private BasicButtonListener getButtonListener(AbstractButton b) {

    /**
     * Returns the ButtonListener for the passed in Button, or null if one
     * could not be found.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicButtonUI.java
    public Component.BaselineResizeBehavior getBaselineResizeBehavior(
            JComponent c) {

    /**
     * Returns an enum indicating how the baseline of the component
     * changes as the size changes.
     *
     * @throws NullPointerException {@inheritDoc}
     * @see javax.swing.JComponent#getBaseline(int, int)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicButtonUI.java
    public int getBaseline(JComponent c, int width, int height) {

    /**
     * Returns the baseline.
     *
     * @throws NullPointerException {@inheritDoc}
     * @throws IllegalArgumentException {@inheritDoc}
     * @see javax.swing.JComponent#getBaseline(int, int)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicButtonUI.java
    protected void paintText(Graphics g, AbstractButton b, Rectangle textRect, String text) {

    /**
     * Method which renders the text of the current button.
     * <p>
     * @param g Graphics context
     * @param b Current button to render
     * @param textRect Bounding rectangle to render the text.
     * @param text String to render
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicButtonUI.java
            g.setColor(b.getBackground().brighter());

            /*** paint the text disabled ***/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicButtonUI.java
            g.setColor(b.getForeground());

            /*** paint the text normally */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicButtonUI.java
    protected void paintText(Graphics g, JComponent c, Rectangle textRect, String text) {

    /**
     * As of Java 2 platform v 1.4 this method should not be used or overriden.
     * Use the paintText method which takes the AbstractButton argument.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicButtonUI.java
public class BasicButtonUI extends ButtonUI{

/**
 * BasicButton implementation
 *
 * @author Jeff Dinkins
 */
