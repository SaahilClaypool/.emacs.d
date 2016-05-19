_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/DynamicMethodMarshaller.java
    Exception readException( ApplicationException ae ) ;

    /** Reads an exception ID and the corresponding exception from
     * the input stream.  This should be an exception declared in
     * this method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/DynamicMethodMarshaller.java
    void writeException( OutputStream os, Exception ex ) ;

    /** Write the repository ID of the exception and the value of the
     * exception to the OutputStream.  ex should be a declared exception
     * for this DynamicMethodMarshaller's method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/DynamicMethodMarshaller.java
    boolean isDeclaredException( Throwable thr ) ;

    /** Returns true iff thr's class is a declared exception (or a subclass of
     * a declared exception) for this DynamicMethodMarshaller's method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/DynamicMethodMarshaller.java
    void writeResult( OutputStream os, Object result ) ;

    /** Write the result to the OutputStream.  Does nothing if
     * the result type is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/DynamicMethodMarshaller.java
    Object readResult( InputStream is ) ;

    /** Read the result from the InputStream.  Returns null
     * if the result type is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/DynamicMethodMarshaller.java
    Object copyResult( Object result, ORB orb ) throws RemoteException ;

    /** Copy the result as needed for this particular method.
     * Can be optimized so that as little copying as possible is
     * performed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/DynamicMethodMarshaller.java
    void writeArguments( OutputStream os, Object[] args ) ;

    /** Write arguments for this method to the OutputStream.
     * Does nothing if there are no arguments.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/DynamicMethodMarshaller.java
    Object[] readArguments( InputStream is ) ;

    /** Read the arguments for this method from the InputStream.
     * Returns null if there are no arguments.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/DynamicMethodMarshaller.java
    Object[] copyArguments( Object[] args, ORB orb ) throws RemoteException ;

    /** Copy the arguments as needed for this particular method.
     * Can be optimized so that as little copying as possible is
     * performed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/DynamicMethodMarshaller.java
    Method getMethod() ;

    /** Returns the method used to create this DynamicMethodMarshaller.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/DynamicMethodMarshaller.java
public interface DynamicMethodMarshaller

/** Used to read and write arguments and results for a particular method.
*
*/
