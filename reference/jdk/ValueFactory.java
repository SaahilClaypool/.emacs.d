_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ValueFactory.java
public interface ValueFactory {

/**
 * The ValueFactory interface is the native mapping for the IDL
 * type CORBA::ValueFactory. The read_value() method is called by
 * the ORB runtime while in the process of unmarshaling a value type.
 * A user shall implement this method as part of implementing a type
 * specific value factory. In the implementation, the user shall call
 * is.read_value(java.io.Serializable) with a uninitialized valuetype
 * to use for unmarshaling. The value returned by the stream is
 * the same value passed in, with all the data unmarshaled.
 * @see org.omg.CORBA_2_3.ORB
 */
