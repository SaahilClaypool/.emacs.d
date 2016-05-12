_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   public String getMessage() {

   /**
    * You can also modify the body of this method to customize your error messages.
    * For example, cases like LOOP_DETECTED and INVALID_LEXICAL_STATE are not
    * of end-users concern, so you can return something like :
    *
    *     "Internal Error : Please file a bug report .... "
    *
    * from this method for such cases in the release version of your parser.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   private static final String LexicalError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, String errorAfter, char curChar) {

   /**
    * Returns a detailed message for the Error when it is thrown by the
    * token manager to indicate a lexical error.
    * Parameters :
    *    EOFSeen     : indicates if EOF caused the lexicl error
    *    curLexState : lexical state in which this error occurred
    *    errorLine   : line number when the error occurred
    *    errorColumn : column number when the error occurred
    *    errorAfter  : prefix that was seen before this error occurred
    *    curchar     : the offending character
    * Note: You can customize the lexical error message by modifying this method.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   protected static final String addEscapes(String str) {

   /**
    * Replaces unprintable characters by their espaced (or unicode escaped)
    * equivalents in the given string
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   int errorCode;

   /**
    * Indicates the reason why the exception is thrown. It will have
    * one of the above 4 values.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   static final int LOOP_DETECTED = 3;

   /**
    * Detected (and bailed out of) an infinite loop in the token manager.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   static final int INVALID_LEXICAL_STATE = 2;

   /**
    * Tried to change to an invalid lexical state.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   static final int STATIC_LEXER_ERROR = 1;

   /**
    * An attempt wass made to create a second instance of a static token manager.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   static final int LEXICAL_ERROR = 0;

   /**
    * Lexical error occurred.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   public String getMessage() {

   /**
    * You can also modify the body of this method to customize your error messages.
    * For example, cases like LOOP_DETECTED and INVALID_LEXICAL_STATE are not
    * of end-users concern, so you can return something like :
    *
    *     "Internal Error : Please file a bug report .... "
    *
    * from this method for such cases in the release version of your parser.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   private static final String LexicalError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, String errorAfter, char curChar) {

   /**
    * Returns a detailed message for the Error when it is thrown by the
    * token manager to indicate a lexical error.
    * Parameters :
    *    EOFSeen     : indicates if EOF caused the lexicl error
    *    curLexState : lexical state in which this error occurred
    *    errorLine   : line number when the error occurred
    *    errorColumn : column number when the error occurred
    *    errorAfter  : prefix that was seen before this error occurred
    *    curchar     : the offending character
    * Note: You can customize the lexical error message by modifying this method.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   protected static final String addEscapes(String str) {

   /**
    * Replaces unprintable characters by their espaced (or unicode escaped)
    * equivalents in the given string
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   int errorCode;

   /**
    * Indicates the reason why the exception is thrown. It will have
    * one of the above 4 values.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   static final int LOOP_DETECTED = 3;

   /**
    * Detected (and bailed out of) an infinite loop in the token manager.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   static final int INVALID_LEXICAL_STATE = 2;

   /**
    * Tried to change to an invalid lexical state.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   static final int STATIC_LEXER_ERROR = 1;

   /**
    * An attempt wass made to create a second instance of a static token manager.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/TokenMgrError.java
   static final int LEXICAL_ERROR = 0;

   /**
    * Lexical error occurred.
    */
