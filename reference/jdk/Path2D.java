_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public abstract Object clone();

    /**
     * Creates a new object of the same class as this object.
     *
     * @return     a clone of this instance.
     * @exception  OutOfMemoryError            if there is not enough memory.
     * @see        java.lang.Cloneable
     * @since      1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final PathIterator getPathIterator(AffineTransform at,
                                              double flatness)

    /**
     * {@inheritDoc}
     * <p>
     * The iterator for this class is not multi-threaded safe,
     * which means that this {@code Path2D} class does not
     * guarantee that modifications to the geometry of this
     * {@code Path2D} object do not affect any iterations of
     * that geometry that are already in process.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final boolean intersects(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * <p>
     * This method object may conservatively return true in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such a case may occur if some set of segments of the
     * path are retraced in the reverse direction such that the
     * two sets of segments cancel each other out without any
     * interior area between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final boolean intersects(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * <p>
     * This method object may conservatively return true in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such a case may occur if some set of segments of the
     * path are retraced in the reverse direction such that the
     * two sets of segments cancel each other out without any
     * interior area between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static boolean intersects(PathIterator pi, Rectangle2D r) {

    /**
     * Tests if the interior of the specified {@link PathIterator}
     * intersects the interior of a specified {@link Rectangle2D}.
     * <p>
     * This method provides a basic facility for implementors of
     * the {@link Shape} interface to implement support for the
     * {@link Shape#intersects(Rectangle2D)} method.
     * <p>
     * This method object may conservatively return true in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such a case may occur if some set of segments of the
     * path are retraced in the reverse direction such that the
     * two sets of segments cancel each other out without any
     * interior area between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @param pi the specified {@code PathIterator}
     * @param r the specified {@code Rectangle2D}
     * @return {@code true} if the specified {@code PathIterator} and
     *         the interior of the specified {@code Rectangle2D}
     *         intersect each other; {@code false} otherwise.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static boolean intersects(PathIterator pi,
                                     double x, double y, double w, double h)

    /**
     * Tests if the interior of the specified {@link PathIterator}
     * intersects the interior of a specified set of rectangular
     * coordinates.
     * <p>
     * This method provides a basic facility for implementors of
     * the {@link Shape} interface to implement support for the
     * {@link Shape#intersects(double, double, double, double)} method.
     * <p>
     * This method object may conservatively return true in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such a case may occur if some set of segments of the
     * path are retraced in the reverse direction such that the
     * two sets of segments cancel each other out without any
     * interior area between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @param pi the specified {@code PathIterator}
     * @param x the specified X coordinate
     * @param y the specified Y coordinate
     * @param w the width of the specified rectangular coordinates
     * @param h the height of the specified rectangular coordinates
     * @return {@code true} if the specified {@code PathIterator} and
     *         the interior of the specified set of rectangular
     *         coordinates intersect each other; {@code false} otherwise.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final boolean contains(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * <p>
     * This method object may conservatively return false in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such segments could lie entirely within the interior of the
     * path if they are part of a path with a {@link #WIND_NON_ZERO}
     * winding rule or if the segments are retraced in the reverse
     * direction such that the two sets of segments cancel each
     * other out without any exterior area falling between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final boolean contains(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * <p>
     * This method object may conservatively return false in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such segments could lie entirely within the interior of the
     * path if they are part of a path with a {@link #WIND_NON_ZERO}
     * winding rule or if the segments are retraced in the reverse
     * direction such that the two sets of segments cancel each
     * other out without any exterior area falling between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static boolean contains(PathIterator pi, Rectangle2D r) {

    /**
     * Tests if the specified {@link Rectangle2D} is entirely inside the
     * closed boundary of the specified {@link PathIterator}.
     * <p>
     * This method provides a basic facility for implementors of
     * the {@link Shape} interface to implement support for the
     * {@link Shape#contains(Rectangle2D)} method.
     * <p>
     * This method object may conservatively return false in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such segments could lie entirely within the interior of the
     * path if they are part of a path with a {@link #WIND_NON_ZERO}
     * winding rule or if the segments are retraced in the reverse
     * direction such that the two sets of segments cancel each
     * other out without any exterior area falling between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @param pi the specified {@code PathIterator}
     * @param r a specified {@code Rectangle2D}
     * @return {@code true} if the specified {@code PathIterator} contains
     *         the specified {@code Rectangle2D}; {@code false} otherwise.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static boolean contains(PathIterator pi,
                                   double x, double y, double w, double h)

    /**
     * Tests if the specified rectangular area is entirely inside the
     * closed boundary of the specified {@link PathIterator}.
     * <p>
     * This method provides a basic facility for implementors of
     * the {@link Shape} interface to implement support for the
     * {@link Shape#contains(double, double, double, double)} method.
     * <p>
     * This method object may conservatively return false in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such segments could lie entirely within the interior of the
     * path if they are part of a path with a {@link #WIND_NON_ZERO}
     * winding rule or if the segments are retraced in the reverse
     * direction such that the two sets of segments cancel each
     * other out without any exterior area falling between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @param pi the specified {@code PathIterator}
     * @param x the specified X coordinate
     * @param y the specified Y coordinate
     * @param w the width of the specified rectangular area
     * @param h the height of the specified rectangular area
     * @return {@code true} if the specified {@code PathIterator} contains
     *         the specified rectangular area; {@code false} otherwise.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final boolean contains(Point2D p) {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final boolean contains(double x, double y) {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static boolean contains(PathIterator pi, Point2D p) {

    /**
     * Tests if the specified {@link Point2D} is inside the closed
     * boundary of the specified {@link PathIterator}.
     * <p>
     * This method provides a basic facility for implementors of
     * the {@link Shape} interface to implement support for the
     * {@link Shape#contains(Point2D)} method.
     *
     * @param pi the specified {@code PathIterator}
     * @param p the specified {@code Point2D}
     * @return {@code true} if the specified coordinates are inside the
     *         specified {@code PathIterator}; {@code false} otherwise
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static boolean contains(PathIterator pi, double x, double y) {

    /**
     * Tests if the specified coordinates are inside the closed
     * boundary of the specified {@link PathIterator}.
     * <p>
     * This method provides a basic facility for implementors of
     * the {@link Shape} interface to implement support for the
     * {@link Shape#contains(double, double)} method.
     *
     * @param pi the specified {@code PathIterator}
     * @param x the specified X coordinate
     * @param y the specified Y coordinate
     * @return {@code true} if the specified coordinates are inside the
     *         specified {@code PathIterator}; {@code false} otherwise
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final Rectangle getBounds() {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final synchronized Shape createTransformedShape(AffineTransform at) {

    /**
     * Returns a new {@code Shape} representing a transformed version
     * of this {@code Path2D}.
     * Note that the exact type and coordinate precision of the return
     * value is not specified for this method.
     * The method will return a Shape that contains no less precision
     * for the transformed geometry than this {@code Path2D} currently
     * maintains, but it may contain no more precision either.
     * If the tradeoff of precision vs. storage size in the result is
     * important then the convenience constructors in the
     * {@link Path2D.Float#Path2D.Float(Shape, AffineTransform) Path2D.Float}
     * and
     * {@link Path2D.Double#Path2D.Double(Shape, AffineTransform) Path2D.Double}
     * subclasses should be used to make the choice explicit.
     *
     * @param at the {@code AffineTransform} used to transform a
     *           new {@code Shape}.
     * @return a new {@code Shape}, transformed with the specified
     *         {@code AffineTransform}.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public abstract void transform(AffineTransform at);

    /**
     * Transforms the geometry of this path using the specified
     * {@link AffineTransform}.
     * The geometry is transformed in place, which permanently changes the
     * boundary defined by this object.
     *
     * @param at the {@code AffineTransform} used to transform the area
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final synchronized void reset() {

    /**
     * Resets the path to empty.  The append position is set back to the
     * beginning of the path and all coordinates and point types are
     * forgotten.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final synchronized Point2D getCurrentPoint() {

    /**
     * Returns the coordinates most recently added to the end of the path
     * as a {@link Point2D} object.
     *
     * @return a {@code Point2D} object containing the ending coordinates of
     *         the path or {@code null} if there are no points in the path.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final void setWindingRule(int rule) {

    /**
     * Sets the winding rule for this path to the specified value.
     *
     * @param rule an integer representing the specified
     *             winding rule
     * @exception IllegalArgumentException if
     *          {@code rule} is not either
     *          {@link #WIND_EVEN_ODD} or
     *          {@link #WIND_NON_ZERO}
     * @see #getWindingRule
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final synchronized int getWindingRule() {

    /**
     * Returns the fill style winding rule.
     *
     * @return an integer representing the current winding rule.
     * @see #WIND_EVEN_ODD
     * @see #WIND_NON_ZERO
     * @see #setWindingRule
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public abstract void append(PathIterator pi, boolean connect);

    /**
     * Appends the geometry of the specified
     * {@link PathIterator} object
     * to the path, possibly connecting the new geometry to the existing
     * path segments with a line segment.
     * If the {@code connect} parameter is {@code true} and the
     * path is not empty then any initial {@code moveTo} in the
     * geometry of the appended {@code Shape} is turned into a
     * {@code lineTo} segment.
     * If the destination coordinates of such a connecting {@code lineTo}
     * segment match the ending coordinates of a currently open
     * subpath then the segment is omitted as superfluous.
     * The winding rule of the specified {@code Shape} is ignored
     * and the appended geometry is governed by the winding
     * rule specified for this path.
     *
     * @param pi the {@code PathIterator} whose geometry is appended to
     *           this path
     * @param connect a boolean to control whether or not to turn an initial
     *                {@code moveTo} segment into a {@code lineTo} segment
     *                to connect the new geometry to the existing path
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final void append(Shape s, boolean connect) {

    /**
     * Appends the geometry of the specified {@code Shape} object to the
     * path, possibly connecting the new geometry to the existing path
     * segments with a line segment.
     * If the {@code connect} parameter is {@code true} and the
     * path is not empty then any initial {@code moveTo} in the
     * geometry of the appended {@code Shape}
     * is turned into a {@code lineTo} segment.
     * If the destination coordinates of such a connecting {@code lineTo}
     * segment match the ending coordinates of a currently open
     * subpath then the segment is omitted as superfluous.
     * The winding rule of the specified {@code Shape} is ignored
     * and the appended geometry is governed by the winding
     * rule specified for this path.
     *
     * @param s the {@code Shape} whose geometry is appended
     *          to this path
     * @param connect a boolean to control whether or not to turn an initial
     *                {@code moveTo} segment into a {@code lineTo} segment
     *                to connect the new geometry to the existing path
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final synchronized void closePath() {

    /**
     * Closes the current subpath by drawing a straight line back to
     * the coordinates of the last {@code moveTo}.  If the path is already
     * closed then this method has no effect.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public abstract void curveTo(double x1, double y1,
                                 double x2, double y2,
                                 double x3, double y3);

    /**
     * Adds a curved segment, defined by three new points, to the path by
     * drawing a B&eacute;zier curve that intersects both the current
     * coordinates and the specified coordinates {@code (x3,y3)},
     * using the specified points {@code (x1,y1)} and {@code (x2,y2)} as
     * B&eacute;zier control points.
     * All coordinates are specified in double precision.
     *
     * @param x1 the X coordinate of the first B&eacute;zier control point
     * @param y1 the Y coordinate of the first B&eacute;zier control point
     * @param x2 the X coordinate of the second B&eacute;zier control point
     * @param y2 the Y coordinate of the second B&eacute;zier control point
     * @param x3 the X coordinate of the final end point
     * @param y3 the Y coordinate of the final end point
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public abstract void quadTo(double x1, double y1,
                                double x2, double y2);

    /**
     * Adds a curved segment, defined by two new points, to the path by
     * drawing a Quadratic curve that intersects both the current
     * coordinates and the specified coordinates {@code (x2,y2)},
     * using the specified point {@code (x1,y1)} as a quadratic
     * parametric control point.
     * All coordinates are specified in double precision.
     *
     * @param x1 the X coordinate of the quadratic control point
     * @param y1 the Y coordinate of the quadratic control point
     * @param x2 the X coordinate of the final end point
     * @param y2 the Y coordinate of the final end point
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public abstract void lineTo(double x, double y);

    /**
     * Adds a point to the path by drawing a straight line from the
     * current coordinates to the new specified coordinates
     * specified in double precision.
     *
     * @param x the specified X coordinate
     * @param y the specified Y coordinate
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public abstract void moveTo(double x, double y);

    /**
     * Adds a point to the path by moving to the specified
     * coordinates specified in double precision.
     *
     * @param x the specified X coordinate
     * @param y the specified Y coordinate
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        private void readObject(java.io.ObjectInputStream s)

        /**
         * Reads the default serializable fields from the
         * {@code ObjectInputStream} followed by an explicit
         * serialization of the path segments stored in this
         * path.
         * <p>
         * There are no default serializable fields as of 1.6.
         * <p>
         * The serial data for this object is described in the
         * writeObject method.
         *
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        private void writeObject(java.io.ObjectOutputStream s)

        /**
         * Writes the default serializable fields to the
         * {@code ObjectOutputStream} followed by an explicit
         * serialization of the path segments stored in this
         * path.
         *
         * @serialData
         * <a name="Path2DSerialData"><!-- --></a>
         * <ol>
         * <li>The default serializable fields.
         * There are no default serializable fields as of 1.6.
         * <li>followed by
         * a byte indicating the storage type of the original object
         * as a hint (SERIAL_STORAGE_DBL_ARRAY)
         * <li>followed by
         * an integer indicating the number of path segments to follow (NP)
         * or -1 to indicate an unknown number of path segments follows
         * <li>followed by
         * an integer indicating the total number of coordinates to follow (NC)
         * or -1 to indicate an unknown number of coordinates follows
         * (NC should always be even since coordinates always appear in pairs
         *  representing an x,y pair)
         * <li>followed by
         * a byte indicating the winding rule
         * ({@link #WIND_EVEN_ODD WIND_EVEN_ODD} or
         *  {@link #WIND_NON_ZERO WIND_NON_ZERO})
         * <li>followed by
         * {@code NP} (or unlimited if {@code NP < 0}) sets of values consisting of
         * a single byte indicating a path segment type
         * followed by one or more pairs of float or double
         * values representing the coordinates of the path segment
         * <li>followed by
         * a byte indicating the end of the path (SERIAL_PATH_END).
         * </ol>
         * <p>
         * The following byte value constants are used in the serialized form
         * of {@code Path2D} objects:
         * <table>
         * <tr>
         * <th>Constant Name</th>
         * <th>Byte Value</th>
         * <th>Followed by</th>
         * <th>Description</th>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_STORAGE_FLT_ARRAY}</td>
         * <td>0x30</td>
         * <td></td>
         * <td>A hint that the original {@code Path2D} object stored
         * the coordinates in a Java array of floats.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_STORAGE_DBL_ARRAY}</td>
         * <td>0x31</td>
         * <td></td>
         * <td>A hint that the original {@code Path2D} object stored
         * the coordinates in a Java array of doubles.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_MOVETO}</td>
         * <td>0x40</td>
         * <td>2 floats</td>
         * <td>A {@link #moveTo moveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_LINETO}</td>
         * <td>0x41</td>
         * <td>2 floats</td>
         * <td>A {@link #lineTo lineTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_QUADTO}</td>
         * <td>0x42</td>
         * <td>4 floats</td>
         * <td>A {@link #quadTo quadTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_CUBICTO}</td>
         * <td>0x43</td>
         * <td>6 floats</td>
         * <td>A {@link #curveTo curveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_MOVETO}</td>
         * <td>0x50</td>
         * <td>2 doubles</td>
         * <td>A {@link #moveTo moveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_LINETO}</td>
         * <td>0x51</td>
         * <td>2 doubles</td>
         * <td>A {@link #lineTo lineTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_QUADTO}</td>
         * <td>0x52</td>
         * <td>4 doubles</td>
         * <td>A {@link #curveTo curveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_CUBICTO}</td>
         * <td>0x53</td>
         * <td>6 doubles</td>
         * <td>A {@link #curveTo curveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_CLOSE}</td>
         * <td>0x60</td>
         * <td></td>
         * <td>A {@link #closePath closePath} path segment.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_PATH_END}</td>
         * <td>0x61</td>
         * <td></td>
         * <td>There are no more path segments following.</td>
         * </table>
         *
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final Object clone() {

        /**
         * Creates a new object of the same class as this object.
         *
         * @return     a clone of this instance.
         * @exception  OutOfMemoryError    if there is not enough memory.
         * @see        java.lang.Cloneable
         * @since      1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final PathIterator getPathIterator(AffineTransform at) {

        /**
         * {@inheritDoc}
         * <p>
         * The iterator for this class is not multi-threaded safe,
         * which means that the {@code Path2D} class does not
         * guarantee that modifications to the geometry of this
         * {@code Path2D} object do not affect any iterations of
         * that geometry that are already in process.
         *
         * @param at an {@code AffineTransform}
         * @return a new {@code PathIterator} that iterates along the boundary
         *         of this {@code Shape} and provides access to the geometry
         *         of this {@code Shape}'s outline
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final void transform(AffineTransform at) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final void append(PathIterator pi, boolean connect) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void curveTo(double x1, double y1,
                                               double x2, double y2,
                                               double x3, double y3)

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void quadTo(double x1, double y1,
                                              double x2, double y2)

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void lineTo(double x, double y) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void moveTo(double x, double y) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Double(Shape s, AffineTransform at) {

        /**
         * Constructs a new double precision {@code Path2D} object
         * from an arbitrary {@link Shape} object, transformed by an
         * {@link AffineTransform} object.
         * All of the initial geometry and the winding rule for this path are
         * taken from the specified {@code Shape} object and transformed
         * by the specified {@code AffineTransform} object.
         *
         * @param s the specified {@code Shape} object
         * @param at the specified {@code AffineTransform} object
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Double(Shape s) {

        /**
         * Constructs a new double precision {@code Path2D} object
         * from an arbitrary {@link Shape} object.
         * All of the initial geometry and the winding rule for this path are
         * taken from the specified {@code Shape} object.
         *
         * @param s the specified {@code Shape} object
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Double(int rule, int initialCapacity) {

        /**
         * Constructs a new empty double precision {@code Path2D} object
         * with the specified winding rule and the specified initial
         * capacity to store path segments.
         * This number is an initial guess as to how many path segments
         * are in the path, but the storage is expanded as needed to store
         * whatever path segments are added to this path.
         *
         * @param rule the winding rule
         * @param initialCapacity the estimate for the number of path segments
         *                        in the path
         * @see #WIND_EVEN_ODD
         * @see #WIND_NON_ZERO
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Double(int rule) {

        /**
         * Constructs a new empty double precision {@code Path2D} object
         * with the specified winding rule to control operations that
         * require the interior of the path to be defined.
         *
         * @param rule the winding rule
         * @see #WIND_EVEN_ODD
         * @see #WIND_NON_ZERO
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Double() {

        /**
         * Constructs a new empty double precision {@code Path2D} object
         * with a default winding rule of {@link #WIND_NON_ZERO}.
         *
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static class Double extends Path2D implements Serializable {

    /**
     * The {@code Double} class defines a geometric path with
     * coordinates stored in double precision floating point.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        private void readObject(java.io.ObjectInputStream s)

        /**
         * Reads the default serializable fields from the
         * {@code ObjectInputStream} followed by an explicit
         * serialization of the path segments stored in this
         * path.
         * <p>
         * There are no default serializable fields as of 1.6.
         * <p>
         * The serial data for this object is described in the
         * writeObject method.
         *
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        private void writeObject(java.io.ObjectOutputStream s)

        /**
         * Writes the default serializable fields to the
         * {@code ObjectOutputStream} followed by an explicit
         * serialization of the path segments stored in this
         * path.
         *
         * @serialData
         * <a name="Path2DSerialData"><!-- --></a>
         * <ol>
         * <li>The default serializable fields.
         * There are no default serializable fields as of 1.6.
         * <li>followed by
         * a byte indicating the storage type of the original object
         * as a hint (SERIAL_STORAGE_FLT_ARRAY)
         * <li>followed by
         * an integer indicating the number of path segments to follow (NP)
         * or -1 to indicate an unknown number of path segments follows
         * <li>followed by
         * an integer indicating the total number of coordinates to follow (NC)
         * or -1 to indicate an unknown number of coordinates follows
         * (NC should always be even since coordinates always appear in pairs
         *  representing an x,y pair)
         * <li>followed by
         * a byte indicating the winding rule
         * ({@link #WIND_EVEN_ODD WIND_EVEN_ODD} or
         *  {@link #WIND_NON_ZERO WIND_NON_ZERO})
         * <li>followed by
         * {@code NP} (or unlimited if {@code NP < 0}) sets of values consisting of
         * a single byte indicating a path segment type
         * followed by one or more pairs of float or double
         * values representing the coordinates of the path segment
         * <li>followed by
         * a byte indicating the end of the path (SERIAL_PATH_END).
         * </ol>
         * <p>
         * The following byte value constants are used in the serialized form
         * of {@code Path2D} objects:
         * <table>
         * <tr>
         * <th>Constant Name</th>
         * <th>Byte Value</th>
         * <th>Followed by</th>
         * <th>Description</th>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_STORAGE_FLT_ARRAY}</td>
         * <td>0x30</td>
         * <td></td>
         * <td>A hint that the original {@code Path2D} object stored
         * the coordinates in a Java array of floats.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_STORAGE_DBL_ARRAY}</td>
         * <td>0x31</td>
         * <td></td>
         * <td>A hint that the original {@code Path2D} object stored
         * the coordinates in a Java array of doubles.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_MOVETO}</td>
         * <td>0x40</td>
         * <td>2 floats</td>
         * <td>A {@link #moveTo moveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_LINETO}</td>
         * <td>0x41</td>
         * <td>2 floats</td>
         * <td>A {@link #lineTo lineTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_QUADTO}</td>
         * <td>0x42</td>
         * <td>4 floats</td>
         * <td>A {@link #quadTo quadTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_CUBICTO}</td>
         * <td>0x43</td>
         * <td>6 floats</td>
         * <td>A {@link #curveTo curveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_MOVETO}</td>
         * <td>0x50</td>
         * <td>2 doubles</td>
         * <td>A {@link #moveTo moveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_LINETO}</td>
         * <td>0x51</td>
         * <td>2 doubles</td>
         * <td>A {@link #lineTo lineTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_QUADTO}</td>
         * <td>0x52</td>
         * <td>4 doubles</td>
         * <td>A {@link #curveTo curveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_CUBICTO}</td>
         * <td>0x53</td>
         * <td>6 doubles</td>
         * <td>A {@link #curveTo curveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_CLOSE}</td>
         * <td>0x60</td>
         * <td></td>
         * <td>A {@link #closePath closePath} path segment.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_PATH_END}</td>
         * <td>0x61</td>
         * <td></td>
         * <td>There are no more path segments following.</td>
         * </table>
         *
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final Object clone() {

        /**
         * Creates a new object of the same class as this object.
         *
         * @return     a clone of this instance.
         * @exception  OutOfMemoryError    if there is not enough memory.
         * @see        java.lang.Cloneable
         * @since      1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final PathIterator getPathIterator(AffineTransform at) {

        /**
         * {@inheritDoc}
         * <p>
         * The iterator for this class is not multi-threaded safe,
         * which means that the {@code Path2D} class does not
         * guarantee that modifications to the geometry of this
         * {@code Path2D} object do not affect any iterations of
         * that geometry that are already in process.
         *
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final void transform(AffineTransform at) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final void append(PathIterator pi, boolean connect) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void curveTo(float x1, float y1,
                                               float x2, float y2,
                                               float x3, float y3)

        /**
         * Adds a curved segment, defined by three new points, to the path by
         * drawing a B&eacute;zier curve that intersects both the current
         * coordinates and the specified coordinates {@code (x3,y3)},
         * using the specified points {@code (x1,y1)} and {@code (x2,y2)} as
         * B&eacute;zier control points.
         * All coordinates are specified in float precision.
         * <p>
         * This method provides a single precision variant of
         * the double precision {@code curveTo()} method on the
         * base {@code Path2D} class.
         *
         * @param x1 the X coordinate of the first B&eacute;zier control point
         * @param y1 the Y coordinate of the first B&eacute;zier control point
         * @param x2 the X coordinate of the second B&eacute;zier control point
         * @param y2 the Y coordinate of the second B&eacute;zier control point
         * @param x3 the X coordinate of the final end point
         * @param y3 the Y coordinate of the final end point
         * @see Path2D#curveTo
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void curveTo(double x1, double y1,
                                               double x2, double y2,
                                               double x3, double y3)

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void quadTo(float x1, float y1,
                                              float x2, float y2)

        /**
         * Adds a curved segment, defined by two new points, to the path by
         * drawing a Quadratic curve that intersects both the current
         * coordinates and the specified coordinates {@code (x2,y2)},
         * using the specified point {@code (x1,y1)} as a quadratic
         * parametric control point.
         * All coordinates are specified in float precision.
         * <p>
         * This method provides a single precision variant of
         * the double precision {@code quadTo()} method on the
         * base {@code Path2D} class.
         *
         * @param x1 the X coordinate of the quadratic control point
         * @param y1 the Y coordinate of the quadratic control point
         * @param x2 the X coordinate of the final end point
         * @param y2 the Y coordinate of the final end point
         * @see Path2D#quadTo
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void quadTo(double x1, double y1,
                                              double x2, double y2)

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void lineTo(float x, float y) {

        /**
         * Adds a point to the path by drawing a straight line from the
         * current coordinates to the new specified coordinates
         * specified in float precision.
         * <p>
         * This method provides a single precision variant of
         * the double precision {@code lineTo()} method on the
         * base {@code Path2D} class.
         *
         * @param x the specified X coordinate
         * @param y the specified Y coordinate
         * @see Path2D#lineTo
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void lineTo(double x, double y) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void moveTo(float x, float y) {

        /**
         * Adds a point to the path by moving to the specified
         * coordinates specified in float precision.
         * <p>
         * This method provides a single precision variant of
         * the double precision {@code moveTo()} method on the
         * base {@code Path2D} class.
         *
         * @param x the specified X coordinate
         * @param y the specified Y coordinate
         * @see Path2D#moveTo
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void moveTo(double x, double y) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Float(Shape s, AffineTransform at) {

        /**
         * Constructs a new single precision {@code Path2D} object
         * from an arbitrary {@link Shape} object, transformed by an
         * {@link AffineTransform} object.
         * All of the initial geometry and the winding rule for this path are
         * taken from the specified {@code Shape} object and transformed
         * by the specified {@code AffineTransform} object.
         *
         * @param s the specified {@code Shape} object
         * @param at the specified {@code AffineTransform} object
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Float(Shape s) {

        /**
         * Constructs a new single precision {@code Path2D} object
         * from an arbitrary {@link Shape} object.
         * All of the initial geometry and the winding rule for this path are
         * taken from the specified {@code Shape} object.
         *
         * @param s the specified {@code Shape} object
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Float(int rule, int initialCapacity) {

        /**
         * Constructs a new empty single precision {@code Path2D} object
         * with the specified winding rule and the specified initial
         * capacity to store path segments.
         * This number is an initial guess as to how many path segments
         * will be added to the path, but the storage is expanded as
         * needed to store whatever path segments are added.
         *
         * @param rule the winding rule
         * @param initialCapacity the estimate for the number of path segments
         *                        in the path
         * @see #WIND_EVEN_ODD
         * @see #WIND_NON_ZERO
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Float(int rule) {

        /**
         * Constructs a new empty single precision {@code Path2D} object
         * with the specified winding rule to control operations that
         * require the interior of the path to be defined.
         *
         * @param rule the winding rule
         * @see #WIND_EVEN_ODD
         * @see #WIND_NON_ZERO
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Float() {

        /**
         * Constructs a new empty single precision {@code Path2D} object
         * with a default winding rule of {@link #WIND_NON_ZERO}.
         *
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static class Float extends Path2D implements Serializable {

    /**
     * The {@code Float} class defines a geometric path with
     * coordinates stored in single precision floating point.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    /* private protected */

    /**
     * Constructs a new {@code Path2D} object from the given
     * specified initial values.
     * This method is only intended for internal use and should
     * not be made public if the other constructors for this class
     * are ever exposed.
     *
     * @param rule the winding rule
     * @param initialTypes the size to make the initial array to
     *                     store the path segment types
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    /* private protected */

    /**
     * Constructs a new empty {@code Path2D} object.
     * It is assumed that the package sibling subclass that is
     * defaulting to this constructor will fill in all values.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static final int WIND_NON_ZERO = PathIterator.WIND_NON_ZERO;

    /**
     * A non-zero winding rule for determining the interior of a
     * path.
     *
     * @see PathIterator#WIND_NON_ZERO
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
public abstract class Path2D implements Shape, Cloneable {

/**
 * The {@code Path2D} class provides a simple, yet flexible
 * shape which represents an arbitrary geometric path.
 * It can fully represent any path which can be iterated by the
 * {@link PathIterator} interface including all of its segment
 * types and winding rules and it implements all of the
 * basic hit testing methods of the {@link Shape} interface.
 * <p>
 * Use {@link Path2D.Float} when dealing with data that can be represented
 * and used with floating point precision.  Use {@link Path2D.Double}
 * for data that requires the accuracy or range of double precision.
 * <p>
 * {@code Path2D} provides exactly those facilities required for
 * basic construction and management of a geometric path and
 * implementation of the above interfaces with little added
 * interpretation.
 * If it is useful to manipulate the interiors of closed
 * geometric shapes beyond simple hit testing then the
 * {@link Area} class provides additional capabilities
 * specifically targeted at closed figures.
 * While both classes nominally implement the {@code Shape}
 * interface, they differ in purpose and together they provide
 * two useful views of a geometric shape where {@code Path2D}
 * deals primarily with a trajectory formed by path segments
 * and {@code Area} deals more with interpretation and manipulation
 * of enclosed regions of 2D geometric space.
 * <p>
 * The {@link PathIterator} interface has more detailed descriptions
 * of the types of segments that make up a path and the winding rules
 * that control how to determine which regions are inside or outside
 * the path.
 *
 * @author Jim Graham
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public abstract Object clone();

    /**
     * Creates a new object of the same class as this object.
     *
     * @return     a clone of this instance.
     * @exception  OutOfMemoryError            if there is not enough memory.
     * @see        java.lang.Cloneable
     * @since      1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final PathIterator getPathIterator(AffineTransform at,
                                              double flatness)

    /**
     * {@inheritDoc}
     * <p>
     * The iterator for this class is not multi-threaded safe,
     * which means that this {@code Path2D} class does not
     * guarantee that modifications to the geometry of this
     * {@code Path2D} object do not affect any iterations of
     * that geometry that are already in process.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final boolean intersects(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * <p>
     * This method object may conservatively return true in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such a case may occur if some set of segments of the
     * path are retraced in the reverse direction such that the
     * two sets of segments cancel each other out without any
     * interior area between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final boolean intersects(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * <p>
     * This method object may conservatively return true in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such a case may occur if some set of segments of the
     * path are retraced in the reverse direction such that the
     * two sets of segments cancel each other out without any
     * interior area between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static boolean intersects(PathIterator pi, Rectangle2D r) {

    /**
     * Tests if the interior of the specified {@link PathIterator}
     * intersects the interior of a specified {@link Rectangle2D}.
     * <p>
     * This method provides a basic facility for implementors of
     * the {@link Shape} interface to implement support for the
     * {@link Shape#intersects(Rectangle2D)} method.
     * <p>
     * This method object may conservatively return true in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such a case may occur if some set of segments of the
     * path are retraced in the reverse direction such that the
     * two sets of segments cancel each other out without any
     * interior area between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @param pi the specified {@code PathIterator}
     * @param r the specified {@code Rectangle2D}
     * @return {@code true} if the specified {@code PathIterator} and
     *         the interior of the specified {@code Rectangle2D}
     *         intersect each other; {@code false} otherwise.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static boolean intersects(PathIterator pi,
                                     double x, double y, double w, double h)

    /**
     * Tests if the interior of the specified {@link PathIterator}
     * intersects the interior of a specified set of rectangular
     * coordinates.
     * <p>
     * This method provides a basic facility for implementors of
     * the {@link Shape} interface to implement support for the
     * {@link Shape#intersects(double, double, double, double)} method.
     * <p>
     * This method object may conservatively return true in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such a case may occur if some set of segments of the
     * path are retraced in the reverse direction such that the
     * two sets of segments cancel each other out without any
     * interior area between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @param pi the specified {@code PathIterator}
     * @param x the specified X coordinate
     * @param y the specified Y coordinate
     * @param w the width of the specified rectangular coordinates
     * @param h the height of the specified rectangular coordinates
     * @return {@code true} if the specified {@code PathIterator} and
     *         the interior of the specified set of rectangular
     *         coordinates intersect each other; {@code false} otherwise.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final boolean contains(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * <p>
     * This method object may conservatively return false in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such segments could lie entirely within the interior of the
     * path if they are part of a path with a {@link #WIND_NON_ZERO}
     * winding rule or if the segments are retraced in the reverse
     * direction such that the two sets of segments cancel each
     * other out without any exterior area falling between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final boolean contains(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * <p>
     * This method object may conservatively return false in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such segments could lie entirely within the interior of the
     * path if they are part of a path with a {@link #WIND_NON_ZERO}
     * winding rule or if the segments are retraced in the reverse
     * direction such that the two sets of segments cancel each
     * other out without any exterior area falling between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static boolean contains(PathIterator pi, Rectangle2D r) {

    /**
     * Tests if the specified {@link Rectangle2D} is entirely inside the
     * closed boundary of the specified {@link PathIterator}.
     * <p>
     * This method provides a basic facility for implementors of
     * the {@link Shape} interface to implement support for the
     * {@link Shape#contains(Rectangle2D)} method.
     * <p>
     * This method object may conservatively return false in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such segments could lie entirely within the interior of the
     * path if they are part of a path with a {@link #WIND_NON_ZERO}
     * winding rule or if the segments are retraced in the reverse
     * direction such that the two sets of segments cancel each
     * other out without any exterior area falling between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @param pi the specified {@code PathIterator}
     * @param r a specified {@code Rectangle2D}
     * @return {@code true} if the specified {@code PathIterator} contains
     *         the specified {@code Rectangle2D}; {@code false} otherwise.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static boolean contains(PathIterator pi,
                                   double x, double y, double w, double h)

    /**
     * Tests if the specified rectangular area is entirely inside the
     * closed boundary of the specified {@link PathIterator}.
     * <p>
     * This method provides a basic facility for implementors of
     * the {@link Shape} interface to implement support for the
     * {@link Shape#contains(double, double, double, double)} method.
     * <p>
     * This method object may conservatively return false in
     * cases where the specified rectangular area intersects a
     * segment of the path, but that segment does not represent a
     * boundary between the interior and exterior of the path.
     * Such segments could lie entirely within the interior of the
     * path if they are part of a path with a {@link #WIND_NON_ZERO}
     * winding rule or if the segments are retraced in the reverse
     * direction such that the two sets of segments cancel each
     * other out without any exterior area falling between them.
     * To determine whether segments represent true boundaries of
     * the interior of the path would require extensive calculations
     * involving all of the segments of the path and the winding
     * rule and are thus beyond the scope of this implementation.
     *
     * @param pi the specified {@code PathIterator}
     * @param x the specified X coordinate
     * @param y the specified Y coordinate
     * @param w the width of the specified rectangular area
     * @param h the height of the specified rectangular area
     * @return {@code true} if the specified {@code PathIterator} contains
     *         the specified rectangular area; {@code false} otherwise.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final boolean contains(Point2D p) {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final boolean contains(double x, double y) {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static boolean contains(PathIterator pi, Point2D p) {

    /**
     * Tests if the specified {@link Point2D} is inside the closed
     * boundary of the specified {@link PathIterator}.
     * <p>
     * This method provides a basic facility for implementors of
     * the {@link Shape} interface to implement support for the
     * {@link Shape#contains(Point2D)} method.
     *
     * @param pi the specified {@code PathIterator}
     * @param p the specified {@code Point2D}
     * @return {@code true} if the specified coordinates are inside the
     *         specified {@code PathIterator}; {@code false} otherwise
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static boolean contains(PathIterator pi, double x, double y) {

    /**
     * Tests if the specified coordinates are inside the closed
     * boundary of the specified {@link PathIterator}.
     * <p>
     * This method provides a basic facility for implementors of
     * the {@link Shape} interface to implement support for the
     * {@link Shape#contains(double, double)} method.
     *
     * @param pi the specified {@code PathIterator}
     * @param x the specified X coordinate
     * @param y the specified Y coordinate
     * @return {@code true} if the specified coordinates are inside the
     *         specified {@code PathIterator}; {@code false} otherwise
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final Rectangle getBounds() {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final synchronized Shape createTransformedShape(AffineTransform at) {

    /**
     * Returns a new {@code Shape} representing a transformed version
     * of this {@code Path2D}.
     * Note that the exact type and coordinate precision of the return
     * value is not specified for this method.
     * The method will return a Shape that contains no less precision
     * for the transformed geometry than this {@code Path2D} currently
     * maintains, but it may contain no more precision either.
     * If the tradeoff of precision vs. storage size in the result is
     * important then the convenience constructors in the
     * {@link Path2D.Float#Path2D.Float(Shape, AffineTransform) Path2D.Float}
     * and
     * {@link Path2D.Double#Path2D.Double(Shape, AffineTransform) Path2D.Double}
     * subclasses should be used to make the choice explicit.
     *
     * @param at the {@code AffineTransform} used to transform a
     *           new {@code Shape}.
     * @return a new {@code Shape}, transformed with the specified
     *         {@code AffineTransform}.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public abstract void transform(AffineTransform at);

    /**
     * Transforms the geometry of this path using the specified
     * {@link AffineTransform}.
     * The geometry is transformed in place, which permanently changes the
     * boundary defined by this object.
     *
     * @param at the {@code AffineTransform} used to transform the area
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final synchronized void reset() {

    /**
     * Resets the path to empty.  The append position is set back to the
     * beginning of the path and all coordinates and point types are
     * forgotten.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final synchronized Point2D getCurrentPoint() {

    /**
     * Returns the coordinates most recently added to the end of the path
     * as a {@link Point2D} object.
     *
     * @return a {@code Point2D} object containing the ending coordinates of
     *         the path or {@code null} if there are no points in the path.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final void setWindingRule(int rule) {

    /**
     * Sets the winding rule for this path to the specified value.
     *
     * @param rule an integer representing the specified
     *             winding rule
     * @exception IllegalArgumentException if
     *          {@code rule} is not either
     *          {@link #WIND_EVEN_ODD} or
     *          {@link #WIND_NON_ZERO}
     * @see #getWindingRule
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final synchronized int getWindingRule() {

    /**
     * Returns the fill style winding rule.
     *
     * @return an integer representing the current winding rule.
     * @see #WIND_EVEN_ODD
     * @see #WIND_NON_ZERO
     * @see #setWindingRule
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public abstract void append(PathIterator pi, boolean connect);

    /**
     * Appends the geometry of the specified
     * {@link PathIterator} object
     * to the path, possibly connecting the new geometry to the existing
     * path segments with a line segment.
     * If the {@code connect} parameter is {@code true} and the
     * path is not empty then any initial {@code moveTo} in the
     * geometry of the appended {@code Shape} is turned into a
     * {@code lineTo} segment.
     * If the destination coordinates of such a connecting {@code lineTo}
     * segment match the ending coordinates of a currently open
     * subpath then the segment is omitted as superfluous.
     * The winding rule of the specified {@code Shape} is ignored
     * and the appended geometry is governed by the winding
     * rule specified for this path.
     *
     * @param pi the {@code PathIterator} whose geometry is appended to
     *           this path
     * @param connect a boolean to control whether or not to turn an initial
     *                {@code moveTo} segment into a {@code lineTo} segment
     *                to connect the new geometry to the existing path
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final void append(Shape s, boolean connect) {

    /**
     * Appends the geometry of the specified {@code Shape} object to the
     * path, possibly connecting the new geometry to the existing path
     * segments with a line segment.
     * If the {@code connect} parameter is {@code true} and the
     * path is not empty then any initial {@code moveTo} in the
     * geometry of the appended {@code Shape}
     * is turned into a {@code lineTo} segment.
     * If the destination coordinates of such a connecting {@code lineTo}
     * segment match the ending coordinates of a currently open
     * subpath then the segment is omitted as superfluous.
     * The winding rule of the specified {@code Shape} is ignored
     * and the appended geometry is governed by the winding
     * rule specified for this path.
     *
     * @param s the {@code Shape} whose geometry is appended
     *          to this path
     * @param connect a boolean to control whether or not to turn an initial
     *                {@code moveTo} segment into a {@code lineTo} segment
     *                to connect the new geometry to the existing path
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public final synchronized void closePath() {

    /**
     * Closes the current subpath by drawing a straight line back to
     * the coordinates of the last {@code moveTo}.  If the path is already
     * closed then this method has no effect.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public abstract void curveTo(double x1, double y1,
                                 double x2, double y2,
                                 double x3, double y3);

    /**
     * Adds a curved segment, defined by three new points, to the path by
     * drawing a B&eacute;zier curve that intersects both the current
     * coordinates and the specified coordinates {@code (x3,y3)},
     * using the specified points {@code (x1,y1)} and {@code (x2,y2)} as
     * B&eacute;zier control points.
     * All coordinates are specified in double precision.
     *
     * @param x1 the X coordinate of the first B&eacute;zier control point
     * @param y1 the Y coordinate of the first B&eacute;zier control point
     * @param x2 the X coordinate of the second B&eacute;zier control point
     * @param y2 the Y coordinate of the second B&eacute;zier control point
     * @param x3 the X coordinate of the final end point
     * @param y3 the Y coordinate of the final end point
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public abstract void quadTo(double x1, double y1,
                                double x2, double y2);

    /**
     * Adds a curved segment, defined by two new points, to the path by
     * drawing a Quadratic curve that intersects both the current
     * coordinates and the specified coordinates {@code (x2,y2)},
     * using the specified point {@code (x1,y1)} as a quadratic
     * parametric control point.
     * All coordinates are specified in double precision.
     *
     * @param x1 the X coordinate of the quadratic control point
     * @param y1 the Y coordinate of the quadratic control point
     * @param x2 the X coordinate of the final end point
     * @param y2 the Y coordinate of the final end point
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public abstract void lineTo(double x, double y);

    /**
     * Adds a point to the path by drawing a straight line from the
     * current coordinates to the new specified coordinates
     * specified in double precision.
     *
     * @param x the specified X coordinate
     * @param y the specified Y coordinate
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public abstract void moveTo(double x, double y);

    /**
     * Adds a point to the path by moving to the specified
     * coordinates specified in double precision.
     *
     * @param x the specified X coordinate
     * @param y the specified Y coordinate
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        private void readObject(java.io.ObjectInputStream s)

        /**
         * Reads the default serializable fields from the
         * {@code ObjectInputStream} followed by an explicit
         * serialization of the path segments stored in this
         * path.
         * <p>
         * There are no default serializable fields as of 1.6.
         * <p>
         * The serial data for this object is described in the
         * writeObject method.
         *
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        private void writeObject(java.io.ObjectOutputStream s)

        /**
         * Writes the default serializable fields to the
         * {@code ObjectOutputStream} followed by an explicit
         * serialization of the path segments stored in this
         * path.
         *
         * @serialData
         * <a name="Path2DSerialData"><!-- --></a>
         * <ol>
         * <li>The default serializable fields.
         * There are no default serializable fields as of 1.6.
         * <li>followed by
         * a byte indicating the storage type of the original object
         * as a hint (SERIAL_STORAGE_DBL_ARRAY)
         * <li>followed by
         * an integer indicating the number of path segments to follow (NP)
         * or -1 to indicate an unknown number of path segments follows
         * <li>followed by
         * an integer indicating the total number of coordinates to follow (NC)
         * or -1 to indicate an unknown number of coordinates follows
         * (NC should always be even since coordinates always appear in pairs
         *  representing an x,y pair)
         * <li>followed by
         * a byte indicating the winding rule
         * ({@link #WIND_EVEN_ODD WIND_EVEN_ODD} or
         *  {@link #WIND_NON_ZERO WIND_NON_ZERO})
         * <li>followed by
         * {@code NP} (or unlimited if {@code NP < 0}) sets of values consisting of
         * a single byte indicating a path segment type
         * followed by one or more pairs of float or double
         * values representing the coordinates of the path segment
         * <li>followed by
         * a byte indicating the end of the path (SERIAL_PATH_END).
         * </ol>
         * <p>
         * The following byte value constants are used in the serialized form
         * of {@code Path2D} objects:
         * <table>
         * <tr>
         * <th>Constant Name</th>
         * <th>Byte Value</th>
         * <th>Followed by</th>
         * <th>Description</th>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_STORAGE_FLT_ARRAY}</td>
         * <td>0x30</td>
         * <td></td>
         * <td>A hint that the original {@code Path2D} object stored
         * the coordinates in a Java array of floats.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_STORAGE_DBL_ARRAY}</td>
         * <td>0x31</td>
         * <td></td>
         * <td>A hint that the original {@code Path2D} object stored
         * the coordinates in a Java array of doubles.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_MOVETO}</td>
         * <td>0x40</td>
         * <td>2 floats</td>
         * <td>A {@link #moveTo moveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_LINETO}</td>
         * <td>0x41</td>
         * <td>2 floats</td>
         * <td>A {@link #lineTo lineTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_QUADTO}</td>
         * <td>0x42</td>
         * <td>4 floats</td>
         * <td>A {@link #quadTo quadTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_CUBICTO}</td>
         * <td>0x43</td>
         * <td>6 floats</td>
         * <td>A {@link #curveTo curveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_MOVETO}</td>
         * <td>0x50</td>
         * <td>2 doubles</td>
         * <td>A {@link #moveTo moveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_LINETO}</td>
         * <td>0x51</td>
         * <td>2 doubles</td>
         * <td>A {@link #lineTo lineTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_QUADTO}</td>
         * <td>0x52</td>
         * <td>4 doubles</td>
         * <td>A {@link #curveTo curveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_CUBICTO}</td>
         * <td>0x53</td>
         * <td>6 doubles</td>
         * <td>A {@link #curveTo curveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_CLOSE}</td>
         * <td>0x60</td>
         * <td></td>
         * <td>A {@link #closePath closePath} path segment.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_PATH_END}</td>
         * <td>0x61</td>
         * <td></td>
         * <td>There are no more path segments following.</td>
         * </table>
         *
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final Object clone() {

        /**
         * Creates a new object of the same class as this object.
         *
         * @return     a clone of this instance.
         * @exception  OutOfMemoryError    if there is not enough memory.
         * @see        java.lang.Cloneable
         * @since      1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final PathIterator getPathIterator(AffineTransform at) {

        /**
         * {@inheritDoc}
         * <p>
         * The iterator for this class is not multi-threaded safe,
         * which means that the {@code Path2D} class does not
         * guarantee that modifications to the geometry of this
         * {@code Path2D} object do not affect any iterations of
         * that geometry that are already in process.
         *
         * @param at an {@code AffineTransform}
         * @return a new {@code PathIterator} that iterates along the boundary
         *         of this {@code Shape} and provides access to the geometry
         *         of this {@code Shape}'s outline
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final void transform(AffineTransform at) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final void append(PathIterator pi, boolean connect) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void curveTo(double x1, double y1,
                                               double x2, double y2,
                                               double x3, double y3)

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void quadTo(double x1, double y1,
                                              double x2, double y2)

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void lineTo(double x, double y) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void moveTo(double x, double y) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Double(Shape s, AffineTransform at) {

        /**
         * Constructs a new double precision {@code Path2D} object
         * from an arbitrary {@link Shape} object, transformed by an
         * {@link AffineTransform} object.
         * All of the initial geometry and the winding rule for this path are
         * taken from the specified {@code Shape} object and transformed
         * by the specified {@code AffineTransform} object.
         *
         * @param s the specified {@code Shape} object
         * @param at the specified {@code AffineTransform} object
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Double(Shape s) {

        /**
         * Constructs a new double precision {@code Path2D} object
         * from an arbitrary {@link Shape} object.
         * All of the initial geometry and the winding rule for this path are
         * taken from the specified {@code Shape} object.
         *
         * @param s the specified {@code Shape} object
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Double(int rule, int initialCapacity) {

        /**
         * Constructs a new empty double precision {@code Path2D} object
         * with the specified winding rule and the specified initial
         * capacity to store path segments.
         * This number is an initial guess as to how many path segments
         * are in the path, but the storage is expanded as needed to store
         * whatever path segments are added to this path.
         *
         * @param rule the winding rule
         * @param initialCapacity the estimate for the number of path segments
         *                        in the path
         * @see #WIND_EVEN_ODD
         * @see #WIND_NON_ZERO
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Double(int rule) {

        /**
         * Constructs a new empty double precision {@code Path2D} object
         * with the specified winding rule to control operations that
         * require the interior of the path to be defined.
         *
         * @param rule the winding rule
         * @see #WIND_EVEN_ODD
         * @see #WIND_NON_ZERO
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Double() {

        /**
         * Constructs a new empty double precision {@code Path2D} object
         * with a default winding rule of {@link #WIND_NON_ZERO}.
         *
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static class Double extends Path2D implements Serializable {

    /**
     * The {@code Double} class defines a geometric path with
     * coordinates stored in double precision floating point.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        private void readObject(java.io.ObjectInputStream s)

        /**
         * Reads the default serializable fields from the
         * {@code ObjectInputStream} followed by an explicit
         * serialization of the path segments stored in this
         * path.
         * <p>
         * There are no default serializable fields as of 1.6.
         * <p>
         * The serial data for this object is described in the
         * writeObject method.
         *
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        private void writeObject(java.io.ObjectOutputStream s)

        /**
         * Writes the default serializable fields to the
         * {@code ObjectOutputStream} followed by an explicit
         * serialization of the path segments stored in this
         * path.
         *
         * @serialData
         * <a name="Path2DSerialData"><!-- --></a>
         * <ol>
         * <li>The default serializable fields.
         * There are no default serializable fields as of 1.6.
         * <li>followed by
         * a byte indicating the storage type of the original object
         * as a hint (SERIAL_STORAGE_FLT_ARRAY)
         * <li>followed by
         * an integer indicating the number of path segments to follow (NP)
         * or -1 to indicate an unknown number of path segments follows
         * <li>followed by
         * an integer indicating the total number of coordinates to follow (NC)
         * or -1 to indicate an unknown number of coordinates follows
         * (NC should always be even since coordinates always appear in pairs
         *  representing an x,y pair)
         * <li>followed by
         * a byte indicating the winding rule
         * ({@link #WIND_EVEN_ODD WIND_EVEN_ODD} or
         *  {@link #WIND_NON_ZERO WIND_NON_ZERO})
         * <li>followed by
         * {@code NP} (or unlimited if {@code NP < 0}) sets of values consisting of
         * a single byte indicating a path segment type
         * followed by one or more pairs of float or double
         * values representing the coordinates of the path segment
         * <li>followed by
         * a byte indicating the end of the path (SERIAL_PATH_END).
         * </ol>
         * <p>
         * The following byte value constants are used in the serialized form
         * of {@code Path2D} objects:
         * <table>
         * <tr>
         * <th>Constant Name</th>
         * <th>Byte Value</th>
         * <th>Followed by</th>
         * <th>Description</th>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_STORAGE_FLT_ARRAY}</td>
         * <td>0x30</td>
         * <td></td>
         * <td>A hint that the original {@code Path2D} object stored
         * the coordinates in a Java array of floats.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_STORAGE_DBL_ARRAY}</td>
         * <td>0x31</td>
         * <td></td>
         * <td>A hint that the original {@code Path2D} object stored
         * the coordinates in a Java array of doubles.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_MOVETO}</td>
         * <td>0x40</td>
         * <td>2 floats</td>
         * <td>A {@link #moveTo moveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_LINETO}</td>
         * <td>0x41</td>
         * <td>2 floats</td>
         * <td>A {@link #lineTo lineTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_QUADTO}</td>
         * <td>0x42</td>
         * <td>4 floats</td>
         * <td>A {@link #quadTo quadTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_FLT_CUBICTO}</td>
         * <td>0x43</td>
         * <td>6 floats</td>
         * <td>A {@link #curveTo curveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_MOVETO}</td>
         * <td>0x50</td>
         * <td>2 doubles</td>
         * <td>A {@link #moveTo moveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_LINETO}</td>
         * <td>0x51</td>
         * <td>2 doubles</td>
         * <td>A {@link #lineTo lineTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_QUADTO}</td>
         * <td>0x52</td>
         * <td>4 doubles</td>
         * <td>A {@link #curveTo curveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_DBL_CUBICTO}</td>
         * <td>0x53</td>
         * <td>6 doubles</td>
         * <td>A {@link #curveTo curveTo} path segment follows.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_SEG_CLOSE}</td>
         * <td>0x60</td>
         * <td></td>
         * <td>A {@link #closePath closePath} path segment.</td>
         * </tr>
         * <tr>
         * <td>{@code SERIAL_PATH_END}</td>
         * <td>0x61</td>
         * <td></td>
         * <td>There are no more path segments following.</td>
         * </table>
         *
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final Object clone() {

        /**
         * Creates a new object of the same class as this object.
         *
         * @return     a clone of this instance.
         * @exception  OutOfMemoryError    if there is not enough memory.
         * @see        java.lang.Cloneable
         * @since      1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final PathIterator getPathIterator(AffineTransform at) {

        /**
         * {@inheritDoc}
         * <p>
         * The iterator for this class is not multi-threaded safe,
         * which means that the {@code Path2D} class does not
         * guarantee that modifications to the geometry of this
         * {@code Path2D} object do not affect any iterations of
         * that geometry that are already in process.
         *
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final void transform(AffineTransform at) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final void append(PathIterator pi, boolean connect) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void curveTo(float x1, float y1,
                                               float x2, float y2,
                                               float x3, float y3)

        /**
         * Adds a curved segment, defined by three new points, to the path by
         * drawing a B&eacute;zier curve that intersects both the current
         * coordinates and the specified coordinates {@code (x3,y3)},
         * using the specified points {@code (x1,y1)} and {@code (x2,y2)} as
         * B&eacute;zier control points.
         * All coordinates are specified in float precision.
         * <p>
         * This method provides a single precision variant of
         * the double precision {@code curveTo()} method on the
         * base {@code Path2D} class.
         *
         * @param x1 the X coordinate of the first B&eacute;zier control point
         * @param y1 the Y coordinate of the first B&eacute;zier control point
         * @param x2 the X coordinate of the second B&eacute;zier control point
         * @param y2 the Y coordinate of the second B&eacute;zier control point
         * @param x3 the X coordinate of the final end point
         * @param y3 the Y coordinate of the final end point
         * @see Path2D#curveTo
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void curveTo(double x1, double y1,
                                               double x2, double y2,
                                               double x3, double y3)

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void quadTo(float x1, float y1,
                                              float x2, float y2)

        /**
         * Adds a curved segment, defined by two new points, to the path by
         * drawing a Quadratic curve that intersects both the current
         * coordinates and the specified coordinates {@code (x2,y2)},
         * using the specified point {@code (x1,y1)} as a quadratic
         * parametric control point.
         * All coordinates are specified in float precision.
         * <p>
         * This method provides a single precision variant of
         * the double precision {@code quadTo()} method on the
         * base {@code Path2D} class.
         *
         * @param x1 the X coordinate of the quadratic control point
         * @param y1 the Y coordinate of the quadratic control point
         * @param x2 the X coordinate of the final end point
         * @param y2 the Y coordinate of the final end point
         * @see Path2D#quadTo
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void quadTo(double x1, double y1,
                                              double x2, double y2)

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void lineTo(float x, float y) {

        /**
         * Adds a point to the path by drawing a straight line from the
         * current coordinates to the new specified coordinates
         * specified in float precision.
         * <p>
         * This method provides a single precision variant of
         * the double precision {@code lineTo()} method on the
         * base {@code Path2D} class.
         *
         * @param x the specified X coordinate
         * @param y the specified Y coordinate
         * @see Path2D#lineTo
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void lineTo(double x, double y) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void moveTo(float x, float y) {

        /**
         * Adds a point to the path by moving to the specified
         * coordinates specified in float precision.
         * <p>
         * This method provides a single precision variant of
         * the double precision {@code moveTo()} method on the
         * base {@code Path2D} class.
         *
         * @param x the specified X coordinate
         * @param y the specified Y coordinate
         * @see Path2D#moveTo
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public final synchronized void moveTo(double x, double y) {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Float(Shape s, AffineTransform at) {

        /**
         * Constructs a new single precision {@code Path2D} object
         * from an arbitrary {@link Shape} object, transformed by an
         * {@link AffineTransform} object.
         * All of the initial geometry and the winding rule for this path are
         * taken from the specified {@code Shape} object and transformed
         * by the specified {@code AffineTransform} object.
         *
         * @param s the specified {@code Shape} object
         * @param at the specified {@code AffineTransform} object
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Float(Shape s) {

        /**
         * Constructs a new single precision {@code Path2D} object
         * from an arbitrary {@link Shape} object.
         * All of the initial geometry and the winding rule for this path are
         * taken from the specified {@code Shape} object.
         *
         * @param s the specified {@code Shape} object
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Float(int rule, int initialCapacity) {

        /**
         * Constructs a new empty single precision {@code Path2D} object
         * with the specified winding rule and the specified initial
         * capacity to store path segments.
         * This number is an initial guess as to how many path segments
         * will be added to the path, but the storage is expanded as
         * needed to store whatever path segments are added.
         *
         * @param rule the winding rule
         * @param initialCapacity the estimate for the number of path segments
         *                        in the path
         * @see #WIND_EVEN_ODD
         * @see #WIND_NON_ZERO
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Float(int rule) {

        /**
         * Constructs a new empty single precision {@code Path2D} object
         * with the specified winding rule to control operations that
         * require the interior of the path to be defined.
         *
         * @param rule the winding rule
         * @see #WIND_EVEN_ODD
         * @see #WIND_NON_ZERO
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
        public Float() {

        /**
         * Constructs a new empty single precision {@code Path2D} object
         * with a default winding rule of {@link #WIND_NON_ZERO}.
         *
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static class Float extends Path2D implements Serializable {

    /**
     * The {@code Float} class defines a geometric path with
     * coordinates stored in single precision floating point.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    /* private protected */

    /**
     * Constructs a new {@code Path2D} object from the given
     * specified initial values.
     * This method is only intended for internal use and should
     * not be made public if the other constructors for this class
     * are ever exposed.
     *
     * @param rule the winding rule
     * @param initialTypes the size to make the initial array to
     *                     store the path segment types
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    /* private protected */

    /**
     * Constructs a new empty {@code Path2D} object.
     * It is assumed that the package sibling subclass that is
     * defaulting to this constructor will fill in all values.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
    public static final int WIND_NON_ZERO = PathIterator.WIND_NON_ZERO;

    /**
     * A non-zero winding rule for determining the interior of a
     * path.
     *
     * @see PathIterator#WIND_NON_ZERO
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Path2D.java
public abstract class Path2D implements Shape, Cloneable {

/**
 * The {@code Path2D} class provides a simple, yet flexible
 * shape which represents an arbitrary geometric path.
 * It can fully represent any path which can be iterated by the
 * {@link PathIterator} interface including all of its segment
 * types and winding rules and it implements all of the
 * basic hit testing methods of the {@link Shape} interface.
 * <p>
 * Use {@link Path2D.Float} when dealing with data that can be represented
 * and used with floating point precision.  Use {@link Path2D.Double}
 * for data that requires the accuracy or range of double precision.
 * <p>
 * {@code Path2D} provides exactly those facilities required for
 * basic construction and management of a geometric path and
 * implementation of the above interfaces with little added
 * interpretation.
 * If it is useful to manipulate the interiors of closed
 * geometric shapes beyond simple hit testing then the
 * {@link Area} class provides additional capabilities
 * specifically targeted at closed figures.
 * While both classes nominally implement the {@code Shape}
 * interface, they differ in purpose and together they provide
 * two useful views of a geometric shape where {@code Path2D}
 * deals primarily with a trajectory formed by path segments
 * and {@code Area} deals more with interpretation and manipulation
 * of enclosed regions of 2D geometric space.
 * <p>
 * The {@link PathIterator} interface has more detailed descriptions
 * of the types of segments that make up a path and the winding rules
 * that control how to determine which regions are inside or outside
 * the path.
 *
 * @author Jim Graham
 * @since 1.6
 */
