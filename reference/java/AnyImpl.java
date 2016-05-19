_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    private TypeCode getPrimitiveTypeCodeForClass (Class c, ORB tcORB)

    /**
     * It looks like this was copied from io.ValueUtility at some
     * point.
     *
     * It's used by createTypeCodeForClass.  The tcORB passed in
     * should have the desired ORB version, and is used to
     * create the type codes.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public TypeCode createTypeCodeForClass (java.lang.Class c, ORB tcORB)

    /**
     * Utility method for insert_Value and Util.writeAny.
     *
     * The ORB passed in should have the desired ORBVersion.  It
     * is used to generate the type codes.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public Serializable extract_Value()

    /**
     * Note that the Serializable really should be an IDLEntity of
     * some kind.  It shouldn't just be an RMI-IIOP type.  Currently,
     * we accept and will produce RMI repIds with the latest
     * calculations if given a non-IDLEntity Serializable.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    @Deprecated

    /**
     * @deprecated
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    @Deprecated

    /**
     * @deprecated
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public TypeCode extract_TypeCode()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_TypeCode(TypeCode tc)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public org.omg.CORBA.Object extract_Object()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_Object(org.omg.CORBA.Object o, TypeCode tc)

    /**
     * A variant of the insertion operation that takes a typecode
     * argument as well.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_Object(org.omg.CORBA.Object o)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public Any extract_any()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_any(Any a)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public String extract_wstring()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_wstring(String s)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public String extract_string()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_string(String s)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public byte extract_octet()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_octet(byte b)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public char extract_wchar()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_wchar(char c)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public char extract_char()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_char(char c)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public boolean extract_boolean()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_boolean(boolean b)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public long extract_ulonglong()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_ulonglong(long l)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public long extract_longlong()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_longlong(long l)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public double extract_double()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_double(double d)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public float extract_float()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_float(float f)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public int extract_ulong()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_ulong(int l)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public short extract_ushort()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_ushort(short s)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public int extract_long()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_long(int l)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public short extract_short()

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_short(short s)

    /**
     * See the description of the <a href="#anyOps">general Any operations.</a>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    // insertion/extraction/replacement for all basic types

    ///////////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void insert_Streamable(Streamable s)

    /**
     * takes a streamable and inserts its reference into the any
     *
     * @param s         the streamable to insert
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    // marshaling/unmarshaling routines

    ///////////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public org.omg.CORBA.portable.InputStream create_input_stream()

    /**
     * returns an input stream that an Any value can be marshaled out of.
     *
     * @result          the InputStream to marshal value of Any out of.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public org.omg.CORBA.portable.OutputStream create_output_stream()

    /**
     * returns an output stream that an Any value can be marshaled into.
     *
     * @result          the OutputStream to marshal value of Any into
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    // accessors for marshaling/unmarshaling

    ///////////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public boolean equal(Any otherAny)

    /**
     * checks for equality between Anys.
     *
     * @param otherAny  the Any to be compared with.
     * @result          true if the Anys are equal, false otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public void type(TypeCode tc)

    /**
     * sets the type of the element to be contained in the Any.
     *
     * @param tc                the TypeCode for the element in the Any
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public TypeCode type() {

    /**
     * returns the type of the element contained in the Any.
     *
     * @result          the TypeCode for the element in the Any
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    // basic accessors

    ///////////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    public AnyImpl(ORB orb)

    /**
     * A constructor that sets the Any to contain a null. It also marks
     * the value as being invalid so that extractions throw an exception
     * until an insertion has been performed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/corba/AnyImpl.java
    // Constructors

    ///////////////////////////////////////////////////////////////////////////
