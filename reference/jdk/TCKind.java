_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    @Deprecated

    /**
    * Creates a new <code>TCKind</code> instance initialized with the given
    * <code>int</code>.
    * @deprecated Do not use this constructor as this method should be private
    * according to the OMG specification. Use {@link #from_int(int)} instead.
    *
    * @param  _value the <code>int</code> to convert.  It must be one of
    *         the <code>int</code> constants in the class
    *         <code>TCKind</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static TCKind from_int(int i) {

    /**
     * Converts the given <code>int</code> to the corresponding
     * <code>TCKind</code> instance.
     *
     * @param i the <code>int</code> to convert.  It must be one of
     *         the <code>int</code> constants in the class
     *         <code>TCKind</code>.
     * @return  the <code>TCKind</code> instance whose <code>value</code>
     * field matches the given <code>int</code>
     * @exception  BAD_PARAM  if the given <code>int</code> does not
     * match the <code>_value</code> field of
     * any <code>TCKind</code> instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public int value() {

    /**
     * Retrieves the value of this <code>TCKind</code> instance.
     *
     * @return  the <code>int</code> that represents the kind of
     * IDL data type for this <code>TCKind</code> instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_abstract_interface = new TCKind(_tk_abstract_interface);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_abstract_interface</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_native = new TCKind(_tk_native);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_native</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_value_box = new TCKind(_tk_value_box);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_value_box</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_value = new TCKind(_tk_value);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_value</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_fixed = new TCKind(_tk_fixed);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_fixed</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_wstring = new TCKind(_tk_wstring);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_wstring</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_wchar = new TCKind(_tk_wchar);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_wchar</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_longdouble = new TCKind(_tk_longdouble);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_longdouble</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_ulonglong = new TCKind(_tk_ulonglong);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_ulonglong</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_longlong = new TCKind(_tk_longlong);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_longlong</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_except = new TCKind(_tk_except);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_except</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_alias = new TCKind(_tk_alias);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_alias</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_array = new TCKind(_tk_array);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_array</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_sequence = new TCKind(_tk_sequence);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_sequence</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_string = new TCKind(_tk_string);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_string</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_enum = new TCKind(_tk_enum);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_enum</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_union = new TCKind(_tk_union);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_union</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_struct = new TCKind(_tk_struct);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_struct</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_objref = new TCKind(_tk_objref);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_objref</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_Principal = new TCKind(_tk_Principal);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_Principal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_TypeCode = new TCKind(_tk_TypeCode);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_TypeCode</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_any = new TCKind(_tk_any);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_any</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_octet = new TCKind(_tk_octet);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_octet</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_char = new TCKind(_tk_char);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_char</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_boolean = new TCKind(_tk_boolean);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_boolean</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_double = new TCKind(_tk_double);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_double</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_float = new TCKind(_tk_float);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_float</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_ulong = new TCKind(_tk_ulong);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_ulong</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_ushort = new TCKind(_tk_ushort);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_ushort</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_long = new TCKind(_tk_long);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_long</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_short = new TCKind(_tk_short);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_short</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_void = new TCKind(_tk_void);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_void</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final TCKind tk_null = new TCKind(_tk_null);

    /**
     * The <code>TCKind</code> constant whose <code>value</code> field is
     * initialized with <code>TCKind._tk_null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_abstract_interface = 32;

    /**
     * The <code>int</code> constant for the IDL data type <code>abstract interface</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_native = 31;        // Verify

    /**
     * The <code>int</code> constant for the IDL data type <code>native</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_value_box = 30; // orbos 98-01-18: Objects By Value

    /**
     * The <code>int</code> constant for the IDL data type <code>value_box</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_value = 29;             // orbos 98-01-18: Objects By Value

    /**
     * The <code>int</code> constant for the IDL data type <code>value</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_fixed = 28;

    /**
     * The <code>int</code> constant for the IDL data type <code>fixed</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_wstring = 27;

    /**
     * The <code>int</code> constant for the IDL data type <code>wstring</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_wchar = 26;

    /**
     * The <code>int</code> constant for the IDL data type <code>wchar</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_longdouble = 25;

    /**
     * The <code>int</code> constant for the IDL data type <code>longdouble</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_ulonglong = 24;

    /**
     * The <code>int</code> constant for the IDL data type <code>ulonglong</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_longlong = 23;

    /**
     * The <code>int</code> constant for the IDL data type <code>longlong</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_except = 22;

    /**
     * The <code>int</code> constant for the IDL data type <code>except</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_alias = 21;

    /**
     * The <code>int</code> constant for the IDL data type <code>alias</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_array = 20;

    /**
     * The <code>int</code> constant for the IDL data type <code>array</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_sequence = 19;

    /**
     * The <code>int</code> constant for the IDL data type <code>sequence</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_string = 18;

    /**
     * The <code>int</code> constant for the IDL data type <code>string</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_enum = 17;

    /**
     * The <code>int</code> constant for the IDL data type <code>enum</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_union = 16;

    /**
     * The <code>int</code> constant for the IDL data type <code>union</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_struct = 15;

    /**
     * The <code>int</code> constant for the IDL data type <code>struct</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_objref = 14;

    /**
     * The <code>int</code> constant for the IDL data type <code>objref</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_Principal = 13;

    /**
     * The <code>int</code> constant for the IDL data type <code>Principal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_TypeCode = 12;

    /**
     * The <code>int</code> constant for the IDL data type <code>TypeCode</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_any = 11;

    /**
     * The <code>int</code> constant for the IDL data type <code>any</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_octet = 10;

    /**
     * The <code>int</code> constant for the IDL data type <code>octet</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_char = 9;

    /**
     * The <code>int</code> constant for the IDL data type <code>char</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_boolean = 8;

    /**
     * The <code>int</code> constant for the IDL data type <code>boolean</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_double = 7;

    /**
     * The <code>int</code> constant for the IDL data type <code>double</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_float = 6;

    /**
     * The <code>int</code> constant for the IDL data type <code>float</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_ulong = 5;

    /**
     * The <code>int</code> constant for the IDL data type <code>ulong</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_ushort = 4;

    /**
     * The <code>int</code> constant for the IDL data type <code>ushort</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_long = 3;

    /**
     * The <code>int</code> constant for the IDL data type <code>long</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_short = 2;

    /**
     * The <code>int</code> constant for the IDL data type <code>short</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_void = 1;

    /**
     * The <code>int</code> constant for the IDL data type <code>void</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
    public static final int _tk_null = 0;

    /**
     * The <code>int</code> constant for a <code>null</code> IDL data type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TCKind.java
public class TCKind {

/**
 * The Java mapping of the IDL enum <code>TCKind</code>, which
 * specifies the kind of a <code>TypeCode</code> object.  There is
 * one kind for each primitive and essential IDL data type.
 * <P>
 * The class <code>TCKind</code> consists of:
 * <UL>
 * <LI>a set of <code>int</code> constants, one for each
 * kind of IDL data type.  These <code>int</code> constants
 * make it possible to use a <code>switch</code> statement.
 * <LI>a set of <code>TCKind</code> constants, one for each
 * kind of IDL data type.  The <code>value</code> field for
 * each <code>TCKind</code> instance is initialized with
 * the <code>int</code> constant that corresponds with
 * the IDL data type that the instance represents.
 * <LI>the method <code>from_int</code>for converting
 * an <code>int</code> to its
 * corresponding <code>TCKind</code> instance
 * <P>Example:
 * <PRE>
 *      org.omg.CORBA.TCKind k = org.omg.CORBA.TCKind.from_int(
 *                         org.omg.CORBA.TCKind._tk_string);
 * </PRE>
 * The variable <code>k</code> represents the <code>TCKind</code>
 * instance for the IDL type <code>string</code>, which is
 * <code>tk_string</code>.
 * <P>
 * <LI>the method <code>value</code> for accessing the
 * <code>_value</code> field of a <code>TCKind</code> constant
 * <P>Example:
 * <PRE>
 *   int i = org.omg.CORBA.TCKind.tk_char.value();
 * </PRE>
 * The variable <code>i</code> represents 9, the value for the
 * IDL data type <code>char</code>.
 * </UL>
 * <P>The <code>value</code> field of a <code>TCKind</code> instance
 * is the CDR encoding used for a <code>TypeCode</code> object in
 * an IIOP message.
 */
