_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToggleButtonUI.java
    protected void paintIcon(Graphics g, AbstractButton b, Rectangle iconRect) {

    /**
     * Paints the appropriate icon of the button <code>b</code> in the
     * space <code>iconRect</code>.
     *
     * @param g Graphics to paint to
     * @param b Button to render for
     * @param iconRect space to render in
     * @throws NullPointerException if any of the arguments are null.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToggleButtonUI.java
            if (model.isSelected()) {

            /*** paint the text disabled ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToggleButtonUI.java
            g.setColor(b.getForeground());

            /*** paint the text normally */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToggleButtonUI.java
    public void update(Graphics g, JComponent c) {

    /**
     * If necessary paints the background of the component, then invokes
     * <code>paint</code>.
     *
     * @param g Graphics to paint to
     * @param c JComponent painting on
     * @throws NullPointerException if <code>g</code> or <code>c</code> is
     *         null
     * @see javax.swing.plaf.ComponentUI#update
     * @see javax.swing.plaf.ComponentUI#paint
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToggleButtonUI.java
public class MetalToggleButtonUI extends BasicToggleButtonUI {

/**
 * MetalToggleButton implementation
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
 * @author Tom Santos
 */
