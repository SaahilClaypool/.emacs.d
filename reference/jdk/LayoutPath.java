_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/LayoutPath.java
    public abstract void pathToPoint(Point2D location, boolean preceding,
                                     Point2D point);

    /**
     * Convert a location relative to the path to a point in user
     * coordinates.  The path might bend abruptly or be disjoint at
     * the location's advance.  If this is the case, the value of
     * 'preceding' is used to disambiguate the portion of the path
     * whose location and slope is to be used to interpret the offset.
     * @param location a <code>Point2D</code> representing the advance (in x) and
     * offset (in y) of a location relative to the path.  If location
     * is not the same object as point, location will remain
     * unmodified by this call.
     * @param preceding if true, the portion preceding the advance
     * should be used, if false the portion after should be used.
     * This has no effect if the path does not break or bend sharply
     * at the advance.
     * @param point a <code>Point2D</code> to hold the returned point.  It can be
     * the same object as location.
     * @throws NullPointerException if location or point is null
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/LayoutPath.java
public abstract class LayoutPath {

/**
 * LayoutPath provides a mapping between locations relative to the
 * baseline and points in user space.  Locations consist of an advance
 * along the baseline, and an offset perpendicular to the baseline at
 * the advance.  Positive values along the perpendicular are in the
 * direction that is 90 degrees clockwise from the baseline vector.
 * Locations are represented as a <code>Point2D</code>, where x is the advance and
 * y is the offset.
 *
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/LayoutPath.java
    public abstract void pathToPoint(Point2D location, boolean preceding,
                                     Point2D point);

    /**
     * Convert a location relative to the path to a point in user
     * coordinates.  The path might bend abruptly or be disjoint at
     * the location's advance.  If this is the case, the value of
     * 'preceding' is used to disambiguate the portion of the path
     * whose location and slope is to be used to interpret the offset.
     * @param location a <code>Point2D</code> representing the advance (in x) and
     * offset (in y) of a location relative to the path.  If location
     * is not the same object as point, location will remain
     * unmodified by this call.
     * @param preceding if true, the portion preceding the advance
     * should be used, if false the portion after should be used.
     * This has no effect if the path does not break or bend sharply
     * at the advance.
     * @param point a <code>Point2D</code> to hold the returned point.  It can be
     * the same object as location.
     * @throws NullPointerException if location or point is null
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/LayoutPath.java
public abstract class LayoutPath {

/**
 * LayoutPath provides a mapping between locations relative to the
 * baseline and points in user space.  Locations consist of an advance
 * along the baseline, and an offset perpendicular to the baseline at
 * the advance.  Positive values along the perpendicular are in the
 * direction that is 90 degrees clockwise from the baseline vector.
 * Locations are represented as a <code>Point2D</code>, where x is the advance and
 * y is the offset.
 *
 * @since 1.6
 */
