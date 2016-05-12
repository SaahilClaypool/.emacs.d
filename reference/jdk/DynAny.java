_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void rewind() ;

    /**
     * Moves the internal pointer to the first component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public boolean seek(int index) ;

    /**
     * Moves the internal pointer to the given index. Logically, this method
     * sets a new offset for this pointer.
     *
     * @param index an <code>int</code> indicating the position to which
     *              the pointer should move.  The first position is 0.
     * @return <code>true</code> if the pointer points to a component;
     * <code>false</code> if there is no component at the designated
     * index.  If this <code>DynAny</code> object is associated with a
     * basic type, this method returns <code>false</code> for any index
     * other than 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public boolean next() ;

    /**
     * Moves to the next component of this <code>DynAny</code> object.
     * This method is used for iterating through the components of
     * a constructed type, effectively moving a pointer from one
     * component to the next.  The pointer starts out on the first
     * component when a <code>DynAny</code> object is created.
     *
     * @return <code>true</code> if the pointer points to a component;
     * <code>false</code> if there are no more components or this
     * <code>DynAny</code> is associated with a basic type rather than
     * a constructed type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public org.omg.CORBA.DynAny current_component() ;

    /**
     * Returns a <code>DynAny</code> object reference that can
     * be used to get/set the value of the component currently accessed.
     * The appropriate <code>insert</code> method
     * can be called on the resulting <code>DynAny</code> object
     * to initialize the component.
     * The appropriate <code>get</code> method
     * can be called on the resulting <code>DynAny</code> object
     * to extract the value of the component.
         *
         * @return a <code>DynAny</code> object reference that can be
         *         used to retrieve or set the value of the component currently
         *         accessed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public org.omg.CORBA.Any get_any()

    /**
     * Retrieves the <code>org.omg.CORBA.Any</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>org.omg.CORBA.Any</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for an <code>org.omg.CORBA.Any</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public String get_wstring()

    /**
     * Retrieves the <code>String</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>String</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>String</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public char get_wchar()

    /**
     * Retrieves the <code>char</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>char</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>char</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public long get_ulonglong()

    /**
     * Retrieves the <code>long</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>long</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>long</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public long get_longlong()

    /**
     * Retrieves the <code>long</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>long</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>long</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public org.omg.CORBA.TypeCode get_typecode()

    /**
     * Retrieves the <code>org.omg.CORBA.TypeCode</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>org.omg.CORBA.TypeCode</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>org.omg.CORBA.TypeCode</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public org.omg.CORBA.Object get_reference()

    /**
     * Retrieves the <code>org.omg.CORBA.Other</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>org.omg.CORBA.Other</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for an <code>org.omg.CORBA.Other</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public String get_string()

    /**
     * Retrieves the <code>String</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>String</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>String</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public double get_double()

    /**
     * Retrieves the <code>double</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>double</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>double</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public float get_float()

    /**
     * Retrieves the <code>float</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>float</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>float</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public int get_ulong()

    /**
     * Retrieves the <code>int</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>int</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>int</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public int get_long()

    /**
     * Retrieves the <code>int</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>int</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>int</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public short get_ushort()

    /**
     * Retrieves the <code>short</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>short</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>short</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public short get_short()

    /**
     * Retrieves the <code>short</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>short</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>short</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public char get_char()

    /**
     * Retrieves the <code>char</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>char</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>char</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public byte get_octet()

    /**
     * Retrieves the <code>byte</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>byte</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>byte</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public boolean get_boolean()

    /**
     * Retrieves the <code>boolean</code> contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>boolean</code> that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>boolean</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public java.io.Serializable get_val()

    /**
     * Retrieves the <code>java.io.Serializable</code> object contained
     * in this <code>DynAny</code> object.
     *
     * @return the <code>java.io.Serializable</code> object that is the
     *         value for this <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.TypeMismatch
     *               if the type code of the accessed component in this
     *               <code>DynAny</code> object is not equivalent to
     *               the type code for a <code>java.io.Serializable</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_val(java.io.Serializable value)

    /**
     * Inserts the given <code>java.io.Serializable</code> object as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>java.io.Serializable</code> object to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_any(org.omg.CORBA.Any value)

    /**
     * Inserts the given <code>org.omg.CORBA.Any</code> object as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>org.omg.CORBA.Any</code> object to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_wstring(String value)

    /**
     * Inserts the given <code>String</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>String</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_wchar(char value)

    /**
     * Inserts the given <code>char</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>char</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_ulonglong(long value)

    /**
     * Inserts the given <code>long</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>long</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_longlong(long value)

    /**
     * Inserts the given <code>long</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>long</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_typecode(org.omg.CORBA.TypeCode value)

    /**
     * Inserts the given <code>org.omg.CORBA.TypeCode</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>org.omg.CORBA.TypeCode</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_reference(org.omg.CORBA.Object value)

    /**
     * Inserts the given <code>org.omg.CORBA.Object</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>org.omg.CORBA.Object</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_string(String value)

    /**
     * Inserts the given <code>String</code> object as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>String</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_double(double value)

    /**
     * Inserts the given <code>double</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>double</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_float(float value)

    /**
     * Inserts the given <code>float</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>float</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_ulong(int value)

    /**
     * Inserts the given <code>int</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>int</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_long(int value)

    /**
     * Inserts the given <code>int</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>int</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_ushort(short value)

    /**
     * Inserts the given <code>short</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>short</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_short(short value)

    /**
     * Inserts the given <code>short</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>short</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_char(char value)

    /**
     * Inserts the given <code>char</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>char</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_octet(byte value)

    /**
     * Inserts the given <code>byte</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>byte</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void insert_boolean(boolean value)

    /**
     * Inserts the given <code>boolean</code> as the value for this
     * <code>DynAny</code> object.
     *
     * <p> If this method is called on a constructed <code>DynAny</code>
     * object, it initializes the next component of the constructed data
     * value associated with this <code>DynAny</code> object.
     *
     * @param value the <code>boolean</code> to insert into this
     *              <code>DynAny</code> object
     * @throws org.omg.CORBA.DynAnyPackage.InvalidValue
     *            if the value inserted is not consistent with the type
     *            of the accessed component in this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public org.omg.CORBA.DynAny copy() ;

    /**
     * Clones this <code>DynAny</code> object.
     *
     * @return a copy of this <code>DynAny</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void destroy() ;

    /**
     * Destroys this <code>DynAny</code> object and frees any resources
     * used to represent the data value associated with it. This method
     * also destroys all <code>DynAny</code> objects obtained from it.
     * <p>
     * Destruction of <code>DynAny</code> objects should be handled with
     * care, taking into account issues dealing with the representation of
     * data values associated with <code>DynAny</code> objects.  A programmer
     * who wants to destroy a <code>DynAny</code> object but still be able
     * to manipulate some component of the data value associated with it,
     * should first create a <code>DynAny</code> object for the component
     * and then make a copy of the created <code>DynAny</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public org.omg.CORBA.Any to_any()

    /**
     * Convert a <code>DynAny</code> object to an <code>Any</code>
     * object.
     *
     * @return the <code>Any</code> object.
     * @throws Invalid if this <code>DynAny</code> is empty or
     *                    bad.
     *            created or does not contain a meaningful value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void from_any(org.omg.CORBA.Any value)

    /**
     * Make a <code>DynAny</code> object from an <code>Any</code>
     * object.
     *
     * @param value the <code>Any</code> object.
     * @throws Invalid if the source <code>Any</code> object is
     *                    empty or bad
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public void assign(org.omg.CORBA.DynAny dyn_any)

    /**
     * Copy the contents from one Dynamic Any into another.
     *
     * @param dyn_any the <code>DynAny</code> object whose contents
     *                are assigned to this <code>DynAny</code>.
     * @throws Invalid if the source <code>DynAny</code> is
     *            invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
    public org.omg.CORBA.TypeCode type() ;

    /**
     * Returns the <code>TypeCode</code> of the object inserted into
     * this <code>DynAny</code>.
     *
     * @return the <code>TypeCode</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynAny.java
@Deprecated

/** Enables <tt>org.omg.CORBA.Any</tt> values to be dynamically
 * interpreted (traversed) and
 *  constructed. A <tt>DynAny</tt> object is associated with a data value
 *  which may correspond to a copy of the value inserted into an <tt>Any</tt>.
 *  The <tt>DynAny</tt> APIs enable traversal of the data value associated with an
 *  Any at runtime and extraction of the primitive constituents of the
 *  data value.
 * @deprecated Use the new <a href="../DynamicAny/DynAny.html">DynAny</a> instead
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/DynAny.java
public interface DynAny extends DynAnyOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 

/**
    * Any values can be dynamically interpreted (traversed) and constructed through DynAny objects.
    * A DynAny object is associated with a data value which corresponds to a copy of the value
    * inserted into an any.
    * <P>A DynAny object may be viewed as an ordered collection of component DynAnys.
    * For DynAnys representing a basic type, such as long, or a type without components,
    * such as an empty exception, the ordered collection of components is empty.
    * Each DynAny object maintains the notion of a current position into its collection
    * of component DynAnys. The current position is identified by an index value that runs
    * from 0 to n-1, where n is the number of components.
    * The special index value -1 indicates a current position that points nowhere.
    * For values that cannot have a current position (such as an empty exception),
    * the index value is fixed at -1.
    * If a DynAny is initialized with a value that has components, the index is initialized to 0.
    * After creation of an uninitialized DynAny (that is, a DynAny that has no value but a TypeCode
    * that permits components), the current position depends on the type of value represented by
    * the DynAny. (The current position is set to 0 or -1, depending on whether the new DynAny
    * gets default values for its components.)
    * <P>The iteration operations rewind, seek, and next can be used to change the current position
    * and the current_component operation returns the component at the current position.
    * The component_count operation returns the number of components of a DynAny.
    * Collectively, these operations enable iteration over the components of a DynAny, for example,
    * to (recursively) examine its contents.
    * <P>A constructed DynAny object is a DynAny object associated with a constructed type.
    * There is a different interface, inheriting from the DynAny interface, associated with
    * each kind of constructed type in IDL (fixed, enum, struct, sequence, union, array,
    * exception, and value type).
    * <P>A constructed DynAny object exports operations that enable the creation of new DynAny objects,
    * each of them associated with a component of the constructed data value.
    * As an example, a DynStruct is associated with a struct value. This means that the DynStruct
    * may be seen as owning an ordered collection of components, one for each structure member.
    * The DynStruct object exports operations that enable the creation of new DynAny objects,
    * each of them associated with a member of the struct.
    * <P>If a DynAny object has been obtained from another (constructed) DynAny object,
    * such as a DynAny representing a structure member that was created from a DynStruct,
    * the member DynAny is logically contained in the DynStruct.
    * Calling an insert or get operation leaves the current position unchanged.
    * Destroying a top-level DynAny object (one that was not obtained as a component of another DynAny)
    * also destroys any component DynAny objects obtained from it.
    * Destroying a non-top level DynAny object does nothing.
    * Invoking operations on a destroyed top-level DynAny or any of its descendants raises OBJECT_NOT_EXIST.
    * If the programmer wants to destroy a DynAny object but still wants to manipulate some component
    * of the data value associated with it, then he or she should first create a DynAny for the component
    * and, after that, make a copy of the created DynAny object.
    * <P>The behavior of DynAny objects has been defined in order to enable efficient implementations
    * in terms of allocated memory space and speed of access. DynAny objects are intended to be used
    * for traversing values extracted from anys or constructing values of anys at runtime.
    * Their use for other purposes is not recommended.
    * <P>Insert and get operations are necessary to handle basic DynAny objects
    * but are also helpful to handle constructed DynAny objects.
    * Inserting a basic data type value into a constructed DynAny object
    * implies initializing the current component of the constructed data value
    * associated with the DynAny object. For example, invoking insert_boolean on a
    * DynStruct implies inserting a boolean data value at the current position
    * of the associated struct data value.
    * A type is consistent for inserting or extracting a value if its TypeCode is equivalent to
    * the TypeCode contained in the DynAny or, if the DynAny has components, is equivalent to the TypeCode
    * of the DynAny at the current position.
    * <P>DynAny and DynAnyFactory objects are intended to be local to the process in which they are
    * created and used. This means that references to DynAny and DynAnyFactory objects cannot be exported
    * to other processes, or externalized with ORB.object_to_string().
    * If any attempt is made to do so, the offending operation will raise a MARSHAL system exception.
    * Since their interfaces are specified in IDL, DynAny objects export operations defined in the standard
    * org.omg.CORBA.Object interface. However, any attempt to invoke operations exported through the Object
    * interface may raise the standard NO_IMPLEMENT exception.
    * An attempt to use a DynAny object with the DII may raise the NO_IMPLEMENT exception.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/DynAny.java


/**
* org/omg/DynamicAny/DynAny.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/
