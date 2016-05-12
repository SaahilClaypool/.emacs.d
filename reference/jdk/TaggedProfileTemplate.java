_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/TaggedProfileTemplate.java
    org.omg.IOP.TaggedComponent[] getIOPComponents(
        ORB orb, int id );

    /** Return the tagged components in this profile (if any)
     * in the GIOP marshalled form, which is required for Portable
     * Interceptors.  Returns null if either the profile has no
     * components, or if this type of profile can never contain
     * components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/TaggedProfileTemplate.java
    boolean isEquivalent( TaggedProfileTemplate temp );

    /** Return true if temp is equivalent to this template.  Equivalence
     * means that in some sense an invocation on a profile created by this
     * template has the same results as an invocation on a profile
     * created from temp.  Equivalence may be weaker than equality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/TaggedProfileTemplate.java
    void write( ObjectKeyTemplate oktemp, ObjectId id, OutputStream os) ;

    /** Write the profile create( oktemp, id ) to the OutputStream os.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/TaggedProfileTemplate.java
    TaggedProfile create( ObjectKeyTemplate oktemp, ObjectId id ) ;

    /** Create a TaggedProfile from this template.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/TaggedProfileTemplate.java
    public Iterator iteratorById( int id ) ;

    /** Return an iterator that iterates over tagged components with
    * identifier id.  It is not possible to modify the list through this
    * iterator.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/TaggedProfileTemplate.java
public interface TaggedProfileTemplate extends List, Identifiable,

/** Base template for creating TaggedProfiles.  A TaggedProfile will often contain
* tagged components.  A template that does not contain components acts like
* an empty immutable list.
*
* @author Ken Cavanaugh
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/TaggedProfileTemplate.java
    org.omg.IOP.TaggedComponent[] getIOPComponents(
        ORB orb, int id );

    /** Return the tagged components in this profile (if any)
     * in the GIOP marshalled form, which is required for Portable
     * Interceptors.  Returns null if either the profile has no
     * components, or if this type of profile can never contain
     * components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/TaggedProfileTemplate.java
    boolean isEquivalent( TaggedProfileTemplate temp );

    /** Return true if temp is equivalent to this template.  Equivalence
     * means that in some sense an invocation on a profile created by this
     * template has the same results as an invocation on a profile
     * created from temp.  Equivalence may be weaker than equality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/TaggedProfileTemplate.java
    void write( ObjectKeyTemplate oktemp, ObjectId id, OutputStream os) ;

    /** Write the profile create( oktemp, id ) to the OutputStream os.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/TaggedProfileTemplate.java
    TaggedProfile create( ObjectKeyTemplate oktemp, ObjectId id ) ;

    /** Create a TaggedProfile from this template.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/TaggedProfileTemplate.java
    public Iterator iteratorById( int id ) ;

    /** Return an iterator that iterates over tagged components with
    * identifier id.  It is not possible to modify the list through this
    * iterator.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/TaggedProfileTemplate.java
public interface TaggedProfileTemplate extends List, Identifiable,

/** Base template for creating TaggedProfiles.  A TaggedProfile will often contain
* tagged components.  A template that does not contain components acts like
* an empty immutable list.
*
* @author Ken Cavanaugh
*/
