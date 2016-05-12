_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/IRObjectOperations.java
    void destroy ();

    /**
     * Destroys this object. If the object is a Container,
     * this method is applied to all its contents. If the object contains an IDLType
     * attribute for an anonymous type, that IDLType is destroyed.
     * If the object is currently contained in some other object, it is removed.
     * If the method is invoked on a <code>Repository</code> or on a <code>PrimitiveDef</code>
     * then the <code>BAD_INV_ORDER</code> exception is raised with minor value 2.
     * An attempt to destroy an object that would leave the repository in an
     * incoherent state causes <code>BAD_INV_ORDER</code> exception to be raised
     * with the minor code 1.
     * @exception BAD_INV_ORDER if this method is invoked on a repository or
     *            <code>PrimitiveDef</code>, or if an attempt to destroy an
     *            object would leave the repository in an incoherent state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/IRObjectOperations.java
    org.omg.CORBA.DefinitionKind def_kind ();

    /**
     * Returns the <code>DefinitionKind</code> corresponding to this Interface Repository object.
     * @return the <code>DefinitionKind</code> corresponding to this Interface Repository object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/IRObjectOperations.java
public interface IRObjectOperations

/**
 * This is the Operations interface for the mapping from <tt>IRObject</tt>.
 * Several interfaces are used as base interfaces for objects in
 * the Interface Repository (IR). These base interfaces are not instantiable.
 * A common set of operations is used to locate objects within the
 * Interface Repository. Some of these operations are defined in
 * the IRObject. All IR objects inherit from the IRObject interface,
 * which provides an operation for identifying the actual type of
 * the object. (The IDL base interface IRObject represents the most
 * generic interface from which all other Interface Repository interfaces
 * are derived, even the Repository itself.) All java implementations of
 * IR objects must implement the IRObjectOperations interface.
 * @see IDLTypeOperations
 * @see IDLType
 * @see IRObject
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/IRObjectOperations.java
/*

/**
* The interface for <tt>IRObject</tt>.  For more information on
* Operations interfaces, see <a href="doc-files/generatedfiles.html#operations">
* "Generated Files: Operations files"</a>.
*/
