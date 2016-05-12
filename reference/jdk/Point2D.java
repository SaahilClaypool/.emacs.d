_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public boolean equals(Object obj) {

    /**
     * Determines whether or not two points are equal. Two instances of
     * <code>Point2D</code> are equal if the values of their
     * <code>x</code> and <code>y</code> member fields, representing
     * their position in the coordinate space, are the same.
     * @param obj an object to be compared with this <code>Point2D</code>
     * @return <code>true</code> if the object to be compared is
     *         an instance of <code>Point2D</code> and has
     *         the same values; <code>false</code> otherwise.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public int hashCode() {

    /**
     * Returns the hashcode for this <code>Point2D</code>.
     * @return      a hash code for this <code>Point2D</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public Object clone() {

    /**
     * Creates a new object of the same class and with the
     * same contents as this object.
     * @return     a clone of this instance.
     * @exception  OutOfMemoryError            if there is not enough memory.
     * @see        java.lang.Cloneable
     * @since      1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public double distance(Point2D pt) {

    /**
     * Returns the distance from this <code>Point2D</code> to a
     * specified <code>Point2D</code>.
     *
     * @param pt the specified point to be measured
     *           against this <code>Point2D</code>
     * @return the distance between this <code>Point2D</code> and
     * the specified <code>Point2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public double distance(double px, double py) {

    /**
     * Returns the distance from this <code>Point2D</code> to
     * a specified point.
     *
     * @param px the X coordinate of the specified point to be measured
     *           against this <code>Point2D</code>
     * @param py the Y coordinate of the specified point to be measured
     *           against this <code>Point2D</code>
     * @return the distance between this <code>Point2D</code>
     * and a specified point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public double distanceSq(Point2D pt) {

    /**
     * Returns the square of the distance from this
     * <code>Point2D</code> to a specified <code>Point2D</code>.
     *
     * @param pt the specified point to be measured
     *           against this <code>Point2D</code>
     * @return the square of the distance between this
     * <code>Point2D</code> to a specified <code>Point2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public double distanceSq(double px, double py) {

    /**
     * Returns the square of the distance from this
     * <code>Point2D</code> to a specified point.
     *
     * @param px the X coordinate of the specified point to be measured
     *           against this <code>Point2D</code>
     * @param py the Y coordinate of the specified point to be measured
     *           against this <code>Point2D</code>
     * @return the square of the distance between this
     * <code>Point2D</code> and the specified point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public static double distance(double x1, double y1,
                                  double x2, double y2)

    /**
     * Returns the distance between two points.
     *
     * @param x1 the X coordinate of the first specified point
     * @param y1 the Y coordinate of the first specified point
     * @param x2 the X coordinate of the second specified point
     * @param y2 the Y coordinate of the second specified point
     * @return the distance between the two sets of specified
     * coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public static double distanceSq(double x1, double y1,
                                    double x2, double y2)

    /**
     * Returns the square of the distance between two points.
     *
     * @param x1 the X coordinate of the first specified point
     * @param y1 the Y coordinate of the first specified point
     * @param x2 the X coordinate of the second specified point
     * @param y2 the Y coordinate of the second specified point
     * @return the square of the distance between the two
     * sets of specified coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public void setLocation(Point2D p) {

    /**
     * Sets the location of this <code>Point2D</code> to the same
     * coordinates as the specified <code>Point2D</code> object.
     * @param p the specified <code>Point2D</code> to which to set
     * this <code>Point2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public abstract void setLocation(double x, double y);

    /**
     * Sets the location of this <code>Point2D</code> to the
     * specified <code>double</code> coordinates.
     *
     * @param x the new X coordinate of this {@code Point2D}
     * @param y the new Y coordinate of this {@code Point2D}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public abstract double getY();

    /**
     * Returns the Y coordinate of this <code>Point2D</code> in
     * <code>double</code> precision.
     * @return the Y coordinate of this <code>Point2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public abstract double getX();

    /**
     * Returns the X coordinate of this <code>Point2D</code> in
     * <code>double</code> precision.
     * @return the X coordinate of this <code>Point2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    protected Point2D() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessor
     * methods below.
     *
     * @see java.awt.geom.Point2D.Float
     * @see java.awt.geom.Point2D.Double
     * @see java.awt.Point
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public String toString() {

        /**
         * Returns a <code>String</code> that represents the value
         * of this <code>Point2D</code>.
         * @return a string representation of this <code>Point2D</code>.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public void setLocation(double x, double y) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public Double(double x, double y) {

        /**
         * Constructs and initializes a <code>Point2D</code> with the
         * specified coordinates.
         *
         * @param x the X coordinate of the newly
         *          constructed <code>Point2D</code>
         * @param y the Y coordinate of the newly
         *          constructed <code>Point2D</code>
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public Double() {

        /**
         * Constructs and initializes a <code>Point2D</code> with
         * coordinates (0,&nbsp;0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public double y;

        /**
         * The Y coordinate of this <code>Point2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public static class Double extends Point2D implements Serializable {

    /**
     * The <code>Double</code> class defines a point specified in
     * <code>double</code> precision.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public String toString() {

        /**
         * Returns a <code>String</code> that represents the value
         * of this <code>Point2D</code>.
         * @return a string representation of this <code>Point2D</code>.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public void setLocation(float x, float y) {

        /**
         * Sets the location of this <code>Point2D</code> to the
         * specified <code>float</code> coordinates.
         *
         * @param x the new X coordinate of this {@code Point2D}
         * @param y the new Y coordinate of this {@code Point2D}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public void setLocation(double x, double y) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public Float(float x, float y) {

        /**
         * Constructs and initializes a <code>Point2D</code> with
         * the specified coordinates.
         *
         * @param x the X coordinate of the newly
         *          constructed <code>Point2D</code>
         * @param y the Y coordinate of the newly
         *          constructed <code>Point2D</code>
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public Float() {

        /**
         * Constructs and initializes a <code>Point2D</code> with
         * coordinates (0,&nbsp;0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public float y;

        /**
         * The Y coordinate of this <code>Point2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public static class Float extends Point2D implements Serializable {

    /**
     * The <code>Float</code> class defines a point specified in float
     * precision.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
public abstract class Point2D implements Cloneable {

/**
 * The <code>Point2D</code> class defines a point representing a location
 * in {@code (x,y)} coordinate space.
 * <p>
 * This class is only the abstract superclass for all objects that
 * store a 2D coordinate.
 * The actual storage representation of the coordinates is left to
 * the subclass.
 *
 * @author      Jim Graham
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public boolean equals(Object obj) {

    /**
     * Determines whether or not two points are equal. Two instances of
     * <code>Point2D</code> are equal if the values of their
     * <code>x</code> and <code>y</code> member fields, representing
     * their position in the coordinate space, are the same.
     * @param obj an object to be compared with this <code>Point2D</code>
     * @return <code>true</code> if the object to be compared is
     *         an instance of <code>Point2D</code> and has
     *         the same values; <code>false</code> otherwise.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public int hashCode() {

    /**
     * Returns the hashcode for this <code>Point2D</code>.
     * @return      a hash code for this <code>Point2D</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public Object clone() {

    /**
     * Creates a new object of the same class and with the
     * same contents as this object.
     * @return     a clone of this instance.
     * @exception  OutOfMemoryError            if there is not enough memory.
     * @see        java.lang.Cloneable
     * @since      1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public double distance(Point2D pt) {

    /**
     * Returns the distance from this <code>Point2D</code> to a
     * specified <code>Point2D</code>.
     *
     * @param pt the specified point to be measured
     *           against this <code>Point2D</code>
     * @return the distance between this <code>Point2D</code> and
     * the specified <code>Point2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public double distance(double px, double py) {

    /**
     * Returns the distance from this <code>Point2D</code> to
     * a specified point.
     *
     * @param px the X coordinate of the specified point to be measured
     *           against this <code>Point2D</code>
     * @param py the Y coordinate of the specified point to be measured
     *           against this <code>Point2D</code>
     * @return the distance between this <code>Point2D</code>
     * and a specified point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public double distanceSq(Point2D pt) {

    /**
     * Returns the square of the distance from this
     * <code>Point2D</code> to a specified <code>Point2D</code>.
     *
     * @param pt the specified point to be measured
     *           against this <code>Point2D</code>
     * @return the square of the distance between this
     * <code>Point2D</code> to a specified <code>Point2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public double distanceSq(double px, double py) {

    /**
     * Returns the square of the distance from this
     * <code>Point2D</code> to a specified point.
     *
     * @param px the X coordinate of the specified point to be measured
     *           against this <code>Point2D</code>
     * @param py the Y coordinate of the specified point to be measured
     *           against this <code>Point2D</code>
     * @return the square of the distance between this
     * <code>Point2D</code> and the specified point.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public static double distance(double x1, double y1,
                                  double x2, double y2)

    /**
     * Returns the distance between two points.
     *
     * @param x1 the X coordinate of the first specified point
     * @param y1 the Y coordinate of the first specified point
     * @param x2 the X coordinate of the second specified point
     * @param y2 the Y coordinate of the second specified point
     * @return the distance between the two sets of specified
     * coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public static double distanceSq(double x1, double y1,
                                    double x2, double y2)

    /**
     * Returns the square of the distance between two points.
     *
     * @param x1 the X coordinate of the first specified point
     * @param y1 the Y coordinate of the first specified point
     * @param x2 the X coordinate of the second specified point
     * @param y2 the Y coordinate of the second specified point
     * @return the square of the distance between the two
     * sets of specified coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public void setLocation(Point2D p) {

    /**
     * Sets the location of this <code>Point2D</code> to the same
     * coordinates as the specified <code>Point2D</code> object.
     * @param p the specified <code>Point2D</code> to which to set
     * this <code>Point2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public abstract void setLocation(double x, double y);

    /**
     * Sets the location of this <code>Point2D</code> to the
     * specified <code>double</code> coordinates.
     *
     * @param x the new X coordinate of this {@code Point2D}
     * @param y the new Y coordinate of this {@code Point2D}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public abstract double getY();

    /**
     * Returns the Y coordinate of this <code>Point2D</code> in
     * <code>double</code> precision.
     * @return the Y coordinate of this <code>Point2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public abstract double getX();

    /**
     * Returns the X coordinate of this <code>Point2D</code> in
     * <code>double</code> precision.
     * @return the X coordinate of this <code>Point2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    protected Point2D() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessor
     * methods below.
     *
     * @see java.awt.geom.Point2D.Float
     * @see java.awt.geom.Point2D.Double
     * @see java.awt.Point
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public String toString() {

        /**
         * Returns a <code>String</code> that represents the value
         * of this <code>Point2D</code>.
         * @return a string representation of this <code>Point2D</code>.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public void setLocation(double x, double y) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public Double(double x, double y) {

        /**
         * Constructs and initializes a <code>Point2D</code> with the
         * specified coordinates.
         *
         * @param x the X coordinate of the newly
         *          constructed <code>Point2D</code>
         * @param y the Y coordinate of the newly
         *          constructed <code>Point2D</code>
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public Double() {

        /**
         * Constructs and initializes a <code>Point2D</code> with
         * coordinates (0,&nbsp;0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public double y;

        /**
         * The Y coordinate of this <code>Point2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public static class Double extends Point2D implements Serializable {

    /**
     * The <code>Double</code> class defines a point specified in
     * <code>double</code> precision.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public String toString() {

        /**
         * Returns a <code>String</code> that represents the value
         * of this <code>Point2D</code>.
         * @return a string representation of this <code>Point2D</code>.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public void setLocation(float x, float y) {

        /**
         * Sets the location of this <code>Point2D</code> to the
         * specified <code>float</code> coordinates.
         *
         * @param x the new X coordinate of this {@code Point2D}
         * @param y the new Y coordinate of this {@code Point2D}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public void setLocation(double x, double y) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public double getY() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public double getX() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public Float(float x, float y) {

        /**
         * Constructs and initializes a <code>Point2D</code> with
         * the specified coordinates.
         *
         * @param x the X coordinate of the newly
         *          constructed <code>Point2D</code>
         * @param y the Y coordinate of the newly
         *          constructed <code>Point2D</code>
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public Float() {

        /**
         * Constructs and initializes a <code>Point2D</code> with
         * coordinates (0,&nbsp;0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
        public float y;

        /**
         * The Y coordinate of this <code>Point2D</code>.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
    public static class Float extends Point2D implements Serializable {

    /**
     * The <code>Float</code> class defines a point specified in float
     * precision.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Point2D.java
public abstract class Point2D implements Cloneable {

/**
 * The <code>Point2D</code> class defines a point representing a location
 * in {@code (x,y)} coordinate space.
 * <p>
 * This class is only the abstract superclass for all objects that
 * store a 2D coordinate.
 * The actual storage representation of the coordinates is left to
 * the subclass.
 *
 * @author      Jim Graham
 * @since 1.2
 */
