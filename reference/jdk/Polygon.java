_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
        public int currentSegment(double[] coords) {

        /**
         * Returns the coordinates and type of the current path segment in
         * the iteration.
         * The return value is the path segment type:
         * SEG_MOVETO, SEG_LINETO, or SEG_CLOSE.
         * A <code>double</code> array of length 2 must be passed in and
         * can be used to store the coordinates of the point(s).
         * Each point is stored as a pair of <code>double</code> x,&nbsp;y
         * coordinates.
         * SEG_MOVETO and SEG_LINETO types return one point,
         * and SEG_CLOSE does not return any points.
         * @param coords a <code>double</code> array that specifies the
         * coordinates of the point(s)
         * @return an integer representing the type and coordinates of the
         *              current path segment.
         * @see PathIterator#SEG_MOVETO
         * @see PathIterator#SEG_LINETO
         * @see PathIterator#SEG_CLOSE
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
        public int currentSegment(float[] coords) {

        /**
         * Returns the coordinates and type of the current path segment in
         * the iteration.
         * The return value is the path segment type:
         * SEG_MOVETO, SEG_LINETO, or SEG_CLOSE.
         * A <code>float</code> array of length 2 must be passed in and
         * can be used to store the coordinates of the point(s).
         * Each point is stored as a pair of <code>float</code> x,&nbsp;y
         * coordinates.  SEG_MOVETO and SEG_LINETO types return one
         * point, and SEG_CLOSE does not return any points.
         * @param coords a <code>float</code> array that specifies the
         * coordinates of the point(s)
         * @return an integer representing the type and coordinates of the
         *              current path segment.
         * @see PathIterator#SEG_MOVETO
         * @see PathIterator#SEG_LINETO
         * @see PathIterator#SEG_CLOSE
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
        public void next() {

        /**
         * Moves the iterator forwards, along the primary direction of
         * traversal, to the next segment of the path when there are
         * more points in that direction.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
        public boolean isDone() {

        /**
         * Tests if there are more points to read.
         * @return <code>true</code> if there are more points to read;
         *          <code>false</code> otherwise.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
        public int getWindingRule() {

        /**
         * Returns the winding rule for determining the interior of the
         * path.
         * @return an integer representing the current winding rule.
         * @see PathIterator#WIND_NON_ZERO
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public PathIterator getPathIterator(AffineTransform at, double flatness) {

    /**
     * Returns an iterator object that iterates along the boundary of
     * the <code>Shape</code> and provides access to the geometry of the
     * outline of the <code>Shape</code>.  Only SEG_MOVETO, SEG_LINETO, and
     * SEG_CLOSE point types are returned by the iterator.
     * Since polygons are already flat, the <code>flatness</code> parameter
     * is ignored.  An optional <code>AffineTransform</code> can be specified
     * in which case the coordinates returned in the iteration are transformed
     * accordingly.
     * @param at an optional <code>AffineTransform</code> to be applied to the
     *          coordinates as they are returned in the iteration, or
     *          <code>null</code> if untransformed coordinates are desired
     * @param flatness the maximum amount that the control points
     *          for a given curve can vary from colinear before a subdivided
     *          curve is replaced by a straight line connecting the
     *          endpoints.  Since polygons are already flat the
     *          <code>flatness</code> parameter is ignored.
     * @return a <code>PathIterator</code> object that provides access to the
     *          <code>Shape</code> object's geometry.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public PathIterator getPathIterator(AffineTransform at) {

    /**
     * Returns an iterator object that iterates along the boundary of this
     * <code>Polygon</code> and provides access to the geometry
     * of the outline of this <code>Polygon</code>.  An optional
     * {@link AffineTransform} can be specified so that the coordinates
     * returned in the iteration are transformed accordingly.
     * @param at an optional <code>AffineTransform</code> to be applied to the
     *          coordinates as they are returned in the iteration, or
     *          <code>null</code> if untransformed coordinates are desired
     * @return a {@link PathIterator} object that provides access to the
     *          geometry of this <code>Polygon</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean contains(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean contains(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean intersects(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean intersects(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean contains(Point2D p) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean contains(double x, double y) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public Rectangle2D getBounds2D() {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    @Deprecated

    /**
     * Determines whether the specified coordinates are contained in this
     * <code>Polygon</code>.
     * @param x the specified X coordinate to be tested
     * @param y the specified Y coordinate to be tested
     * @return {@code true} if this {@code Polygon} contains
     *         the specified coordinates {@code (x,y)};
     *         {@code false} otherwise.
     * @see #contains(double, double)
     * @deprecated As of JDK version 1.1,
     * replaced by <code>contains(int, int)</code>.
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean contains(int x, int y) {

    /**
     * Determines whether the specified coordinates are inside this
     * <code>Polygon</code>.
     * <p>
     * @param x the specified X coordinate to be tested
     * @param y the specified Y coordinate to be tested
     * @return {@code true} if this {@code Polygon} contains
     *         the specified coordinates {@code (x,y)};
     *         {@code false} otherwise.
     * @see #contains(double, double)
     * @since 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean contains(Point p) {

    /**
     * Determines whether the specified {@link Point} is inside this
     * <code>Polygon</code>.
     * @param p the specified <code>Point</code> to be tested
     * @return <code>true</code> if the <code>Polygon</code> contains the
     *                  <code>Point</code>; <code>false</code> otherwise.
     * @see #contains(double, double)
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    @Deprecated

    /**
     * Returns the bounds of this <code>Polygon</code>.
     * @return the bounds of this <code>Polygon</code>.
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getBounds()</code>.
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public Rectangle getBounds() {

    /**
     * Gets the bounding box of this <code>Polygon</code>.
     * The bounding box is the smallest {@link Rectangle} whose
     * sides are parallel to the x and y axes of the
     * coordinate space, and can completely contain the <code>Polygon</code>.
     * @return a <code>Rectangle</code> that defines the bounds of this
     * <code>Polygon</code>.
     * @since 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public void addPoint(int x, int y) {

    /**
     * Appends the specified coordinates to this <code>Polygon</code>.
     * <p>
     * If an operation that calculates the bounding box of this
     * <code>Polygon</code> has already been performed, such as
     * <code>getBounds</code> or <code>contains</code>, then this
     * method updates the bounding box.
     * @param       x the specified X coordinate
     * @param       y the specified Y coordinate
     * @see         java.awt.Polygon#getBounds
     * @see         java.awt.Polygon#contains
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public void translate(int deltaX, int deltaY) {

    /**
     * Translates the vertices of the <code>Polygon</code> by
     * <code>deltaX</code> along the x axis and by
     * <code>deltaY</code> along the y axis.
     * @param deltaX the amount to translate along the X axis
     * @param deltaY the amount to translate along the Y axis
     * @since 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public void invalidate() {

    /**
     * Invalidates or flushes any internally-cached data that depends
     * on the vertex coordinates of this <code>Polygon</code>.
     * This method should be called after any direct manipulation
     * of the coordinates in the <code>xpoints</code> or
     * <code>ypoints</code> arrays to avoid inconsistent results
     * from methods such as <code>getBounds</code> or <code>contains</code>
     * that might cache data from earlier computations relating to
     * the vertex coordinates.
     * @see         java.awt.Polygon#getBounds
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public void reset() {

    /**
     * Resets this <code>Polygon</code> object to an empty polygon.
     * The coordinate arrays and the data in them are left untouched
     * but the number of points is reset to zero to mark the old
     * vertex data as invalid and to start accumulating new vertex
     * data at the beginning.
     * All internally-cached data relating to the old vertices
     * are discarded.
     * Note that since the coordinate arrays from before the reset
     * are reused, creating a new empty <code>Polygon</code> might
     * be more memory efficient than resetting the current one if
     * the number of vertices in the new polygon data is significantly
     * smaller than the number of vertices in the data from before the
     * reset.
     * @see         java.awt.Polygon#invalidate
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public Polygon(int xpoints[], int ypoints[], int npoints) {

    /**
     * Constructs and initializes a <code>Polygon</code> from the specified
     * parameters.
     * @param xpoints an array of X coordinates
     * @param ypoints an array of Y coordinates
     * @param npoints the total number of points in the
     *                          <code>Polygon</code>
     * @exception  NegativeArraySizeException if the value of
     *                       <code>npoints</code> is negative.
     * @exception  IndexOutOfBoundsException if <code>npoints</code> is
     *             greater than the length of <code>xpoints</code>
     *             or the length of <code>ypoints</code>.
     * @exception  NullPointerException if <code>xpoints</code> or
     *             <code>ypoints</code> is <code>null</code>.
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public Polygon() {

    /**
     * Creates an empty polygon.
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    protected Rectangle bounds;

    /**
     * The bounds of this {@code Polygon}.
     * This value can be null.
     *
     * @serial
     * @see #getBoundingBox()
     * @see #getBounds()
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public int ypoints[];

    /**
     * The array of Y coordinates.  The number of elements in
     * this array might be more than the number of Y coordinates
     * in this <code>Polygon</code>.  The extra elements allow new points
     * to be added to this <code>Polygon</code> without re-creating this
     * array.  The value of <code>npoints</code> is equal to the
     * number of valid points in this <code>Polygon</code>.
     *
     * @serial
     * @see #addPoint(int, int)
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public int xpoints[];

    /**
     * The array of X coordinates.  The number of elements in
     * this array might be more than the number of X coordinates
     * in this <code>Polygon</code>.  The extra elements allow new points
     * to be added to this <code>Polygon</code> without re-creating this
     * array.  The value of {@link #npoints npoints} is equal to the
     * number of valid points in this <code>Polygon</code>.
     *
     * @serial
     * @see #addPoint(int, int)
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public int npoints;

    /**
     * The total number of points.  The value of <code>npoints</code>
     * represents the number of valid points in this <code>Polygon</code>
     * and might be less than the number of elements in
     * {@link #xpoints xpoints} or {@link #ypoints ypoints}.
     * This value can be NULL.
     *
     * @serial
     * @see #addPoint(int, int)
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
public class Polygon implements Shape, java.io.Serializable {

/**
 * The <code>Polygon</code> class encapsulates a description of a
 * closed, two-dimensional region within a coordinate space. This
 * region is bounded by an arbitrary number of line segments, each of
 * which is one side of the polygon. Internally, a polygon
 * comprises of a list of {@code (x,y)}
 * coordinate pairs, where each pair defines a <i>vertex</i> of the
 * polygon, and two successive pairs are the endpoints of a
 * line that is a side of the polygon. The first and final
 * pairs of {@code (x,y)} points are joined by a line segment
 * that closes the polygon.  This <code>Polygon</code> is defined with
 * an even-odd winding rule.  See
 * {@link java.awt.geom.PathIterator#WIND_EVEN_ODD WIND_EVEN_ODD}
 * for a definition of the even-odd winding rule.
 * This class's hit-testing methods, which include the
 * <code>contains</code>, <code>intersects</code> and <code>inside</code>
 * methods, use the <i>insideness</i> definition described in the
 * {@link Shape} class comments.
 *
 * @author      Sami Shaio
 * @see Shape
 * @author      Herb Jellinek
 * @since       1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
        public int currentSegment(double[] coords) {

        /**
         * Returns the coordinates and type of the current path segment in
         * the iteration.
         * The return value is the path segment type:
         * SEG_MOVETO, SEG_LINETO, or SEG_CLOSE.
         * A <code>double</code> array of length 2 must be passed in and
         * can be used to store the coordinates of the point(s).
         * Each point is stored as a pair of <code>double</code> x,&nbsp;y
         * coordinates.
         * SEG_MOVETO and SEG_LINETO types return one point,
         * and SEG_CLOSE does not return any points.
         * @param coords a <code>double</code> array that specifies the
         * coordinates of the point(s)
         * @return an integer representing the type and coordinates of the
         *              current path segment.
         * @see PathIterator#SEG_MOVETO
         * @see PathIterator#SEG_LINETO
         * @see PathIterator#SEG_CLOSE
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
        public int currentSegment(float[] coords) {

        /**
         * Returns the coordinates and type of the current path segment in
         * the iteration.
         * The return value is the path segment type:
         * SEG_MOVETO, SEG_LINETO, or SEG_CLOSE.
         * A <code>float</code> array of length 2 must be passed in and
         * can be used to store the coordinates of the point(s).
         * Each point is stored as a pair of <code>float</code> x,&nbsp;y
         * coordinates.  SEG_MOVETO and SEG_LINETO types return one
         * point, and SEG_CLOSE does not return any points.
         * @param coords a <code>float</code> array that specifies the
         * coordinates of the point(s)
         * @return an integer representing the type and coordinates of the
         *              current path segment.
         * @see PathIterator#SEG_MOVETO
         * @see PathIterator#SEG_LINETO
         * @see PathIterator#SEG_CLOSE
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
        public void next() {

        /**
         * Moves the iterator forwards, along the primary direction of
         * traversal, to the next segment of the path when there are
         * more points in that direction.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
        public boolean isDone() {

        /**
         * Tests if there are more points to read.
         * @return <code>true</code> if there are more points to read;
         *          <code>false</code> otherwise.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
        public int getWindingRule() {

        /**
         * Returns the winding rule for determining the interior of the
         * path.
         * @return an integer representing the current winding rule.
         * @see PathIterator#WIND_NON_ZERO
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public PathIterator getPathIterator(AffineTransform at, double flatness) {

    /**
     * Returns an iterator object that iterates along the boundary of
     * the <code>Shape</code> and provides access to the geometry of the
     * outline of the <code>Shape</code>.  Only SEG_MOVETO, SEG_LINETO, and
     * SEG_CLOSE point types are returned by the iterator.
     * Since polygons are already flat, the <code>flatness</code> parameter
     * is ignored.  An optional <code>AffineTransform</code> can be specified
     * in which case the coordinates returned in the iteration are transformed
     * accordingly.
     * @param at an optional <code>AffineTransform</code> to be applied to the
     *          coordinates as they are returned in the iteration, or
     *          <code>null</code> if untransformed coordinates are desired
     * @param flatness the maximum amount that the control points
     *          for a given curve can vary from colinear before a subdivided
     *          curve is replaced by a straight line connecting the
     *          endpoints.  Since polygons are already flat the
     *          <code>flatness</code> parameter is ignored.
     * @return a <code>PathIterator</code> object that provides access to the
     *          <code>Shape</code> object's geometry.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public PathIterator getPathIterator(AffineTransform at) {

    /**
     * Returns an iterator object that iterates along the boundary of this
     * <code>Polygon</code> and provides access to the geometry
     * of the outline of this <code>Polygon</code>.  An optional
     * {@link AffineTransform} can be specified so that the coordinates
     * returned in the iteration are transformed accordingly.
     * @param at an optional <code>AffineTransform</code> to be applied to the
     *          coordinates as they are returned in the iteration, or
     *          <code>null</code> if untransformed coordinates are desired
     * @return a {@link PathIterator} object that provides access to the
     *          geometry of this <code>Polygon</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean contains(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean contains(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean intersects(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean intersects(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean contains(Point2D p) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean contains(double x, double y) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public Rectangle2D getBounds2D() {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    @Deprecated

    /**
     * Determines whether the specified coordinates are contained in this
     * <code>Polygon</code>.
     * @param x the specified X coordinate to be tested
     * @param y the specified Y coordinate to be tested
     * @return {@code true} if this {@code Polygon} contains
     *         the specified coordinates {@code (x,y)};
     *         {@code false} otherwise.
     * @see #contains(double, double)
     * @deprecated As of JDK version 1.1,
     * replaced by <code>contains(int, int)</code>.
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean contains(int x, int y) {

    /**
     * Determines whether the specified coordinates are inside this
     * <code>Polygon</code>.
     * <p>
     * @param x the specified X coordinate to be tested
     * @param y the specified Y coordinate to be tested
     * @return {@code true} if this {@code Polygon} contains
     *         the specified coordinates {@code (x,y)};
     *         {@code false} otherwise.
     * @see #contains(double, double)
     * @since 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public boolean contains(Point p) {

    /**
     * Determines whether the specified {@link Point} is inside this
     * <code>Polygon</code>.
     * @param p the specified <code>Point</code> to be tested
     * @return <code>true</code> if the <code>Polygon</code> contains the
     *                  <code>Point</code>; <code>false</code> otherwise.
     * @see #contains(double, double)
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    @Deprecated

    /**
     * Returns the bounds of this <code>Polygon</code>.
     * @return the bounds of this <code>Polygon</code>.
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getBounds()</code>.
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public Rectangle getBounds() {

    /**
     * Gets the bounding box of this <code>Polygon</code>.
     * The bounding box is the smallest {@link Rectangle} whose
     * sides are parallel to the x and y axes of the
     * coordinate space, and can completely contain the <code>Polygon</code>.
     * @return a <code>Rectangle</code> that defines the bounds of this
     * <code>Polygon</code>.
     * @since 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public void addPoint(int x, int y) {

    /**
     * Appends the specified coordinates to this <code>Polygon</code>.
     * <p>
     * If an operation that calculates the bounding box of this
     * <code>Polygon</code> has already been performed, such as
     * <code>getBounds</code> or <code>contains</code>, then this
     * method updates the bounding box.
     * @param       x the specified X coordinate
     * @param       y the specified Y coordinate
     * @see         java.awt.Polygon#getBounds
     * @see         java.awt.Polygon#contains
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public void translate(int deltaX, int deltaY) {

    /**
     * Translates the vertices of the <code>Polygon</code> by
     * <code>deltaX</code> along the x axis and by
     * <code>deltaY</code> along the y axis.
     * @param deltaX the amount to translate along the X axis
     * @param deltaY the amount to translate along the Y axis
     * @since 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public void invalidate() {

    /**
     * Invalidates or flushes any internally-cached data that depends
     * on the vertex coordinates of this <code>Polygon</code>.
     * This method should be called after any direct manipulation
     * of the coordinates in the <code>xpoints</code> or
     * <code>ypoints</code> arrays to avoid inconsistent results
     * from methods such as <code>getBounds</code> or <code>contains</code>
     * that might cache data from earlier computations relating to
     * the vertex coordinates.
     * @see         java.awt.Polygon#getBounds
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public void reset() {

    /**
     * Resets this <code>Polygon</code> object to an empty polygon.
     * The coordinate arrays and the data in them are left untouched
     * but the number of points is reset to zero to mark the old
     * vertex data as invalid and to start accumulating new vertex
     * data at the beginning.
     * All internally-cached data relating to the old vertices
     * are discarded.
     * Note that since the coordinate arrays from before the reset
     * are reused, creating a new empty <code>Polygon</code> might
     * be more memory efficient than resetting the current one if
     * the number of vertices in the new polygon data is significantly
     * smaller than the number of vertices in the data from before the
     * reset.
     * @see         java.awt.Polygon#invalidate
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public Polygon(int xpoints[], int ypoints[], int npoints) {

    /**
     * Constructs and initializes a <code>Polygon</code> from the specified
     * parameters.
     * @param xpoints an array of X coordinates
     * @param ypoints an array of Y coordinates
     * @param npoints the total number of points in the
     *                          <code>Polygon</code>
     * @exception  NegativeArraySizeException if the value of
     *                       <code>npoints</code> is negative.
     * @exception  IndexOutOfBoundsException if <code>npoints</code> is
     *             greater than the length of <code>xpoints</code>
     *             or the length of <code>ypoints</code>.
     * @exception  NullPointerException if <code>xpoints</code> or
     *             <code>ypoints</code> is <code>null</code>.
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public Polygon() {

    /**
     * Creates an empty polygon.
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    protected Rectangle bounds;

    /**
     * The bounds of this {@code Polygon}.
     * This value can be null.
     *
     * @serial
     * @see #getBoundingBox()
     * @see #getBounds()
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public int ypoints[];

    /**
     * The array of Y coordinates.  The number of elements in
     * this array might be more than the number of Y coordinates
     * in this <code>Polygon</code>.  The extra elements allow new points
     * to be added to this <code>Polygon</code> without re-creating this
     * array.  The value of <code>npoints</code> is equal to the
     * number of valid points in this <code>Polygon</code>.
     *
     * @serial
     * @see #addPoint(int, int)
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public int xpoints[];

    /**
     * The array of X coordinates.  The number of elements in
     * this array might be more than the number of X coordinates
     * in this <code>Polygon</code>.  The extra elements allow new points
     * to be added to this <code>Polygon</code> without re-creating this
     * array.  The value of {@link #npoints npoints} is equal to the
     * number of valid points in this <code>Polygon</code>.
     *
     * @serial
     * @see #addPoint(int, int)
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
    public int npoints;

    /**
     * The total number of points.  The value of <code>npoints</code>
     * represents the number of valid points in this <code>Polygon</code>
     * and might be less than the number of elements in
     * {@link #xpoints xpoints} or {@link #ypoints ypoints}.
     * This value can be NULL.
     *
     * @serial
     * @see #addPoint(int, int)
     * @since 1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Polygon.java
public class Polygon implements Shape, java.io.Serializable {

/**
 * The <code>Polygon</code> class encapsulates a description of a
 * closed, two-dimensional region within a coordinate space. This
 * region is bounded by an arbitrary number of line segments, each of
 * which is one side of the polygon. Internally, a polygon
 * comprises of a list of {@code (x,y)}
 * coordinate pairs, where each pair defines a <i>vertex</i> of the
 * polygon, and two successive pairs are the endpoints of a
 * line that is a side of the polygon. The first and final
 * pairs of {@code (x,y)} points are joined by a line segment
 * that closes the polygon.  This <code>Polygon</code> is defined with
 * an even-odd winding rule.  See
 * {@link java.awt.geom.PathIterator#WIND_EVEN_ODD WIND_EVEN_ODD}
 * for a definition of the even-odd winding rule.
 * This class's hit-testing methods, which include the
 * <code>contains</code>, <code>intersects</code> and <code>inside</code>
 * methods, use the <i>insideness</i> definition described in the
 * {@link Shape} class comments.
 *
 * @author      Sami Shaio
 * @see Shape
 * @author      Herb Jellinek
 * @since       1.0
 */
