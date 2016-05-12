_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
     private <T> T createCustom(
         final Class<T> type, final String className
     ) throws Throwable {

     /**
      * Create a custom implementation without privileges.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
     private IIOPInputStream createInputStreamBuiltInNoPriv(
         final String name
     ) throws IOException {

     /**
      * Returning null indicates a non-built is specified.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
     private IIOPInputStream createInputStreamBuiltIn(
         final String name
     ) throws Throwable {

    /**
     * Construct a built in implementation with priveleges.
     * Returning null indicates a non-built is specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    private IIOPOutputStream createOutputStreamBuiltInNoPriv(
        final String name
    ) throws IOException {

    /**
     * Returning null indicates a non-built is specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    private IIOPOutputStream createOutputStreamBuiltIn(
        final String name
    ) throws Throwable {

    /**
     * Construct a built in implementation with priveleges.
     * Returning null indicates a non-built is specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    public java.io.Serializable writeReplace(java.io.Serializable value) {

    /**
     * If the value contains a writeReplace method then the result
     * is returned.  Otherwise, the value itself is returned.
     * @return the true value to marshal on the wire.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
     public boolean useFullValueDescription(Class clazz, String repositoryID)

    /**
     *  Returns a boolean of whether or not RepositoryId indicates
     *  FullValueDescriptor.
     *  used for backward compatability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    public org.omg.SendingContext.RunTime getRunTimeCodeBase() {

    /**
     * Returns the CodeBase for this ValueHandler.  This is used by
     * the ORB runtime.  The server sends the service context containing
     * the IOR for this CodeBase on the first GIOP reply.  The clients
     * do the same on the first GIOP request.
     * @return the SendingContext.CodeBase of this ValueHandler.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    public boolean isCustomMarshaled(java.lang.Class clz) {

    /**
     * Indicates whether the given Class performs custom or
     * default marshaling.
     * @param clz The class to test for custom marshaling.
     * @return True if the class performs custom marshaling, false
     * if it does not.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    public java.lang.String getRMIRepositoryID(java.lang.Class clz) {

    /**
     * Returns the repository ID for the given RMI value Class.
     * @param clz The class to return a repository ID for.
     * @return the repository ID of the Class.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    public java.io.Serializable readValue(org.omg.CORBA.portable.InputStream _in,
                                          int offset,
                                          java.lang.Class clazz,
                                          String repositoryID,
                                          org.omg.SendingContext.RunTime _sender)

    /**
     * Reads a value from the stream using java semantics.
     * @param in The stream to read the value from
     * @param clazz The type of the value to be read in
     * @param sender The sending context runtime
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    public void writeValue(org.omg.CORBA.portable.OutputStream _out,
                           java.io.Serializable value) {

    /**
     * Writes the value to the stream using java semantics.
     * @param out The stream to write the value to
     * @param value The value to be written to the stream
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
     private <T> T createCustom(
         final Class<T> type, final String className
     ) throws Throwable {

     /**
      * Create a custom implementation without privileges.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
     private IIOPInputStream createInputStreamBuiltInNoPriv(
         final String name
     ) throws IOException {

     /**
      * Returning null indicates a non-built is specified.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
     private IIOPInputStream createInputStreamBuiltIn(
         final String name
     ) throws Throwable {

    /**
     * Construct a built in implementation with priveleges.
     * Returning null indicates a non-built is specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    private IIOPOutputStream createOutputStreamBuiltInNoPriv(
        final String name
    ) throws IOException {

    /**
     * Returning null indicates a non-built is specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    private IIOPOutputStream createOutputStreamBuiltIn(
        final String name
    ) throws Throwable {

    /**
     * Construct a built in implementation with priveleges.
     * Returning null indicates a non-built is specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    public java.io.Serializable writeReplace(java.io.Serializable value) {

    /**
     * If the value contains a writeReplace method then the result
     * is returned.  Otherwise, the value itself is returned.
     * @return the true value to marshal on the wire.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
     public boolean useFullValueDescription(Class clazz, String repositoryID)

    /**
     *  Returns a boolean of whether or not RepositoryId indicates
     *  FullValueDescriptor.
     *  used for backward compatability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    public org.omg.SendingContext.RunTime getRunTimeCodeBase() {

    /**
     * Returns the CodeBase for this ValueHandler.  This is used by
     * the ORB runtime.  The server sends the service context containing
     * the IOR for this CodeBase on the first GIOP reply.  The clients
     * do the same on the first GIOP request.
     * @return the SendingContext.CodeBase of this ValueHandler.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    public boolean isCustomMarshaled(java.lang.Class clz) {

    /**
     * Indicates whether the given Class performs custom or
     * default marshaling.
     * @param clz The class to test for custom marshaling.
     * @return True if the class performs custom marshaling, false
     * if it does not.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    public java.lang.String getRMIRepositoryID(java.lang.Class clz) {

    /**
     * Returns the repository ID for the given RMI value Class.
     * @param clz The class to return a repository ID for.
     * @return the repository ID of the Class.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    public java.io.Serializable readValue(org.omg.CORBA.portable.InputStream _in,
                                          int offset,
                                          java.lang.Class clazz,
                                          String repositoryID,
                                          org.omg.SendingContext.RunTime _sender)

    /**
     * Reads a value from the stream using java semantics.
     * @param in The stream to read the value from
     * @param clazz The type of the value to be read in
     * @param sender The sending context runtime
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ValueHandlerImpl.java
    public void writeValue(org.omg.CORBA.portable.OutputStream _out,
                           java.io.Serializable value) {

    /**
     * Writes the value to the stream using java semantics.
     * @param out The stream to write the value to
     * @param value The value to be written to the stream
     **/
