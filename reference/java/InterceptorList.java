_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/InterceptorList.java
    void sortInterceptors() {

    /**
     * Sort interceptors.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/InterceptorList.java
    void destroyAll() {

    /**
     * Destroys all interceptors in this list by invoking their destroy()
     * method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/InterceptorList.java
    private void growInterceptorArray( int type ) {

    /**
     * Grows the given interceptor array by one:
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/InterceptorList.java
    private void initInterceptorArrays() {

    /**
     * Initializes all interceptors arrays to zero-length arrays of the
     * correct type, based on the classTypes list.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/InterceptorList.java
    boolean hasInterceptorsOfType( int type ) {

    /**
     * Returns true if there is at least one interceptor of the given type,
     * or false if not.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/InterceptorList.java
    Interceptor[] getInterceptors( int type ) {

    /**
     * Retrieves an array of interceptors of the given type.  For efficiency,
     * the type parameter is assumed to be valid.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/InterceptorList.java
    void lock() {

    /**
     * Locks this interceptor list so that no more interceptors may be
     * registered.  This method is called after all interceptors are
     * registered for security reasons.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/InterceptorList.java
    void register_interceptor( Interceptor interceptor, int type )

    /**
     * Registers an interceptor of the given type into the interceptor list.
     * The type is one of:
     * <ul>
     *   <li>INTERCEPTOR_TYPE_CLIENT - ClientRequestInterceptor
     *   <li>INTERCEPTOR_TYPE_SERVER - ServerRequestInterceptor
     *   <li>INTERCEPTOR_TYPE_IOR - IORInterceptor
     * </ul>
     *
     * @exception DuplicateName Thrown if an interceptor of the given
     *     name already exists for the given type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/InterceptorList.java
    InterceptorList( InterceptorsSystemException wrapper ) {

    /**
     * Creates a new Interceptor List.  Constructor is package scope so
     * only the ORB can create it.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/InterceptorList.java
public class InterceptorList {

/**
 * Provides a repository of registered Portable Interceptors, organized
 * by type.  This list is designed to be accessed as efficiently as
 * possible during runtime, with the expense of added complexity during
 * initialization and interceptor registration.  The class is designed
 * to easily allow for the addition of new interceptor types.
 */
