_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java
  org.omg.PortableInterceptor.ObjectReferenceTemplate lookupPOATemplate (String serverId, String orbId, String[] orbAdapterName);

  /** Find the server template that corresponds to the ORBD's
	* adapter id.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java
  String[] getORBNames (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered;

  /** list all registered ORBs for a server
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java
  String[] getActiveServers ();

  /** list active servers
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java
  void uninstall (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.ServerHeldDown, com.sun.corba.se.PortableActivationIDL.ServerAlreadyUninstalled;

  /** Invoke the server uninstall hook.  If the server is not
	* currently running, this method will activate it.
	* After this hook completes, the server may still be running.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java
  void install (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.ServerHeldDown, com.sun.corba.se.PortableActivationIDL.ServerAlreadyInstalled;

  /** Invoke the server install hook.  If the server is not 
	* currently running, this method will activate it.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java
  void shutdown (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotActive, com.sun.corba.se.PortableActivationIDL.ServerNotRegistered;

  /** If the server is running, shut it down
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java
  void activate (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerAlreadyActive, com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.ServerHeldDown;

  /** If the server is not running, start it up.  This is allowed
	* whether or not the server has been installed.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java
  void poaDestroyed (String serverId, String orbId, org.omg.PortableInterceptor.ObjectReferenceTemplate poaTemplate);

  /** Called whenever a POA is destroyed.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java
  org.omg.PortableInterceptor.ObjectReferenceTemplate registerPOA (String serverId, String orbId, org.omg.PortableInterceptor.ObjectReferenceTemplate poaTemplate);

  /** Construct or find an ORBD object template corresponding to the 
	* server's object template and return it.  Called whenever a 
	* persistent POA is created.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java
  void registerORB (String serverId, String orbId, com.sun.corba.se.PortableActivationIDL.ORBProxy orb, com.sun.corba.se.PortableActivationIDL.EndPointInfo[] endPointInfo) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.NoSuchEndPoint, com.sun.corba.se.PortableActivationIDL.ORBAlreadyRegistered;

  /** Called whenever an ORB instance is created.  This registers
	* the transport endpoints and the ORB proxy callback object.
	* Note that we cannot detect when an ORB shuts down, although
	* all of the POA shutdowns should still be reported.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java
  void serverGoingDown (String serverId);

  /** A server is shutting down that was started by this activator.
	* Complete termination of the server is detected by the death of the
	* process implementing the server.
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java
  void registerServer (String serverId, com.sun.corba.se.PortableActivationIDL.ServerProxy serverObj) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered;

  /** A new ORB started server registers itself with the Activator
	*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java


/**
* com/sun/corba/se/PortableActivationIDL/ActivatorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u45/3627/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Thursday, April 30, 2015 12:42:08 PM PDT
*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/activation/ActivatorOperations.java
public interface ActivatorOperations 

/**
* com/sun/corba/se/spi/activation/ActivatorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u45/3627/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, April 30, 2015 12:42:08 PM PDT
*/
