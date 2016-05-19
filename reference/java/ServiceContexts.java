_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContexts.java
    private boolean addAlignmentOnWrite ;

    /**
     * If true, write out a special alignment service context to force the
     * correct alignment on re-marshalling.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContexts.java
    private Map scMap;

    /**
     * Map of all ServiceContext objects in this container.
     *
     * Keys are java.lang.Integers for service context IDs.
     * Values are either instances of ServiceContext or the
     * unmarshaled byte arrays (unmarshaled on first use).
     *
     * This provides a mild optimization if we don't happen to
     * use a given service context, but it's main advantage is
     * that it allows us to change the order in which we
     * unmarshal them.  We need to do the UnknownExceptionInfo service
     * context after the SendingContextRunTime service context so that we can
     * get the CodeBase if necessary.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContexts.java
    public void put( ServiceContext sc )

    /** Add a service context to the stream, if there is not already
     * a service context in this object with the same id as sc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContexts.java
    private void writeMapEntry(OutputStream os, Integer id, Object scObj, GIOPVersion gv) {

    /**
     * Write the given entry from the scMap to the OutputStream.
     * See note on giopVersion.  The service context should
     * know the GIOP version it is meant for.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContexts.java
    private void writeServiceContextsInOrder(OutputStream os, GIOPVersion gv) {

    /**
     * Write the service contexts in scMap in a desired order.
     * Right now, the only special case we have is UnknownExceptionInfo,
     * so I'm merely writing it last if present.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContexts.java
    public void write(OutputStream os, GIOPVersion gv)

    /**
     * Write the service contexts to the output stream.
     *
     * If they haven't been unmarshaled, we don't have to
     * unmarshal them.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContexts.java
    private static final int JAVAIDL_ALIGN_SERVICE_ID = 0xbe1345cd ;

    /**
     * Hopefully unused scid:  This should be changed to a proper
     * VMCID aligned value.  REVISIT!
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContexts.java
    private ServiceContext unmarshal(Integer scId, byte[] data) {

    /**
     * Find the ServiceContextData for a given scId and unmarshal
     * the bytes.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContexts.java
    public ServiceContexts(InputStream s)

    /**
     * Read the Service contexts from the input stream.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContexts.java
    private void createMapFromInputStream(InputStream is)

    /**
     * Given the input stream, this fills our service
     * context map.  See the definition of scMap for
     * details.  Creates a HashMap.
     *
     * Note that we don't actually unmarshal the
     * bytes of the service contexts here.  That is
     * done when they are actually requested via
     * get(int).
     */
