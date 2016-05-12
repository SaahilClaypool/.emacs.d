_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public Object clone() {

    /**
     * Creates a new object of the same class as this object.
     *
     * @return     a clone of this instance.
     * @exception  OutOfMemoryError            if there is not enough memory.
     * @see        java.lang.Cloneable
     * @since      1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public PathIterator getPathIterator(AffineTransform at, double flatness) {

    /**
     * Return an iteration object that defines the boundary of the
     * flattened shape.
     * The iterator for this class is not multi-threaded safe,
     * which means that this <code>CubicCurve2D</code> class does not
     * guarantee that modifications to the geometry of this
     * <code>CubicCurve2D</code> object do not affect any iterations of
     * that geometry that are already in process.
     * @param at an optional <code>AffineTransform</code> to be applied to the
     * coordinates as they are returned in the iteration, or <code>null</code>
     * if untransformed coordinates are desired
     * @param flatness the maximum amount that the control points
     * for a given curve can vary from colinear before a subdivided
     * curve is replaced by a straight line connecting the end points
     * @return    the <code>PathIterator</code> object that returns the
     * geometry of the outline of this <code>CubicCurve2D</code>,
     * one segment at a time.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public PathIterator getPathIterator(AffineTransform at) {

    /**
     * Returns an iteration object that defines the boundary of the
     * shape.
     * The iterator for this class is not multi-threaded safe,
     * which means that this <code>CubicCurve2D</code> class does not
     * guarantee that modifications to the geometry of this
     * <code>CubicCurve2D</code> object do not affect any iterations of
     * that geometry that are already in process.
     * @param at an optional <code>AffineTransform</code> to be applied to the
     * coordinates as they are returned in the iteration, or <code>null</code>
     * if untransformed coordinates are desired
     * @return    the <code>PathIterator</code> object that returns the
     *          geometry of the outline of this <code>CubicCurve2D</code>, one
     *          segment at a time.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public Rectangle getBounds() {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public boolean contains(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public boolean contains(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public boolean intersects(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public boolean intersects(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public boolean contains(Point2D p) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public boolean contains(double x, double y) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static int solveCubic(double eqn[], double res[]) {

    /**
     * Solve the cubic whose coefficients are in the <code>eqn</code>
     * array and place the non-complex roots into the <code>res</code>
     * array, returning the number of roots.
     * The cubic solved is represented by the equation:
     *     eqn = {c, b, a, d}
     *     dx^3 + ax^2 + bx + c = 0
     * A return value of -1 is used to distinguish a constant equation,
     * which may be always 0 or never 0, from an equation which has no
     * zeroes.
     * @param eqn the specified array of coefficients to use to solve
     *        the cubic equation
     * @param res the array that contains the non-complex roots
     *        resulting from the solution of the cubic equation
     * @return the number of roots, or -1 if the equation is a constant
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static int solveCubic(double eqn[]) {

    /**
     * Solves the cubic whose coefficients are in the <code>eqn</code>
     * array and places the non-complex roots back into the same array,
     * returning the number of roots.  The solved cubic is represented
     * by the equation:
     * <pre>
     *     eqn = {c, b, a, d}
     *     dx^3 + ax^2 + bx + c = 0
     * </pre>
     * A return value of -1 is used to distinguish a constant equation
     * that might be always 0 or never 0 from an equation that has no
     * zeroes.
     * @param eqn an array containing coefficients for a cubic
     * @return the number of roots, or -1 if the equation is a constant.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static void subdivide(double src[], int srcoff,
                                 double left[], int leftoff,
                                 double right[], int rightoff) {

    /**
     * Subdivides the cubic curve specified by the coordinates
     * stored in the <code>src</code> array at indices <code>srcoff</code>
     * through (<code>srcoff</code>&nbsp;+&nbsp;7) and stores the
     * resulting two subdivided curves into the two result arrays at the
     * corresponding indices.
     * Either or both of the <code>left</code> and <code>right</code>
     * arrays may be <code>null</code> or a reference to the same array
     * as the <code>src</code> array.
     * Note that the last point in the first subdivided curve is the
     * same as the first point in the second subdivided curve. Thus,
     * it is possible to pass the same array for <code>left</code>
     * and <code>right</code> and to use offsets, such as <code>rightoff</code>
     * equals (<code>leftoff</code> + 6), in order
     * to avoid allocating extra storage for this common point.
     * @param src the array holding the coordinates for the source curve
     * @param srcoff the offset into the array of the beginning of the
     * the 6 source coordinates
     * @param left the array for storing the coordinates for the first
     * half of the subdivided curve
     * @param leftoff the offset into the array of the beginning of the
     * the 6 left coordinates
     * @param right the array for storing the coordinates for the second
     * half of the subdivided curve
     * @param rightoff the offset into the array of the beginning of the
     * the 6 right coordinates
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static void subdivide(CubicCurve2D src,
                                 CubicCurve2D left,
                                 CubicCurve2D right) {

    /**
     * Subdivides the cubic curve specified by the <code>src</code> parameter
     * and stores the resulting two subdivided curves into the
     * <code>left</code> and <code>right</code> curve parameters.
     * Either or both of the <code>left</code> and <code>right</code> objects
     * may be the same as the <code>src</code> object or <code>null</code>.
     * @param src the cubic curve to be subdivided
     * @param left the cubic curve object for storing the left or
     * first half of the subdivided curve
     * @param right the cubic curve object for storing the right or
     * second half of the subdivided curve
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public void subdivide(CubicCurve2D left, CubicCurve2D right) {

    /**
     * Subdivides this cubic curve and stores the resulting two
     * subdivided curves into the left and right curve parameters.
     * Either or both of the left and right objects may be the same
     * as this object or null.
     * @param left the cubic curve object for storing for the left or
     * first half of the subdivided curve
     * @param right the cubic curve object for storing for the right or
     * second half of the subdivided curve
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public double getFlatness() {

    /**
     * Returns the flatness of this curve.  The flatness is the
     * maximum distance of a control point from the line connecting the
     * end points.
     * @return the flatness of this curve.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public double getFlatnessSq() {

    /**
     * Returns the square of the flatness of this curve.  The flatness is the
     * maximum distance of a control point from the line connecting the
     * end points.
     * @return the square of the flatness of this curve.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static double getFlatness(double coords[], int offset) {

    /**
     * Returns the flatness of the cubic curve specified
     * by the control points stored in the indicated array at the
     * indicated index.  The flatness is the maximum distance
     * of a control point from the line connecting the end points.
     * @param coords an array containing coordinates
     * @param offset the index of <code>coords</code> from which to begin
     *          getting the end points and control points of the curve
     * @return the flatness of the <code>CubicCurve2D</code>
     *          specified by the coordinates in <code>coords</code> at
     *          the specified offset.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static double getFlatnessSq(double coords[], int offset) {

    /**
     * Returns the square of the flatness of the cubic curve specified
     * by the control points stored in the indicated array at the
     * indicated index. The flatness is the maximum distance
     * of a control point from the line connecting the end points.
     * @param coords an array containing coordinates
     * @param offset the index of <code>coords</code> from which to begin
     *          getting the end points and control points of the curve
     * @return the square of the flatness of the <code>CubicCurve2D</code>
     *          specified by the coordinates in <code>coords</code> at
     *          the specified offset.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static double getFlatness(double x1, double y1,
                                     double ctrlx1, double ctrly1,
                                     double ctrlx2, double ctrly2,
                                     double x2, double y2) {

    /**
     * Returns the flatness of the cubic curve specified
     * by the indicated control points. The flatness is the maximum distance
     * of a control point from the line connecting the end points.
     *
     * @param x1 the X coordinate that specifies the start point
     *           of a {@code CubicCurve2D}
     * @param y1 the Y coordinate that specifies the start point
     *           of a {@code CubicCurve2D}
     * @param ctrlx1 the X coordinate that specifies the first control point
     *               of a {@code CubicCurve2D}
     * @param ctrly1 the Y coordinate that specifies the first control point
     *               of a {@code CubicCurve2D}
     * @param ctrlx2 the X coordinate that specifies the second control point
     *               of a {@code CubicCurve2D}
     * @param ctrly2 the Y coordinate that specifies the second control point
     *               of a {@code CubicCurve2D}
     * @param x2 the X coordinate that specifies the end point
     *           of a {@code CubicCurve2D}
     * @param y2 the Y coordinate that specifies the end point
     *           of a {@code CubicCurve2D}
     * @return the flatness of the {@code CubicCurve2D}
     *          represented by the specified coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static double getFlatnessSq(double x1, double y1,
                                       double ctrlx1, double ctrly1,
                                       double ctrlx2, double ctrly2,
                                       double x2, double y2) {

    /**
     * Returns the square of the flatness of the cubic curve specified
     * by the indicated control points. The flatness is the maximum distance
     * of a control point from the line connecting the end points.
     *
     * @param x1 the X coordinate that specifies the start point
     *           of a {@code CubicCurve2D}
     * @param y1 the Y coordinate that specifies the start point
     *           of a {@code CubicCurve2D}
     * @param ctrlx1 the X coordinate that specifies the first control point
     *               of a {@code CubicCurve2D}
     * @param ctrly1 the Y coordinate that specifies the first control point
     *               of a {@code CubicCurve2D}
     * @param ctrlx2 the X coordinate that specifies the second control point
     *               of a {@code CubicCurve2D}
     * @param ctrly2 the Y coordinate that specifies the second control point
     *               of a {@code CubicCurve2D}
     * @param x2 the X coordinate that specifies the end point
     *           of a {@code CubicCurve2D}
     * @param y2 the Y coordinate that specifies the end point
     *           of a {@code CubicCurve2D}
     * @return the square of the flatness of the {@code CubicCurve2D}
     *          represented by the specified coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public void setCurve(CubicCurve2D c) {

    /**
     * Sets the location of the end points and control points of this curve
     * to the same as those in the specified <code>CubicCurve2D</code>.
     * @param c the specified <code>CubicCurve2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public void setCurve(Point2D[] pts, int offset) {

    /**
     * Sets the location of the end points and control points of this curve
     * to the coordinates of the <code>Point2D</code> objects at the specified
     * offset in the specified array.
     * @param pts an array of <code>Point2D</code> objects
     * @param offset  the index of <code>pts</code> from which to begin setting
     *          the end points and control points of this curve to the
     *          points contained in <code>pts</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public void setCurve(Point2D p1, Point2D cp1, Point2D cp2, Point2D p2) {

    /**
     * Sets the location of the end points and control points of this curve
     * to the specified <code>Point2D</code> coordinates.
     * @param p1 the first specified <code>Point2D</code> used to set the
     *          start point of this curve
     * @param cp1 the second specified <code>Point2D</code> used to set the
     *          first control point of this curve
     * @param cp2 the third specified <code>Point2D</code> used to set the
     *          second control point of this curve
     * @param p2 the fourth specified <code>Point2D</code> used to set the
     *          end point of this curve
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public void setCurve(double[] coords, int offset) {

    /**
     * Sets the location of the end points and control points of this curve
     * to the double coordinates at the specified offset in the specified
     * array.
     * @param coords a double array containing coordinates
     * @param offset the index of <code>coords</code> from which to begin
     *          setting the end points and control points of this curve
     *          to the coordinates contained in <code>coords</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract void setCurve(double x1, double y1,
                                  double ctrlx1, double ctrly1,
                                  double ctrlx2, double ctrly2,
                                  double x2, double y2);

    /**
     * Sets the location of the end points and control points of this curve
     * to the specified double coordinates.
     *
     * @param x1 the X coordinate used to set the start point
     *           of this {@code CubicCurve2D}
     * @param y1 the Y coordinate used to set the start point
     *           of this {@code CubicCurve2D}
     * @param ctrlx1 the X coordinate used to set the first control point
     *               of this {@code CubicCurve2D}
     * @param ctrly1 the Y coordinate used to set the first control point
     *               of this {@code CubicCurve2D}
     * @param ctrlx2 the X coordinate used to set the second control point
     *               of this {@code CubicCurve2D}
     * @param ctrly2 the Y coordinate used to set the second control point
     *               of this {@code CubicCurve2D}
     * @param x2 the X coordinate used to set the end point
     *           of this {@code CubicCurve2D}
     * @param y2 the Y coordinate used to set the end point
     *           of this {@code CubicCurve2D}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract Point2D getP2();

    /**
     * Returns the end point.
     * @return a {@code Point2D} that is the end point of
     *         the {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getY2();

    /**
     * Returns the Y coordinate of the end point in double precision.
     * @return the Y coordinate of the end point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getX2();

    /**
     * Returns the X coordinate of the end point in double precision.
     * @return the X coordinate of the end point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract Point2D getCtrlP2();

    /**
     * Returns the second control point.
     * @return a {@code Point2D} that is the second control point of
     *         the {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getCtrlY2();

    /**
     * Returns the Y coordinate of the second control point
     * in double precision.
     * @return the Y coordinate of the second control point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getCtrlX2();

    /**
     * Returns the X coordinate of the second control point
     * in double precision.
     * @return the X coordinate of the second control point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract Point2D getCtrlP1();

    /**
     * Returns the first control point.
     * @return a {@code Point2D} that is the first control point of
     *         the {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getCtrlY1();

    /**
     * Returns the Y coordinate of the first control point in double precision.
     * @return the Y coordinate of the first control point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getCtrlX1();

    /**
     * Returns the X coordinate of the first control point in double precision.
     * @return the X coordinate of the first control point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract Point2D getP1();

    /**
     * Returns the start point.
     * @return a {@code Point2D} that is the start point of
     *         the {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getY1();

    /**
     * Returns the Y coordinate of the start point in double precision.
     * @return the Y coordinate of the start point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getX1();

    /**
     * Returns the X coordinate of the start point in double precision.
     * @return the X coordinate of the start point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    protected CubicCurve2D() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessor
     * methods below.
     *
     * @see java.awt.geom.CubicCurve2D.Float
     * @see java.awt.geom.CubicCurve2D.Double
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public void setCurve(double x1, double y1,
                             double ctrlx1, double ctrly1,
                             double ctrlx2, double ctrly2,
                             double x2, double y2)

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getCtrlP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getCtrlP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Double(double x1, double y1,
                      double ctrlx1, double ctrly1,
                      double ctrlx2, double ctrly2,
                      double x2, double y2)

        /**
         * Constructs and initializes a {@code CubicCurve2D} from
         * the specified {@code double} coordinates.
         *
         * @param x1 the X coordinate for the start point
         *           of the resulting {@code CubicCurve2D}
         * @param y1 the Y coordinate for the start point
         *           of the resulting {@code CubicCurve2D}
         * @param ctrlx1 the X coordinate for the first control point
         *               of the resulting {@code CubicCurve2D}
         * @param ctrly1 the Y coordinate for the first control point
         *               of the resulting {@code CubicCurve2D}
         * @param ctrlx2 the X coordinate for the second control point
         *               of the resulting {@code CubicCurve2D}
         * @param ctrly2 the Y coordinate for the second control point
         *               of the resulting {@code CubicCurve2D}
         * @param x2 the X coordinate for the end point
         *           of the resulting {@code CubicCurve2D}
         * @param y2 the Y coordinate for the end point
         *           of the resulting {@code CubicCurve2D}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Double() {

        /**
         * Constructs and initializes a CubicCurve with coordinates
         * (0, 0, 0, 0, 0, 0, 0, 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double y2;

        /**
         * The Y coordinate of the end point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double x2;

        /**
         * The X coordinate of the end point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double ctrly2;

        /**
         * The Y coordinate of the second control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double ctrlx2;

        /**
         * The X coordinate of the second control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double ctrly1;

        /**
         * The Y coordinate of the first control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double ctrlx1;

        /**
         * The X coordinate of the first control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double y1;

        /**
         * The Y coordinate of the start point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static class Double extends CubicCurve2D implements Serializable {

    /**
     * A cubic parametric curve segment specified with
     * {@code double} coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public void setCurve(float x1, float y1,
                             float ctrlx1, float ctrly1,
                             float ctrlx2, float ctrly2,
                             float x2, float y2)

        /**
         * Sets the location of the end points and control points
         * of this curve to the specified {@code float} coordinates.
         *
         * @param x1 the X coordinate used to set the start point
         *           of this {@code CubicCurve2D}
         * @param y1 the Y coordinate used to set the start point
         *           of this {@code CubicCurve2D}
         * @param ctrlx1 the X coordinate used to set the first control point
         *               of this {@code CubicCurve2D}
         * @param ctrly1 the Y coordinate used to set the first control point
         *               of this {@code CubicCurve2D}
         * @param ctrlx2 the X coordinate used to set the second control point
         *               of this {@code CubicCurve2D}
         * @param ctrly2 the Y coordinate used to set the second control point
         *               of this {@code CubicCurve2D}
         * @param x2 the X coordinate used to set the end point
         *           of this {@code CubicCurve2D}
         * @param y2 the Y coordinate used to set the end point
         *           of this {@code CubicCurve2D}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public void setCurve(double x1, double y1,
                             double ctrlx1, double ctrly1,
                             double ctrlx2, double ctrly2,
                             double x2, double y2)

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getCtrlP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getCtrlP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Float(float x1, float y1,
                     float ctrlx1, float ctrly1,
                     float ctrlx2, float ctrly2,
                     float x2, float y2)

        /**
         * Constructs and initializes a {@code CubicCurve2D} from
         * the specified {@code float} coordinates.
         *
         * @param x1 the X coordinate for the start point
         *           of the resulting {@code CubicCurve2D}
         * @param y1 the Y coordinate for the start point
         *           of the resulting {@code CubicCurve2D}
         * @param ctrlx1 the X coordinate for the first control point
         *               of the resulting {@code CubicCurve2D}
         * @param ctrly1 the Y coordinate for the first control point
         *               of the resulting {@code CubicCurve2D}
         * @param ctrlx2 the X coordinate for the second control point
         *               of the resulting {@code CubicCurve2D}
         * @param ctrly2 the Y coordinate for the second control point
         *               of the resulting {@code CubicCurve2D}
         * @param x2 the X coordinate for the end point
         *           of the resulting {@code CubicCurve2D}
         * @param y2 the Y coordinate for the end point
         *           of the resulting {@code CubicCurve2D}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Float() {

        /**
         * Constructs and initializes a CubicCurve with coordinates
         * (0, 0, 0, 0, 0, 0, 0, 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public float y2;

        /**
         * The Y coordinate of the end point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public float x2;

        /**
         * The X coordinate of the end point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public float ctrly2;

        /**
         * The Y coordinate of the second control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public float ctrlx2;

        /**
         * The X coordinate of the second control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public float ctrly1;

        /**
         * The Y coordinate of the first control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public float ctrlx1;

        /**
         * The X coordinate of the first control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public float y1;

        /**
         * The Y coordinate of the start point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static class Float extends CubicCurve2D implements Serializable {

    /**
     * A cubic parametric curve segment specified with
     * {@code float} coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
public abstract class CubicCurve2D implements Shape, Cloneable {

/**
 * The <code>CubicCurve2D</code> class defines a cubic parametric curve
 * segment in {@code (x,y)} coordinate space.
 * <p>
 * This class is only the abstract superclass for all objects which
 * store a 2D cubic curve segment.
 * The actual storage representation of the coordinates is left to
 * the subclass.
 *
 * @author      Jim Graham
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public Object clone() {

    /**
     * Creates a new object of the same class as this object.
     *
     * @return     a clone of this instance.
     * @exception  OutOfMemoryError            if there is not enough memory.
     * @see        java.lang.Cloneable
     * @since      1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public PathIterator getPathIterator(AffineTransform at, double flatness) {

    /**
     * Return an iteration object that defines the boundary of the
     * flattened shape.
     * The iterator for this class is not multi-threaded safe,
     * which means that this <code>CubicCurve2D</code> class does not
     * guarantee that modifications to the geometry of this
     * <code>CubicCurve2D</code> object do not affect any iterations of
     * that geometry that are already in process.
     * @param at an optional <code>AffineTransform</code> to be applied to the
     * coordinates as they are returned in the iteration, or <code>null</code>
     * if untransformed coordinates are desired
     * @param flatness the maximum amount that the control points
     * for a given curve can vary from colinear before a subdivided
     * curve is replaced by a straight line connecting the end points
     * @return    the <code>PathIterator</code> object that returns the
     * geometry of the outline of this <code>CubicCurve2D</code>,
     * one segment at a time.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public PathIterator getPathIterator(AffineTransform at) {

    /**
     * Returns an iteration object that defines the boundary of the
     * shape.
     * The iterator for this class is not multi-threaded safe,
     * which means that this <code>CubicCurve2D</code> class does not
     * guarantee that modifications to the geometry of this
     * <code>CubicCurve2D</code> object do not affect any iterations of
     * that geometry that are already in process.
     * @param at an optional <code>AffineTransform</code> to be applied to the
     * coordinates as they are returned in the iteration, or <code>null</code>
     * if untransformed coordinates are desired
     * @return    the <code>PathIterator</code> object that returns the
     *          geometry of the outline of this <code>CubicCurve2D</code>, one
     *          segment at a time.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public Rectangle getBounds() {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public boolean contains(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public boolean contains(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public boolean intersects(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public boolean intersects(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public boolean contains(Point2D p) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public boolean contains(double x, double y) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static int solveCubic(double eqn[], double res[]) {

    /**
     * Solve the cubic whose coefficients are in the <code>eqn</code>
     * array and place the non-complex roots into the <code>res</code>
     * array, returning the number of roots.
     * The cubic solved is represented by the equation:
     *     eqn = {c, b, a, d}
     *     dx^3 + ax^2 + bx + c = 0
     * A return value of -1 is used to distinguish a constant equation,
     * which may be always 0 or never 0, from an equation which has no
     * zeroes.
     * @param eqn the specified array of coefficients to use to solve
     *        the cubic equation
     * @param res the array that contains the non-complex roots
     *        resulting from the solution of the cubic equation
     * @return the number of roots, or -1 if the equation is a constant
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static int solveCubic(double eqn[]) {

    /**
     * Solves the cubic whose coefficients are in the <code>eqn</code>
     * array and places the non-complex roots back into the same array,
     * returning the number of roots.  The solved cubic is represented
     * by the equation:
     * <pre>
     *     eqn = {c, b, a, d}
     *     dx^3 + ax^2 + bx + c = 0
     * </pre>
     * A return value of -1 is used to distinguish a constant equation
     * that might be always 0 or never 0 from an equation that has no
     * zeroes.
     * @param eqn an array containing coefficients for a cubic
     * @return the number of roots, or -1 if the equation is a constant.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static void subdivide(double src[], int srcoff,
                                 double left[], int leftoff,
                                 double right[], int rightoff) {

    /**
     * Subdivides the cubic curve specified by the coordinates
     * stored in the <code>src</code> array at indices <code>srcoff</code>
     * through (<code>srcoff</code>&nbsp;+&nbsp;7) and stores the
     * resulting two subdivided curves into the two result arrays at the
     * corresponding indices.
     * Either or both of the <code>left</code> and <code>right</code>
     * arrays may be <code>null</code> or a reference to the same array
     * as the <code>src</code> array.
     * Note that the last point in the first subdivided curve is the
     * same as the first point in the second subdivided curve. Thus,
     * it is possible to pass the same array for <code>left</code>
     * and <code>right</code> and to use offsets, such as <code>rightoff</code>
     * equals (<code>leftoff</code> + 6), in order
     * to avoid allocating extra storage for this common point.
     * @param src the array holding the coordinates for the source curve
     * @param srcoff the offset into the array of the beginning of the
     * the 6 source coordinates
     * @param left the array for storing the coordinates for the first
     * half of the subdivided curve
     * @param leftoff the offset into the array of the beginning of the
     * the 6 left coordinates
     * @param right the array for storing the coordinates for the second
     * half of the subdivided curve
     * @param rightoff the offset into the array of the beginning of the
     * the 6 right coordinates
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static void subdivide(CubicCurve2D src,
                                 CubicCurve2D left,
                                 CubicCurve2D right) {

    /**
     * Subdivides the cubic curve specified by the <code>src</code> parameter
     * and stores the resulting two subdivided curves into the
     * <code>left</code> and <code>right</code> curve parameters.
     * Either or both of the <code>left</code> and <code>right</code> objects
     * may be the same as the <code>src</code> object or <code>null</code>.
     * @param src the cubic curve to be subdivided
     * @param left the cubic curve object for storing the left or
     * first half of the subdivided curve
     * @param right the cubic curve object for storing the right or
     * second half of the subdivided curve
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public void subdivide(CubicCurve2D left, CubicCurve2D right) {

    /**
     * Subdivides this cubic curve and stores the resulting two
     * subdivided curves into the left and right curve parameters.
     * Either or both of the left and right objects may be the same
     * as this object or null.
     * @param left the cubic curve object for storing for the left or
     * first half of the subdivided curve
     * @param right the cubic curve object for storing for the right or
     * second half of the subdivided curve
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public double getFlatness() {

    /**
     * Returns the flatness of this curve.  The flatness is the
     * maximum distance of a control point from the line connecting the
     * end points.
     * @return the flatness of this curve.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public double getFlatnessSq() {

    /**
     * Returns the square of the flatness of this curve.  The flatness is the
     * maximum distance of a control point from the line connecting the
     * end points.
     * @return the square of the flatness of this curve.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static double getFlatness(double coords[], int offset) {

    /**
     * Returns the flatness of the cubic curve specified
     * by the control points stored in the indicated array at the
     * indicated index.  The flatness is the maximum distance
     * of a control point from the line connecting the end points.
     * @param coords an array containing coordinates
     * @param offset the index of <code>coords</code> from which to begin
     *          getting the end points and control points of the curve
     * @return the flatness of the <code>CubicCurve2D</code>
     *          specified by the coordinates in <code>coords</code> at
     *          the specified offset.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static double getFlatnessSq(double coords[], int offset) {

    /**
     * Returns the square of the flatness of the cubic curve specified
     * by the control points stored in the indicated array at the
     * indicated index. The flatness is the maximum distance
     * of a control point from the line connecting the end points.
     * @param coords an array containing coordinates
     * @param offset the index of <code>coords</code> from which to begin
     *          getting the end points and control points of the curve
     * @return the square of the flatness of the <code>CubicCurve2D</code>
     *          specified by the coordinates in <code>coords</code> at
     *          the specified offset.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static double getFlatness(double x1, double y1,
                                     double ctrlx1, double ctrly1,
                                     double ctrlx2, double ctrly2,
                                     double x2, double y2) {

    /**
     * Returns the flatness of the cubic curve specified
     * by the indicated control points. The flatness is the maximum distance
     * of a control point from the line connecting the end points.
     *
     * @param x1 the X coordinate that specifies the start point
     *           of a {@code CubicCurve2D}
     * @param y1 the Y coordinate that specifies the start point
     *           of a {@code CubicCurve2D}
     * @param ctrlx1 the X coordinate that specifies the first control point
     *               of a {@code CubicCurve2D}
     * @param ctrly1 the Y coordinate that specifies the first control point
     *               of a {@code CubicCurve2D}
     * @param ctrlx2 the X coordinate that specifies the second control point
     *               of a {@code CubicCurve2D}
     * @param ctrly2 the Y coordinate that specifies the second control point
     *               of a {@code CubicCurve2D}
     * @param x2 the X coordinate that specifies the end point
     *           of a {@code CubicCurve2D}
     * @param y2 the Y coordinate that specifies the end point
     *           of a {@code CubicCurve2D}
     * @return the flatness of the {@code CubicCurve2D}
     *          represented by the specified coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static double getFlatnessSq(double x1, double y1,
                                       double ctrlx1, double ctrly1,
                                       double ctrlx2, double ctrly2,
                                       double x2, double y2) {

    /**
     * Returns the square of the flatness of the cubic curve specified
     * by the indicated control points. The flatness is the maximum distance
     * of a control point from the line connecting the end points.
     *
     * @param x1 the X coordinate that specifies the start point
     *           of a {@code CubicCurve2D}
     * @param y1 the Y coordinate that specifies the start point
     *           of a {@code CubicCurve2D}
     * @param ctrlx1 the X coordinate that specifies the first control point
     *               of a {@code CubicCurve2D}
     * @param ctrly1 the Y coordinate that specifies the first control point
     *               of a {@code CubicCurve2D}
     * @param ctrlx2 the X coordinate that specifies the second control point
     *               of a {@code CubicCurve2D}
     * @param ctrly2 the Y coordinate that specifies the second control point
     *               of a {@code CubicCurve2D}
     * @param x2 the X coordinate that specifies the end point
     *           of a {@code CubicCurve2D}
     * @param y2 the Y coordinate that specifies the end point
     *           of a {@code CubicCurve2D}
     * @return the square of the flatness of the {@code CubicCurve2D}
     *          represented by the specified coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public void setCurve(CubicCurve2D c) {

    /**
     * Sets the location of the end points and control points of this curve
     * to the same as those in the specified <code>CubicCurve2D</code>.
     * @param c the specified <code>CubicCurve2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public void setCurve(Point2D[] pts, int offset) {

    /**
     * Sets the location of the end points and control points of this curve
     * to the coordinates of the <code>Point2D</code> objects at the specified
     * offset in the specified array.
     * @param pts an array of <code>Point2D</code> objects
     * @param offset  the index of <code>pts</code> from which to begin setting
     *          the end points and control points of this curve to the
     *          points contained in <code>pts</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public void setCurve(Point2D p1, Point2D cp1, Point2D cp2, Point2D p2) {

    /**
     * Sets the location of the end points and control points of this curve
     * to the specified <code>Point2D</code> coordinates.
     * @param p1 the first specified <code>Point2D</code> used to set the
     *          start point of this curve
     * @param cp1 the second specified <code>Point2D</code> used to set the
     *          first control point of this curve
     * @param cp2 the third specified <code>Point2D</code> used to set the
     *          second control point of this curve
     * @param p2 the fourth specified <code>Point2D</code> used to set the
     *          end point of this curve
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public void setCurve(double[] coords, int offset) {

    /**
     * Sets the location of the end points and control points of this curve
     * to the double coordinates at the specified offset in the specified
     * array.
     * @param coords a double array containing coordinates
     * @param offset the index of <code>coords</code> from which to begin
     *          setting the end points and control points of this curve
     *          to the coordinates contained in <code>coords</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract void setCurve(double x1, double y1,
                                  double ctrlx1, double ctrly1,
                                  double ctrlx2, double ctrly2,
                                  double x2, double y2);

    /**
     * Sets the location of the end points and control points of this curve
     * to the specified double coordinates.
     *
     * @param x1 the X coordinate used to set the start point
     *           of this {@code CubicCurve2D}
     * @param y1 the Y coordinate used to set the start point
     *           of this {@code CubicCurve2D}
     * @param ctrlx1 the X coordinate used to set the first control point
     *               of this {@code CubicCurve2D}
     * @param ctrly1 the Y coordinate used to set the first control point
     *               of this {@code CubicCurve2D}
     * @param ctrlx2 the X coordinate used to set the second control point
     *               of this {@code CubicCurve2D}
     * @param ctrly2 the Y coordinate used to set the second control point
     *               of this {@code CubicCurve2D}
     * @param x2 the X coordinate used to set the end point
     *           of this {@code CubicCurve2D}
     * @param y2 the Y coordinate used to set the end point
     *           of this {@code CubicCurve2D}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract Point2D getP2();

    /**
     * Returns the end point.
     * @return a {@code Point2D} that is the end point of
     *         the {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getY2();

    /**
     * Returns the Y coordinate of the end point in double precision.
     * @return the Y coordinate of the end point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getX2();

    /**
     * Returns the X coordinate of the end point in double precision.
     * @return the X coordinate of the end point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract Point2D getCtrlP2();

    /**
     * Returns the second control point.
     * @return a {@code Point2D} that is the second control point of
     *         the {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getCtrlY2();

    /**
     * Returns the Y coordinate of the second control point
     * in double precision.
     * @return the Y coordinate of the second control point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getCtrlX2();

    /**
     * Returns the X coordinate of the second control point
     * in double precision.
     * @return the X coordinate of the second control point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract Point2D getCtrlP1();

    /**
     * Returns the first control point.
     * @return a {@code Point2D} that is the first control point of
     *         the {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getCtrlY1();

    /**
     * Returns the Y coordinate of the first control point in double precision.
     * @return the Y coordinate of the first control point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getCtrlX1();

    /**
     * Returns the X coordinate of the first control point in double precision.
     * @return the X coordinate of the first control point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract Point2D getP1();

    /**
     * Returns the start point.
     * @return a {@code Point2D} that is the start point of
     *         the {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getY1();

    /**
     * Returns the Y coordinate of the start point in double precision.
     * @return the Y coordinate of the start point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public abstract double getX1();

    /**
     * Returns the X coordinate of the start point in double precision.
     * @return the X coordinate of the start point of the
     *         {@code CubicCurve2D}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    protected CubicCurve2D() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessor
     * methods below.
     *
     * @see java.awt.geom.CubicCurve2D.Float
     * @see java.awt.geom.CubicCurve2D.Double
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public void setCurve(double x1, double y1,
                             double ctrlx1, double ctrly1,
                             double ctrlx2, double ctrly2,
                             double x2, double y2)

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getCtrlP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getCtrlP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Double(double x1, double y1,
                      double ctrlx1, double ctrly1,
                      double ctrlx2, double ctrly2,
                      double x2, double y2)

        /**
         * Constructs and initializes a {@code CubicCurve2D} from
         * the specified {@code double} coordinates.
         *
         * @param x1 the X coordinate for the start point
         *           of the resulting {@code CubicCurve2D}
         * @param y1 the Y coordinate for the start point
         *           of the resulting {@code CubicCurve2D}
         * @param ctrlx1 the X coordinate for the first control point
         *               of the resulting {@code CubicCurve2D}
         * @param ctrly1 the Y coordinate for the first control point
         *               of the resulting {@code CubicCurve2D}
         * @param ctrlx2 the X coordinate for the second control point
         *               of the resulting {@code CubicCurve2D}
         * @param ctrly2 the Y coordinate for the second control point
         *               of the resulting {@code CubicCurve2D}
         * @param x2 the X coordinate for the end point
         *           of the resulting {@code CubicCurve2D}
         * @param y2 the Y coordinate for the end point
         *           of the resulting {@code CubicCurve2D}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Double() {

        /**
         * Constructs and initializes a CubicCurve with coordinates
         * (0, 0, 0, 0, 0, 0, 0, 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double y2;

        /**
         * The Y coordinate of the end point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double x2;

        /**
         * The X coordinate of the end point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double ctrly2;

        /**
         * The Y coordinate of the second control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double ctrlx2;

        /**
         * The X coordinate of the second control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double ctrly1;

        /**
         * The Y coordinate of the first control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double ctrlx1;

        /**
         * The X coordinate of the first control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double y1;

        /**
         * The Y coordinate of the start point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static class Double extends CubicCurve2D implements Serializable {

    /**
     * A cubic parametric curve segment specified with
     * {@code double} coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public void setCurve(float x1, float y1,
                             float ctrlx1, float ctrly1,
                             float ctrlx2, float ctrly2,
                             float x2, float y2)

        /**
         * Sets the location of the end points and control points
         * of this curve to the specified {@code float} coordinates.
         *
         * @param x1 the X coordinate used to set the start point
         *           of this {@code CubicCurve2D}
         * @param y1 the Y coordinate used to set the start point
         *           of this {@code CubicCurve2D}
         * @param ctrlx1 the X coordinate used to set the first control point
         *               of this {@code CubicCurve2D}
         * @param ctrly1 the Y coordinate used to set the first control point
         *               of this {@code CubicCurve2D}
         * @param ctrlx2 the X coordinate used to set the second control point
         *               of this {@code CubicCurve2D}
         * @param ctrly2 the Y coordinate used to set the second control point
         *               of this {@code CubicCurve2D}
         * @param x2 the X coordinate used to set the end point
         *           of this {@code CubicCurve2D}
         * @param y2 the Y coordinate used to set the end point
         *           of this {@code CubicCurve2D}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public void setCurve(double x1, double y1,
                             double ctrlx1, double ctrly1,
                             double ctrlx2, double ctrly2,
                             double x2, double y2)

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getCtrlP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getCtrlP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getCtrlX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Point2D getP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public double getX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Float(float x1, float y1,
                     float ctrlx1, float ctrly1,
                     float ctrlx2, float ctrly2,
                     float x2, float y2)

        /**
         * Constructs and initializes a {@code CubicCurve2D} from
         * the specified {@code float} coordinates.
         *
         * @param x1 the X coordinate for the start point
         *           of the resulting {@code CubicCurve2D}
         * @param y1 the Y coordinate for the start point
         *           of the resulting {@code CubicCurve2D}
         * @param ctrlx1 the X coordinate for the first control point
         *               of the resulting {@code CubicCurve2D}
         * @param ctrly1 the Y coordinate for the first control point
         *               of the resulting {@code CubicCurve2D}
         * @param ctrlx2 the X coordinate for the second control point
         *               of the resulting {@code CubicCurve2D}
         * @param ctrly2 the Y coordinate for the second control point
         *               of the resulting {@code CubicCurve2D}
         * @param x2 the X coordinate for the end point
         *           of the resulting {@code CubicCurve2D}
         * @param y2 the Y coordinate for the end point
         *           of the resulting {@code CubicCurve2D}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public Float() {

        /**
         * Constructs and initializes a CubicCurve with coordinates
         * (0, 0, 0, 0, 0, 0, 0, 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public float y2;

        /**
         * The Y coordinate of the end point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public float x2;

        /**
         * The X coordinate of the end point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public float ctrly2;

        /**
         * The Y coordinate of the second control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public float ctrlx2;

        /**
         * The X coordinate of the second control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public float ctrly1;

        /**
         * The Y coordinate of the first control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public float ctrlx1;

        /**
         * The X coordinate of the first control point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
        public float y1;

        /**
         * The Y coordinate of the start point
         * of the cubic curve segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
    public static class Float extends CubicCurve2D implements Serializable {

    /**
     * A cubic parametric curve segment specified with
     * {@code float} coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/CubicCurve2D.java
public abstract class CubicCurve2D implements Shape, Cloneable {

/**
 * The <code>CubicCurve2D</code> class defines a cubic parametric curve
 * segment in {@code (x,y)} coordinate space.
 * <p>
 * This class is only the abstract superclass for all objects which
 * store a 2D cubic curve segment.
 * The actual storage representation of the coordinates is left to
 * the subclass.
 *
 * @author      Jim Graham
 * @since 1.2
 */
