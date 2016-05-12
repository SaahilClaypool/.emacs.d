_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/CustomMarshal.java
    void unmarshal(DataInputStream is);

    /**
     * Unmarshal method has to be implemented by the Customized Marshal class.
     * This is the method invoked for Unmarshalling.
     *
     * @param is a DataInputStream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/CustomMarshal.java
public interface CustomMarshal {

/**
 * An abstract value type that is meant to
 * be used by the ORB, not the user. Semantically it is treated
 * as a custom value type's implicit base class, although the custom
 * valuetype does not actually inherit it in IDL. The implementer
 * of a custom value type shall provide an implementation of the
 * <tt>CustomMarshal</tt> operations. The manner in which this is done is
 * specified in the IDL to Java langauge mapping. Each custom
 * marshaled value type shall have its own implementation.
 * @see DataInputStream
 */
