_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public void returnServant()

    //***************************************************************
    //Implementation of ObjectAdapter interface
    //***************************************************************

    public Policy getEffectivePolicy( int type )
    {
        return mediator.getPolicies().get_effective_policy( type ) ;
    }

    public int getManagerId()
    {
        return manager.getManagerId() ;
    }

    public short getState()
    {
        return manager.getORTState() ;
    }

    public String[] getInterfaces( java.lang.Object servant, byte[] objectId )
    {
        Servant serv = (Servant)servant ;
        return serv._all_interfaces( this, objectId ) ;
    }

    protected ObjectCopierFactory getObjectCopierFactory()
    {
        int copierId = mediator.getPolicies().getCopierId() ;
        CopierManager cm = getORB().getCopierManager() ;
        return cm.getObjectCopierFactory( copierId ) ;
    }

    public void enter() throws OADestroyed
    {
        try {
            lock() ;

            if (debug) {
                ORBUtility.dprint( this, "Calling enter on poa " + this ) ;
            }

            // Avoid deadlock if this is the thread that is processing the
            // POA.destroy because this is the only thread that can notify
            // waiters on beingDestroyedCV.  This can happen if an
            // etherealize upcall invokes a method on a colocated object
            // served by this POA.
            while ((state == STATE_DESTROYING) &&
                (isDestroying.get() == Boolean.FALSE)) {
                try {
                    beingDestroyedCV.await();
                } catch (InterruptedException ex) {
                    // NO-OP
                }
            }

            if (!waitUntilRunning())
                throw new OADestroyed() ;

            invocationCount++;
        } finally {
            if (debug) {
                ORBUtility.dprint( this, "Exiting enter on poa " + this ) ;
            }

            unlock() ;
        }

        manager.enter();
    }

    public void exit()
    {
        try {
            lock() ;

            if (debug) {
                ORBUtility.dprint( this, "Calling exit on poa " + this ) ;
            }

            invocationCount--;

            if ((invocationCount == 0) && (state == STATE_DESTROYING)) {
                invokeCV.broadcast();
            }
        } finally {
            if (debug) {
                ORBUtility.dprint( this, "Exiting exit on poa " + this ) ;
            }

            unlock() ;
        }

        manager.exit();
    }

    public void getInvocationServant( OAInvocationInfo info )
    {
        try {
            lock() ;

            if (debug) {
                ORBUtility.dprint( this,
                    "Calling getInvocationServant on poa " + this ) ;
            }

            java.lang.Object servant = null ;

            try {
                servant = mediator.getInvocationServant( info.id(),
                    info.getOperation() );
            } catch (ForwardRequest freq) {
                throw new ForwardException( getORB(), freq.forward_reference ) ;
            }

            info.setServant( servant ) ;
        } finally {
            if (debug) {
                ORBUtility.dprint( this,
                    "Exiting getInvocationServant on poa " + this ) ;
            }

            unlock() ;
        }
    }

    public org.omg.CORBA.Object getLocalServant( byte[] objectId )
    {
        return null ;
    }

    /** Called from the subcontract to let this POA cleanup after an
     *  invocation. Note: If getServant was called, then returnServant
     *  MUST be called, even in the case of exceptions.  This may be
     *  called multiple times for a single request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public byte[] id()

    /**
     * <code>id</code>
     * <b>11.3.8.26 in ptc/00-08-06</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public org.omg.CORBA.Object id_to_reference(byte[] id)

    /**
     * <code>id_to_reference</code>
     * <b>3.3.8.24</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public Servant id_to_servant(byte[] id)

    /**
     * <code>id_to_servant</code>
     * <b>3.3.8.23</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public byte[] reference_to_id(org.omg.CORBA.Object reference)

    /**
     * <code>reference_to_id</code>
     * <b>3.3.8.22</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public Servant reference_to_servant(org.omg.CORBA.Object reference)

    /**
     * <code>reference_to_servant</code>
     * <b>3.3.8.21</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public org.omg.CORBA.Object servant_to_reference(Servant servant)

    /**
     * <code>servant_to_reference</code>
     * <b>3.3.8.20</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public byte[] servant_to_id(Servant servant)

    /**
     * <code>servant_to_id</code>
     * <b>3.3.8.19</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public org.omg.CORBA.Object

    /**
     * <code>create_reference_with_id</code>
     * <b>3.3.8.18</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public org.omg.CORBA.Object create_reference(String repId)

    /**
     * <code>create_reference</code>
     * <b>3.3.8.17</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public void deactivate_object(byte[] id)

    /**
     * <code>deactivate_object</code>
     * <b>3.3.8.16</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public void activate_object_with_id(byte[] id,
                                                     Servant servant)

    /**
     * <code>activate_object_with_id</code>
     * <b>Section 3.3.8.15</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public byte[] activate_object(Servant servant)

    /**
     * <code>activate_object</code>
     * <b>Section 3.3.8.14</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public void set_servant(Servant defaultServant)

    /**
     * <code>set_servant</code>
     * <b>Section 3.3.8.13</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public Servant get_servant() throws NoServant, WrongPolicy

    /**
     * <code>get_servant</code>
     * <b>Section 3.3.8.12</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public void set_servant_manager(ServantManager servantManager)

    /**
     * <code>set_servant_manager</code>
     * <b>Section 3.3.8.10</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public ServantManager get_servant_manager() throws WrongPolicy

    /**
     * <code>get_servant_manager</code>
     * <b>Section 3.3.8.10</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public void the_activator(AdapterActivator activator)

    /**
     * <code>the_activator</code>
     * <b>Section 3.3.8.9</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public AdapterActivator the_activator()

    /**
     * <code>the_activator</code>
     * <b>Section 3.3.8.9</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public POAManager the_POAManager()

    /**
     * <code>the_POAManager</code>
     * <b>Section 3.3.8.8</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public org.omg.PortableServer.POA[] the_children()

    /**
     * <code>the_children</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public POA the_parent()

    /**
     * <code>the_parent</code>
     * <b>Section 3.3.8.7</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public String the_name()

    /**
     * <code>the_name</code>
     * <b>Section 3.3.8.6</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public RequestProcessingPolicy create_request_processing_policy(
        RequestProcessingPolicyValue value)

    /**
     * <code>create_request_processing_policy</code>
     * <b>Section 3.3.8.5</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public ServantRetentionPolicy create_servant_retention_policy(
        ServantRetentionPolicyValue value)

    /**
     * <code>create_servant_retention_policy</code>
     * <b>Section 3.3.8.5</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public ImplicitActivationPolicy create_implicit_activation_policy(
        ImplicitActivationPolicyValue value)

    /**
     * <code>create_implicit_activation_policy</code>
     * <b>Section 3.3.8.5</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public IdAssignmentPolicy create_id_assignment_policy(
        IdAssignmentPolicyValue value)

    /**
     * <code>create_id_assignment_policy</code>
     * <b>Section 3.3.8.5</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public IdUniquenessPolicy create_id_uniqueness_policy(
        IdUniquenessPolicyValue value)

    /**
     * <code>create_id_uniqueness_policy</code>
     * <b>Section 3.3.8.5</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public LifespanPolicy create_lifespan_policy(
        LifespanPolicyValue value)

    /**
     * <code>create_lifespan_policy</code>
     * <b>Section 3.3.8.5</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public ThreadPolicy create_thread_policy(
        ThreadPolicyValue value)

    /**
     * <code>create_thread_policy</code>
     * <b>Section 3.3.8.5</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public void destroy(boolean etherealize, boolean wait_for_completion)

    /**
     * <code>destroy</code>
     * <b>Section 3.3.8.4</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public POA find_POA(String name, boolean activate)

    /**
     * <code>find_POA</code>
     * <b>Section 3.3.8.3</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public POA create_POA(String name, POAManager
        theManager, Policy[] policies) throws AdapterAlreadyExists,

 //*******************************************************************
 // Public POA API
 //*******************************************************************

    /**
     * <code>create_POA</code>
     * <b>Section 3.3.8.2</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
public class POAImpl extends ObjectAdapterBase implements POA

/**
 * POAImpl is the implementation of the Portable Object Adapter. It
 * contains an implementation of the POA interfaces specified in
 * COBRA 2.3.1 chapter 11 (formal/99-10-07).  This implementation
 * is moving to comply with CORBA 3.0 due to the many clarifications
 * that have been made to the POA semantics since CORBA 2.3.1.
 * Specific comments have been added where 3.0 applies, but note that
 * we do not have the new 3.0 APIs yet.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public void returnServant()

    //***************************************************************
    //Implementation of ObjectAdapter interface
    //***************************************************************

    public Policy getEffectivePolicy( int type )
    {
        return mediator.getPolicies().get_effective_policy( type ) ;
    }

    public int getManagerId()
    {
        return manager.getManagerId() ;
    }

    public short getState()
    {
        return manager.getORTState() ;
    }

    public String[] getInterfaces( java.lang.Object servant, byte[] objectId )
    {
        Servant serv = (Servant)servant ;
        return serv._all_interfaces( this, objectId ) ;
    }

    protected ObjectCopierFactory getObjectCopierFactory()
    {
        int copierId = mediator.getPolicies().getCopierId() ;
        CopierManager cm = getORB().getCopierManager() ;
        return cm.getObjectCopierFactory( copierId ) ;
    }

    public void enter() throws OADestroyed
    {
        try {
            lock() ;

            if (debug) {
                ORBUtility.dprint( this, "Calling enter on poa " + this ) ;
            }

            // Avoid deadlock if this is the thread that is processing the
            // POA.destroy because this is the only thread that can notify
            // waiters on beingDestroyedCV.  This can happen if an
            // etherealize upcall invokes a method on a colocated object
            // served by this POA.
            while ((state == STATE_DESTROYING) &&
                (isDestroying.get() == Boolean.FALSE)) {
                try {
                    beingDestroyedCV.await();
                } catch (InterruptedException ex) {
                    // NO-OP
                }
            }

            if (!waitUntilRunning())
                throw new OADestroyed() ;

            invocationCount++;
        } finally {
            if (debug) {
                ORBUtility.dprint( this, "Exiting enter on poa " + this ) ;
            }

            unlock() ;
        }

        manager.enter();
    }

    public void exit()
    {
        try {
            lock() ;

            if (debug) {
                ORBUtility.dprint( this, "Calling exit on poa " + this ) ;
            }

            invocationCount--;

            if ((invocationCount == 0) && (state == STATE_DESTROYING)) {
                invokeCV.broadcast();
            }
        } finally {
            if (debug) {
                ORBUtility.dprint( this, "Exiting exit on poa " + this ) ;
            }

            unlock() ;
        }

        manager.exit();
    }

    public void getInvocationServant( OAInvocationInfo info )
    {
        try {
            lock() ;

            if (debug) {
                ORBUtility.dprint( this,
                    "Calling getInvocationServant on poa " + this ) ;
            }

            java.lang.Object servant = null ;

            try {
                servant = mediator.getInvocationServant( info.id(),
                    info.getOperation() );
            } catch (ForwardRequest freq) {
                throw new ForwardException( getORB(), freq.forward_reference ) ;
            }

            info.setServant( servant ) ;
        } finally {
            if (debug) {
                ORBUtility.dprint( this,
                    "Exiting getInvocationServant on poa " + this ) ;
            }

            unlock() ;
        }
    }

    public org.omg.CORBA.Object getLocalServant( byte[] objectId )
    {
        return null ;
    }

    /** Called from the subcontract to let this POA cleanup after an
     *  invocation. Note: If getServant was called, then returnServant
     *  MUST be called, even in the case of exceptions.  This may be
     *  called multiple times for a single request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public byte[] id()

    /**
     * <code>id</code>
     * <b>11.3.8.26 in ptc/00-08-06</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public org.omg.CORBA.Object id_to_reference(byte[] id)

    /**
     * <code>id_to_reference</code>
     * <b>3.3.8.24</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public Servant id_to_servant(byte[] id)

    /**
     * <code>id_to_servant</code>
     * <b>3.3.8.23</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public byte[] reference_to_id(org.omg.CORBA.Object reference)

    /**
     * <code>reference_to_id</code>
     * <b>3.3.8.22</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public Servant reference_to_servant(org.omg.CORBA.Object reference)

    /**
     * <code>reference_to_servant</code>
     * <b>3.3.8.21</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public org.omg.CORBA.Object servant_to_reference(Servant servant)

    /**
     * <code>servant_to_reference</code>
     * <b>3.3.8.20</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public byte[] servant_to_id(Servant servant)

    /**
     * <code>servant_to_id</code>
     * <b>3.3.8.19</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public org.omg.CORBA.Object

    /**
     * <code>create_reference_with_id</code>
     * <b>3.3.8.18</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public org.omg.CORBA.Object create_reference(String repId)

    /**
     * <code>create_reference</code>
     * <b>3.3.8.17</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public void deactivate_object(byte[] id)

    /**
     * <code>deactivate_object</code>
     * <b>3.3.8.16</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public void activate_object_with_id(byte[] id,
                                                     Servant servant)

    /**
     * <code>activate_object_with_id</code>
     * <b>Section 3.3.8.15</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public byte[] activate_object(Servant servant)

    /**
     * <code>activate_object</code>
     * <b>Section 3.3.8.14</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public void set_servant(Servant defaultServant)

    /**
     * <code>set_servant</code>
     * <b>Section 3.3.8.13</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public Servant get_servant() throws NoServant, WrongPolicy

    /**
     * <code>get_servant</code>
     * <b>Section 3.3.8.12</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public void set_servant_manager(ServantManager servantManager)

    /**
     * <code>set_servant_manager</code>
     * <b>Section 3.3.8.10</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public ServantManager get_servant_manager() throws WrongPolicy

    /**
     * <code>get_servant_manager</code>
     * <b>Section 3.3.8.10</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public void the_activator(AdapterActivator activator)

    /**
     * <code>the_activator</code>
     * <b>Section 3.3.8.9</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public AdapterActivator the_activator()

    /**
     * <code>the_activator</code>
     * <b>Section 3.3.8.9</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public POAManager the_POAManager()

    /**
     * <code>the_POAManager</code>
     * <b>Section 3.3.8.8</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public org.omg.PortableServer.POA[] the_children()

    /**
     * <code>the_children</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public POA the_parent()

    /**
     * <code>the_parent</code>
     * <b>Section 3.3.8.7</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public String the_name()

    /**
     * <code>the_name</code>
     * <b>Section 3.3.8.6</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public RequestProcessingPolicy create_request_processing_policy(
        RequestProcessingPolicyValue value)

    /**
     * <code>create_request_processing_policy</code>
     * <b>Section 3.3.8.5</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public ServantRetentionPolicy create_servant_retention_policy(
        ServantRetentionPolicyValue value)

    /**
     * <code>create_servant_retention_policy</code>
     * <b>Section 3.3.8.5</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public ImplicitActivationPolicy create_implicit_activation_policy(
        ImplicitActivationPolicyValue value)

    /**
     * <code>create_implicit_activation_policy</code>
     * <b>Section 3.3.8.5</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public IdAssignmentPolicy create_id_assignment_policy(
        IdAssignmentPolicyValue value)

    /**
     * <code>create_id_assignment_policy</code>
     * <b>Section 3.3.8.5</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public IdUniquenessPolicy create_id_uniqueness_policy(
        IdUniquenessPolicyValue value)

    /**
     * <code>create_id_uniqueness_policy</code>
     * <b>Section 3.3.8.5</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public LifespanPolicy create_lifespan_policy(
        LifespanPolicyValue value)

    /**
     * <code>create_lifespan_policy</code>
     * <b>Section 3.3.8.5</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public ThreadPolicy create_thread_policy(
        ThreadPolicyValue value)

    /**
     * <code>create_thread_policy</code>
     * <b>Section 3.3.8.5</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public void destroy(boolean etherealize, boolean wait_for_completion)

    /**
     * <code>destroy</code>
     * <b>Section 3.3.8.4</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public POA find_POA(String name, boolean activate)

    /**
     * <code>find_POA</code>
     * <b>Section 3.3.8.3</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
    public POA create_POA(String name, POAManager
        theManager, Policy[] policies) throws AdapterAlreadyExists,

 //*******************************************************************
 // Public POA API
 //*******************************************************************

    /**
     * <code>create_POA</code>
     * <b>Section 3.3.8.2</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/poa/POAImpl.java
public class POAImpl extends ObjectAdapterBase implements POA

/**
 * POAImpl is the implementation of the Portable Object Adapter. It
 * contains an implementation of the POA interfaces specified in
 * COBRA 2.3.1 chapter 11 (formal/99-10-07).  This implementation
 * is moving to comply with CORBA 3.0 due to the many clarifications
 * that have been made to the POA semantics since CORBA 2.3.1.
 * Specific comments have been added where 3.0 applies, but note that
 * we do not have the new 3.0 APIs yet.
 */
