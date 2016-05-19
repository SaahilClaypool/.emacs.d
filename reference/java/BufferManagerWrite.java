_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/BufferManagerWrite.java
     abstract public void close();

    /**
     * Close the BufferManagerWrite and do any outstanding cleanup.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/BufferManagerWrite.java
    public void setOutputObject(Object outputObject) {

    /**
     * A reference to the connection level stream will be required when
     * sending fragments.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/BufferManagerWrite.java
    public abstract void sendMessage ();

    /**
     * Called after Stub._invoke (i.e., before complete message has been sent).
     *
     * IIOPOutputStream.writeTo called from IIOPOutputStream.invoke
     *
     * Case: overflow was never called (bbwi.buf contains complete message).
     *       Backpatch size field.
     *       If growing or collecting:
     *          this.bufQ.put(bbwi).
     *          this.bufQ.iterate // However, see comment in getBufferQ
     *             this.connection.send(fragment)
     *       If streaming:
     *          this.connection.send(bbwi).
     *
     * Case: overflow was called N times (bbwi.buf contains last buffer).
     *       If growing or collecting:
     *          this.bufQ.put(bbwi).
     *          backpatch size field in first buffer.
     *          this.bufQ.iterate // However, see comment in getBufferQ
     *             this.connection.send(fragment)
     *       If streaming:
     *          backpatch fragment size field in bbwi.buf.
     *          Set no more fragments bit.
     *          this.connection.send(bbwi).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/BufferManagerWrite.java
    public abstract int getBufferSize();

    /**
     * Returns the correct buffer size for this type of
     * buffer manager as set in the ORB.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/BufferManagerWrite.java
    public boolean sentFullMessage() {

    /**
     * Has the entire message been sent?  (Has
     * sendMessage been called?)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/BufferManagerWrite.java
    public abstract boolean sentFragment();

    /**
     * Has the stream sent out any fragments so far?
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/BufferManagerWrite.java
public abstract class BufferManagerWrite

/**
 * Defines the contract between the BufferManager and
 * CDR stream on the writing side.  The CDR stream
 * calls back to the BufferManagerWrite when it needs
 * more room in the output buffer to continue.  The
 * BufferManager can then grow the output buffer or
 * use some kind of fragmentation technique.
 */
