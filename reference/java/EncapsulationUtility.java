_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/EncapsulationUtility.java
    static public byte[] readOctets( InputStream is )

    /** Helper method that reads an octet array from an input stream.
    * Defined as static here so that it can be used in another class.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/EncapsulationUtility.java
    static public InputStream getEncapsulationStream( InputStream is )

    /** Helper method to read the octet array from is, deencapsulate it,
    * and return
    * as another InputStream.  This must be called inside the
    * constructor of a derived class to obtain the correct stream
    * for unmarshalling data.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/EncapsulationUtility.java
    static public void writeOutputStream( OutputStream dataStream,
        OutputStream os )

    /** Helper method that is used to extract data from an output
    * stream and write the data to another output stream.  Defined
    * as static so that it can be used in another class.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/EncapsulationUtility.java
    public static  void writeIdentifiableSequence( List container, OutputStream os)

    /** Write all Identifiables that we contain to os.  The total
     * length must be written before this method is called.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/EncapsulationUtility.java
    public static void readIdentifiableSequence( List container,
        IdentifiableFactoryFinder finder, InputStream istr)

    /** Read the count from is, then read count Identifiables from
     * is using the factory.  Add each constructed Identifiable to container.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/EncapsulationUtility.java
public class EncapsulationUtility

/**
 * This static utility class contains various utility methods for reading and
 * writing CDR encapsulations.
 *
 * @author Ken Cavanaugh
 */
