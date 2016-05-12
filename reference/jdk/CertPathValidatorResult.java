_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertPathValidatorResult.java
    Object clone();

    /**
     * Makes a copy of this {@code CertPathValidatorResult}. Changes to the
     * copy will not affect the original and vice versa.
     *
     * @return a copy of this {@code CertPathValidatorResult}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertPathValidatorResult.java
public interface CertPathValidatorResult extends Cloneable {

/**
 * A specification of the result of a certification path validator algorithm.
 * <p>
 * The purpose of this interface is to group (and provide type safety
 * for) all certification path validator results. All results returned
 * by the {@link CertPathValidator#validate CertPathValidator.validate}
 * method must implement this interface.
 *
 * @see CertPathValidator
 *
 * @since       1.4
 * @author      Yassir Elley
 */
