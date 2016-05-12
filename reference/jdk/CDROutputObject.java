_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDROutputObject.java
    protected CodeSetConversion.CTBConverter createCharCTBConverter() {

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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDROutputObject.java
    public org.omg.CORBA.portable.InputStream create_input_stream()

    /** overrides create_input_stream from CDROutputStream */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDROutputObject.java
    public void writeTo(CorbaConnection connection)

    /**
     * Write the contents of the CDROutputStream to the specified
     * output stream.  Has the side-effect of pushing any current
     * Message onto the Message list.
     * @param s The output stream to write to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDROutputObject.java
public class CDROutputObject extends CorbaOutputObject

/**
 * @author Harold Carr
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDROutputObject.java
    protected CodeSetConversion.CTBConverter createCharCTBConverter() {

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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDROutputObject.java
    public org.omg.CORBA.portable.InputStream create_input_stream()

    /** overrides create_input_stream from CDROutputStream */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDROutputObject.java
    public void writeTo(CorbaConnection connection)

    /**
     * Write the contents of the CDROutputStream to the specified
     * output stream.  Has the side-effect of pushing any current
     * Message onto the Message list.
     * @param s The output stream to write to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDROutputObject.java
public class CDROutputObject extends CorbaOutputObject

/**
 * @author Harold Carr
 */
