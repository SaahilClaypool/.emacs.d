_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Tie.java
    java.rmi.Remote getTarget();

    /**
     * Returns the target for this tie.
     * @return the target.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Tie.java
    void setTarget(java.rmi.Remote target);

    /**
     * Called by {@link Util#registerTarget} to set the target
     * for this tie.
     * @param target the object to use as the target for this tie.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Tie.java
    void orb(ORB orb);

    /**
     * Sets the ORB for this tie.
     * @param orb the ORB.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Tie.java
    ORB orb();

    /**
     * Returns the ORB for this tie.
     * @return the ORB.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Tie.java
    void deactivate() throws java.rmi.NoSuchObjectException;

    /**
     * Deactivates the target object represented by this tie.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Tie.java
public interface Tie extends org.omg.CORBA.portable.InvokeHandler {

/**
 * Defines methods which all RMI-IIOP server side ties must implement.
 */
