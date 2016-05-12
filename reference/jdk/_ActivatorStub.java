_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public org.omg.PortableInterceptor.ObjectReferenceTemplate lookupPOATemplate (String serverId, String orbId, String[] orbAdapterName)

  /** Find the server template that corresponds to the ORBD's
	* adapter id.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public String[] getORBNames (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered

  /** list all registered ORBs for a server
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public String[] getActiveServers ()

  /** list active servers
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void uninstall (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.ServerHeldDown, com.sun.corba.se.PortableActivationIDL.ServerAlreadyUninstalled

  /** Invoke the server uninstall hook.  If the server is not
	* currently running, this method will activate it.
	* After this hook completes, the server may still be running.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void install (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.ServerHeldDown, com.sun.corba.se.PortableActivationIDL.ServerAlreadyInstalled

  /** Invoke the server install hook.  If the server is not 
	* currently running, this method will activate it.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void shutdown (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotActive, com.sun.corba.se.PortableActivationIDL.ServerNotRegistered

  /** If the server is running, shut it down
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void activate (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerAlreadyActive, com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.ServerHeldDown

  /** If the server is not running, start it up.  This is allowed
	* whether or not the server has been installed.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void poaDestroyed (String serverId, String orbId, org.omg.PortableInterceptor.ObjectReferenceTemplate poaTemplate)

  /** Called whenever a POA is destroyed.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public org.omg.PortableInterceptor.ObjectReferenceTemplate registerPOA (String serverId, String orbId, org.omg.PortableInterceptor.ObjectReferenceTemplate poaTemplate)

  /** Construct or find an ORBD object template corresponding to the 
	* server's object template and return it.  Called whenever a 
	* persistent POA is created.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void registerORB (String serverId, String orbId, com.sun.corba.se.PortableActivationIDL.ORBProxy orb, com.sun.corba.se.PortableActivationIDL.EndPointInfo[] endPointInfo) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.NoSuchEndPoint, com.sun.corba.se.PortableActivationIDL.ORBAlreadyRegistered

  /** Called whenever an ORB instance is created.  This registers
	* the transport endpoints and the ORB proxy callback object.
	* Note that we cannot detect when an ORB shuts down, although
	* all of the POA shutdowns should still be reported.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void serverGoingDown (String serverId)

  /** A server is shutting down that was started by this activator.
	* Complete termination of the server is detected by the death of the
	* process implementing the server.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void registerServer (String serverId, com.sun.corba.se.PortableActivationIDL.ServerProxy serverObj) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered

  /** A new ORB started server registers itself with the Activator
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java


/**
* com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/activation/_ActivatorStub.java
public class _ActivatorStub extends org.omg.CORBA.portable.ObjectImpl implements com.sun.corba.se.spi.activation.Activator

/**
* com/sun/corba/se/spi/activation/_ActivatorStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public org.omg.PortableInterceptor.ObjectReferenceTemplate lookupPOATemplate (String serverId, String orbId, String[] orbAdapterName)

  /** Find the server template that corresponds to the ORBD's
	* adapter id.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public String[] getORBNames (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered

  /** list all registered ORBs for a server
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public String[] getActiveServers ()

  /** list active servers
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void uninstall (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.ServerHeldDown, com.sun.corba.se.PortableActivationIDL.ServerAlreadyUninstalled

  /** Invoke the server uninstall hook.  If the server is not
	* currently running, this method will activate it.
	* After this hook completes, the server may still be running.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void install (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.ServerHeldDown, com.sun.corba.se.PortableActivationIDL.ServerAlreadyInstalled

  /** Invoke the server install hook.  If the server is not 
	* currently running, this method will activate it.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void shutdown (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerNotActive, com.sun.corba.se.PortableActivationIDL.ServerNotRegistered

  /** If the server is running, shut it down
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void activate (String serverId) throws com.sun.corba.se.PortableActivationIDL.ServerAlreadyActive, com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.ServerHeldDown

  /** If the server is not running, start it up.  This is allowed
	* whether or not the server has been installed.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void poaDestroyed (String serverId, String orbId, org.omg.PortableInterceptor.ObjectReferenceTemplate poaTemplate)

  /** Called whenever a POA is destroyed.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public org.omg.PortableInterceptor.ObjectReferenceTemplate registerPOA (String serverId, String orbId, org.omg.PortableInterceptor.ObjectReferenceTemplate poaTemplate)

  /** Construct or find an ORBD object template corresponding to the 
	* server's object template and return it.  Called whenever a 
	* persistent POA is created.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void registerORB (String serverId, String orbId, com.sun.corba.se.PortableActivationIDL.ORBProxy orb, com.sun.corba.se.PortableActivationIDL.EndPointInfo[] endPointInfo) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered, com.sun.corba.se.PortableActivationIDL.NoSuchEndPoint, com.sun.corba.se.PortableActivationIDL.ORBAlreadyRegistered

  /** Called whenever an ORB instance is created.  This registers
	* the transport endpoints and the ORB proxy callback object.
	* Note that we cannot detect when an ORB shuts down, although
	* all of the POA shutdowns should still be reported.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void serverGoingDown (String serverId)

  /** A server is shutting down that was started by this activator.
	* Complete termination of the server is detected by the death of the
	* process implementing the server.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java
  public void registerServer (String serverId, com.sun.corba.se.PortableActivationIDL.ServerProxy serverObj) throws com.sun.corba.se.PortableActivationIDL.ServerNotRegistered

  /** A new ORB started server registers itself with the Activator
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java


/**
* com/sun/corba/se/PortableActivationIDL/_ActivatorStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/activation/_ActivatorStub.java
public class _ActivatorStub extends org.omg.CORBA.portable.ObjectImpl implements com.sun.corba.se.spi.activation.Activator

/**
* com/sun/corba/se/spi/activation/_ActivatorStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/
