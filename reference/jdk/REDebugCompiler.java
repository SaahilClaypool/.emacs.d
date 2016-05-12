_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REDebugCompiler.java
    /**

    }/**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REDebugCompiler.java
    /**

    /**
     * Inserts a node with a given opcode and opdata at insertAt.  The node relative next
     * pointer is initialized to 0.
     * @param opcode Opcode for new node
     * @param opdata Opdata for new node (only the low 16 bits are currently used)
     * @param insertAt Index at which to insert the new node in the program * /
    void nodeInsert(char opcode, int opdata, int insertAt) {
        System.out.println( "====> " + opcode + " " + opdata + " " + insertAt );
        PrintWriter writer = new PrintWriter( System.out );
        dumpProgram( writer );
        super.nodeInsert( opcode, opdata, insertAt );
        System.out.println( "====< " );
        dumpProgram( writer );
        writer.flush();
    }/**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REDebugCompiler.java
    String nodeToString(int node)

    /**
     * Returns a descriptive string for a node in a regular expression program.
     * @param node Node to describe
     * @return Description of node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REDebugCompiler.java
    String charToString(char c)

    /**
     * Return a string describing a (possibly unprintable) character.
     * @param c Character to convert to a printable representation
     * @return String representation of character
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REDebugCompiler.java
    String opcodeToString(char opcode)

    /**
     * Returns a descriptive string for an opcode.
     * @param opcode Opcode to convert to a string
     * @return Description of opcode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REDebugCompiler.java
    static Hashtable hashOpcode = new Hashtable();

    /**
     * Mapping from opcodes to descriptive strings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REDebugCompiler.java
public class REDebugCompiler extends RECompiler

/**
 * A subclass of RECompiler which can dump a regular expression program
 * for debugging purposes.
 *
 * @author <a href="mailto:jonl@muppetlabs.com">Jonathan Locke</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REDebugCompiler.java
    /**

    }/**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REDebugCompiler.java
    /**

    /**
     * Inserts a node with a given opcode and opdata at insertAt.  The node relative next
     * pointer is initialized to 0.
     * @param opcode Opcode for new node
     * @param opdata Opdata for new node (only the low 16 bits are currently used)
     * @param insertAt Index at which to insert the new node in the program * /
    void nodeInsert(char opcode, int opdata, int insertAt) {
        System.out.println( "====> " + opcode + " " + opdata + " " + insertAt );
        PrintWriter writer = new PrintWriter( System.out );
        dumpProgram( writer );
        super.nodeInsert( opcode, opdata, insertAt );
        System.out.println( "====< " );
        dumpProgram( writer );
        writer.flush();
    }/**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REDebugCompiler.java
    String nodeToString(int node)

    /**
     * Returns a descriptive string for a node in a regular expression program.
     * @param node Node to describe
     * @return Description of node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REDebugCompiler.java
    String charToString(char c)

    /**
     * Return a string describing a (possibly unprintable) character.
     * @param c Character to convert to a printable representation
     * @return String representation of character
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REDebugCompiler.java
    String opcodeToString(char opcode)

    /**
     * Returns a descriptive string for an opcode.
     * @param opcode Opcode to convert to a string
     * @return Description of opcode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REDebugCompiler.java
    static Hashtable hashOpcode = new Hashtable();

    /**
     * Mapping from opcodes to descriptive strings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/REDebugCompiler.java
public class REDebugCompiler extends RECompiler

/**
 * A subclass of RECompiler which can dump a regular expression program
 * for debugging purposes.
 *
 * @author <a href="mailto:jonl@muppetlabs.com">Jonathan Locke</a>
 */
