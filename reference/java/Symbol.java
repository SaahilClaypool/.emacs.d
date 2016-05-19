_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/Symbol.java
  public String toString() { return "#"+sym; }

  /*****************************
    Printing this token out. (Override for pretty-print).
    ****************************/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/Symbol.java
  public int left, right;

/*******************************
  The data passed to parser
 *******************************/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/Symbol.java
  boolean used_by_parser = false;

  /** This allows us to catch some errors caused by scanners recycling
   *  symbols.  For the use of the parser only. [CSA, 23-Jul-1999] */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/Symbol.java
  public int parse_state;

  /** The parse state to be recorded on the parse stack with this symbol.
   *  This field is for the convenience of the parser and shouldn't be
   *  modified except by the parser.
   */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/Symbol.java
  public int sym;

  /** The symbol number of the terminal or non terminal being represented */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/Symbol.java
  public Symbol(int sym_num, int state)

/***********************************
  Constructor to give a start state
***********************************/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/Symbol.java
  public Symbol(int sym_num) {

/***********************************
  Constructor for no value or l,r
***********************************/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/Symbol.java
  public Symbol(int sym_num, int l, int r) {

/*****************************
  Constructor for no value
  ***************************/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/Symbol.java
  public Symbol(int id, Object o) {

/*******************************
  Constructor for no l,r values
********************************/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/Symbol.java
  public Symbol(int id, int l, int r, Object o) {

/*******************************
  Constructor for l,r values
 *******************************/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java_cup/internal/runtime/Symbol.java
/* ****************************************************************

/**
 * Defines the Symbol class, which is used to represent all terminals
 * and nonterminals while parsing.  The lexer should pass CUP Symbols
 * and CUP returns a Symbol.
 *
 * @author  Frank Flannery
 */
