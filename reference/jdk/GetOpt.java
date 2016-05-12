_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/getopt/GetOpt.java
    // inner class to model an option

    ///////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/getopt/GetOpt.java
    //

    ///////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/getopt/GetOpt.java
    public String[] getCmdArgs(){

    /**
    * gets list of the commandline arguments. For example, in command
    * such as 'cmd -s -d file file2 file3 file4'  with the usage
    * 'cmd [-s] [-d <file>] <file>...', getCmdArgs() would return
    * the list {file2, file3, file4}.
    * @return String[] - list of command arguments that may appear
    *                    after options and option arguments.
    * @params none
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/getopt/GetOpt.java
    public String getOptionArg(){

    /**
    * gets the argument for the current parsed option. For example,
    * in case of '-d <file>', if current option parsed is 'd' then
    * getOptionArg() would return '<file>'.
    * @return String - argument for current parsed option.
    * @param none
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/getopt/GetOpt.java
    public int getNextOption() throws IllegalArgumentException,

    /**
    * gets the next option found in the commandline. Distinguishes
    * between two bad cases, one case is when an illegal option
    * is found, and then other case is when an option takes an
    * argument but no argument was found for that option.
    * If the option found was not declared in the optString, then
    * an IllegalArgumentException will be thrown (case 1).
    * If the next option found has been declared to take an argument,
    * and no such argument exists, then a MissingOptArgException
    * is thrown (case 2).
    * @param none
    * @return int - the next option found.
    * @throws IllegalArgumentException, MissingOptArgException.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/getopt/GetOpt.java
    public void printOptions(){

    /**
    * debugging routine to print out all options collected
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/getopt/GetOpt.java
public class GetOpt{

/**
* GetOpt is a Java equivalent to the C getopt() library function
* discussed in man page getopt(3C). It provides command line
* parsing for Java applications. It supports the most rules of the
* command line standard (see man page intro(1)) including stacked
* options such as '-sxm' (which is equivalent to -s -x -m); it
* handles special '--' option that signifies the end of options.
* Additionally this implementation of getopt will check for
* mandatory arguments to options such as in the case of
* '-d <file>' it will throw a MissingOptArgException if the
* option argument '<file>' is not included on the commandline.
* getopt(3C) does not check for this.
 * @author G Todd Miller
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/getopt/GetOpt.java
    // inner class to model an option

    ///////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/getopt/GetOpt.java
    //

    ///////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/getopt/GetOpt.java
    public String[] getCmdArgs(){

    /**
    * gets list of the commandline arguments. For example, in command
    * such as 'cmd -s -d file file2 file3 file4'  with the usage
    * 'cmd [-s] [-d <file>] <file>...', getCmdArgs() would return
    * the list {file2, file3, file4}.
    * @return String[] - list of command arguments that may appear
    *                    after options and option arguments.
    * @params none
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/getopt/GetOpt.java
    public String getOptionArg(){

    /**
    * gets the argument for the current parsed option. For example,
    * in case of '-d <file>', if current option parsed is 'd' then
    * getOptionArg() would return '<file>'.
    * @return String - argument for current parsed option.
    * @param none
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/getopt/GetOpt.java
    public int getNextOption() throws IllegalArgumentException,

    /**
    * gets the next option found in the commandline. Distinguishes
    * between two bad cases, one case is when an illegal option
    * is found, and then other case is when an option takes an
    * argument but no argument was found for that option.
    * If the option found was not declared in the optString, then
    * an IllegalArgumentException will be thrown (case 1).
    * If the next option found has been declared to take an argument,
    * and no such argument exists, then a MissingOptArgException
    * is thrown (case 2).
    * @param none
    * @return int - the next option found.
    * @throws IllegalArgumentException, MissingOptArgException.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/getopt/GetOpt.java
    public void printOptions(){

    /**
    * debugging routine to print out all options collected
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/getopt/GetOpt.java
public class GetOpt{

/**
* GetOpt is a Java equivalent to the C getopt() library function
* discussed in man page getopt(3C). It provides command line
* parsing for Java applications. It supports the most rules of the
* command line standard (see man page intro(1)) including stacked
* options such as '-sxm' (which is equivalent to -s -x -m); it
* handles special '--' option that signifies the end of options.
* Additionally this implementation of getopt will check for
* mandatory arguments to options such as in the case of
* '-d <file>' it will throw a MissingOptArgException if the
* option argument '<file>' is not included on the commandline.
* getopt(3C) does not check for this.
 * @author G Todd Miller
*/
