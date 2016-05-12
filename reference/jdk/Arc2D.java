_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public boolean equals(Object obj) {

    /**
     * Determines whether or not the specified <code>Object</code> is
     * equal to this <code>Arc2D</code>.  The specified
     * <code>Object</code> is equal to this <code>Arc2D</code>
     * if it is an instance of <code>Arc2D</code> and if its
     * location, size, arc extents and type are the same as this
     * <code>Arc2D</code>.
     * @param obj  an <code>Object</code> to be compared with this
     *             <code>Arc2D</code>.
     * @return  <code>true</code> if <code>obj</code> is an instance
     *          of <code>Arc2D</code> and has the same values;
     *          <code>false</code> otherwise.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public int hashCode() {

    /**
     * Returns the hashcode for this <code>Arc2D</code>.
     * @return the hashcode for this <code>Arc2D</code>.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public PathIterator getPathIterator(AffineTransform at) {

    /**
     * Returns an iteration object that defines the boundary of the
     * arc.
     * This iterator is multithread safe.
     * <code>Arc2D</code> guarantees that
     * modifications to the geometry of the arc
     * do not affect any iterations of that geometry that
     * are already in process.
     *
     * @param at an optional <CODE>AffineTransform</CODE> to be applied
     * to the coordinates as they are returned in the iteration, or null
     * if the untransformed coordinates are desired.
     *
     * @return A <CODE>PathIterator</CODE> that defines the arc's boundary.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public boolean contains(Rectangle2D r) {

    /**
     * Determines whether or not the interior of the arc entirely contains
     * the specified rectangle.
     *
     * @param r The <CODE>Rectangle2D</CODE> to test.
     *
     * @return <CODE>true</CODE> if the arc contains the rectangle,
     * <CODE>false</CODE> if the arc doesn't contain the rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public boolean contains(double x, double y, double w, double h) {

    /**
     * Determines whether or not the interior of the arc entirely contains
     * the specified rectangle.
     *
     * @param x The X coordinate of the rectangle's upper-left corner.
     * @param y The Y coordinate of the rectangle's upper-left corner.
     * @param w The width of the rectangle.
     * @param h The height of the rectangle.
     *
     * @return <CODE>true</CODE> if the arc contains the rectangle,
     * <CODE>false</CODE> if the arc doesn't contain the rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public boolean intersects(double x, double y, double w, double h) {

    /**
     * Determines whether or not the interior of the arc intersects
     * the interior of the specified rectangle.
     *
     * @param x The X coordinate of the rectangle's upper-left corner.
     * @param y The Y coordinate of the rectangle's upper-left corner.
     * @param w The width of the rectangle.
     * @param h The height of the rectangle.
     *
     * @return <CODE>true</CODE> if the arc intersects the rectangle,
     * <CODE>false</CODE> if the arc doesn't intersect the rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public boolean contains(double x, double y) {

    /**
     * Determines whether or not the specified point is inside the boundary
     * of the arc.
     *
     * @param x The X coordinate of the point to test.
     * @param y The Y coordinate of the point to test.
     *
     * @return <CODE>true</CODE> if the point lies within the bound of
     * the arc, <CODE>false</CODE> if the point lies outside of the
     * arc's bounds.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public boolean containsAngle(double angle) {

    /**
     * Determines whether or not the specified angle is within the
     * angular extents of the arc.
     *
     * @param angle The angle to test.
     *
     * @return <CODE>true</CODE> if the arc contains the angle,
     * <CODE>false</CODE> if the arc doesn't contain the angle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    protected abstract Rectangle2D makeBounds(double x, double y,
                                              double w, double h);

    /**
     * Constructs a <code>Rectangle2D</code> of the appropriate precision
     * to hold the parameters calculated to be the framing rectangle
     * of this arc.
     *
     * @param x The X coordinate of the upper-left corner of the
     * framing rectangle.
     * @param y The Y coordinate of the upper-left corner of the
     * framing rectangle.
     * @param w The width of the framing rectangle.
     * @param h The height of the framing rectangle.
     * @return a <code>Rectangle2D</code> that is the framing rectangle
     *     of this arc.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public Rectangle2D getBounds2D() {

    /**
     * Returns the high-precision framing rectangle of the arc.  The framing
     * rectangle contains only the part of this <code>Arc2D</code> that is
     * in between the starting and ending angles and contains the pie
     * wedge, if this <code>Arc2D</code> has a <code>PIE</code> closure type.
     * <p>
     * This method differs from the
     * {@link RectangularShape#getBounds() getBounds} in that the
     * <code>getBounds</code> method only returns the bounds of the
     * enclosing ellipse of this <code>Arc2D</code> without considering
     * the starting and ending angles of this <code>Arc2D</code>.
     *
     * @return the <CODE>Rectangle2D</CODE> that represents the arc's
     * framing rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setFrame(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * Note that the arc
     * <a href="Arc2D.html#inscribes">partially inscribes</a>
     * the framing rectangle of this {@code RectangularShape}.
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setArcType(int type) {

    /**
     * Sets the closure type of this arc to the specified value:
     * <CODE>OPEN</CODE>, <CODE>CHORD</CODE>, or <CODE>PIE</CODE>.
     *
     * @param type The integer constant that represents the closure
     * type of this arc: {@link #OPEN}, {@link #CHORD}, or
     * {@link #PIE}.
     *
     * @throws IllegalArgumentException if <code>type</code> is not
     * 0, 1, or 2.+
     * @see #getArcType
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setAngles(Point2D p1, Point2D p2) {

    /**
     * Sets the starting angle and angular extent of this arc using
     * two points. The first point is used to determine the angle of
     * the starting point relative to the arc's center.
     * The second point is used to determine the angle of the end point
     * relative to the arc's center.
     * The arc will always be non-empty and extend counterclockwise
     * from the first point around to the second point.
     *
     * @param p1 The <CODE>Point2D</CODE> that defines the arc's
     * starting point.
     * @param p2 The <CODE>Point2D</CODE> that defines the arc's
     * ending point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setAngles(double x1, double y1, double x2, double y2) {

    /**
     * Sets the starting angle and angular extent of this arc using two
     * sets of coordinates. The first set of coordinates is used to
     * determine the angle of the starting point relative to the arc's
     * center. The second set of coordinates is used to determine the
     * angle of the end point relative to the arc's center.
     * The arc will always be non-empty and extend counterclockwise
     * from the first point around to the second point.
     *
     * @param x1 The X coordinate of the arc's starting point.
     * @param y1 The Y coordinate of the arc's starting point.
     * @param x2 The X coordinate of the arc's ending point.
     * @param y2 The Y coordinate of the arc's ending point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setAngleStart(Point2D p) {

    /**
     * Sets the starting angle of this arc to the angle that the
     * specified point defines relative to the center of this arc.
     * The angular extent of the arc will remain the same.
     *
     * @param p The <CODE>Point2D</CODE> that defines the starting angle.
     * @see #getAngleStart
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public abstract void setAngleExtent(double angExt);

    /**
     * Sets the angular extent of this arc to the specified double
     * value.
     *
     * @param angExt The angular extent of the arc in degrees.
     * @see #getAngleExtent
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public abstract void setAngleStart(double angSt);

    /**
     * Sets the starting angle of this arc to the specified double
     * value.
     *
     * @param angSt The starting angle of the arc in degrees.
     * @see #getAngleStart
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setArcByTangent(Point2D p1, Point2D p2, Point2D p3,
                                double radius) {

    /**
     * Sets the position, bounds, and angular extents of this arc to the
     * specified value. The starting angle of the arc is tangent to the
     * line specified by points (p1, p2), the ending angle is tangent to
     * the line specified by points (p2, p3), and the arc has the
     * specified radius.
     *
     * @param p1 The first point that defines the arc. The starting
     * angle of the arc is tangent to the line specified by points (p1, p2).
     * @param p2 The second point that defines the arc. The starting
     * angle of the arc is tangent to the line specified by points (p1, p2).
     * The ending angle of the arc is tangent to the line specified by
     * points (p2, p3).
     * @param p3 The third point that defines the arc. The ending angle
     * of the arc is tangent to the line specified by points (p2, p3).
     * @param radius The radius of the arc.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setArcByCenter(double x, double y, double radius,
                               double angSt, double angExt, int closure) {

    /**
     * Sets the position, bounds, angular extents, and closure type of
     * this arc to the specified values. The arc is defined by a center
     * point and a radius rather than a framing rectangle for the full ellipse.
     *
     * @param x The X coordinate of the center of the arc.
     * @param y The Y coordinate of the center of the arc.
     * @param radius The radius of the arc.
     * @param angSt The starting angle of the arc in degrees.
     * @param angExt The angular extent of the arc in degrees.
     * @param closure The closure type for the arc:
     * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setArc(Arc2D a) {

    /**
     * Sets this arc to be the same as the specified arc.
     *
     * @param a The <CODE>Arc2D</CODE> to use to set the arc's values.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setArc(Rectangle2D rect, double angSt, double angExt,
                       int closure) {

    /**
     * Sets the location, size, angular extents, and closure type of
     * this arc to the specified values.
     *
     * @param rect The framing rectangle that defines the
     * outer boundary of the full ellipse of which this arc is a
     * partial section.
     * @param angSt The starting angle of the arc in degrees.
     * @param angExt The angular extent of the arc in degrees.
     * @param closure The closure type for the arc:
     * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setArc(Point2D loc, Dimension2D size,
                       double angSt, double angExt, int closure) {

    /**
     * Sets the location, size, angular extents, and closure type of
     * this arc to the specified values.
     *
     * @param loc The <CODE>Point2D</CODE> representing the coordinates of
     * the upper-left corner of the arc.
     * @param size The <CODE>Dimension2D</CODE> representing the width
     * and height of the full ellipse of which this arc is
     * a partial section.
     * @param angSt The starting angle of the arc in degrees.
     * @param angExt The angular extent of the arc in degrees.
     * @param closure The closure type for the arc:
     * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public abstract void setArc(double x, double y, double w, double h,
                                double angSt, double angExt, int closure);

    /**
     * Sets the location, size, angular extents, and closure type of
     * this arc to the specified double values.
     *
     * @param x The X coordinate of the upper-left corner of the arc.
     * @param y The Y coordinate of the upper-left corner of the arc.
     * @param w The overall width of the full ellipse of which
     *          this arc is a partial section.
     * @param h The overall height of the full ellipse of which
     *          this arc is a partial section.
     * @param angSt The starting angle of the arc in degrees.
     * @param angExt The angular extent of the arc in degrees.
     * @param closure The closure type for the arc:
     * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public Point2D getEndPoint() {

    /**
     * Returns the ending point of the arc.  This point is the
     * intersection of the ray from the center defined by the
     * starting angle plus the angular extent of the arc and the
     * elliptical boundary of the arc.
     *
     * @return A <CODE>Point2D</CODE> object representing the
     * x,y coordinates  of the ending point of the arc.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public Point2D getStartPoint() {

    /**
     * Returns the starting point of the arc.  This point is the
     * intersection of the ray from the center defined by the
     * starting angle and the elliptical boundary of the arc.
     *
     * @return A <CODE>Point2D</CODE> object representing the
     * x,y coordinates of the starting point of the arc.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public int getArcType() {

    /**
     * Returns the arc closure type of the arc: {@link #OPEN},
     * {@link #CHORD}, or {@link #PIE}.
     * @return One of the integer constant closure types defined
     * in this class.
     * @see #setArcType
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public abstract double getAngleExtent();

    /**
     * Returns the angular extent of the arc.
     *
     * @return A double value that represents the angular extent
     * of the arc in degrees.
     * @see #setAngleExtent
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public abstract double getAngleStart();

    /**
     * Returns the starting angle of the arc.
     *
     * @return A double value that represents the starting angle
     * of the arc in degrees.
     * @see #setAngleStart
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    protected Arc2D(int type) {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessor
     * methods below.
     *
     * @param type The closure type of this arc:
     * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
     * @see java.awt.geom.Arc2D.Float
     * @see java.awt.geom.Arc2D.Double
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    protected Arc2D() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessor
     * methods below.
     * <p>
     * This constructor creates an object with a default closure
     * type of {@link #OPEN}.  It is provided only to enable
     * serialization of subclasses.
     *
     * @see java.awt.geom.Arc2D.Float
     * @see java.awt.geom.Arc2D.Double
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        private void readObject(java.io.ObjectInputStream s)

        /**
         * Reads the default serializable fields from the
         * <code>ObjectInputStream</code> followed by a byte
         * indicating the arc type of this <code>Arc2D</code>
         * instance.
         *
         * @serialData
         * <ol>
         * <li>The default serializable fields.
         * <li>
         * followed by a <code>byte</code> indicating the arc type
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * </ol>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        private void writeObject(java.io.ObjectOutputStream s)

        /**
         * Writes the default serializable fields to the
         * <code>ObjectOutputStream</code> followed by a byte
         * indicating the arc type of this <code>Arc2D</code>
         * instance.
         *
         * @serialData
         * <ol>
         * <li>The default serializable fields.
         * <li>
         * followed by a <code>byte</code> indicating the arc type
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * </ol>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        protected Rectangle2D makeBounds(double x, double y,
                                         double w, double h) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public void setAngleExtent(double angExt) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public void setAngleStart(double angSt) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public void setArc(double x, double y, double w, double h,
                           double angSt, double angExt, int closure) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public boolean isEmpty() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getAngleExtent() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getAngleStart() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getHeight() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getWidth() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Double(Rectangle2D ellipseBounds,
                      double start, double extent, int type) {

        /**
         * Constructs a new arc, initialized to the specified location,
         * size, angular extents, and closure type.
         *
         * @param ellipseBounds The framing rectangle that defines the
         * outer boundary of the full ellipse of which this arc is a
         * partial section.
         * @param start The starting angle of the arc in degrees.
         * @param extent The angular extent of the arc in degrees.
         * @param type The closure type for the arc:
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Double(double x, double y, double w, double h,
                      double start, double extent, int type) {

        /**
         * Constructs a new arc, initialized to the specified location,
         * size, angular extents, and closure type.
         *
         * @param x The X coordinate of the upper-left corner
         *          of the arc's framing rectangle.
         * @param y The Y coordinate of the upper-left corner
         *          of the arc's framing rectangle.
         * @param w The overall width of the full ellipse of which this
         *          arc is a partial section.
         * @param h The overall height of the full ellipse of which this
         *          arc is a partial section.
         * @param start The starting angle of the arc in degrees.
         * @param extent The angular extent of the arc in degrees.
         * @param type The closure type for the arc:
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Double(int type) {

        /**
         * Constructs a new arc, initialized to location (0, 0),
         * size (0, 0), angular extents (start = 0, extent = 0), and
         * the specified closure type.
         *
         * @param type The closure type for the arc:
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Double() {

        /**
         * Constructs a new OPEN arc, initialized to location (0, 0),
         * size (0, 0), angular extents (start = 0, extent = 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double extent;

        /**
         * The angular extent of the arc in degrees.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double start;

        /**
         * The starting angle of the arc in degrees.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double height;

        /**
         * The overall height of the full ellipse of which this arc is
         * a partial section (not considering the angular extents).
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double width;

        /**
         * The overall width of the full ellipse of which this arc is
         * a partial section (not considering the angular extents).
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double y;

        /**
         * The Y coordinate of the upper-left corner of the framing
         * rectangle of the arc.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public static class Double extends Arc2D implements Serializable {

    /**
     * This class defines an arc specified in {@code double} precision.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        private void readObject(java.io.ObjectInputStream s)

        /**
         * Reads the default serializable fields from the
         * <code>ObjectInputStream</code> followed by a byte
         * indicating the arc type of this <code>Arc2D</code>
         * instance.
         *
         * @serialData
         * <ol>
         * <li>The default serializable fields.
         * <li>
         * followed by a <code>byte</code> indicating the arc type
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * </ol>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        private void writeObject(java.io.ObjectOutputStream s)

        /**
         * Writes the default serializable fields to the
         * <code>ObjectOutputStream</code> followed by a byte
         * indicating the arc type of this <code>Arc2D</code>
         * instance.
         *
         * @serialData
         * <ol>
         * <li>The default serializable fields.
         * <li>
         * followed by a <code>byte</code> indicating the arc type
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * </ol>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        protected Rectangle2D makeBounds(double x, double y,
                                         double w, double h) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public void setAngleExtent(double angExt) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public void setAngleStart(double angSt) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public void setArc(double x, double y, double w, double h,
                           double angSt, double angExt, int closure) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public boolean isEmpty() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getAngleExtent() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getAngleStart() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getHeight() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getWidth() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Float(Rectangle2D ellipseBounds,
                     float start, float extent, int type) {

        /**
         * Constructs a new arc, initialized to the specified location,
         * size, angular extents, and closure type.
         *
         * @param ellipseBounds The framing rectangle that defines the
         * outer boundary of the full ellipse of which this arc is a
         * partial section.
         * @param start The starting angle of the arc in degrees.
         * @param extent The angular extent of the arc in degrees.
         * @param type The closure type for the arc:
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Float(float x, float y, float w, float h,
                     float start, float extent, int type) {

        /**
         * Constructs a new arc, initialized to the specified location,
         * size, angular extents, and closure type.
         *
         * @param x The X coordinate of the upper-left corner of
         *          the arc's framing rectangle.
         * @param y The Y coordinate of the upper-left corner of
         *          the arc's framing rectangle.
         * @param w The overall width of the full ellipse of which
         *          this arc is a partial section.
         * @param h The overall height of the full ellipse of which this
         *          arc is a partial section.
         * @param start The starting angle of the arc in degrees.
         * @param extent The angular extent of the arc in degrees.
         * @param type The closure type for the arc:
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Float(int type) {

        /**
         * Constructs a new arc, initialized to location (0, 0),
         * size (0, 0), angular extents (start = 0, extent = 0), and
         * the specified closure type.
         *
         * @param type The closure type for the arc:
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Float() {

        /**
         * Constructs a new OPEN arc, initialized to location (0, 0),
         * size (0, 0), angular extents (start = 0, extent = 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public float extent;

        /**
         * The angular extent of the arc in degrees.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public float start;

        /**
         * The starting angle of the arc in degrees.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public float height;

        /**
         * The overall height of the full ellipse of which this arc is
         * a partial section (not considering the
         * angular extents).
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public float width;

        /**
         * The overall width of the full ellipse of which this arc is
         * a partial section (not considering the
         * angular extents).
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public float y;

        /**
         * The Y coordinate of the upper-left corner of the framing
         * rectangle of the arc.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public static class Float extends Arc2D implements Serializable {

    /**
     * This class defines an arc specified in {@code float} precision.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public final static int PIE = 2;

    /**
     * The closure type for an arc closed by drawing straight line
     * segments from the start of the arc segment to the center
     * of the full ellipse and from that point to the end of the arc segment.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public final static int CHORD = 1;

    /**
     * The closure type for an arc closed by drawing a straight
     * line segment from the start of the arc segment to the end of the
     * arc segment.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public final static int OPEN = 0;

    /**
     * The closure type for an open arc with no path segments
     * connecting the two ends of the arc segment.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
public abstract class Arc2D extends RectangularShape {

/**
 * <CODE>Arc2D</CODE> is the abstract superclass for all objects that
 * store a 2D arc defined by a framing rectangle,
 * start angle, angular extent (length of the arc), and a closure type
 * (<CODE>OPEN</CODE>, <CODE>CHORD</CODE>, or <CODE>PIE</CODE>).
 * <p>
 * <a name="inscribes">
 * The arc is a partial section of a full ellipse which
 * inscribes the framing rectangle of its parent {@link RectangularShape}.
 * </a>
 * <a name="angles">
 * The angles are specified relative to the non-square
 * framing rectangle such that 45 degrees always falls on the line from
 * the center of the ellipse to the upper right corner of the framing
 * rectangle.
 * As a result, if the framing rectangle is noticeably longer along one
 * axis than the other, the angles to the start and end of the arc segment
 * will be skewed farther along the longer axis of the frame.
 * </a>
 * <p>
 * The actual storage representation of the coordinates is left to
 * the subclass.
 *
 * @author      Jim Graham
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public boolean equals(Object obj) {

    /**
     * Determines whether or not the specified <code>Object</code> is
     * equal to this <code>Arc2D</code>.  The specified
     * <code>Object</code> is equal to this <code>Arc2D</code>
     * if it is an instance of <code>Arc2D</code> and if its
     * location, size, arc extents and type are the same as this
     * <code>Arc2D</code>.
     * @param obj  an <code>Object</code> to be compared with this
     *             <code>Arc2D</code>.
     * @return  <code>true</code> if <code>obj</code> is an instance
     *          of <code>Arc2D</code> and has the same values;
     *          <code>false</code> otherwise.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public int hashCode() {

    /**
     * Returns the hashcode for this <code>Arc2D</code>.
     * @return the hashcode for this <code>Arc2D</code>.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public PathIterator getPathIterator(AffineTransform at) {

    /**
     * Returns an iteration object that defines the boundary of the
     * arc.
     * This iterator is multithread safe.
     * <code>Arc2D</code> guarantees that
     * modifications to the geometry of the arc
     * do not affect any iterations of that geometry that
     * are already in process.
     *
     * @param at an optional <CODE>AffineTransform</CODE> to be applied
     * to the coordinates as they are returned in the iteration, or null
     * if the untransformed coordinates are desired.
     *
     * @return A <CODE>PathIterator</CODE> that defines the arc's boundary.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public boolean contains(Rectangle2D r) {

    /**
     * Determines whether or not the interior of the arc entirely contains
     * the specified rectangle.
     *
     * @param r The <CODE>Rectangle2D</CODE> to test.
     *
     * @return <CODE>true</CODE> if the arc contains the rectangle,
     * <CODE>false</CODE> if the arc doesn't contain the rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public boolean contains(double x, double y, double w, double h) {

    /**
     * Determines whether or not the interior of the arc entirely contains
     * the specified rectangle.
     *
     * @param x The X coordinate of the rectangle's upper-left corner.
     * @param y The Y coordinate of the rectangle's upper-left corner.
     * @param w The width of the rectangle.
     * @param h The height of the rectangle.
     *
     * @return <CODE>true</CODE> if the arc contains the rectangle,
     * <CODE>false</CODE> if the arc doesn't contain the rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public boolean intersects(double x, double y, double w, double h) {

    /**
     * Determines whether or not the interior of the arc intersects
     * the interior of the specified rectangle.
     *
     * @param x The X coordinate of the rectangle's upper-left corner.
     * @param y The Y coordinate of the rectangle's upper-left corner.
     * @param w The width of the rectangle.
     * @param h The height of the rectangle.
     *
     * @return <CODE>true</CODE> if the arc intersects the rectangle,
     * <CODE>false</CODE> if the arc doesn't intersect the rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public boolean contains(double x, double y) {

    /**
     * Determines whether or not the specified point is inside the boundary
     * of the arc.
     *
     * @param x The X coordinate of the point to test.
     * @param y The Y coordinate of the point to test.
     *
     * @return <CODE>true</CODE> if the point lies within the bound of
     * the arc, <CODE>false</CODE> if the point lies outside of the
     * arc's bounds.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public boolean containsAngle(double angle) {

    /**
     * Determines whether or not the specified angle is within the
     * angular extents of the arc.
     *
     * @param angle The angle to test.
     *
     * @return <CODE>true</CODE> if the arc contains the angle,
     * <CODE>false</CODE> if the arc doesn't contain the angle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    protected abstract Rectangle2D makeBounds(double x, double y,
                                              double w, double h);

    /**
     * Constructs a <code>Rectangle2D</code> of the appropriate precision
     * to hold the parameters calculated to be the framing rectangle
     * of this arc.
     *
     * @param x The X coordinate of the upper-left corner of the
     * framing rectangle.
     * @param y The Y coordinate of the upper-left corner of the
     * framing rectangle.
     * @param w The width of the framing rectangle.
     * @param h The height of the framing rectangle.
     * @return a <code>Rectangle2D</code> that is the framing rectangle
     *     of this arc.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public Rectangle2D getBounds2D() {

    /**
     * Returns the high-precision framing rectangle of the arc.  The framing
     * rectangle contains only the part of this <code>Arc2D</code> that is
     * in between the starting and ending angles and contains the pie
     * wedge, if this <code>Arc2D</code> has a <code>PIE</code> closure type.
     * <p>
     * This method differs from the
     * {@link RectangularShape#getBounds() getBounds} in that the
     * <code>getBounds</code> method only returns the bounds of the
     * enclosing ellipse of this <code>Arc2D</code> without considering
     * the starting and ending angles of this <code>Arc2D</code>.
     *
     * @return the <CODE>Rectangle2D</CODE> that represents the arc's
     * framing rectangle.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setFrame(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * Note that the arc
     * <a href="Arc2D.html#inscribes">partially inscribes</a>
     * the framing rectangle of this {@code RectangularShape}.
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setArcType(int type) {

    /**
     * Sets the closure type of this arc to the specified value:
     * <CODE>OPEN</CODE>, <CODE>CHORD</CODE>, or <CODE>PIE</CODE>.
     *
     * @param type The integer constant that represents the closure
     * type of this arc: {@link #OPEN}, {@link #CHORD}, or
     * {@link #PIE}.
     *
     * @throws IllegalArgumentException if <code>type</code> is not
     * 0, 1, or 2.+
     * @see #getArcType
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setAngles(Point2D p1, Point2D p2) {

    /**
     * Sets the starting angle and angular extent of this arc using
     * two points. The first point is used to determine the angle of
     * the starting point relative to the arc's center.
     * The second point is used to determine the angle of the end point
     * relative to the arc's center.
     * The arc will always be non-empty and extend counterclockwise
     * from the first point around to the second point.
     *
     * @param p1 The <CODE>Point2D</CODE> that defines the arc's
     * starting point.
     * @param p2 The <CODE>Point2D</CODE> that defines the arc's
     * ending point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setAngles(double x1, double y1, double x2, double y2) {

    /**
     * Sets the starting angle and angular extent of this arc using two
     * sets of coordinates. The first set of coordinates is used to
     * determine the angle of the starting point relative to the arc's
     * center. The second set of coordinates is used to determine the
     * angle of the end point relative to the arc's center.
     * The arc will always be non-empty and extend counterclockwise
     * from the first point around to the second point.
     *
     * @param x1 The X coordinate of the arc's starting point.
     * @param y1 The Y coordinate of the arc's starting point.
     * @param x2 The X coordinate of the arc's ending point.
     * @param y2 The Y coordinate of the arc's ending point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setAngleStart(Point2D p) {

    /**
     * Sets the starting angle of this arc to the angle that the
     * specified point defines relative to the center of this arc.
     * The angular extent of the arc will remain the same.
     *
     * @param p The <CODE>Point2D</CODE> that defines the starting angle.
     * @see #getAngleStart
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public abstract void setAngleExtent(double angExt);

    /**
     * Sets the angular extent of this arc to the specified double
     * value.
     *
     * @param angExt The angular extent of the arc in degrees.
     * @see #getAngleExtent
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public abstract void setAngleStart(double angSt);

    /**
     * Sets the starting angle of this arc to the specified double
     * value.
     *
     * @param angSt The starting angle of the arc in degrees.
     * @see #getAngleStart
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setArcByTangent(Point2D p1, Point2D p2, Point2D p3,
                                double radius) {

    /**
     * Sets the position, bounds, and angular extents of this arc to the
     * specified value. The starting angle of the arc is tangent to the
     * line specified by points (p1, p2), the ending angle is tangent to
     * the line specified by points (p2, p3), and the arc has the
     * specified radius.
     *
     * @param p1 The first point that defines the arc. The starting
     * angle of the arc is tangent to the line specified by points (p1, p2).
     * @param p2 The second point that defines the arc. The starting
     * angle of the arc is tangent to the line specified by points (p1, p2).
     * The ending angle of the arc is tangent to the line specified by
     * points (p2, p3).
     * @param p3 The third point that defines the arc. The ending angle
     * of the arc is tangent to the line specified by points (p2, p3).
     * @param radius The radius of the arc.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setArcByCenter(double x, double y, double radius,
                               double angSt, double angExt, int closure) {

    /**
     * Sets the position, bounds, angular extents, and closure type of
     * this arc to the specified values. The arc is defined by a center
     * point and a radius rather than a framing rectangle for the full ellipse.
     *
     * @param x The X coordinate of the center of the arc.
     * @param y The Y coordinate of the center of the arc.
     * @param radius The radius of the arc.
     * @param angSt The starting angle of the arc in degrees.
     * @param angExt The angular extent of the arc in degrees.
     * @param closure The closure type for the arc:
     * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setArc(Arc2D a) {

    /**
     * Sets this arc to be the same as the specified arc.
     *
     * @param a The <CODE>Arc2D</CODE> to use to set the arc's values.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setArc(Rectangle2D rect, double angSt, double angExt,
                       int closure) {

    /**
     * Sets the location, size, angular extents, and closure type of
     * this arc to the specified values.
     *
     * @param rect The framing rectangle that defines the
     * outer boundary of the full ellipse of which this arc is a
     * partial section.
     * @param angSt The starting angle of the arc in degrees.
     * @param angExt The angular extent of the arc in degrees.
     * @param closure The closure type for the arc:
     * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public void setArc(Point2D loc, Dimension2D size,
                       double angSt, double angExt, int closure) {

    /**
     * Sets the location, size, angular extents, and closure type of
     * this arc to the specified values.
     *
     * @param loc The <CODE>Point2D</CODE> representing the coordinates of
     * the upper-left corner of the arc.
     * @param size The <CODE>Dimension2D</CODE> representing the width
     * and height of the full ellipse of which this arc is
     * a partial section.
     * @param angSt The starting angle of the arc in degrees.
     * @param angExt The angular extent of the arc in degrees.
     * @param closure The closure type for the arc:
     * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public abstract void setArc(double x, double y, double w, double h,
                                double angSt, double angExt, int closure);

    /**
     * Sets the location, size, angular extents, and closure type of
     * this arc to the specified double values.
     *
     * @param x The X coordinate of the upper-left corner of the arc.
     * @param y The Y coordinate of the upper-left corner of the arc.
     * @param w The overall width of the full ellipse of which
     *          this arc is a partial section.
     * @param h The overall height of the full ellipse of which
     *          this arc is a partial section.
     * @param angSt The starting angle of the arc in degrees.
     * @param angExt The angular extent of the arc in degrees.
     * @param closure The closure type for the arc:
     * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public Point2D getEndPoint() {

    /**
     * Returns the ending point of the arc.  This point is the
     * intersection of the ray from the center defined by the
     * starting angle plus the angular extent of the arc and the
     * elliptical boundary of the arc.
     *
     * @return A <CODE>Point2D</CODE> object representing the
     * x,y coordinates  of the ending point of the arc.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public Point2D getStartPoint() {

    /**
     * Returns the starting point of the arc.  This point is the
     * intersection of the ray from the center defined by the
     * starting angle and the elliptical boundary of the arc.
     *
     * @return A <CODE>Point2D</CODE> object representing the
     * x,y coordinates of the starting point of the arc.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public int getArcType() {

    /**
     * Returns the arc closure type of the arc: {@link #OPEN},
     * {@link #CHORD}, or {@link #PIE}.
     * @return One of the integer constant closure types defined
     * in this class.
     * @see #setArcType
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public abstract double getAngleExtent();

    /**
     * Returns the angular extent of the arc.
     *
     * @return A double value that represents the angular extent
     * of the arc in degrees.
     * @see #setAngleExtent
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public abstract double getAngleStart();

    /**
     * Returns the starting angle of the arc.
     *
     * @return A double value that represents the starting angle
     * of the arc in degrees.
     * @see #setAngleStart
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    protected Arc2D(int type) {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessor
     * methods below.
     *
     * @param type The closure type of this arc:
     * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
     * @see java.awt.geom.Arc2D.Float
     * @see java.awt.geom.Arc2D.Double
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    protected Arc2D() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessor
     * methods below.
     * <p>
     * This constructor creates an object with a default closure
     * type of {@link #OPEN}.  It is provided only to enable
     * serialization of subclasses.
     *
     * @see java.awt.geom.Arc2D.Float
     * @see java.awt.geom.Arc2D.Double
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        private void readObject(java.io.ObjectInputStream s)

        /**
         * Reads the default serializable fields from the
         * <code>ObjectInputStream</code> followed by a byte
         * indicating the arc type of this <code>Arc2D</code>
         * instance.
         *
         * @serialData
         * <ol>
         * <li>The default serializable fields.
         * <li>
         * followed by a <code>byte</code> indicating the arc type
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * </ol>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        private void writeObject(java.io.ObjectOutputStream s)

        /**
         * Writes the default serializable fields to the
         * <code>ObjectOutputStream</code> followed by a byte
         * indicating the arc type of this <code>Arc2D</code>
         * instance.
         *
         * @serialData
         * <ol>
         * <li>The default serializable fields.
         * <li>
         * followed by a <code>byte</code> indicating the arc type
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * </ol>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        protected Rectangle2D makeBounds(double x, double y,
                                         double w, double h) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public void setAngleExtent(double angExt) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public void setAngleStart(double angSt) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public void setArc(double x, double y, double w, double h,
                           double angSt, double angExt, int closure) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public boolean isEmpty() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getAngleExtent() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getAngleStart() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getHeight() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getWidth() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Double(Rectangle2D ellipseBounds,
                      double start, double extent, int type) {

        /**
         * Constructs a new arc, initialized to the specified location,
         * size, angular extents, and closure type.
         *
         * @param ellipseBounds The framing rectangle that defines the
         * outer boundary of the full ellipse of which this arc is a
         * partial section.
         * @param start The starting angle of the arc in degrees.
         * @param extent The angular extent of the arc in degrees.
         * @param type The closure type for the arc:
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Double(double x, double y, double w, double h,
                      double start, double extent, int type) {

        /**
         * Constructs a new arc, initialized to the specified location,
         * size, angular extents, and closure type.
         *
         * @param x The X coordinate of the upper-left corner
         *          of the arc's framing rectangle.
         * @param y The Y coordinate of the upper-left corner
         *          of the arc's framing rectangle.
         * @param w The overall width of the full ellipse of which this
         *          arc is a partial section.
         * @param h The overall height of the full ellipse of which this
         *          arc is a partial section.
         * @param start The starting angle of the arc in degrees.
         * @param extent The angular extent of the arc in degrees.
         * @param type The closure type for the arc:
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Double(int type) {

        /**
         * Constructs a new arc, initialized to location (0, 0),
         * size (0, 0), angular extents (start = 0, extent = 0), and
         * the specified closure type.
         *
         * @param type The closure type for the arc:
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Double() {

        /**
         * Constructs a new OPEN arc, initialized to location (0, 0),
         * size (0, 0), angular extents (start = 0, extent = 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double extent;

        /**
         * The angular extent of the arc in degrees.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double start;

        /**
         * The starting angle of the arc in degrees.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double height;

        /**
         * The overall height of the full ellipse of which this arc is
         * a partial section (not considering the angular extents).
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double width;

        /**
         * The overall width of the full ellipse of which this arc is
         * a partial section (not considering the angular extents).
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double y;

        /**
         * The Y coordinate of the upper-left corner of the framing
         * rectangle of the arc.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public static class Double extends Arc2D implements Serializable {

    /**
     * This class defines an arc specified in {@code double} precision.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        private void readObject(java.io.ObjectInputStream s)

        /**
         * Reads the default serializable fields from the
         * <code>ObjectInputStream</code> followed by a byte
         * indicating the arc type of this <code>Arc2D</code>
         * instance.
         *
         * @serialData
         * <ol>
         * <li>The default serializable fields.
         * <li>
         * followed by a <code>byte</code> indicating the arc type
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * </ol>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        private void writeObject(java.io.ObjectOutputStream s)

        /**
         * Writes the default serializable fields to the
         * <code>ObjectOutputStream</code> followed by a byte
         * indicating the arc type of this <code>Arc2D</code>
         * instance.
         *
         * @serialData
         * <ol>
         * <li>The default serializable fields.
         * <li>
         * followed by a <code>byte</code> indicating the arc type
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * </ol>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        protected Rectangle2D makeBounds(double x, double y,
                                         double w, double h) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public void setAngleExtent(double angExt) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public void setAngleStart(double angSt) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public void setArc(double x, double y, double w, double h,
                           double angSt, double angExt, int closure) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public boolean isEmpty() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getAngleExtent() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getAngleStart() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getHeight() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getWidth() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * Note that the arc
         * <a href="Arc2D.html#inscribes">partially inscribes</a>
         * the framing rectangle of this {@code RectangularShape}.
         *
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Float(Rectangle2D ellipseBounds,
                     float start, float extent, int type) {

        /**
         * Constructs a new arc, initialized to the specified location,
         * size, angular extents, and closure type.
         *
         * @param ellipseBounds The framing rectangle that defines the
         * outer boundary of the full ellipse of which this arc is a
         * partial section.
         * @param start The starting angle of the arc in degrees.
         * @param extent The angular extent of the arc in degrees.
         * @param type The closure type for the arc:
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Float(float x, float y, float w, float h,
                     float start, float extent, int type) {

        /**
         * Constructs a new arc, initialized to the specified location,
         * size, angular extents, and closure type.
         *
         * @param x The X coordinate of the upper-left corner of
         *          the arc's framing rectangle.
         * @param y The Y coordinate of the upper-left corner of
         *          the arc's framing rectangle.
         * @param w The overall width of the full ellipse of which
         *          this arc is a partial section.
         * @param h The overall height of the full ellipse of which this
         *          arc is a partial section.
         * @param start The starting angle of the arc in degrees.
         * @param extent The angular extent of the arc in degrees.
         * @param type The closure type for the arc:
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Float(int type) {

        /**
         * Constructs a new arc, initialized to location (0, 0),
         * size (0, 0), angular extents (start = 0, extent = 0), and
         * the specified closure type.
         *
         * @param type The closure type for the arc:
         * {@link #OPEN}, {@link #CHORD}, or {@link #PIE}.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public Float() {

        /**
         * Constructs a new OPEN arc, initialized to location (0, 0),
         * size (0, 0), angular extents (start = 0, extent = 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public float extent;

        /**
         * The angular extent of the arc in degrees.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public float start;

        /**
         * The starting angle of the arc in degrees.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public float height;

        /**
         * The overall height of the full ellipse of which this arc is
         * a partial section (not considering the
         * angular extents).
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public float width;

        /**
         * The overall width of the full ellipse of which this arc is
         * a partial section (not considering the
         * angular extents).
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
        public float y;

        /**
         * The Y coordinate of the upper-left corner of the framing
         * rectangle of the arc.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public static class Float extends Arc2D implements Serializable {

    /**
     * This class defines an arc specified in {@code float} precision.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public final static int PIE = 2;

    /**
     * The closure type for an arc closed by drawing straight line
     * segments from the start of the arc segment to the center
     * of the full ellipse and from that point to the end of the arc segment.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public final static int CHORD = 1;

    /**
     * The closure type for an arc closed by drawing a straight
     * line segment from the start of the arc segment to the end of the
     * arc segment.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
    public final static int OPEN = 0;

    /**
     * The closure type for an open arc with no path segments
     * connecting the two ends of the arc segment.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Arc2D.java
public abstract class Arc2D extends RectangularShape {

/**
 * <CODE>Arc2D</CODE> is the abstract superclass for all objects that
 * store a 2D arc defined by a framing rectangle,
 * start angle, angular extent (length of the arc), and a closure type
 * (<CODE>OPEN</CODE>, <CODE>CHORD</CODE>, or <CODE>PIE</CODE>).
 * <p>
 * <a name="inscribes">
 * The arc is a partial section of a full ellipse which
 * inscribes the framing rectangle of its parent {@link RectangularShape}.
 * </a>
 * <a name="angles">
 * The angles are specified relative to the non-square
 * framing rectangle such that 45 degrees always falls on the line from
 * the center of the ellipse to the upper right corner of the framing
 * rectangle.
 * As a result, if the framing rectangle is noticeably longer along one
 * axis than the other, the angles to the start and end of the arc segment
 * will be skewed farther along the longer axis of the frame.
 * </a>
 * <p>
 * The actual storage representation of the coordinates is left to
 * the subclass.
 *
 * @author      Jim Graham
 * @since 1.2
 */
