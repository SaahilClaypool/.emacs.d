_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/PortableRemoteObject.java
    public void connect (Remote target, Remote source)

    /**
     * Makes a Remote object ready for remote communication. This normally
     * happens implicitly when the object is sent or received as an argument
     * on a remote method call, but in some circumstances it is useful to
     * perform this action by making an explicit call.  See the
     * {@link Stub#connect} method for more information.
     * @param target the object to connect.
     * @param source a previously connected object.
     * @throws RemoteException if <code>source</code> is not connected
     * or if <code>target</code> is already connected to a different ORB than
     * <code>source</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/PortableRemoteObject.java
    public java.lang.Object narrow ( java.lang.Object narrowFrom,
        java.lang.Class narrowTo) throws ClassCastException

    /**
     * Checks to ensure that an object of a remote or abstract interface type
     * can be cast to a desired type.
     * @param narrowFrom the object to check.
     * @param narrowTo the desired type.
     * @return an object which can be cast to the desired type.
     * @throws ClassCastException if narrowFrom cannot be cast to narrowTo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/PortableRemoteObject.java
    public void unexportObject(Remote obj)

    /**
     * Deregisters a server object from the runtime, allowing the object to become
     * available for garbage collection.
     * @param obj the object to unexport.
     * @exception NoSuchObjectException if the remote object is not
     * currently exported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/PortableRemoteObject.java
    public Remote toStub (Remote obj)

    /**
     * Returns a stub for the given server object.
     * @param obj the server object for which a stub is required. Must either be a subclass
     * of PortableRemoteObject or have been previously the target of a call to
     * {@link #exportObject}.
     * @return the most derived stub for the object.
     * @exception NoSuchObjectException if a stub cannot be located for the given server object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/PortableRemoteObject.java
    public void exportObject(Remote obj)

    /**
     * Makes a server object ready to receive remote calls. Note
     * that subclasses of PortableRemoteObject do not need to call this
     * method, as it is called by the constructor.
     * @param obj the server object to export.
     * @exception RemoteException if export fails.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/PortableRemoteObject.java
public class PortableRemoteObject

/**
 * Server implementation objects may either inherit from
 * javax.rmi.PortableRemoteObject or they may implement a remote interface
 * and then use the exportObject method to register themselves as a server object.
 * The toStub method takes a server implementation and returns a stub that
 * can be used to access that server object.
 * The connect method makes a Remote object ready for remote communication.
 * The unexportObject method is used to deregister a server object, allowing it to become
 * available for garbage collection.
 * The narrow method takes an object reference or abstract interface type and
 * attempts to narrow it to conform to
 * the given interface. If the operation is successful the result will be an
 * object of the specified type, otherwise an exception will be thrown.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/PortableRemoteObject.java
    public void connect (Remote target, Remote source)

    /**
     * Makes a Remote object ready for remote communication. This normally
     * happens implicitly when the object is sent or received as an argument
     * on a remote method call, but in some circumstances it is useful to
     * perform this action by making an explicit call.  See the
     * {@link Stub#connect} method for more information.
     * @param target the object to connect.
     * @param source a previously connected object.
     * @throws RemoteException if <code>source</code> is not connected
     * or if <code>target</code> is already connected to a different ORB than
     * <code>source</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/PortableRemoteObject.java
    public java.lang.Object narrow ( java.lang.Object narrowFrom,
        java.lang.Class narrowTo) throws ClassCastException

    /**
     * Checks to ensure that an object of a remote or abstract interface type
     * can be cast to a desired type.
     * @param narrowFrom the object to check.
     * @param narrowTo the desired type.
     * @return an object which can be cast to the desired type.
     * @throws ClassCastException if narrowFrom cannot be cast to narrowTo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/PortableRemoteObject.java
    public void unexportObject(Remote obj)

    /**
     * Deregisters a server object from the runtime, allowing the object to become
     * available for garbage collection.
     * @param obj the object to unexport.
     * @exception NoSuchObjectException if the remote object is not
     * currently exported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/PortableRemoteObject.java
    public Remote toStub (Remote obj)

    /**
     * Returns a stub for the given server object.
     * @param obj the server object for which a stub is required. Must either be a subclass
     * of PortableRemoteObject or have been previously the target of a call to
     * {@link #exportObject}.
     * @return the most derived stub for the object.
     * @exception NoSuchObjectException if a stub cannot be located for the given server object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/PortableRemoteObject.java
    public void exportObject(Remote obj)

    /**
     * Makes a server object ready to receive remote calls. Note
     * that subclasses of PortableRemoteObject do not need to call this
     * method, as it is called by the constructor.
     * @param obj the server object to export.
     * @exception RemoteException if export fails.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/PortableRemoteObject.java
public class PortableRemoteObject

/**
 * Server implementation objects may either inherit from
 * javax.rmi.PortableRemoteObject or they may implement a remote interface
 * and then use the exportObject method to register themselves as a server object.
 * The toStub method takes a server implementation and returns a stub that
 * can be used to access that server object.
 * The connect method makes a Remote object ready for remote communication.
 * The unexportObject method is used to deregister a server object, allowing it to become
 * available for garbage collection.
 * The narrow method takes an object reference or abstract interface type and
 * attempts to narrow it to conform to
 * the given interface. If the operation is successful the result will be an
 * object of the specified type, otherwise an exception will be thrown.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/PortableRemoteObject.java
    private static Properties getORBPropertiesFile () {

    /**
     * Load the orb.properties file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/PortableRemoteObject.java
    public static void connect (Remote target, Remote source)

    /**
     * Makes a Remote object ready for remote communication. This normally
     * happens implicitly when the object is sent or received as an argument
     * on a remote method call, but in some circumstances it is useful to
     * perform this action by making an explicit call.  See the
     * {@link javax.rmi.CORBA.Stub#connect} method for more information.
     * @param target the object to connect.
     * @param source a previously connected object.
     * @throws RemoteException if <code>source</code> is not connected
     * or if <code>target</code> is already connected to a different ORB than
     * <code>source</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/PortableRemoteObject.java
    public static java.lang.Object narrow ( java.lang.Object narrowFrom,
                                            java.lang.Class narrowTo)

    /**
     * Checks to ensure that an object of a remote or abstract interface type
     * can be cast to a desired type.
     * @param narrowFrom the object to check.
     * @param narrowTo the desired type.
     * @return an object which can be cast to the desired type.
     * @throws ClassCastException if narrowFrom cannot be cast to narrowTo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/PortableRemoteObject.java
    public static void unexportObject(Remote obj)

    /**
     * Deregisters a server object from the runtime, allowing the object to become
     * available for garbage collection.
     * @param obj the object to unexport.
     * @exception NoSuchObjectException if the remote object is not
     * currently exported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/PortableRemoteObject.java
    public static Remote toStub (Remote obj)

    /**
     * Returns a stub for the given server object.
     * @param obj the server object for which a stub is required. Must either be a subclass
     * of PortableRemoteObject or have been previously the target of a call to
     * {@link #exportObject}.
     * @return the most derived stub for the object.
     * @exception NoSuchObjectException if a stub cannot be located for the given server object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/PortableRemoteObject.java
    public static void exportObject(Remote obj)

    /**
     * Makes a server object ready to receive remote calls. Note
     * that subclasses of PortableRemoteObject do not need to call this
     * method, as it is called by the constructor.
     * @param obj the server object to export.
     * @exception RemoteException if export fails.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/PortableRemoteObject.java
    protected PortableRemoteObject() throws RemoteException {

    /**
     * Initializes the object by calling <code>exportObject(this)</code>.
     * @exception RemoteException if export fails.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/PortableRemoteObject.java
public class PortableRemoteObject {

/**
 * Server implementation objects may either inherit from
 * javax.rmi.PortableRemoteObject or they may implement a remote interface
 * and then use the exportObject method to register themselves as a server object.
 * The toStub method takes a server implementation and returns a stub that
 * can be used to access that server object.
 * The connect method makes a Remote object ready for remote communication.
 * The unexportObject method is used to deregister a server object, allowing it to become
 * available for garbage collection.
 * The narrow method takes an object reference or abstract interface type and
 * attempts to narrow it to conform to
 * the given interface. If the operation is successful the result will be an
 * object of the specified type, otherwise an exception will be thrown.
 */
