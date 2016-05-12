_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/recompile.java
    static public void main(String[] arg)

    /**
     * Main application entrypoint.
     * @param arg Command line arguments
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/recompile.java
public class recompile

/**
 * 'recompile' is a command line tool that pre-compiles one or more regular expressions
 * for use with the regular expression matcher class 'RE'.  For example, the command
 * "java recompile a*b" produces output like this:
 *
 * <pre>
 *
 *    // Pre-compiled regular expression "a*b"
 *    char[] re1Instructions =
 *    {
 *        0x007c, 0x0000, 0x001a, 0x007c, 0x0000, 0x000d, 0x0041,
 *        0x0001, 0x0004, 0x0061, 0x007c, 0x0000, 0x0003, 0x0047,
 *        0x0000, 0xfff6, 0x007c, 0x0000, 0x0003, 0x004e, 0x0000,
 *        0x0003, 0x0041, 0x0001, 0x0004, 0x0062, 0x0045, 0x0000,
 *        0x0000,
 *    };
 *
 *    REProgram re1 = new REProgram(re1Instructions);
 *
 * </pre>
 *
 * By pasting this output into your code, you can construct a regular expression matcher
 * (RE) object directly from the pre-compiled data (the character array re1), thus avoiding
 * the overhead of compiling the expression at runtime.  For example:
 *
 * <pre>
 *
 *    RE r = new RE(re1);
 *
 * </pre>
 *
 * @see RE
 * @see RECompiler
 *
 * @author <a href="mailto:jonl@muppetlabs.com">Jonathan Locke</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/recompile.java
    static public void main(String[] arg)

    /**
     * Main application entrypoint.
     * @param arg Command line arguments
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/recompile.java
public class recompile

/**
 * 'recompile' is a command line tool that pre-compiles one or more regular expressions
 * for use with the regular expression matcher class 'RE'.  For example, the command
 * "java recompile a*b" produces output like this:
 *
 * <pre>
 *
 *    // Pre-compiled regular expression "a*b"
 *    char[] re1Instructions =
 *    {
 *        0x007c, 0x0000, 0x001a, 0x007c, 0x0000, 0x000d, 0x0041,
 *        0x0001, 0x0004, 0x0061, 0x007c, 0x0000, 0x0003, 0x0047,
 *        0x0000, 0xfff6, 0x007c, 0x0000, 0x0003, 0x004e, 0x0000,
 *        0x0003, 0x0041, 0x0001, 0x0004, 0x0062, 0x0045, 0x0000,
 *        0x0000,
 *    };
 *
 *    REProgram re1 = new REProgram(re1Instructions);
 *
 * </pre>
 *
 * By pasting this output into your code, you can construct a regular expression matcher
 * (RE) object directly from the pre-compiled data (the character array re1), thus avoiding
 * the overhead of compiling the expression at runtime.  For example:
 *
 * <pre>
 *
 *    RE r = new RE(re1);
 *
 * </pre>
 *
 * @see RE
 * @see RECompiler
 *
 * @author <a href="mailto:jonl@muppetlabs.com">Jonathan Locke</a>
 */
