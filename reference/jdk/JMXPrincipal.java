_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXPrincipal.java
    public int hashCode() {

    /**
     * Returns a hash code for this <code>JMXPrincipal</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>JMXPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXPrincipal.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Object with this <code>JMXPrincipal</code>
     * for equality.  Returns true if the given object is also a
     * <code>JMXPrincipal</code> and the two JMXPrincipals
     * have the same name.
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     * <code>JMXPrincipal</code>.
     *
     * @return true if the specified Object is equal to this
     * <code>JMXPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXPrincipal.java
    public String toString() {

    /**
     * Returns a string representation of this <code>JMXPrincipal</code>.
     *
     * <p>
     *
     * @return a string representation of this <code>JMXPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXPrincipal.java
    public String getName() {

    /**
     * Returns the name of this principal.
     *
     * <p>
     *
     * @return the name of this <code>JMXPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXPrincipal.java
    public JMXPrincipal(String name) {

    /**
     * <p>Creates a JMXPrincipal for a given identity.</p>
     *
     * @param name the JMX Remote API name for this identity.
     *
     * @exception NullPointerException if the <code>name</code> is
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXPrincipal.java
    private String name;

    /**
     * @serial The JMX Remote API name for the identity represented by
     * this <code>JMXPrincipal</code> object.
     * @see #getName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXPrincipal.java
public class JMXPrincipal implements Principal, Serializable {

/**
 * <p>The identity of a remote client of the JMX Remote API.</p>
 *
 * <p>Principals such as this <code>JMXPrincipal</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the {@link javax.security.auth.Subject}
 * class for more information on how to achieve this.
 * Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 * @since 1.5
 */
