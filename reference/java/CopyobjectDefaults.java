_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/copyobject/CopyobjectDefaults.java
    public static ObjectCopierFactory makeFallbackObjectCopierFactory(
        final ObjectCopierFactory f1, final ObjectCopierFactory f2 )

    /** Create a fallback copier factory from the two ObjectCopierFactory
     * arguments.  This copier makes an ObjectCopierFactory that creates
     * instances of a fallback copier that first tries an ObjectCopier
     * created from f1, then tries one created from f2, if the first
     * throws a ReflectiveCopyException.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/copyobject/CopyobjectDefaults.java
    public static ObjectCopierFactory getReferenceObjectCopierFactory()

    /** Obtain the reference object "copier".  This does no copies: it just
     * returns whatever is passed to it.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/copyobject/CopyobjectDefaults.java
    public static ObjectCopierFactory makeORBStreamObjectCopierFactory( final ORB orb )

    /** Obtain the ORB stream copier factory.  Note that this version behaves differently
     * than the others: each ObjectCopier produced by the factory only preserves aliasing
     * within a single call to copy.  The others copiers all preserve aliasing across
     * all calls to copy (on the same ObjectCopier instance).
     */
