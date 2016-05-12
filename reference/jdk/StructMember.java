_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/StructMember.java
    public StructMember(String __name, org.omg.CORBA.TypeCode __type, org.omg.CORBA.IDLType __type_def) {

    /**
     * Constructs a <code>StructMember</code> object initialized with the
     * given values.
     * @param __name a <code>String</code> object with the name of the struct
     *        member
     * @param __type a <code>TypeCode</code> object describing the type of the struct
     *        member
     * @param __type_def an <code>IDLType</code> object representing the IDL type
     *        of the struct member
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/StructMember.java
    public StructMember() { }

    /**
     * Constructs a default <code>StructMember</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/StructMember.java
    public org.omg.CORBA.IDLType type_def;

    /**
     * The typedef that represents the IDL type of the struct member described by
     * this <code>StructMember</code> object.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/StructMember.java
    public org.omg.CORBA.TypeCode type;

    /**
     * The type of the struct member described by
     * this <code>StructMember</code> object.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/StructMember.java
    public String name;

    /**
     * The name of the struct member described by
     * this <code>StructMember</code> object.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/StructMember.java
public final class StructMember implements org.omg.CORBA.portable.IDLEntity {

/**
 * Describes a member of an IDL <code>struct</code> in the
 * Interface Repository, including
 * the  name of the <code>struct</code> member, the type of
 * the <code>struct</code> member, and
 * the typedef that represents the IDL type of the
 * <code>struct</code> member
 * described the <code>struct</code> member object.
 */
