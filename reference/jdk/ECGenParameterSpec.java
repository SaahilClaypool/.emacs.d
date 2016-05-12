_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECGenParameterSpec.java
    public String getName() {

    /**
     * Returns the standard or predefined name of the
     * to-be-generated EC domain parameters.
     * @return the standard or predefined name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECGenParameterSpec.java
    public ECGenParameterSpec(String stdName) {

    /**
     * Creates a parameter specification for EC parameter
     * generation using a standard (or predefined) name
     * {@code stdName} in order to generate the corresponding
     * (precomputed) elliptic curve domain parameters. For the
     * list of supported names, please consult the documentation
     * of provider whose implementation will be used.
     * @param stdName the standard name of the to-be-generated EC
     * domain parameters.
     * @exception NullPointerException if {@code stdName}
     * is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/ECGenParameterSpec.java
public class ECGenParameterSpec implements AlgorithmParameterSpec {

/**
 * This immutable class specifies the set of parameters used for
 * generating elliptic curve (EC) domain parameters.
 *
 * @see AlgorithmParameterSpec
 *
 * @author Valerie Peng
 *
 * @since 1.5
 */
