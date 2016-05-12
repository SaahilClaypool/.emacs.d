_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECParameterSpec.java
    public int getCofactor() {

    /**
     * Returns the cofactor.
     * @return the cofactor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECParameterSpec.java
    public BigInteger getOrder() {

    /**
     * Returns the order of the generator.
     * @return the order of the generator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECParameterSpec.java
    public ECPoint getGenerator() {

    /**
     * Returns the generator which is also known as the base point.
     * @return the generator which is also known as the base point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECParameterSpec.java
    public EllipticCurve getCurve() {

    /**
     * Returns the elliptic curve that this parameter defines.
     * @return the elliptic curve that this parameter defines.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECParameterSpec.java
    public ECParameterSpec(EllipticCurve curve, ECPoint g,
                           BigInteger n, int h) {

    /**
     * Creates elliptic curve domain parameters based on the
     * specified values.
     * @param curve the elliptic curve which this parameter
     * defines.
     * @param g the generator which is also known as the base point.
     * @param n the order of the generator {@code g}.
     * @param h the cofactor.
     * @exception NullPointerException if {@code curve},
     * {@code g}, or {@code n} is null.
     * @exception IllegalArgumentException if {@code n}
     * or {@code h} is not positive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECParameterSpec.java
public class ECParameterSpec implements AlgorithmParameterSpec {

/**
 * This immutable class specifies the set of domain parameters
 * used with elliptic curve cryptography (ECC).
 *
 * @see AlgorithmParameterSpec
 *
 * @author Valerie Peng
 *
 * @since 1.5
 */
