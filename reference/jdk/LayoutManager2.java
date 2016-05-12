_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager2.java
    public void invalidateLayout(Container target);

    /**
     * Invalidates the layout, indicating that if the layout manager
     * has cached information it should be discarded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager2.java
    public float getLayoutAlignmentY(Container target);

    /**
     * Returns the alignment along the y axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager2.java
    public float getLayoutAlignmentX(Container target);

    /**
     * Returns the alignment along the x axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager2.java
    public Dimension maximumLayoutSize(Container target);

    /**
     * Calculates the maximum size dimensions for the specified container,
     * given the components it contains.
     * @see java.awt.Component#getMaximumSize
     * @see LayoutManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager2.java
    void addLayoutComponent(Component comp, Object constraints);

    /**
     * Adds the specified component to the layout, using the specified
     * constraint object.
     * @param comp the component to be added
     * @param constraints  where/how the component is added to the layout.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager2.java
public interface LayoutManager2 extends LayoutManager {

/**
 * Defines an interface for classes that know how to layout Containers
 * based on a layout constraints object.
 *
 * This interface extends the LayoutManager interface to deal with layouts
 * explicitly in terms of constraint objects that specify how and where
 * components should be added to the layout.
 * <p>
 * This minimal extension to LayoutManager is intended for tool
 * providers who wish to the creation of constraint-based layouts.
 * It does not yet provide full, general support for custom
 * constraint-based layout managers.
 *
 * @see LayoutManager
 * @see Container
 *
 * @author      Jonni Kanerva
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager2.java
    public void invalidateLayout(Container target);

    /**
     * Invalidates the layout, indicating that if the layout manager
     * has cached information it should be discarded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager2.java
    public float getLayoutAlignmentY(Container target);

    /**
     * Returns the alignment along the y axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager2.java
    public float getLayoutAlignmentX(Container target);

    /**
     * Returns the alignment along the x axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager2.java
    public Dimension maximumLayoutSize(Container target);

    /**
     * Calculates the maximum size dimensions for the specified container,
     * given the components it contains.
     * @see java.awt.Component#getMaximumSize
     * @see LayoutManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager2.java
    void addLayoutComponent(Component comp, Object constraints);

    /**
     * Adds the specified component to the layout, using the specified
     * constraint object.
     * @param comp the component to be added
     * @param constraints  where/how the component is added to the layout.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LayoutManager2.java
public interface LayoutManager2 extends LayoutManager {

/**
 * Defines an interface for classes that know how to layout Containers
 * based on a layout constraints object.
 *
 * This interface extends the LayoutManager interface to deal with layouts
 * explicitly in terms of constraint objects that specify how and where
 * components should be added to the layout.
 * <p>
 * This minimal extension to LayoutManager is intended for tool
 * providers who wish to the creation of constraint-based layouts.
 * It does not yet provide full, general support for custom
 * constraint-based layout managers.
 *
 * @see LayoutManager
 * @see Container
 *
 * @author      Jonni Kanerva
 */
