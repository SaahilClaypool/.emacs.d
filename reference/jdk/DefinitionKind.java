_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    private int _value;

     /**
      * The field that holds a value for a <code>DefinitionKind</code> object.
      * @serial
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    protected DefinitionKind(int _value){

   /**
    * Constructs a <code>DefinitionKind</code> object with its <code>_value</code>
    * field initialized with the given value.
    * @param _value one of the <code>int</code> constants defined in the
    *                   class <code>DefinitionKind</code>
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static DefinitionKind from_int(int i) {

     /**
     * Creates a <code>DefinitionKind</code> instance corresponding to the given code
.
     * @param i one of the <code>int</code> constants from the class
         * <code>DefinitionKind</code>
         * @return the <code>DefinitionKind</code> instance corresponding
         *         to the given code
         * @throws org.omg.CORBA.BAD_PARAM if the given parameter is not
 one
         *         of the <code>int</code> constants from the class
         *         <code>DefinitionKind</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public int value() {

     /**
     * Returns the <code>int</code> constant identifying the type of an IR object.
     * @return the <code>int</code> constant from the class
         * <code>DefinitionKind</code> that is the value of this
         * <code>DefinitionKind</code> instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_AbstractInterface = new DefinitionKind(_dk_AbstractInterface);

/**
* The static instance of <code>DefinitionKind</code> indicating that an
* Interface Repository object represents an abstract interface.
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Native = new DefinitionKind(_dk_Native);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a Native value.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_ValueMember = new DefinitionKind(_dk_ValueMember);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a ValueMember.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_ValueBox = new DefinitionKind(_dk_ValueBox);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a ValueBox.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Value = new DefinitionKind(_dk_Value);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a Value.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Fixed = new DefinitionKind(_dk_Fixed);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a Fixed value.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Wstring = new DefinitionKind(_dk_Wstring);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a Wstring.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Repository = new DefinitionKind(_dk_Repository);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a Repository.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Array = new DefinitionKind(_dk_Array);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is an Array.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Sequence = new DefinitionKind(_dk_Sequence);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a Sequence.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_String = new DefinitionKind(_dk_String);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a String.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Primitive = new DefinitionKind(_dk_Primitive);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a Primitive.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Enum = new DefinitionKind(_dk_Enum);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is an Enum.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Union = new DefinitionKind(_dk_Union);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a Union.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Struct = new DefinitionKind(_dk_Struct);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a Struct.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Alias = new DefinitionKind(_dk_Alias);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is an Alias.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Typedef = new DefinitionKind(_dk_Typedef);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a Typedef.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Operation = new DefinitionKind(_dk_Operation);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is an Operation.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Module = new DefinitionKind(_dk_Module);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a Module.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Interface = new DefinitionKind(_dk_Interface);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is an Interface.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Exception = new DefinitionKind(_dk_Exception);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is an Exception.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Constant = new DefinitionKind(_dk_Constant);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is a constant.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_Attribute = new DefinitionKind(_dk_Attribute);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object is an Attribute.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_all = new DefinitionKind(_dk_all);

     /**
         * The wildcard <code>DefinitionKind</code> constant, useful
         * in all occasions where any
     * <code>DefinitionKind</code> is appropriate. The Container's
         * <code>contents</code> method
     * makes use of this constant to return all contained definitions of any kind.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
    public static final DefinitionKind dk_none = new DefinitionKind(_dk_none);

/**
 * The static instance of <code>DefinitionKind</code> indicating that an
 * Interface Repository object has no definition kind.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_AbstractInterface = 24;

/**
 * The constant that indicates that an Interface Repository object
 * is representing an abstract interface.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Native = 23,

/**
 * The constant that indicates that an Interface Repository object is of type
 * Native.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_ValueMember = 22,

/**
 * The constant that indicates that an Interface Repository object is a
 * ValueMember.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_ValueBox = 21,

/**
 * The constant that indicates that an Interface Repository object is a
 * ValueBox.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Value = 20,

/**
 * The constant that indicates that an Interface Repository object is a
 * Value.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Fixed = 19,

/**
 * The constant that indicates that an Interface Repository object is of type
 * Fixed.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Wstring = 18,

/**
 * The constant that indicates that an Interface Repository object is a
 * Wstring.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Repository = 17,

/**
 * The constant that indicates that an Interface Repository object is a
 * Repository.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Array = 16,

/**
 * The constant that indicates that an Interface Repository object is an
 * Array.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Sequence = 15,

/**
 * The constant that indicates that an Interface Repository object is a
 * Sequence.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_String = 14,

/**
 * The constant that indicates that an Interface Repository object is a
 * String.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Primitive = 13,

/**
 * The constant that indicates that an Interface Repository object is a
 * Primitive.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Enum = 12,

/**
 * The constant that indicates that an Interface Repository object is an
 * Enum.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Union = 11,

/**
 * The constant that indicates that an Interface Repository object is a
 * Union.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Struct = 10,

/**
 * The constant that indicates that an Interface Repository object is a
 * Struct.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Alias = 9,

/**
 * The constant that indicates that an Interface Repository object is an
 * Alias.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Typedef = 8,

/**
 * The constant that indicates that an Interface Repository object is a
 * Typedef.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Operation = 7,

/**
 * The constant that indicates that an Interface Repository object is an
 * operation.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Module = 6,

/**
 * The constant that indicates that an Interface Repository object is a
 * module.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Interface = 5,

/**
 * The constant that indicates that an Interface Repository object is an
 * interface.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Exception = 4,

/**
 * The constant that indicates that an Interface Repository object is an
 * exception.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Constant = 3,

/**
 * The constant that indicates that an Interface Repository object is a
 * constant.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_Attribute = 2,

/**
 * The constant that indicates that an Interface Repository object is an
 * attribute.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        _dk_all = 1,

/**
 * The constant that indicates that the type of an Interface Repository object
 * may be any type.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
        public static final int _dk_none = 0,

/**
 * The constant that indicates that an Interface Repository object
 * does not have a definition kind.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DefinitionKind.java
public class DefinitionKind implements org.omg.CORBA.portable.IDLEntity {

/**
* The class that provides the constants used to identify the type of an
* Interface Repository object.  This class contains two kinds of constants,
* those that are an <code>int</code> and those that are an instance of the class
* <code>DefinitionKind</code>.  This class provides the method
* <code>from_int</code>, which given one
* of the <code>int</code> constants, creates the corresponding
* <code>DefinitionKind</code> instance.  It also provides the method
* <code>value</code>, which returns the <code>int</code> constant that
* is the value for a <code>DefinitionKind</code> instance.
*
* @see IRObject
*/
