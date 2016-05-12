_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public org.omg.CORBA.Object resolve_str(String sn)

    /**
     * This operation resolves the Stringified name into the object
     * reference.
     * @param sn Stringified Name of the object <p>
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound
     * Indicates there is no object reference for the given name. <p>
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed
     * Indicates that the given compound name is incorrect <p>
     * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
     * Indicates the name does not identify a binding.<p>
     * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound
     * Indicates the name is already bound.<p>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public String to_url(String addr, String sn)

   /**
    * This operation creates a URL based "iiopname://" format name
    * from the Stringified Name of the object.
    * @param addr internet based address of the host machine where
    * Name Service is running <p>
    * @param sn Stringified Name of the object <p>
    * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
    * Indicates the name does not identify a binding.<p>
    * @exception org.omg.CosNaming.NamingContextPackage.InvalidAddress
    * Indicates the internet based address of the host machine is
    * incorrect <p>
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public org.omg.CosNaming.NameComponent[] to_name(String sn)

   /**
    * This operation  converts a Stringified Name into an  equivalent array
    * of Name Components.
    * @param sn Stringified Name of the object <p>
    * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
    * Indicates the name does not identify a binding.<p>
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public String to_string(org.omg.CosNaming.NameComponent[] n)

   /**
    * This operation creates a stringified name from the array of Name
    * components.
    * @param n Name of the object <p>
    * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
    * Indicates the name does not identify a binding.<p>
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    protected static NamingContext resolveFirstAsContext(NamingContextDataStore impl,
                                                         NameComponent[] n)

    /**
   * Implements resolving a NameComponent in this context and
   * narrowing it to CosNaming::NamingContext. It will throw appropriate
   * exceptions if not found or not narrowable.
   * @param impl an implementation of NamingContextDataStore
   * @param n a NameComponents which is the name to be found.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound The
   * first component could not be resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the first component of the supplied name.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see resolve
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public static void doUnbind(NamingContextDataStore impl,
                                NameComponent[] n)

    /**
   * Implements unbinding bound names in this NamingContext. If the
   * name contains only one component, the name is unbound in this
   * NamingContext using Unbind(). Otherwise, the first component
   * of the name is resolved in this NamingContext and
   * unbind passed to the resulting NamingContext.
   * This method is static for maximal reuse - even for extended naming
   * context implementations where the recursive semantics still apply.
   * @param impl an implementation of NamingContextDataStore
   * @param n a sequence of NameComponents which is the name to be unbound.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see resolve
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public static org.omg.CORBA.Object doResolve(NamingContextDataStore impl,
                                                 NameComponent[] n)

    /**
   * Implements resolving names in this NamingContext. The first component
   * of the supplied name is resolved in this NamingContext by calling
   * Resolve(). If there are no more components in the name, the
   * resulting object reference is returned. Otherwise, the resulting object
   * reference must have been bound as a context and be narrowable to
   * a NamingContext. If this is the case, the remaining
   * components of the name is resolved in the resulting NamingContext.
   * This method is static for maximal reuse - even for extended naming
   * context implementations where the recursive semantics still apply.
   * @param impl an implementation of NamingContextDataStore
   * @param n a sequence of NameComponents which is the name to be resolved.
   * @return the object reference bound under the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
   * multiple components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not
   * proceed
   * in resolving the first component of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied
   * name is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system
   * exceptions.
   * @see resolve
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public static void doBind(NamingContextDataStore impl,
                              NameComponent[] n,
                              org.omg.CORBA.Object obj,
                              boolean rebind,
                              org.omg.CosNaming.BindingType bt)

    /**
     * Implements all four flavors of binding. It uses Resolve() to
     * check if a binding already exists (for bind and bind_context), and
     * unbind() to ensure that a binding does not already exist.
     * If the length of the name is 1, then Bind() is called with
     * the name and the object to bind. Otherwise, the first component
     * of the name is resolved in this NamingContext and the appropriate
     * form of bind passed to the resulting NamingContext.
     * This method is static for maximal reuse - even for extended naming
     * context implementations where the recursive semantics still apply.
     * @param impl an implementation of NamingContextDataStore
     * @param n a sequence of NameComponents which is the name under which
     * the object will be bound.
     * @param obj the object reference to be bound.
     * @param rebind Replace an existing binding or not.
     * @param bt Type of binding (as object or as context).
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not     * proceed
     * in resolving the first component of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object
     * is already bound under the supplied name.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see resolve
     * @see unbind
     * @see bind
     * @see bind_context
     * @see rebind
     * @see rebind_context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public  void destroy()

    /**
     * Destroy this NamingContext object. If this NamingContext contains
     * no bindings, the NamingContext is deleted.
     * @exception org.omg.CosNaming.NamingContextPackage.NotEmpty This
     * NamingContext is not empty (i.e., contains bindings).
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public  NamingContext bind_new_context(NameComponent[] n)

    /**
     * Create a new NamingContext, bind it in this Naming Context and return
     * its object reference. This is equivalent to using new_context() followed
     * by bind_context() with the supplied name and the object reference for
     * the newly created NamingContext.
     * @param n a sequence of NameComponents which is the name to be unbound.
     * @return an object reference for a new NamingContext object implemented
     * by this Name Server, bound to the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object
     * is already bound under the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not
     * proceed in resolving the n-1 components of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see new_context
     * @see bind_context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public synchronized NamingContext new_context()

    /**
     * Create a NamingContext object and return its object reference.
     * @return an object reference for a new NamingContext object implemented
     * by this Name Server.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public  void list(int how_many, BindingListHolder bl,
        BindingIteratorHolder bi)

    /**
     * List the contents of this NamingContest. A sequence of bindings
     * is returned (a BindingList) containing up to the number of requested
     * bindings, and a BindingIterator object reference is returned for
     * iterating over the remaining bindings.
     * @param how_many The number of requested bindings in the BindingList.
     * @param bl The BindingList as an out parameter.
     * @param bi The BindingIterator as an out parameter.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see BindingListHolder
     * @see BindingIteratorImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public  void unbind(NameComponent[] n)

    /**
     * Remove a binding from this NamingContext. If the name contains
     * multiple (n) components, the first n-1 components will be resolved
     * from this NamingContext and the final component unbound in
     * the resulting NamingContext.
     * @param n a sequence of NameComponents which is the name to be unbound.
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not
     * proceed in resolving the n-1 components of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see doUnbind
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public  org.omg.CORBA.Object resolve(NameComponent[] n)

    /**
     * Resolve a name in this NamingContext and return the object reference
     * bound to the name. If the name contains multiple (n) components,
     * the first component will be resolved in this NamingContext and the
     * remaining components resolved in the resulting NamingContext, provided
     * that the NamingContext bound to the first component of the name was
     * bound with bind_context().
     * @param n a sequence of NameComponents which is the name to be resolved.
     * @return the object reference bound under the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not
     * proceed in resolving the n-1 components of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see doResolve
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public  void rebind_context(NameComponent[] n, NamingContext nc)

    /**
     * Bind a NamingContext under a name in this NamingContext. If the name
     * contains multiple (n) components, the first n-1 components will be
     * resolved in this NamingContext and the object bound in resulting
     * NamingContext. If a binding under the supplied name already exists it
     * will be unbound first. The NamingContext will participate in recursive
     * resolving.
     * @param n a sequence of NameComponents which is the name under which
     * the object will be bound.
     * @param obj the object reference to be bound.
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not
     * proceed in resolving the n-1 components of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see doBind
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public  void rebind(NameComponent[] n, org.omg.CORBA.Object obj)

    /**
     * Bind an object under a name in this NamingContext. If the name
     * contains multiple (n) components, n-1 will be resolved in this
     * NamingContext and the object bound in resulting NamingContext.
     * If a binding under the supplied name already exists it will be
     * unbound first. If the
     * object to be bound is a NamingContext it will not participate in
     * a recursive resolve.
     * @param n a sequence of NameComponents which is the name under which
     * the object will be bound.
     * @param obj the object reference to be bound.
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not
     * proceed in resolving the n-1 components of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see doBind
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public void bind_context(NameComponent[] n, NamingContext nc)

    /**
     * Bind a NamingContext under a name in this NamingContext. If the name
     * contains multiple (n) components, n-1 will be resolved in this
     * NamingContext and the object bound in resulting NamingContext.
     * An exception is thrown if a binding with the supplied name already
     * exists. The NamingContext will participate in recursive resolving.
     * @param n a sequence of NameComponents which is the name under which
     * the object will be bound.
     * @param obj the NamingContect object reference to be bound.
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could
     * not proceed in resolving the n-1 components of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object
     * is already bound under the supplied name.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see doBind
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public void bind(NameComponent[] n, org.omg.CORBA.Object obj)

    /**
     * Bind an object under a name in this NamingContext. If the name
     * contains multiple (n) components, n-1 will be resolved in this
     * NamingContext and the object bound in resulting NamingContext.
     * An exception is thrown if a binding with the supplied name already
     * exists. If the
     * object to be bound is a NamingContext it will not participate in
     * a recursive resolve.
     * @param n a sequence of NameComponents which is the name under which
     * the object will be bound.
     * @param obj the object reference to be bound.
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could
     * not proceed in resolving the n-1 components of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object
     * is already bound under the supplied name.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see doBind
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public NamingContextImpl(ORB orb, POA poa) throws java.lang.Exception {

    /**
     * Create a naming context servant.
     * Runs the super constructor.
     * @param orb an ORB object.
     * @exception java.lang.Exception a Java exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
public abstract class NamingContextImpl

/**
 * Class NamingContextImpl implements the org.omg.CosNaming::NamingContext
 * interface, but does not implement the methods associated with
 * maintaining the "table" of current bindings in a NamingContext.
 * Instead, this implementation assumes that the derived implementation
 * implements the NamingContextDataStore interface, which has the necessary
 * methods. This allows multiple
 * NamingContext implementations that differ in storage of the bindings,
 * as well as implementations of interfaces derived from
 * CosNaming::NamingContext that still reuses the implementation.
 * <p>
 * The operations bind(), rebind(), bind_context() and rebind_context()
 * are all really implemented by doBind(). resolve() is really implemented
 * by doResolve(), unbind() by doUnbind(). list(), new_context() and
 * destroy() uses the NamingContextDataStore interface directly. All the
 * doX() methods are public static.
 * They synchronize on the NamingContextDataStore object.
 * <p>
 * An implementation a NamingContext must extend this class and implement
 * the NamingContextDataStore interface with the operations:
 * Bind(), Resolve(),
 * Unbind(), List(), NewContext() and Destroy(). Calls
 * to these methods are synchronized; these methods should
 * therefore not be synchronized.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public void printSize( )

   /**
   * This is a Debugging Method
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public boolean IsEmpty()

   /**
   * This is a Debugging Method
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public org.omg.CORBA.Object resolve_str(String sn)

    /**
     * This operation resolves the Stringified name into the object
     * reference.
     * @param sn Stringified Name of the object <p>
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound
     * Indicates there is no object reference for the given name. <p>
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed
     * Indicates that the given compound name is incorrect <p>
     * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
     * Indicates the name does not identify a binding.<p>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public String to_url(String addr, String sn)

    /**
    * This operation creates a URL based "iiopname://" format name
    * from the Stringified Name of the object.
    * @param addr internet based address of the host machine where
    * Name Service is running <p>
    * @param sn Stringified Name of the object <p>
    * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
    * Indicates the name does not identify a binding.<p>
    * @exception org.omg.CosNaming.NamingContextPackage.InvalidAddress
    * Indicates the internet based address of the host machine is
    * incorrect <p>
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public org.omg.CosNaming.NameComponent[] to_name(String sn)

    /**
    * This operation  converts a Stringified Name into an  equivalent array
    * of Name Components.
    * @param sn Stringified Name of the object <p>
    * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
    * Indicates the name does not identify a binding.<p>
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public String to_string(org.omg.CosNaming.NameComponent[] n)

    /**
    * This operation creates a stringified name from the array of Name
    * components.
    * @param n Name of the object <p>
    * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
    * Indicates the name does not identify a binding.<p>
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public void Destroy() throws SystemException

   /**
   * Destroys the NamingContext.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public NamingContext NewContext() throws SystemException

   /**
   * Create a NamingContext object and return its object reference.
   * @return an object reference for a new NamingContext object implemented
   * by this Name Server.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public void List(int how_many, BindingListHolder bl,
                     BindingIteratorHolder bi) throws SystemException

   /**
   * List the contents of this NamingContext. It creates a new
   * PersistentBindingIterator object and passes it a clone of the
   * hash table and an orb object. It then uses the
   * newly created object to return the required number of bindings.
   * @param how_many The number of requested bindings in the BindingList.
   * @param bl The BindingList as an out parameter.
   * @param bi The BindingIterator as an out parameter.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public Object Unbind(NameComponent n) throws SystemException

   /**
   * This method Unbinds the NamingContext or Object Reference for one level
   * The doUnbind( ) method from superclass calls Unbind() to recursively
   * Unbind using compound Names.
   * @param n a sequence of NameComponents which is the name to be resolved.
   * @return the object reference bound under the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound Neither a NamingContext
   * or a Corba Object reference not found under this Name
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see Bind
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public Object Resolve(NameComponent n, BindingTypeHolder bth)

    /**
    * This method resolves the NamingContext or Object Reference for one level
    * The doResolve( ) method calls Resolve( ) recursively to resolve n level
    * Names.
    * @param n a sequence of NameComponents which is the name to be resolved.
    * @param bt Type of binding (as object or as context).
    * @return the object reference bound under the supplied name.
    * @exception org.omg.CosNaming.NamingContextPackage.NotFound Neither a NamingContext
    * or a Corba Object reference not found under this Name
    * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
    * in resolving the the supplied name.
    * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
    * is invalid (i.e., has length less than 1).
    * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
    * @see Bind
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public void Bind(NameComponent n, org.omg.CORBA.Object obj, BindingType bt)

    /**
    * Implements all flavors of binding( bind and bindcontext)
    * This method will be called from the superclass's doBind( ) method
    * which takes care of all the conditions before calling this method.
    * i.e., It checks whether the Name is already Bounded, Then in the
    * case of rebind it calls Unbind first.
    * This method does one level binding only, To have n-level binding
    * with compound names, doBind( ) calls this method recursively.
    * @param n a sequence of NameComponents which is the name under which
    * the object will be bound.
    * @param obj the object reference to be bound.
    * @param bt Type of binding (as object or as context).
    * @exception org.omg.CosNaming.NamingContextPackage.NotFound  raised
    * if the NameComoponent list is invalid
    * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed
    * Could not proceed in resolving the Name from the given NameComponent
    * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object
    * is already bound under the supplied name.
    * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
    * system exceptions
    * @see Resolve
    * @see Unbind
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    protected static NamingContext resolveFirstAsContext(NamingContextDataStore impl,
                                                         NameComponent[] n)

     /**
   * Implements resolving a NameComponent in this context and
   * narrowing it to CosNaming::NamingContext. It will throw appropriate
   * exceptions if not found or not narrowable.
   * @param impl an implementation of NamingContextDataStore
   * @param n a NameComponents which is the name to be found.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound The
   * first component could not be resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the first component of the supplied name.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see resolve
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public static void doUnbind(NamingContextDataStore impl,
                                NameComponent[] n)

    /**
   * Implements unbinding bound names in this NamingContext. If the
   * name contains only one component, the name is unbound in this
   * NamingContext using Unbind(). Otherwise, the first component
   * of the name is resolved in this NamingContext and
   * unbind passed to the resulting NamingContext.
   * This method is static for maximal reuse - even for extended naming
   * context implementations where the recursive semantics still apply.
   * @param impl an implementation of NamingContextDataStore
   * @param n a sequence of NameComponents which is the name to be unbound.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see resolve
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public static org.omg.CORBA.Object doResolve(NamingContextDataStore impl,
                                                 NameComponent[] n)

   /**
   * Implements resolving names in this NamingContext. The first component
   * of the supplied name is resolved in this NamingContext by calling
   * Resolve(). If there are no more components in the name, the
   * resulting object reference is returned. Otherwise, the resulting object
   * reference must have been bound as a context and be narrowable to
   * a NamingContext. If this is the case, the remaining
   * components of the name is resolved in the resulting NamingContext.
   * This method is static for maximal reuse - even for extended naming
   * context implementations where the recursive semantics still apply.
   * @param impl an implementation of NamingContextDataStore
   * @param n a sequence of NameComponents which is the name to be resolved.
   * @return the object reference bound under the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the first component of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see resolve
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    private void doBind(NamingContextDataStore impl,
                              NameComponent[] n,
                              org.omg.CORBA.Object obj,
                              boolean rebind,
                              org.omg.CosNaming.BindingType bt)

      /**
   * Implements all four flavors of binding. It uses Resolve() to
   * check if a binding already exists (for bind and bind_context), and
   * unbind() to ensure that a binding does not already exist.
   * If the length of the name is 1, then Bind() is called with
   * the name and the object to bind. Otherwise, the first component
   * of the name is resolved in this NamingContext and the appropriate
   * form of bind passed to the resulting NamingContext.
   * This method is static for maximal reuse - even for extended naming
   * context implementations where the recursive semantics still apply.
   * @param impl an implementation of NamingContextDataStore
   * @param n a sequence of NameComponents which is the name under which
   * the object will be bound.
   * @param obj the object reference to be bound.
   * @param rebind Replace an existing binding or not.
   * @param bt Type of binding (as object or as context).
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the first component of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object is
   * already bound under the supplied name.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see resolve
   * @see unbind
   * @see bind
   * @see bind_context
   * @see rebind
   * @see rebind_context
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public  void destroy()

    /**
   * Destroy this NamingContext object. If this NamingContext contains
   * no bindings, the NamingContext is deleted.
   * @exception org.omg.CosNaming.NamingContextPackage.NotEmpty This NamingContext
   * is not empty (i.e., contains bindings).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public  NamingContext bind_new_context(NameComponent[] n)

   /**
   * Create a new NamingContext, bind it in this Naming Context and return
   * its object reference. This is equivalent to using new_context() followed
   * by bind_context() with the supplied name and the object reference for
   * the newly created NamingContext.
   * @param n a sequence of NameComponents which is the name to be unbound.
   * @return an object reference for a new NamingContext object implemented
   * by this Name Server, bound to the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object is
   * already bound under the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see new_context
   * @see bind_context
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public synchronized NamingContext new_context()

   /**
   * Create a NamingContext object and return its object reference.
   * @return an object reference for a new NamingContext object implemented
   * by this Name Server.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public  void list(int how_many, BindingListHolder bl, BindingIteratorHolder bi)

   /**
   * List the contents of this NamingContest. A sequence of bindings
   * is returned (a BindingList) containing up to the number of requested
   * bindings, and a BindingIterator object reference is returned for
   * iterating over the remaining bindings.
   * @param how_many The number of requested bindings in the BindingList.
   * @param bl The BindingList as an out parameter.
   * @param bi The BindingIterator as an out parameter.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see BindingListHolder
   * @see BindingIteratorImpl
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
   public  void unbind(NameComponent[] n)

   /**
   * Remove a binding from this NamingContext. If the name contains
   * multiple (n) components, the first n-1 components will be resolved
   * from this NamingContext and the final component unbound in
   * the resulting NamingContext.
   * @param n a sequence of NameComponents which is the name to be unbound.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see doUnbind
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
   public  org.omg.CORBA.Object resolve(NameComponent[] n)

   /**
   * Resolve a name in this NamingContext and return the object reference
   * bound to the name. If the name contains multiple (n) components,
   * the first component will be resolved in this NamingContext and the
   * remaining components resolved in the resulting NamingContext, provided
   * that the NamingContext bound to the first component of the name was
   * bound with bind_context().
   * @param n a sequence of NameComponents which is the name to be resolved.
   * @return the object reference bound under the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see doResolve
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
   public  void rebind_context(NameComponent[] n, NamingContext nc)

   /**
   * Bind a NamingContext under a name in this NamingContext. If the name
   * contains multiple (n) components, the first n-1 components will be
   * resolved in this
   * NamingContext and the object bound in resulting NamingContext.
   * If a binding under the supplied name already exists it will be
   * unbound first. The NamingContext will participate in recursive resolving.
   * @param n a sequence of NameComponents which is the name under which
   * the object will be bound.
   * @param obj the object reference to be bound.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see doBind
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
   public  void rebind(NameComponent[] n, org.omg.CORBA.Object obj)

 /**
   * Bind an object under a name in this NamingContext. If the name
   * contains multiple (n) components, n-1 will be resolved in this
   * NamingContext and the object bound in resulting NamingContext.
   * If a binding under the supplied name already exists it will be
   * unbound first. If the
   * object to be bound is a NamingContext it will not participate in
   * a recursive resolve.
   * @param n a sequence of NameComponents which is the name under which
   * the object will be bound.
   * @param obj the object reference to be bound.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see doBind
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
   public void bind_context(NameComponent[] n, NamingContext nc)

   /**
   * Bind a NamingContext under a name in this NamingContext. If the name
   * contains multiple (n) components, n-1 will be resolved in this
   * NamingContext and the object bound in resulting NamingContext.
   * An exception is thrown if a binding with the supplied name already
   * exists. The NamingContext will participate in recursive resolving.
   * @param n a sequence of NameComponents which is the name under which
   * the object will be bound.
   * @param obj the NamingContect object reference to be bound.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object is
   * already bound under the supplied name.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see doBind
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
   public void bind(NameComponent[] n, org.omg.CORBA.Object obj)

   /**
   * Bind an object under a name in this NamingContext. If the name
   * contains multiple (n) components, n-1 will be resolved in this
   * NamingContext and the object bound in resulting NamingContext.
   * An exception is thrown if a binding with the supplied name already
   * exists. If the
   * object to be bound is a NamingContext it will not participate in
   * a recursive resolve.
   * @param n a sequence of NameComponents which is the name under which
   * the object will be bound.
   * @param obj the object reference to be bound.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound The supplied name
   * is already bound.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see doBind
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public NamingContextImpl(ORB orb, String objKey,
        NameService theNameService, ServantManagerImpl theServantManagerImpl  )

    /**
     * Create a naming context servant.
     * Runs the super constructor.
     * @param orb an ORB object.
     * @param objKey as String
     * @param TheNameService as NameService
     * @param TheServantManagerImpl as ServantManagerImpl
     * @exception java.lang.Exception a Java exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
public class NamingContextImpl

/**
 * Class NamingContextImpl implements the org.omg.CosNaming::NamingContext and
 * NamingContextExt interface.
 * <p>
 * The operations bind(), rebind(), bind_context() and rebind_context()
 * are all really implemented by doBind(). resolve() is really implemented
 * by doResolve(), unbind() by doUnbind(). list(), new_context() and
 * destroy() uses the NamingContextDataStore interface directly. All the
 * doX() methods are public static.
 * They synchronize on the NamingContextDataStore object.
 * <p>
 * None of the methods here are Synchronized because These methods will be
 * invoked from Super class's doBind( ), doResolve( ) which are already
 * Synchronized.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public org.omg.CORBA.Object resolve_str(String sn)

    /**
     * This operation resolves the Stringified name into the object
     * reference.
     * @param sn Stringified Name of the object <p>
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound
     * Indicates there is no object reference for the given name. <p>
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed
     * Indicates that the given compound name is incorrect <p>
     * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
     * Indicates the name does not identify a binding.<p>
     * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound
     * Indicates the name is already bound.<p>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public String to_url(String addr, String sn)

   /**
    * This operation creates a URL based "iiopname://" format name
    * from the Stringified Name of the object.
    * @param addr internet based address of the host machine where
    * Name Service is running <p>
    * @param sn Stringified Name of the object <p>
    * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
    * Indicates the name does not identify a binding.<p>
    * @exception org.omg.CosNaming.NamingContextPackage.InvalidAddress
    * Indicates the internet based address of the host machine is
    * incorrect <p>
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public org.omg.CosNaming.NameComponent[] to_name(String sn)

   /**
    * This operation  converts a Stringified Name into an  equivalent array
    * of Name Components.
    * @param sn Stringified Name of the object <p>
    * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
    * Indicates the name does not identify a binding.<p>
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public String to_string(org.omg.CosNaming.NameComponent[] n)

   /**
    * This operation creates a stringified name from the array of Name
    * components.
    * @param n Name of the object <p>
    * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
    * Indicates the name does not identify a binding.<p>
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    protected static NamingContext resolveFirstAsContext(NamingContextDataStore impl,
                                                         NameComponent[] n)

    /**
   * Implements resolving a NameComponent in this context and
   * narrowing it to CosNaming::NamingContext. It will throw appropriate
   * exceptions if not found or not narrowable.
   * @param impl an implementation of NamingContextDataStore
   * @param n a NameComponents which is the name to be found.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound The
   * first component could not be resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the first component of the supplied name.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see resolve
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public static void doUnbind(NamingContextDataStore impl,
                                NameComponent[] n)

    /**
   * Implements unbinding bound names in this NamingContext. If the
   * name contains only one component, the name is unbound in this
   * NamingContext using Unbind(). Otherwise, the first component
   * of the name is resolved in this NamingContext and
   * unbind passed to the resulting NamingContext.
   * This method is static for maximal reuse - even for extended naming
   * context implementations where the recursive semantics still apply.
   * @param impl an implementation of NamingContextDataStore
   * @param n a sequence of NameComponents which is the name to be unbound.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see resolve
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public static org.omg.CORBA.Object doResolve(NamingContextDataStore impl,
                                                 NameComponent[] n)

    /**
   * Implements resolving names in this NamingContext. The first component
   * of the supplied name is resolved in this NamingContext by calling
   * Resolve(). If there are no more components in the name, the
   * resulting object reference is returned. Otherwise, the resulting object
   * reference must have been bound as a context and be narrowable to
   * a NamingContext. If this is the case, the remaining
   * components of the name is resolved in the resulting NamingContext.
   * This method is static for maximal reuse - even for extended naming
   * context implementations where the recursive semantics still apply.
   * @param impl an implementation of NamingContextDataStore
   * @param n a sequence of NameComponents which is the name to be resolved.
   * @return the object reference bound under the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
   * multiple components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not
   * proceed
   * in resolving the first component of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied
   * name is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system
   * exceptions.
   * @see resolve
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public static void doBind(NamingContextDataStore impl,
                              NameComponent[] n,
                              org.omg.CORBA.Object obj,
                              boolean rebind,
                              org.omg.CosNaming.BindingType bt)

    /**
     * Implements all four flavors of binding. It uses Resolve() to
     * check if a binding already exists (for bind and bind_context), and
     * unbind() to ensure that a binding does not already exist.
     * If the length of the name is 1, then Bind() is called with
     * the name and the object to bind. Otherwise, the first component
     * of the name is resolved in this NamingContext and the appropriate
     * form of bind passed to the resulting NamingContext.
     * This method is static for maximal reuse - even for extended naming
     * context implementations where the recursive semantics still apply.
     * @param impl an implementation of NamingContextDataStore
     * @param n a sequence of NameComponents which is the name under which
     * the object will be bound.
     * @param obj the object reference to be bound.
     * @param rebind Replace an existing binding or not.
     * @param bt Type of binding (as object or as context).
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not     * proceed
     * in resolving the first component of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object
     * is already bound under the supplied name.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see resolve
     * @see unbind
     * @see bind
     * @see bind_context
     * @see rebind
     * @see rebind_context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public  void destroy()

    /**
     * Destroy this NamingContext object. If this NamingContext contains
     * no bindings, the NamingContext is deleted.
     * @exception org.omg.CosNaming.NamingContextPackage.NotEmpty This
     * NamingContext is not empty (i.e., contains bindings).
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public  NamingContext bind_new_context(NameComponent[] n)

    /**
     * Create a new NamingContext, bind it in this Naming Context and return
     * its object reference. This is equivalent to using new_context() followed
     * by bind_context() with the supplied name and the object reference for
     * the newly created NamingContext.
     * @param n a sequence of NameComponents which is the name to be unbound.
     * @return an object reference for a new NamingContext object implemented
     * by this Name Server, bound to the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object
     * is already bound under the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not
     * proceed in resolving the n-1 components of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see new_context
     * @see bind_context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public synchronized NamingContext new_context()

    /**
     * Create a NamingContext object and return its object reference.
     * @return an object reference for a new NamingContext object implemented
     * by this Name Server.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public  void list(int how_many, BindingListHolder bl,
        BindingIteratorHolder bi)

    /**
     * List the contents of this NamingContest. A sequence of bindings
     * is returned (a BindingList) containing up to the number of requested
     * bindings, and a BindingIterator object reference is returned for
     * iterating over the remaining bindings.
     * @param how_many The number of requested bindings in the BindingList.
     * @param bl The BindingList as an out parameter.
     * @param bi The BindingIterator as an out parameter.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see BindingListHolder
     * @see BindingIteratorImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public  void unbind(NameComponent[] n)

    /**
     * Remove a binding from this NamingContext. If the name contains
     * multiple (n) components, the first n-1 components will be resolved
     * from this NamingContext and the final component unbound in
     * the resulting NamingContext.
     * @param n a sequence of NameComponents which is the name to be unbound.
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not
     * proceed in resolving the n-1 components of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see doUnbind
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public  org.omg.CORBA.Object resolve(NameComponent[] n)

    /**
     * Resolve a name in this NamingContext and return the object reference
     * bound to the name. If the name contains multiple (n) components,
     * the first component will be resolved in this NamingContext and the
     * remaining components resolved in the resulting NamingContext, provided
     * that the NamingContext bound to the first component of the name was
     * bound with bind_context().
     * @param n a sequence of NameComponents which is the name to be resolved.
     * @return the object reference bound under the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not
     * proceed in resolving the n-1 components of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see doResolve
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public  void rebind_context(NameComponent[] n, NamingContext nc)

    /**
     * Bind a NamingContext under a name in this NamingContext. If the name
     * contains multiple (n) components, the first n-1 components will be
     * resolved in this NamingContext and the object bound in resulting
     * NamingContext. If a binding under the supplied name already exists it
     * will be unbound first. The NamingContext will participate in recursive
     * resolving.
     * @param n a sequence of NameComponents which is the name under which
     * the object will be bound.
     * @param obj the object reference to be bound.
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not
     * proceed in resolving the n-1 components of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see doBind
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public  void rebind(NameComponent[] n, org.omg.CORBA.Object obj)

    /**
     * Bind an object under a name in this NamingContext. If the name
     * contains multiple (n) components, n-1 will be resolved in this
     * NamingContext and the object bound in resulting NamingContext.
     * If a binding under the supplied name already exists it will be
     * unbound first. If the
     * object to be bound is a NamingContext it will not participate in
     * a recursive resolve.
     * @param n a sequence of NameComponents which is the name under which
     * the object will be bound.
     * @param obj the object reference to be bound.
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not
     * proceed in resolving the n-1 components of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see doBind
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public void bind_context(NameComponent[] n, NamingContext nc)

    /**
     * Bind a NamingContext under a name in this NamingContext. If the name
     * contains multiple (n) components, n-1 will be resolved in this
     * NamingContext and the object bound in resulting NamingContext.
     * An exception is thrown if a binding with the supplied name already
     * exists. The NamingContext will participate in recursive resolving.
     * @param n a sequence of NameComponents which is the name under which
     * the object will be bound.
     * @param obj the NamingContect object reference to be bound.
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could
     * not proceed in resolving the n-1 components of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object
     * is already bound under the supplied name.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see doBind
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public void bind(NameComponent[] n, org.omg.CORBA.Object obj)

    /**
     * Bind an object under a name in this NamingContext. If the name
     * contains multiple (n) components, n-1 will be resolved in this
     * NamingContext and the object bound in resulting NamingContext.
     * An exception is thrown if a binding with the supplied name already
     * exists. If the
     * object to be bound is a NamingContext it will not participate in
     * a recursive resolve.
     * @param n a sequence of NameComponents which is the name under which
     * the object will be bound.
     * @param obj the object reference to be bound.
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with
     * multiple components was supplied, but the first component could not be
     * resolved.
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could
     * not proceed in resolving the n-1 components of the supplied name.
     * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The
     * supplied name is invalid (i.e., has length less than 1).
     * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object
     * is already bound under the supplied name.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see doBind
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
    public NamingContextImpl(ORB orb, POA poa) throws java.lang.Exception {

    /**
     * Create a naming context servant.
     * Runs the super constructor.
     * @param orb an ORB object.
     * @exception java.lang.Exception a Java exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextImpl.java
public abstract class NamingContextImpl

/**
 * Class NamingContextImpl implements the org.omg.CosNaming::NamingContext
 * interface, but does not implement the methods associated with
 * maintaining the "table" of current bindings in a NamingContext.
 * Instead, this implementation assumes that the derived implementation
 * implements the NamingContextDataStore interface, which has the necessary
 * methods. This allows multiple
 * NamingContext implementations that differ in storage of the bindings,
 * as well as implementations of interfaces derived from
 * CosNaming::NamingContext that still reuses the implementation.
 * <p>
 * The operations bind(), rebind(), bind_context() and rebind_context()
 * are all really implemented by doBind(). resolve() is really implemented
 * by doResolve(), unbind() by doUnbind(). list(), new_context() and
 * destroy() uses the NamingContextDataStore interface directly. All the
 * doX() methods are public static.
 * They synchronize on the NamingContextDataStore object.
 * <p>
 * An implementation a NamingContext must extend this class and implement
 * the NamingContextDataStore interface with the operations:
 * Bind(), Resolve(),
 * Unbind(), List(), NewContext() and Destroy(). Calls
 * to these methods are synchronized; these methods should
 * therefore not be synchronized.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public void printSize( )

   /**
   * This is a Debugging Method
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public boolean IsEmpty()

   /**
   * This is a Debugging Method
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public org.omg.CORBA.Object resolve_str(String sn)

    /**
     * This operation resolves the Stringified name into the object
     * reference.
     * @param sn Stringified Name of the object <p>
     * @exception org.omg.CosNaming.NamingContextPackage.NotFound
     * Indicates there is no object reference for the given name. <p>
     * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed
     * Indicates that the given compound name is incorrect <p>
     * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
     * Indicates the name does not identify a binding.<p>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public String to_url(String addr, String sn)

    /**
    * This operation creates a URL based "iiopname://" format name
    * from the Stringified Name of the object.
    * @param addr internet based address of the host machine where
    * Name Service is running <p>
    * @param sn Stringified Name of the object <p>
    * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
    * Indicates the name does not identify a binding.<p>
    * @exception org.omg.CosNaming.NamingContextPackage.InvalidAddress
    * Indicates the internet based address of the host machine is
    * incorrect <p>
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public org.omg.CosNaming.NameComponent[] to_name(String sn)

    /**
    * This operation  converts a Stringified Name into an  equivalent array
    * of Name Components.
    * @param sn Stringified Name of the object <p>
    * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
    * Indicates the name does not identify a binding.<p>
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public String to_string(org.omg.CosNaming.NameComponent[] n)

    /**
    * This operation creates a stringified name from the array of Name
    * components.
    * @param n Name of the object <p>
    * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
    * Indicates the name does not identify a binding.<p>
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public void Destroy() throws SystemException

   /**
   * Destroys the NamingContext.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public NamingContext NewContext() throws SystemException

   /**
   * Create a NamingContext object and return its object reference.
   * @return an object reference for a new NamingContext object implemented
   * by this Name Server.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public void List(int how_many, BindingListHolder bl,
                     BindingIteratorHolder bi) throws SystemException

   /**
   * List the contents of this NamingContext. It creates a new
   * PersistentBindingIterator object and passes it a clone of the
   * hash table and an orb object. It then uses the
   * newly created object to return the required number of bindings.
   * @param how_many The number of requested bindings in the BindingList.
   * @param bl The BindingList as an out parameter.
   * @param bi The BindingIterator as an out parameter.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public Object Unbind(NameComponent n) throws SystemException

   /**
   * This method Unbinds the NamingContext or Object Reference for one level
   * The doUnbind( ) method from superclass calls Unbind() to recursively
   * Unbind using compound Names.
   * @param n a sequence of NameComponents which is the name to be resolved.
   * @return the object reference bound under the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound Neither a NamingContext
   * or a Corba Object reference not found under this Name
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see Bind
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public Object Resolve(NameComponent n, BindingTypeHolder bth)

    /**
    * This method resolves the NamingContext or Object Reference for one level
    * The doResolve( ) method calls Resolve( ) recursively to resolve n level
    * Names.
    * @param n a sequence of NameComponents which is the name to be resolved.
    * @param bt Type of binding (as object or as context).
    * @return the object reference bound under the supplied name.
    * @exception org.omg.CosNaming.NamingContextPackage.NotFound Neither a NamingContext
    * or a Corba Object reference not found under this Name
    * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
    * in resolving the the supplied name.
    * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
    * is invalid (i.e., has length less than 1).
    * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
    * @see Bind
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public void Bind(NameComponent n, org.omg.CORBA.Object obj, BindingType bt)

    /**
    * Implements all flavors of binding( bind and bindcontext)
    * This method will be called from the superclass's doBind( ) method
    * which takes care of all the conditions before calling this method.
    * i.e., It checks whether the Name is already Bounded, Then in the
    * case of rebind it calls Unbind first.
    * This method does one level binding only, To have n-level binding
    * with compound names, doBind( ) calls this method recursively.
    * @param n a sequence of NameComponents which is the name under which
    * the object will be bound.
    * @param obj the object reference to be bound.
    * @param bt Type of binding (as object or as context).
    * @exception org.omg.CosNaming.NamingContextPackage.NotFound  raised
    * if the NameComoponent list is invalid
    * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed
    * Could not proceed in resolving the Name from the given NameComponent
    * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object
    * is already bound under the supplied name.
    * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
    * system exceptions
    * @see Resolve
    * @see Unbind
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    protected static NamingContext resolveFirstAsContext(NamingContextDataStore impl,
                                                         NameComponent[] n)

     /**
   * Implements resolving a NameComponent in this context and
   * narrowing it to CosNaming::NamingContext. It will throw appropriate
   * exceptions if not found or not narrowable.
   * @param impl an implementation of NamingContextDataStore
   * @param n a NameComponents which is the name to be found.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound The
   * first component could not be resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the first component of the supplied name.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see resolve
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public static void doUnbind(NamingContextDataStore impl,
                                NameComponent[] n)

    /**
   * Implements unbinding bound names in this NamingContext. If the
   * name contains only one component, the name is unbound in this
   * NamingContext using Unbind(). Otherwise, the first component
   * of the name is resolved in this NamingContext and
   * unbind passed to the resulting NamingContext.
   * This method is static for maximal reuse - even for extended naming
   * context implementations where the recursive semantics still apply.
   * @param impl an implementation of NamingContextDataStore
   * @param n a sequence of NameComponents which is the name to be unbound.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see resolve
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public static org.omg.CORBA.Object doResolve(NamingContextDataStore impl,
                                                 NameComponent[] n)

   /**
   * Implements resolving names in this NamingContext. The first component
   * of the supplied name is resolved in this NamingContext by calling
   * Resolve(). If there are no more components in the name, the
   * resulting object reference is returned. Otherwise, the resulting object
   * reference must have been bound as a context and be narrowable to
   * a NamingContext. If this is the case, the remaining
   * components of the name is resolved in the resulting NamingContext.
   * This method is static for maximal reuse - even for extended naming
   * context implementations where the recursive semantics still apply.
   * @param impl an implementation of NamingContextDataStore
   * @param n a sequence of NameComponents which is the name to be resolved.
   * @return the object reference bound under the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the first component of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see resolve
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    private void doBind(NamingContextDataStore impl,
                              NameComponent[] n,
                              org.omg.CORBA.Object obj,
                              boolean rebind,
                              org.omg.CosNaming.BindingType bt)

      /**
   * Implements all four flavors of binding. It uses Resolve() to
   * check if a binding already exists (for bind and bind_context), and
   * unbind() to ensure that a binding does not already exist.
   * If the length of the name is 1, then Bind() is called with
   * the name and the object to bind. Otherwise, the first component
   * of the name is resolved in this NamingContext and the appropriate
   * form of bind passed to the resulting NamingContext.
   * This method is static for maximal reuse - even for extended naming
   * context implementations where the recursive semantics still apply.
   * @param impl an implementation of NamingContextDataStore
   * @param n a sequence of NameComponents which is the name under which
   * the object will be bound.
   * @param obj the object reference to be bound.
   * @param rebind Replace an existing binding or not.
   * @param bt Type of binding (as object or as context).
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the first component of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object is
   * already bound under the supplied name.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see resolve
   * @see unbind
   * @see bind
   * @see bind_context
   * @see rebind
   * @see rebind_context
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public  void destroy()

    /**
   * Destroy this NamingContext object. If this NamingContext contains
   * no bindings, the NamingContext is deleted.
   * @exception org.omg.CosNaming.NamingContextPackage.NotEmpty This NamingContext
   * is not empty (i.e., contains bindings).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public  NamingContext bind_new_context(NameComponent[] n)

   /**
   * Create a new NamingContext, bind it in this Naming Context and return
   * its object reference. This is equivalent to using new_context() followed
   * by bind_context() with the supplied name and the object reference for
   * the newly created NamingContext.
   * @param n a sequence of NameComponents which is the name to be unbound.
   * @return an object reference for a new NamingContext object implemented
   * by this Name Server, bound to the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object is
   * already bound under the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see new_context
   * @see bind_context
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public synchronized NamingContext new_context()

   /**
   * Create a NamingContext object and return its object reference.
   * @return an object reference for a new NamingContext object implemented
   * by this Name Server.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public  void list(int how_many, BindingListHolder bl, BindingIteratorHolder bi)

   /**
   * List the contents of this NamingContest. A sequence of bindings
   * is returned (a BindingList) containing up to the number of requested
   * bindings, and a BindingIterator object reference is returned for
   * iterating over the remaining bindings.
   * @param how_many The number of requested bindings in the BindingList.
   * @param bl The BindingList as an out parameter.
   * @param bi The BindingIterator as an out parameter.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see BindingListHolder
   * @see BindingIteratorImpl
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
   public  void unbind(NameComponent[] n)

   /**
   * Remove a binding from this NamingContext. If the name contains
   * multiple (n) components, the first n-1 components will be resolved
   * from this NamingContext and the final component unbound in
   * the resulting NamingContext.
   * @param n a sequence of NameComponents which is the name to be unbound.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see doUnbind
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
   public  org.omg.CORBA.Object resolve(NameComponent[] n)

   /**
   * Resolve a name in this NamingContext and return the object reference
   * bound to the name. If the name contains multiple (n) components,
   * the first component will be resolved in this NamingContext and the
   * remaining components resolved in the resulting NamingContext, provided
   * that the NamingContext bound to the first component of the name was
   * bound with bind_context().
   * @param n a sequence of NameComponents which is the name to be resolved.
   * @return the object reference bound under the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see doResolve
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
   public  void rebind_context(NameComponent[] n, NamingContext nc)

   /**
   * Bind a NamingContext under a name in this NamingContext. If the name
   * contains multiple (n) components, the first n-1 components will be
   * resolved in this
   * NamingContext and the object bound in resulting NamingContext.
   * If a binding under the supplied name already exists it will be
   * unbound first. The NamingContext will participate in recursive resolving.
   * @param n a sequence of NameComponents which is the name under which
   * the object will be bound.
   * @param obj the object reference to be bound.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see doBind
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
   public  void rebind(NameComponent[] n, org.omg.CORBA.Object obj)

 /**
   * Bind an object under a name in this NamingContext. If the name
   * contains multiple (n) components, n-1 will be resolved in this
   * NamingContext and the object bound in resulting NamingContext.
   * If a binding under the supplied name already exists it will be
   * unbound first. If the
   * object to be bound is a NamingContext it will not participate in
   * a recursive resolve.
   * @param n a sequence of NameComponents which is the name under which
   * the object will be bound.
   * @param obj the object reference to be bound.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see doBind
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
   public void bind_context(NameComponent[] n, NamingContext nc)

   /**
   * Bind a NamingContext under a name in this NamingContext. If the name
   * contains multiple (n) components, n-1 will be resolved in this
   * NamingContext and the object bound in resulting NamingContext.
   * An exception is thrown if a binding with the supplied name already
   * exists. The NamingContext will participate in recursive resolving.
   * @param n a sequence of NameComponents which is the name under which
   * the object will be bound.
   * @param obj the NamingContect object reference to be bound.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound An object is
   * already bound under the supplied name.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see doBind
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
   public void bind(NameComponent[] n, org.omg.CORBA.Object obj)

   /**
   * Bind an object under a name in this NamingContext. If the name
   * contains multiple (n) components, n-1 will be resolved in this
   * NamingContext and the object bound in resulting NamingContext.
   * An exception is thrown if a binding with the supplied name already
   * exists. If the
   * object to be bound is a NamingContext it will not participate in
   * a recursive resolve.
   * @param n a sequence of NameComponents which is the name under which
   * the object will be bound.
   * @param obj the object reference to be bound.
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound A name with multiple
   * components was supplied, but the first component could not be
   * resolved.
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Could not proceed
   * in resolving the n-1 components of the supplied name.
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidName The supplied name
   * is invalid (i.e., has length less than 1).
   * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound The supplied name
   * is already bound.
   * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
   * @see doBind
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
    public NamingContextImpl(ORB orb, String objKey,
        NameService theNameService, ServantManagerImpl theServantManagerImpl  )

    /**
     * Create a naming context servant.
     * Runs the super constructor.
     * @param orb an ORB object.
     * @param objKey as String
     * @param TheNameService as NameService
     * @param TheServantManagerImpl as ServantManagerImpl
     * @exception java.lang.Exception a Java exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/pcosnaming/NamingContextImpl.java
public class NamingContextImpl

/**
 * Class NamingContextImpl implements the org.omg.CosNaming::NamingContext and
 * NamingContextExt interface.
 * <p>
 * The operations bind(), rebind(), bind_context() and rebind_context()
 * are all really implemented by doBind(). resolve() is really implemented
 * by doResolve(), unbind() by doUnbind(). list(), new_context() and
 * destroy() uses the NamingContextDataStore interface directly. All the
 * doX() methods are public static.
 * They synchronize on the NamingContextDataStore object.
 * <p>
 * None of the methods here are Synchronized because These methods will be
 * invoked from Super class's doBind( ), doResolve( ) which are already
 * Synchronized.
 */
