_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ObjectAdapterIdNumber.java
public class ObjectAdapterIdNumber extends ObjectAdapterIdArray {

/** ObjectAdapterIdNumber is used to represent pre-JDK 1.4 POA adapter
 * IDs.  The POA ID was simply represented as a single integer, which was
 * mapped to the actual POA instance.  Here, we just represent these
 * internally as arrays of the form { "OldRootPOA", "<number>" },
 * and provide an extra method to get the number back.
 */
