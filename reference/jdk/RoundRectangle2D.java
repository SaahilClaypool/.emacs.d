_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public boolean equals(Object obj) {

    /**
     * Determines whether or not the specified <code>Object</code> is
     * equal to this <code>RoundRectangle2D</code>.  The specified
     * <code>Object</code> is equal to this <code>RoundRectangle2D</code>
     * if it is an instance of <code>RoundRectangle2D</code> and if its
     * location, size, and corner arc dimensions are the same as this
     * <code>RoundRectangle2D</code>.
     * @param obj  an <code>Object</code> to be compared with this
     *             <code>RoundRectangle2D</code>.
     * @return  <code>true</code> if <code>obj</code> is an instance
     *          of <code>RoundRectangle2D</code> and has the same values;
     *          <code>false</code> otherwise.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public int hashCode() {

    /**
     * Returns the hashcode for this <code>RoundRectangle2D</code>.
     * @return the hashcode for this <code>RoundRectangle2D</code>.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public PathIterator getPathIterator(AffineTransform at) {

    /**
     * Returns an iteration object that defines the boundary of this
     * <code>RoundRectangle2D</code>.
     * The iterator for this class is multi-threaded safe, which means
     * that this <code>RoundRectangle2D</code> class guarantees that
     * modifications to the geometry of this <code>RoundRectangle2D</code>
     * object do not affect any iterations of that geometry that
     * are already in process.
     * @param at an optional <code>AffineTransform</code> to be applied to
     * the coordinates as they are returned in the iteration, or
     * <code>null</code> if untransformed coordinates are desired
     * @return    the <code>PathIterator</code> object that returns the
     *          geometry of the outline of this
     *          <code>RoundRectangle2D</code>, one segment at a time.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public boolean contains(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public boolean intersects(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public boolean contains(double x, double y) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public void setFrame(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public void setRoundRect(RoundRectangle2D rr) {

    /**
     * Sets this <code>RoundRectangle2D</code> to be the same as the
     * specified <code>RoundRectangle2D</code>.
     * @param rr the specified <code>RoundRectangle2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public abstract void setRoundRect(double x, double y, double w, double h,
                                      double arcWidth, double arcHeight);

    /**
     * Sets the location, size, and corner radii of this
     * <code>RoundRectangle2D</code> to the specified
     * <code>double</code> values.
     *
     * @param x the X coordinate to which to set the
     *          location of this <code>RoundRectangle2D</code>
     * @param y the Y coordinate to which to set the
     *          location of this <code>RoundRectangle2D</code>
     * @param w the width to which to set this
     *          <code>RoundRectangle2D</code>
     * @param h the height to which to set this
     *          <code>RoundRectangle2D</code>
     * @param arcWidth the width to which to set the arc of this
     *                 <code>RoundRectangle2D</code>
     * @param arcHeight the height to which to set the arc of this
     *                  <code>RoundRectangle2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public abstract double getArcHeight();

    /**
     * Gets the height of the arc that rounds off the corners.
     * @return the height of the arc that rounds off the corners
     * of this <code>RoundRectangle2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public abstract double getArcWidth();

    /**
     * Gets the width of the arc that rounds off the corners.
     * @return the width of the arc that rounds off the corners
     * of this <code>RoundRectangle2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    protected RoundRectangle2D() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessor
     * methods below.
     *
     * @see java.awt.geom.RoundRectangle2D.Float
     * @see java.awt.geom.RoundRectangle2D.Double
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public void setRoundRect(RoundRectangle2D rr) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public void setRoundRect(double x, double y, double w, double h,
                                 double arcw, double arch)

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public boolean isEmpty() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getArcHeight() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getArcWidth() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getHeight() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getWidth() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public Double(double x, double y, double w, double h,
                      double arcw, double arch)

        /**
         * Constructs and initializes a <code>RoundRectangle2D</code>
         * from the specified <code>double</code> coordinates.
         *
         * @param x the X coordinate of the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param y the Y coordinate of the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param w the width to which to set the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param h the height to which to set the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param arcw the width of the arc to use to round off the
         *             corners of the newly constructed
         *             <code>RoundRectangle2D</code>
         * @param arch the height of the arc to use to round off the
         *             corners of the newly constructed
         *             <code>RoundRectangle2D</code>
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public Double() {

        /**
         * Constructs a new <code>RoundRectangle2D</code>, initialized to
         * location (0.0,&nbsp;0.0), size (0.0,&nbsp;0.0), and corner arcs
         * of radius 0.0.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double archeight;

        /**
         * The height of the arc that rounds off the corners.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double arcwidth;

        /**
         * The width of the arc that rounds off the corners.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double height;

        /**
         * The height of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double width;

        /**
         * The width of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double y;

        /**
         * The Y coordinate of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double x;

        /**
         * The X coordinate of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public static class Double extends RoundRectangle2D

    /**
     * The <code>Double</code> class defines a rectangle with rounded
     * corners all specified in <code>double</code> coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public void setRoundRect(RoundRectangle2D rr) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public void setRoundRect(double x, double y, double w, double h,
                                 double arcw, double arch)

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public void setRoundRect(float x, float y, float w, float h,
                                 float arcw, float arch)

        /**
         * Sets the location, size, and corner radii of this
         * <code>RoundRectangle2D</code> to the specified
         * <code>float</code> values.
         *
         * @param x the X coordinate to which to set the
         *          location of this <code>RoundRectangle2D</code>
         * @param y the Y coordinate to which to set the
         *          location of this <code>RoundRectangle2D</code>
         * @param w the width to which to set this
         *          <code>RoundRectangle2D</code>
         * @param h the height to which to set this
         *          <code>RoundRectangle2D</code>
         * @param arcw the width to which to set the arc of this
         *             <code>RoundRectangle2D</code>
         * @param arch the height to which to set the arc of this
         *             <code>RoundRectangle2D</code>
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public boolean isEmpty() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getArcHeight() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getArcWidth() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getHeight() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getWidth() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public Float(float x, float y, float w, float h,
                     float arcw, float arch)

        /**
         * Constructs and initializes a <code>RoundRectangle2D</code>
         * from the specified <code>float</code> coordinates.
         *
         * @param x the X coordinate of the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param y the Y coordinate of the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param w the width to which to set the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param h the height to which to set the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param arcw the width of the arc to use to round off the
         *             corners of the newly constructed
         *             <code>RoundRectangle2D</code>
         * @param arch the height of the arc to use to round off the
         *             corners of the newly constructed
         *             <code>RoundRectangle2D</code>
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public Float() {

        /**
         * Constructs a new <code>RoundRectangle2D</code>, initialized to
         * location (0.0,&nbsp;0.0), size (0.0,&nbsp;0.0), and corner arcs
         * of radius 0.0.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public float archeight;

        /**
         * The height of the arc that rounds off the corners.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public float arcwidth;

        /**
         * The width of the arc that rounds off the corners.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public float height;

        /**
         * The height of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public float width;

        /**
         * The width of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public float y;

        /**
         * The Y coordinate of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public float x;

        /**
         * The X coordinate of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public static class Float extends RoundRectangle2D

    /**
     * The <code>Float</code> class defines a rectangle with rounded
     * corners all specified in <code>float</code> coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
public abstract class RoundRectangle2D extends RectangularShape {

/**
 * The <code>RoundRectangle2D</code> class defines a rectangle with
 * rounded corners defined by a location {@code (x,y)}, a
 * dimension {@code (w x h)}, and the width and height of an arc
 * with which to round the corners.
 * <p>
 * This class is the abstract superclass for all objects that
 * store a 2D rounded rectangle.
 * The actual storage representation of the coordinates is left to
 * the subclass.
 *
 * @author      Jim Graham
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public boolean equals(Object obj) {

    /**
     * Determines whether or not the specified <code>Object</code> is
     * equal to this <code>RoundRectangle2D</code>.  The specified
     * <code>Object</code> is equal to this <code>RoundRectangle2D</code>
     * if it is an instance of <code>RoundRectangle2D</code> and if its
     * location, size, and corner arc dimensions are the same as this
     * <code>RoundRectangle2D</code>.
     * @param obj  an <code>Object</code> to be compared with this
     *             <code>RoundRectangle2D</code>.
     * @return  <code>true</code> if <code>obj</code> is an instance
     *          of <code>RoundRectangle2D</code> and has the same values;
     *          <code>false</code> otherwise.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public int hashCode() {

    /**
     * Returns the hashcode for this <code>RoundRectangle2D</code>.
     * @return the hashcode for this <code>RoundRectangle2D</code>.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public PathIterator getPathIterator(AffineTransform at) {

    /**
     * Returns an iteration object that defines the boundary of this
     * <code>RoundRectangle2D</code>.
     * The iterator for this class is multi-threaded safe, which means
     * that this <code>RoundRectangle2D</code> class guarantees that
     * modifications to the geometry of this <code>RoundRectangle2D</code>
     * object do not affect any iterations of that geometry that
     * are already in process.
     * @param at an optional <code>AffineTransform</code> to be applied to
     * the coordinates as they are returned in the iteration, or
     * <code>null</code> if untransformed coordinates are desired
     * @return    the <code>PathIterator</code> object that returns the
     *          geometry of the outline of this
     *          <code>RoundRectangle2D</code>, one segment at a time.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public boolean contains(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public boolean intersects(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public boolean contains(double x, double y) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public void setFrame(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public void setRoundRect(RoundRectangle2D rr) {

    /**
     * Sets this <code>RoundRectangle2D</code> to be the same as the
     * specified <code>RoundRectangle2D</code>.
     * @param rr the specified <code>RoundRectangle2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public abstract void setRoundRect(double x, double y, double w, double h,
                                      double arcWidth, double arcHeight);

    /**
     * Sets the location, size, and corner radii of this
     * <code>RoundRectangle2D</code> to the specified
     * <code>double</code> values.
     *
     * @param x the X coordinate to which to set the
     *          location of this <code>RoundRectangle2D</code>
     * @param y the Y coordinate to which to set the
     *          location of this <code>RoundRectangle2D</code>
     * @param w the width to which to set this
     *          <code>RoundRectangle2D</code>
     * @param h the height to which to set this
     *          <code>RoundRectangle2D</code>
     * @param arcWidth the width to which to set the arc of this
     *                 <code>RoundRectangle2D</code>
     * @param arcHeight the height to which to set the arc of this
     *                  <code>RoundRectangle2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public abstract double getArcHeight();

    /**
     * Gets the height of the arc that rounds off the corners.
     * @return the height of the arc that rounds off the corners
     * of this <code>RoundRectangle2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public abstract double getArcWidth();

    /**
     * Gets the width of the arc that rounds off the corners.
     * @return the width of the arc that rounds off the corners
     * of this <code>RoundRectangle2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    protected RoundRectangle2D() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessor
     * methods below.
     *
     * @see java.awt.geom.RoundRectangle2D.Float
     * @see java.awt.geom.RoundRectangle2D.Double
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public void setRoundRect(RoundRectangle2D rr) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public void setRoundRect(double x, double y, double w, double h,
                                 double arcw, double arch)

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public boolean isEmpty() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getArcHeight() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getArcWidth() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getHeight() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getWidth() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public Double(double x, double y, double w, double h,
                      double arcw, double arch)

        /**
         * Constructs and initializes a <code>RoundRectangle2D</code>
         * from the specified <code>double</code> coordinates.
         *
         * @param x the X coordinate of the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param y the Y coordinate of the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param w the width to which to set the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param h the height to which to set the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param arcw the width of the arc to use to round off the
         *             corners of the newly constructed
         *             <code>RoundRectangle2D</code>
         * @param arch the height of the arc to use to round off the
         *             corners of the newly constructed
         *             <code>RoundRectangle2D</code>
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public Double() {

        /**
         * Constructs a new <code>RoundRectangle2D</code>, initialized to
         * location (0.0,&nbsp;0.0), size (0.0,&nbsp;0.0), and corner arcs
         * of radius 0.0.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double archeight;

        /**
         * The height of the arc that rounds off the corners.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double arcwidth;

        /**
         * The width of the arc that rounds off the corners.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double height;

        /**
         * The height of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double width;

        /**
         * The width of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double y;

        /**
         * The Y coordinate of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double x;

        /**
         * The X coordinate of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public static class Double extends RoundRectangle2D

    /**
     * The <code>Double</code> class defines a rectangle with rounded
     * corners all specified in <code>double</code> coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public void setRoundRect(RoundRectangle2D rr) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public void setRoundRect(double x, double y, double w, double h,
                                 double arcw, double arch)

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public void setRoundRect(float x, float y, float w, float h,
                                 float arcw, float arch)

        /**
         * Sets the location, size, and corner radii of this
         * <code>RoundRectangle2D</code> to the specified
         * <code>float</code> values.
         *
         * @param x the X coordinate to which to set the
         *          location of this <code>RoundRectangle2D</code>
         * @param y the Y coordinate to which to set the
         *          location of this <code>RoundRectangle2D</code>
         * @param w the width to which to set this
         *          <code>RoundRectangle2D</code>
         * @param h the height to which to set this
         *          <code>RoundRectangle2D</code>
         * @param arcw the width to which to set the arc of this
         *             <code>RoundRectangle2D</code>
         * @param arch the height to which to set the arc of this
         *             <code>RoundRectangle2D</code>
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public boolean isEmpty() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getArcHeight() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getArcWidth() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getHeight() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getWidth() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public Float(float x, float y, float w, float h,
                     float arcw, float arch)

        /**
         * Constructs and initializes a <code>RoundRectangle2D</code>
         * from the specified <code>float</code> coordinates.
         *
         * @param x the X coordinate of the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param y the Y coordinate of the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param w the width to which to set the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param h the height to which to set the newly
         *          constructed <code>RoundRectangle2D</code>
         * @param arcw the width of the arc to use to round off the
         *             corners of the newly constructed
         *             <code>RoundRectangle2D</code>
         * @param arch the height of the arc to use to round off the
         *             corners of the newly constructed
         *             <code>RoundRectangle2D</code>
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public Float() {

        /**
         * Constructs a new <code>RoundRectangle2D</code>, initialized to
         * location (0.0,&nbsp;0.0), size (0.0,&nbsp;0.0), and corner arcs
         * of radius 0.0.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public float archeight;

        /**
         * The height of the arc that rounds off the corners.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public float arcwidth;

        /**
         * The width of the arc that rounds off the corners.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public float height;

        /**
         * The height of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public float width;

        /**
         * The width of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public float y;

        /**
         * The Y coordinate of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
        public float x;

        /**
         * The X coordinate of this <code>RoundRectangle2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
    public static class Float extends RoundRectangle2D

    /**
     * The <code>Float</code> class defines a rectangle with rounded
     * corners all specified in <code>float</code> coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/RoundRectangle2D.java
public abstract class RoundRectangle2D extends RectangularShape {

/**
 * The <code>RoundRectangle2D</code> class defines a rectangle with
 * rounded corners defined by a location {@code (x,y)}, a
 * dimension {@code (w x h)}, and the width and height of an arc
 * with which to round the corners.
 * <p>
 * This class is the abstract superclass for all objects that
 * store a 2D rounded rectangle.
 * The actual storage representation of the coordinates is left to
 * the subclass.
 *
 * @author      Jim Graham
 * @since 1.2
 */
