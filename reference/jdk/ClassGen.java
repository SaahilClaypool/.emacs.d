_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void update() {

  /** Call notify() method on all observers. This method is not called
   * automatically whenever the state has changed, but has to be
   * called by the user after he has finished editing the object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void removeObserver(ClassObserver o) {

  /** Remove observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void addObserver(ClassObserver o) {

  /** Add observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void removeField(Field f)         { field_vec.remove(f); }

  /**
   * Remove a field to this class.
   * @param f field to remove
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void replaceField(Field old, Field new_) {

  /** Replace given field with new one. If the old one does not exist
   * add the new_ field to the class anyway.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void replaceMethod(Method old, Method new_) {

  /** Replace given method with new one. If the old one does not exist
   * add the new_ method to the class anyway.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void removeMethod(Method m)       { method_vec.remove(m); }

  /**
   * Remove a method from this class.
   * @param m method to remove
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void removeAttribute(Attribute a) { attribute_vec.remove(a); }

  /**
   * Remove an attribute from this class.
   * @param a attribute to remove
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public Method containsMethod(String name, String signature) {

  /** @return method object with given name and signature, or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public Field containsField(String name) {

  /** @return field object with given name, or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void addField(Field f)            { field_vec.add(f); }

  /**
   * Add a field to this class.
   * @param f field to add
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void addEmptyConstructor(int access_flags) {

  /**
   * Convenience method.
   *
   * Add an empty constructor to this class that does nothing but calling super().
   * @param access rights for constructor
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void addMethod(Method m)          { method_vec.add(m); }

  /**
   * Add a method to this class.
   * @param m method to add
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void addAttribute(Attribute a)    { attribute_vec.add(a); }

  /**
   * Add an attribute to this class.
   * @param a attribute to add
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public int  getMinor()      { return minor; }

  /**
   * @return minor version number of class file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void setMinor(int minor) {

  /** Set minor version number of class file, default value is 3 (JDK 1.1)
   * @param minor minor version number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void setMajor(int major) {

  /** Set major version number of class file, default value is 45 (JDK 1.1)
   * @param major major version number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public int  getMajor()      { return major; }

  /**
   * @return major version number of class file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void removeInterface(String name) {

  /**
   * Remove an interface from this class.
   * @param name interface to remove (fully qualified name)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void addInterface(String name) {

  /**
   * Add an interface to this class, i.e., this class has to implement it.
   * @param name interface to implement (fully qualified class name)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public JavaClass getJavaClass() {

  /**
   * @return the (finally) built up Java class object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public ClassGen(JavaClass clazz) {

  /**
   * Initialize with existing class.
   * @param clazz JavaClass object (e.g. read from file)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public ClassGen(String class_name, String super_class_name, String file_name,
                  int access_flags, String[] interfaces) {

  /** Convenience constructor to set up some important values initially.
   *
   * @param class_name fully qualified class name
   * @param super_class_name fully qualified superclass name
   * @param file_name source file name
   * @param access_flags access qualifiers
   * @param interfaces implemented interfaces
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public ClassGen(String class_name, String super_class_name, String file_name,
                  int access_flags, String[] interfaces, ConstantPoolGen cp) {

  /** Convenience constructor to set up some important values initially.
   *
   * @param class_name fully qualified class name
   * @param super_class_name fully qualified superclass name
   * @param file_name source file name
   * @param access_flags access qualifiers
   * @param interfaces implemented interfaces
   * @param cp constant pool to use
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
public class ClassGen extends AccessFlags implements Cloneable {

/**
 * Template class for building up a java class. May be initialized with an
 * existing java class (file).
 *
 * @see JavaClass
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void update() {

  /** Call notify() method on all observers. This method is not called
   * automatically whenever the state has changed, but has to be
   * called by the user after he has finished editing the object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void removeObserver(ClassObserver o) {

  /** Remove observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void addObserver(ClassObserver o) {

  /** Add observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void removeField(Field f)         { field_vec.remove(f); }

  /**
   * Remove a field to this class.
   * @param f field to remove
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void replaceField(Field old, Field new_) {

  /** Replace given field with new one. If the old one does not exist
   * add the new_ field to the class anyway.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void replaceMethod(Method old, Method new_) {

  /** Replace given method with new one. If the old one does not exist
   * add the new_ method to the class anyway.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void removeMethod(Method m)       { method_vec.remove(m); }

  /**
   * Remove a method from this class.
   * @param m method to remove
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void removeAttribute(Attribute a) { attribute_vec.remove(a); }

  /**
   * Remove an attribute from this class.
   * @param a attribute to remove
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public Method containsMethod(String name, String signature) {

  /** @return method object with given name and signature, or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public Field containsField(String name) {

  /** @return field object with given name, or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void addField(Field f)            { field_vec.add(f); }

  /**
   * Add a field to this class.
   * @param f field to add
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void addEmptyConstructor(int access_flags) {

  /**
   * Convenience method.
   *
   * Add an empty constructor to this class that does nothing but calling super().
   * @param access rights for constructor
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void addMethod(Method m)          { method_vec.add(m); }

  /**
   * Add a method to this class.
   * @param m method to add
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void addAttribute(Attribute a)    { attribute_vec.add(a); }

  /**
   * Add an attribute to this class.
   * @param a attribute to add
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public int  getMinor()      { return minor; }

  /**
   * @return minor version number of class file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void setMinor(int minor) {

  /** Set minor version number of class file, default value is 3 (JDK 1.1)
   * @param minor minor version number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void setMajor(int major) {

  /** Set major version number of class file, default value is 45 (JDK 1.1)
   * @param major major version number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public int  getMajor()      { return major; }

  /**
   * @return major version number of class file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void removeInterface(String name) {

  /**
   * Remove an interface from this class.
   * @param name interface to remove (fully qualified name)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public void addInterface(String name) {

  /**
   * Add an interface to this class, i.e., this class has to implement it.
   * @param name interface to implement (fully qualified class name)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public JavaClass getJavaClass() {

  /**
   * @return the (finally) built up Java class object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public ClassGen(JavaClass clazz) {

  /**
   * Initialize with existing class.
   * @param clazz JavaClass object (e.g. read from file)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public ClassGen(String class_name, String super_class_name, String file_name,
                  int access_flags, String[] interfaces) {

  /** Convenience constructor to set up some important values initially.
   *
   * @param class_name fully qualified class name
   * @param super_class_name fully qualified superclass name
   * @param file_name source file name
   * @param access_flags access qualifiers
   * @param interfaces implemented interfaces
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
  public ClassGen(String class_name, String super_class_name, String file_name,
                  int access_flags, String[] interfaces, ConstantPoolGen cp) {

  /** Convenience constructor to set up some important values initially.
   *
   * @param class_name fully qualified class name
   * @param super_class_name fully qualified superclass name
   * @param file_name source file name
   * @param access_flags access qualifiers
   * @param interfaces implemented interfaces
   * @param cp constant pool to use
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ClassGen.java
public class ClassGen extends AccessFlags implements Cloneable {

/**
 * Template class for building up a java class. May be initialized with an
 * existing java class (file).
 *
 * @see JavaClass
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
