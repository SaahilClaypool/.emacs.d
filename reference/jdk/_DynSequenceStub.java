_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public org.omg.DynamicAny.DynAny current_component () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch

  /**
        * Returns the DynAny for the component at the current position.
        * It does not advance the current position, so repeated calls to current_component
        * without an intervening call to rewind, next, or seek return the same component.
        * The returned DynAny object reference can be used to get/set the value of the current component.
        * If the current component represents a complex type, the returned reference can be narrowed
        * based on the TypeCode to get the interface corresponding to the to the complex type.
        * Calling current_component on a DynAny that cannot have components,
        * such as a DynEnum or an empty exception, raises TypeMismatch.
        * Calling current_component on a DynAny whose current position is -1 returns a nil reference.
        * The iteration operations, together with current_component, can be used
        * to dynamically compose an any value. After creating a dynamic any, such as a DynStruct,
        * current_component and next can be used to initialize all the components of the value.
        * Once the dynamic value is completely initialized, to_any creates the corresponding any value.
        *
        * @exception TypeMismatch If called on a DynAny that cannot have components,
        * such as a DynEnum or an empty exception
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public int component_count ()

  /**
        * Returns the number of components of a DynAny.
        * For a DynAny without components, it returns zero.
        * The operation only counts the components at the top level.
        * For example, if component_count is invoked on a DynStruct with a single member,
        * the return value is 1, irrespective of the type of the member.
        * <UL>
        * <LI>For sequences, the operation returns the current number of elements.
        * <LI>For structures, exceptions, and value types, the operation returns the number of members.
        * <LI>For arrays, the operation returns the number of elements.
        * <LI>For unions, the operation returns 2 if the discriminator indicates that a named member is active,
        * otherwise, it returns 1.
        * <LI>For DynFixed and DynEnum, the operation returns zero.
        * </UL>
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public boolean next ()

  /**
        * Advances the current position to the next component.
        * The operation returns true while the resulting current position indicates a component, false otherwise.
        * A false return value leaves the current position at -1.
        * Invoking next on a DynAny without components leaves the current position at -1 and returns false.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void rewind ()

  /**
        * Is equivalent to seek(0).
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public boolean seek (int index)

  /**
        * Sets the current position to index. The current position is indexed 0 to n-1, that is,
        * index zero corresponds to the first component. The operation returns true if the resulting
        * current position indicates a component of the DynAny and false if index indicates
        * a position that does not correspond to a component.
        * Calling seek with a negative index is legal. It sets the current position to -1 to indicate
        * no component and returns false. Passing a non-negative index value for a DynAny that does not
        * have a component at the corresponding position sets the current position to -1 and returns false.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public java.io.Serializable get_val () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts a Serializable object from this DynAny.
        * The IDL ValueBase type is mapped to the Java Serializable type.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public org.omg.DynamicAny.DynAny get_dyn_any () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the Any value contained in the Any represented by this DynAny and returns it wrapped
        * into a new DynAny.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public org.omg.CORBA.Any get_any () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts an Any value contained in the Any represented by this DynAny.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public String get_wstring () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the string value from this DynAny.
        * Both bounded and unbounded strings are extracted using this method.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public char get_wchar () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the long value from this DynAny. The IDL wchar data type is mapped to the Java char data type.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public long get_ulonglong () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the long value from this DynAny.
        * The IDL unsigned long long data type is mapped to the Java long data type.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public long get_longlong () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the long value from this DynAny. The IDL long long data type is mapped to the Java long data type.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public org.omg.CORBA.TypeCode get_typecode () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the TypeCode object from this DynAny.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public org.omg.CORBA.Object get_reference () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the reference to a CORBA Object from this DynAny.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public String get_string () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the string value from this DynAny.
        * Both bounded and unbounded strings are extracted using this method.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public double get_double () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the double value from this DynAny.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public float get_float () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the float value from this DynAny.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public int get_ulong () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the integer value from this DynAny. The IDL ulong data type is mapped to the Java int data type.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public int get_long () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the integer value from this DynAny. The IDL long data type is mapped to the Java int data type.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public short get_ushort () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the short value from this DynAny. The IDL ushort data type is mapped to the Java short data type.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public short get_short () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the short value from this DynAny.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public char get_char () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the char value from this DynAny.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public byte get_octet () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the byte value from this DynAny. The IDL octet data type is mapped to the Java byte data type.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public boolean get_boolean () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Extracts the boolean value from this DynAny.
        *
        * @exception TypeMismatch if the accessed component in the DynAny is of a type
        * that is not equivalent to the requested type.
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_val (java.io.Serializable value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a reference to a Serializable object into this DynAny.
        * The IDL ValueBase type is mapped to the Java Serializable type.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_dyn_any (org.omg.DynamicAny.DynAny value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts the Any value contained in the parameter DynAny into the Any represented by this DynAny.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_any (org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts an Any value into the Any represented by this DynAny.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_wstring (String value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a string value into the DynAny.
        * Both bounded and unbounded strings are inserted using this method.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception InvalidValue if the string inserted is longer than the bound of a bounded string
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_wchar (char value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a char value into the DynAny. The IDL wchar data type is mapped to the Java char data type.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_ulonglong (long value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a long value into the DynAny.
        * The IDL unsigned long long data type is mapped to the Java long data type.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_longlong (long value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a long value into the DynAny. The IDL long long data type is mapped to the Java long data type.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_typecode (org.omg.CORBA.TypeCode value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a TypeCode object into the DynAny.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_reference (org.omg.CORBA.Object value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a reference to a CORBA object into the DynAny.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_string (String value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a string value into the DynAny.
        * Both bounded and unbounded strings are inserted using this method.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception InvalidValue if the string inserted is longer than the bound of a bounded string
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_double (double value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a double value into the DynAny.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_float (float value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a float value into the DynAny.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_ulong (int value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts an integer value into the DynAny. The IDL ulong data type is mapped to the Java int data type.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_long (int value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts an integer value into the DynAny. The IDL long data type is mapped to the Java int data type.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_ushort (short value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a short value into the DynAny. The IDL ushort data type is mapped to the Java short data type.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_short (short value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a short value into the DynAny.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_char (char value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a char value into the DynAny.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_octet (byte value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a byte value into the DynAny. The IDL octet data type is mapped to the Java byte data type.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void insert_boolean (boolean value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Inserts a boolean value into the DynAny.
        *
        * @exception InvalidValue if this DynAny has components but has a current position of -1
        * @exception TypeMismatch if called on a DynAny whose current component itself has components
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public org.omg.DynamicAny.DynAny copy ()

  /**
        * Creates a new DynAny object whose value is a deep copy of the DynAny on which it is invoked.
        * The operation is polymorphic, that is, invoking it on one of the types derived from DynAny,
        * such as DynStruct, creates the derived type but returns its reference as the DynAny base type.
        *
        * @return a deep copy of the DynAny object
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void destroy ()

  /**
        * Destroys a DynAny object.
        * This operation frees any resources used to represent the data value associated with a DynAny object.
        * It must be invoked on references obtained from one of the creation operations on the ORB interface
        * or on a reference returned by DynAny.copy() to avoid resource leaks.
        * Invoking destroy on component DynAny objects (for example, on objects returned by the
        * current_component operation) does nothing.
        * Destruction of a DynAny object implies destruction of all DynAny objects obtained from it.
        * That is, references to components of a destroyed DynAny become invalid.
        * Invocations on such references raise OBJECT_NOT_EXIST.
        * It is possible to manipulate a component of a DynAny beyond the life time of the DynAny
        * from which the component was obtained by making a copy of the component with the copy operation
        * before destroying the DynAny from which the component was obtained.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public boolean equal (org.omg.DynamicAny.DynAny dyn_any)

  /**
        * Compares two DynAny values for equality.
        * Two DynAny values are equal if their TypeCodes are equivalent and, recursively, all component DynAnys
        * have equal values.
        * The current position of the two DynAnys being compared has no effect on the result of equal.
        *
        * @return true of the DynAnys are equal, false otherwise
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public org.omg.CORBA.Any to_any ()

  /**
        * Creates an any value from a DynAny object.
        * A copy of the TypeCode associated with the DynAny object is assigned to the resulting any.
        * The value associated with the DynAny object is copied into the any.
        *
        * @return a new Any object with the same value and TypeCode
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void from_any (org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Initializes the value associated with a DynAny object with the value contained in an any.
        * The current position of the target DynAny is set to zero for values that have components
        * and to -1 for values that do not have components.
        *
        * @exception TypeMismatch if the type of the passed Any is not equivalent to the type of target DynAny
        * @exception InvalidValue if the passed Any does not contain a legal value (such as a null string)
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void assign (org.omg.DynamicAny.DynAny dyn_any) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch

  /**
        * Initializes the value associated with a DynAny object with the value
        * associated with another DynAny object.
        * The current position of the target DynAny is set to zero for values that have components
        * and to -1 for values that do not have components.
        *
        * @param dyn_any
        * @exception TypeMismatch if the type of the passed DynAny is not equivalent to the type of target DynAny
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public org.omg.CORBA.TypeCode type ()

  /**
        * Returns the TypeCode associated with this DynAny object.
        * A DynAny object is created with a TypeCode value assigned to it.
        * This TypeCode value determines the type of the value handled through the DynAny object.
        * Note that the TypeCode associated with a DynAny object is initialized at the time the
        * DynAny is created and cannot be changed during lifetime of the DynAny object.
        *
        * @return The TypeCode associated with this DynAny object
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void set_elements_as_dyn_any (org.omg.DynamicAny.DynAny[] value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Sets the elements of a sequence using DynAnys.
        * The length of the DynSequence is set to the length of value. The current position is set to zero
        * if value has non-zero length and to -1 if value is a zero-length sequence.
        *
        * @exception TypeMismatch if value contains one or more elements whose TypeCode is not equivalent
        *            to the element TypeCode of the DynSequence
        * @exception InvalidValue if the length of value exceeds the bound of a bounded sequence
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public org.omg.DynamicAny.DynAny[] get_elements_as_dyn_any ()

  /**
        * Returns the DynAnys representing the elements of the sequence.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void set_elements (org.omg.CORBA.Any[] value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Sets the elements of a sequence.
        * The length of the DynSequence is set to the length of value. The current position is set to zero
        * if value has non-zero length and to -1 if value is a zero-length sequence.
        *
        * @exception TypeMismatch if value contains one or more elements whose TypeCode is not equivalent
        *            to the element TypeCode of the DynSequence
        * @exception InvalidValue if the length of value exceeds the bound of a bounded sequence
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public org.omg.CORBA.Any[] get_elements ()

  /**
        * Returns the elements of the sequence.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public void set_length (int len) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue

  /**
        * Sets the length of the sequence.
        * Increasing the length of a sequence adds new elements at the tail without affecting the values
        * of already existing elements. Newly added elements are default-initialized.
        * Increasing the length of a sequence sets the current position to the first newly-added element
        * if the previous current position was -1. Otherwise, if the previous current position was not -1,
        * the current position is not affected.
        * Decreasing the length of a sequence removes elements from the tail without affecting the value
        * of those elements that remain. The new current position after decreasing the length of a sequence
        * is determined as follows:
        * <UL>
        * <LI>If the length of the sequence is set to zero, the current position is set to -1.
        * <LI>If the current position is -1 before decreasing the length, it remains at -1.
        * <LI>If the current position indicates a valid element and that element is not removed when the length
        *     is decreased, the current position remains unaffected.
        * <LI>If the current position indicates a valid element and that element is removed,
        *     the current position is set to -1.
        * </UL>
        *
        * @exception InvalidValue if this is a bounded sequence and len is larger than the bound
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
  public int get_length ()

  /**
        * Returns the current length of the sequence.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java
public class _DynSequenceStub extends org.omg.CORBA.portable.ObjectImpl implements org.omg.DynamicAny.DynSequence

/**
    * DynSequence objects support the manipulation of IDL sequences.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/_DynSequenceStub.java


/**
* org/omg/DynamicAny/_DynSequenceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/
