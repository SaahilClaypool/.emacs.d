_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ValueMember.java
    public ValueMember(String __name, String __id, String __defined_in, String __version, org.omg.CORBA.TypeCode __type, org.omg.CORBA.IDLType __type_def, short __access) {

    /**
     * Constructs a <code>ValueMember</code> object initialized with
     * the given values.
     *
     *@param __name The name of the <code>value</code> member described by this
     * <code>ValueMember</code> object.
     *@param __id The repository ID of the <code>value</code> member described by
     * this <code>ValueMember</code> object;
     *@param __defined_in The repository ID of the <code>value</code> in which this member
     * is defined.
     *@param __version The version of the <code>value</code> in which this member is defined.
     *@param __type The type of of this <code>value</code> member.
     *@param __type_def The typedef that represents the IDL type of the <code>value</code>
     * member described by this <code>ValueMember</code> object.
     *@param __access The type of access (public, private) for the <code>value</code>
     * member described by this <code>ValueMember</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ValueMember.java
    public ValueMember() { }

    /**
     * Constructs a default <code>ValueMember</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ValueMember.java
    public short access;

    /**
     * The type of access (public, private) for the <code>value</code>
     * member described by this <code>ValueMember</code> object.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ValueMember.java
    public org.omg.CORBA.IDLType type_def;

    /**
     * The typedef that represents the IDL type of the <code>value</code>
     * member described by this <code>ValueMember</code> object.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ValueMember.java
    public org.omg.CORBA.TypeCode type;

    /**
     * The type of of this <code>value</code> member.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ValueMember.java
    public String version;

    /**
     * The version of the <code>value</code> in which this member is defined.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ValueMember.java
    public String defined_in;

    /**
     * The repository ID of the <code>value</code> in which this member
     * is defined.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ValueMember.java
    public String id;

    /**
     * The repository ID of the <code>value</code> member described by
     * this <code>ValueMember</code> object;
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ValueMember.java
    public String name;

    /**
     * The name of the <code>value</code> member described by this
     * <code>ValueMember</code> object.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ValueMember.java
public final class ValueMember implements org.omg.CORBA.portable.IDLEntity {

/**
 * A description in the Interface Repository of
 * a member of a <code>value</code> object.
 */
