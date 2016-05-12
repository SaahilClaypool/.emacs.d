_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/BufferManagerRead.java
    public MarkAndResetHandler getMarkAndResetHandler();

    /**
     * Returns the mark/reset handler for this stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/BufferManagerRead.java
    public void init(Message header);

    /**
     * Called once after creating this buffer manager and before
     * it begins processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/BufferManagerRead.java
    /**

    /**
     * Case: called from CDRInputStream constructor before unmarshaling.
     *
     * Does:
     *
     *  this.bufQ.get()
     *
     *  If streaming then sync on bufQ and wait if empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/BufferManagerRead.java
    public void processFragment ( ByteBuffer byteBuffer,
        FragmentMessage header);

    /**
     * Case: Called from ReaderThread on complete message or fragments.
     *       The given buf may be entire message or a fragment.
     *
     *  The ReaderThread finds the ReadBufferManager instance either in
     *  in a fragment map (when collecting - GIOP 1.2 phase 1) or
     *  in an active server requests map (when streaming - GIOP 1.2 phase 2).
     *
     *  As a model for implementation see IIOPInputStream's
     *  constructor of the same name. There are going to be some variations.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/BufferManagerRead.java
    public MarkAndResetHandler getMarkAndResetHandler();

    /**
     * Returns the mark/reset handler for this stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/BufferManagerRead.java
    public void init(Message header);

    /**
     * Called once after creating this buffer manager and before
     * it begins processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/BufferManagerRead.java
    /**

    /**
     * Case: called from CDRInputStream constructor before unmarshaling.
     *
     * Does:
     *
     *  this.bufQ.get()
     *
     *  If streaming then sync on bufQ and wait if empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/BufferManagerRead.java
    public void processFragment ( ByteBuffer byteBuffer,
        FragmentMessage header);

    /**
     * Case: Called from ReaderThread on complete message or fragments.
     *       The given buf may be entire message or a fragment.
     *
     *  The ReaderThread finds the ReadBufferManager instance either in
     *  in a fragment map (when collecting - GIOP 1.2 phase 1) or
     *  in an active server requests map (when streaming - GIOP 1.2 phase 2).
     *
     *  As a model for implementation see IIOPInputStream's
     *  constructor of the same name. There are going to be some variations.
     *
     */
