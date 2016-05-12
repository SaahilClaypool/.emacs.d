_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
    public synchronized void implicitActivation()

    /** Activate the POAManager if no explicit state change has ever been
     * previously invoked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
    // called from POA.find_POA before calling

/****************************************************************************
 * The following methods are used on the invocation path.
 ****************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
    public org.omg.PortableServer.POAManagerPackage.State get_state () {

    /**
     * Added according to the spec CORBA V2.3; this returns the
     * state of the POAManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
    public void deactivate(boolean etherealize_objects, boolean wait_for_completion)

    /**
     * <code>deactivate</code>
     * <b>Spec: pages 3-14 thru 3-18</b>
     * Note: INACTIVE is a permanent state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
    public synchronized void discard_requests(boolean wait_for_completion)

    /**
     * <code>discard_requests</code>
     * <b>Spec: pages 3-14 thru 3-18</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
    public synchronized void hold_requests(boolean wait_for_completion)

    /**
     * <code>hold_requests</code>
     * <b>Spec: pages 3-14 thru 3-18</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
    /**

/****************************************************************************
 * The following four public methods are used to change the POAManager's state.
 *
 * A note on the design of synchronization code:
 * There are 4 places where a thread would need to wait for a condition:
 *      - in hold_requests, discard_requests, deactivate, enter
 * There are 5 places where a thread notifies a condition:
 *      - in activate, hold_requests, discard_requests, deactivate, exit
 *
 * Since each notify needs to awaken waiters in several of the 4 places,
 * and since wait() in Java has the nice property of releasing the lock
 * on its monitor before sleeping, it seemed simplest to have just one
 * monitor object: "this". Thus all notifies will awaken all waiters.
 * On waking up, each waiter verifies that the condition it was waiting
 * for is satisfied, otherwise it goes back into a wait().
 *
 ****************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
public class POAManagerImpl extends org.omg.CORBA.LocalObject implements

/** POAManagerImpl is the implementation of the POAManager interface.
 *  Its public methods are activate(), hold_requests(), discard_requests()
 *  and deactivate().
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
    public synchronized void implicitActivation()

    /** Activate the POAManager if no explicit state change has ever been
     * previously invoked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
    // called from POA.find_POA before calling

/****************************************************************************
 * The following methods are used on the invocation path.
 ****************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
    public org.omg.PortableServer.POAManagerPackage.State get_state () {

    /**
     * Added according to the spec CORBA V2.3; this returns the
     * state of the POAManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
    public void deactivate(boolean etherealize_objects, boolean wait_for_completion)

    /**
     * <code>deactivate</code>
     * <b>Spec: pages 3-14 thru 3-18</b>
     * Note: INACTIVE is a permanent state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
    public synchronized void discard_requests(boolean wait_for_completion)

    /**
     * <code>discard_requests</code>
     * <b>Spec: pages 3-14 thru 3-18</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
    public synchronized void hold_requests(boolean wait_for_completion)

    /**
     * <code>hold_requests</code>
     * <b>Spec: pages 3-14 thru 3-18</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
    /**

/****************************************************************************
 * The following four public methods are used to change the POAManager's state.
 *
 * A note on the design of synchronization code:
 * There are 4 places where a thread would need to wait for a condition:
 *      - in hold_requests, discard_requests, deactivate, enter
 * There are 5 places where a thread notifies a condition:
 *      - in activate, hold_requests, discard_requests, deactivate, exit
 *
 * Since each notify needs to awaken waiters in several of the 4 places,
 * and since wait() in Java has the nice property of releasing the lock
 * on its monitor before sleeping, it seemed simplest to have just one
 * monitor object: "this". Thus all notifies will awaken all waiters.
 * On waking up, each waiter verifies that the condition it was waiting
 * for is satisfied, otherwise it goes back into a wait().
 *
 ****************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAManagerImpl.java
public class POAManagerImpl extends org.omg.CORBA.LocalObject implements

/** POAManagerImpl is the implementation of the POAManager interface.
 *  Its public methods are activate(), hold_requests(), discard_requests()
 *  and deactivate().
 */
