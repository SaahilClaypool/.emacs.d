_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    IIOPProfile getProfile() ;

    /** Return the first IIOPProfile in this IOR.
     * XXX THIS IS TEMPORARY FOR BACKWARDS COMPATIBILITY AND WILL BE REMOVED
     * SOON!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    IORTemplateList getIORTemplates() ;

    /** Return the IORTemplate for this IOR.  This is simply a list
     * of all TaggedProfileTemplates derived from the TaggedProfiles
     * of the IOR.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    boolean isEquivalent(IOR ior) ;

    /** Return true if this IOR is equivalent to ior.  Here equivalent means
     * that the typeids are the same, they have the same number of profiles,
     * and each profile is equivalent to the corresponding profile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    boolean isNil() ;

    /** Return true if this IOR has no profiles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    org.omg.IOP.IOR getIOPIOR() ;

    /** Return a representation of this IOR in the standard GIOP marshalled
     * form.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    String stringify() ;

    /** Return a representation of this IOR in the standard GIOP stringified
     * format that begins with "IOR:".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    Iterator iteratorById( int id ) ;

    /** Return an iterator that iterates over tagged profiles with
    * identifier id.  It is not possible to modify the list through this
    * iterator.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    String getTypeId() ;

    /** Return the type id string from the IOR.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
public interface IOR extends List, Writeable, MakeImmutable

/** An IOR is represented as a list of profiles.
* Only instances of TaggedProfile are contained in the list.
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/IOR.java
  public void accept(Visitor v) {

  /**
   * Call corresponding visitor method(s). The order is:
   * Call visitor methods of implemented interfaces first, then
   * call methods according to the class hierarchy in descending order,
   * i.e., the most specific visitXXX() call comes last.
   *
   * @param v Visitor object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/IOR.java
public class IOR extends ArithmeticInstruction {

/**
 * IOR - Bitwise OR int
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    IIOPProfile getProfile() ;

    /** Return the first IIOPProfile in this IOR.
     * XXX THIS IS TEMPORARY FOR BACKWARDS COMPATIBILITY AND WILL BE REMOVED
     * SOON!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    IORTemplateList getIORTemplates() ;

    /** Return the IORTemplate for this IOR.  This is simply a list
     * of all TaggedProfileTemplates derived from the TaggedProfiles
     * of the IOR.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    boolean isEquivalent(IOR ior) ;

    /** Return true if this IOR is equivalent to ior.  Here equivalent means
     * that the typeids are the same, they have the same number of profiles,
     * and each profile is equivalent to the corresponding profile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    boolean isNil() ;

    /** Return true if this IOR has no profiles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    org.omg.IOP.IOR getIOPIOR() ;

    /** Return a representation of this IOR in the standard GIOP marshalled
     * form.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    String stringify() ;

    /** Return a representation of this IOR in the standard GIOP stringified
     * format that begins with "IOR:".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    Iterator iteratorById( int id ) ;

    /** Return an iterator that iterates over tagged profiles with
    * identifier id.  It is not possible to modify the list through this
    * iterator.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
    String getTypeId() ;

    /** Return the type id string from the IOR.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IOR.java
public interface IOR extends List, Writeable, MakeImmutable

/** An IOR is represented as a list of profiles.
* Only instances of TaggedProfile are contained in the list.
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/IOR.java
  public void accept(Visitor v) {

  /**
   * Call corresponding visitor method(s). The order is:
   * Call visitor methods of implemented interfaces first, then
   * call methods according to the class hierarchy in descending order,
   * i.e., the most specific visitXXX() call comes last.
   *
   * @param v Visitor object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/IOR.java
public class IOR extends ArithmeticInstruction {

/**
 * IOR - Bitwise OR int
 * <PRE>Stack: ..., value1, value2 -&gt; ..., result</PRE>
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/IOP/IOR.java
  public org.omg.IOP.TaggedProfile profiles[] = null;

  /** 
	 * An array of tagged profiles associated with this 
	 * object reference. 
	 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/IOP/IOR.java
  public String type_id = null;

  /** The type id, represented as a String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/IOP/IOR.java


/**
* org/omg/IOP/IOR.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Tuesday, October 6, 2015 4:40:34 PM PDT
*/
