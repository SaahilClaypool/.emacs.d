_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public Object clone() {

    /**
     * Creates a new object of the same class and with the same
     * contents as this object.
     * @return     a clone of this instance.
     * @exception  OutOfMemoryError            if there is not enough memory.
     * @see        java.lang.Cloneable
     * @since      1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public PathIterator getPathIterator(AffineTransform at, double flatness) {

    /**
     * Returns an iterator object that iterates along the
     * <code>Shape</code> object's boundary and provides access to a
     * flattened view of the outline of the <code>Shape</code>
     * object's geometry.
     * <p>
     * Only SEG_MOVETO, SEG_LINETO, and SEG_CLOSE point types will
     * be returned by the iterator.
     * <p>
     * The amount of subdivision of the curved segments is controlled
     * by the <code>flatness</code> parameter, which specifies the
     * maximum distance that any point on the unflattened transformed
     * curve can deviate from the returned flattened path segments.
     * An optional {@link AffineTransform} can
     * be specified so that the coordinates returned in the iteration are
     * transformed accordingly.
     * @param at an optional <code>AffineTransform</code> to be applied to the
     *          coordinates as they are returned in the iteration,
     *          or <code>null</code> if untransformed coordinates are desired.
     * @param flatness the maximum distance that the line segments used to
     *          approximate the curved segments are allowed to deviate
     *          from any point on the original curve
     * @return a <code>PathIterator</code> object that provides access to
     *          the <code>Shape</code> object's flattened geometry.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public Rectangle getBounds() {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public boolean contains(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public boolean intersects(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public boolean contains(Point2D p) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public void setFrameFromCenter(Point2D center, Point2D corner) {

    /**
     * Sets the framing rectangle of this <code>Shape</code> based on a
     * specified center <code>Point2D</code> and corner
     * <code>Point2D</code>.  The framing rectangle is used by the subclasses
     * of <code>RectangularShape</code> to define their geometry.
     * @param center the specified center <code>Point2D</code>
     * @param corner the specified corner <code>Point2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public void setFrameFromCenter(double centerX, double centerY,
                                   double cornerX, double cornerY) {

    /**
     * Sets the framing rectangle of this <code>Shape</code>
     * based on the specified center point coordinates and corner point
     * coordinates.  The framing rectangle is used by the subclasses of
     * <code>RectangularShape</code> to define their geometry.
     *
     * @param centerX the X coordinate of the specified center point
     * @param centerY the Y coordinate of the specified center point
     * @param cornerX the X coordinate of the specified corner point
     * @param cornerY the Y coordinate of the specified corner point
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public void setFrameFromDiagonal(Point2D p1, Point2D p2) {

    /**
     * Sets the diagonal of the framing rectangle of this <code>Shape</code>
     * based on two specified <code>Point2D</code> objects.  The framing
     * rectangle is used by the subclasses of <code>RectangularShape</code>
     * to define their geometry.
     *
     * @param p1 the start <code>Point2D</code> of the specified diagonal
     * @param p2 the end <code>Point2D</code> of the specified diagonal
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public void setFrameFromDiagonal(double x1, double y1,
                                     double x2, double y2) {

    /**
     * Sets the diagonal of the framing rectangle of this <code>Shape</code>
     * based on the two specified coordinates.  The framing rectangle is
     * used by the subclasses of <code>RectangularShape</code> to define
     * their geometry.
     *
     * @param x1 the X coordinate of the start point of the specified diagonal
     * @param y1 the Y coordinate of the start point of the specified diagonal
     * @param x2 the X coordinate of the end point of the specified diagonal
     * @param y2 the Y coordinate of the end point of the specified diagonal
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public void setFrame(Rectangle2D r) {

    /**
     * Sets the framing rectangle of this <code>Shape</code> to
     * be the specified <code>Rectangle2D</code>.  The framing rectangle is
     * used by the subclasses of <code>RectangularShape</code> to define
     * their geometry.
     * @param r the specified <code>Rectangle2D</code>
     * @see #getFrame
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public void setFrame(Point2D loc, Dimension2D size) {

    /**
     * Sets the location and size of the framing rectangle of this
     * <code>Shape</code> to the specified {@link Point2D} and
     * {@link Dimension2D}, respectively.  The framing rectangle is used
     * by the subclasses of <code>RectangularShape</code> to define
     * their geometry.
     * @param loc the specified <code>Point2D</code>
     * @param size the specified <code>Dimension2D</code>
     * @see #getFrame
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public abstract void setFrame(double x, double y, double w, double h);

    /**
     * Sets the location and size of the framing rectangle of this
     * <code>Shape</code> to the specified rectangular values.
     *
     * @param x the X coordinate of the upper-left corner of the
     *          specified rectangular shape
     * @param y the Y coordinate of the upper-left corner of the
     *          specified rectangular shape
     * @param w the width of the specified rectangular shape
     * @param h the height of the specified rectangular shape
     * @see #getFrame
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public abstract boolean isEmpty();

    /**
     * Determines whether the <code>RectangularShape</code> is empty.
     * When the <code>RectangularShape</code> is empty, it encloses no
     * area.
     * @return <code>true</code> if the <code>RectangularShape</code> is empty;
     *          <code>false</code> otherwise.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    @Transient

    /**
     * Returns the framing {@link Rectangle2D}
     * that defines the overall shape of this object.
     * @return a <code>Rectangle2D</code>, specified in
     * <code>double</code> coordinates.
     * @see #setFrame(double, double, double, double)
     * @see #setFrame(Point2D, Dimension2D)
     * @see #setFrame(Rectangle2D)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public double getCenterY() {

    /**
     * Returns the Y coordinate of the center of the framing
     * rectangle of the <code>Shape</code> in <code>double</code>
     * precision.
     * @return the Y coordinate of the center of the framing rectangle
     *          of the <code>Shape</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public double getCenterX() {

    /**
     * Returns the X coordinate of the center of the framing
     * rectangle of the <code>Shape</code> in <code>double</code>
     * precision.
     * @return the X coordinate of the center of the framing rectangle
     *          of the <code>Shape</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public double getMaxY() {

    /**
     * Returns the largest Y coordinate of the framing
     * rectangle of the <code>Shape</code> in <code>double</code>
     * precision.
     * @return the largest Y coordinate of the framing
     *          rectangle of the <code>Shape</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public double getMaxX() {

    /**
     * Returns the largest X coordinate of the framing
     * rectangle of the <code>Shape</code> in <code>double</code>
     * precision.
     * @return the largest X coordinate of the framing
     *          rectangle of the <code>Shape</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public double getMinY() {

    /**
     * Returns the smallest Y coordinate of the framing
     * rectangle of the <code>Shape</code> in <code>double</code>
     * precision.
     * @return the smallest Y coordinate of the framing
     *          rectangle of the <code>Shape</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public double getMinX() {

    /**
     * Returns the smallest X coordinate of the framing
     * rectangle of the <code>Shape</code> in <code>double</code>
     * precision.
     * @return the smallest X coordinate of the framing
     *          rectangle of the <code>Shape</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public abstract double getHeight();

    /**
     * Returns the height of the framing rectangle
     * in <code>double</code> precision.
     * @return the height of the framing rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public abstract double getWidth();

    /**
     * Returns the width of the framing rectangle in
     * <code>double</code> precision.
     * @return the width of the framing rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public abstract double getY();

    /**
     * Returns the Y coordinate of the upper-left corner of
     * the framing rectangle in <code>double</code> precision.
     * @return the Y coordinate of the upper-left corner of
     * the framing rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public abstract double getX();

    /**
     * Returns the X coordinate of the upper-left corner of
     * the framing rectangle in <code>double</code> precision.
     * @return the X coordinate of the upper-left corner of
     * the framing rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    protected RectangularShape() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     *
     * @see Arc2D
     * @see Ellipse2D
     * @see Rectangle2D
     * @see RoundRectangle2D
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
public abstract class RectangularShape implements Shape, Cloneable {

/**
 * <code>RectangularShape</code> is the base class for a number of
 * {@link Shape} objects whose geometry is defined by a rectangular frame.
 * This class does not directly specify any specific geometry by
 * itself, but merely provides manipulation methods inherited by
 * a whole category of <code>Shape</code> objects.
 * The manipulation methods provided by this class can be used to
 * query and modify the rectangular frame, which provides a reference
 * for the subclasses to define their geometry.
 *
 * @author      Jim Graham
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public Object clone() {

    /**
     * Creates a new object of the same class and with the same
     * contents as this object.
     * @return     a clone of this instance.
     * @exception  OutOfMemoryError            if there is not enough memory.
     * @see        java.lang.Cloneable
     * @since      1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public PathIterator getPathIterator(AffineTransform at, double flatness) {

    /**
     * Returns an iterator object that iterates along the
     * <code>Shape</code> object's boundary and provides access to a
     * flattened view of the outline of the <code>Shape</code>
     * object's geometry.
     * <p>
     * Only SEG_MOVETO, SEG_LINETO, and SEG_CLOSE point types will
     * be returned by the iterator.
     * <p>
     * The amount of subdivision of the curved segments is controlled
     * by the <code>flatness</code> parameter, which specifies the
     * maximum distance that any point on the unflattened transformed
     * curve can deviate from the returned flattened path segments.
     * An optional {@link AffineTransform} can
     * be specified so that the coordinates returned in the iteration are
     * transformed accordingly.
     * @param at an optional <code>AffineTransform</code> to be applied to the
     *          coordinates as they are returned in the iteration,
     *          or <code>null</code> if untransformed coordinates are desired.
     * @param flatness the maximum distance that the line segments used to
     *          approximate the curved segments are allowed to deviate
     *          from any point on the original curve
     * @return a <code>PathIterator</code> object that provides access to
     *          the <code>Shape</code> object's flattened geometry.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public Rectangle getBounds() {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public boolean contains(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public boolean intersects(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public boolean contains(Point2D p) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public void setFrameFromCenter(Point2D center, Point2D corner) {

    /**
     * Sets the framing rectangle of this <code>Shape</code> based on a
     * specified center <code>Point2D</code> and corner
     * <code>Point2D</code>.  The framing rectangle is used by the subclasses
     * of <code>RectangularShape</code> to define their geometry.
     * @param center the specified center <code>Point2D</code>
     * @param corner the specified corner <code>Point2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public void setFrameFromCenter(double centerX, double centerY,
                                   double cornerX, double cornerY) {

    /**
     * Sets the framing rectangle of this <code>Shape</code>
     * based on the specified center point coordinates and corner point
     * coordinates.  The framing rectangle is used by the subclasses of
     * <code>RectangularShape</code> to define their geometry.
     *
     * @param centerX the X coordinate of the specified center point
     * @param centerY the Y coordinate of the specified center point
     * @param cornerX the X coordinate of the specified corner point
     * @param cornerY the Y coordinate of the specified corner point
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public void setFrameFromDiagonal(Point2D p1, Point2D p2) {

    /**
     * Sets the diagonal of the framing rectangle of this <code>Shape</code>
     * based on two specified <code>Point2D</code> objects.  The framing
     * rectangle is used by the subclasses of <code>RectangularShape</code>
     * to define their geometry.
     *
     * @param p1 the start <code>Point2D</code> of the specified diagonal
     * @param p2 the end <code>Point2D</code> of the specified diagonal
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public void setFrameFromDiagonal(double x1, double y1,
                                     double x2, double y2) {

    /**
     * Sets the diagonal of the framing rectangle of this <code>Shape</code>
     * based on the two specified coordinates.  The framing rectangle is
     * used by the subclasses of <code>RectangularShape</code> to define
     * their geometry.
     *
     * @param x1 the X coordinate of the start point of the specified diagonal
     * @param y1 the Y coordinate of the start point of the specified diagonal
     * @param x2 the X coordinate of the end point of the specified diagonal
     * @param y2 the Y coordinate of the end point of the specified diagonal
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public void setFrame(Rectangle2D r) {

    /**
     * Sets the framing rectangle of this <code>Shape</code> to
     * be the specified <code>Rectangle2D</code>.  The framing rectangle is
     * used by the subclasses of <code>RectangularShape</code> to define
     * their geometry.
     * @param r the specified <code>Rectangle2D</code>
     * @see #getFrame
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public void setFrame(Point2D loc, Dimension2D size) {

    /**
     * Sets the location and size of the framing rectangle of this
     * <code>Shape</code> to the specified {@link Point2D} and
     * {@link Dimension2D}, respectively.  The framing rectangle is used
     * by the subclasses of <code>RectangularShape</code> to define
     * their geometry.
     * @param loc the specified <code>Point2D</code>
     * @param size the specified <code>Dimension2D</code>
     * @see #getFrame
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public abstract void setFrame(double x, double y, double w, double h);

    /**
     * Sets the location and size of the framing rectangle of this
     * <code>Shape</code> to the specified rectangular values.
     *
     * @param x the X coordinate of the upper-left corner of the
     *          specified rectangular shape
     * @param y the Y coordinate of the upper-left corner of the
     *          specified rectangular shape
     * @param w the width of the specified rectangular shape
     * @param h the height of the specified rectangular shape
     * @see #getFrame
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public abstract boolean isEmpty();

    /**
     * Determines whether the <code>RectangularShape</code> is empty.
     * When the <code>RectangularShape</code> is empty, it encloses no
     * area.
     * @return <code>true</code> if the <code>RectangularShape</code> is empty;
     *          <code>false</code> otherwise.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    @Transient

    /**
     * Returns the framing {@link Rectangle2D}
     * that defines the overall shape of this object.
     * @return a <code>Rectangle2D</code>, specified in
     * <code>double</code> coordinates.
     * @see #setFrame(double, double, double, double)
     * @see #setFrame(Point2D, Dimension2D)
     * @see #setFrame(Rectangle2D)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public double getCenterY() {

    /**
     * Returns the Y coordinate of the center of the framing
     * rectangle of the <code>Shape</code> in <code>double</code>
     * precision.
     * @return the Y coordinate of the center of the framing rectangle
     *          of the <code>Shape</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public double getCenterX() {

    /**
     * Returns the X coordinate of the center of the framing
     * rectangle of the <code>Shape</code> in <code>double</code>
     * precision.
     * @return the X coordinate of the center of the framing rectangle
     *          of the <code>Shape</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public double getMaxY() {

    /**
     * Returns the largest Y coordinate of the framing
     * rectangle of the <code>Shape</code> in <code>double</code>
     * precision.
     * @return the largest Y coordinate of the framing
     *          rectangle of the <code>Shape</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public double getMaxX() {

    /**
     * Returns the largest X coordinate of the framing
     * rectangle of the <code>Shape</code> in <code>double</code>
     * precision.
     * @return the largest X coordinate of the framing
     *          rectangle of the <code>Shape</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public double getMinY() {

    /**
     * Returns the smallest Y coordinate of the framing
     * rectangle of the <code>Shape</code> in <code>double</code>
     * precision.
     * @return the smallest Y coordinate of the framing
     *          rectangle of the <code>Shape</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public double getMinX() {

    /**
     * Returns the smallest X coordinate of the framing
     * rectangle of the <code>Shape</code> in <code>double</code>
     * precision.
     * @return the smallest X coordinate of the framing
     *          rectangle of the <code>Shape</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public abstract double getHeight();

    /**
     * Returns the height of the framing rectangle
     * in <code>double</code> precision.
     * @return the height of the framing rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public abstract double getWidth();

    /**
     * Returns the width of the framing rectangle in
     * <code>double</code> precision.
     * @return the width of the framing rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public abstract double getY();

    /**
     * Returns the Y coordinate of the upper-left corner of
     * the framing rectangle in <code>double</code> precision.
     * @return the Y coordinate of the upper-left corner of
     * the framing rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    public abstract double getX();

    /**
     * Returns the X coordinate of the upper-left corner of
     * the framing rectangle in <code>double</code> precision.
     * @return the X coordinate of the upper-left corner of
     * the framing rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
    protected RectangularShape() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     *
     * @see Arc2D
     * @see Ellipse2D
     * @see Rectangle2D
     * @see RoundRectangle2D
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RectangularShape.java
public abstract class RectangularShape implements Shape, Cloneable {

/**
 * <code>RectangularShape</code> is the base class for a number of
 * {@link Shape} objects whose geometry is defined by a rectangular frame.
 * This class does not directly specify any specific geometry by
 * itself, but merely provides manipulation methods inherited by
 * a whole category of <code>Shape</code> objects.
 * The manipulation methods provided by this class can be used to
 * query and modify the rectangular frame, which provides a reference
 * for the subclasses to define their geometry.
 *
 * @author      Jim Graham
 * @since 1.2
 */
