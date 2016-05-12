_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    public static class UIResource extends DefaultListCellRenderer

    /**
     * A subclass of DefaultListCellRenderer that implements UIResource.
     * DefaultListCellRenderer doesn't implement UIResource
     * directly so that applications can safely override the
     * cellRenderer property with DefaultListCellRenderer subclasses.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    *
    * @since 1.5
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    *
    * @since 1.5
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    @Override

    /**
     * Overridden for performance reasons.
     * See the <a href="#override">Implementation Note</a>
     * for more information.
     *
     * @since 1.5
     * @return <code>true</code> if the background is completely opaque
     *         and differs from the JList's background;
     *         <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    public DefaultListCellRenderer() {

    /**
     * Constructs a default renderer object for an item
     * in a list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
    private static final Border SAFE_NO_FOCUS_BORDER = new EmptyBorder(1, 1, 1, 1);

   /**
    * An empty <code>Border</code>. This field might not be used. To change the
    * <code>Border</code> used by this renderer override the
    * <code>getListCellRendererComponent</code> method and set the border
    * of the returned component directly.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListCellRenderer.java
public class DefaultListCellRenderer extends JLabel

/**
 * Renders an item in a list.
 * <p>
 * <strong><a name="override">Implementation Note:</a></strong>
 * This class overrides
 * <code>invalidate</code>,
 * <code>validate</code>,
 * <code>revalidate</code>,
 * <code>repaint</code>,
 * <code>isOpaque</code>,
 * and
 * <code>firePropertyChange</code>
 * solely to improve performance.
 * If not overridden, these frequently called methods would execute code paths
 * that are unnecessary for the default list cell renderer.
 * If you write your own renderer,
 * take care to weigh the benefits and
 * drawbacks of overriding these methods.
 *
 * <p>
 *
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author Philip Milne
 * @author Hans Muller
 */
