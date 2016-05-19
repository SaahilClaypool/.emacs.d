_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/IDLNameTranslator.java
    String getIDLName( Method method )  ;

    /** Get the mangled name that corresponds to the given method
     * on this IDLNameTranslator's interface.  Returns null
     * if there is no matching name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/IDLNameTranslator.java
    Method getMethod( String idlName )  ;

    /** Get the method from this IDLNameTranslator's interfaces that
     * corresponds to the mangled name idlName.  Returns null
     * if there is no matching method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/IDLNameTranslator.java
    Method[] getMethods() ;

    /** Get all methods for this remote interface.
     * The methods are returned in a canonical order, that is,
     * they are always in the same order for a particular interface.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/IDLNameTranslator.java
    Class[] getInterfaces() ;

    /** Get the interfaces that this IDLNameTranslator describes.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/IDLNameTranslator.java
public interface IDLNameTranslator

/** Translates between methods on an interface and RMI-IIOP encodings
 * of those methods as names.
 */
