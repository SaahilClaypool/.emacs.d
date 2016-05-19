_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPOutputStream.java
    protected void internalWriteUTF(org.omg.CORBA.portable.OutputStream stream,
                                    String data)

    /**
     * Helper method for correcting the Kestrel bug 4367783 (dealing
     * with larger than 8-bit chars).  The old behavior is preserved
     * in orbutil.IIOPInputStream_1_3 in order to interoperate with
     * our legacy ORBs.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPOutputStream.java
    public final void reset() throws IOException{

    /**
     * Reset will disregard the state of any objects already written
     * to the stream.  The state is reset to be the same as a new
     * ObjectOutputStream.  The current point in the stream is marked
     * as reset so the corresponding ObjectInputStream will be reset
     * at the same point.  Objects previously written to the stream
     * will not be refered to as already being in the stream.  They
     * will be written to the stream again.
     * @since     JDK1.1
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPOutputStream.java
    public final boolean enableReplaceObjectDelegate(boolean enable)

    /**
     * Override the actions of the final method "enableReplaceObject()"
     * in ObjectOutputStream.
     * @since     JDK1.1.6
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPOutputStream.java
    public final void defaultWriteObjectDelegate()

    /**
     * Override the actions of the final method "defaultWriteObject()"
     * in ObjectOutputStream.
     * @since     JDK1.1.6
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPOutputStream.java
    public final void simpleWriteObject(Object obj, byte formatVersion)

    /**
     * Override the actions of the final method "writeObject()"
     * in ObjectOutputStream.
     * @since     JDK1.1.6
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPOutputStream.java
    public final void writeObjectOverride(Object obj)

    /**
     * Override the actions of the final method "writeObject()"
     * in ObjectOutputStream.
     * @since     JDK1.1.6
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPOutputStream.java
public class IIOPOutputStream

/**
 * IIOPOutputStream is ...
 *
 * @author  Stephen Lewallen
 * @since   JDK1.1.6
 */
