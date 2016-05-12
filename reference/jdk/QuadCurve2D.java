_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public Object clone() {

    /**
     * Creates a new object of the same class and with the same contents
     * as this object.
     *
     * @return     a clone of this instance.
     * @exception  OutOfMemoryError            if there is not enough memory.
     * @see        java.lang.Cloneable
     * @since      1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public PathIterator getPathIterator(AffineTransform at, double flatness) {

    /**
     * Returns an iteration object that defines the boundary of the
     * flattened shape of this <code>QuadCurve2D</code>.
     * The iterator for this class is not multi-threaded safe,
     * which means that this <code>QuadCurve2D</code> class does not
     * guarantee that modifications to the geometry of this
     * <code>QuadCurve2D</code> object do not affect any iterations of
     * that geometry that are already in process.
     * @param at an optional <code>AffineTransform</code> to apply
     *          to the boundary of the shape
     * @param flatness the maximum distance that the control points for a
     *          subdivided curve can be with respect to a line connecting
     *          the end points of this curve before this curve is
     *          replaced by a straight line connecting the end points.
     * @return a <code>PathIterator</code> object that defines the
     *          flattened boundary of the shape.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public PathIterator getPathIterator(AffineTransform at) {

    /**
     * Returns an iteration object that defines the boundary of the
     * shape of this <code>QuadCurve2D</code>.
     * The iterator for this class is not multi-threaded safe,
     * which means that this <code>QuadCurve2D</code> class does not
     * guarantee that modifications to the geometry of this
     * <code>QuadCurve2D</code> object do not affect any iterations of
     * that geometry that are already in process.
     * @param at an optional {@link AffineTransform} to apply to the
     *          shape boundary
     * @return a {@link PathIterator} object that defines the boundary
     *          of the shape.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public Rectangle getBounds() {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public boolean contains(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public boolean contains(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public boolean intersects(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public boolean intersects(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    private static boolean inwards(int pttag, int opt1tag, int opt2tag) {

    /**
     * Determine if the pttag represents a coordinate that is already
     * in its test range, or is on the border with either of the two
     * opttags representing another coordinate that is "towards the
     * inside" of that test range.  In other words, are either of the
     * two "opt" points "drawing the pt inward"?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    private static int getTag(double coord, double low, double high) {

    /**
     * Determine where coord lies with respect to the range from
     * low to high.  It is assumed that low &lt;= high.  The return
     * value is one of the 5 values BELOW, LOWEDGE, INSIDE, HIGHEDGE,
     * or ABOVE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    private static int evalQuadratic(double vals[], int num,
                                     boolean include0,
                                     boolean include1,
                                     double inflect[],
                                     double c1, double ctrl, double c2) {

    /**
     * Evaluate the t values in the first num slots of the vals[] array
     * and place the evaluated values back into the same array.  Only
     * evaluate t values that are within the range &lt;0, 1&gt;, including
     * the 0 and 1 ends of the range iff the include0 or include1
     * booleans are true.  If an "inflection" equation is handed in,
     * then any points which represent a point of inflection for that
     * quadratic equation are also ignored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    private static void fillEqn(double eqn[], double val,
                                double c1, double cp, double c2) {

    /**
     * Fill an array with the coefficients of the parametric equation
     * in t, ready for solving against val with solveQuadratic.
     * We currently have:
     *     val = Py(t) = C1*(1-t)^2 + 2*CP*t*(1-t) + C2*t^2
     *                 = C1 - 2*C1*t + C1*t^2 + 2*CP*t - 2*CP*t^2 + C2*t^2
     *                 = C1 + (2*CP - 2*C1)*t + (C1 - 2*CP + C2)*t^2
     *               0 = (C1 - val) + (2*CP - 2*C1)*t + (C1 - 2*CP + C2)*t^2
     *               0 = C + Bt + At^2
     *     C = C1 - val
     *     B = 2*CP - 2*C1
     *     A = C1 - 2*CP + C2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public boolean contains(Point2D p) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public boolean contains(double x, double y) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static int solveQuadratic(double eqn[], double res[]) {

    /**
     * Solves the quadratic whose coefficients are in the <code>eqn</code>
     * array and places the non-complex roots into the <code>res</code>
     * array, returning the number of roots.
     * The quadratic solved is represented by the equation:
     * <pre>
     *     eqn = {C, B, A};
     *     ax^2 + bx + c = 0
     * </pre>
     * A return value of <code>-1</code> is used to distinguish a constant
     * equation, which might be always 0 or never 0, from an equation that
     * has no zeroes.
     * @param eqn the specified array of coefficients to use to solve
     *        the quadratic equation
     * @param res the array that contains the non-complex roots
     *        resulting from the solution of the quadratic equation
     * @return the number of roots, or <code>-1</code> if the equation is
     *  a constant.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static int solveQuadratic(double eqn[]) {

    /**
     * Solves the quadratic whose coefficients are in the <code>eqn</code>
     * array and places the non-complex roots back into the same array,
     * returning the number of roots.  The quadratic solved is represented
     * by the equation:
     * <pre>
     *     eqn = {C, B, A};
     *     ax^2 + bx + c = 0
     * </pre>
     * A return value of <code>-1</code> is used to distinguish a constant
     * equation, which might be always 0 or never 0, from an equation that
     * has no zeroes.
     * @param eqn the array that contains the quadratic coefficients
     * @return the number of roots, or <code>-1</code> if the equation is
     *          a constant
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static void subdivide(double src[], int srcoff,
                                 double left[], int leftoff,
                                 double right[], int rightoff) {

    /**
     * Subdivides the quadratic curve specified by the coordinates
     * stored in the <code>src</code> array at indices
     * <code>srcoff</code> through <code>srcoff</code>&nbsp;+&nbsp;5
     * and stores the resulting two subdivided curves into the two
     * result arrays at the corresponding indices.
     * Either or both of the <code>left</code> and <code>right</code>
     * arrays can be <code>null</code> or a reference to the same array
     * and offset as the <code>src</code> array.
     * Note that the last point in the first subdivided curve is the
     * same as the first point in the second subdivided curve.  Thus,
     * it is possible to pass the same array for <code>left</code> and
     * <code>right</code> and to use offsets such that
     * <code>rightoff</code> equals <code>leftoff</code> + 4 in order
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static void subdivide(QuadCurve2D src,
                                 QuadCurve2D left,
                                 QuadCurve2D right) {

    /**
     * Subdivides the quadratic curve specified by the <code>src</code>
     * parameter and stores the resulting two subdivided curves into the
     * <code>left</code> and <code>right</code> curve parameters.
     * Either or both of the <code>left</code> and <code>right</code>
     * objects can be the same as the <code>src</code> object or
     * <code>null</code>.
     * @param src the quadratic curve to be subdivided
     * @param left the <code>QuadCurve2D</code> object for storing the
     *          left or first half of the subdivided curve
     * @param right the <code>QuadCurve2D</code> object for storing the
     *          right or second half of the subdivided curve
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public void subdivide(QuadCurve2D left, QuadCurve2D right) {

    /**
     * Subdivides this <code>QuadCurve2D</code> and stores the resulting
     * two subdivided curves into the <code>left</code> and
     * <code>right</code> curve parameters.
     * Either or both of the <code>left</code> and <code>right</code>
     * objects can be the same as this <code>QuadCurve2D</code> or
     * <code>null</code>.
     * @param left the <code>QuadCurve2D</code> object for storing the
     * left or first half of the subdivided curve
     * @param right the <code>QuadCurve2D</code> object for storing the
     * right or second half of the subdivided curve
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public double getFlatness() {

    /**
     * Returns the flatness, or maximum distance of a
     * control point from the line connecting the end points, of this
     * <code>QuadCurve2D</code>.
     * @return the flatness of this <code>QuadCurve2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public double getFlatnessSq() {

    /**
     * Returns the square of the flatness, or maximum distance of a
     * control point from the line connecting the end points, of this
     * <code>QuadCurve2D</code>.
     * @return the square of the flatness of this
     *          <code>QuadCurve2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static double getFlatness(double coords[], int offset) {

    /**
     * Returns the flatness, or maximum distance of a
     * control point from the line connecting the end points, of the
     * quadratic curve specified by the control points stored in the
     * indicated array at the indicated index.
     * @param coords an array containing coordinate values
     * @param offset the index into <code>coords</code> from which to
     *          start getting the coordinate values
     * @return the flatness of a quadratic curve defined by the
     *          specified array at the specified offset.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static double getFlatnessSq(double coords[], int offset) {

    /**
     * Returns the square of the flatness, or maximum distance of a
     * control point from the line connecting the end points, of the
     * quadratic curve specified by the control points stored in the
     * indicated array at the indicated index.
     * @param coords an array containing coordinate values
     * @param offset the index into <code>coords</code> from which to
     *          to start getting the values from the array
     * @return the flatness of the quadratic curve that is defined by the
     *          values in the specified array at the specified index.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static double getFlatness(double x1, double y1,
                                     double ctrlx, double ctrly,
                                     double x2, double y2) {

    /**
     * Returns the flatness, or maximum distance of a
     * control point from the line connecting the end points, of the
     * quadratic curve specified by the indicated control points.
     *
     * @param x1 the X coordinate of the start point
     * @param y1 the Y coordinate of the start point
     * @param ctrlx the X coordinate of the control point
     * @param ctrly the Y coordinate of the control point
     * @param x2 the X coordinate of the end point
     * @param y2 the Y coordinate of the end point
     * @return the flatness of the quadratic curve defined by the
     *          specified coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static double getFlatnessSq(double x1, double y1,
                                       double ctrlx, double ctrly,
                                       double x2, double y2) {

    /**
     * Returns the square of the flatness, or maximum distance of a
     * control point from the line connecting the end points, of the
     * quadratic curve specified by the indicated control points.
     *
     * @param x1 the X coordinate of the start point
     * @param y1 the Y coordinate of the start point
     * @param ctrlx the X coordinate of the control point
     * @param ctrly the Y coordinate of the control point
     * @param x2 the X coordinate of the end point
     * @param y2 the Y coordinate of the end point
     * @return the square of the flatness of the quadratic curve
     *          defined by the specified coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public void setCurve(QuadCurve2D c) {

    /**
     * Sets the location of the end points and control point of this
     * <code>QuadCurve2D</code> to the same as those in the specified
     * <code>QuadCurve2D</code>.
     * @param c the specified <code>QuadCurve2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public void setCurve(Point2D[] pts, int offset) {

    /**
     * Sets the location of the end points and control points of this
     * <code>QuadCurve2D</code> to the coordinates of the
     * <code>Point2D</code> objects at the specified offset in
     * the specified array.
     * @param pts an array containing <code>Point2D</code> that define
     *          coordinate values
     * @param offset the index into <code>pts</code> from which to start
     *          getting the coordinate values and assigning them to this
     *          <code>QuadCurve2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public void setCurve(Point2D p1, Point2D cp, Point2D p2) {

    /**
     * Sets the location of the end points and control point of this
     * <code>QuadCurve2D</code> to the specified <code>Point2D</code>
     * coordinates.
     * @param p1 the start point
     * @param cp the control point
     * @param p2 the end point
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public void setCurve(double[] coords, int offset) {

    /**
     * Sets the location of the end points and control points of this
     * <code>QuadCurve2D</code> to the <code>double</code> coordinates at
     * the specified offset in the specified array.
     * @param coords the array containing coordinate values
     * @param offset the index into the array from which to start
     *          getting the coordinate values and assigning them to this
     *          <code>QuadCurve2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract void setCurve(double x1, double y1,
                                  double ctrlx, double ctrly,
                                  double x2, double y2);

    /**
     * Sets the location of the end points and control point of this curve
     * to the specified <code>double</code> coordinates.
     *
     * @param x1 the X coordinate of the start point
     * @param y1 the Y coordinate of the start point
     * @param ctrlx the X coordinate of the control point
     * @param ctrly the Y coordinate of the control point
     * @param x2 the X coordinate of the end point
     * @param y2 the Y coordinate of the end point
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract Point2D getP2();

    /**
     * Returns the end point.
     * @return a <code>Point</code> object that is the end point
     *          of this <code>Point2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract double getY2();

    /**
     * Returns the Y coordinate of the end point in
     * <code>double</code> precision.
     * @return the Y coordinate of the end point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract double getX2();

    /**
     * Returns the X coordinate of the end point in
     * <code>double</code> precision.
     * @return the x coordinate of the end point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract Point2D getCtrlPt();

    /**
     * Returns the control point.
     * @return a <code>Point2D</code> that is the control point of this
     *          <code>Point2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract double getCtrlY();

    /**
     * Returns the Y coordinate of the control point in
     * <code>double</code> precision.
     * @return the Y coordinate of the control point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract double getCtrlX();

    /**
     * Returns the X coordinate of the control point in
     * <code>double</code> precision.
     * @return X coordinate the control point
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract Point2D getP1();

    /**
     * Returns the start point.
     * @return a <code>Point2D</code> that is the start point of this
     *          <code>QuadCurve2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract double getY1();

    /**
     * Returns the Y coordinate of the start point in
     * <code>double</code> precision.
     * @return the Y coordinate of the start point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract double getX1();

    /**
     * Returns the X coordinate of the start point in
     * <code>double</code> in precision.
     * @return the X coordinate of the start point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    protected QuadCurve2D() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessor
     * methods below.
     *
     * @see java.awt.geom.QuadCurve2D.Float
     * @see java.awt.geom.QuadCurve2D.Double
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public void setCurve(double x1, double y1,
                             double ctrlx, double ctrly,
                             double x2, double y2)

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Point2D getP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Point2D getCtrlPt() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getCtrlY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getCtrlX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Point2D getP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Double(double x1, double y1,
                      double ctrlx, double ctrly,
                      double x2, double y2)

        /**
         * Constructs and initializes a <code>QuadCurve2D</code> from the
         * specified {@code double} coordinates.
         *
         * @param x1 the X coordinate of the start point
         * @param y1 the Y coordinate of the start point
         * @param ctrlx the X coordinate of the control point
         * @param ctrly the Y coordinate of the control point
         * @param x2 the X coordinate of the end point
         * @param y2 the Y coordinate of the end point
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Double() {

        /**
         * Constructs and initializes a <code>QuadCurve2D</code> with
         * coordinates (0, 0, 0, 0, 0, 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double y2;

        /**
         * The Y coordinate of the end point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double x2;

        /**
         * The X coordinate of the end point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double ctrly;

        /**
         * The Y coordinate of the control point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double ctrlx;

        /**
         * The X coordinate of the control point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double y1;

        /**
         * The Y coordinate of the start point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static class Double extends QuadCurve2D implements Serializable {

    /**
     * A quadratic parametric curve segment specified with
     * {@code double} coordinates.
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public void setCurve(float x1, float y1,
                             float ctrlx, float ctrly,
                             float x2, float y2)

        /**
         * Sets the location of the end points and control point of this curve
         * to the specified {@code float} coordinates.
         *
         * @param x1 the X coordinate of the start point
         * @param y1 the Y coordinate of the start point
         * @param ctrlx the X coordinate of the control point
         * @param ctrly the Y coordinate of the control point
         * @param x2 the X coordinate of the end point
         * @param y2 the Y coordinate of the end point
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public void setCurve(double x1, double y1,
                             double ctrlx, double ctrly,
                             double x2, double y2)

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Point2D getP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Point2D getCtrlPt() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getCtrlY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getCtrlX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Point2D getP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Float(float x1, float y1,
                     float ctrlx, float ctrly,
                     float x2, float y2)

        /**
         * Constructs and initializes a <code>QuadCurve2D</code> from the
         * specified {@code float} coordinates.
         *
         * @param x1 the X coordinate of the start point
         * @param y1 the Y coordinate of the start point
         * @param ctrlx the X coordinate of the control point
         * @param ctrly the Y coordinate of the control point
         * @param x2 the X coordinate of the end point
         * @param y2 the Y coordinate of the end point
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Float() {

        /**
         * Constructs and initializes a <code>QuadCurve2D</code> with
         * coordinates (0, 0, 0, 0, 0, 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public float y2;

        /**
         * The Y coordinate of the end point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public float x2;

        /**
         * The X coordinate of the end point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public float ctrly;

        /**
         * The Y coordinate of the control point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public float ctrlx;

        /**
         * The X coordinate of the control point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public float y1;

        /**
         * The Y coordinate of the start point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static class Float extends QuadCurve2D implements Serializable {

    /**
     * A quadratic parametric curve segment specified with
     * {@code float} coordinates.
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
public abstract class QuadCurve2D implements Shape, Cloneable {

/**
 * The <code>QuadCurve2D</code> class defines a quadratic parametric curve
 * segment in {@code (x,y)} coordinate space.
 * <p>
 * This class is only the abstract superclass for all objects that
 * store a 2D quadratic curve segment.
 * The actual storage representation of the coordinates is left to
 * the subclass.
 *
 * @author      Jim Graham
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public Object clone() {

    /**
     * Creates a new object of the same class and with the same contents
     * as this object.
     *
     * @return     a clone of this instance.
     * @exception  OutOfMemoryError            if there is not enough memory.
     * @see        java.lang.Cloneable
     * @since      1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public PathIterator getPathIterator(AffineTransform at, double flatness) {

    /**
     * Returns an iteration object that defines the boundary of the
     * flattened shape of this <code>QuadCurve2D</code>.
     * The iterator for this class is not multi-threaded safe,
     * which means that this <code>QuadCurve2D</code> class does not
     * guarantee that modifications to the geometry of this
     * <code>QuadCurve2D</code> object do not affect any iterations of
     * that geometry that are already in process.
     * @param at an optional <code>AffineTransform</code> to apply
     *          to the boundary of the shape
     * @param flatness the maximum distance that the control points for a
     *          subdivided curve can be with respect to a line connecting
     *          the end points of this curve before this curve is
     *          replaced by a straight line connecting the end points.
     * @return a <code>PathIterator</code> object that defines the
     *          flattened boundary of the shape.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public PathIterator getPathIterator(AffineTransform at) {

    /**
     * Returns an iteration object that defines the boundary of the
     * shape of this <code>QuadCurve2D</code>.
     * The iterator for this class is not multi-threaded safe,
     * which means that this <code>QuadCurve2D</code> class does not
     * guarantee that modifications to the geometry of this
     * <code>QuadCurve2D</code> object do not affect any iterations of
     * that geometry that are already in process.
     * @param at an optional {@link AffineTransform} to apply to the
     *          shape boundary
     * @return a {@link PathIterator} object that defines the boundary
     *          of the shape.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public Rectangle getBounds() {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public boolean contains(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public boolean contains(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public boolean intersects(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public boolean intersects(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    private static boolean inwards(int pttag, int opt1tag, int opt2tag) {

    /**
     * Determine if the pttag represents a coordinate that is already
     * in its test range, or is on the border with either of the two
     * opttags representing another coordinate that is "towards the
     * inside" of that test range.  In other words, are either of the
     * two "opt" points "drawing the pt inward"?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    private static int getTag(double coord, double low, double high) {

    /**
     * Determine where coord lies with respect to the range from
     * low to high.  It is assumed that low &lt;= high.  The return
     * value is one of the 5 values BELOW, LOWEDGE, INSIDE, HIGHEDGE,
     * or ABOVE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    private static int evalQuadratic(double vals[], int num,
                                     boolean include0,
                                     boolean include1,
                                     double inflect[],
                                     double c1, double ctrl, double c2) {

    /**
     * Evaluate the t values in the first num slots of the vals[] array
     * and place the evaluated values back into the same array.  Only
     * evaluate t values that are within the range &lt;0, 1&gt;, including
     * the 0 and 1 ends of the range iff the include0 or include1
     * booleans are true.  If an "inflection" equation is handed in,
     * then any points which represent a point of inflection for that
     * quadratic equation are also ignored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    private static void fillEqn(double eqn[], double val,
                                double c1, double cp, double c2) {

    /**
     * Fill an array with the coefficients of the parametric equation
     * in t, ready for solving against val with solveQuadratic.
     * We currently have:
     *     val = Py(t) = C1*(1-t)^2 + 2*CP*t*(1-t) + C2*t^2
     *                 = C1 - 2*C1*t + C1*t^2 + 2*CP*t - 2*CP*t^2 + C2*t^2
     *                 = C1 + (2*CP - 2*C1)*t + (C1 - 2*CP + C2)*t^2
     *               0 = (C1 - val) + (2*CP - 2*C1)*t + (C1 - 2*CP + C2)*t^2
     *               0 = C + Bt + At^2
     *     C = C1 - val
     *     B = 2*CP - 2*C1
     *     A = C1 - 2*CP + C2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public boolean contains(Point2D p) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public boolean contains(double x, double y) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static int solveQuadratic(double eqn[], double res[]) {

    /**
     * Solves the quadratic whose coefficients are in the <code>eqn</code>
     * array and places the non-complex roots into the <code>res</code>
     * array, returning the number of roots.
     * The quadratic solved is represented by the equation:
     * <pre>
     *     eqn = {C, B, A};
     *     ax^2 + bx + c = 0
     * </pre>
     * A return value of <code>-1</code> is used to distinguish a constant
     * equation, which might be always 0 or never 0, from an equation that
     * has no zeroes.
     * @param eqn the specified array of coefficients to use to solve
     *        the quadratic equation
     * @param res the array that contains the non-complex roots
     *        resulting from the solution of the quadratic equation
     * @return the number of roots, or <code>-1</code> if the equation is
     *  a constant.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static int solveQuadratic(double eqn[]) {

    /**
     * Solves the quadratic whose coefficients are in the <code>eqn</code>
     * array and places the non-complex roots back into the same array,
     * returning the number of roots.  The quadratic solved is represented
     * by the equation:
     * <pre>
     *     eqn = {C, B, A};
     *     ax^2 + bx + c = 0
     * </pre>
     * A return value of <code>-1</code> is used to distinguish a constant
     * equation, which might be always 0 or never 0, from an equation that
     * has no zeroes.
     * @param eqn the array that contains the quadratic coefficients
     * @return the number of roots, or <code>-1</code> if the equation is
     *          a constant
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static void subdivide(double src[], int srcoff,
                                 double left[], int leftoff,
                                 double right[], int rightoff) {

    /**
     * Subdivides the quadratic curve specified by the coordinates
     * stored in the <code>src</code> array at indices
     * <code>srcoff</code> through <code>srcoff</code>&nbsp;+&nbsp;5
     * and stores the resulting two subdivided curves into the two
     * result arrays at the corresponding indices.
     * Either or both of the <code>left</code> and <code>right</code>
     * arrays can be <code>null</code> or a reference to the same array
     * and offset as the <code>src</code> array.
     * Note that the last point in the first subdivided curve is the
     * same as the first point in the second subdivided curve.  Thus,
     * it is possible to pass the same array for <code>left</code> and
     * <code>right</code> and to use offsets such that
     * <code>rightoff</code> equals <code>leftoff</code> + 4 in order
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static void subdivide(QuadCurve2D src,
                                 QuadCurve2D left,
                                 QuadCurve2D right) {

    /**
     * Subdivides the quadratic curve specified by the <code>src</code>
     * parameter and stores the resulting two subdivided curves into the
     * <code>left</code> and <code>right</code> curve parameters.
     * Either or both of the <code>left</code> and <code>right</code>
     * objects can be the same as the <code>src</code> object or
     * <code>null</code>.
     * @param src the quadratic curve to be subdivided
     * @param left the <code>QuadCurve2D</code> object for storing the
     *          left or first half of the subdivided curve
     * @param right the <code>QuadCurve2D</code> object for storing the
     *          right or second half of the subdivided curve
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public void subdivide(QuadCurve2D left, QuadCurve2D right) {

    /**
     * Subdivides this <code>QuadCurve2D</code> and stores the resulting
     * two subdivided curves into the <code>left</code> and
     * <code>right</code> curve parameters.
     * Either or both of the <code>left</code> and <code>right</code>
     * objects can be the same as this <code>QuadCurve2D</code> or
     * <code>null</code>.
     * @param left the <code>QuadCurve2D</code> object for storing the
     * left or first half of the subdivided curve
     * @param right the <code>QuadCurve2D</code> object for storing the
     * right or second half of the subdivided curve
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public double getFlatness() {

    /**
     * Returns the flatness, or maximum distance of a
     * control point from the line connecting the end points, of this
     * <code>QuadCurve2D</code>.
     * @return the flatness of this <code>QuadCurve2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public double getFlatnessSq() {

    /**
     * Returns the square of the flatness, or maximum distance of a
     * control point from the line connecting the end points, of this
     * <code>QuadCurve2D</code>.
     * @return the square of the flatness of this
     *          <code>QuadCurve2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static double getFlatness(double coords[], int offset) {

    /**
     * Returns the flatness, or maximum distance of a
     * control point from the line connecting the end points, of the
     * quadratic curve specified by the control points stored in the
     * indicated array at the indicated index.
     * @param coords an array containing coordinate values
     * @param offset the index into <code>coords</code> from which to
     *          start getting the coordinate values
     * @return the flatness of a quadratic curve defined by the
     *          specified array at the specified offset.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static double getFlatnessSq(double coords[], int offset) {

    /**
     * Returns the square of the flatness, or maximum distance of a
     * control point from the line connecting the end points, of the
     * quadratic curve specified by the control points stored in the
     * indicated array at the indicated index.
     * @param coords an array containing coordinate values
     * @param offset the index into <code>coords</code> from which to
     *          to start getting the values from the array
     * @return the flatness of the quadratic curve that is defined by the
     *          values in the specified array at the specified index.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static double getFlatness(double x1, double y1,
                                     double ctrlx, double ctrly,
                                     double x2, double y2) {

    /**
     * Returns the flatness, or maximum distance of a
     * control point from the line connecting the end points, of the
     * quadratic curve specified by the indicated control points.
     *
     * @param x1 the X coordinate of the start point
     * @param y1 the Y coordinate of the start point
     * @param ctrlx the X coordinate of the control point
     * @param ctrly the Y coordinate of the control point
     * @param x2 the X coordinate of the end point
     * @param y2 the Y coordinate of the end point
     * @return the flatness of the quadratic curve defined by the
     *          specified coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static double getFlatnessSq(double x1, double y1,
                                       double ctrlx, double ctrly,
                                       double x2, double y2) {

    /**
     * Returns the square of the flatness, or maximum distance of a
     * control point from the line connecting the end points, of the
     * quadratic curve specified by the indicated control points.
     *
     * @param x1 the X coordinate of the start point
     * @param y1 the Y coordinate of the start point
     * @param ctrlx the X coordinate of the control point
     * @param ctrly the Y coordinate of the control point
     * @param x2 the X coordinate of the end point
     * @param y2 the Y coordinate of the end point
     * @return the square of the flatness of the quadratic curve
     *          defined by the specified coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public void setCurve(QuadCurve2D c) {

    /**
     * Sets the location of the end points and control point of this
     * <code>QuadCurve2D</code> to the same as those in the specified
     * <code>QuadCurve2D</code>.
     * @param c the specified <code>QuadCurve2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public void setCurve(Point2D[] pts, int offset) {

    /**
     * Sets the location of the end points and control points of this
     * <code>QuadCurve2D</code> to the coordinates of the
     * <code>Point2D</code> objects at the specified offset in
     * the specified array.
     * @param pts an array containing <code>Point2D</code> that define
     *          coordinate values
     * @param offset the index into <code>pts</code> from which to start
     *          getting the coordinate values and assigning them to this
     *          <code>QuadCurve2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public void setCurve(Point2D p1, Point2D cp, Point2D p2) {

    /**
     * Sets the location of the end points and control point of this
     * <code>QuadCurve2D</code> to the specified <code>Point2D</code>
     * coordinates.
     * @param p1 the start point
     * @param cp the control point
     * @param p2 the end point
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public void setCurve(double[] coords, int offset) {

    /**
     * Sets the location of the end points and control points of this
     * <code>QuadCurve2D</code> to the <code>double</code> coordinates at
     * the specified offset in the specified array.
     * @param coords the array containing coordinate values
     * @param offset the index into the array from which to start
     *          getting the coordinate values and assigning them to this
     *          <code>QuadCurve2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract void setCurve(double x1, double y1,
                                  double ctrlx, double ctrly,
                                  double x2, double y2);

    /**
     * Sets the location of the end points and control point of this curve
     * to the specified <code>double</code> coordinates.
     *
     * @param x1 the X coordinate of the start point
     * @param y1 the Y coordinate of the start point
     * @param ctrlx the X coordinate of the control point
     * @param ctrly the Y coordinate of the control point
     * @param x2 the X coordinate of the end point
     * @param y2 the Y coordinate of the end point
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract Point2D getP2();

    /**
     * Returns the end point.
     * @return a <code>Point</code> object that is the end point
     *          of this <code>Point2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract double getY2();

    /**
     * Returns the Y coordinate of the end point in
     * <code>double</code> precision.
     * @return the Y coordinate of the end point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract double getX2();

    /**
     * Returns the X coordinate of the end point in
     * <code>double</code> precision.
     * @return the x coordinate of the end point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract Point2D getCtrlPt();

    /**
     * Returns the control point.
     * @return a <code>Point2D</code> that is the control point of this
     *          <code>Point2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract double getCtrlY();

    /**
     * Returns the Y coordinate of the control point in
     * <code>double</code> precision.
     * @return the Y coordinate of the control point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract double getCtrlX();

    /**
     * Returns the X coordinate of the control point in
     * <code>double</code> precision.
     * @return X coordinate the control point
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract Point2D getP1();

    /**
     * Returns the start point.
     * @return a <code>Point2D</code> that is the start point of this
     *          <code>QuadCurve2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract double getY1();

    /**
     * Returns the Y coordinate of the start point in
     * <code>double</code> precision.
     * @return the Y coordinate of the start point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public abstract double getX1();

    /**
     * Returns the X coordinate of the start point in
     * <code>double</code> in precision.
     * @return the X coordinate of the start point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    protected QuadCurve2D() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessor
     * methods below.
     *
     * @see java.awt.geom.QuadCurve2D.Float
     * @see java.awt.geom.QuadCurve2D.Double
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public void setCurve(double x1, double y1,
                             double ctrlx, double ctrly,
                             double x2, double y2)

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Point2D getP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Point2D getCtrlPt() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getCtrlY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getCtrlX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Point2D getP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Double(double x1, double y1,
                      double ctrlx, double ctrly,
                      double x2, double y2)

        /**
         * Constructs and initializes a <code>QuadCurve2D</code> from the
         * specified {@code double} coordinates.
         *
         * @param x1 the X coordinate of the start point
         * @param y1 the Y coordinate of the start point
         * @param ctrlx the X coordinate of the control point
         * @param ctrly the Y coordinate of the control point
         * @param x2 the X coordinate of the end point
         * @param y2 the Y coordinate of the end point
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Double() {

        /**
         * Constructs and initializes a <code>QuadCurve2D</code> with
         * coordinates (0, 0, 0, 0, 0, 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double y2;

        /**
         * The Y coordinate of the end point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double x2;

        /**
         * The X coordinate of the end point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double ctrly;

        /**
         * The Y coordinate of the control point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double ctrlx;

        /**
         * The X coordinate of the control point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double y1;

        /**
         * The Y coordinate of the start point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static class Double extends QuadCurve2D implements Serializable {

    /**
     * A quadratic parametric curve segment specified with
     * {@code double} coordinates.
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public void setCurve(float x1, float y1,
                             float ctrlx, float ctrly,
                             float x2, float y2)

        /**
         * Sets the location of the end points and control point of this curve
         * to the specified {@code float} coordinates.
         *
         * @param x1 the X coordinate of the start point
         * @param y1 the Y coordinate of the start point
         * @param ctrlx the X coordinate of the control point
         * @param ctrly the Y coordinate of the control point
         * @param x2 the X coordinate of the end point
         * @param y2 the Y coordinate of the end point
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public void setCurve(double x1, double y1,
                             double ctrlx, double ctrly,
                             double x2, double y2)

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Point2D getP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Point2D getCtrlPt() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getCtrlY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getCtrlX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Point2D getP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public double getX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Float(float x1, float y1,
                     float ctrlx, float ctrly,
                     float x2, float y2)

        /**
         * Constructs and initializes a <code>QuadCurve2D</code> from the
         * specified {@code float} coordinates.
         *
         * @param x1 the X coordinate of the start point
         * @param y1 the Y coordinate of the start point
         * @param ctrlx the X coordinate of the control point
         * @param ctrly the Y coordinate of the control point
         * @param x2 the X coordinate of the end point
         * @param y2 the Y coordinate of the end point
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public Float() {

        /**
         * Constructs and initializes a <code>QuadCurve2D</code> with
         * coordinates (0, 0, 0, 0, 0, 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public float y2;

        /**
         * The Y coordinate of the end point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public float x2;

        /**
         * The X coordinate of the end point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public float ctrly;

        /**
         * The Y coordinate of the control point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public float ctrlx;

        /**
         * The X coordinate of the control point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
        public float y1;

        /**
         * The Y coordinate of the start point of the quadratic curve
         * segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
    public static class Float extends QuadCurve2D implements Serializable {

    /**
     * A quadratic parametric curve segment specified with
     * {@code float} coordinates.
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/QuadCurve2D.java
public abstract class QuadCurve2D implements Shape, Cloneable {

/**
 * The <code>QuadCurve2D</code> class defines a quadratic parametric curve
 * segment in {@code (x,y)} coordinate space.
 * <p>
 * This class is only the abstract superclass for all objects that
 * store a 2D quadratic curve segment.
 * The actual storage representation of the coordinates is left to
 * the subclass.
 *
 * @author      Jim Graham
 * @since 1.2
 */
