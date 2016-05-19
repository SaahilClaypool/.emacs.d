_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/transport/CorbaContactInfoListFactory.java
    public void setORB(ORB orb);

    /**
     * This will be called after the no-arg constructor before
     * create is called.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/transport/CorbaContactInfoListFactory.java
public interface CorbaContactInfoListFactory {

/** Interface used to create a ContactInfoList from an IOR, as required
 * for supporting CORBA semantics using the DCS framework.  This is a
 * natural correspondence since an IOR contains the information for
 * contacting one or more communication endpoints that can be used to
 * invoke a method on an object, along with the necessary information
 * on particular transports, encodings, and protocols to use.
 * Note that the actual implementation may support more than one
 * IOR in the case of GIOP with Location Forward messages.
 */
