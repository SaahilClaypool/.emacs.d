_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPublicKeySpec.java
    public ECParameterSpec getParams() {

    /**
     * Returns the associated elliptic curve domain
     * parameters.
     * @return the EC domain parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPublicKeySpec.java
    public ECPoint getW() {

    /**
     * Returns the public point W.
     * @return the public point W.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPublicKeySpec.java
    public ECPublicKeySpec(ECPoint w, ECParameterSpec params) {

    /**
     * Creates a new ECPublicKeySpec with the specified
     * parameter values.
     * @param w the public point.
     * @param params the associated elliptic curve domain
     * parameters.
     * @exception NullPointerException if {@code w}
     * or {@code params} is null.
     * @exception IllegalArgumentException if {@code w}
     * is point at infinity, i.e. ECPoint.POINT_INFINITY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPublicKeySpec.java
public class ECPublicKeySpec implements KeySpec {

/**
 * This immutable class specifies an elliptic curve public key with
 * its associated parameters.
 *
 * @see KeySpec
 * @see ECPoint
 * @see ECParameterSpec
 *
 * @author Valerie Peng
 *
 * @since 1.5
 */
