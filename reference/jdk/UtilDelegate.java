_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    Object[] copyObjects(Object[] obj, ORB orb) throws RemoteException;

    /**
     * Delegation call for {@link Util#copyObjects}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    Object copyObject(Object obj, ORB orb) throws RemoteException;

    /**
     * Delegation call for {@link Util#copyObject}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    RemoteException wrapException(Throwable obj);

    /**
     * Delegation call for {@link Util#wrapException}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    boolean isLocal(Stub stub) throws RemoteException;

    /**
     * Delegation call for {@link Util#isLocal}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    Class loadClass(String className, String remoteCodebase, ClassLoader loader)

    /**
     * Delegation call for {@link Util#loadClass}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    String getCodebase(Class clz);

    /**
     * Delegation call for {@link Util#getCodebase}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    ValueHandler createValueHandler();

    /**
     * Delegation call for {@link Util#createValueHandler}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    Tie getTie(Remote target);

    /**
     * Delegation call for {@link Util#getTie}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    void unexportObject(Remote target) throws java.rmi.NoSuchObjectException;

    /**
     * Delegation call for {@link Util#unexportObject}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    void registerTarget(Tie tie, Remote target);

    /**
     * Delegation call for {@link Util#registerTarget}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    void writeAbstractObject(OutputStream out, Object obj);

    /**
     * Delegation call for {@link Util#writeAbstractObject}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    void writeRemoteObject(OutputStream out, Object obj);

    /**
     * Delegation call for {@link Util#writeRemoteObject}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    java.lang.Object readAny(InputStream in);

    /**
     * Delegation call for {@link Util#readAny}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    void writeAny(OutputStream out, Object obj);

    /**
     * Delegation call for {@link Util#writeAny}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
    RemoteException mapSystemException(SystemException ex);

    /**
     * Delegation call for {@link Util#mapSystemException}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/UtilDelegate.java
public interface UtilDelegate {

/**
 * Supports delegation for method implementations in {@link Util}.  The
 * delegate is a singleton instance of a class that implements this
 * interface and provides a replacement implementation for all the
 * methods of <code>javax.rmi.CORBA.Util</code>.
 *
 * Delegation is enabled by providing the delegate's class name as the
 * value of the
 * <code>javax.rmi.CORBA.UtilClass</code>
 * system property.
 *
 * @see Util
 */
