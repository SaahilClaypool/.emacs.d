_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Principal.java
    public default boolean implies(Subject subject) {

    /**
     * Returns true if the specified subject is implied by this principal.
     *
     * <p>The default implementation of this method returns true if
     * {@code subject} is non-null and contains at least one principal that
     * is equal to this principal.
     *
     * <p>Subclasses may override this with a different implementation, if
     * necessary.
     *
     * @param subject the {@code Subject}
     * @return true if {@code subject} is non-null and is
     *              implied by this principal, or false otherwise.
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Principal.java
    public String getName();

    /**
     * Returns the name of this principal.
     *
     * @return the name of this principal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Principal.java
    public int hashCode();

    /**
     * Returns a hashcode for this principal.
     *
     * @return a hashcode for this principal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Principal.java
    public String toString();

    /**
     * Returns a string representation of this principal.
     *
     * @return a string representation of this principal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Principal.java
    public boolean equals(Object another);

    /**
     * Compares this principal to the specified object.  Returns true
     * if the object passed in matches the principal represented by
     * the implementation of this interface.
     *
     * @param another principal to compare with.
     *
     * @return true if the principal passed in is the same as that
     * encapsulated by this principal, and false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Principal.java
public interface Principal {

/**
 * This interface represents the abstract notion of a principal, which
 * can be used to represent any entity, such as an individual, a
 * corporation, and a login id.
 *
 * @see java.security.cert.X509Certificate
 *
 * @author Li Gong
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Principal.java
    @Deprecated

    /**
     * Gets the name of this <code>Principal</code> object.
     * @return the name of this <code>Principal</code> object
     * @deprecated Deprecated by CORBA 2.2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Principal.java
    @Deprecated

    /**
     * Sets the name of this <code>Principal</code> object to the given value.
     * @param value the value to be set in the <code>Principal</code>
     * @deprecated Deprecated by CORBA 2.2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Principal.java
@Deprecated

/**
 * A class that contains information about the identity of
 * the client, for access control
 * and other purposes. It contains a single attribute, the name of the
 * <code>Principal</code>, encoded as a sequence of bytes.
 * <P>
 * @deprecated Deprecated by CORBA 2.2.
 */
