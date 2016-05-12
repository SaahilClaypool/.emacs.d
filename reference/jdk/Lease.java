_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/Lease.java
    public long getValue()

    /**
     * Returns the lease duration.
     * @return lease duration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/Lease.java
    public VMID getVMID()

    /**
     * Returns the client VMID associated with the lease.
     * @return client VMID
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/Lease.java
    public Lease(VMID id, long duration)

    /**
     * Constructs a lease with a specific VMID and lease duration. The
     * vmid may be null.
     * @param id VMID associated with this lease
     * @param duration lease duration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/Lease.java
    private long value;

    /**
     * @serial Duration of this lease.
     * @see #getValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/Lease.java
    private VMID vmid;

    /**
     * @serial Virtual Machine ID with which this Lease is associated.
     * @see #getVMID
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/dgc/Lease.java
public final class Lease implements java.io.Serializable {

/**
 * A lease contains a unique VM identifier and a lease duration. A
 * Lease object is used to request and grant leases to remote object
 * references.
 */
