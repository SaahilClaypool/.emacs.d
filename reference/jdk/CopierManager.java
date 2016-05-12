_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/copyobject/CopierManager.java
    void registerObjectCopierFactory( ObjectCopierFactory factory, int id ) ;

    /** Register an ObjectCopierFactory under a particular id.  This can be retrieved
     * later by getObjectCopierFactory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/copyobject/CopierManager.java
    int getDefaultId() ;

    /** Return the copier for the default copier id.  Throws a BAD_PARAM exception
     * if no default copier id has been set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/copyobject/CopierManager.java
    void setDefaultId( int id ) ;

    /** Set the Id of the copier to use if no other copier has been set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/copyobject/CopierManager.java
public interface CopierManager

/** Manager of ObjectCopier implementations used to support javax.rmi.CORBA.Util.copyObject(s).
 * This provides simple methods for registering all supported ObjectCopier factories.
 * A default copier is also supported, for use in contexts where no specific copier id
 * is available.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/copyobject/CopierManager.java
    void registerObjectCopierFactory( ObjectCopierFactory factory, int id ) ;

    /** Register an ObjectCopierFactory under a particular id.  This can be retrieved
     * later by getObjectCopierFactory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/copyobject/CopierManager.java
    int getDefaultId() ;

    /** Return the copier for the default copier id.  Throws a BAD_PARAM exception
     * if no default copier id has been set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/copyobject/CopierManager.java
    void setDefaultId( int id ) ;

    /** Set the Id of the copier to use if no other copier has been set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/copyobject/CopierManager.java
public interface CopierManager

/** Manager of ObjectCopier implementations used to support javax.rmi.CORBA.Util.copyObject(s).
 * This provides simple methods for registering all supported ObjectCopier factories.
 * A default copier is also supported, for use in contexts where no specific copier id
 * is available.
 */
