_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/FactoryEnumeration.java
    FactoryEnumeration(List<NamedWeakReference<Object>> factories,
                       ClassLoader loader) {

    /**
     * Records the input list and uses it directly to satisfy
     * hasMore()/next() requests. An alternative would have been to use
     * an enumeration/iterator from the list, but we want to update the
     * list so we keep the
     * original list. The list initially contains Class objects.
     * As each element is used, the Class object is replaced by an
     * instance of the Class itself; eventually, the list contains
     * only a list of factory instances and no more updates are required.
     *
     * <p> Both Class objects and factories are wrapped in weak
     * references so as not to prevent GC of the class loader.  Each
     * weak reference is tagged with the factory's class name so the
     * class can be reloaded if the reference is cleared.
     *
     * @param factories A non-null list
     * @param loader    The class loader of the list's contents
     *
     * This internal method is used with Thread Context Class Loader (TCCL),
     * please don't expose this method as public.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/FactoryEnumeration.java
// no need to implement Enumeration since this is only for internal use

/**
  * The FactoryEnumeration is used for returning factory instances.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/FactoryEnumeration.java
    FactoryEnumeration(List<NamedWeakReference<Object>> factories,
                       ClassLoader loader) {

    /**
     * Records the input list and uses it directly to satisfy
     * hasMore()/next() requests. An alternative would have been to use
     * an enumeration/iterator from the list, but we want to update the
     * list so we keep the
     * original list. The list initially contains Class objects.
     * As each element is used, the Class object is replaced by an
     * instance of the Class itself; eventually, the list contains
     * only a list of factory instances and no more updates are required.
     *
     * <p> Both Class objects and factories are wrapped in weak
     * references so as not to prevent GC of the class loader.  Each
     * weak reference is tagged with the factory's class name so the
     * class can be reloaded if the reference is cleared.
     *
     * @param factories A non-null list
     * @param loader    The class loader of the list's contents
     *
     * This internal method is used with Thread Context Class Loader (TCCL),
     * please don't expose this method as public.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/FactoryEnumeration.java
// no need to implement Enumeration since this is only for internal use

/**
  * The FactoryEnumeration is used for returning factory instances.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
 */
