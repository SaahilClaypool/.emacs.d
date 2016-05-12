_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DefaultDatagramSocketImplFactory.java
    static DatagramSocketImpl createDatagramSocketImpl(boolean isMulticast)

    /**
     * Creates a new <code>DatagramSocketImpl</code> instance.
     *
     * @param   isMulticast true if this impl is to be used for a MutlicastSocket
     * @return  a new instance of <code>PlainDatagramSocketImpl</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DefaultDatagramSocketImplFactory.java
class DefaultDatagramSocketImplFactory

/**
 * This class defines a factory for creating DatagramSocketImpls. It defaults
 * to creating plain DatagramSocketImpls, but may create other DatagramSocketImpls
 * by setting the impl.prefix system property.
 *
 * For Windows versions lower than Windows Vista a TwoStacksPlainDatagramSocketImpl
 * is always created. This impl supports IPv6 on these platform where available.
 *
 * On Windows platforms greater than Vista that support a dual layer TCP/IP stack
 * a DualStackPlainDatagramSocketImpl is created for DatagramSockets. For MulticastSockets
 * a TwoStacksPlainDatagramSocketImpl is always created. This is to overcome the lack
 * of behavior defined for multicasting over a dual layer socket by the RFC.
 *
 * @author Chris Hegarty
 */
