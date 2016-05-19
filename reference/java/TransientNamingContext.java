_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/TransientNamingContext.java
    public org.omg.CORBA.Object localRoot;

    /**
     * The local root naming context.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/TransientNamingContext.java
    public final boolean IsEmpty()

    /**
     * Return whether this NamingContext contains any bindings. It forwards
     * this request to the hash table.
     * @return true if this NamingContext contains no bindings.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/TransientNamingContext.java
    private String getName( NameComponent n ) {

    /**
     * A Utility Method For Logging..
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/TransientNamingContext.java
    public final void Destroy()

    /**
     * Destroys this NamingContext by disconnecting from the ORB.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/TransientNamingContext.java
    public final org.omg.CosNaming.NamingContext NewContext()

    /**
     * Create a new NamingContext. It creates a new TransientNamingContext
     * object, passing it the orb object.
     * @return an object reference for a new NamingContext object implemented
     * by this Name Server.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/TransientNamingContext.java
    public final void List(int how_many, BindingListHolder bl,
                           BindingIteratorHolder bi)

    /**
     * List the contents of this NamingContext. It creates a new
     * TransientBindingIterator object and passes it a clone of the
     * hash table and an orb object. It then uses the
     * newly created object to return the required number of bindings.
     * @param how_many The number of requested bindings in the BindingList.
     * @param bl The BindingList as an out parameter.
     * @param bi The BindingIterator as an out parameter.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/TransientNamingContext.java
    public final org.omg.CORBA.Object Unbind(NameComponent n)

    /**
     * Deletes the binding with the supplied name. It creates a
     * InternalBindingKey and uses it to remove the value associated
     * with the key. If nothing is found an exception is thrown, otherwise
     * the element is removed from the hash table.
     * @param n a NameComponent which is the name to unbind
     * @return the object reference bound to the name, or null if not found.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/TransientNamingContext.java
    public final org.omg.CORBA.Object Resolve(NameComponent n,
                                              BindingTypeHolder bth)

    /**
     * Resolves the supplied name to an object reference and returns
     * the type of the resolved binding. It creates a InternalBindingKey
     * and uses the key for looking up in the hash table. If nothing
     * is found an exception is thrown, otherwise the object reference
     * is returned and the binding type set.
     * @param n a NameComponent which is the name to be resolved.
     * @param bth the BindingType as an out parameter.
     * @return the object reference bound under the supplied name, null if not
     * found.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/TransientNamingContext.java
    public final void Bind(NameComponent n, org.omg.CORBA.Object obj,
                           BindingType bt)

    /**
     * Binds the object to the name component as the specified binding type.
     * It creates a InternalBindingKey object and a InternalBindingValue
     * object and inserts them in the hash table.
     * @param n A single org.omg.CosNaming::NameComponent under which the
     * object will be bound.
     * @param obj An object reference to be bound under the supplied name.
     * @param bt The type of the binding (i.e., as object or as context).
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/TransientNamingContext.java
    public TransientNamingContext(com.sun.corba.se.spi.orb.ORB orb,
        org.omg.CORBA.Object initial,
        POA nsPOA )

    /**
     * Constructs a new TransientNamingContext object.
     * @param orb an orb object.
     * @param initial the initial naming context.
     * @exception Exception a Java exception thrown of the base class cannot
     * initialize.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/TransientNamingContext.java
public class TransientNamingContext extends NamingContextImpl implements NamingContextDataStore

/**
 * Class TransientNamingContext implements the methods defined
 * by NamingContextDataStore, and extends the NamingContextImpl class to
 * provide a servant implementation of CosNaming::NamingContext.
 * The TransientNamingContext uses a hash table
 * to store the mappings between bindings and object references and the
 * hash table is not persistent; thereby the name "transient".
 * This class should not be used directly; instead, the class
 * TransientNameService should be instantiated.
 * <p>
 * The keys in the hash table are InternalBindingKey objects, containing
 * a single NameComponent and implementing the proper functions, i.e.,
 * equals() and hashCode() in an efficient manner. The values in the hash
 * table are InternalBindingValues and store a org.omg.CosNaming::Binding and
 * the object reference associated with the binding. For iteration,
 * TransientBindingIterator objects are created, which are passed a cloned
 * copy of the hashtable. Since elements are inserted and deleted and
 * never modified, this provides stable iterators at the cost of cloning
 * the hash table.
 * <p>
 * To create and destroy object references, the TransientNamingContext
 * uses the orb.connect() and orb.disconnect() methods.
 *
 * @see NamingContextImpl
 * @see NamingContextDataStore
 * @see TransientBindingIterator
 * @see TransientNameService
 */
