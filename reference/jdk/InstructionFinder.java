_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public interface CodeConstraint {

  /**
   * Code patterns found may be checked using an additional
   * user-defined constraint object whether they really match the needed criterion.
   * I.e., check constraints that can not expressed with regular expressions.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public final InstructionList getInstructionList() { return il; }

  /**
   * @return the inquired instruction list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  private static final char makeChar(short opcode) {

  /**
   * Convert opcode number to char.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public final Iterator search(String pattern, CodeConstraint constraint) {

  /**
   * Start search beginning from the start of the given instruction list.
   * Check found matches with the constraint object.
   *
   * @param pattern the instruction pattern to search for, case is ignored
   * @param constraint constraints to be checked on matching code
   * @return instruction handle or `null' if the match failed
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public final Iterator search(String pattern, InstructionHandle from) {

  /**
   * Start search beginning from `from'.
   *
   * @param pattern the instruction pattern to search for, where case is ignored
   * @param from where to start the search in the instruction list
   * @return  iterator of matches where e.nextElement() returns an array of instruction handles
   * describing the matched area
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public final Iterator search(String pattern) {

  /**
   * Start search beginning from the start of the given instruction list.
   *
   * @param pattern the instruction pattern to search for, where case is ignored
   * @return iterator of matches where e.nextElement()
   * returns an array of instruction handles describing the matched
   * area
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public final Iterator search(String pattern, InstructionHandle from,
                               CodeConstraint constraint)

  /**
   * Search for the given pattern in the instruction list. You can search for any valid
   * opcode via its symbolic name, e.g. "istore". You can also use a super class or
   * an interface name to match a whole set of instructions, e.g. "BranchInstruction" or
   * "LoadInstruction". "istore" is also an alias for all "istore_x" instructions. Additional
   * aliases are "if" for "ifxx", "if_icmp" for "if_icmpxx", "if_acmp" for "if_acmpxx".
   *
   * Consecutive instruction names must be separated by white space which will be removed
   * during the compilation of the pattern.
   *
   * For the rest the usual pattern matching rules for regular expressions apply.<P>
   * Example pattern:
   * <pre>
     search("BranchInstruction NOP ((IfInstruction|GOTO)+ ISTORE Instruction)*");
   * </pre>
   *
   * <p>If you alter the instruction list upon a match such that other
   * matching areas are affected, you should call reread() to update
   * the finder and call search() again, because the matches are cached.
   *
   * @param pattern the instruction pattern to search for, where case is ignored
   * @param from where to start the search in the instruction list
   * @param constraint optional CodeConstraint to check the found code pattern for
   * user-defined constraints
   * @return iterator of matches where e.nextElement() returns an array of instruction handles
   * describing the matched area
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  private InstructionHandle[] getMatch(int matched_from, int match_length) {

  /**
   * @return the matched piece of code as an array of instruction (handles)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  private static final String compilePattern(String pattern) {

  /**
   * Replace symbolic names of instructions with the appropiate character and remove
   * all white space from string. Meta characters such as +, * are ignored.
   *
   * @param pattern The pattern to compile
   * @return translated regular expression string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  private static final String mapName(String pattern) {

  /**
   * Map symbolic instruction names like "getfield" to a single character.
   *
   * @param pattern instruction pattern in lower case
   * @return encoded string for a pattern such as "BranchInstruction".
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public final void reread() {

  /**
   * Reread the instruction list, e.g., after you've altered the list upon a match.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public InstructionFinder(InstructionList il) {

  /**
   * @param il instruction list to search for given patterns
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
public class InstructionFinder {

/**
 * InstructionFinder is a tool to search for given instructions patterns,
 * i.e., match sequences of instructions in an instruction list via
 * regular expressions. This can be used, e.g., in order to implement
 * a peep hole optimizer that looks for code patterns and replaces
 * them with faster equivalents.
 *
 * <p>This class internally uses the <a href="http://jakarta.apache.org/regexp/">
 * Regexp</a> package to search for regular expressions.
 *
 * A typical application would look like this:
<pre>
    InstructionFinder f   = new InstructionFinder(il);
    String            pat = "IfInstruction ICONST_0 GOTO ICONST_1 NOP (IFEQ|IFNE)";

    for(Iterator i = f.search(pat, constraint); i.hasNext(); ) {
      InstructionHandle[] match = (InstructionHandle[])i.next();
      ...
      il.delete(match[1], match[5]);
      ...
    }
</pre>
 * @author  <A HREF="http://www.berlin.de/~markus.dahm/">M. Dahm</A>
 * @see Instruction
 * @see InstructionList
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public interface CodeConstraint {

  /**
   * Code patterns found may be checked using an additional
   * user-defined constraint object whether they really match the needed criterion.
   * I.e., check constraints that can not expressed with regular expressions.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public final InstructionList getInstructionList() { return il; }

  /**
   * @return the inquired instruction list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  private static final char makeChar(short opcode) {

  /**
   * Convert opcode number to char.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public final Iterator search(String pattern, CodeConstraint constraint) {

  /**
   * Start search beginning from the start of the given instruction list.
   * Check found matches with the constraint object.
   *
   * @param pattern the instruction pattern to search for, case is ignored
   * @param constraint constraints to be checked on matching code
   * @return instruction handle or `null' if the match failed
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public final Iterator search(String pattern, InstructionHandle from) {

  /**
   * Start search beginning from `from'.
   *
   * @param pattern the instruction pattern to search for, where case is ignored
   * @param from where to start the search in the instruction list
   * @return  iterator of matches where e.nextElement() returns an array of instruction handles
   * describing the matched area
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public final Iterator search(String pattern) {

  /**
   * Start search beginning from the start of the given instruction list.
   *
   * @param pattern the instruction pattern to search for, where case is ignored
   * @return iterator of matches where e.nextElement()
   * returns an array of instruction handles describing the matched
   * area
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public final Iterator search(String pattern, InstructionHandle from,
                               CodeConstraint constraint)

  /**
   * Search for the given pattern in the instruction list. You can search for any valid
   * opcode via its symbolic name, e.g. "istore". You can also use a super class or
   * an interface name to match a whole set of instructions, e.g. "BranchInstruction" or
   * "LoadInstruction". "istore" is also an alias for all "istore_x" instructions. Additional
   * aliases are "if" for "ifxx", "if_icmp" for "if_icmpxx", "if_acmp" for "if_acmpxx".
   *
   * Consecutive instruction names must be separated by white space which will be removed
   * during the compilation of the pattern.
   *
   * For the rest the usual pattern matching rules for regular expressions apply.<P>
   * Example pattern:
   * <pre>
     search("BranchInstruction NOP ((IfInstruction|GOTO)+ ISTORE Instruction)*");
   * </pre>
   *
   * <p>If you alter the instruction list upon a match such that other
   * matching areas are affected, you should call reread() to update
   * the finder and call search() again, because the matches are cached.
   *
   * @param pattern the instruction pattern to search for, where case is ignored
   * @param from where to start the search in the instruction list
   * @param constraint optional CodeConstraint to check the found code pattern for
   * user-defined constraints
   * @return iterator of matches where e.nextElement() returns an array of instruction handles
   * describing the matched area
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  private InstructionHandle[] getMatch(int matched_from, int match_length) {

  /**
   * @return the matched piece of code as an array of instruction (handles)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  private static final String compilePattern(String pattern) {

  /**
   * Replace symbolic names of instructions with the appropiate character and remove
   * all white space from string. Meta characters such as +, * are ignored.
   *
   * @param pattern The pattern to compile
   * @return translated regular expression string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  private static final String mapName(String pattern) {

  /**
   * Map symbolic instruction names like "getfield" to a single character.
   *
   * @param pattern instruction pattern in lower case
   * @return encoded string for a pattern such as "BranchInstruction".
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public final void reread() {

  /**
   * Reread the instruction list, e.g., after you've altered the list upon a match.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
  public InstructionFinder(InstructionList il) {

  /**
   * @param il instruction list to search for given patterns
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/InstructionFinder.java
public class InstructionFinder {

/**
 * InstructionFinder is a tool to search for given instructions patterns,
 * i.e., match sequences of instructions in an instruction list via
 * regular expressions. This can be used, e.g., in order to implement
 * a peep hole optimizer that looks for code patterns and replaces
 * them with faster equivalents.
 *
 * <p>This class internally uses the <a href="http://jakarta.apache.org/regexp/">
 * Regexp</a> package to search for regular expressions.
 *
 * A typical application would look like this:
<pre>
    InstructionFinder f   = new InstructionFinder(il);
    String            pat = "IfInstruction ICONST_0 GOTO ICONST_1 NOP (IFEQ|IFNE)";

    for(Iterator i = f.search(pat, constraint); i.hasNext(); ) {
      InstructionHandle[] match = (InstructionHandle[])i.next();
      ...
      il.delete(match[1], match[5]);
      ...
    }
</pre>
 * @author  <A HREF="http://www.berlin.de/~markus.dahm/">M. Dahm</A>
 * @see Instruction
 * @see InstructionList
 */
