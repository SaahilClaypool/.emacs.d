_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/VMID.java
    public String toString() {

    /**
     * Return string representation of this VMID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/VMID.java
    public boolean equals(Object obj) {

    /**
     * Compare this VMID to another, and return true if they are the
     * same identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/VMID.java
    public int hashCode() {

    /**
     * Compute hash code for this VMID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/VMID.java
    @Deprecated

    /**
     * Return true if an accurate address can be determined for this
     * host.  If false, reliable VMID cannot be generated from this host
     * @return true if host address can be determined, false otherwise
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/VMID.java
    public VMID() {

    /**
     * Create a new VMID.  Each new VMID returned from this constructor
     * is unique for all Java virtual machines under the following
     * conditions: a) the conditions for uniqueness for objects of
     * the class <code>java.rmi.server.UID</code> are satisfied, and b) an
     * address can be obtained for this host that is unique and constant
     * for the lifetime of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/VMID.java
    private static final long serialVersionUID = -538642295484486218L;

    /** indicate compatibility with JDK 1.1.x version of class */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/VMID.java
    private UID uid;

    /**
     * @serial unique identifier with respect to host created on
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/VMID.java
    private byte[] addr;

    /**
     * @serial array of bytes uniquely identifying host created on
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/VMID.java
public final class VMID implements java.io.Serializable {

/**
 * A VMID is a identifier that is unique across all Java virtual
 * machines.  VMIDs are used by the distributed garbage collector
 * to identify client VMs.
 *
 * @author      Ann Wollrath
 * @author      Peter Jones
 */
