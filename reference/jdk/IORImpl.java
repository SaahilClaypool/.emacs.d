_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/ior/IORImpl.java
    public IIOPProfile getProfile()

    /** Return the first IIOPProfile in this IOR.
     * XXX THIS IS TEMPORARY FOR BACKWARDS COMPATIBILITY AND WILL BE REMOVED
     * SOON!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/ior/IORImpl.java
    public synchronized IORTemplateList getIORTemplates()

    /** Return the IORTemplateList for this IOR.  Will throw
     * exception if it is not possible to generate an IOR
     * from the IORTemplateList that is equal to this IOR,
     * which can only happen if not every TaggedProfile in the
     * IOR has the same ObjectId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/ior/IORImpl.java
    public IORImpl( ORB orb, String typeId, IORTemplateList iortemps, ObjectId id)

    /** Construct an IOR from an IORTemplate by applying the same
    * object id to each TaggedProfileTemplate in the IORTemplate.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/ior/IORImpl.java
    public IORImpl( ORB orb, String typeId, IORTemplate iortemp, ObjectId id)

    /** Construct an IOR from an IORTemplate by applying the same
    * object id to each TaggedProfileTemplate in the IORTemplate.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/ior/IORImpl.java
    public IORImpl( ORB orb )

    /** Construct an empty IOR.  This is needed for null object references.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/ior/IORImpl.java
public class IORImpl extends IdentifiableContainerBase implements IOR

/** An IOR is represented as a list of profiles.
* Only objects that extend TaggedProfile should be added to an IOR.
* However, enforcing this restriction requires overriding all
* of the addXXX methods inherited from List, so no check
* is included here.
* @author Ken Cavanaugh
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/ior/IORImpl.java
    public IIOPProfile getProfile()

    /** Return the first IIOPProfile in this IOR.
     * XXX THIS IS TEMPORARY FOR BACKWARDS COMPATIBILITY AND WILL BE REMOVED
     * SOON!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/ior/IORImpl.java
    public synchronized IORTemplateList getIORTemplates()

    /** Return the IORTemplateList for this IOR.  Will throw
     * exception if it is not possible to generate an IOR
     * from the IORTemplateList that is equal to this IOR,
     * which can only happen if not every TaggedProfile in the
     * IOR has the same ObjectId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/ior/IORImpl.java
    public IORImpl( ORB orb, String typeId, IORTemplateList iortemps, ObjectId id)

    /** Construct an IOR from an IORTemplate by applying the same
    * object id to each TaggedProfileTemplate in the IORTemplate.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/ior/IORImpl.java
    public IORImpl( ORB orb, String typeId, IORTemplate iortemp, ObjectId id)

    /** Construct an IOR from an IORTemplate by applying the same
    * object id to each TaggedProfileTemplate in the IORTemplate.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/ior/IORImpl.java
    public IORImpl( ORB orb )

    /** Construct an empty IOR.  This is needed for null object references.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/ior/IORImpl.java
public class IORImpl extends IdentifiableContainerBase implements IOR

/** An IOR is represented as a list of profiles.
* Only objects that extend TaggedProfile should be added to an IOR.
* However, enforcing this restriction requires overriding all
* of the addXXX methods inherited from List, so no check
* is included here.
* @author Ken Cavanaugh
*/
