_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    private void validateConstants(final Class c)

    /**
     * Implements 1.2.3 #6
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    private void validateDirectInterfaces(Class c) throws IDLTypeException {

    /**
     * Implements Section 1.2.3, #5.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    private boolean isRemoteExceptionOrSuperClass(Class c) {

    /**
     * Implements Section 1.2.3, #2.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    private boolean validPropertyExceptions(Method method)

    /**
     * Returns true if the method's throw clause conforms to the exception
     * restrictions for properties as defined in Section 1.3.4.3 of
     * Java2IDL spec.  This means that for all exceptions E declared on the
     * method, E isChecked => RemoteException.isAssignableFrom( E ).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    private void validateExceptions(Method method) throws IDLTypeException {

    /**
     * Implements 1.2.3 #2 and #4
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    public IDLType getSpecialCaseIDLTypeMapping(Class c) {

    /**
     * Return IDL Type name for special case type mappings as defined in
     * Table 1-1 of Java2IDL spec or null if given class is not a special
     * type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    public IDLType getPrimitiveIDLTypeMapping(Class c) {

    /**
     * Return IDL Type name for primitive types as defined in
     * Section 1.3.3 of Java2IDL spec or null if not a primitive type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    public boolean isPropertyAccessorMethod(Method m, Class c) {

    /**
     * Return true if given method is legal property accessor as defined in
     * Section 1.3.4.3 of Java2IDL spec.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    public boolean isEntity(Class c)

    /**
     * Section 1.2.8
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    public boolean isObjectReference(Class c)

    /**
     * Section 1.2.7
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    public boolean isException(Class c)

    /**
     * Section 1.2.6
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    public boolean isArray(Class c)

    /**
     * Section 1.2.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    public boolean isValue(Class c)

    /**
     * Section 1.2.4
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    public boolean isPrimitive(Class c)

    /**
     * Section 1.2.2 Primitive Types
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
    public void validateRemoteInterface(Class c) throws IDLTypeException

    /**
     * Validate a class to ensure it conforms to the rules for a
     * Java RMI/IIOP interface.
     *
     * @throws IDLTypeException if not a valid RMI/IIOP interface.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLTypesUtil.java
public final class IDLTypesUtil {

/**
 * Utility class for testing RMI/IDL Types as defined in
 * Section 1.2 of The Java Language to IDL Mapping.  Note that
 * these are static checks only.  Runtime checks, such as those
 * described in Section 1.2.3, #3, are not covered.
 */
