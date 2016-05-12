_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
    public boolean equals(Object rhs) {

    /**
     * Returns <code>true</code> if rhs is a <code>TransformAttribute</code>
     * whose transform is equal to this <code>TransformAttribute</code>'s
     * transform.
     * @param rhs the object to compare to
     * @return <code>true</code> if the argument is a <code>TransformAttribute</code>
     * whose transform is equal to this <code>TransformAttribute</code>'s
     * transform.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
    public int hashCode() {

    /**
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
    public static final TransformAttribute IDENTITY = new TransformAttribute(null);

    /**
     * A <code>TransformAttribute</code> representing the identity transform.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
    public boolean isIdentity() {

    /**
     * Returns <code>true</code> if the wrapped transform is
     * an identity transform.
     * @return <code>true</code> if the wrapped transform is
     * an identity transform; <code>false</code> otherwise.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
    public AffineTransform getTransform() {

    /**
     * Returns a copy of the wrapped transform.
     * @return a <code>AffineTransform</code> that is a copy of the wrapped
     * transform of this <code>TransformAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
    public TransformAttribute(AffineTransform transform) {

    /**
     * Wraps the specified transform.  The transform is cloned and a
     * reference to the clone is kept.  The original transform is unchanged.
     * If null is passed as the argument, this constructor behaves as though
     * it were the identity transform.  (Note that it is preferable to use
     * {@link #IDENTITY} in this case.)
     * @param transform the specified {@link AffineTransform} to be wrapped,
     * or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
    private AffineTransform transform;

    /**
     * The <code>AffineTransform</code> for this
     * <code>TransformAttribute</code>, or <code>null</code>
     * if <code>AffineTransform</code> is the identity transform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
public final class TransformAttribute implements Serializable {

/**
 * The <code>TransformAttribute</code> class provides an immutable
 * wrapper for a transform so that it is safe to use as an attribute.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
    public boolean equals(Object rhs) {

    /**
     * Returns <code>true</code> if rhs is a <code>TransformAttribute</code>
     * whose transform is equal to this <code>TransformAttribute</code>'s
     * transform.
     * @param rhs the object to compare to
     * @return <code>true</code> if the argument is a <code>TransformAttribute</code>
     * whose transform is equal to this <code>TransformAttribute</code>'s
     * transform.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
    public int hashCode() {

    /**
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
    public static final TransformAttribute IDENTITY = new TransformAttribute(null);

    /**
     * A <code>TransformAttribute</code> representing the identity transform.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
    public boolean isIdentity() {

    /**
     * Returns <code>true</code> if the wrapped transform is
     * an identity transform.
     * @return <code>true</code> if the wrapped transform is
     * an identity transform; <code>false</code> otherwise.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
    public AffineTransform getTransform() {

    /**
     * Returns a copy of the wrapped transform.
     * @return a <code>AffineTransform</code> that is a copy of the wrapped
     * transform of this <code>TransformAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
    public TransformAttribute(AffineTransform transform) {

    /**
     * Wraps the specified transform.  The transform is cloned and a
     * reference to the clone is kept.  The original transform is unchanged.
     * If null is passed as the argument, this constructor behaves as though
     * it were the identity transform.  (Note that it is preferable to use
     * {@link #IDENTITY} in this case.)
     * @param transform the specified {@link AffineTransform} to be wrapped,
     * or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
    private AffineTransform transform;

    /**
     * The <code>AffineTransform</code> for this
     * <code>TransformAttribute</code>, or <code>null</code>
     * if <code>AffineTransform</code> is the identity transform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TransformAttribute.java
public final class TransformAttribute implements Serializable {

/**
 * The <code>TransformAttribute</code> class provides an immutable
 * wrapper for a transform so that it is safe to use as an attribute.
 */
