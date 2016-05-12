_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/StubDelegate.java
    void writeObject(Stub self, ObjectOutputStream s)

    /**
     * Delegation call for
     * <a href="{@docRoot}/serialized-form.html#javax.rmi.CORBA.Stub"><code>Stub.writeObject(java.io.ObjectOutputStream)</code></a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/StubDelegate.java
    void readObject(Stub self, ObjectInputStream s)

    /**
     * Delegation call for
     * <a href="{@docRoot}/serialized-form.html#javax.rmi.CORBA.Stub"><code>Stub.readObject(java.io.ObjectInputStream)</code></a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/StubDelegate.java
    void connect(Stub self, ORB orb)

    /**
     * Delegation call for {@link Stub#connect}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/StubDelegate.java
    String toString(Stub self);

    /**
     * Delegation call for {@link Stub#toString}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/StubDelegate.java
    boolean equals(Stub self, java.lang.Object obj);

    /**
     * Delegation call for {@link Stub#equals}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/StubDelegate.java
    int hashCode(Stub self);

    /**
     * Delegation call for {@link Stub#hashCode}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/StubDelegate.java
public interface StubDelegate {

/**
 * Supports delegation for method implementations in {@link Stub}.
 * A delegate is an instance of a class that implements this
 * interface and provides a replacement implementation for all the
 * methods of <code>javax.rmi.CORBA.Stub</code>.  If delegation is
 * enabled, each stub has an associated delegate.
 *
 * Delegates are enabled by providing the delegate's class name as the
 * value of the
 * <code>javax.rmi.CORBA.StubClass</code>
 * system property.
 *
 * @see Stub
 */
