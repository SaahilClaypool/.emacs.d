_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CDRInputObject.java
    protected CodeSetConversion.BTCConverter createCharBTCConverter() {

    /**
     * Override the default CDR factory behavior to get the
     * negotiated code sets from the connection.
     *
     * These are only called once per message, the first time needed.
     *
     * In the local case, there is no Connection, so use the
     * local code sets.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CDRInputObject.java
    public void unmarshalHeader()

    /**
     * Unmarshal the extended GIOP header
     * NOTE: May be fragmented, so should not be called by the ReaderThread.
     * See CorbaResponseWaitingRoomImpl.waitForResponse.  It is done
     * there in the client thread.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CDRInputObject.java
public class CDRInputObject extends CDRInputStream

/**
 * @author Harold Carr
 */
