_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/Streamable.java
    TypeCode _type();

    /**
     * Retrieves the <code>TypeCode</code> object corresponding to the value
     * in the <code>value</code> field of the Holder.
     *
     * @return    the <code>TypeCode</code> object for the value held in the holder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/Streamable.java
    void _write(OutputStream ostream);

    /**
     * Marshals to <code>ostream</code> the value in the
     * <code>value</code> field of the Holder.
     *
     * @param     ostream   the CDR OutputStream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/Streamable.java
public interface Streamable {

/**
 * The base class for the Holder classess of all complex
 * IDL types. The ORB treats all generated Holders as Streamable to invoke
 * the methods for marshalling and unmarshalling.
 *
 * @since   JDK1.2
 */
