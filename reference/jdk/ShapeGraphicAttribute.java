_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public boolean equals(ShapeGraphicAttribute rhs) {

    /**
     * Compares this <code>ShapeGraphicAttribute</code> to the specified
     * <code>ShapeGraphicAttribute</code>.
     * @param rhs the <code>ShapeGraphicAttribute</code> to compare for
     * equality
     * @return <code>true</code> if this
     * <code>ShapeGraphicAttribute</code> equals <code>rhs</code>;
     * <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public boolean equals(Object rhs) {

    /**
     * Compares this <code>ShapeGraphicAttribute</code> to the specified
     * <code>Object</code>.
     * @param rhs the <code>Object</code> to compare for equality
     * @return <code>true</code> if this
     * <code>ShapeGraphicAttribute</code> equals <code>rhs</code>;
     * <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public int hashCode() {

    /**
     * Returns a hashcode for this <code>ShapeGraphicAttribute</code>.
     * @return  a hash code value for this
     * <code>ShapeGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public Shape getOutline(AffineTransform tx) {

    /**
     * Return a {@link java.awt.Shape} that represents the region that
     * this <code>ShapeGraphicAttribute</code> renders.  This is used when a
     * {@link TextLayout} is requested to return the outline of the text.
     * The (untransformed) shape must not extend outside the rectangular
     * bounds returned by <code>getBounds</code>.
     * @param tx an optional {@link AffineTransform} to apply to the
     *   this <code>ShapeGraphicAttribute</code>. This can be null.
     * @return the <code>Shape</code> representing this graphic attribute,
     *   suitable for stroking or filling.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public Rectangle2D getBounds() {

    /**
     * Returns a {@link Rectangle2D} that encloses all of the
     * bits drawn by this <code>ShapeGraphicAttribute</code> relative to
     * the rendering position.  A graphic can be rendered beyond its
     * origin, ascent, descent, or advance;  but if it does, this method's
     * implementation should indicate where the graphic is rendered.
     * @return a <code>Rectangle2D</code> that encloses all of the bits
     * rendered by this <code>ShapeGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public void draw(Graphics2D graphics, float x, float y) {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public float getAdvance() {

    /**
     * Returns the advance of this <code>ShapeGraphicAttribute</code>.
     * The advance of a <code>ShapeGraphicAttribute</code> is the distance
     * from the origin of its <code>Shape</code> to the right side of the
     * bounds of its <code>Shape</code>.
     * @return the advance of this <code>ShapeGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public float getDescent() {

    /**
     * Returns the descent of this <code>ShapeGraphicAttribute</code>.
     * The descent of a <code>ShapeGraphicAttribute</code> is the distance
     * from the origin of its <code>Shape</code> to the bottom of the
     * bounds of its <code>Shape</code>.
     * @return the descent of this <code>ShapeGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public float getAscent() {

    /**
     * Returns the ascent of this <code>ShapeGraphicAttribute</code>.  The
     * ascent of a <code>ShapeGraphicAttribute</code> is the positive
     * distance from the origin of its <code>Shape</code> to the top of
     * bounds of its <code>Shape</code>.
     * @return the ascent of this <code>ShapeGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public ShapeGraphicAttribute(Shape shape,
                                 int alignment,
                                 boolean stroke) {

    /**
     * Constructs a <code>ShapeGraphicAttribute</code> for the specified
     * {@link Shape}.
     * @param shape the <code>Shape</code> to render.  The
     * <code>Shape</code> is rendered with its origin at the origin of
     * this <code>ShapeGraphicAttribute</code> in the
     * host <code>TextLayout</code>.  This object maintains a reference to
     * <code>shape</code>.
     * @param alignment one of the alignments from this
     * <code>ShapeGraphicAttribute</code>.
     * @param stroke <code>true</code> if the <code>Shape</code> should be
     * stroked; <code>false</code> if the <code>Shape</code> should be
     * filled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public static final boolean FILL = false;

    /**
     * A key indicating the shape should be filled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public static final boolean STROKE = true;

    /**
     * A key indicating the shape should be stroked with a 1-pixel wide stroke.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
public final class ShapeGraphicAttribute extends GraphicAttribute {

/**
 * The <code>ShapeGraphicAttribute</code> class is an implementation of
 * {@link GraphicAttribute} that draws shapes in a {@link TextLayout}.
 * @see GraphicAttribute
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public boolean equals(ShapeGraphicAttribute rhs) {

    /**
     * Compares this <code>ShapeGraphicAttribute</code> to the specified
     * <code>ShapeGraphicAttribute</code>.
     * @param rhs the <code>ShapeGraphicAttribute</code> to compare for
     * equality
     * @return <code>true</code> if this
     * <code>ShapeGraphicAttribute</code> equals <code>rhs</code>;
     * <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public boolean equals(Object rhs) {

    /**
     * Compares this <code>ShapeGraphicAttribute</code> to the specified
     * <code>Object</code>.
     * @param rhs the <code>Object</code> to compare for equality
     * @return <code>true</code> if this
     * <code>ShapeGraphicAttribute</code> equals <code>rhs</code>;
     * <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public int hashCode() {

    /**
     * Returns a hashcode for this <code>ShapeGraphicAttribute</code>.
     * @return  a hash code value for this
     * <code>ShapeGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public Shape getOutline(AffineTransform tx) {

    /**
     * Return a {@link java.awt.Shape} that represents the region that
     * this <code>ShapeGraphicAttribute</code> renders.  This is used when a
     * {@link TextLayout} is requested to return the outline of the text.
     * The (untransformed) shape must not extend outside the rectangular
     * bounds returned by <code>getBounds</code>.
     * @param tx an optional {@link AffineTransform} to apply to the
     *   this <code>ShapeGraphicAttribute</code>. This can be null.
     * @return the <code>Shape</code> representing this graphic attribute,
     *   suitable for stroking or filling.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public Rectangle2D getBounds() {

    /**
     * Returns a {@link Rectangle2D} that encloses all of the
     * bits drawn by this <code>ShapeGraphicAttribute</code> relative to
     * the rendering position.  A graphic can be rendered beyond its
     * origin, ascent, descent, or advance;  but if it does, this method's
     * implementation should indicate where the graphic is rendered.
     * @return a <code>Rectangle2D</code> that encloses all of the bits
     * rendered by this <code>ShapeGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public void draw(Graphics2D graphics, float x, float y) {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public float getAdvance() {

    /**
     * Returns the advance of this <code>ShapeGraphicAttribute</code>.
     * The advance of a <code>ShapeGraphicAttribute</code> is the distance
     * from the origin of its <code>Shape</code> to the right side of the
     * bounds of its <code>Shape</code>.
     * @return the advance of this <code>ShapeGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public float getDescent() {

    /**
     * Returns the descent of this <code>ShapeGraphicAttribute</code>.
     * The descent of a <code>ShapeGraphicAttribute</code> is the distance
     * from the origin of its <code>Shape</code> to the bottom of the
     * bounds of its <code>Shape</code>.
     * @return the descent of this <code>ShapeGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public float getAscent() {

    /**
     * Returns the ascent of this <code>ShapeGraphicAttribute</code>.  The
     * ascent of a <code>ShapeGraphicAttribute</code> is the positive
     * distance from the origin of its <code>Shape</code> to the top of
     * bounds of its <code>Shape</code>.
     * @return the ascent of this <code>ShapeGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public ShapeGraphicAttribute(Shape shape,
                                 int alignment,
                                 boolean stroke) {

    /**
     * Constructs a <code>ShapeGraphicAttribute</code> for the specified
     * {@link Shape}.
     * @param shape the <code>Shape</code> to render.  The
     * <code>Shape</code> is rendered with its origin at the origin of
     * this <code>ShapeGraphicAttribute</code> in the
     * host <code>TextLayout</code>.  This object maintains a reference to
     * <code>shape</code>.
     * @param alignment one of the alignments from this
     * <code>ShapeGraphicAttribute</code>.
     * @param stroke <code>true</code> if the <code>Shape</code> should be
     * stroked; <code>false</code> if the <code>Shape</code> should be
     * filled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public static final boolean FILL = false;

    /**
     * A key indicating the shape should be filled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
    public static final boolean STROKE = true;

    /**
     * A key indicating the shape should be stroked with a 1-pixel wide stroke.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ShapeGraphicAttribute.java
public final class ShapeGraphicAttribute extends GraphicAttribute {

/**
 * The <code>ShapeGraphicAttribute</code> class is an implementation of
 * {@link GraphicAttribute} that draws shapes in a {@link TextLayout}.
 * @see GraphicAttribute
 */
