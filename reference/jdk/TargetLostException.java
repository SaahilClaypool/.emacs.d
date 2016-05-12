_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/TargetLostException.java
  public InstructionHandle[] getTargets() { return targets; }

  /**
   * @return list of instructions still being targeted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/TargetLostException.java
public final class TargetLostException extends Exception {

/**
 * Thrown by InstructionList.remove() when one or multiple disposed instruction
 * are still being referenced by a InstructionTargeter object. I.e. the
 * InstructionTargeter has to be notified that (one of) the InstructionHandle it
 * is referencing is being removed from the InstructionList and thus not valid anymore.
 *
 * Making this an exception instead of a return value forces the user to handle
 * these case explicitely in a try { ... } catch. The following code illustrates
 * how this may be done:
 *
 * <PRE>
 *     ...
 *     try {
 *      il.delete(start_ih, end_ih);
 *     } catch(TargetLostException e) {
 *       InstructionHandle[] targets = e.getTargets();
 *       for(int i=0; i < targets.length; i++) {
 *         InstructionTargeter[] targeters = targets[i].getTargeters();
 *
 *         for(int j=0; j < targeters.length; j++)
 *           targeters[j].updateTarget(targets[i], new_target);
 *       }
 *     }
 * </PRE>
 *
 * @see InstructionHandle
 * @see InstructionList
 * @see InstructionTargeter
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/TargetLostException.java
  public InstructionHandle[] getTargets() { return targets; }

  /**
   * @return list of instructions still being targeted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/TargetLostException.java
public final class TargetLostException extends Exception {

/**
 * Thrown by InstructionList.remove() when one or multiple disposed instruction
 * are still being referenced by a InstructionTargeter object. I.e. the
 * InstructionTargeter has to be notified that (one of) the InstructionHandle it
 * is referencing is being removed from the InstructionList and thus not valid anymore.
 *
 * Making this an exception instead of a return value forces the user to handle
 * these case explicitely in a try { ... } catch. The following code illustrates
 * how this may be done:
 *
 * <PRE>
 *     ...
 *     try {
 *      il.delete(start_ih, end_ih);
 *     } catch(TargetLostException e) {
 *       InstructionHandle[] targets = e.getTargets();
 *       for(int i=0; i < targets.length; i++) {
 *         InstructionTargeter[] targeters = targets[i].getTargeters();
 *
 *         for(int j=0; j < targeters.length; j++)
 *           targeters[j].updateTarget(targets[i], new_target);
 *       }
 *     }
 * </PRE>
 *
 * @see InstructionHandle
 * @see InstructionList
 * @see InstructionTargeter
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
