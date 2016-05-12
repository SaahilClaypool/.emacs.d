_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/protocol/CorbaServerRequestDispatcherImpl.java
    protected boolean processCodeSetContext(
        CorbaMessageMediator request, ServiceContexts contexts)

    /**
     * Handles setting the connection's code sets if required.
     * Returns true if the CodeSetContext was in the request, false
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/protocol/CorbaServerRequestDispatcherImpl.java
    protected CorbaMessageMediator sendingReply(CorbaMessageMediator req, Any excany)

    /** Must always be called, just after the servant's method returns.
     *  Creates the ReplyMessage header and puts in the transaction context
     *  if necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/protocol/CorbaServerRequestDispatcherImpl.java
    protected void handleNullServant(String operation, NullServant nserv )

    /** Always throws OBJECT_NOT_EXIST if operation is not a special method.
    * If operation is _non_existent or _not_existent, this will just
    * return without performing any action, so that _non_existent can return
    * false.  Always throws OBJECT_NOT_EXIST for any other special method.
    * Update for issue 4385.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/protocol/CorbaServerRequestDispatcherImpl.java
    public IOR locate(ObjectKey okey)

    /** XXX/REVISIT:
     * We do not want to look for a servant in the POA/ServantManager case,
     * but we could in most other cases.  The OA could have a method that
     * returns true if the servant MAY exist, and false only if the servant
     * definitely DOES NOT exist.
     *
     * XXX/REVISIT:
     * We may wish to indicate OBJECT_HERE by some mechanism other than
     * returning a null result.
     *
     * Called from ORB.locate when a LocateRequest arrives.
     * Result is not always absolutely correct: may indicate OBJECT_HERE
     * for non-existent objects, which is resolved on invocation.  This
     * "bug" is unavoidable, since in general the object may be destroyed
     * between a locate and a request.  Note that this only checks that
     * the appropriate ObjectAdapter is available, not that the servant
     * actually exists.
     * Need to signal one of OBJECT_HERE, OBJECT_FORWARD, OBJECT_NOT_EXIST.
     * @return Result is null if object is (possibly) implemented here, otherwise
     * an IOR indicating objref to forward the request to.
     * @exception OBJECT_NOT_EXIST is thrown if we know the object does not
     * exist here, and we are not forwarding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/protocol/CorbaServerRequestDispatcherImpl.java
    protected boolean processCodeSetContext(
        CorbaMessageMediator request, ServiceContexts contexts)

    /**
     * Handles setting the connection's code sets if required.
     * Returns true if the CodeSetContext was in the request, false
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/protocol/CorbaServerRequestDispatcherImpl.java
    protected CorbaMessageMediator sendingReply(CorbaMessageMediator req, Any excany)

    /** Must always be called, just after the servant's method returns.
     *  Creates the ReplyMessage header and puts in the transaction context
     *  if necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/protocol/CorbaServerRequestDispatcherImpl.java
    protected void handleNullServant(String operation, NullServant nserv )

    /** Always throws OBJECT_NOT_EXIST if operation is not a special method.
    * If operation is _non_existent or _not_existent, this will just
    * return without performing any action, so that _non_existent can return
    * false.  Always throws OBJECT_NOT_EXIST for any other special method.
    * Update for issue 4385.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/protocol/CorbaServerRequestDispatcherImpl.java
    public IOR locate(ObjectKey okey)

    /** XXX/REVISIT:
     * We do not want to look for a servant in the POA/ServantManager case,
     * but we could in most other cases.  The OA could have a method that
     * returns true if the servant MAY exist, and false only if the servant
     * definitely DOES NOT exist.
     *
     * XXX/REVISIT:
     * We may wish to indicate OBJECT_HERE by some mechanism other than
     * returning a null result.
     *
     * Called from ORB.locate when a LocateRequest arrives.
     * Result is not always absolutely correct: may indicate OBJECT_HERE
     * for non-existent objects, which is resolved on invocation.  This
     * "bug" is unavoidable, since in general the object may be destroyed
     * between a locate and a request.  Note that this only checks that
     * the appropriate ObjectAdapter is available, not that the servant
     * actually exists.
     * Need to signal one of OBJECT_HERE, OBJECT_FORWARD, OBJECT_NOT_EXIST.
     * @return Result is null if object is (possibly) implemented here, otherwise
     * an IOR indicating objref to forward the request to.
     * @exception OBJECT_NOT_EXIST is thrown if we know the object does not
     * exist here, and we are not forwarding.
     */
