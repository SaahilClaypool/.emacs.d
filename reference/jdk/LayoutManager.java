_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager.java
    void layoutContainer(Container parent);

    /**
     * Lays out the specified container.
     * @param parent the container to be laid out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager.java
    Dimension minimumLayoutSize(Container parent);

    /**
     * Calculates the minimum size dimensions for the specified
     * container, given the components it contains.
     * @param parent the component to be laid out
     * @see #preferredLayoutSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager.java
    Dimension preferredLayoutSize(Container parent);

    /**
     * Calculates the preferred size dimensions for the specified
     * container, given the components it contains.
     * @param parent the container to be laid out
     *
     * @see #minimumLayoutSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager.java
    void removeLayoutComponent(Component comp);

    /**
     * Removes the specified component from the layout.
     * @param comp the component to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager.java
public interface LayoutManager {

/**
 * Defines the interface for classes that know how to lay out
 * <code>Container</code>s.
 * <p>
 * Swing's painting architecture assumes the children of a
 * <code>JComponent</code> do not overlap.  If a
 * <code>JComponent</code>'s <code>LayoutManager</code> allows
 * children to overlap, the <code>JComponent</code> must override
 * <code>isOptimizedDrawingEnabled</code> to return false.
 *
 * @see Container
 * @see javax.swing.JComponent#isOptimizedDrawingEnabled
 *
 * @author      Sami Shaio
 * @author      Arthur van Hoff
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager.java
    void layoutContainer(Container parent);

    /**
     * Lays out the specified container.
     * @param parent the container to be laid out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager.java
    Dimension minimumLayoutSize(Container parent);

    /**
     * Calculates the minimum size dimensions for the specified
     * container, given the components it contains.
     * @param parent the component to be laid out
     * @see #preferredLayoutSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager.java
    Dimension preferredLayoutSize(Container parent);

    /**
     * Calculates the preferred size dimensions for the specified
     * container, given the components it contains.
     * @param parent the container to be laid out
     *
     * @see #minimumLayoutSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager.java
    void removeLayoutComponent(Component comp);

    /**
     * Removes the specified component from the layout.
     * @param comp the component to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager.java
public interface LayoutManager {

/**
 * Defines the interface for classes that know how to lay out
 * <code>Container</code>s.
 * <p>
 * Swing's painting architecture assumes the children of a
 * <code>JComponent</code> do not overlap.  If a
 * <code>JComponent</code>'s <code>LayoutManager</code> allows
 * children to overlap, the <code>JComponent</code> must override
 * <code>isOptimizedDrawingEnabled</code> to return false.
 *
 * @see Container
 * @see javax.swing.JComponent#isOptimizedDrawingEnabled
 *
 * @author      Sami Shaio
 * @author      Arthur van Hoff
 */
