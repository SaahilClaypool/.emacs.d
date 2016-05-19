_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 15:  // PortableActivationIDL/Locator/getServerPortForType

  /** Useful from external BadServerIdHandlers which need
	* to pick a particular port type.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 14:  // PortableActivationIDL/Locator/getEndpoint

  /** get the port for the endpoint of the locator
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 13:  // PortableActivationIDL/Locator/locateServerForORB

  /** locate server - returns all ports registered with a specified ORB for
	* an active server
	* Starts the server if it is not already running.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 12:  // PortableActivationIDL/Locator/locateServer

  /** locate server - returns the port with a specific type for all registered
	* ORBs of an active server.
	* Starts the server if it is not already running.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 11:  // PortableActivationIDL/Activator/lookupPOATemplate

  /** Find the server template that corresponds to the ORBD's
	* adapter id.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 10:  // PortableActivationIDL/Activator/getORBNames

  /** list all registered ORBs for a server
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 9:  // PortableActivationIDL/Activator/getActiveServers

  /** list active servers
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 8:  // PortableActivationIDL/Activator/uninstall

  /** Invoke the server uninstall hook.  If the server is not
	* currently running, this method will activate it.
	* After this hook completes, the server may still be running.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 7:  // PortableActivationIDL/Activator/install

  /** Invoke the server install hook.  If the server is not 
	* currently running, this method will activate it.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 6:  // PortableActivationIDL/Activator/shutdown

  /** If the server is running, shut it down
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 5:  // PortableActivationIDL/Activator/activate

  /** If the server is not running, start it up.  This is allowed
	* whether or not the server has been installed.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 4:  // PortableActivationIDL/Activator/poaDestroyed

  /** Called whenever a POA is destroyed.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 3:  // PortableActivationIDL/Activator/registerPOA

  /** Construct or find an ORBD object template corresponding to the 
	* server's object template and return it.  Called whenever a 
	* persistent POA is created.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 2:  // PortableActivationIDL/Activator/registerORB

  /** Called whenever an ORB instance is created.  This registers
	* the transport endpoints and the ORB proxy callback object.
	* Note that we cannot detect when an ORB shuts down, although
	* all of the POA shutdowns should still be reported.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 1:  // PortableActivationIDL/Activator/serverGoingDown

  /** A server is shutting down that was started by this activator.
	* Complete termination of the server is detected by the death of the
	* process implementing the server.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
       case 0:  // PortableActivationIDL/Activator/registerServer

  /** A new ORB started server registers itself with the Activator
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java
public abstract class _ServerManagerImplBase extends org.omg.CORBA.portable.ObjectImpl

/** Interface used to combine the Activator and Locator when both are
    * implemented together in the same process, as is currently the case
    * for our implementation.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java


/**
* com/sun/corba/se/PortableActivationIDL/_ServerManagerImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u45/3627/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Thursday, April 30, 2015 12:42:08 PM PDT
*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/activation/_ServerManagerImplBase.java
public abstract class _ServerManagerImplBase extends org.omg.CORBA.portable.ObjectImpl

/**
* com/sun/corba/se/spi/activation/_ServerManagerImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u45/3627/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, April 30, 2015 12:42:08 PM PDT
*/
