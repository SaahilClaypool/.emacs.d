_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void success(String s)

    /**
     * Show a success
     * @param s Success story
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    private RETestCase getNextTestCase(BufferedReader br) throws IOException

    /**
     * Creates testcase for the next test description in the script file.
     * @param br <code>BufferedReader</code> for script file.
     * @return a new tescase or null.
     * @exception IOException if some io problems occured
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    private String findNextTest(BufferedReader br) throws IOException

    /**
     * Finds next test description in a given script.
     * @param br <code>BufferedReader</code> for a script file
     * @return strign tag for next test description
     * @exception IOException if some io problems occured
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    private boolean getExpectedResult(String yesno)

    /**
     * Converts yesno string to boolean.
     * @param yesno string representation of expected result
     * @return true if yesno is "YES", false if yesno is "NO"
     *         stops program otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void testOther() throws Exception

    /**
     * Run automated unit test
     * @exception Exception thrown in case of error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void runAutomatedTests(String testDocument) throws Exception

    /**
     * Run automated tests in RETest.txt file (from Perl 4.0 test battery)
     * @exception Exception thrown in case of error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void showParens(RE r)

    /**
     * Dump parenthesized subexpressions found by a regular expression matcher object
     * @param r Matcher object with results to show
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void say(String s)

    /**
     * Say something to standard out
     * @param s What to say
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void fail(String s)

    /**
     * Fail with an error. Will print a big failure message to System.out.
     *
     * @param s Failure description
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void fail(StringBuffer log, String s)

    /**
     * Fail with an error. Will print a big failure message to System.out.
     *
     * @param log Output before failure
     * @param s Failure description
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void die(String s)

    /**
     * Exit with a fatal error.
     * @param s Last famous words before exiting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void runInteractiveTests(String expr)

    /**
     * Compile and test matching against a single expression
     * @param expr Expression to compile and test
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    public RETest()

    /**
     * Constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    public static boolean test( String[] args ) throws Exception

    /**
     * Testing entrypoint.
     * @param args Command line arguments
     * @exception Exception thrown in case of error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    public static void main(String[] args)

    /**
     * Main program entrypoint.  If an argument is given, it will be compiled
     * and interactive matching will ensue.  If no argument is given, the
     * file RETest.txt will be used as automated testing input.
     * @param args Command line arguments (optional regular expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
public class RETest

/**
 * Data driven (and optionally interactive) testing harness to exercise regular
 * expression compiler and matching engine.
 *
 * @author <a href="mailto:jonl@muppetlabs.com">Jonathan Locke</a>
 * @author <a href="mailto:jon@latchkey.com">Jon S. Stevens</a>
 * @author <a href="mailto:gholam@xtra.co.nz">Michael McCallum</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void success(String s)

    /**
     * Show a success
     * @param s Success story
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    private RETestCase getNextTestCase(BufferedReader br) throws IOException

    /**
     * Creates testcase for the next test description in the script file.
     * @param br <code>BufferedReader</code> for script file.
     * @return a new tescase or null.
     * @exception IOException if some io problems occured
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    private String findNextTest(BufferedReader br) throws IOException

    /**
     * Finds next test description in a given script.
     * @param br <code>BufferedReader</code> for a script file
     * @return strign tag for next test description
     * @exception IOException if some io problems occured
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    private boolean getExpectedResult(String yesno)

    /**
     * Converts yesno string to boolean.
     * @param yesno string representation of expected result
     * @return true if yesno is "YES", false if yesno is "NO"
     *         stops program otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void testOther() throws Exception

    /**
     * Run automated unit test
     * @exception Exception thrown in case of error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void runAutomatedTests(String testDocument) throws Exception

    /**
     * Run automated tests in RETest.txt file (from Perl 4.0 test battery)
     * @exception Exception thrown in case of error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void showParens(RE r)

    /**
     * Dump parenthesized subexpressions found by a regular expression matcher object
     * @param r Matcher object with results to show
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void say(String s)

    /**
     * Say something to standard out
     * @param s What to say
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void fail(String s)

    /**
     * Fail with an error. Will print a big failure message to System.out.
     *
     * @param s Failure description
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void fail(StringBuffer log, String s)

    /**
     * Fail with an error. Will print a big failure message to System.out.
     *
     * @param log Output before failure
     * @param s Failure description
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void die(String s)

    /**
     * Exit with a fatal error.
     * @param s Last famous words before exiting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    void runInteractiveTests(String expr)

    /**
     * Compile and test matching against a single expression
     * @param expr Expression to compile and test
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    public RETest()

    /**
     * Constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    public static boolean test( String[] args ) throws Exception

    /**
     * Testing entrypoint.
     * @param args Command line arguments
     * @exception Exception thrown in case of error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
    public static void main(String[] args)

    /**
     * Main program entrypoint.  If an argument is given, it will be compiled
     * and interactive matching will ensue.  If no argument is given, the
     * file RETest.txt will be used as automated testing input.
     * @param args Command line arguments (optional regular expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RETest.java
public class RETest

/**
 * Data driven (and optionally interactive) testing harness to exercise regular
 * expression compiler and matching engine.
 *
 * @author <a href="mailto:jonl@muppetlabs.com">Jonathan Locke</a>
 * @author <a href="mailto:jon@latchkey.com">Jon S. Stevens</a>
 * @author <a href="mailto:gholam@xtra.co.nz">Michael McCallum</a>
 */
