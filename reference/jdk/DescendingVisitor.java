_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/DescendingVisitor.java
  public void visit() { clazz.accept(this); }

  /**
   * Start traversal.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/DescendingVisitor.java
  public DescendingVisitor(JavaClass clazz, Visitor visitor) {

  /**
   * @param clazz Class to traverse
   * @param visitor visitor object to apply to all components
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/DescendingVisitor.java
  public Object current() {

  /** @return current object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/DescendingVisitor.java
  public Object predecessor(int level) {

  /**
   * @param level nesting level, i.e., 0 returns the direct predecessor
   * @return container of current entitity, i.e., predecessor during traversal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/DescendingVisitor.java
  public Object predecessor() {

  /** @return container of current entitity, i.e., predecessor during traversal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/DescendingVisitor.java
public class DescendingVisitor implements Visitor {

/**
 * Traverses a JavaClass with another Visitor object 'piggy-backed'
 * that is applied to all components of a JavaClass object. I.e. this
 * class supplies the traversal strategy, other classes can make use
 * of it.
 *
 * @author <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/DescendingVisitor.java
  public void visit() { clazz.accept(this); }

  /**
   * Start traversal.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/DescendingVisitor.java
  public DescendingVisitor(JavaClass clazz, Visitor visitor) {

  /**
   * @param clazz Class to traverse
   * @param visitor visitor object to apply to all components
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/DescendingVisitor.java
  public Object current() {

  /** @return current object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/DescendingVisitor.java
  public Object predecessor(int level) {

  /**
   * @param level nesting level, i.e., 0 returns the direct predecessor
   * @return container of current entitity, i.e., predecessor during traversal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/DescendingVisitor.java
  public Object predecessor() {

  /** @return container of current entitity, i.e., predecessor during traversal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/DescendingVisitor.java
public class DescendingVisitor implements Visitor {

/**
 * Traverses a JavaClass with another Visitor object 'piggy-backed'
 * that is applied to all components of a JavaClass object. I.e. this
 * class supplies the traversal strategy, other classes can make use
 * of it.
 *
 * @author <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
