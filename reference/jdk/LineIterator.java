_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/LineIterator.java
    public int currentSegment(double[] coords) {

    /**
     * Returns the coordinates and type of the current path segment in
     * the iteration.
     * The return value is the path segment type:
     * SEG_MOVETO, SEG_LINETO, SEG_QUADTO, SEG_CUBICTO, or SEG_CLOSE.
     * A double array of length 6 must be passed in and may be used to
     * store the coordinates of the point(s).
     * Each point is stored as a pair of double x,y coordinates.
     * SEG_MOVETO and SEG_LINETO types will return one point,
     * SEG_QUADTO will return two points,
     * SEG_CUBICTO will return 3 points
     * and SEG_CLOSE will not return any points.
     * @see #SEG_MOVETO
     * @see #SEG_LINETO
     * @see #SEG_QUADTO
     * @see #SEG_CUBICTO
     * @see #SEG_CLOSE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/LineIterator.java
    public int currentSegment(float[] coords) {

    /**
     * Returns the coordinates and type of the current path segment in
     * the iteration.
     * The return value is the path segment type:
     * SEG_MOVETO, SEG_LINETO, SEG_QUADTO, SEG_CUBICTO, or SEG_CLOSE.
     * A float array of length 6 must be passed in and may be used to
     * store the coordinates of the point(s).
     * Each point is stored as a pair of float x,y coordinates.
     * SEG_MOVETO and SEG_LINETO types will return one point,
     * SEG_QUADTO will return two points,
     * SEG_CUBICTO will return 3 points
     * and SEG_CLOSE will not return any points.
     * @see #SEG_MOVETO
     * @see #SEG_LINETO
     * @see #SEG_QUADTO
     * @see #SEG_CUBICTO
     * @see #SEG_CLOSE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/LineIterator.java
    public void next() {

    /**
     * Moves the iterator to the next segment of the path forwards
     * along the primary direction of traversal as long as there are
     * more points in that direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/LineIterator.java
    public boolean isDone() {

    /**
     * Tests if there are more points to read.
     * @return true if there are more points to read
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/LineIterator.java
    public int getWindingRule() {

    /**
     * Return the winding rule for determining the insideness of the
     * path.
     * @see #WIND_EVEN_ODD
     * @see #WIND_NON_ZERO
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/LineIterator.java
class LineIterator implements PathIterator {

/**
 * A utility class to iterate over the path segments of a line segment
 * through the PathIterator interface.
 *
 * @author      Jim Graham
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/LineIterator.java
    public int currentSegment(double[] coords) {

    /**
     * Returns the coordinates and type of the current path segment in
     * the iteration.
     * The return value is the path segment type:
     * SEG_MOVETO, SEG_LINETO, SEG_QUADTO, SEG_CUBICTO, or SEG_CLOSE.
     * A double array of length 6 must be passed in and may be used to
     * store the coordinates of the point(s).
     * Each point is stored as a pair of double x,y coordinates.
     * SEG_MOVETO and SEG_LINETO types will return one point,
     * SEG_QUADTO will return two points,
     * SEG_CUBICTO will return 3 points
     * and SEG_CLOSE will not return any points.
     * @see #SEG_MOVETO
     * @see #SEG_LINETO
     * @see #SEG_QUADTO
     * @see #SEG_CUBICTO
     * @see #SEG_CLOSE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/LineIterator.java
    public int currentSegment(float[] coords) {

    /**
     * Returns the coordinates and type of the current path segment in
     * the iteration.
     * The return value is the path segment type:
     * SEG_MOVETO, SEG_LINETO, SEG_QUADTO, SEG_CUBICTO, or SEG_CLOSE.
     * A float array of length 6 must be passed in and may be used to
     * store the coordinates of the point(s).
     * Each point is stored as a pair of float x,y coordinates.
     * SEG_MOVETO and SEG_LINETO types will return one point,
     * SEG_QUADTO will return two points,
     * SEG_CUBICTO will return 3 points
     * and SEG_CLOSE will not return any points.
     * @see #SEG_MOVETO
     * @see #SEG_LINETO
     * @see #SEG_QUADTO
     * @see #SEG_CUBICTO
     * @see #SEG_CLOSE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/LineIterator.java
    public void next() {

    /**
     * Moves the iterator to the next segment of the path forwards
     * along the primary direction of traversal as long as there are
     * more points in that direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/LineIterator.java
    public boolean isDone() {

    /**
     * Tests if there are more points to read.
     * @return true if there are more points to read
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/LineIterator.java
    public int getWindingRule() {

    /**
     * Return the winding rule for determining the insideness of the
     * path.
     * @see #WIND_EVEN_ODD
     * @see #WIND_NON_ZERO
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/LineIterator.java
class LineIterator implements PathIterator {

/**
 * A utility class to iterate over the path segments of a line segment
 * through the PathIterator interface.
 *
 * @author      Jim Graham
 */
