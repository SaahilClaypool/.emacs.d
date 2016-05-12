_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertSelector.java
    Object clone();

    /**
     * Makes a copy of this {@code CertSelector}. Changes to the
     * copy will not affect the original and vice versa.
     *
     * @return a copy of this {@code CertSelector}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertSelector.java
    boolean match(Certificate cert);

    /**
     * Decides whether a {@code Certificate} should be selected.
     *
     * @param   cert    the {@code Certificate} to be checked
     * @return  {@code true} if the {@code Certificate}
     * should be selected, {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertSelector.java
public interface CertSelector extends Cloneable {

/**
 * A selector that defines a set of criteria for selecting
 * {@code Certificate}s. Classes that implement this interface
 * are often used to specify which {@code Certificate}s should
 * be retrieved from a {@code CertStore}.
 * <p>
 * <b>Concurrent Access</b>
 * <p>
 * Unless otherwise specified, the methods defined in this interface are not
 * thread-safe. Multiple threads that need to access a single
 * object concurrently should synchronize amongst themselves and
 * provide the necessary locking. Multiple threads each manipulating
 * separate objects need not synchronize.
 *
 * @see Certificate
 * @see CertStore
 * @see CertStore#getCertificates
 *
 * @author      Steve Hanna
 * @since       1.4
 */
