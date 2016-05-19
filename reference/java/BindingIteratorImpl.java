_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/BindingIteratorImpl.java
    protected abstract int RemainingElements();

    /**
     * Abstract method for returning the remaining number of elements.
     * @return the remaining number of elements in the iterator.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/BindingIteratorImpl.java
    protected abstract void Destroy();

    /**
     * Abstract method for destroying this BindingIterator.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/BindingIteratorImpl.java
    protected abstract boolean NextOne(org.omg.CosNaming.BindingHolder b);

    /**
     * Abstract method for returning the next binding in the NamingContext
     * for which this BindingIterator was created.
     * @param b The Binding as an out parameter.
     * @return true if there were more bindings.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/BindingIteratorImpl.java
    public synchronized void destroy()

    /**
     * Destroy this BindingIterator object. The object corresponding to this
     * object reference is destroyed.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see Destroy
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/BindingIteratorImpl.java
    public boolean list( int how_many, org.omg.CosNaming.BindingListHolder blh)

    /**
     * lists next n bindings. It returns true or false, indicating
     * whether there were more bindings. This method has the package private
     * scope, It will be called from NamingContext.list() operation or
     * this.next_n().
     * @param how_many The number of requested bindings in the BindingList.
     * @param bl The BindingList as an out parameter.
     * @return true if there were more bindings.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/BindingIteratorImpl.java
    public synchronized boolean next_n(int how_many,
        org.omg.CosNaming.BindingListHolder blh)

    /**
     * Return the next n bindings. It also returns true or false, indicating
     * whether there were more bindings.
     * @param how_many The number of requested bindings in the BindingList.
     * @param bl The BindingList as an out parameter.
     * @return true if there were more bindings.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see NextOne
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/BindingIteratorImpl.java
    public synchronized boolean next_one(org.omg.CosNaming.BindingHolder b)

    /**
     * Return the next binding. It also returns true or false, indicating
     * whether there were more bindings.
     * @param b The Binding as an out parameter.
     * @return true if there were more bindings.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA
     * system exceptions.
     * @see NextOne
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/BindingIteratorImpl.java
    public BindingIteratorImpl(ORB orb)

    /**
     * Create a binding iterator servant.
     * runs the super constructor.
     * @param orb an ORB object.
     * @exception java.lang.Exception a Java exception.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/cosnaming/BindingIteratorImpl.java
public abstract class BindingIteratorImpl extends BindingIteratorPOA

/**
 * Class BindingIteratorImpl implements the org.omg.CosNaming::BindingIterator
 * interface, but does not implement the method to retrieve the next
 * binding in the NamingContext for which it was created. This is left
 * to a subclass, which is why this class is abstract; BindingIteratorImpl
 * provides an implementation of the interface operations on top of two
 * subclass methods, allowing multiple implementations of iterators that
 * differ in storage and access to the contents of a NamingContext
 * implementation.
 * <p>
 * The operation next_one() is implemented by the subclass, whereas
 * next_n() is implemented on top of the next_one() implementation.
 * Destroy must also be implemented by the subclass.
 * <p>
 * A subclass must implement NextOne() and Destroy(); these
 * methods are invoked from synchronized methods and need therefore
 * not be synchronized themselves.
 */
