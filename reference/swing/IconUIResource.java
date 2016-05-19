_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/IconUIResource.java
    public IconUIResource(Icon delegate) {

    /**
     * Creates a UIResource icon object which wraps
     * an existing Icon instance.
     * @param delegate the icon being wrapped
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/IconUIResource.java
public class IconUIResource implements Icon, UIResource, Serializable

/**
 * An Icon wrapper class which implements UIResource.  UI
 * classes which set icon properties should use this class
 * to wrap any icons specified as defaults.
 *
 * This class delegates all method invocations to the
 * Icon "delegate" object specified at construction.
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
 * @see javax.swing.plaf.UIResource
 * @author Amy Fowler
 *
 */
