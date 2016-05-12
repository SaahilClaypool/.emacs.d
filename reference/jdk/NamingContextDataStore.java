_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextDataStore.java
    boolean IsEmpty();

    /**
     * Method which returns whether this NamingContext is empty
     * or not.
     * @return true if this NamingContext contains no bindings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextDataStore.java
    void Destroy()

    /**
     * Method which implements destroying this NamingContext.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextDataStore.java
    NamingContext NewContext()

    /**
     * Method which implements creating a new NamingContext.
     * @return an object reference for a new NamingContext object implemented
     * by this Name Server.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextDataStore.java
    void List(int how_many, BindingListHolder bl, BindingIteratorHolder bi)

    /**
     * Method which implements listing the contents of this
     * NamingContext and return a binding list and a binding iterator.
     * @param how_many The number of requested bindings in the BindingList.
     * @param bl The BindingList as an out parameter.
     * @param bi The BindingIterator as an out parameter.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextDataStore.java
    org.omg.CORBA.Object Unbind(NameComponent n)

    /**
     * Method which implements unbinding a name.
     * @return the object reference bound to the name, or null if not found.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextDataStore.java
    org.omg.CORBA.Object Resolve(NameComponent n,BindingTypeHolder bth)

    /**
     * Method which implements resolving the specified name,
     * returning the type of the binding and the bound object reference.
     * If the id and kind of the NameComponent are both empty, the initial
     * naming context (i.e., the local root) must be returned.
     * @param n a NameComponent which is the name to be resolved.
     * @param bth the BindingType as an out parameter.
     * @return the object reference bound under the supplied name.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextDataStore.java
public interface NamingContextDataStore {

/**
 * This interface defines a set of methods that must be implemented by the
 * "data store" associated with a NamingContext implementation.
 * It allows for different implementations of naming contexts that
 * support the same API but differ in storage mechanism.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextDataStore.java
    boolean IsEmpty();

    /**
     * Method which returns whether this NamingContext is empty
     * or not.
     * @return true if this NamingContext contains no bindings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextDataStore.java
    void Destroy()

    /**
     * Method which implements destroying this NamingContext.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextDataStore.java
    NamingContext NewContext()

    /**
     * Method which implements creating a new NamingContext.
     * @return an object reference for a new NamingContext object implemented
     * by this Name Server.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextDataStore.java
    void List(int how_many, BindingListHolder bl, BindingIteratorHolder bi)

    /**
     * Method which implements listing the contents of this
     * NamingContext and return a binding list and a binding iterator.
     * @param how_many The number of requested bindings in the BindingList.
     * @param bl The BindingList as an out parameter.
     * @param bi The BindingIterator as an out parameter.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextDataStore.java
    org.omg.CORBA.Object Unbind(NameComponent n)

    /**
     * Method which implements unbinding a name.
     * @return the object reference bound to the name, or null if not found.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextDataStore.java
    org.omg.CORBA.Object Resolve(NameComponent n,BindingTypeHolder bth)

    /**
     * Method which implements resolving the specified name,
     * returning the type of the binding and the bound object reference.
     * If the id and kind of the NameComponent are both empty, the initial
     * naming context (i.e., the local root) must be returned.
     * @param n a NameComponent which is the name to be resolved.
     * @param bth the BindingType as an out parameter.
     * @return the object reference bound under the supplied name.
     * @exception org.omg.CORBA.SystemException One of a fixed set of CORBA system exceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/NamingContextDataStore.java
public interface NamingContextDataStore {

/**
 * This interface defines a set of methods that must be implemented by the
 * "data store" associated with a NamingContext implementation.
 * It allows for different implementations of naming contexts that
 * support the same API but differ in storage mechanism.
 */
