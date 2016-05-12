_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalLabelUI.java
    protected void paintDisabledText(JLabel l, Graphics g, String s, int textX, int textY)

    /**
     * Just paint the text gray (Label.disabledForeground) rather than
     * in the labels foreground color.
     *
     * @see #paint
     * @see #paintEnabledText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalLabelUI.java
    protected static MetalLabelUI metalLabelUI = new MetalLabelUI();

   /**
    * The default <code>MetalLabelUI</code> instance. This field might
    * not be used. To change the default instance use a subclass which
    * overrides the <code>createUI</code> method, and place that class
    * name in defaults table under the key "LabelUI".
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalLabelUI.java
public class MetalLabelUI extends BasicLabelUI

/**
 * A Windows L&amp;F implementation of LabelUI.  This implementation
 * is completely static, i.e. there's only one UIView implementation
 * that's shared by all JLabel objects.
 *
 * @author Hans Muller
 */
