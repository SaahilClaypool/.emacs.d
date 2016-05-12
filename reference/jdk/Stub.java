_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Stub.java
    private static Properties getORBPropertiesFile () {

    /**
     * Load the orb.properties file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Stub.java
    private void writeObject(java.io.ObjectOutputStream stream) throws IOException {

    /**
     * Serialization method to save the IOR state.
     * @serialData The length of the IOR type ID (int), followed by the IOR type ID
     * (byte array encoded using ISO8859-1), followed by the number of IOR profiles
     * (int), followed by the IOR profiles.  Each IOR profile is written as a
     * profile tag (int), followed by the length of the profile data (int), followed
     * by the profile data (byte array).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Stub.java
    private void readObject(java.io.ObjectInputStream stream)

    /**
     * Serialization method to restore the IOR state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Stub.java
    public void connect(ORB orb) throws RemoteException {

    /**
     * Connects this stub to an ORB. Required after the stub is deserialized
     * but not after it is demarshalled by an ORB stream. If an unconnected
     * stub is passed to an ORB stream for marshalling, it is implicitly
     * connected to that ORB. Application code should not call this method
     * directly, but should call the portable wrapper method
     * {@link javax.rmi.PortableRemoteObject#connect}.
     * @param orb the ORB to connect to.
     * @exception RemoteException if the stub is already connected to a different
     * ORB, or if the stub does not represent an exported remote or local object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Stub.java
    public String toString() {

    /**
     * Returns a string representation of this stub. Returns the same string
     * for all stubs that represent the same remote object.
     * @return a string representation of this stub.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Stub.java
    public boolean equals(java.lang.Object obj) {

    /**
     * Compares two stubs for equality. Returns <code>true</code> when used to compare stubs
     * that represent the same remote object, and <code>false</code> otherwise.
     * @param obj the reference object with which to compare.
     * @return <code>true</code> if this object is the same as the <code>obj</code>
     *          argument; <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Stub.java
    public int hashCode() {

    /**
     * Returns a hash code value for the object which is the same for all stubs
     * that represent the same remote object.
     * @return the hash code value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Stub.java
public abstract class Stub extends ObjectImpl

/**
 * Base class from which all RMI-IIOP stubs must inherit.
 */
