_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECFieldFp.java
    public int hashCode() {

    /**
     * Returns a hash code value for this prime finite field.
     * @return a hash code value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECFieldFp.java
    public boolean equals(Object obj) {

    /**
     * Compares this prime finite field for equality with the
     * specified object.
     * @param obj the object to be compared.
     * @return true if {@code obj} is an instance
     * of ECFieldFp and the prime value match, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECFieldFp.java
    public BigInteger getP() {

    /**
     * Returns the prime {@code p} of this prime finite field.
     * @return the prime.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECFieldFp.java
    public int getFieldSize() {

    /**
     * Returns the field size in bits which is size of prime p
     * for this prime finite field.
     * @return the field size in bits.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECFieldFp.java
    public ECFieldFp(BigInteger p) {

    /**
     * Creates an elliptic curve prime finite field
     * with the specified prime {@code p}.
     * @param p the prime.
     * @exception NullPointerException if {@code p} is null.
     * @exception IllegalArgumentException if {@code p}
     * is not positive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECFieldFp.java
public class ECFieldFp implements ECField {

/**
 * This immutable class defines an elliptic curve (EC) prime
 * finite field.
 *
 * @see ECField
 *
 * @author Valerie Peng
 *
 * @since 1.5
 */
