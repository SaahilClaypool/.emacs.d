_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    @SuppressWarnings("try")

    /**
     * Cycle through all Closeables sharing this FD and call
     * close() on each one.
     *
     * The caller closeable gets to call close0().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    synchronized void attach(Closeable c) {

    /**
     * Attach a Closeable to this FD for tracking.
     * parent reference is added to otherParents when
     * needed to make closeAll simpler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    public native void sync() throws SyncFailedException;

    /**
     * Force all system buffers to synchronize with the underlying
     * device.  This method returns after all modified data and
     * attributes of this FileDescriptor have been written to the
     * relevant device(s).  In particular, if this FileDescriptor
     * refers to a physical storage medium, such as a file in a file
     * system, sync will not return until all in-memory modified copies
     * of buffers associated with this FileDesecriptor have been
     * written to the physical medium.
     *
     * sync is meant to be used by code that requires physical
     * storage (such as a file) to be in a known state  For
     * example, a class that provided a simple transaction facility
     * might use sync to ensure that all changes to a file caused
     * by a given transaction were recorded on a storage medium.
     *
     * sync only affects buffers downstream of this FileDescriptor.  If
     * any in-memory buffering is being done by the application (for
     * example, by a BufferedOutputStream object), those buffers must
     * be flushed into the FileDescriptor (for example, by invoking
     * OutputStream.flush) before that data will be affected by sync.
     *
     * @exception SyncFailedException
     *        Thrown when the buffers cannot be flushed,
     *        or because the system cannot guarantee that all the
     *        buffers have been synchronized with physical media.
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    public boolean valid() {

    /**
     * Tests if this file descriptor object is valid.
     *
     * @return  {@code true} if the file descriptor object represents a
     *          valid, open file, socket, or other active I/O connection;
     *          {@code false} otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    public static final FileDescriptor err = standardStream(2);

    /**
     * A handle to the standard error stream. Usually, this file
     * descriptor is not used directly, but rather via the output stream
     * known as {@code System.err}.
     *
     * @see     java.lang.System#err
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    public static final FileDescriptor out = standardStream(1);

    /**
     * A handle to the standard output stream. Usually, this file
     * descriptor is not used directly, but rather via the output stream
     * known as {@code System.out}.
     * @see     java.lang.System#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    public static final FileDescriptor in = standardStream(0);

    /**
     * A handle to the standard input stream. Usually, this file
     * descriptor is not used directly, but rather via the input stream
     * known as {@code System.in}.
     *
     * @see     java.lang.System#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    public /**/ FileDescriptor() {

    /**
     * Constructs an (invalid) FileDescriptor
     * object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
public final class FileDescriptor {

/**
 * Instances of the file descriptor class serve as an opaque handle
 * to the underlying machine-specific structure representing an
 * open file, an open socket, or another source or sink of bytes.
 * The main practical use for a file descriptor is to create a
 * {@link FileInputStream} or {@link FileOutputStream} to contain it.
 *
 * <p>Applications should not create their own file descriptors.
 *
 * @author  Pavani Diwanji
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    @SuppressWarnings("try")

    /**
     * Cycle through all Closeables sharing this FD and call
     * close() on each one.
     *
     * The caller closeable gets to call close0().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    synchronized void attach(Closeable c) {

    /**
     * Attach a Closeable to this FD for tracking.
     * parent reference is added to otherParents when
     * needed to make closeAll simpler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    public native void sync() throws SyncFailedException;

    /**
     * Force all system buffers to synchronize with the underlying
     * device.  This method returns after all modified data and
     * attributes of this FileDescriptor have been written to the
     * relevant device(s).  In particular, if this FileDescriptor
     * refers to a physical storage medium, such as a file in a file
     * system, sync will not return until all in-memory modified copies
     * of buffers associated with this FileDesecriptor have been
     * written to the physical medium.
     *
     * sync is meant to be used by code that requires physical
     * storage (such as a file) to be in a known state  For
     * example, a class that provided a simple transaction facility
     * might use sync to ensure that all changes to a file caused
     * by a given transaction were recorded on a storage medium.
     *
     * sync only affects buffers downstream of this FileDescriptor.  If
     * any in-memory buffering is being done by the application (for
     * example, by a BufferedOutputStream object), those buffers must
     * be flushed into the FileDescriptor (for example, by invoking
     * OutputStream.flush) before that data will be affected by sync.
     *
     * @exception SyncFailedException
     *        Thrown when the buffers cannot be flushed,
     *        or because the system cannot guarantee that all the
     *        buffers have been synchronized with physical media.
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    public boolean valid() {

    /**
     * Tests if this file descriptor object is valid.
     *
     * @return  {@code true} if the file descriptor object represents a
     *          valid, open file, socket, or other active I/O connection;
     *          {@code false} otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    public static final FileDescriptor err = standardStream(2);

    /**
     * A handle to the standard error stream. Usually, this file
     * descriptor is not used directly, but rather via the output stream
     * known as {@code System.err}.
     *
     * @see     java.lang.System#err
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    public static final FileDescriptor out = standardStream(1);

    /**
     * A handle to the standard output stream. Usually, this file
     * descriptor is not used directly, but rather via the output stream
     * known as {@code System.out}.
     * @see     java.lang.System#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    public static final FileDescriptor in = standardStream(0);

    /**
     * A handle to the standard input stream. Usually, this file
     * descriptor is not used directly, but rather via the input stream
     * known as {@code System.in}.
     *
     * @see     java.lang.System#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
    public /**/ FileDescriptor() {

    /**
     * Constructs an (invalid) FileDescriptor
     * object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileDescriptor.java
public final class FileDescriptor {

/**
 * Instances of the file descriptor class serve as an opaque handle
 * to the underlying machine-specific structure representing an
 * open file, an open socket, or another source or sink of bytes.
 * The main practical use for a file descriptor is to create a
 * {@link FileInputStream} or {@link FileOutputStream} to contain it.
 *
 * <p>Applications should not create their own file descriptors.
 *
 * @author  Pavani Diwanji
 * @since   JDK1.0
 */
