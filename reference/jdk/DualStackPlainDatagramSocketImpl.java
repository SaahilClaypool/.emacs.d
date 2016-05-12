_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DualStackPlainDatagramSocketImpl.java
class DualStackPlainDatagramSocketImpl extends AbstractPlainDatagramSocketImpl

/**
 * This class defines the plain DatagramSocketImpl that is used on
 * Windows platforms greater than or equal to Windows Vista. These
 * platforms have a dual layer TCP/IP stack and can handle both IPv4
 * and IPV6 through a single file descriptor.
 * <p>
 * Note: Multicasting on a dual layer TCP/IP stack is always done with
 * TwoStacksPlainDatagramSocketImpl. This is to overcome the lack
 * of behavior defined for multicasting over a dual layer socket by the RFC.
 *
 * @author Chris Hegarty
 */
