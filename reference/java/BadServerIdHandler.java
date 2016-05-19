_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/BadServerIdHandler.java
public interface BadServerIdHandler

/**
 * The bad server id handler is used to locate persistent objects.
 * The Locator object registers the BadServerIdHandler with the ORB
 * and when requests for persistent objects for servers (other than
 * itself) comes, it throws a ForwardException with the IOR pointing
 * to the active server.
 */
