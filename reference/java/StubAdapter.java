_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/StubAdapter.java
    public static Delegate getDelegate( Object stub )

    /** This also gets the delegate from a Servant by
     * using Servant._this_object()
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/StubAdapter.java
        if (tie instanceof ObjectImpl) {

        /** Any implementation of Tie should be either a Servant or an ObjectImpl,
         * depending on which style of code generation is used.  rmic -iiop by
         * default results in an ObjectImpl-based Tie, while rmic -iiop -poa
         * results in a Servant-based Tie.  Dynamic RMI-IIOP also uses Servant-based
         * Ties (see impl.presentation.rmi.ReflectiveTie).
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/StubAdapter.java
    public static org.omg.CORBA.Object activateTie( Tie tie )

    /** Given any Tie, return the corresponding object refernce, activating
     * the Servant if necessary.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/StubAdapter.java
    public static org.omg.CORBA.Object activateServant( Servant servant )

    /** Use implicit activation to get an object reference for the servant.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/StubAdapter.java
public abstract class StubAdapter

/** Provide access to stub delegate and type id information
 * independent of the stub type.  This class exists because
 * ObjectImpl does not have an interface for the 3 delegate and
 * type id methods, so a DynamicStub has a different type.
 * We cannot simply change ObjectImpl as it is a standard API.
 * We also cannot change the code generation of Stubs, as that
 * is also standard.  Hence I am left with this ugly class.
 */
