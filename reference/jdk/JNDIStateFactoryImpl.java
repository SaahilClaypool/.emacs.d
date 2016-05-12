_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/presentation/rmi/JNDIStateFactoryImpl.java
    public Object getStateToBind(Object orig, Name name, Context ctx,
        Hashtable<?,?> env) throws NamingException

    /**
     * Returns the CORBA object for a Remote object.
     * If input is not a Remote object, or if Remote object uses JRMP, return null.
     * If the RMI-IIOP library is not available, throw ConfigurationException.
     *
     * @param orig The object to turn into a CORBA object. If not Remote,
     *             or if is a JRMP stub or impl, return null.
     * @param name Ignored
     * @param ctx The non-null CNCtx whose ORB to use.
     * @param env Ignored
     * @return The CORBA object for <tt>orig</tt> or null.
     * @exception ConfigurationException If the CORBA object cannot be obtained
     *    due to configuration problems
     * @exception NamingException If some other problem prevented a CORBA
     *    object from being obtained from the Remote object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/presentation/rmi/JNDIStateFactoryImpl.java
public class JNDIStateFactoryImpl implements StateFactory

/**
  * StateFactory that turns java.rmi.Remote objects to org.omg.CORBA.Object.
  * This version works either with standard RMI-IIOP or Dynamic RMI-IIOP.
  * Based on the original com.sun.jndi.cosnaming.RemoteToCorba and
  * com.sun.jndi.toolkit.corba.CorbaUtils.
  *
  * @author Ken Cavanaugh
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/presentation/rmi/JNDIStateFactoryImpl.java
    public Object getStateToBind(Object orig, Name name, Context ctx,
        Hashtable<?,?> env) throws NamingException

    /**
     * Returns the CORBA object for a Remote object.
     * If input is not a Remote object, or if Remote object uses JRMP, return null.
     * If the RMI-IIOP library is not available, throw ConfigurationException.
     *
     * @param orig The object to turn into a CORBA object. If not Remote,
     *             or if is a JRMP stub or impl, return null.
     * @param name Ignored
     * @param ctx The non-null CNCtx whose ORB to use.
     * @param env Ignored
     * @return The CORBA object for <tt>orig</tt> or null.
     * @exception ConfigurationException If the CORBA object cannot be obtained
     *    due to configuration problems
     * @exception NamingException If some other problem prevented a CORBA
     *    object from being obtained from the Remote object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/presentation/rmi/JNDIStateFactoryImpl.java
public class JNDIStateFactoryImpl implements StateFactory

/**
  * StateFactory that turns java.rmi.Remote objects to org.omg.CORBA.Object.
  * This version works either with standard RMI-IIOP or Dynamic RMI-IIOP.
  * Based on the original com.sun.jndi.cosnaming.RemoteToCorba and
  * com.sun.jndi.toolkit.corba.CorbaUtils.
  *
  * @author Ken Cavanaugh
  */
