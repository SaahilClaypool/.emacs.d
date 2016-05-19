_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalIconFactory.java
    public static class TreeControlIcon implements Icon, Serializable {

    /**
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalIconFactory.java
    public static class FileIcon16 implements Icon, Serializable {

    /**
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalIconFactory.java
    public static class TreeFolderIcon extends FolderIcon16 {

    /**
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalIconFactory.java
    public static class FolderIcon16 implements Icon, Serializable {

    /**
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalIconFactory.java
    static class ImageCacher {

    /**
     * Utility class for caching icon images.  This is necessary because
     * we need a new image whenever we are rendering into a new
     * GraphicsConfiguration, but we do not want to keep recreating icon
     * images for GC's that we have already seen (for example,
     * dragging a window back and forth between monitors on a multimon
     * system, or drawing an icon to different Components that have different
     * GC's).
     * So now whenever we create a new icon image for a given GC, we
     * cache that image with the GC for later retrieval.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalIconFactory.java
    public static class PaletteCloseIcon implements Icon, UIResource, Serializable{

    /**
     * Defines an icon for Palette close
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalIconFactory.java
    public static Icon getMenuItemCheckIcon() {

    /**
     * Returns an icon to be used by <code>JCheckBoxMenuItem</code>.
     *
     * @return the default icon for check box menu items,
     *         or <code>null</code> if no default exists
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalIconFactory.java
    public static Icon getCheckBoxIcon() {

    /**
     * Returns a checkbox icon.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalIconFactory.java
public class MetalIconFactory implements Serializable {

/**
 * Factory object that vends <code>Icon</code>s for
 * the Java&trade; look and feel (Metal).
 * These icons are used extensively in Metal via the defaults mechanism.
 * While other look and feels often use GIFs for icons, creating icons
 * in code facilitates switching to other themes.
 *
 * <p>
 * Each method in this class returns
 * either an <code>Icon</code> or <code>null</code>,
 * where <code>null</code> implies that there is no default icon.
 *
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
 * @author Michael C. Albers
 */
