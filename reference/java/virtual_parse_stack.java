_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/virtual_parse_stack.java
  public void push(int state_num)

  /** Push a state number onto the stack. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/virtual_parse_stack.java
  public void pop() throws java.lang.Exception

  /** Pop the stack. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/virtual_parse_stack.java
  public int top() throws java.lang.Exception

  /** Return value on the top of the stack (without popping it). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/virtual_parse_stack.java
  public boolean empty()

  /** Indicate whether the stack is empty. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/virtual_parse_stack.java
  protected void get_from_real()

  /** Transfer an element from the real to the virtual stack.  This assumes
   *  that the virtual stack is currently empty.
   */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/virtual_parse_stack.java
  protected Stack vstack;

  /** The virtual top portion of the stack.  This stack contains Integer
   *  objects with state numbers.  This stack shadows the top portion
   *  of the real stack within the area that has been modified (via operations
   *  on the virtual stack).  When this portion of the stack becomes empty we
   *  transfer elements from the underlying stack onto this stack.
   */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/virtual_parse_stack.java
  protected int real_next;

  /** Top of stack indicator for where we leave off in the real stack.
   *  This is measured from top of stack, so 0 would indicate that no
   *  elements have been "moved" from the real to virtual stack.
   */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/virtual_parse_stack.java
  protected Stack real_stack;

  /** The real stack that we shadow.  This is accessed when we move off
   *  the bottom of the virtual portion of the stack, but is always left
   *  unmodified.
   */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/virtual_parse_stack.java
  public virtual_parse_stack(Stack shadowing_stack) throws java.lang.Exception

  /** Constructor to build a virtual stack out of a real stack. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/virtual_parse_stack.java
public class virtual_parse_stack {

/** This class implements a temporary or "virtual" parse stack that
 *  replaces the top portion of the actual parse stack (the part that
 *  has been changed by some set of operations) while maintaining its
 *  original contents.  This data structure is used when the parse needs
 *  to "parse ahead" to determine if a given error recovery attempt will
 *  allow the parse to continue far enough to consider it successful.  Once
 *  success or failure of parse ahead is determined the system then
 *  reverts to the original parse stack (which has not actually been
 *  modified).  Since parse ahead does not execute actions, only parse
 *  state is maintained on the virtual stack, not full Symbol objects.
 *
 * @see     com.sun.java_cup.internal.runtime.lr_parser
 * @author  Frank Flannery
 */
