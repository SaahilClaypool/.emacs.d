_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPrivateKeySpec.java
    public ECParameterSpec getParams() {

    /**
     * Returns the associated elliptic curve domain
     * parameters.
     * @return the EC domain parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPrivateKeySpec.java
    public BigInteger getS() {

    /**
     * Returns the private value S.
     * @return the private value S.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPrivateKeySpec.java
    public ECPrivateKeySpec(BigInteger s, ECParameterSpec params) {

    /**
     * Creates a new ECPrivateKeySpec with the specified
     * parameter values.
     * @param s the private value.
     * @param params the associated elliptic curve domain
     * parameters.
     * @exception NullPointerException if {@code s}
     * or {@code params} is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECPrivateKeySpec.java
public class ECPrivateKeySpec implements KeySpec {

/**
 * This immutable class specifies an elliptic curve private key with
 * its associated parameters.
 *
 * @see KeySpec
 * @see ECParameterSpec
 *
 * @author Valerie Peng
 *
 * @since 1.5
 */
