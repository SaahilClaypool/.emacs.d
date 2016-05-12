_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Stroke.java
public interface Stroke {

/**
 * The <code>Stroke</code> interface allows a
 * {@link Graphics2D} object to obtain a {@link Shape} that is the
 * decorated outline, or stylistic representation of the outline,
 * of the specified <code>Shape</code>.
 * Stroking a <code>Shape</code> is like tracing its outline with a
 * marking pen of the appropriate size and shape.
 * The area where the pen would place ink is the area enclosed by the
 * outline <code>Shape</code>.
 * <p>
 * The methods of the <code>Graphics2D</code> interface that use the
 * outline <code>Shape</code> returned by a <code>Stroke</code> object
 * include <code>draw</code> and any other methods that are
 * implemented in terms of that method, such as
 * <code>drawLine</code>, <code>drawRect</code>,
 * <code>drawRoundRect</code>, <code>drawOval</code>,
 * <code>drawArc</code>, <code>drawPolyline</code>,
 * and <code>drawPolygon</code>.
 * <p>
 * The objects of the classes implementing <code>Stroke</code>
 * must be read-only because <code>Graphics2D</code> does not
 * clone these objects either when they are set as an attribute
 * with the <code>setStroke</code> method or when the
 * <code>Graphics2D</code> object is itself cloned.
 * If a <code>Stroke</code> object is modified after it is set in
 * the <code>Graphics2D</code> context then the behavior
 * of subsequent rendering would be undefined.
 * @see BasicStroke
 * @see Graphics2D#setStroke
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Stroke.java
public interface Stroke {

/**
 * The <code>Stroke</code> interface allows a
 * {@link Graphics2D} object to obtain a {@link Shape} that is the
 * decorated outline, or stylistic representation of the outline,
 * of the specified <code>Shape</code>.
 * Stroking a <code>Shape</code> is like tracing its outline with a
 * marking pen of the appropriate size and shape.
 * The area where the pen would place ink is the area enclosed by the
 * outline <code>Shape</code>.
 * <p>
 * The methods of the <code>Graphics2D</code> interface that use the
 * outline <code>Shape</code> returned by a <code>Stroke</code> object
 * include <code>draw</code> and any other methods that are
 * implemented in terms of that method, such as
 * <code>drawLine</code>, <code>drawRect</code>,
 * <code>drawRoundRect</code>, <code>drawOval</code>,
 * <code>drawArc</code>, <code>drawPolyline</code>,
 * and <code>drawPolygon</code>.
 * <p>
 * The objects of the classes implementing <code>Stroke</code>
 * must be read-only because <code>Graphics2D</code> does not
 * clone these objects either when they are set as an attribute
 * with the <code>setStroke</code> method or when the
 * <code>Graphics2D</code> object is itself cloned.
 * If a <code>Stroke</code> object is modified after it is set in
 * the <code>Graphics2D</code> context then the behavior
 * of subsequent rendering would be undefined.
 * @see BasicStroke
 * @see Graphics2D#setStroke
 */
