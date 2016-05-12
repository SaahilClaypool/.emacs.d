_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/extension/ServantCachingPolicy.java
    public synchronized static ServantCachingPolicy getPolicy()

    /** Return the default servant caching policy.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/extension/ServantCachingPolicy.java
    public static final int MINIMAL_SEMANTICS = 3 ;

    /** Perform servant caching, not preserving POA current or POA destroy semantics.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/extension/ServantCachingPolicy.java
    public static final int INFO_ONLY_SEMANTICS =  2 ;

    /** Perform servant caching, preservent only POA current semantics.
    * At least this level is required in order to support selection of ObjectCopiers
    * for co-located RMI-IIOP calls, as the current copier is stored in
    * OAInvocationInfo, which must be present on the stack inside the call.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/extension/ServantCachingPolicy.java
    public static final int FULL_SEMANTICS = 1 ;

    /** Perform servant caching, preserving POA current and POA destroy semantics.
    * We will use this as the new default, as the app server is making heavier use
    * now of POA facilities.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/extension/ServantCachingPolicy.java
    public static final int NO_SERVANT_CACHING = 0 ;

    /** Do not cache servants in the ClientRequestDispatcher.  This will
     * always support the full POA semantics, including changing the
     * servant that handles requests on a particular objref.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/extension/ServantCachingPolicy.java
public class ServantCachingPolicy extends LocalObject implements Policy

/** Policy used to implement servant caching optimization in the POA.
* Creating a POA with an instance pol of this policy where
* pol.getType() &gt; NO_SERVANT_CACHING will cause the servant to be
* looked up in the POA and cached in the LocalClientRequestDispatcher when
* the ClientRequestDispatcher is colocated with the implementation of the
* objref.  This greatly speeds up invocations at the cost of violating the
* POA semantics.  In particular, every request to a particular objref
* must be handled by the same servant.  Note that this is typically the
* case for EJB implementations.
* <p>
* If servant caching is used, there are two different additional
* features of the POA that are expensive:
* <ol>
* <li>POA current semantics
* <li>Proper handling of POA destroy.
* <ol>
* POA current semantics requires maintaining a ThreadLocal stack of
* invocation information that is always available for POACurrent operations.
* Maintaining this stack is expensive on the timescale of optimized co-located
* calls, so the option is provided to turn it off.  Similarly, causing
* POA.destroy() calls to wait for all active calls in the POA to complete
* requires careful tracking of the entry and exit of invocations in the POA.
* Again, tracking this is somewhat expensive.
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/extension/ServantCachingPolicy.java
    public synchronized static ServantCachingPolicy getPolicy()

    /** Return the default servant caching policy.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/extension/ServantCachingPolicy.java
    public static final int MINIMAL_SEMANTICS = 3 ;

    /** Perform servant caching, not preserving POA current or POA destroy semantics.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/extension/ServantCachingPolicy.java
    public static final int INFO_ONLY_SEMANTICS =  2 ;

    /** Perform servant caching, preservent only POA current semantics.
    * At least this level is required in order to support selection of ObjectCopiers
    * for co-located RMI-IIOP calls, as the current copier is stored in
    * OAInvocationInfo, which must be present on the stack inside the call.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/extension/ServantCachingPolicy.java
    public static final int FULL_SEMANTICS = 1 ;

    /** Perform servant caching, preserving POA current and POA destroy semantics.
    * We will use this as the new default, as the app server is making heavier use
    * now of POA facilities.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/extension/ServantCachingPolicy.java
    public static final int NO_SERVANT_CACHING = 0 ;

    /** Do not cache servants in the ClientRequestDispatcher.  This will
     * always support the full POA semantics, including changing the
     * servant that handles requests on a particular objref.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/extension/ServantCachingPolicy.java
public class ServantCachingPolicy extends LocalObject implements Policy

/** Policy used to implement servant caching optimization in the POA.
* Creating a POA with an instance pol of this policy where
* pol.getType() &gt; NO_SERVANT_CACHING will cause the servant to be
* looked up in the POA and cached in the LocalClientRequestDispatcher when
* the ClientRequestDispatcher is colocated with the implementation of the
* objref.  This greatly speeds up invocations at the cost of violating the
* POA semantics.  In particular, every request to a particular objref
* must be handled by the same servant.  Note that this is typically the
* case for EJB implementations.
* <p>
* If servant caching is used, there are two different additional
* features of the POA that are expensive:
* <ol>
* <li>POA current semantics
* <li>Proper handling of POA destroy.
* <ol>
* POA current semantics requires maintaining a ThreadLocal stack of
* invocation information that is always available for POACurrent operations.
* Maintaining this stack is expensive on the timescale of optimized co-located
* calls, so the option is provided to turn it off.  Similarly, causing
* POA.destroy() calls to wait for all active calls in the POA to complete
* requires careful tracking of the entry and exit of invocations in the POA.
* Again, tracking this is somewhat expensive.
*/
