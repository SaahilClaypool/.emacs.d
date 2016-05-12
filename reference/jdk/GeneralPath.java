_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/GeneralPath.java
    public GeneralPath(Shape s) {

    /**
     * Constructs a new <code>GeneralPath</code> object from an arbitrary
     * {@link Shape} object.
     * All of the initial geometry and the winding rule for this path are
     * taken from the specified <code>Shape</code> object.
     *
     * @param s the specified <code>Shape</code> object
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/GeneralPath.java
    public GeneralPath(int rule, int initialCapacity) {

    /**
     * Constructs a new <code>GeneralPath</code> object with the specified
     * winding rule and the specified initial capacity to store path
     * coordinates.
     * This number is an initial guess as to how many path segments
     * will be added to the path, but the storage is expanded as
     * needed to store whatever path segments are added.
     *
     * @param rule the winding rule
     * @param initialCapacity the estimate for the number of path segments
     *                        in the path
     * @see #WIND_EVEN_ODD
     * @see #WIND_NON_ZERO
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/GeneralPath.java
    public GeneralPath(int rule) {

    /**
     * Constructs a new <code>GeneralPath</code> object with the specified
     * winding rule to control operations that require the interior of the
     * path to be defined.
     *
     * @param rule the winding rule
     * @see #WIND_EVEN_ODD
     * @see #WIND_NON_ZERO
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/GeneralPath.java
public final class GeneralPath extends Path2D.Float {

/**
 * The {@code GeneralPath} class represents a geometric path
 * constructed from straight lines, and quadratic and cubic
 * (B&eacute;zier) curves.  It can contain multiple subpaths.
 * <p>
 * {@code GeneralPath} is a legacy final class which exactly
 * implements the behavior of its superclass {@link Path2D.Float}.
 * Together with {@link Path2D.Double}, the {@link Path2D} classes
 * provide full implementations of a general geometric path that
 * support all of the functionality of the {@link Shape} and
 * {@link PathIterator} interfaces with the ability to explicitly
 * select different levels of internal coordinate precision.
 * <p>
 * Use {@code Path2D.Float} (or this legacy {@code GeneralPath}
 * subclass) when dealing with data that can be represented
 * and used with floating point precision.  Use {@code Path2D.Double}
 * for data that requires the accuracy or range of double precision.
 *
 * @author Jim Graham
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/GeneralPath.java
    public GeneralPath(Shape s) {

    /**
     * Constructs a new <code>GeneralPath</code> object from an arbitrary
     * {@link Shape} object.
     * All of the initial geometry and the winding rule for this path are
     * taken from the specified <code>Shape</code> object.
     *
     * @param s the specified <code>Shape</code> object
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/GeneralPath.java
    public GeneralPath(int rule, int initialCapacity) {

    /**
     * Constructs a new <code>GeneralPath</code> object with the specified
     * winding rule and the specified initial capacity to store path
     * coordinates.
     * This number is an initial guess as to how many path segments
     * will be added to the path, but the storage is expanded as
     * needed to store whatever path segments are added.
     *
     * @param rule the winding rule
     * @param initialCapacity the estimate for the number of path segments
     *                        in the path
     * @see #WIND_EVEN_ODD
     * @see #WIND_NON_ZERO
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/GeneralPath.java
    public GeneralPath(int rule) {

    /**
     * Constructs a new <code>GeneralPath</code> object with the specified
     * winding rule to control operations that require the interior of the
     * path to be defined.
     *
     * @param rule the winding rule
     * @see #WIND_EVEN_ODD
     * @see #WIND_NON_ZERO
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/GeneralPath.java
public final class GeneralPath extends Path2D.Float {

/**
 * The {@code GeneralPath} class represents a geometric path
 * constructed from straight lines, and quadratic and cubic
 * (B&eacute;zier) curves.  It can contain multiple subpaths.
 * <p>
 * {@code GeneralPath} is a legacy final class which exactly
 * implements the behavior of its superclass {@link Path2D.Float}.
 * Together with {@link Path2D.Double}, the {@link Path2D} classes
 * provide full implementations of a general geometric path that
 * support all of the functionality of the {@link Shape} and
 * {@link PathIterator} interfaces with the ability to explicitly
 * select different levels of internal coordinate precision.
 * <p>
 * Use {@code Path2D.Float} (or this legacy {@code GeneralPath}
 * subclass) when dealing with data that can be represented
 * and used with floating point precision.  Use {@code Path2D.Double}
 * for data that requires the accuracy or range of double precision.
 *
 * @author Jim Graham
 * @since 1.2
 */
