_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public boolean equals(Object obj) {

    /**
     * Determines whether or not the specified <code>Object</code> is
     * equal to this <code>Ellipse2D</code>.  The specified
     * <code>Object</code> is equal to this <code>Ellipse2D</code>
     * if it is an instance of <code>Ellipse2D</code> and if its
     * location and size are the same as this <code>Ellipse2D</code>.
     * @param obj  an <code>Object</code> to be compared with this
     *             <code>Ellipse2D</code>.
     * @return  <code>true</code> if <code>obj</code> is an instance
     *          of <code>Ellipse2D</code> and has the same values;
     *          <code>false</code> otherwise.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public int hashCode() {

    /**
     * Returns the hashcode for this <code>Ellipse2D</code>.
     * @return the hashcode for this <code>Ellipse2D</code>.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public PathIterator getPathIterator(AffineTransform at) {

    /**
     * Returns an iteration object that defines the boundary of this
     * <code>Ellipse2D</code>.
     * The iterator for this class is multi-threaded safe, which means
     * that this <code>Ellipse2D</code> class guarantees that
     * modifications to the geometry of this <code>Ellipse2D</code>
     * object do not affect any iterations of that geometry that
     * are already in process.
     * @param at an optional <code>AffineTransform</code> to be applied to
     * the coordinates as they are returned in the iteration, or
     * <code>null</code> if untransformed coordinates are desired
     * @return    the <code>PathIterator</code> object that returns the
     *          geometry of the outline of this <code>Ellipse2D</code>,
     *          one segment at a time.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public boolean contains(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public boolean intersects(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public boolean contains(double x, double y) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    protected Ellipse2D() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessor
     * methods below.
     *
     * @see java.awt.geom.Ellipse2D.Float
     * @see java.awt.geom.Ellipse2D.Double
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public void setFrame(double x, double y, double w, double h) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public boolean isEmpty() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getHeight() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getWidth() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public Double(double x, double y, double w, double h) {

        /**
         * Constructs and initializes an <code>Ellipse2D</code> from the
         * specified coordinates.
         *
         * @param x the X coordinate of the upper-left corner
         *        of the framing rectangle
         * @param y the Y coordinate of the upper-left corner
         *        of the framing rectangle
         * @param w the width of the framing rectangle
         * @param h the height of the framing rectangle
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public Double() {

        /**
         * Constructs a new <code>Ellipse2D</code>, initialized to
         * location (0,&nbsp;0) and size (0,&nbsp;0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double height;

        /**
         * The overall height of the <code>Ellipse2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double width;

        /**
         * The overall width of this <code>Ellipse2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double y;

        /**
         * The Y coordinate of the upper-left corner of the
         * framing rectangle of this {@code Ellipse2D}.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public static class Double extends Ellipse2D implements Serializable {

    /**
     * The <code>Double</code> class defines an ellipse specified
     * in <code>double</code> precision.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public void setFrame(double x, double y, double w, double h) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public void setFrame(float x, float y, float w, float h) {

        /**
         * Sets the location and size of the framing rectangle of this
         * <code>Shape</code> to the specified rectangular values.
         *
         * @param x the X coordinate of the upper-left corner of the
         *              specified rectangular shape
         * @param y the Y coordinate of the upper-left corner of the
         *              specified rectangular shape
         * @param w the width of the specified rectangular shape
         * @param h the height of the specified rectangular shape
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public boolean isEmpty() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getHeight() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getWidth() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public Float(float x, float y, float w, float h) {

        /**
         * Constructs and initializes an <code>Ellipse2D</code> from the
         * specified coordinates.
         *
         * @param x the X coordinate of the upper-left corner
         *          of the framing rectangle
         * @param y the Y coordinate of the upper-left corner
         *          of the framing rectangle
         * @param w the width of the framing rectangle
         * @param h the height of the framing rectangle
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public Float() {

        /**
         * Constructs a new <code>Ellipse2D</code>, initialized to
         * location (0,&nbsp;0) and size (0,&nbsp;0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public float height;

        /**
         * The overall height of this <code>Ellipse2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public float width;

        /**
         * The overall width of this <code>Ellipse2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public float y;

        /**
         * The Y coordinate of the upper-left corner of the
         * framing rectangle of this {@code Ellipse2D}.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public static class Float extends Ellipse2D implements Serializable {

    /**
     * The <code>Float</code> class defines an ellipse specified
     * in <code>float</code> precision.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
public abstract class Ellipse2D extends RectangularShape {

/**
 * The <code>Ellipse2D</code> class describes an ellipse that is defined
 * by a framing rectangle.
 * <p>
 * This class is only the abstract superclass for all objects which
 * store a 2D ellipse.
 * The actual storage representation of the coordinates is left to
 * the subclass.
 *
 * @author      Jim Graham
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public boolean equals(Object obj) {

    /**
     * Determines whether or not the specified <code>Object</code> is
     * equal to this <code>Ellipse2D</code>.  The specified
     * <code>Object</code> is equal to this <code>Ellipse2D</code>
     * if it is an instance of <code>Ellipse2D</code> and if its
     * location and size are the same as this <code>Ellipse2D</code>.
     * @param obj  an <code>Object</code> to be compared with this
     *             <code>Ellipse2D</code>.
     * @return  <code>true</code> if <code>obj</code> is an instance
     *          of <code>Ellipse2D</code> and has the same values;
     *          <code>false</code> otherwise.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public int hashCode() {

    /**
     * Returns the hashcode for this <code>Ellipse2D</code>.
     * @return the hashcode for this <code>Ellipse2D</code>.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public PathIterator getPathIterator(AffineTransform at) {

    /**
     * Returns an iteration object that defines the boundary of this
     * <code>Ellipse2D</code>.
     * The iterator for this class is multi-threaded safe, which means
     * that this <code>Ellipse2D</code> class guarantees that
     * modifications to the geometry of this <code>Ellipse2D</code>
     * object do not affect any iterations of that geometry that
     * are already in process.
     * @param at an optional <code>AffineTransform</code> to be applied to
     * the coordinates as they are returned in the iteration, or
     * <code>null</code> if untransformed coordinates are desired
     * @return    the <code>PathIterator</code> object that returns the
     *          geometry of the outline of this <code>Ellipse2D</code>,
     *          one segment at a time.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public boolean contains(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public boolean intersects(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public boolean contains(double x, double y) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    protected Ellipse2D() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessor
     * methods below.
     *
     * @see java.awt.geom.Ellipse2D.Float
     * @see java.awt.geom.Ellipse2D.Double
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public void setFrame(double x, double y, double w, double h) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public boolean isEmpty() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getHeight() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getWidth() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public Double(double x, double y, double w, double h) {

        /**
         * Constructs and initializes an <code>Ellipse2D</code> from the
         * specified coordinates.
         *
         * @param x the X coordinate of the upper-left corner
         *        of the framing rectangle
         * @param y the Y coordinate of the upper-left corner
         *        of the framing rectangle
         * @param w the width of the framing rectangle
         * @param h the height of the framing rectangle
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public Double() {

        /**
         * Constructs a new <code>Ellipse2D</code>, initialized to
         * location (0,&nbsp;0) and size (0,&nbsp;0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double height;

        /**
         * The overall height of the <code>Ellipse2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double width;

        /**
         * The overall width of this <code>Ellipse2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double y;

        /**
         * The Y coordinate of the upper-left corner of the
         * framing rectangle of this {@code Ellipse2D}.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public static class Double extends Ellipse2D implements Serializable {

    /**
     * The <code>Double</code> class defines an ellipse specified
     * in <code>double</code> precision.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public void setFrame(double x, double y, double w, double h) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public void setFrame(float x, float y, float w, float h) {

        /**
         * Sets the location and size of the framing rectangle of this
         * <code>Shape</code> to the specified rectangular values.
         *
         * @param x the X coordinate of the upper-left corner of the
         *              specified rectangular shape
         * @param y the Y coordinate of the upper-left corner of the
         *              specified rectangular shape
         * @param w the width of the specified rectangular shape
         * @param h the height of the specified rectangular shape
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public boolean isEmpty() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getHeight() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getWidth() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public Float(float x, float y, float w, float h) {

        /**
         * Constructs and initializes an <code>Ellipse2D</code> from the
         * specified coordinates.
         *
         * @param x the X coordinate of the upper-left corner
         *          of the framing rectangle
         * @param y the Y coordinate of the upper-left corner
         *          of the framing rectangle
         * @param w the width of the framing rectangle
         * @param h the height of the framing rectangle
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public Float() {

        /**
         * Constructs a new <code>Ellipse2D</code>, initialized to
         * location (0,&nbsp;0) and size (0,&nbsp;0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public float height;

        /**
         * The overall height of this <code>Ellipse2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public float width;

        /**
         * The overall width of this <code>Ellipse2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
        public float y;

        /**
         * The Y coordinate of the upper-left corner of the
         * framing rectangle of this {@code Ellipse2D}.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
    public static class Float extends Ellipse2D implements Serializable {

    /**
     * The <code>Float</code> class defines an ellipse specified
     * in <code>float</code> precision.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Ellipse2D.java
public abstract class Ellipse2D extends RectangularShape {

/**
 * The <code>Ellipse2D</code> class describes an ellipse that is defined
 * by a framing rectangle.
 * <p>
 * This class is only the abstract superclass for all objects which
 * store a 2D ellipse.
 * The actual storage representation of the coordinates is left to
 * the subclass.
 *
 * @author      Jim Graham
 * @since 1.2
 */
