_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/PortableRemoteObjectDelegate.java
    void connect (Remote target, Remote source)

    /**
     * Delegation call for {@link javax.rmi.PortableRemoteObject#connect}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/PortableRemoteObjectDelegate.java
    java.lang.Object narrow (java.lang.Object narrowFrom,
                                    java.lang.Class narrowTo)

    /**
     * Delegation call for {@link javax.rmi.PortableRemoteObject#narrow}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/PortableRemoteObjectDelegate.java
    void unexportObject(Remote obj)

    /**
     * Delegation call for {@link javax.rmi.PortableRemoteObject#unexportObject}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/PortableRemoteObjectDelegate.java
    Remote toStub (Remote obj)

    /**
     * Delegation call for {@link javax.rmi.PortableRemoteObject#toStub}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/PortableRemoteObjectDelegate.java
    void exportObject(Remote obj)

    /**
     * Delegation call for {@link javax.rmi.PortableRemoteObject#exportObject}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/PortableRemoteObjectDelegate.java
public interface PortableRemoteObjectDelegate {

/**
 * Supports delegation for method implementations in {@link javax.rmi.PortableRemoteObject}.
 * The delegate is a singleton instance of a class that implements this
 * interface and provides a replacement implementation for all the
 * methods of <code>javax.rmi.PortableRemoteObject</code>.
 *
 * Delegates are enabled by providing the delegate's class name as the
 * value of the
 * <code>javax.rmi.CORBA.PortableRemoteObjectClass</code>
 * system property.
 *
 * @see javax.rmi.PortableRemoteObject
 */
