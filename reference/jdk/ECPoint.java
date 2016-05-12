_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPoint.java
    public int hashCode() {

    /**
     * Returns a hash code value for this elliptic curve point.
     * @return a hash code value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPoint.java
    public boolean equals(Object obj) {

    /**
     * Compares this elliptic curve point for equality with
     * the specified object.
     * @param obj the object to be compared.
     * @return true if {@code obj} is an instance of
     * ECPoint and the affine coordinates match, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPoint.java
    public BigInteger getAffineY() {

    /**
     * Returns the affine y-coordinate {@code y}.
     * Note: POINT_INFINITY has a null affine y-coordinate.
     * @return the affine y-coordinate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPoint.java
    public BigInteger getAffineX() {

    /**
     * Returns the affine x-coordinate {@code x}.
     * Note: POINT_INFINITY has a null affine x-coordinate.
     * @return the affine x-coordinate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPoint.java
    public ECPoint(BigInteger x, BigInteger y) {

    /**
     * Creates an ECPoint from the specified affine x-coordinate
     * {@code x} and affine y-coordinate {@code y}.
     * @param x the affine x-coordinate.
     * @param y the affine y-coordinate.
     * @exception NullPointerException if {@code x} or
     * {@code y} is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPoint.java
    public static final ECPoint POINT_INFINITY = new ECPoint();

    /**
     * This defines the point at infinity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPoint.java
public class ECPoint {

/**
 * This immutable class represents a point on an elliptic curve (EC)
 * in affine coordinates. Other coordinate systems can
 * extend this class to represent this point in other
 * coordinates.
 *
 * @author Valerie Peng
 *
 * @since 1.5
 */
