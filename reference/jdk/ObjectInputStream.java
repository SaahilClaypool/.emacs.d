_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static Object cloneArray(Object array) {

    /**
     * Method for cloning arrays in case of using unsharing reading
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private static class HandleList {

        /**
         * Simple growable list of (integer) handles.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private void grow() {

        /**
         * Expands capacity of internal arrays.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        int size() {

        /**
         * Returns number of handles registered in table.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void clear() {

        /**
         * Resets table to its initial state.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        ClassNotFoundException lookupException(int handle) {

        /**
         * Looks up and returns ClassNotFoundException associated with the
         * given handle.  Returns null if the given handle is NULL_HANDLE, or
         * if there is no ClassNotFoundException associated with the handle.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        Object lookupObject(int handle) {

        /**
         * Looks up and returns object associated with the given handle.
         * Returns null if the given handle is NULL_HANDLE, or if it has an
         * associated ClassNotFoundException.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void setObject(int handle, Object obj) {

        /**
         * Assigns a new object to the given handle.  The object previously
         * associated with the handle is forgotten.  This method has no effect
         * if the given handle already has an exception associated with it.
         * This method may be called at any time after the handle is assigned.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void finish(int handle) {

        /**
         * Marks given handle as finished, meaning that no new dependencies
         * will be marked for handle.  Calls to the assign and finish methods
         * must occur in LIFO order.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void markException(int handle, ClassNotFoundException ex) {

        /**
         * Associates a ClassNotFoundException (if one not already associated)
         * with the currently active handle and propagates it to other
         * referencing objects as appropriate.  The specified handle must be
         * "open" (i.e., assigned, but not finished yet).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void markDependency(int dependent, int target) {

        /**
         * Registers a dependency (in exception status) of one handle on
         * another.  The dependent handle must be "open" (i.e., assigned, but
         * not finished yet).  No action is taken if either dependent or target
         * handle is NULL_HANDLE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        int assign(Object obj) {

        /**
         * Assigns next available handle to given object, and returns assigned
         * handle.  Once object has been completely deserialized (and all
         * dependencies on other objects identified), the handle should be
         * "closed" by passing it to finish().
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        HandleTable(int initialCapacity) {

        /**
         * Creates handle table with the given initial capacity.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        int size = 0;

        /** number of handles in table */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        HandleList[] deps;

        /** array mapping handle -> list of dependent handles (if any) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        byte[] status;

        /** array mapping handle -> object status */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    // REMIND: add full description of exception propagation algorithm?

    /**
     * Unsynchronized table which tracks wire handle to object mappings, as
     * well as ClassNotFoundExceptions associated with deserialized objects.
     * This class implements an exception-propagation algorithm for
     * determining which objects should have ClassNotFoundExceptions associated
     * with them, taking into account cycles and discontinuities (e.g., skipped
     * fields) in the object graph.
     *
     * <p>General use of the table is as follows: during deserialization, a
     * given object is first assigned a handle by calling the assign method.
     * This method leaves the assigned handle in an "open" state, wherein
     * dependencies on the exception status of other handles can be registered
     * by calling the markDependency method, or an exception can be directly
     * associated with the handle by calling markException.  When a handle is
     * tagged with an exception, the HandleTable assumes responsibility for
     * propagating the exception to any other objects which depend
     * (transitively) on the exception-tagged object.
     *
     * <p>Once all exception information/dependencies for the handle have been
     * registered, the handle should be "closed" by calling the finish method
     * on it.  The act of finishing a handle allows the exception propagation
     * algorithm to aggressively prune dependency links, lessening the
     * performance/memory impact of exception tracking.
     *
     * <p>Note that the exception propagation algorithm used depends on handles
     * being assigned/finished in LIFO order; however, for simplicity as well
     * as memory conservation, it does not enforce this constraint.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private int readUTFChar(StringBuilder sbuf, long utflen)

        /**
         * Reads in single UTF-encoded character one byte at a time, appends
         * the character to sbuf, and returns the number of bytes consumed.
         * This method is used when reading in UTF strings written in block
         * data mode to handle UTF-encoded characters which (potentially)
         * straddle block-data boundaries.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private long readUTFSpan(StringBuilder sbuf, long utflen)

        /**
         * Reads span of UTF-encoded characters out of internal buffer
         * (starting at offset pos and ending at or before offset end),
         * consuming no more than utflen bytes.  Appends read characters to
         * sbuf.  Returns the number of bytes consumed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private String readUTFBody(long utflen) throws IOException {

        /**
         * Reads in the "body" (i.e., the UTF representation minus the 2-byte
         * or 8-byte length header) of a UTF encoding, which occupies the next
         * utflen bytes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        String readLongUTF() throws IOException {

        /**
         * Reads in string written in "long" UTF format.  "Long" UTF format is
         * identical to standard UTF, except that it uses an 8 byte header
         * (instead of the standard 2 bytes) to convey the UTF encoding length.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        int read(byte[] b, int off, int len, boolean copy) throws IOException {

        /**
         * Attempts to read len bytes into byte array b at offset off.  Returns
         * the number of bytes read, or -1 if the end of stream/block data has
         * been reached.  If copy is true, reads values into an intermediate
         * buffer before copying them to b (to avoid exposing a reference to
         * b).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        byte peekByte() throws IOException {

        /**
         * Peeks at (but does not consume) and returns the next byte value in
         * the stream, or throws EOFException if end of stream/block data has
         * been reached.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        int peek() throws IOException {

        /**
         * Peeks at (but does not consume) and returns the next byte value in
         * the stream, or -1 if the end of the stream/block data (if in block
         * data mode) has been reached.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        int currentBlockRemaining() {

        /**
         * If in block data mode, returns the number of unconsumed bytes
         * remaining in the current data block.  If not in block data mode,
         * throws an IllegalStateException.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private void refill() throws IOException {

        /**
         * Refills internal buffer buf with block data.  Any data in buf at the
         * time of the call is considered consumed.  Sets the pos, end, and
         * unread fields to reflect the new amount of available block data; if
         * the next element in the stream is not a data block, sets pos and
         * unread to 0 and end to -1.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private int readBlockHeader(boolean canBlock) throws IOException {

        /**
         * Attempts to read in the next block data header (if any).  If
         * canBlock is false and a full header cannot be read without possibly
         * blocking, returns HEADER_BLOCKED, else if the next element in the
         * stream is a block data header, returns the block data length
         * specified by the header, else returns -1.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void skipBlockData() throws IOException {

        /**
         * If in block data mode, skips to the end of the current group of data
         * blocks (but does not unset block data mode).  If not in block data
         * mode, throws an IllegalStateException.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        boolean getBlockDataMode() {

        /**
         * Returns true if the stream is currently in block data mode, false
         * otherwise.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        boolean setBlockDataMode(boolean newmode) throws IOException {

        /**
         * Sets block data mode to the given mode (true == on, false == off)
         * and returns the previous mode value.  If the new mode is the same as
         * the old mode, no action is taken.  Throws IllegalStateException if
         * block data mode is being switched from on to off while unconsumed
         * block data is still present in the stream.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        BlockDataInputStream(InputStream in) {

        /**
         * Creates new BlockDataInputStream on top of given underlying stream.
         * Block data mode is turned off by default.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private final PeekInputStream in;

        /** underlying stream (wrapped in peekable filter stream) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private int unread = 0;

        /** number of bytes in current block yet to be read from stream */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private int pos = 0;

        /** current offset into buf */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private boolean blkmode = false;

        /** block data mode */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private final char[] cbuf = new char[CHAR_BUF_SIZE];

        /** char buffer for fast string reads */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private final byte[] buf = new byte[MAX_BLOCK_SIZE];

        /** buffer for reading general/block data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private static final int CHAR_BUF_SIZE = 256;

        /** (tunable) length of char buffer (for reading strings) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private static final int MAX_BLOCK_SIZE = 1024;

        /** maximum data block length */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private class BlockDataInputStream

    /**
     * Input stream with two modes: in default mode, inputs data written in the
     * same format as DataOutputStream; in "block data" mode, inputs data
     * bracketed by block data markers (see object serialization specification
     * for details).  Buffering depends on block data mode: when in default
     * mode, no data is buffered in advance; when in block data mode, all data
     * for the current data block is read in at once (and buffered).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        int peek() throws IOException {

        /**
         * Peeks at next byte value in stream.  Similar to read(), except
         * that it does not consume the read value.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        PeekInputStream(InputStream in) {

        /**
         * Creates new PeekInputStream on top of given underlying stream.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private final InputStream in;

        /** underlying stream */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static class PeekInputStream extends InputStream {

    /**
     * Input stream supporting single-byte peek operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public void clear() {

        /**
         * Resets the callback list to its initial (empty) state.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void doCallbacks() throws InvalidObjectException {

        /**
         * Invokes all registered callbacks and clears the callback list.
         * Callbacks with higher priorities are called first; those with equal
         * priorities may be called in any order.  If any of the callbacks
         * throws an InvalidObjectException, the callback process is terminated
         * and the exception propagated upwards.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void register(ObjectInputValidation obj, int priority)

        /**
         * Registers callback.  Throws InvalidObjectException if callback
         * object is null.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        ValidationList() {

        /**
         * Creates new (empty) ValidationList.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private Callback list;

        /** linked list of callbacks */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static class ValidationList {

    /**
     * Prioritized list of callbacks to be performed once object graph has been
     * completely deserialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private int getFieldOffset(String name, Class<?> type) {

        /**
         * Returns offset of field with given name and type.  A specified type
         * of null matches all types, Object.class matches all non-primitive
         * types, and any other non-null type matches assignable types only.
         * If no matching field is found in the (incoming) class
         * descriptor but a matching field is present in the associated local
         * class descriptor, returns -1.  Throws IllegalArgumentException if
         * neither incoming nor local class descriptor contains a match.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void readFields() throws IOException {

        /**
         * Reads primitive and object field values from stream.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        GetFieldImpl(ObjectStreamClass desc) {

        /**
         * Creates GetFieldImpl object for reading fields defined in given
         * class descriptor.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private final Object[] objVals;

        /** object field values */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private final ObjectStreamClass desc;

        /** class descriptor describing serializable fields */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private class GetFieldImpl extends GetField {

    /**
     * Default GetField implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static ClassLoader latestUserDefinedLoader() {

    /**
     * Returns the first non-null class loader (not counting class loaders of
     * generated reflection implementation classes) up the execution stack, or
     * null if only code from the null class loader is on the stack.  This
     * method is also called via reflection by the following RMI-IIOP class:
     *
     *     com.sun.corba.se.internal.util.JDKClassLoader
     *
     * This method should not be removed or its signature changed without
     * corresponding modifications to the above class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    // REMIND: remove once hotspot inlines Double.longBitsToDouble

    /**
     * Converts specified span of bytes into double values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    // REMIND: remove once hotspot inlines Float.intBitsToFloat

    /**
     * Converts specified span of bytes into float values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private void handleReset() throws StreamCorruptedException {

    /**
     * If recursion depth is 0, clears internal data structures; otherwise,
     * throws a StreamCorruptedException.  This method is called when a
     * TC_RESET typecode is encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private IOException readFatalException() throws IOException {

    /**
     * Reads in and returns IOException that caused serialization to abort.
     * All stream state is discarded prior to reading in fatal exception.  Sets
     * passHandle to fatal exception's handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private void defaultReadFields(Object obj, ObjectStreamClass desc)

    /**
     * Reads in values of serializable fields declared by given class
     * descriptor.  If obj is non-null, sets field values in obj.  Expects that
     * passHandle is set to obj's handle before this method is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private void skipCustomData() throws IOException {

    /**
     * Skips over all block data and objects until TC_ENDBLOCKDATA is
     * encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private void readSerialData(Object obj, ObjectStreamClass desc)

    /**
     * Reads (or attempts to skip, if obj is null or is tagged with a
     * ClassNotFoundException) instance data for each serializable class of
     * object in stream, from superclass to subclass.  Expects that passHandle
     * is set to obj's handle before this method is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private void readExternalData(Externalizable obj, ObjectStreamClass desc)

    /**
     * If obj is non-null, reads externalizable data by invoking readExternal()
     * method of obj; otherwise, attempts to skip over externalizable data.
     * Expects that passHandle is set to obj's handle before this method is
     * called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Object readOrdinaryObject(boolean unshared)

    /**
     * Reads and returns "ordinary" (i.e., not a String, Class,
     * ObjectStreamClass, array, or enum constant) object, or null if object's
     * class is unresolvable (in which case a ClassNotFoundException will be
     * associated with object's handle).  Sets passHandle to object's assigned
     * handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Enum<?> readEnum(boolean unshared) throws IOException {

    /**
     * Reads in and returns enum constant, or null if enum type is
     * unresolvable.  Sets passHandle to enum constant's assigned handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Object readArray(boolean unshared) throws IOException {

    /**
     * Reads in and returns array object, or null if array class is
     * unresolvable.  Sets passHandle to array's assigned handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private String readString(boolean unshared) throws IOException {

    /**
     * Reads in and returns new string.  Sets passHandle to new string's
     * assigned handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private ObjectStreamClass readNonProxyDesc(boolean unshared)

    /**
     * Reads in and returns class descriptor for a class that is not a dynamic
     * proxy class.  Sets passHandle to class descriptor's assigned handle.  If
     * class descriptor cannot be resolved to a class in the local VM, a
     * ClassNotFoundException is associated with the descriptor's handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private ObjectStreamClass readProxyDesc(boolean unshared)

    /**
     * Reads in and returns class descriptor for a dynamic proxy class.  Sets
     * passHandle to proxy class descriptor's assigned handle.  If proxy class
     * descriptor cannot be resolved to a class in the local VM, a
     * ClassNotFoundException is associated with the descriptor's handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private ObjectStreamClass readClassDesc(boolean unshared)

    /**
     * Reads in and returns (possibly null) class descriptor.  Sets passHandle
     * to class descriptor's assigned handle.  If class descriptor cannot be
     * resolved to a class in the local VM, a ClassNotFoundException is
     * associated with the class descriptor's handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Class<?> readClass(boolean unshared) throws IOException {

    /**
     * Reads in and returns class object.  Sets passHandle to class object's
     * assigned handle.  Returns null if class is unresolvable (in which case a
     * ClassNotFoundException will be associated with the class' handle in the
     * handle table).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Object readHandle(boolean unshared) throws IOException {

    /**
     * Reads in object handle, sets passHandle to the read handle, and returns
     * object associated with the handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Object readNull() throws IOException {

    /**
     * Reads in null code, sets passHandle to NULL_HANDLE and returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    String readTypeString() throws IOException {

    /**
     * Reads string without allowing it to be replaced in stream.  Called from
     * within ObjectStreamClass.read().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Object checkResolve(Object obj) throws IOException {

    /**
     * If resolveObject has been enabled and given object does not have an
     * exception associated with it, calls resolveObject to determine
     * replacement for object, and updates handle table accordingly.  Returns
     * replacement object, or echoes provided object if no replacement
     * occurred.  Expects that passHandle is set to given object's handle prior
     * to calling this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Object readObject0(boolean unshared) throws IOException {

    /**
     * Underlying readObject implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private void clear() {

    /**
     * Clears internal data structures.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static boolean auditSubclass(final Class<?> subcl) {

    /**
     * Performs reflective checks on given subclass to verify that it doesn't
     * override security-sensitive non-final methods.  Returns true if subclass
     * is "safe", false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private void verifySubclass() {

    /**
     * Verifies that this (possibly subclass) instance can be constructed
     * without violating security constraints: the subclass must not override
     * security-sensitive non-final methods, or else the
     * "enableSubclassImplementation" SerializablePermission is checked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract Object get(String name, Object val) throws IOException;

        /**
         * Get the value of the named Object field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>Object</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract double get(String name, double val) throws IOException;

        /**
         * Get the value of the named double field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>double</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract float get(String name, float val) throws IOException;

        /**
         * Get the value of the named float field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>float</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract long get(String name, long val) throws IOException;

        /**
         * Get the value of the named long field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>long</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract int get(String name, int val) throws IOException;

        /**
         * Get the value of the named int field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>int</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract short get(String name, short val) throws IOException;

        /**
         * Get the value of the named short field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>short</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract char get(String name, char val) throws IOException;

        /**
         * Get the value of the named char field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>char</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract byte get(String name, byte val) throws IOException;

        /**
         * Get the value of the named byte field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>byte</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract boolean get(String name, boolean val)

        /**
         * Get the value of the named boolean field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>boolean</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract boolean defaulted(String name) throws IOException;

        /**
         * Return true if the named field is defaulted and has no value in this
         * stream.
         *
         * @param  name the name of the field
         * @return true, if and only if the named field is defaulted
         * @throws IOException if there are I/O errors while reading from
         *         the underlying <code>InputStream</code>
         * @throws IllegalArgumentException if <code>name</code> does not
         *         correspond to a serializable field
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract ObjectStreamClass getObjectStreamClass();

        /**
         * Get the ObjectStreamClass that describes the fields in the stream.
         *
         * @return  the descriptor class that describes the serializable fields
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public static abstract class GetField {

    /**
     * Provide access to the persistent fields read from the input stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public String readUTF() throws IOException {

    /**
     * Reads a String in
     * <a href="DataInput.html#modified-utf-8">modified UTF-8</a>
     * format.
     *
     * @return  the String.
     * @throws  IOException if there are I/O errors while reading from the
     *          underlying <code>InputStream</code>
     * @throws  UTFDataFormatException if read bytes do not represent a valid
     *          modified UTF-8 encoding of a string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    @Deprecated

    /**
     * Reads in a line that has been terminated by a \n, \r, \r\n or EOF.
     *
     * @return  a String copy of the line.
     * @throws  IOException if there are I/O errors while reading from the
     *          underlying <code>InputStream</code>
     * @deprecated This method does not properly convert bytes to characters.
     *          see DataInputStream for the details and alternatives.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public int skipBytes(int len) throws IOException {

    /**
     * Skips bytes.
     *
     * @param   len the number of bytes to be skipped
     * @return  the actual number of bytes skipped.
     * @throws  IOException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public void readFully(byte[] buf, int off, int len) throws IOException {

    /**
     * Reads bytes, blocking until all bytes are read.
     *
     * @param   buf the buffer into which the data is read
     * @param   off the start offset of the data
     * @param   len the maximum number of bytes to read
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public void readFully(byte[] buf) throws IOException {

    /**
     * Reads bytes, blocking until all bytes are read.
     *
     * @param   buf the buffer into which the data is read
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public double readDouble() throws IOException {

    /**
     * Reads a 64 bit double.
     *
     * @return  the 64 bit double read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public float readFloat() throws IOException {

    /**
     * Reads a 32 bit float.
     *
     * @return  the 32 bit float read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public long readLong()  throws IOException {

    /**
     * Reads a 64 bit long.
     *
     * @return  the read 64 bit long.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public int readInt()  throws IOException {

    /**
     * Reads a 32 bit int.
     *
     * @return  the 32 bit integer read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public int readUnsignedShort() throws IOException {

    /**
     * Reads an unsigned 16 bit short.
     *
     * @return  the 16 bit short read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public short readShort()  throws IOException {

    /**
     * Reads a 16 bit short.
     *
     * @return  the 16 bit short read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public char readChar()  throws IOException {

    /**
     * Reads a 16 bit char.
     *
     * @return  the 16 bit char read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public int readUnsignedByte()  throws IOException {

    /**
     * Reads an unsigned 8 bit byte.
     *
     * @return  the 8 bit byte read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public byte readByte() throws IOException  {

    /**
     * Reads an 8 bit byte.
     *
     * @return  the 8 bit byte read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public boolean readBoolean() throws IOException {

    /**
     * Reads in a boolean.
     *
     * @return  the boolean read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public void close() throws IOException {

    /**
     * Closes the input stream. Must be called to release any resources
     * associated with the stream.
     *
     * @throws  IOException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public int available() throws IOException {

    /**
     * Returns the number of bytes that can be read without blocking.
     *
     * @return  the number of available bytes.
     * @throws  IOException if there are I/O errors while reading from the
     *          underlying <code>InputStream</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public int read(byte[] buf, int off, int len) throws IOException {

    /**
     * Reads into an array of bytes.  This method will block until some input
     * is available. Consider using java.io.DataInputStream.readFully to read
     * exactly 'length' bytes.
     *
     * @param   buf the buffer into which the data is read
     * @param   off the start offset of the data
     * @param   len the maximum number of bytes read
     * @return  the actual number of bytes read, -1 is returned when the end of
     *          the stream is reached.
     * @throws  IOException If an I/O error has occurred.
     * @see java.io.DataInputStream#readFully(byte[],int,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public int read() throws IOException {

    /**
     * Reads a byte of data. This method will block if no input is available.
     *
     * @return  the byte read, or -1 if the end of the stream is reached.
     * @throws  IOException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected ObjectStreamClass readClassDescriptor()

    /**
     * Read a class descriptor from the serialization stream.  This method is
     * called when the ObjectInputStream expects a class descriptor as the next
     * item in the serialization stream.  Subclasses of ObjectInputStream may
     * override this method to read in class descriptors that have been written
     * in non-standard formats (by subclasses of ObjectOutputStream which have
     * overridden the <code>writeClassDescriptor</code> method).  By default,
     * this method reads class descriptors according to the format defined in
     * the Object Serialization specification.
     *
     * @return  the class descriptor read
     * @throws  IOException If an I/O error has occurred.
     * @throws  ClassNotFoundException If the Class of a serialized object used
     *          in the class descriptor representation cannot be found
     * @see java.io.ObjectOutputStream#writeClassDescriptor(java.io.ObjectStreamClass)
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected void readStreamHeader()

    /**
     * The readStreamHeader method is provided to allow subclasses to read and
     * verify their own stream headers. It reads and verifies the magic number
     * and version number.
     *
     * @throws  IOException if there are I/O errors while reading from the
     *          underlying <code>InputStream</code>
     * @throws  StreamCorruptedException if control information in the stream
     *          is inconsistent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected boolean enableResolveObject(boolean enable)

    /**
     * Enable the stream to allow objects read from the stream to be replaced.
     * When enabled, the resolveObject method is called for every object being
     * deserialized.
     *
     * <p>If <i>enable</i> is true, and there is a security manager installed,
     * this method first calls the security manager's
     * <code>checkPermission</code> method with the
     * <code>SerializablePermission("enableSubstitution")</code> permission to
     * ensure it's ok to enable the stream to allow objects read from the
     * stream to be replaced.
     *
     * @param   enable true for enabling use of <code>resolveObject</code> for
     *          every object being deserialized
     * @return  the previous setting before this method was invoked
     * @throws  SecurityException if a security manager exists and its
     *          <code>checkPermission</code> method denies enabling the stream
     *          to allow objects read from the stream to be replaced.
     * @see SecurityManager#checkPermission
     * @see java.io.SerializablePermission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected Object resolveObject(Object obj) throws IOException {

    /**
     * This method will allow trusted subclasses of ObjectInputStream to
     * substitute one object for another during deserialization. Replacing
     * objects is disabled until enableResolveObject is called. The
     * enableResolveObject method checks that the stream requesting to resolve
     * object can be trusted. Every reference to serializable objects is passed
     * to resolveObject.  To insure that the private state of objects is not
     * unintentionally exposed only trusted streams may use resolveObject.
     *
     * <p>This method is called after an object has been read but before it is
     * returned from readObject.  The default resolveObject method just returns
     * the same object.
     *
     * <p>When a subclass is replacing objects it must insure that the
     * substituted object is compatible with every field where the reference
     * will be stored.  Objects whose type is not a subclass of the type of the
     * field or array element abort the serialization by raising an exception
     * and the object is not be stored.
     *
     * <p>This method is called only once when each object is first
     * encountered.  All subsequent references to the object will be redirected
     * to the new object.
     *
     * @param   obj object to be substituted
     * @return  the substituted object
     * @throws  IOException Any of the usual Input/Output exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected Class<?> resolveProxyClass(String[] interfaces)

    /**
     * Returns a proxy class that implements the interfaces named in a proxy
     * class descriptor; subclasses may implement this method to read custom
     * data from the stream along with the descriptors for dynamic proxy
     * classes, allowing them to use an alternate loading mechanism for the
     * interfaces and the proxy class.
     *
     * <p>This method is called exactly once for each unique proxy class
     * descriptor in the stream.
     *
     * <p>The corresponding method in <code>ObjectOutputStream</code> is
     * <code>annotateProxyClass</code>.  For a given subclass of
     * <code>ObjectInputStream</code> that overrides this method, the
     * <code>annotateProxyClass</code> method in the corresponding subclass of
     * <code>ObjectOutputStream</code> must write any data or objects read by
     * this method.
     *
     * <p>The default implementation of this method in
     * <code>ObjectInputStream</code> returns the result of calling
     * <code>Proxy.getProxyClass</code> with the list of <code>Class</code>
     * objects for the interfaces that are named in the <code>interfaces</code>
     * parameter.  The <code>Class</code> object for each interface name
     * <code>i</code> is the value returned by calling
     * <pre>
     *     Class.forName(i, false, loader)
     * </pre>
     * where <code>loader</code> is that of the first non-<code>null</code>
     * class loader up the execution stack, or <code>null</code> if no
     * non-<code>null</code> class loaders are on the stack (the same class
     * loader choice used by the <code>resolveClass</code> method).  Unless any
     * of the resolved interfaces are non-public, this same value of
     * <code>loader</code> is also the class loader passed to
     * <code>Proxy.getProxyClass</code>; if non-public interfaces are present,
     * their class loader is passed instead (if more than one non-public
     * interface class loader is encountered, an
     * <code>IllegalAccessError</code> is thrown).
     * If <code>Proxy.getProxyClass</code> throws an
     * <code>IllegalArgumentException</code>, <code>resolveProxyClass</code>
     * will throw a <code>ClassNotFoundException</code> containing the
     * <code>IllegalArgumentException</code>.
     *
     * @param interfaces the list of interface names that were
     *                deserialized in the proxy class descriptor
     * @return  a proxy class for the specified interfaces
     * @throws        IOException any exception thrown by the underlying
     *                <code>InputStream</code>
     * @throws        ClassNotFoundException if the proxy class or any of the
     *                named interfaces could not be found
     * @see ObjectOutputStream#annotateProxyClass(Class)
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected Class<?> resolveClass(ObjectStreamClass desc)

    /**
     * Load the local class equivalent of the specified stream class
     * description.  Subclasses may implement this method to allow classes to
     * be fetched from an alternate source.
     *
     * <p>The corresponding method in <code>ObjectOutputStream</code> is
     * <code>annotateClass</code>.  This method will be invoked only once for
     * each unique class in the stream.  This method can be implemented by
     * subclasses to use an alternate loading mechanism but must return a
     * <code>Class</code> object. Once returned, if the class is not an array
     * class, its serialVersionUID is compared to the serialVersionUID of the
     * serialized class, and if there is a mismatch, the deserialization fails
     * and an {@link InvalidClassException} is thrown.
     *
     * <p>The default implementation of this method in
     * <code>ObjectInputStream</code> returns the result of calling
     * <pre>
     *     Class.forName(desc.getName(), false, loader)
     * </pre>
     * where <code>loader</code> is determined as follows: if there is a
     * method on the current thread's stack whose declaring class was
     * defined by a user-defined class loader (and was not a generated to
     * implement reflective invocations), then <code>loader</code> is class
     * loader corresponding to the closest such method to the currently
     * executing frame; otherwise, <code>loader</code> is
     * <code>null</code>. If this call results in a
     * <code>ClassNotFoundException</code> and the name of the passed
     * <code>ObjectStreamClass</code> instance is the Java language keyword
     * for a primitive type or void, then the <code>Class</code> object
     * representing that primitive type or void will be returned
     * (e.g., an <code>ObjectStreamClass</code> with the name
     * <code>"int"</code> will be resolved to <code>Integer.TYPE</code>).
     * Otherwise, the <code>ClassNotFoundException</code> will be thrown to
     * the caller of this method.
     *
     * @param   desc an instance of class <code>ObjectStreamClass</code>
     * @return  a <code>Class</code> object corresponding to <code>desc</code>
     * @throws  IOException any of the usual Input/Output exceptions.
     * @throws  ClassNotFoundException if class of a serialized object cannot
     *          be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public void registerValidation(ObjectInputValidation obj, int prio)

    /**
     * Register an object to be validated before the graph is returned.  While
     * similar to resolveObject these validations are called after the entire
     * graph has been reconstituted.  Typically, a readObject method will
     * register the object with the stream so that when all of the objects are
     * restored a final set of validations can be performed.
     *
     * @param   obj the object to receive the validation callback.
     * @param   prio controls the order of callbacks;zero is a good default.
     *          Use higher numbers to be called back earlier, lower numbers for
     *          later callbacks. Within a priority, callbacks are processed in
     *          no particular order.
     * @throws  NotActiveException The stream is not currently reading objects
     *          so it is invalid to register a callback.
     * @throws  InvalidObjectException The validation object is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public ObjectInputStream.GetField readFields()

    /**
     * Reads the persistent fields from the stream and makes them available by
     * name.
     *
     * @return  the <code>GetField</code> object representing the persistent
     *          fields of the object being deserialized
     * @throws  ClassNotFoundException if the class of a serialized object
     *          could not be found.
     * @throws  IOException if an I/O error occurs.
     * @throws  NotActiveException if the stream is not currently reading
     *          objects.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public void defaultReadObject()

    /**
     * Read the non-static and non-transient fields of the current class from
     * this stream.  This may only be called from the readObject method of the
     * class being deserialized. It will throw the NotActiveException if it is
     * called otherwise.
     *
     * @throws  ClassNotFoundException if the class of a serialized object
     *          could not be found.
     * @throws  IOException if an I/O error occurs.
     * @throws  NotActiveException if the stream is not currently reading
     *          objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public Object readUnshared() throws IOException, ClassNotFoundException {

    /**
     * Reads an "unshared" object from the ObjectInputStream.  This method is
     * identical to readObject, except that it prevents subsequent calls to
     * readObject and readUnshared from returning additional references to the
     * deserialized instance obtained via this call.  Specifically:
     * <ul>
     *   <li>If readUnshared is called to deserialize a back-reference (the
     *       stream representation of an object which has been written
     *       previously to the stream), an ObjectStreamException will be
     *       thrown.
     *
     *   <li>If readUnshared returns successfully, then any subsequent attempts
     *       to deserialize back-references to the stream handle deserialized
     *       by readUnshared will cause an ObjectStreamException to be thrown.
     * </ul>
     * Deserializing an object via readUnshared invalidates the stream handle
     * associated with the returned object.  Note that this in itself does not
     * always guarantee that the reference returned by readUnshared is unique;
     * the deserialized object may define a readResolve method which returns an
     * object visible to other parties, or readUnshared may return a Class
     * object or enum constant obtainable elsewhere in the stream or through
     * external means. If the deserialized object defines a readResolve method
     * and the invocation of that method returns an array, then readUnshared
     * returns a shallow clone of that array; this guarantees that the returned
     * array object is unique and cannot be obtained a second time from an
     * invocation of readObject or readUnshared on the ObjectInputStream,
     * even if the underlying data stream has been manipulated.
     *
     * <p>ObjectInputStream subclasses which override this method can only be
     * constructed in security contexts possessing the
     * "enableSubclassImplementation" SerializablePermission; any attempt to
     * instantiate such a subclass without this permission will cause a
     * SecurityException to be thrown.
     *
     * @return  reference to deserialized object
     * @throws  ClassNotFoundException if class of an object to deserialize
     *          cannot be found
     * @throws  StreamCorruptedException if control information in the stream
     *          is inconsistent
     * @throws  ObjectStreamException if object to deserialize has already
     *          appeared in stream
     * @throws  OptionalDataException if primitive data is next in stream
     * @throws  IOException if an I/O error occurs during deserialization
     * @since   1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected Object readObjectOverride()

    /**
     * This method is called by trusted subclasses of ObjectOutputStream that
     * constructed ObjectOutputStream using the protected no-arg constructor.
     * The subclass is expected to provide an override method with the modifier
     * "final".
     *
     * @return  the Object read from the stream.
     * @throws  ClassNotFoundException Class definition of a serialized object
     *          cannot be found.
     * @throws  OptionalDataException Primitive data was found in the stream
     *          instead of objects.
     * @throws  IOException if I/O errors occurred while reading from the
     *          underlying stream
     * @see #ObjectInputStream()
     * @see #readObject()
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public final Object readObject()

    /**
     * Read an object from the ObjectInputStream.  The class of the object, the
     * signature of the class, and the values of the non-transient and
     * non-static fields of the class and all of its supertypes are read.
     * Default deserializing for a class can be overriden using the writeObject
     * and readObject methods.  Objects referenced by this object are read
     * transitively so that a complete equivalent graph of objects is
     * reconstructed by readObject.
     *
     * <p>The root object is completely restored when all of its fields and the
     * objects it references are completely restored.  At this point the object
     * validation callbacks are executed in order based on their registered
     * priorities. The callbacks are registered by objects (in the readObject
     * special methods) as they are individually restored.
     *
     * <p>Exceptions are thrown for problems with the InputStream and for
     * classes that should not be deserialized.  All exceptions are fatal to
     * the InputStream and leave it in an indeterminate state; it is up to the
     * caller to ignore or recover the stream state.
     *
     * @throws  ClassNotFoundException Class of a serialized object cannot be
     *          found.
     * @throws  InvalidClassException Something is wrong with a class used by
     *          serialization.
     * @throws  StreamCorruptedException Control information in the
     *          stream is inconsistent.
     * @throws  OptionalDataException Primitive data was found in the
     *          stream instead of objects.
     * @throws  IOException Any of the usual Input/Output related exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected ObjectInputStream() throws IOException, SecurityException {

    /**
     * Provide a way for subclasses that are completely reimplementing
     * ObjectInputStream to not have to allocate private data just used by this
     * implementation of ObjectInputStream.
     *
     * <p>If there is a security manager installed, this method first calls the
     * security manager's <code>checkPermission</code> method with the
     * <code>SerializablePermission("enableSubclassImplementation")</code>
     * permission to ensure it's ok to enable subclassing.
     *
     * @throws  SecurityException if a security manager exists and its
     *          <code>checkPermission</code> method denies enabling
     *          subclassing.
     * @throws  IOException if an I/O error occurs while creating this stream
     * @see SecurityManager#checkPermission
     * @see java.io.SerializablePermission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public ObjectInputStream(InputStream in) throws IOException {

    /**
     * Creates an ObjectInputStream that reads from the specified InputStream.
     * A serialization stream header is read from the stream and verified.
     * This constructor will block until the corresponding ObjectOutputStream
     * has written and flushed the header.
     *
     * <p>If a security manager is installed, this constructor will check for
     * the "enableSubclassImplementation" SerializablePermission when invoked
     * directly or indirectly by the constructor of a subclass which overrides
     * the ObjectInputStream.readFields or ObjectInputStream.readUnshared
     * methods.
     *
     * @param   in input stream to read from
     * @throws  StreamCorruptedException if the stream header is incorrect
     * @throws  IOException if an I/O error occurs while reading stream header
     * @throws  SecurityException if untrusted subclass illegally overrides
     *          security-sensitive methods
     * @throws  NullPointerException if <code>in</code> is <code>null</code>
     * @see     ObjectInputStream#ObjectInputStream()
     * @see     ObjectInputStream#readFields()
     * @see     ObjectOutputStream#ObjectOutputStream(OutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private SerialCallbackContext curContext;

    /**
     * Context during upcalls to class-defined readObject methods; holds
     * object currently being deserialized and descriptor for current class.
     * Null when not during readObject upcall.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private final boolean enableOverride;

    /** if true, invoke readObjectOverride() instead of readObject() */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private byte[] primVals;

    /** buffer for reading primitive field values */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private boolean defaultDataEnd = false;

    /** flag set when at end of field value block with no TC_ENDBLOCKDATA */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private final HandleTable handles;

    /** wire handle -> obj/exception map */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private int depth;

    /** recursion depth */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private final BlockDataInputStream bin;

    /** filter stream for handling block data conversion */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        static final ReferenceQueue<Class<?>> subclassAuditsQueue =

        /** queue for WeakReferences to audited subclasses */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        static final ConcurrentMap<WeakClassKey,Boolean> subclassAudits =

        /** cache of subclass security audit results */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static final HashMap<String, Class<?>> primClasses

    /** table mapping primitive type names to corresponding class objects */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static final Object unsharedMarker = new Object();

    /** marker for unshared objects in internal handle table */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static final int NULL_HANDLE = -1;

    /** handle value representing null */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
public class ObjectInputStream

/**
 * An ObjectInputStream deserializes primitive data and objects previously
 * written using an ObjectOutputStream.
 *
 * <p>ObjectOutputStream and ObjectInputStream can provide an application with
 * persistent storage for graphs of objects when used with a FileOutputStream
 * and FileInputStream respectively.  ObjectInputStream is used to recover
 * those objects previously serialized. Other uses include passing objects
 * between hosts using a socket stream or for marshaling and unmarshaling
 * arguments and parameters in a remote communication system.
 *
 * <p>ObjectInputStream ensures that the types of all objects in the graph
 * created from the stream match the classes present in the Java Virtual
 * Machine.  Classes are loaded as required using the standard mechanisms.
 *
 * <p>Only objects that support the java.io.Serializable or
 * java.io.Externalizable interface can be read from streams.
 *
 * <p>The method <code>readObject</code> is used to read an object from the
 * stream.  Java's safe casting should be used to get the desired type.  In
 * Java, strings and arrays are objects and are treated as objects during
 * serialization. When read they need to be cast to the expected type.
 *
 * <p>Primitive data types can be read from the stream using the appropriate
 * method on DataInput.
 *
 * <p>The default deserialization mechanism for objects restores the contents
 * of each field to the value and type it had when it was written.  Fields
 * declared as transient or static are ignored by the deserialization process.
 * References to other objects cause those objects to be read from the stream
 * as necessary.  Graphs of objects are restored correctly using a reference
 * sharing mechanism.  New objects are always allocated when deserializing,
 * which prevents existing objects from being overwritten.
 *
 * <p>Reading an object is analogous to running the constructors of a new
 * object.  Memory is allocated for the object and initialized to zero (NULL).
 * No-arg constructors are invoked for the non-serializable classes and then
 * the fields of the serializable classes are restored from the stream starting
 * with the serializable class closest to java.lang.object and finishing with
 * the object's most specific class.
 *
 * <p>For example to read from a stream as written by the example in
 * ObjectOutputStream:
 * <br>
 * <pre>
 *      FileInputStream fis = new FileInputStream("t.tmp");
 *      ObjectInputStream ois = new ObjectInputStream(fis);
 *
 *      int i = ois.readInt();
 *      String today = (String) ois.readObject();
 *      Date date = (Date) ois.readObject();
 *
 *      ois.close();
 * </pre>
 *
 * <p>Classes control how they are serialized by implementing either the
 * java.io.Serializable or java.io.Externalizable interfaces.
 *
 * <p>Implementing the Serializable interface allows object serialization to
 * save and restore the entire state of the object and it allows classes to
 * evolve between the time the stream is written and the time it is read.  It
 * automatically traverses references between objects, saving and restoring
 * entire graphs.
 *
 * <p>Serializable classes that require special handling during the
 * serialization and deserialization process should implement the following
 * methods:
 *
 * <pre>
 * private void writeObject(java.io.ObjectOutputStream stream)
 *     throws IOException;
 * private void readObject(java.io.ObjectInputStream stream)
 *     throws IOException, ClassNotFoundException;
 * private void readObjectNoData()
 *     throws ObjectStreamException;
 * </pre>
 *
 * <p>The readObject method is responsible for reading and restoring the state
 * of the object for its particular class using data written to the stream by
 * the corresponding writeObject method.  The method does not need to concern
 * itself with the state belonging to its superclasses or subclasses.  State is
 * restored by reading data from the ObjectInputStream for the individual
 * fields and making assignments to the appropriate fields of the object.
 * Reading primitive data types is supported by DataInput.
 *
 * <p>Any attempt to read object data which exceeds the boundaries of the
 * custom data written by the corresponding writeObject method will cause an
 * OptionalDataException to be thrown with an eof field value of true.
 * Non-object reads which exceed the end of the allotted data will reflect the
 * end of data in the same way that they would indicate the end of the stream:
 * bytewise reads will return -1 as the byte read or number of bytes read, and
 * primitive reads will throw EOFExceptions.  If there is no corresponding
 * writeObject method, then the end of default serialized data marks the end of
 * the allotted data.
 *
 * <p>Primitive and object read calls issued from within a readExternal method
 * behave in the same manner--if the stream is already positioned at the end of
 * data written by the corresponding writeExternal method, object reads will
 * throw OptionalDataExceptions with eof set to true, bytewise reads will
 * return -1, and primitive reads will throw EOFExceptions.  Note that this
 * behavior does not hold for streams written with the old
 * <code>ObjectStreamConstants.PROTOCOL_VERSION_1</code> protocol, in which the
 * end of data written by writeExternal methods is not demarcated, and hence
 * cannot be detected.
 *
 * <p>The readObjectNoData method is responsible for initializing the state of
 * the object for its particular class in the event that the serialization
 * stream does not list the given class as a superclass of the object being
 * deserialized.  This may occur in cases where the receiving party uses a
 * different version of the deserialized instance's class than the sending
 * party, and the receiver's version extends classes that are not extended by
 * the sender's version.  This may also occur if the serialization stream has
 * been tampered; hence, readObjectNoData is useful for initializing
 * deserialized objects properly despite a "hostile" or incomplete source
 * stream.
 *
 * <p>Serialization does not read or assign values to the fields of any object
 * that does not implement the java.io.Serializable interface.  Subclasses of
 * Objects that are not serializable can be serializable. In this case the
 * non-serializable class must have a no-arg constructor to allow its fields to
 * be initialized.  In this case it is the responsibility of the subclass to
 * save and restore the state of the non-serializable class. It is frequently
 * the case that the fields of that class are accessible (public, package, or
 * protected) or that there are get and set methods that can be used to restore
 * the state.
 *
 * <p>Any exception that occurs while deserializing an object will be caught by
 * the ObjectInputStream and abort the reading process.
 *
 * <p>Implementing the Externalizable interface allows the object to assume
 * complete control over the contents and format of the object's serialized
 * form.  The methods of the Externalizable interface, writeExternal and
 * readExternal, are called to save and restore the objects state.  When
 * implemented by a class they can write and read their own state using all of
 * the methods of ObjectOutput and ObjectInput.  It is the responsibility of
 * the objects to handle any versioning that occurs.
 *
 * <p>Enum constants are deserialized differently than ordinary serializable or
 * externalizable objects.  The serialized form of an enum constant consists
 * solely of its name; field values of the constant are not transmitted.  To
 * deserialize an enum constant, ObjectInputStream reads the constant name from
 * the stream; the deserialized constant is then obtained by calling the static
 * method <code>Enum.valueOf(Class, String)</code> with the enum constant's
 * base type and the received constant name as arguments.  Like other
 * serializable or externalizable objects, enum constants can function as the
 * targets of back references appearing subsequently in the serialization
 * stream.  The process by which enum constants are deserialized cannot be
 * customized: any class-specific readObject, readObjectNoData, and readResolve
 * methods defined by enum types are ignored during deserialization.
 * Similarly, any serialPersistentFields or serialVersionUID field declarations
 * are also ignored--all enum types have a fixed serialVersionUID of 0L.
 *
 * @author      Mike Warres
 * @author      Roger Riggs
 * @see java.io.DataInput
 * @see java.io.ObjectOutputStream
 * @see java.io.Serializable
 * @see <a href="../../../platform/serialization/spec/input.html"> Object Serialization Specification, Section 3, Object Input Classes</a>
 * @since   JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static Object cloneArray(Object array) {

    /**
     * Method for cloning arrays in case of using unsharing reading
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private static class HandleList {

        /**
         * Simple growable list of (integer) handles.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private void grow() {

        /**
         * Expands capacity of internal arrays.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        int size() {

        /**
         * Returns number of handles registered in table.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void clear() {

        /**
         * Resets table to its initial state.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        ClassNotFoundException lookupException(int handle) {

        /**
         * Looks up and returns ClassNotFoundException associated with the
         * given handle.  Returns null if the given handle is NULL_HANDLE, or
         * if there is no ClassNotFoundException associated with the handle.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        Object lookupObject(int handle) {

        /**
         * Looks up and returns object associated with the given handle.
         * Returns null if the given handle is NULL_HANDLE, or if it has an
         * associated ClassNotFoundException.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void setObject(int handle, Object obj) {

        /**
         * Assigns a new object to the given handle.  The object previously
         * associated with the handle is forgotten.  This method has no effect
         * if the given handle already has an exception associated with it.
         * This method may be called at any time after the handle is assigned.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void finish(int handle) {

        /**
         * Marks given handle as finished, meaning that no new dependencies
         * will be marked for handle.  Calls to the assign and finish methods
         * must occur in LIFO order.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void markException(int handle, ClassNotFoundException ex) {

        /**
         * Associates a ClassNotFoundException (if one not already associated)
         * with the currently active handle and propagates it to other
         * referencing objects as appropriate.  The specified handle must be
         * "open" (i.e., assigned, but not finished yet).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void markDependency(int dependent, int target) {

        /**
         * Registers a dependency (in exception status) of one handle on
         * another.  The dependent handle must be "open" (i.e., assigned, but
         * not finished yet).  No action is taken if either dependent or target
         * handle is NULL_HANDLE.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        int assign(Object obj) {

        /**
         * Assigns next available handle to given object, and returns assigned
         * handle.  Once object has been completely deserialized (and all
         * dependencies on other objects identified), the handle should be
         * "closed" by passing it to finish().
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        HandleTable(int initialCapacity) {

        /**
         * Creates handle table with the given initial capacity.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        int size = 0;

        /** number of handles in table */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        HandleList[] deps;

        /** array mapping handle -> list of dependent handles (if any) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        byte[] status;

        /** array mapping handle -> object status */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    // REMIND: add full description of exception propagation algorithm?

    /**
     * Unsynchronized table which tracks wire handle to object mappings, as
     * well as ClassNotFoundExceptions associated with deserialized objects.
     * This class implements an exception-propagation algorithm for
     * determining which objects should have ClassNotFoundExceptions associated
     * with them, taking into account cycles and discontinuities (e.g., skipped
     * fields) in the object graph.
     *
     * <p>General use of the table is as follows: during deserialization, a
     * given object is first assigned a handle by calling the assign method.
     * This method leaves the assigned handle in an "open" state, wherein
     * dependencies on the exception status of other handles can be registered
     * by calling the markDependency method, or an exception can be directly
     * associated with the handle by calling markException.  When a handle is
     * tagged with an exception, the HandleTable assumes responsibility for
     * propagating the exception to any other objects which depend
     * (transitively) on the exception-tagged object.
     *
     * <p>Once all exception information/dependencies for the handle have been
     * registered, the handle should be "closed" by calling the finish method
     * on it.  The act of finishing a handle allows the exception propagation
     * algorithm to aggressively prune dependency links, lessening the
     * performance/memory impact of exception tracking.
     *
     * <p>Note that the exception propagation algorithm used depends on handles
     * being assigned/finished in LIFO order; however, for simplicity as well
     * as memory conservation, it does not enforce this constraint.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private int readUTFChar(StringBuilder sbuf, long utflen)

        /**
         * Reads in single UTF-encoded character one byte at a time, appends
         * the character to sbuf, and returns the number of bytes consumed.
         * This method is used when reading in UTF strings written in block
         * data mode to handle UTF-encoded characters which (potentially)
         * straddle block-data boundaries.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private long readUTFSpan(StringBuilder sbuf, long utflen)

        /**
         * Reads span of UTF-encoded characters out of internal buffer
         * (starting at offset pos and ending at or before offset end),
         * consuming no more than utflen bytes.  Appends read characters to
         * sbuf.  Returns the number of bytes consumed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private String readUTFBody(long utflen) throws IOException {

        /**
         * Reads in the "body" (i.e., the UTF representation minus the 2-byte
         * or 8-byte length header) of a UTF encoding, which occupies the next
         * utflen bytes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        String readLongUTF() throws IOException {

        /**
         * Reads in string written in "long" UTF format.  "Long" UTF format is
         * identical to standard UTF, except that it uses an 8 byte header
         * (instead of the standard 2 bytes) to convey the UTF encoding length.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        int read(byte[] b, int off, int len, boolean copy) throws IOException {

        /**
         * Attempts to read len bytes into byte array b at offset off.  Returns
         * the number of bytes read, or -1 if the end of stream/block data has
         * been reached.  If copy is true, reads values into an intermediate
         * buffer before copying them to b (to avoid exposing a reference to
         * b).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        byte peekByte() throws IOException {

        /**
         * Peeks at (but does not consume) and returns the next byte value in
         * the stream, or throws EOFException if end of stream/block data has
         * been reached.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        int peek() throws IOException {

        /**
         * Peeks at (but does not consume) and returns the next byte value in
         * the stream, or -1 if the end of the stream/block data (if in block
         * data mode) has been reached.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        int currentBlockRemaining() {

        /**
         * If in block data mode, returns the number of unconsumed bytes
         * remaining in the current data block.  If not in block data mode,
         * throws an IllegalStateException.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private void refill() throws IOException {

        /**
         * Refills internal buffer buf with block data.  Any data in buf at the
         * time of the call is considered consumed.  Sets the pos, end, and
         * unread fields to reflect the new amount of available block data; if
         * the next element in the stream is not a data block, sets pos and
         * unread to 0 and end to -1.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private int readBlockHeader(boolean canBlock) throws IOException {

        /**
         * Attempts to read in the next block data header (if any).  If
         * canBlock is false and a full header cannot be read without possibly
         * blocking, returns HEADER_BLOCKED, else if the next element in the
         * stream is a block data header, returns the block data length
         * specified by the header, else returns -1.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void skipBlockData() throws IOException {

        /**
         * If in block data mode, skips to the end of the current group of data
         * blocks (but does not unset block data mode).  If not in block data
         * mode, throws an IllegalStateException.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        boolean getBlockDataMode() {

        /**
         * Returns true if the stream is currently in block data mode, false
         * otherwise.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        boolean setBlockDataMode(boolean newmode) throws IOException {

        /**
         * Sets block data mode to the given mode (true == on, false == off)
         * and returns the previous mode value.  If the new mode is the same as
         * the old mode, no action is taken.  Throws IllegalStateException if
         * block data mode is being switched from on to off while unconsumed
         * block data is still present in the stream.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        BlockDataInputStream(InputStream in) {

        /**
         * Creates new BlockDataInputStream on top of given underlying stream.
         * Block data mode is turned off by default.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private final PeekInputStream in;

        /** underlying stream (wrapped in peekable filter stream) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private int unread = 0;

        /** number of bytes in current block yet to be read from stream */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private int pos = 0;

        /** current offset into buf */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private boolean blkmode = false;

        /** block data mode */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private final char[] cbuf = new char[CHAR_BUF_SIZE];

        /** char buffer for fast string reads */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private final byte[] buf = new byte[MAX_BLOCK_SIZE];

        /** buffer for reading general/block data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private static final int CHAR_BUF_SIZE = 256;

        /** (tunable) length of char buffer (for reading strings) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private static final int MAX_BLOCK_SIZE = 1024;

        /** maximum data block length */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private class BlockDataInputStream

    /**
     * Input stream with two modes: in default mode, inputs data written in the
     * same format as DataOutputStream; in "block data" mode, inputs data
     * bracketed by block data markers (see object serialization specification
     * for details).  Buffering depends on block data mode: when in default
     * mode, no data is buffered in advance; when in block data mode, all data
     * for the current data block is read in at once (and buffered).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        int peek() throws IOException {

        /**
         * Peeks at next byte value in stream.  Similar to read(), except
         * that it does not consume the read value.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        PeekInputStream(InputStream in) {

        /**
         * Creates new PeekInputStream on top of given underlying stream.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private final InputStream in;

        /** underlying stream */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static class PeekInputStream extends InputStream {

    /**
     * Input stream supporting single-byte peek operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public void clear() {

        /**
         * Resets the callback list to its initial (empty) state.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void doCallbacks() throws InvalidObjectException {

        /**
         * Invokes all registered callbacks and clears the callback list.
         * Callbacks with higher priorities are called first; those with equal
         * priorities may be called in any order.  If any of the callbacks
         * throws an InvalidObjectException, the callback process is terminated
         * and the exception propagated upwards.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void register(ObjectInputValidation obj, int priority)

        /**
         * Registers callback.  Throws InvalidObjectException if callback
         * object is null.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        ValidationList() {

        /**
         * Creates new (empty) ValidationList.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private Callback list;

        /** linked list of callbacks */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static class ValidationList {

    /**
     * Prioritized list of callbacks to be performed once object graph has been
     * completely deserialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private int getFieldOffset(String name, Class<?> type) {

        /**
         * Returns offset of field with given name and type.  A specified type
         * of null matches all types, Object.class matches all non-primitive
         * types, and any other non-null type matches assignable types only.
         * If no matching field is found in the (incoming) class
         * descriptor but a matching field is present in the associated local
         * class descriptor, returns -1.  Throws IllegalArgumentException if
         * neither incoming nor local class descriptor contains a match.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        void readFields() throws IOException {

        /**
         * Reads primitive and object field values from stream.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        GetFieldImpl(ObjectStreamClass desc) {

        /**
         * Creates GetFieldImpl object for reading fields defined in given
         * class descriptor.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private final Object[] objVals;

        /** object field values */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        private final ObjectStreamClass desc;

        /** class descriptor describing serializable fields */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private class GetFieldImpl extends GetField {

    /**
     * Default GetField implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static ClassLoader latestUserDefinedLoader() {

    /**
     * Returns the first non-null class loader (not counting class loaders of
     * generated reflection implementation classes) up the execution stack, or
     * null if only code from the null class loader is on the stack.  This
     * method is also called via reflection by the following RMI-IIOP class:
     *
     *     com.sun.corba.se.internal.util.JDKClassLoader
     *
     * This method should not be removed or its signature changed without
     * corresponding modifications to the above class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    // REMIND: remove once hotspot inlines Double.longBitsToDouble

    /**
     * Converts specified span of bytes into double values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    // REMIND: remove once hotspot inlines Float.intBitsToFloat

    /**
     * Converts specified span of bytes into float values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private void handleReset() throws StreamCorruptedException {

    /**
     * If recursion depth is 0, clears internal data structures; otherwise,
     * throws a StreamCorruptedException.  This method is called when a
     * TC_RESET typecode is encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private IOException readFatalException() throws IOException {

    /**
     * Reads in and returns IOException that caused serialization to abort.
     * All stream state is discarded prior to reading in fatal exception.  Sets
     * passHandle to fatal exception's handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private void defaultReadFields(Object obj, ObjectStreamClass desc)

    /**
     * Reads in values of serializable fields declared by given class
     * descriptor.  If obj is non-null, sets field values in obj.  Expects that
     * passHandle is set to obj's handle before this method is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private void skipCustomData() throws IOException {

    /**
     * Skips over all block data and objects until TC_ENDBLOCKDATA is
     * encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private void readSerialData(Object obj, ObjectStreamClass desc)

    /**
     * Reads (or attempts to skip, if obj is null or is tagged with a
     * ClassNotFoundException) instance data for each serializable class of
     * object in stream, from superclass to subclass.  Expects that passHandle
     * is set to obj's handle before this method is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private void readExternalData(Externalizable obj, ObjectStreamClass desc)

    /**
     * If obj is non-null, reads externalizable data by invoking readExternal()
     * method of obj; otherwise, attempts to skip over externalizable data.
     * Expects that passHandle is set to obj's handle before this method is
     * called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Object readOrdinaryObject(boolean unshared)

    /**
     * Reads and returns "ordinary" (i.e., not a String, Class,
     * ObjectStreamClass, array, or enum constant) object, or null if object's
     * class is unresolvable (in which case a ClassNotFoundException will be
     * associated with object's handle).  Sets passHandle to object's assigned
     * handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Enum<?> readEnum(boolean unshared) throws IOException {

    /**
     * Reads in and returns enum constant, or null if enum type is
     * unresolvable.  Sets passHandle to enum constant's assigned handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Object readArray(boolean unshared) throws IOException {

    /**
     * Reads in and returns array object, or null if array class is
     * unresolvable.  Sets passHandle to array's assigned handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private String readString(boolean unshared) throws IOException {

    /**
     * Reads in and returns new string.  Sets passHandle to new string's
     * assigned handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private ObjectStreamClass readNonProxyDesc(boolean unshared)

    /**
     * Reads in and returns class descriptor for a class that is not a dynamic
     * proxy class.  Sets passHandle to class descriptor's assigned handle.  If
     * class descriptor cannot be resolved to a class in the local VM, a
     * ClassNotFoundException is associated with the descriptor's handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private ObjectStreamClass readProxyDesc(boolean unshared)

    /**
     * Reads in and returns class descriptor for a dynamic proxy class.  Sets
     * passHandle to proxy class descriptor's assigned handle.  If proxy class
     * descriptor cannot be resolved to a class in the local VM, a
     * ClassNotFoundException is associated with the descriptor's handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private ObjectStreamClass readClassDesc(boolean unshared)

    /**
     * Reads in and returns (possibly null) class descriptor.  Sets passHandle
     * to class descriptor's assigned handle.  If class descriptor cannot be
     * resolved to a class in the local VM, a ClassNotFoundException is
     * associated with the class descriptor's handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Class<?> readClass(boolean unshared) throws IOException {

    /**
     * Reads in and returns class object.  Sets passHandle to class object's
     * assigned handle.  Returns null if class is unresolvable (in which case a
     * ClassNotFoundException will be associated with the class' handle in the
     * handle table).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Object readHandle(boolean unshared) throws IOException {

    /**
     * Reads in object handle, sets passHandle to the read handle, and returns
     * object associated with the handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Object readNull() throws IOException {

    /**
     * Reads in null code, sets passHandle to NULL_HANDLE and returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    String readTypeString() throws IOException {

    /**
     * Reads string without allowing it to be replaced in stream.  Called from
     * within ObjectStreamClass.read().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Object checkResolve(Object obj) throws IOException {

    /**
     * If resolveObject has been enabled and given object does not have an
     * exception associated with it, calls resolveObject to determine
     * replacement for object, and updates handle table accordingly.  Returns
     * replacement object, or echoes provided object if no replacement
     * occurred.  Expects that passHandle is set to given object's handle prior
     * to calling this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private Object readObject0(boolean unshared) throws IOException {

    /**
     * Underlying readObject implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private void clear() {

    /**
     * Clears internal data structures.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static boolean auditSubclass(final Class<?> subcl) {

    /**
     * Performs reflective checks on given subclass to verify that it doesn't
     * override security-sensitive non-final methods.  Returns true if subclass
     * is "safe", false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private void verifySubclass() {

    /**
     * Verifies that this (possibly subclass) instance can be constructed
     * without violating security constraints: the subclass must not override
     * security-sensitive non-final methods, or else the
     * "enableSubclassImplementation" SerializablePermission is checked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract Object get(String name, Object val) throws IOException;

        /**
         * Get the value of the named Object field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>Object</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract double get(String name, double val) throws IOException;

        /**
         * Get the value of the named double field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>double</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract float get(String name, float val) throws IOException;

        /**
         * Get the value of the named float field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>float</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract long get(String name, long val) throws IOException;

        /**
         * Get the value of the named long field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>long</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract int get(String name, int val) throws IOException;

        /**
         * Get the value of the named int field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>int</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract short get(String name, short val) throws IOException;

        /**
         * Get the value of the named short field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>short</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract char get(String name, char val) throws IOException;

        /**
         * Get the value of the named char field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>char</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract byte get(String name, byte val) throws IOException;

        /**
         * Get the value of the named byte field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>byte</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract boolean get(String name, boolean val)

        /**
         * Get the value of the named boolean field from the persistent field.
         *
         * @param  name the name of the field
         * @param  val the default value to use if <code>name</code> does not
         *         have a value
         * @return the value of the named <code>boolean</code> field
         * @throws IOException if there are I/O errors while reading from the
         *         underlying <code>InputStream</code>
         * @throws IllegalArgumentException if type of <code>name</code> is
         *         not serializable or if the field type is incorrect
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract boolean defaulted(String name) throws IOException;

        /**
         * Return true if the named field is defaulted and has no value in this
         * stream.
         *
         * @param  name the name of the field
         * @return true, if and only if the named field is defaulted
         * @throws IOException if there are I/O errors while reading from
         *         the underlying <code>InputStream</code>
         * @throws IllegalArgumentException if <code>name</code> does not
         *         correspond to a serializable field
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        public abstract ObjectStreamClass getObjectStreamClass();

        /**
         * Get the ObjectStreamClass that describes the fields in the stream.
         *
         * @return  the descriptor class that describes the serializable fields
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public static abstract class GetField {

    /**
     * Provide access to the persistent fields read from the input stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public String readUTF() throws IOException {

    /**
     * Reads a String in
     * <a href="DataInput.html#modified-utf-8">modified UTF-8</a>
     * format.
     *
     * @return  the String.
     * @throws  IOException if there are I/O errors while reading from the
     *          underlying <code>InputStream</code>
     * @throws  UTFDataFormatException if read bytes do not represent a valid
     *          modified UTF-8 encoding of a string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    @Deprecated

    /**
     * Reads in a line that has been terminated by a \n, \r, \r\n or EOF.
     *
     * @return  a String copy of the line.
     * @throws  IOException if there are I/O errors while reading from the
     *          underlying <code>InputStream</code>
     * @deprecated This method does not properly convert bytes to characters.
     *          see DataInputStream for the details and alternatives.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public int skipBytes(int len) throws IOException {

    /**
     * Skips bytes.
     *
     * @param   len the number of bytes to be skipped
     * @return  the actual number of bytes skipped.
     * @throws  IOException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public void readFully(byte[] buf, int off, int len) throws IOException {

    /**
     * Reads bytes, blocking until all bytes are read.
     *
     * @param   buf the buffer into which the data is read
     * @param   off the start offset of the data
     * @param   len the maximum number of bytes to read
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public void readFully(byte[] buf) throws IOException {

    /**
     * Reads bytes, blocking until all bytes are read.
     *
     * @param   buf the buffer into which the data is read
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public double readDouble() throws IOException {

    /**
     * Reads a 64 bit double.
     *
     * @return  the 64 bit double read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public float readFloat() throws IOException {

    /**
     * Reads a 32 bit float.
     *
     * @return  the 32 bit float read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public long readLong()  throws IOException {

    /**
     * Reads a 64 bit long.
     *
     * @return  the read 64 bit long.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public int readInt()  throws IOException {

    /**
     * Reads a 32 bit int.
     *
     * @return  the 32 bit integer read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public int readUnsignedShort() throws IOException {

    /**
     * Reads an unsigned 16 bit short.
     *
     * @return  the 16 bit short read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public short readShort()  throws IOException {

    /**
     * Reads a 16 bit short.
     *
     * @return  the 16 bit short read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public char readChar()  throws IOException {

    /**
     * Reads a 16 bit char.
     *
     * @return  the 16 bit char read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public int readUnsignedByte()  throws IOException {

    /**
     * Reads an unsigned 8 bit byte.
     *
     * @return  the 8 bit byte read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public byte readByte() throws IOException  {

    /**
     * Reads an 8 bit byte.
     *
     * @return  the 8 bit byte read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public boolean readBoolean() throws IOException {

    /**
     * Reads in a boolean.
     *
     * @return  the boolean read.
     * @throws  EOFException If end of file is reached.
     * @throws  IOException If other I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public void close() throws IOException {

    /**
     * Closes the input stream. Must be called to release any resources
     * associated with the stream.
     *
     * @throws  IOException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public int available() throws IOException {

    /**
     * Returns the number of bytes that can be read without blocking.
     *
     * @return  the number of available bytes.
     * @throws  IOException if there are I/O errors while reading from the
     *          underlying <code>InputStream</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public int read(byte[] buf, int off, int len) throws IOException {

    /**
     * Reads into an array of bytes.  This method will block until some input
     * is available. Consider using java.io.DataInputStream.readFully to read
     * exactly 'length' bytes.
     *
     * @param   buf the buffer into which the data is read
     * @param   off the start offset of the data
     * @param   len the maximum number of bytes read
     * @return  the actual number of bytes read, -1 is returned when the end of
     *          the stream is reached.
     * @throws  IOException If an I/O error has occurred.
     * @see java.io.DataInputStream#readFully(byte[],int,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public int read() throws IOException {

    /**
     * Reads a byte of data. This method will block if no input is available.
     *
     * @return  the byte read, or -1 if the end of the stream is reached.
     * @throws  IOException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected ObjectStreamClass readClassDescriptor()

    /**
     * Read a class descriptor from the serialization stream.  This method is
     * called when the ObjectInputStream expects a class descriptor as the next
     * item in the serialization stream.  Subclasses of ObjectInputStream may
     * override this method to read in class descriptors that have been written
     * in non-standard formats (by subclasses of ObjectOutputStream which have
     * overridden the <code>writeClassDescriptor</code> method).  By default,
     * this method reads class descriptors according to the format defined in
     * the Object Serialization specification.
     *
     * @return  the class descriptor read
     * @throws  IOException If an I/O error has occurred.
     * @throws  ClassNotFoundException If the Class of a serialized object used
     *          in the class descriptor representation cannot be found
     * @see java.io.ObjectOutputStream#writeClassDescriptor(java.io.ObjectStreamClass)
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected void readStreamHeader()

    /**
     * The readStreamHeader method is provided to allow subclasses to read and
     * verify their own stream headers. It reads and verifies the magic number
     * and version number.
     *
     * @throws  IOException if there are I/O errors while reading from the
     *          underlying <code>InputStream</code>
     * @throws  StreamCorruptedException if control information in the stream
     *          is inconsistent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected boolean enableResolveObject(boolean enable)

    /**
     * Enable the stream to allow objects read from the stream to be replaced.
     * When enabled, the resolveObject method is called for every object being
     * deserialized.
     *
     * <p>If <i>enable</i> is true, and there is a security manager installed,
     * this method first calls the security manager's
     * <code>checkPermission</code> method with the
     * <code>SerializablePermission("enableSubstitution")</code> permission to
     * ensure it's ok to enable the stream to allow objects read from the
     * stream to be replaced.
     *
     * @param   enable true for enabling use of <code>resolveObject</code> for
     *          every object being deserialized
     * @return  the previous setting before this method was invoked
     * @throws  SecurityException if a security manager exists and its
     *          <code>checkPermission</code> method denies enabling the stream
     *          to allow objects read from the stream to be replaced.
     * @see SecurityManager#checkPermission
     * @see java.io.SerializablePermission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected Object resolveObject(Object obj) throws IOException {

    /**
     * This method will allow trusted subclasses of ObjectInputStream to
     * substitute one object for another during deserialization. Replacing
     * objects is disabled until enableResolveObject is called. The
     * enableResolveObject method checks that the stream requesting to resolve
     * object can be trusted. Every reference to serializable objects is passed
     * to resolveObject.  To insure that the private state of objects is not
     * unintentionally exposed only trusted streams may use resolveObject.
     *
     * <p>This method is called after an object has been read but before it is
     * returned from readObject.  The default resolveObject method just returns
     * the same object.
     *
     * <p>When a subclass is replacing objects it must insure that the
     * substituted object is compatible with every field where the reference
     * will be stored.  Objects whose type is not a subclass of the type of the
     * field or array element abort the serialization by raising an exception
     * and the object is not be stored.
     *
     * <p>This method is called only once when each object is first
     * encountered.  All subsequent references to the object will be redirected
     * to the new object.
     *
     * @param   obj object to be substituted
     * @return  the substituted object
     * @throws  IOException Any of the usual Input/Output exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected Class<?> resolveProxyClass(String[] interfaces)

    /**
     * Returns a proxy class that implements the interfaces named in a proxy
     * class descriptor; subclasses may implement this method to read custom
     * data from the stream along with the descriptors for dynamic proxy
     * classes, allowing them to use an alternate loading mechanism for the
     * interfaces and the proxy class.
     *
     * <p>This method is called exactly once for each unique proxy class
     * descriptor in the stream.
     *
     * <p>The corresponding method in <code>ObjectOutputStream</code> is
     * <code>annotateProxyClass</code>.  For a given subclass of
     * <code>ObjectInputStream</code> that overrides this method, the
     * <code>annotateProxyClass</code> method in the corresponding subclass of
     * <code>ObjectOutputStream</code> must write any data or objects read by
     * this method.
     *
     * <p>The default implementation of this method in
     * <code>ObjectInputStream</code> returns the result of calling
     * <code>Proxy.getProxyClass</code> with the list of <code>Class</code>
     * objects for the interfaces that are named in the <code>interfaces</code>
     * parameter.  The <code>Class</code> object for each interface name
     * <code>i</code> is the value returned by calling
     * <pre>
     *     Class.forName(i, false, loader)
     * </pre>
     * where <code>loader</code> is that of the first non-<code>null</code>
     * class loader up the execution stack, or <code>null</code> if no
     * non-<code>null</code> class loaders are on the stack (the same class
     * loader choice used by the <code>resolveClass</code> method).  Unless any
     * of the resolved interfaces are non-public, this same value of
     * <code>loader</code> is also the class loader passed to
     * <code>Proxy.getProxyClass</code>; if non-public interfaces are present,
     * their class loader is passed instead (if more than one non-public
     * interface class loader is encountered, an
     * <code>IllegalAccessError</code> is thrown).
     * If <code>Proxy.getProxyClass</code> throws an
     * <code>IllegalArgumentException</code>, <code>resolveProxyClass</code>
     * will throw a <code>ClassNotFoundException</code> containing the
     * <code>IllegalArgumentException</code>.
     *
     * @param interfaces the list of interface names that were
     *                deserialized in the proxy class descriptor
     * @return  a proxy class for the specified interfaces
     * @throws        IOException any exception thrown by the underlying
     *                <code>InputStream</code>
     * @throws        ClassNotFoundException if the proxy class or any of the
     *                named interfaces could not be found
     * @see ObjectOutputStream#annotateProxyClass(Class)
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected Class<?> resolveClass(ObjectStreamClass desc)

    /**
     * Load the local class equivalent of the specified stream class
     * description.  Subclasses may implement this method to allow classes to
     * be fetched from an alternate source.
     *
     * <p>The corresponding method in <code>ObjectOutputStream</code> is
     * <code>annotateClass</code>.  This method will be invoked only once for
     * each unique class in the stream.  This method can be implemented by
     * subclasses to use an alternate loading mechanism but must return a
     * <code>Class</code> object. Once returned, if the class is not an array
     * class, its serialVersionUID is compared to the serialVersionUID of the
     * serialized class, and if there is a mismatch, the deserialization fails
     * and an {@link InvalidClassException} is thrown.
     *
     * <p>The default implementation of this method in
     * <code>ObjectInputStream</code> returns the result of calling
     * <pre>
     *     Class.forName(desc.getName(), false, loader)
     * </pre>
     * where <code>loader</code> is determined as follows: if there is a
     * method on the current thread's stack whose declaring class was
     * defined by a user-defined class loader (and was not a generated to
     * implement reflective invocations), then <code>loader</code> is class
     * loader corresponding to the closest such method to the currently
     * executing frame; otherwise, <code>loader</code> is
     * <code>null</code>. If this call results in a
     * <code>ClassNotFoundException</code> and the name of the passed
     * <code>ObjectStreamClass</code> instance is the Java language keyword
     * for a primitive type or void, then the <code>Class</code> object
     * representing that primitive type or void will be returned
     * (e.g., an <code>ObjectStreamClass</code> with the name
     * <code>"int"</code> will be resolved to <code>Integer.TYPE</code>).
     * Otherwise, the <code>ClassNotFoundException</code> will be thrown to
     * the caller of this method.
     *
     * @param   desc an instance of class <code>ObjectStreamClass</code>
     * @return  a <code>Class</code> object corresponding to <code>desc</code>
     * @throws  IOException any of the usual Input/Output exceptions.
     * @throws  ClassNotFoundException if class of a serialized object cannot
     *          be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public void registerValidation(ObjectInputValidation obj, int prio)

    /**
     * Register an object to be validated before the graph is returned.  While
     * similar to resolveObject these validations are called after the entire
     * graph has been reconstituted.  Typically, a readObject method will
     * register the object with the stream so that when all of the objects are
     * restored a final set of validations can be performed.
     *
     * @param   obj the object to receive the validation callback.
     * @param   prio controls the order of callbacks;zero is a good default.
     *          Use higher numbers to be called back earlier, lower numbers for
     *          later callbacks. Within a priority, callbacks are processed in
     *          no particular order.
     * @throws  NotActiveException The stream is not currently reading objects
     *          so it is invalid to register a callback.
     * @throws  InvalidObjectException The validation object is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public ObjectInputStream.GetField readFields()

    /**
     * Reads the persistent fields from the stream and makes them available by
     * name.
     *
     * @return  the <code>GetField</code> object representing the persistent
     *          fields of the object being deserialized
     * @throws  ClassNotFoundException if the class of a serialized object
     *          could not be found.
     * @throws  IOException if an I/O error occurs.
     * @throws  NotActiveException if the stream is not currently reading
     *          objects.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public void defaultReadObject()

    /**
     * Read the non-static and non-transient fields of the current class from
     * this stream.  This may only be called from the readObject method of the
     * class being deserialized. It will throw the NotActiveException if it is
     * called otherwise.
     *
     * @throws  ClassNotFoundException if the class of a serialized object
     *          could not be found.
     * @throws  IOException if an I/O error occurs.
     * @throws  NotActiveException if the stream is not currently reading
     *          objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public Object readUnshared() throws IOException, ClassNotFoundException {

    /**
     * Reads an "unshared" object from the ObjectInputStream.  This method is
     * identical to readObject, except that it prevents subsequent calls to
     * readObject and readUnshared from returning additional references to the
     * deserialized instance obtained via this call.  Specifically:
     * <ul>
     *   <li>If readUnshared is called to deserialize a back-reference (the
     *       stream representation of an object which has been written
     *       previously to the stream), an ObjectStreamException will be
     *       thrown.
     *
     *   <li>If readUnshared returns successfully, then any subsequent attempts
     *       to deserialize back-references to the stream handle deserialized
     *       by readUnshared will cause an ObjectStreamException to be thrown.
     * </ul>
     * Deserializing an object via readUnshared invalidates the stream handle
     * associated with the returned object.  Note that this in itself does not
     * always guarantee that the reference returned by readUnshared is unique;
     * the deserialized object may define a readResolve method which returns an
     * object visible to other parties, or readUnshared may return a Class
     * object or enum constant obtainable elsewhere in the stream or through
     * external means. If the deserialized object defines a readResolve method
     * and the invocation of that method returns an array, then readUnshared
     * returns a shallow clone of that array; this guarantees that the returned
     * array object is unique and cannot be obtained a second time from an
     * invocation of readObject or readUnshared on the ObjectInputStream,
     * even if the underlying data stream has been manipulated.
     *
     * <p>ObjectInputStream subclasses which override this method can only be
     * constructed in security contexts possessing the
     * "enableSubclassImplementation" SerializablePermission; any attempt to
     * instantiate such a subclass without this permission will cause a
     * SecurityException to be thrown.
     *
     * @return  reference to deserialized object
     * @throws  ClassNotFoundException if class of an object to deserialize
     *          cannot be found
     * @throws  StreamCorruptedException if control information in the stream
     *          is inconsistent
     * @throws  ObjectStreamException if object to deserialize has already
     *          appeared in stream
     * @throws  OptionalDataException if primitive data is next in stream
     * @throws  IOException if an I/O error occurs during deserialization
     * @since   1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected Object readObjectOverride()

    /**
     * This method is called by trusted subclasses of ObjectOutputStream that
     * constructed ObjectOutputStream using the protected no-arg constructor.
     * The subclass is expected to provide an override method with the modifier
     * "final".
     *
     * @return  the Object read from the stream.
     * @throws  ClassNotFoundException Class definition of a serialized object
     *          cannot be found.
     * @throws  OptionalDataException Primitive data was found in the stream
     *          instead of objects.
     * @throws  IOException if I/O errors occurred while reading from the
     *          underlying stream
     * @see #ObjectInputStream()
     * @see #readObject()
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public final Object readObject()

    /**
     * Read an object from the ObjectInputStream.  The class of the object, the
     * signature of the class, and the values of the non-transient and
     * non-static fields of the class and all of its supertypes are read.
     * Default deserializing for a class can be overriden using the writeObject
     * and readObject methods.  Objects referenced by this object are read
     * transitively so that a complete equivalent graph of objects is
     * reconstructed by readObject.
     *
     * <p>The root object is completely restored when all of its fields and the
     * objects it references are completely restored.  At this point the object
     * validation callbacks are executed in order based on their registered
     * priorities. The callbacks are registered by objects (in the readObject
     * special methods) as they are individually restored.
     *
     * <p>Exceptions are thrown for problems with the InputStream and for
     * classes that should not be deserialized.  All exceptions are fatal to
     * the InputStream and leave it in an indeterminate state; it is up to the
     * caller to ignore or recover the stream state.
     *
     * @throws  ClassNotFoundException Class of a serialized object cannot be
     *          found.
     * @throws  InvalidClassException Something is wrong with a class used by
     *          serialization.
     * @throws  StreamCorruptedException Control information in the
     *          stream is inconsistent.
     * @throws  OptionalDataException Primitive data was found in the
     *          stream instead of objects.
     * @throws  IOException Any of the usual Input/Output related exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    protected ObjectInputStream() throws IOException, SecurityException {

    /**
     * Provide a way for subclasses that are completely reimplementing
     * ObjectInputStream to not have to allocate private data just used by this
     * implementation of ObjectInputStream.
     *
     * <p>If there is a security manager installed, this method first calls the
     * security manager's <code>checkPermission</code> method with the
     * <code>SerializablePermission("enableSubclassImplementation")</code>
     * permission to ensure it's ok to enable subclassing.
     *
     * @throws  SecurityException if a security manager exists and its
     *          <code>checkPermission</code> method denies enabling
     *          subclassing.
     * @throws  IOException if an I/O error occurs while creating this stream
     * @see SecurityManager#checkPermission
     * @see java.io.SerializablePermission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    public ObjectInputStream(InputStream in) throws IOException {

    /**
     * Creates an ObjectInputStream that reads from the specified InputStream.
     * A serialization stream header is read from the stream and verified.
     * This constructor will block until the corresponding ObjectOutputStream
     * has written and flushed the header.
     *
     * <p>If a security manager is installed, this constructor will check for
     * the "enableSubclassImplementation" SerializablePermission when invoked
     * directly or indirectly by the constructor of a subclass which overrides
     * the ObjectInputStream.readFields or ObjectInputStream.readUnshared
     * methods.
     *
     * @param   in input stream to read from
     * @throws  StreamCorruptedException if the stream header is incorrect
     * @throws  IOException if an I/O error occurs while reading stream header
     * @throws  SecurityException if untrusted subclass illegally overrides
     *          security-sensitive methods
     * @throws  NullPointerException if <code>in</code> is <code>null</code>
     * @see     ObjectInputStream#ObjectInputStream()
     * @see     ObjectInputStream#readFields()
     * @see     ObjectOutputStream#ObjectOutputStream(OutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private SerialCallbackContext curContext;

    /**
     * Context during upcalls to class-defined readObject methods; holds
     * object currently being deserialized and descriptor for current class.
     * Null when not during readObject upcall.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private final boolean enableOverride;

    /** if true, invoke readObjectOverride() instead of readObject() */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private byte[] primVals;

    /** buffer for reading primitive field values */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private boolean defaultDataEnd = false;

    /** flag set when at end of field value block with no TC_ENDBLOCKDATA */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private final HandleTable handles;

    /** wire handle -> obj/exception map */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private int depth;

    /** recursion depth */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private final BlockDataInputStream bin;

    /** filter stream for handling block data conversion */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        static final ReferenceQueue<Class<?>> subclassAuditsQueue =

        /** queue for WeakReferences to audited subclasses */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
        static final ConcurrentMap<WeakClassKey,Boolean> subclassAudits =

        /** cache of subclass security audit results */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static final HashMap<String, Class<?>> primClasses

    /** table mapping primitive type names to corresponding class objects */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static final Object unsharedMarker = new Object();

    /** marker for unshared objects in internal handle table */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
    private static final int NULL_HANDLE = -1;

    /** handle value representing null */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectInputStream.java
public class ObjectInputStream

/**
 * An ObjectInputStream deserializes primitive data and objects previously
 * written using an ObjectOutputStream.
 *
 * <p>ObjectOutputStream and ObjectInputStream can provide an application with
 * persistent storage for graphs of objects when used with a FileOutputStream
 * and FileInputStream respectively.  ObjectInputStream is used to recover
 * those objects previously serialized. Other uses include passing objects
 * between hosts using a socket stream or for marshaling and unmarshaling
 * arguments and parameters in a remote communication system.
 *
 * <p>ObjectInputStream ensures that the types of all objects in the graph
 * created from the stream match the classes present in the Java Virtual
 * Machine.  Classes are loaded as required using the standard mechanisms.
 *
 * <p>Only objects that support the java.io.Serializable or
 * java.io.Externalizable interface can be read from streams.
 *
 * <p>The method <code>readObject</code> is used to read an object from the
 * stream.  Java's safe casting should be used to get the desired type.  In
 * Java, strings and arrays are objects and are treated as objects during
 * serialization. When read they need to be cast to the expected type.
 *
 * <p>Primitive data types can be read from the stream using the appropriate
 * method on DataInput.
 *
 * <p>The default deserialization mechanism for objects restores the contents
 * of each field to the value and type it had when it was written.  Fields
 * declared as transient or static are ignored by the deserialization process.
 * References to other objects cause those objects to be read from the stream
 * as necessary.  Graphs of objects are restored correctly using a reference
 * sharing mechanism.  New objects are always allocated when deserializing,
 * which prevents existing objects from being overwritten.
 *
 * <p>Reading an object is analogous to running the constructors of a new
 * object.  Memory is allocated for the object and initialized to zero (NULL).
 * No-arg constructors are invoked for the non-serializable classes and then
 * the fields of the serializable classes are restored from the stream starting
 * with the serializable class closest to java.lang.object and finishing with
 * the object's most specific class.
 *
 * <p>For example to read from a stream as written by the example in
 * ObjectOutputStream:
 * <br>
 * <pre>
 *      FileInputStream fis = new FileInputStream("t.tmp");
 *      ObjectInputStream ois = new ObjectInputStream(fis);
 *
 *      int i = ois.readInt();
 *      String today = (String) ois.readObject();
 *      Date date = (Date) ois.readObject();
 *
 *      ois.close();
 * </pre>
 *
 * <p>Classes control how they are serialized by implementing either the
 * java.io.Serializable or java.io.Externalizable interfaces.
 *
 * <p>Implementing the Serializable interface allows object serialization to
 * save and restore the entire state of the object and it allows classes to
 * evolve between the time the stream is written and the time it is read.  It
 * automatically traverses references between objects, saving and restoring
 * entire graphs.
 *
 * <p>Serializable classes that require special handling during the
 * serialization and deserialization process should implement the following
 * methods:
 *
 * <pre>
 * private void writeObject(java.io.ObjectOutputStream stream)
 *     throws IOException;
 * private void readObject(java.io.ObjectInputStream stream)
 *     throws IOException, ClassNotFoundException;
 * private void readObjectNoData()
 *     throws ObjectStreamException;
 * </pre>
 *
 * <p>The readObject method is responsible for reading and restoring the state
 * of the object for its particular class using data written to the stream by
 * the corresponding writeObject method.  The method does not need to concern
 * itself with the state belonging to its superclasses or subclasses.  State is
 * restored by reading data from the ObjectInputStream for the individual
 * fields and making assignments to the appropriate fields of the object.
 * Reading primitive data types is supported by DataInput.
 *
 * <p>Any attempt to read object data which exceeds the boundaries of the
 * custom data written by the corresponding writeObject method will cause an
 * OptionalDataException to be thrown with an eof field value of true.
 * Non-object reads which exceed the end of the allotted data will reflect the
 * end of data in the same way that they would indicate the end of the stream:
 * bytewise reads will return -1 as the byte read or number of bytes read, and
 * primitive reads will throw EOFExceptions.  If there is no corresponding
 * writeObject method, then the end of default serialized data marks the end of
 * the allotted data.
 *
 * <p>Primitive and object read calls issued from within a readExternal method
 * behave in the same manner--if the stream is already positioned at the end of
 * data written by the corresponding writeExternal method, object reads will
 * throw OptionalDataExceptions with eof set to true, bytewise reads will
 * return -1, and primitive reads will throw EOFExceptions.  Note that this
 * behavior does not hold for streams written with the old
 * <code>ObjectStreamConstants.PROTOCOL_VERSION_1</code> protocol, in which the
 * end of data written by writeExternal methods is not demarcated, and hence
 * cannot be detected.
 *
 * <p>The readObjectNoData method is responsible for initializing the state of
 * the object for its particular class in the event that the serialization
 * stream does not list the given class as a superclass of the object being
 * deserialized.  This may occur in cases where the receiving party uses a
 * different version of the deserialized instance's class than the sending
 * party, and the receiver's version extends classes that are not extended by
 * the sender's version.  This may also occur if the serialization stream has
 * been tampered; hence, readObjectNoData is useful for initializing
 * deserialized objects properly despite a "hostile" or incomplete source
 * stream.
 *
 * <p>Serialization does not read or assign values to the fields of any object
 * that does not implement the java.io.Serializable interface.  Subclasses of
 * Objects that are not serializable can be serializable. In this case the
 * non-serializable class must have a no-arg constructor to allow its fields to
 * be initialized.  In this case it is the responsibility of the subclass to
 * save and restore the state of the non-serializable class. It is frequently
 * the case that the fields of that class are accessible (public, package, or
 * protected) or that there are get and set methods that can be used to restore
 * the state.
 *
 * <p>Any exception that occurs while deserializing an object will be caught by
 * the ObjectInputStream and abort the reading process.
 *
 * <p>Implementing the Externalizable interface allows the object to assume
 * complete control over the contents and format of the object's serialized
 * form.  The methods of the Externalizable interface, writeExternal and
 * readExternal, are called to save and restore the objects state.  When
 * implemented by a class they can write and read their own state using all of
 * the methods of ObjectOutput and ObjectInput.  It is the responsibility of
 * the objects to handle any versioning that occurs.
 *
 * <p>Enum constants are deserialized differently than ordinary serializable or
 * externalizable objects.  The serialized form of an enum constant consists
 * solely of its name; field values of the constant are not transmitted.  To
 * deserialize an enum constant, ObjectInputStream reads the constant name from
 * the stream; the deserialized constant is then obtained by calling the static
 * method <code>Enum.valueOf(Class, String)</code> with the enum constant's
 * base type and the received constant name as arguments.  Like other
 * serializable or externalizable objects, enum constants can function as the
 * targets of back references appearing subsequently in the serialization
 * stream.  The process by which enum constants are deserialized cannot be
 * customized: any class-specific readObject, readObjectNoData, and readResolve
 * methods defined by enum types are ignored during deserialization.
 * Similarly, any serialPersistentFields or serialVersionUID field declarations
 * are also ignored--all enum types have a fixed serialVersionUID of 0L.
 *
 * @author      Mike Warres
 * @author      Roger Riggs
 * @see java.io.DataInput
 * @see java.io.ObjectOutputStream
 * @see java.io.Serializable
 * @see <a href="../../../platform/serialization/spec/input.html"> Object Serialization Specification, Section 3, Object Input Classes</a>
 * @since   JDK1.1
 */
