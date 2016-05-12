_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/TransientNameServer.java
    private TransientNameServer() {}

    /**
     * Private constructor since no object of this type should be instantiated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/TransientNameServer.java
    public static void main(String args[]) {

    /**
     * Main startup routine. It instantiates a TransientNameService
     * object and a BootstrapServer object, and then allows invocations to
     * happen.
     * @param args an array of strings representing the startup arguments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/TransientNameServer.java
public class TransientNameServer

/**
 * Class TransientNameServer is a standalone application which
 * implements a transient name service. It uses the TransientNameService
 * class for the name service implementation, and the BootstrapServer
 * for implementing bootstrapping, i.e., to get the initial NamingContext.
 * <p>
 * The BootstrapServer uses a Properties object specify the initial service
 * object references supported; such as Properties object is created containing
 * only a "NameService" entry together with the stringified object reference
 * for the initial NamingContext. The BootstrapServer's listening port
 * is set by first checking the supplied arguments to the name server
 * (-ORBInitialPort), and if not set, defaults to the standard port number.
 * The BootstrapServer is created supplying the Properties object, using no
 * external File object for storage, and the derived initial port number.
 * @see TransientNameService
 * @see BootstrapServer
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/TransientNameServer.java
    private TransientNameServer() {}

    /**
     * Private constructor since no object of this type should be instantiated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/TransientNameServer.java
    public static void main(String args[]) {

    /**
     * Main startup routine. It instantiates a TransientNameService
     * object and a BootstrapServer object, and then allows invocations to
     * happen.
     * @param args an array of strings representing the startup arguments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/TransientNameServer.java
public class TransientNameServer

/**
 * Class TransientNameServer is a standalone application which
 * implements a transient name service. It uses the TransientNameService
 * class for the name service implementation, and the BootstrapServer
 * for implementing bootstrapping, i.e., to get the initial NamingContext.
 * <p>
 * The BootstrapServer uses a Properties object specify the initial service
 * object references supported; such as Properties object is created containing
 * only a "NameService" entry together with the stringified object reference
 * for the initial NamingContext. The BootstrapServer's listening port
 * is set by first checking the supplied arguments to the name server
 * (-ORBInitialPort), and if not set, defaults to the standard port number.
 * The BootstrapServer is created supplying the Properties object, using no
 * external File object for storage, and the derived initial port number.
 * @see TransientNameService
 * @see BootstrapServer
 */
