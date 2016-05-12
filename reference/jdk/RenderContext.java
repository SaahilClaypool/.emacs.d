_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public Object clone() {

    /**
     * Makes a copy of a RenderContext. The area of interest is copied
     * by reference.  The usr2dev AffineTransform and hints are cloned,
     * while the area of interest is copied by reference.
     *
     * @return the new cloned RenderContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public Shape getAreaOfInterest() {

    /**
     * Gets the ares of interest currently contained in the
     * RenderContext.
     *
     * @return a reference to the area of interest of the RenderContext,
     *         or null if none is specified.
     * @see #setAreaOfInterest(Shape)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public void setAreaOfInterest(Shape newAoi) {

    /**
     * Sets the current area of interest.  The old area is discarded.
     *
     * @param newAoi The new area of interest.
     * @see #getAreaOfInterest
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public AffineTransform getTransform() {

    /**
     * Gets the current user-to-device AffineTransform.
     *
     * @return a reference to the current AffineTransform.
     * @see #setTransform(AffineTransform)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    @Deprecated

    /**
     * Modifies the current user-to-device transform by appending another
     * transform.  In matrix notation the operation is:
     * <pre>
     * [this] = [this] x [modTransform]
     * </pre>
     * This method does the same thing as the concatenateTransform
     * method.  It is here for backward compatibility with previous releases
     * which misspelled the method name.
     *
     * @param modTransform the AffineTransform to append to the
     *        current usr2dev transform.
     * @deprecated     replaced by
     *                 <code>concatenateTransform(AffineTransform)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public void concatenateTransform(AffineTransform modTransform) {

    /**
     * Modifies the current user-to-device transform by appending another
     * transform.  In matrix notation the operation is:
     * <pre>
     * [this] = [this] x [modTransform]
     * </pre>
     *
     * @param modTransform the AffineTransform to append to the
     *        current usr2dev transform.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    @Deprecated

    /**
     * Modifies the current user-to-device transform by prepending another
     * transform.  In matrix notation the operation is:
     * <pre>
     * [this] = [modTransform] x [this]
     * </pre>
     * This method does the same thing as the preConcatenateTransform
     * method.  It is here for backward compatibility with previous releases
     * which misspelled the method name.
     *
     * @param modTransform the AffineTransform to prepend to the
     *        current usr2dev transform.
     * @deprecated     replaced by
     *                 <code>preConcatenateTransform(AffineTransform)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public void preConcatenateTransform(AffineTransform modTransform) {

    /**
     * Modifies the current user-to-device transform by prepending another
     * transform.  In matrix notation the operation is:
     * <pre>
     * [this] = [modTransform] x [this]
     * </pre>
     *
     * @param modTransform the AffineTransform to prepend to the
     *        current usr2dev transform.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public void setTransform(AffineTransform newTransform) {

    /**
     * Sets the current user-to-device AffineTransform contained
     * in the RenderContext to a given transform.
     *
     * @param newTransform the new AffineTransform.
     * @see #getTransform
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public void setRenderingHints(RenderingHints hints) {

    /**
     * Sets the rendering hints of this <code>RenderContext</code>.
     * @param hints a <code>RenderingHints</code> object that represents
     * the rendering hints to assign to this <code>RenderContext</code>.
     * @see #getRenderingHints
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public RenderingHints getRenderingHints() {

    /**
     * Gets the rendering hints of this <code>RenderContext</code>.
     * @return a <code>RenderingHints</code> object that represents
     * the rendering hints of this <code>RenderContext</code>.
     * @see #setRenderingHints(RenderingHints)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public RenderContext(AffineTransform usr2dev, Shape aoi) {

    /**
     * Constructs a RenderContext with a given transform and area of interest.
     * The area of interest is supplied as a Shape.
     * No rendering hints are used.
     *
     * @param usr2dev an AffineTransform.
     * @param aoi a Shape representing the area of interest.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public RenderContext(AffineTransform usr2dev, RenderingHints hints) {

    /**
     * Constructs a RenderContext with a given transform and rendering hints.
     * The area of interest is taken to be the entire renderable area.
     *
     * @param usr2dev an AffineTransform.
     * @param hints a RenderingHints object containing rendering hints.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public RenderContext(AffineTransform usr2dev) {

    /**
     * Constructs a RenderContext with a given transform.
     * The area of interest is taken to be the entire renderable area.
     * No rendering hints are used.
     *
     * @param usr2dev an AffineTransform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public RenderContext(AffineTransform usr2dev,
                         Shape aoi,
                         RenderingHints hints) {

    /**
     * Constructs a RenderContext with a given transform.
     * The area of interest is supplied as a Shape,
     * and the rendering hints are supplied as a RenderingHints object.
     *
     * @param usr2dev an AffineTransform.
     * @param aoi a Shape representing the area of interest.
     * @param hints a RenderingHints object containing rendering hints.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    Shape aoi;

    /** The area of interest.  May be null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    AffineTransform usr2dev;

    /** Transform to convert user coordinates to device coordinates.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    RenderingHints hints;

    /** Table of hints. May be null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
public class RenderContext implements Cloneable {

/**
 * A RenderContext encapsulates the information needed to produce a
 * specific rendering from a RenderableImage.  It contains the area to
 * be rendered specified in rendering-independent terms, the
 * resolution at which the rendering is to be performed, and hints
 * used to control the rendering process.
 *
 * <p> Users create RenderContexts and pass them to the
 * RenderableImage via the createRendering method.  Most of the methods of
 * RenderContexts are not meant to be used directly by applications,
 * but by the RenderableImage and operator classes to which it is
 * passed.
 *
 * <p> The AffineTransform parameter passed into and out of this class
 * are cloned.  The RenderingHints and Shape parameters are not
 * necessarily cloneable and are therefore only reference copied.
 * Altering RenderingHints or Shape instances that are in use by
 * instances of RenderContext may have undesired side effects.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public Object clone() {

    /**
     * Makes a copy of a RenderContext. The area of interest is copied
     * by reference.  The usr2dev AffineTransform and hints are cloned,
     * while the area of interest is copied by reference.
     *
     * @return the new cloned RenderContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public Shape getAreaOfInterest() {

    /**
     * Gets the ares of interest currently contained in the
     * RenderContext.
     *
     * @return a reference to the area of interest of the RenderContext,
     *         or null if none is specified.
     * @see #setAreaOfInterest(Shape)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public void setAreaOfInterest(Shape newAoi) {

    /**
     * Sets the current area of interest.  The old area is discarded.
     *
     * @param newAoi The new area of interest.
     * @see #getAreaOfInterest
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public AffineTransform getTransform() {

    /**
     * Gets the current user-to-device AffineTransform.
     *
     * @return a reference to the current AffineTransform.
     * @see #setTransform(AffineTransform)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    @Deprecated

    /**
     * Modifies the current user-to-device transform by appending another
     * transform.  In matrix notation the operation is:
     * <pre>
     * [this] = [this] x [modTransform]
     * </pre>
     * This method does the same thing as the concatenateTransform
     * method.  It is here for backward compatibility with previous releases
     * which misspelled the method name.
     *
     * @param modTransform the AffineTransform to append to the
     *        current usr2dev transform.
     * @deprecated     replaced by
     *                 <code>concatenateTransform(AffineTransform)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public void concatenateTransform(AffineTransform modTransform) {

    /**
     * Modifies the current user-to-device transform by appending another
     * transform.  In matrix notation the operation is:
     * <pre>
     * [this] = [this] x [modTransform]
     * </pre>
     *
     * @param modTransform the AffineTransform to append to the
     *        current usr2dev transform.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    @Deprecated

    /**
     * Modifies the current user-to-device transform by prepending another
     * transform.  In matrix notation the operation is:
     * <pre>
     * [this] = [modTransform] x [this]
     * </pre>
     * This method does the same thing as the preConcatenateTransform
     * method.  It is here for backward compatibility with previous releases
     * which misspelled the method name.
     *
     * @param modTransform the AffineTransform to prepend to the
     *        current usr2dev transform.
     * @deprecated     replaced by
     *                 <code>preConcatenateTransform(AffineTransform)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public void preConcatenateTransform(AffineTransform modTransform) {

    /**
     * Modifies the current user-to-device transform by prepending another
     * transform.  In matrix notation the operation is:
     * <pre>
     * [this] = [modTransform] x [this]
     * </pre>
     *
     * @param modTransform the AffineTransform to prepend to the
     *        current usr2dev transform.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public void setTransform(AffineTransform newTransform) {

    /**
     * Sets the current user-to-device AffineTransform contained
     * in the RenderContext to a given transform.
     *
     * @param newTransform the new AffineTransform.
     * @see #getTransform
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public void setRenderingHints(RenderingHints hints) {

    /**
     * Sets the rendering hints of this <code>RenderContext</code>.
     * @param hints a <code>RenderingHints</code> object that represents
     * the rendering hints to assign to this <code>RenderContext</code>.
     * @see #getRenderingHints
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public RenderingHints getRenderingHints() {

    /**
     * Gets the rendering hints of this <code>RenderContext</code>.
     * @return a <code>RenderingHints</code> object that represents
     * the rendering hints of this <code>RenderContext</code>.
     * @see #setRenderingHints(RenderingHints)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public RenderContext(AffineTransform usr2dev, Shape aoi) {

    /**
     * Constructs a RenderContext with a given transform and area of interest.
     * The area of interest is supplied as a Shape.
     * No rendering hints are used.
     *
     * @param usr2dev an AffineTransform.
     * @param aoi a Shape representing the area of interest.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public RenderContext(AffineTransform usr2dev, RenderingHints hints) {

    /**
     * Constructs a RenderContext with a given transform and rendering hints.
     * The area of interest is taken to be the entire renderable area.
     *
     * @param usr2dev an AffineTransform.
     * @param hints a RenderingHints object containing rendering hints.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public RenderContext(AffineTransform usr2dev) {

    /**
     * Constructs a RenderContext with a given transform.
     * The area of interest is taken to be the entire renderable area.
     * No rendering hints are used.
     *
     * @param usr2dev an AffineTransform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    public RenderContext(AffineTransform usr2dev,
                         Shape aoi,
                         RenderingHints hints) {

    /**
     * Constructs a RenderContext with a given transform.
     * The area of interest is supplied as a Shape,
     * and the rendering hints are supplied as a RenderingHints object.
     *
     * @param usr2dev an AffineTransform.
     * @param aoi a Shape representing the area of interest.
     * @param hints a RenderingHints object containing rendering hints.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    Shape aoi;

    /** The area of interest.  May be null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    AffineTransform usr2dev;

    /** Transform to convert user coordinates to device coordinates.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
    RenderingHints hints;

    /** Table of hints. May be null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderContext.java
public class RenderContext implements Cloneable {

/**
 * A RenderContext encapsulates the information needed to produce a
 * specific rendering from a RenderableImage.  It contains the area to
 * be rendered specified in rendering-independent terms, the
 * resolution at which the rendering is to be performed, and hints
 * used to control the rendering process.
 *
 * <p> Users create RenderContexts and pass them to the
 * RenderableImage via the createRendering method.  Most of the methods of
 * RenderContexts are not meant to be used directly by applications,
 * but by the RenderableImage and operator classes to which it is
 * passed.
 *
 * <p> The AffineTransform parameter passed into and out of this class
 * are cloned.  The RenderingHints and Shape parameters are not
 * necessarily cloneable and are therefore only reference copied.
 * Altering RenderingHints or Shape instances that are in use by
 * instances of RenderContext may have undesired side effects.
 */
