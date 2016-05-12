_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/SWITCH.java
  private final boolean matchIsOrdered(int max_gap) {

  /**
   * @return match is sorted in ascending order with no gap bigger than max_gap?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/SWITCH.java
  private final void sort(int l, int r) {

  /**
   * Sort match and targets array with QuickSort.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/SWITCH.java
  public SWITCH(int[] match, InstructionHandle[] targets,
                InstructionHandle target, int max_gap) {

  /**
   * Template for switch() constructs. If the match array can be
   * sorted in ascending order with gaps no larger than max_gap
   * between the numbers, a TABLESWITCH instruction is generated, and
   * a LOOKUPSWITCH otherwise. The former may be more efficient, but
   * needs more space.
   *
   * Note, that the key array always will be sorted, though we leave
   * the original arrays unaltered.
   *
   * @param match array of match values (case 2: ... case 7: ..., etc.)
   * @param targets the instructions to be branched to for each case
   * @param target the default target
   * @param max_gap maximum gap that may between case branches
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/SWITCH.java
public final class SWITCH implements CompoundInstruction {

/**
 * SWITCH - Branch depending on int value, generates either LOOKUPSWITCH or
 * TABLESWITCH instruction, depending on whether the match values (int[]) can be
 * sorted with no gaps between the numbers.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/SWITCH.java
  private final boolean matchIsOrdered(int max_gap) {

  /**
   * @return match is sorted in ascending order with no gap bigger than max_gap?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/SWITCH.java
  private final void sort(int l, int r) {

  /**
   * Sort match and targets array with QuickSort.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/SWITCH.java
  public SWITCH(int[] match, InstructionHandle[] targets,
                InstructionHandle target, int max_gap) {

  /**
   * Template for switch() constructs. If the match array can be
   * sorted in ascending order with gaps no larger than max_gap
   * between the numbers, a TABLESWITCH instruction is generated, and
   * a LOOKUPSWITCH otherwise. The former may be more efficient, but
   * needs more space.
   *
   * Note, that the key array always will be sorted, though we leave
   * the original arrays unaltered.
   *
   * @param match array of match values (case 2: ... case 7: ..., etc.)
   * @param targets the instructions to be branched to for each case
   * @param target the default target
   * @param max_gap maximum gap that may between case branches
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/SWITCH.java
public final class SWITCH implements CompoundInstruction {

/**
 * SWITCH - Branch depending on int value, generates either LOOKUPSWITCH or
 * TABLESWITCH instruction, depending on whether the match values (int[]) can be
 * sorted with no gaps between the numbers.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
