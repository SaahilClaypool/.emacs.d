_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/TwoStacksPlainDatagramSocketImpl.java
    private native static void init();

    /**
     * Perform class load-time initializations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/TwoStacksPlainDatagramSocketImpl.java
class TwoStacksPlainDatagramSocketImpl extends AbstractPlainDatagramSocketImpl

/**
 * This class defines the plain DatagramSocketImpl that is used for all
 * Windows versions lower than Vista. It adds support for IPv6 on
 * these platforms where available.
 *
 * For backward compatibility windows platforms that do not have IPv6
 * support also use this implementation, and fd1 gets set to null
 * during socket creation.
 *
 * @author Chris Hegarty
 */
