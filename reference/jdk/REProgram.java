_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REProgram.java
    public void setInstructions(char[] instruction, int lenInstruction)

    /**
     * Sets a new regular expression program to run.  It is this method which
     * performs any special compile-time search optimizations.  Currently only
     * two optimizations are in place - one which checks for backreferences
     * (so that they can be lazily allocated) and another which attempts to
     * find an prefix anchor string so that substantial amounts of input can
     * potentially be skipped without running the actual program.
     * @param instruction Program instruction buffer
     * @param lenInstruction Length of instruction buffer in use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REProgram.java
    public char[] getInstructions()

    /**
     * Returns a copy of the current regular expression program in a character
     * array that is exactly the right length to hold the program.  If there is
     * no program compiled yet, getInstructions() will return null.
     * @return A copy of the current compiled RE program
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REProgram.java
    public REProgram(char[] instruction, int lenInstruction)

    /**
     * Constructs a program object from a character array
     * @param instruction Character array with RE opcode instructions in it
     * @param lenInstruction Amount of instruction array in use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REProgram.java
    public REProgram(int parens, char[] instruction)

    /**
     * Constructs a program object from a character array
     * @param parens Count of parens in the program
     * @param instruction Character array with RE opcode instructions in it
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REProgram.java
    public REProgram(char[] instruction)

    /**
     * Constructs a program object from a character array
     * @param instruction Character array with RE opcode instructions in it
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REProgram.java
public class REProgram implements Serializable

/**
 * A class that holds compiled regular expressions.  This is exposed mainly
 * for use by the recompile utility (which helps you produce precompiled
 * REProgram objects). You should not otherwise need to work directly with
 * this class.
*
 * @see RE
 * @see RECompiler
 *
 * @author <a href="mailto:jonl@muppetlabs.com">Jonathan Locke</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REProgram.java
    public void setInstructions(char[] instruction, int lenInstruction)

    /**
     * Sets a new regular expression program to run.  It is this method which
     * performs any special compile-time search optimizations.  Currently only
     * two optimizations are in place - one which checks for backreferences
     * (so that they can be lazily allocated) and another which attempts to
     * find an prefix anchor string so that substantial amounts of input can
     * potentially be skipped without running the actual program.
     * @param instruction Program instruction buffer
     * @param lenInstruction Length of instruction buffer in use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REProgram.java
    public char[] getInstructions()

    /**
     * Returns a copy of the current regular expression program in a character
     * array that is exactly the right length to hold the program.  If there is
     * no program compiled yet, getInstructions() will return null.
     * @return A copy of the current compiled RE program
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REProgram.java
    public REProgram(char[] instruction, int lenInstruction)

    /**
     * Constructs a program object from a character array
     * @param instruction Character array with RE opcode instructions in it
     * @param lenInstruction Amount of instruction array in use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REProgram.java
    public REProgram(int parens, char[] instruction)

    /**
     * Constructs a program object from a character array
     * @param parens Count of parens in the program
     * @param instruction Character array with RE opcode instructions in it
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REProgram.java
    public REProgram(char[] instruction)

    /**
     * Constructs a program object from a character array
     * @param instruction Character array with RE opcode instructions in it
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REProgram.java
public class REProgram implements Serializable

/**
 * A class that holds compiled regular expressions.  This is exposed mainly
 * for use by the recompile utility (which helps you produce precompiled
 * REProgram objects). You should not otherwise need to work directly with
 * this class.
*
 * @see RE
 * @see RECompiler
 *
 * @author <a href="mailto:jonl@muppetlabs.com">Jonathan Locke</a>
 */
