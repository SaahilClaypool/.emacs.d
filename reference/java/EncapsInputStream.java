_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/EncapsInputStream.java
    public EncapsInputStream(org.omg.CORBA.ORB orb,
                             byte[] data,
                             int size,
                             GIOPVersion version,
                             CodeBase codeBase) {

    /**
     * Full constructor with a CodeBase parameter useful for
     * unmarshaling RMI-IIOP valuetypes (technically against the
     * intention of an encapsulation, but necessary due to OMG
     * issue 4795.  Used by ServiceContexts.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/EncapsInputStream.java
public class EncapsInputStream extends CDRInputStream

/**
 * Encapsulations are supposed to explicitly define their
 * code sets and GIOP version.  The original resolution to issue 2784
 * said that the defaults were UTF-8 and UTF-16, but that was not
 * agreed upon.
 *
 * These streams currently use CDR 1.2 with ISO8859-1 for char/string and
 * UTF16 for wchar/wstring.  If no byte order marker is available,
 * the endianness of the encapsulation is used.
 *
 * When more encapsulations arise that have their own special code
 * sets defined, we can make all constructors take such parameters.
 */
