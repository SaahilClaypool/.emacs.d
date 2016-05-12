_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LoadClass.java
  public Type getType(ConstantPoolGen cpg);

  /**
   * Returns the type associated with this instruction.
   * LoadClass instances are always typed, but this type
   * does not always refer to the type of the class or interface
   * that it possibly forces to load. For example, GETFIELD would
   * return the type of the field and not the type of the class
   * where the field is defined.
   * If no class is forced to be loaded, <B>null</B> is returned.
   * An example for this is an ANEWARRAY instruction that creates
   * an int[][].
   * @see #getLoadClassType(ConstantPoolGen)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LoadClass.java
public interface LoadClass {

/**
 * Denotes that an instruction may start the process of loading and resolving
 * the referenced class in the Virtual Machine.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LoadClass.java
  public Type getType(ConstantPoolGen cpg);

  /**
   * Returns the type associated with this instruction.
   * LoadClass instances are always typed, but this type
   * does not always refer to the type of the class or interface
   * that it possibly forces to load. For example, GETFIELD would
   * return the type of the field and not the type of the class
   * where the field is defined.
   * If no class is forced to be loaded, <B>null</B> is returned.
   * An example for this is an ANEWARRAY instruction that creates
   * an int[][].
   * @see #getLoadClassType(ConstantPoolGen)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LoadClass.java
public interface LoadClass {

/**
 * Denotes that an instruction may start the process of loading and resolving
 * the referenced class in the Virtual Machine.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
