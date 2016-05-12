_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/SaslServerFactory.java
    public abstract String[] getMechanismNames(Map<String,?> props);

    /**
     * Returns an array of names of mechanisms that match the specified
     * mechanism selection policies.
     * @param props The possibly null set of properties used to specify the
     * security policy of the SASL mechanisms. For example, if {@code props}
     * contains the {@code Sasl.POLICY_NOPLAINTEXT} property with the value
     * {@code "true"}, then the factory must not return any SASL mechanisms
     * that are susceptible to simple plain passive attacks.
     * See the {@code Sasl} class for a complete list of policy properties.
     * Non-policy related properties, if present in {@code props}, are ignored,
     * including any map entries with non-String keys.
     * @return A non-null array containing a IANA-registered SASL mechanism names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/SaslServerFactory.java
public abstract interface SaslServerFactory {

/**
 * An interface for creating instances of {@code SaslServer}.
 * A class that implements this interface
 * must be thread-safe and handle multiple simultaneous
 * requests. It must also have a public constructor that accepts no
 * argument.
 *<p>
 * This interface is not normally accessed directly by a server, which will use the
 * {@code Sasl} static methods
 * instead. However, a particular environment may provide and install a
 * new or different {@code SaslServerFactory}.
 *
 * @since 1.5
 *
 * @see SaslServer
 * @see Sasl
 *
 * @author Rosanna Lee
 * @author Rob Weltman
 */
