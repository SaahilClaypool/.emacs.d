_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/presentation/rmi/DynamicStub.java
    void connect( ORB orb ) throws RemoteException ;

    /** Connect this dynamic stub to an ORB.
     * Just as in standard RMI-IIOP, this is required after
     * a dynamic stub is deserialized from an ObjectInputStream.
     * It is not needed when unmarshalling from a
     * org.omg.CORBA.portable.InputStream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/presentation/rmi/DynamicStub.java
    String[] getTypeIds() ;

    /** Similar to ObjectImpl._ids
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/presentation/rmi/DynamicStub.java
    ORB getORB() ;

    /** Similar to ObjectImpl._orb()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/presentation/rmi/DynamicStub.java
    Delegate getDelegate() ;

    /** Similar to ObjectImpl._get_delegate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/presentation/rmi/DynamicStub.java
    void setDelegate( Delegate delegate ) ;

    /** Similar to ObjectImpl._set_delegate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/presentation/rmi/DynamicStub.java
public interface DynamicStub extends org.omg.CORBA.Object

/** Interface used to support dynamically generated stubs.
 * This supplies some methods that are found in
 * org.omg.CORBA.portable.ObjectImpl that are not available
 * in org.omg.CORBA.Object.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/presentation/rmi/DynamicStub.java
    void connect( ORB orb ) throws RemoteException ;

    /** Connect this dynamic stub to an ORB.
     * Just as in standard RMI-IIOP, this is required after
     * a dynamic stub is deserialized from an ObjectInputStream.
     * It is not needed when unmarshalling from a
     * org.omg.CORBA.portable.InputStream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/presentation/rmi/DynamicStub.java
    String[] getTypeIds() ;

    /** Similar to ObjectImpl._ids
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/presentation/rmi/DynamicStub.java
    ORB getORB() ;

    /** Similar to ObjectImpl._orb()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/presentation/rmi/DynamicStub.java
    Delegate getDelegate() ;

    /** Similar to ObjectImpl._get_delegate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/presentation/rmi/DynamicStub.java
    void setDelegate( Delegate delegate ) ;

    /** Similar to ObjectImpl._set_delegate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/presentation/rmi/DynamicStub.java
public interface DynamicStub extends org.omg.CORBA.Object

/** Interface used to support dynamically generated stubs.
 * This supplies some methods that are found in
 * org.omg.CORBA.portable.ObjectImpl that are not available
 * in org.omg.CORBA.Object.
 */
