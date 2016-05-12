_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected static short[][] unpackFromStrings(String[] sa)

  /** Utility function: unpacks parse tables from strings */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected void parse_lookahead(boolean debug)

  /** Parse forward using stored lookahead Symbols.  In this case we have
   *  already verified that parsing will make it through the stored lookahead
   *  Symbols and we are now getting back to the point at which we can hand
   *  control back to the normal parser.  Consequently, this version of the
   *  parser performs all actions and modifies the real parse configuration.
   *  This returns once we have consumed all the stored input or we accept.
   *
   * @param debug should we produce debugging messages as we parse.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected boolean try_parse_ahead(boolean debug)

  /** Do a simulated parse forward (a "parse ahead") from the current
   *  stack configuration using stored lookahead input and a virtual parse
   *  stack.  Return true if we make it all the way through the stored
   *  lookahead input without error. This basically simulates the action of
   *  parse() using only our saved "parse ahead" input, and not executing any
   *  actions.
   *
   * @param debug should we produce debugging messages as we parse.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected void restart_lookahead() throws java.lang.Exception

  /** Reset the parse ahead input to one Symbol past where we started error
   *  recovery (this consumes one new Symbol from the real input).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected boolean advance_lookahead()

  /** Advance to next "parse ahead" input Symbol. Return true if we have
   *  input to advance to, false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected Symbol cur_err_token() { return lookahead[lookahead_pos]; }

  /** Return the current lookahead in our error "parse ahead" buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected void read_lookahead() throws java.lang.Exception

  /** Read from input to establish our buffer of "parse ahead" lookahead
   *  Symbols.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected int lookahead_pos;

  /** Position in lookahead input buffer used for "parse ahead". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected Symbol lookahead[];

  /** Lookahead Symbols used for attempting error recovery "parse aheads". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected boolean find_recovery_config(boolean debug)

  /** Put the (real) parse stack into error recovery configuration by
   *  popping the stack down to a state that can shift on the special
   *  error Symbol, then doing the shift.  If no suitable state exists on
   *  the stack we return false
   *
   * @param debug should we produce debugging messages as we parse.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected boolean shift_under_error()

  /** Determine if we can shift under the special error Symbol out of the
   *  state currently on the top of the (real) parse stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected boolean error_recovery(boolean debug)

  /** Attempt to recover from a syntax error.  This returns false if recovery
   *  fails, true if it succeeds.  Recovery happens in 4 steps.  First we
   *  pop the parse stack down to a point at which we have a shift out
   *  of the top-most state on the error Symbol.  This represents the
   *  initial error recovery configuration.  If no such configuration is
   *  found, then we fail.  Next a small number of "lookahead" or "parse
   *  ahead" Symbols are read into a buffer.  The size of this buffer is
   *  determined by error_sync_size() and determines how many Symbols beyond
   *  the error must be matched to consider the recovery a success.  Next,
   *  we begin to discard Symbols in attempt to get past the point of error
   *  to a point where we can continue parsing.  After each Symbol, we attempt
   *  to "parse ahead" though the buffered lookahead Symbols.  The "parse ahead"
   *  process simulates that actual parse, but does not modify the real
   *  parser's configuration, nor execute any actions. If we can  parse all
   *  the stored Symbols without error, then the recovery is considered a
   *  success.  Once a successful recovery point is determined, we do an
   *  actual parse over the stored input -- modifying the real parse
   *  configuration and executing all actions.  Finally, we return the the
   *  normal parser to continue with the overall parse.
   *
   * @param debug should we produce debugging messages as we parse.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public Symbol debug_parse()

  /** Perform a parse with debugging output.  This does exactly the
   *  same things as parse(), except that it calls debug_shift() and
   *  debug_reduce() when shift and reduce moves are taken by the parser
   *  and produces various other debugging messages.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void debug_stack() {

  /** Do debug output for stack state. [CSA]
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void debug_shift(Symbol shift_tkn)

  /** Do debug output for shift.
   *
   * @param shift_tkn the Symbol being shifted onto the stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void debug_reduce(int prod_num, int nt_num, int rhs_size)

  /** Do debug output for a reduce.
   *
   * @param prod_num  the production we are reducing with.
   * @param nt_num    the index of the LHS non terminal.
   * @param rhs_size  the size of the RHS.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void dump_stack()

  /** Dump the parse stack for debugging purposes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void debug_message(String mess)

  /** Write a debugging message to System.err for the debugging version
   *  of the parser.
   *
   * @param mess the text of the debugging message.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public Symbol parse() throws java.lang.Exception

  /** This method provides the main parsing routine.  It returns only when
   *  done_parsing() has been called (typically because the parser has
   *  accepted, or a fatal error has been reported).  See the header
   *  documentation for the class regarding how shift/reduce parsers operate
   *  and how the various tables are used.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected final short get_reduce(int state, int sym)

  /** Fetch a state from the reduce-goto table.  The table is broken up into
   *  rows, one per state (rows are indexed directly by state number).
   *  Within each row, a list of index, value pairs are given (as sequential
   *  entries in the table), and the list is terminated by a default entry
   *  (denoted with a Symbol index of -1).  To find the proper entry in a row
   *  we do a linear search.
   *
   * @param state the state index of the entry being accessed.
   * @param sym   the Symbol index of the entry being accessed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected final short get_action(int state, int sym)

  /** Fetch an action from the action table.  The table is broken up into
   *  rows, one per state (rows are indexed directly by state number).
   *  Within each row, a list of index, value pairs are given (as sequential
   *  entries in the table), and the list is terminated by a default entry
   *  (denoted with a Symbol index of -1).  To find the proper entry in a row
   *  we do a linear or binary search (depending on the size of the row).
   *
   * @param state the state index of the action being accessed.
   * @param sym   the Symbol index of the action being accessed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void unrecovered_syntax_error(Symbol cur_token)

  /** This method is called if it is determined that syntax error recovery
   *  has been unsuccessful.  Here in the base class we report a fatal error.
   *
   * @param cur_token the current lookahead Symbol.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void syntax_error(Symbol cur_token)

  /** This method is called when a syntax error has been detected and recovery
   *  is about to be invoked.  Here in the base class we just emit a
   *  "Syntax error" error message.
   *
   * @param cur_token the current lookahead Symbol.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void report_error(String message, Object info)

  /** Report a non fatal error (or warning).  This method takes a message
   *  string and an additional object (to be used by specializations
   *  implemented in subclasses).  Here in the base class a very simple
   *  implementation is provided which simply prints the message to
   *  System.err.
   *
   * @param message an error message.
   * @param info    an extra object reserved for use by specialized subclasses.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void report_fatal_error(
    String   message,
    Object   info)

  /** Report a fatal error.  This method takes a  message string and an
   *  additional object (to be used by specializations implemented in
   *  subclasses).  Here in the base class a very simple implementation
   *  is provided which reports the error then throws an exception.
   *
   * @param message an error message.
   * @param info    an extra object reserved for use by specialized subclasses.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public Symbol scan() throws java.lang.Exception {

  /** Get the next Symbol from the input (supplied by generated subclass).
   *  Once end of file has been reached, all subsequent calls to scan
   *  should return an EOF Symbol (which is Symbol number 0).  By default
   *  this method returns getScanner().next_token(); this implementation
   *  can be overriden by the generated parser using the code declared in
   *  the "scan with" clause.  Do not recycle objects; every call to
   *  scan() should return a fresh object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected abstract void init_actions() throws java.lang.Exception;

  /** Initialize the action object.  This is called before the parser does
   *  any parse actions. This is filled in by generated code to create
   *  an object that encapsulates all action code.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void user_init() throws java.lang.Exception { }

  /** User code for initialization inside the parser.  Typically this
   *  initializes the scanner.  This is called before the parser requests
   *  the first Symbol.  Here this is just a placeholder for subclasses that
   *  might need this and we perform no action.   This method is normally
   *  overridden by the generated code using this contents of the "init with"
   *  clause as its body.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract Symbol do_action(
    int       act_num,
    lr_parser parser,
    Stack     stack,
    int       top)

  /** Perform a bit of user supplied action code (supplied by generated
   *  subclass).  Actions are indexed by an internal action number assigned
   *  at parser generation time.
   *
   * @param act_num   the internal index of the action to be performed.
   * @param parser    the parser object we are acting for.
   * @param stack     the parse stack of that object.
   * @param top       the index of the top element of the parse stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public Scanner getScanner() { return _scanner; }

  /**
   * Simple accessor method to get the default scanner.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void setScanner(Scanner s) { _scanner = s; }

  /**
   * Simple accessor method to set the default scanner.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  private Scanner _scanner;

  /** This is the scanner object used by the default implementation
   *  of scan() to get Symbols.  To avoid name conflicts with existing
   *  code, this field is private. [CSA/davidm] */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected short[][] reduce_tab;

  /** Direct reference to the reduce-goto table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected short[][] action_tab;

  /** Direct reference to the action table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected short[][] production_tab;

  /** Direct reference to the production table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected Stack stack = new Stack();

  /** The parse stack itself. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected Symbol cur_token;

  /** The current lookahead Symbol. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected int tos;

  /** Indication of the index for top of stack (for use by actions). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void done_parsing()

  /** This method is called to indicate that the parser should quit.  This is
   *  normally called by an accept action, but can be used to cancel parsing
   *  early in other circumstances if desired.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected boolean _done_parsing = false;

  /** Internal flag to indicate when parser should quit. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract int error_sym();

  /** The index of the special error Symbol (supplied by generated subclass). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract int EOF_sym();

  /** The index of the end of file terminal Symbol (supplied by generated
   *  subclass).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract int start_production();

  /** The index of the start production (supplied by generated subclass). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract int start_state();

  /** The index of the start state (supplied by generated subclass). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract short[][] reduce_table();

  /** The reduce-goto table (supplied by generated subclass).  This
   *  table is indexed by state and non-terminal number and contains
   *  state numbers.  States are indexed using the first dimension, however,
   *  the entries for a given state are compacted and stored in adjacent
   *  index, value pairs which are searched for rather than accessed
   *  directly (see get_reduce()).  When a reduce occurs, the handle
   *  (corresponding to the RHS of the matched production) is popped off
   *  the stack.  The new top of stack indicates a state.  This table is
   *  then indexed by that state and the LHS of the reducing production to
   *  indicate where to "shift" to.
   *
   * @see com.sun.java_cup.internal.runtime.lr_parser#get_reduce
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract short[][] action_table();

  /** The action table (supplied by generated subclass).  This table is
   *  indexed by state and terminal number indicating what action is to
   *  be taken when the parser is in the given state (i.e., the given state
   *  is on top of the stack) and the given terminal is next on the input.
   *  States are indexed using the first dimension, however, the entries for
   *  a given state are compacted and stored in adjacent index, value pairs
   *  which are searched for rather than accessed directly (see get_action()).
   *  The actions stored in the table will be either shifts, reduces, or
   *  errors.  Shifts are encoded as positive values (one greater than the
   *  state shifted to).  Reduces are encoded as negative values (one less
   *  than the production reduced by).  Error entries are denoted by zero.
   *
   * @see com.sun.java_cup.internal.runtime.lr_parser#get_action
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract short[][] production_table();

  /** Table of production information (supplied by generated subclass).
   *  This table contains one entry per production and is indexed by
   *  the negative-encoded values (reduce actions) in the action_table.
   *  Each entry has two parts, the index of the non-terminal on the
   *  left hand side of the production, and the number of Symbols
   *  on the right hand side.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected int error_sync_size() {return _error_sync_size; }

  /** The number of Symbols after an error we much match to consider it
   *  recovered from.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected final static int _error_sync_size = 3;

  /** The default number of Symbols after an error we much match to consider
   *  it recovered from.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public lr_parser(Scanner s) {

  /** Constructor that sets the default scanner. [CSA/davidm] */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public lr_parser()

  /** Simple constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
public abstract class lr_parser {

/** This class implements a skeleton table driven LR parser.  In general,
 *  LR parsers are a form of bottom up shift-reduce parsers.  Shift-reduce
 *  parsers act by shifting input onto a parse stack until the Symbols
 *  matching the right hand side of a production appear on the top of the
 *  stack.  Once this occurs, a reduce is performed.  This involves removing
 *  the Symbols corresponding to the right hand side of the production
 *  (the so called "handle") and replacing them with the non-terminal from
 *  the left hand side of the production.  <p>
 *
 *  To control the decision of whether to shift or reduce at any given point,
 *  the parser uses a state machine (the "viable prefix recognition machine"
 *  built by the parser generator).  The current state of the machine is placed
 *  on top of the parse stack (stored as part of a Symbol object representing
 *  a terminal or non terminal).  The parse action table is consulted
 *  (using the current state and the current lookahead Symbol as indexes) to
 *  determine whether to shift or to reduce.  When the parser shifts, it
 *  changes to a new state by pushing a new Symbol (containing a new state)
 *  onto the stack.  When the parser reduces, it pops the handle (right hand
 *  side of a production) off the stack.  This leaves the parser in the state
 *  it was in before any of those Symbols were matched.  Next the reduce-goto
 *  table is consulted (using the new state and current lookahead Symbol as
 *  indexes) to determine a new state to go to.  The parser then shifts to
 *  this goto state by pushing the left hand side Symbol of the production
 *  (also containing the new state) onto the stack.<p>
 *
 *  This class actually provides four LR parsers.  The methods parse() and
 *  debug_parse() provide two versions of the main parser (the only difference
 *  being that debug_parse() emits debugging trace messages as it parses).
 *  In addition to these main parsers, the error recovery mechanism uses two
 *  more.  One of these is used to simulate "parsing ahead" in the input
 *  without carrying out actions (to verify that a potential error recovery
 *  has worked), and the other is used to parse through buffered "parse ahead"
 *  input in order to execute all actions and re-synchronize the actual parser
 *  configuration.<p>
 *
 *  This is an abstract class which is normally filled out by a subclass
 *  generated by the JavaCup parser generator.  In addition to supplying
 *  the actual parse tables, generated code also supplies methods which
 *  invoke various pieces of user supplied code, provide access to certain
 *  special Symbols (e.g., EOF and error), etc.  Specifically, the following
 *  abstract methods are normally supplied by generated code:
 *  <dl compact>
 *  <dt> short[][] production_table()
 *  <dd> Provides a reference to the production table (indicating the index of
 *       the left hand side non terminal and the length of the right hand side
 *       for each production in the grammar).
 *  <dt> short[][] action_table()
 *  <dd> Provides a reference to the parse action table.
 *  <dt> short[][] reduce_table()
 *  <dd> Provides a reference to the reduce-goto table.
 *  <dt> int start_state()
 *  <dd> Indicates the index of the start state.
 *  <dt> int start_production()
 *  <dd> Indicates the index of the starting production.
 *  <dt> int EOF_sym()
 *  <dd> Indicates the index of the EOF Symbol.
 *  <dt> int error_sym()
 *  <dd> Indicates the index of the error Symbol.
 *  <dt> Symbol do_action()
 *  <dd> Executes a piece of user supplied action code.  This always comes at
 *       the point of a reduce in the parse, so this code also allocates and
 *       fills in the left hand side non terminal Symbol object that is to be
 *       pushed onto the stack for the reduce.
 *  <dt> void init_actions()
 *  <dd> Code to initialize a special object that encapsulates user supplied
 *       actions (this object is used by do_action() to actually carry out the
 *       actions).
 *  </dl>
 *
 *  In addition to these routines that <i>must</i> be supplied by the
 *  generated subclass there are also a series of routines that <i>may</i>
 *  be supplied.  These include:
 *  <dl>
 *  <dt> Symbol scan()
 *  <dd> Used to get the next input Symbol from the scanner.
 *  <dt> Scanner getScanner()
 *  <dd> Used to provide a scanner for the default implementation of
 *       scan().
 *  <dt> int error_sync_size()
 *  <dd> This determines how many Symbols past the point of an error
 *       must be parsed without error in order to consider a recovery to
 *       be valid.  This defaults to 3.  Values less than 2 are not
 *       recommended.
 *  <dt> void report_error(String message, Object info)
 *  <dd> This method is called to report an error.  The default implementation
 *       simply prints a message to System.err and where the error occurred.
 *       This method is often replaced in order to provide a more sophisticated
 *       error reporting mechanism.
 *  <dt> void report_fatal_error(String message, Object info)
 *  <dd> This method is called when a fatal error that cannot be recovered from
 *       is encountered.  In the default implementation, it calls
 *       report_error() to emit a message, then throws an exception.
 *  <dt> void syntax_error(Symbol cur_token)
 *  <dd> This method is called as soon as syntax error is detected (but
 *       before recovery is attempted).  In the default implementation it
 *       invokes: report_error("Syntax error", null);
 *  <dt> void unrecovered_syntax_error(Symbol cur_token)
 *  <dd> This method is called if syntax error recovery fails.  In the default
 *       implementation it invokes:<br>
 *         report_fatal_error("Couldn't repair and continue parse", null);
 *  </dl>
 *
 * @see     com.sun.java_cup.internal.runtime.Symbol
 * @see     com.sun.java_cup.internal.runtime.Symbol
 * @see     com.sun.java_cup.internal.runtime.virtual_parse_stack
 * @author  Frank Flannery
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected static short[][] unpackFromStrings(String[] sa)

  /** Utility function: unpacks parse tables from strings */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected void parse_lookahead(boolean debug)

  /** Parse forward using stored lookahead Symbols.  In this case we have
   *  already verified that parsing will make it through the stored lookahead
   *  Symbols and we are now getting back to the point at which we can hand
   *  control back to the normal parser.  Consequently, this version of the
   *  parser performs all actions and modifies the real parse configuration.
   *  This returns once we have consumed all the stored input or we accept.
   *
   * @param debug should we produce debugging messages as we parse.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected boolean try_parse_ahead(boolean debug)

  /** Do a simulated parse forward (a "parse ahead") from the current
   *  stack configuration using stored lookahead input and a virtual parse
   *  stack.  Return true if we make it all the way through the stored
   *  lookahead input without error. This basically simulates the action of
   *  parse() using only our saved "parse ahead" input, and not executing any
   *  actions.
   *
   * @param debug should we produce debugging messages as we parse.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected void restart_lookahead() throws java.lang.Exception

  /** Reset the parse ahead input to one Symbol past where we started error
   *  recovery (this consumes one new Symbol from the real input).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected boolean advance_lookahead()

  /** Advance to next "parse ahead" input Symbol. Return true if we have
   *  input to advance to, false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected Symbol cur_err_token() { return lookahead[lookahead_pos]; }

  /** Return the current lookahead in our error "parse ahead" buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected void read_lookahead() throws java.lang.Exception

  /** Read from input to establish our buffer of "parse ahead" lookahead
   *  Symbols.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected int lookahead_pos;

  /** Position in lookahead input buffer used for "parse ahead". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected Symbol lookahead[];

  /** Lookahead Symbols used for attempting error recovery "parse aheads". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected boolean find_recovery_config(boolean debug)

  /** Put the (real) parse stack into error recovery configuration by
   *  popping the stack down to a state that can shift on the special
   *  error Symbol, then doing the shift.  If no suitable state exists on
   *  the stack we return false
   *
   * @param debug should we produce debugging messages as we parse.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected boolean shift_under_error()

  /** Determine if we can shift under the special error Symbol out of the
   *  state currently on the top of the (real) parse stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected boolean error_recovery(boolean debug)

  /** Attempt to recover from a syntax error.  This returns false if recovery
   *  fails, true if it succeeds.  Recovery happens in 4 steps.  First we
   *  pop the parse stack down to a point at which we have a shift out
   *  of the top-most state on the error Symbol.  This represents the
   *  initial error recovery configuration.  If no such configuration is
   *  found, then we fail.  Next a small number of "lookahead" or "parse
   *  ahead" Symbols are read into a buffer.  The size of this buffer is
   *  determined by error_sync_size() and determines how many Symbols beyond
   *  the error must be matched to consider the recovery a success.  Next,
   *  we begin to discard Symbols in attempt to get past the point of error
   *  to a point where we can continue parsing.  After each Symbol, we attempt
   *  to "parse ahead" though the buffered lookahead Symbols.  The "parse ahead"
   *  process simulates that actual parse, but does not modify the real
   *  parser's configuration, nor execute any actions. If we can  parse all
   *  the stored Symbols without error, then the recovery is considered a
   *  success.  Once a successful recovery point is determined, we do an
   *  actual parse over the stored input -- modifying the real parse
   *  configuration and executing all actions.  Finally, we return the the
   *  normal parser to continue with the overall parse.
   *
   * @param debug should we produce debugging messages as we parse.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public Symbol debug_parse()

  /** Perform a parse with debugging output.  This does exactly the
   *  same things as parse(), except that it calls debug_shift() and
   *  debug_reduce() when shift and reduce moves are taken by the parser
   *  and produces various other debugging messages.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void debug_stack() {

  /** Do debug output for stack state. [CSA]
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void debug_shift(Symbol shift_tkn)

  /** Do debug output for shift.
   *
   * @param shift_tkn the Symbol being shifted onto the stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void debug_reduce(int prod_num, int nt_num, int rhs_size)

  /** Do debug output for a reduce.
   *
   * @param prod_num  the production we are reducing with.
   * @param nt_num    the index of the LHS non terminal.
   * @param rhs_size  the size of the RHS.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void dump_stack()

  /** Dump the parse stack for debugging purposes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void debug_message(String mess)

  /** Write a debugging message to System.err for the debugging version
   *  of the parser.
   *
   * @param mess the text of the debugging message.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public Symbol parse() throws java.lang.Exception

  /** This method provides the main parsing routine.  It returns only when
   *  done_parsing() has been called (typically because the parser has
   *  accepted, or a fatal error has been reported).  See the header
   *  documentation for the class regarding how shift/reduce parsers operate
   *  and how the various tables are used.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected final short get_reduce(int state, int sym)

  /** Fetch a state from the reduce-goto table.  The table is broken up into
   *  rows, one per state (rows are indexed directly by state number).
   *  Within each row, a list of index, value pairs are given (as sequential
   *  entries in the table), and the list is terminated by a default entry
   *  (denoted with a Symbol index of -1).  To find the proper entry in a row
   *  we do a linear search.
   *
   * @param state the state index of the entry being accessed.
   * @param sym   the Symbol index of the entry being accessed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected final short get_action(int state, int sym)

  /** Fetch an action from the action table.  The table is broken up into
   *  rows, one per state (rows are indexed directly by state number).
   *  Within each row, a list of index, value pairs are given (as sequential
   *  entries in the table), and the list is terminated by a default entry
   *  (denoted with a Symbol index of -1).  To find the proper entry in a row
   *  we do a linear or binary search (depending on the size of the row).
   *
   * @param state the state index of the action being accessed.
   * @param sym   the Symbol index of the action being accessed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void unrecovered_syntax_error(Symbol cur_token)

  /** This method is called if it is determined that syntax error recovery
   *  has been unsuccessful.  Here in the base class we report a fatal error.
   *
   * @param cur_token the current lookahead Symbol.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void syntax_error(Symbol cur_token)

  /** This method is called when a syntax error has been detected and recovery
   *  is about to be invoked.  Here in the base class we just emit a
   *  "Syntax error" error message.
   *
   * @param cur_token the current lookahead Symbol.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void report_error(String message, Object info)

  /** Report a non fatal error (or warning).  This method takes a message
   *  string and an additional object (to be used by specializations
   *  implemented in subclasses).  Here in the base class a very simple
   *  implementation is provided which simply prints the message to
   *  System.err.
   *
   * @param message an error message.
   * @param info    an extra object reserved for use by specialized subclasses.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void report_fatal_error(
    String   message,
    Object   info)

  /** Report a fatal error.  This method takes a  message string and an
   *  additional object (to be used by specializations implemented in
   *  subclasses).  Here in the base class a very simple implementation
   *  is provided which reports the error then throws an exception.
   *
   * @param message an error message.
   * @param info    an extra object reserved for use by specialized subclasses.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public Symbol scan() throws java.lang.Exception {

  /** Get the next Symbol from the input (supplied by generated subclass).
   *  Once end of file has been reached, all subsequent calls to scan
   *  should return an EOF Symbol (which is Symbol number 0).  By default
   *  this method returns getScanner().next_token(); this implementation
   *  can be overriden by the generated parser using the code declared in
   *  the "scan with" clause.  Do not recycle objects; every call to
   *  scan() should return a fresh object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected abstract void init_actions() throws java.lang.Exception;

  /** Initialize the action object.  This is called before the parser does
   *  any parse actions. This is filled in by generated code to create
   *  an object that encapsulates all action code.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void user_init() throws java.lang.Exception { }

  /** User code for initialization inside the parser.  Typically this
   *  initializes the scanner.  This is called before the parser requests
   *  the first Symbol.  Here this is just a placeholder for subclasses that
   *  might need this and we perform no action.   This method is normally
   *  overridden by the generated code using this contents of the "init with"
   *  clause as its body.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract Symbol do_action(
    int       act_num,
    lr_parser parser,
    Stack     stack,
    int       top)

  /** Perform a bit of user supplied action code (supplied by generated
   *  subclass).  Actions are indexed by an internal action number assigned
   *  at parser generation time.
   *
   * @param act_num   the internal index of the action to be performed.
   * @param parser    the parser object we are acting for.
   * @param stack     the parse stack of that object.
   * @param top       the index of the top element of the parse stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public Scanner getScanner() { return _scanner; }

  /**
   * Simple accessor method to get the default scanner.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void setScanner(Scanner s) { _scanner = s; }

  /**
   * Simple accessor method to set the default scanner.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  private Scanner _scanner;

  /** This is the scanner object used by the default implementation
   *  of scan() to get Symbols.  To avoid name conflicts with existing
   *  code, this field is private. [CSA/davidm] */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected short[][] reduce_tab;

  /** Direct reference to the reduce-goto table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected short[][] action_tab;

  /** Direct reference to the action table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected short[][] production_tab;

  /** Direct reference to the production table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected Stack stack = new Stack();

  /** The parse stack itself. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected Symbol cur_token;

  /** The current lookahead Symbol. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected int tos;

  /** Indication of the index for top of stack (for use by actions). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public void done_parsing()

  /** This method is called to indicate that the parser should quit.  This is
   *  normally called by an accept action, but can be used to cancel parsing
   *  early in other circumstances if desired.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected boolean _done_parsing = false;

  /** Internal flag to indicate when parser should quit. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract int error_sym();

  /** The index of the special error Symbol (supplied by generated subclass). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract int EOF_sym();

  /** The index of the end of file terminal Symbol (supplied by generated
   *  subclass).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract int start_production();

  /** The index of the start production (supplied by generated subclass). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract int start_state();

  /** The index of the start state (supplied by generated subclass). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract short[][] reduce_table();

  /** The reduce-goto table (supplied by generated subclass).  This
   *  table is indexed by state and non-terminal number and contains
   *  state numbers.  States are indexed using the first dimension, however,
   *  the entries for a given state are compacted and stored in adjacent
   *  index, value pairs which are searched for rather than accessed
   *  directly (see get_reduce()).  When a reduce occurs, the handle
   *  (corresponding to the RHS of the matched production) is popped off
   *  the stack.  The new top of stack indicates a state.  This table is
   *  then indexed by that state and the LHS of the reducing production to
   *  indicate where to "shift" to.
   *
   * @see com.sun.java_cup.internal.runtime.lr_parser#get_reduce
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract short[][] action_table();

  /** The action table (supplied by generated subclass).  This table is
   *  indexed by state and terminal number indicating what action is to
   *  be taken when the parser is in the given state (i.e., the given state
   *  is on top of the stack) and the given terminal is next on the input.
   *  States are indexed using the first dimension, however, the entries for
   *  a given state are compacted and stored in adjacent index, value pairs
   *  which are searched for rather than accessed directly (see get_action()).
   *  The actions stored in the table will be either shifts, reduces, or
   *  errors.  Shifts are encoded as positive values (one greater than the
   *  state shifted to).  Reduces are encoded as negative values (one less
   *  than the production reduced by).  Error entries are denoted by zero.
   *
   * @see com.sun.java_cup.internal.runtime.lr_parser#get_action
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public abstract short[][] production_table();

  /** Table of production information (supplied by generated subclass).
   *  This table contains one entry per production and is indexed by
   *  the negative-encoded values (reduce actions) in the action_table.
   *  Each entry has two parts, the index of the non-terminal on the
   *  left hand side of the production, and the number of Symbols
   *  on the right hand side.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected int error_sync_size() {return _error_sync_size; }

  /** The number of Symbols after an error we much match to consider it
   *  recovered from.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  protected final static int _error_sync_size = 3;

  /** The default number of Symbols after an error we much match to consider
   *  it recovered from.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public lr_parser(Scanner s) {

  /** Constructor that sets the default scanner. [CSA/davidm] */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
  public lr_parser()

  /** Simple constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/lr_parser.java
public abstract class lr_parser {

/** This class implements a skeleton table driven LR parser.  In general,
 *  LR parsers are a form of bottom up shift-reduce parsers.  Shift-reduce
 *  parsers act by shifting input onto a parse stack until the Symbols
 *  matching the right hand side of a production appear on the top of the
 *  stack.  Once this occurs, a reduce is performed.  This involves removing
 *  the Symbols corresponding to the right hand side of the production
 *  (the so called "handle") and replacing them with the non-terminal from
 *  the left hand side of the production.  <p>
 *
 *  To control the decision of whether to shift or reduce at any given point,
 *  the parser uses a state machine (the "viable prefix recognition machine"
 *  built by the parser generator).  The current state of the machine is placed
 *  on top of the parse stack (stored as part of a Symbol object representing
 *  a terminal or non terminal).  The parse action table is consulted
 *  (using the current state and the current lookahead Symbol as indexes) to
 *  determine whether to shift or to reduce.  When the parser shifts, it
 *  changes to a new state by pushing a new Symbol (containing a new state)
 *  onto the stack.  When the parser reduces, it pops the handle (right hand
 *  side of a production) off the stack.  This leaves the parser in the state
 *  it was in before any of those Symbols were matched.  Next the reduce-goto
 *  table is consulted (using the new state and current lookahead Symbol as
 *  indexes) to determine a new state to go to.  The parser then shifts to
 *  this goto state by pushing the left hand side Symbol of the production
 *  (also containing the new state) onto the stack.<p>
 *
 *  This class actually provides four LR parsers.  The methods parse() and
 *  debug_parse() provide two versions of the main parser (the only difference
 *  being that debug_parse() emits debugging trace messages as it parses).
 *  In addition to these main parsers, the error recovery mechanism uses two
 *  more.  One of these is used to simulate "parsing ahead" in the input
 *  without carrying out actions (to verify that a potential error recovery
 *  has worked), and the other is used to parse through buffered "parse ahead"
 *  input in order to execute all actions and re-synchronize the actual parser
 *  configuration.<p>
 *
 *  This is an abstract class which is normally filled out by a subclass
 *  generated by the JavaCup parser generator.  In addition to supplying
 *  the actual parse tables, generated code also supplies methods which
 *  invoke various pieces of user supplied code, provide access to certain
 *  special Symbols (e.g., EOF and error), etc.  Specifically, the following
 *  abstract methods are normally supplied by generated code:
 *  <dl compact>
 *  <dt> short[][] production_table()
 *  <dd> Provides a reference to the production table (indicating the index of
 *       the left hand side non terminal and the length of the right hand side
 *       for each production in the grammar).
 *  <dt> short[][] action_table()
 *  <dd> Provides a reference to the parse action table.
 *  <dt> short[][] reduce_table()
 *  <dd> Provides a reference to the reduce-goto table.
 *  <dt> int start_state()
 *  <dd> Indicates the index of the start state.
 *  <dt> int start_production()
 *  <dd> Indicates the index of the starting production.
 *  <dt> int EOF_sym()
 *  <dd> Indicates the index of the EOF Symbol.
 *  <dt> int error_sym()
 *  <dd> Indicates the index of the error Symbol.
 *  <dt> Symbol do_action()
 *  <dd> Executes a piece of user supplied action code.  This always comes at
 *       the point of a reduce in the parse, so this code also allocates and
 *       fills in the left hand side non terminal Symbol object that is to be
 *       pushed onto the stack for the reduce.
 *  <dt> void init_actions()
 *  <dd> Code to initialize a special object that encapsulates user supplied
 *       actions (this object is used by do_action() to actually carry out the
 *       actions).
 *  </dl>
 *
 *  In addition to these routines that <i>must</i> be supplied by the
 *  generated subclass there are also a series of routines that <i>may</i>
 *  be supplied.  These include:
 *  <dl>
 *  <dt> Symbol scan()
 *  <dd> Used to get the next input Symbol from the scanner.
 *  <dt> Scanner getScanner()
 *  <dd> Used to provide a scanner for the default implementation of
 *       scan().
 *  <dt> int error_sync_size()
 *  <dd> This determines how many Symbols past the point of an error
 *       must be parsed without error in order to consider a recovery to
 *       be valid.  This defaults to 3.  Values less than 2 are not
 *       recommended.
 *  <dt> void report_error(String message, Object info)
 *  <dd> This method is called to report an error.  The default implementation
 *       simply prints a message to System.err and where the error occurred.
 *       This method is often replaced in order to provide a more sophisticated
 *       error reporting mechanism.
 *  <dt> void report_fatal_error(String message, Object info)
 *  <dd> This method is called when a fatal error that cannot be recovered from
 *       is encountered.  In the default implementation, it calls
 *       report_error() to emit a message, then throws an exception.
 *  <dt> void syntax_error(Symbol cur_token)
 *  <dd> This method is called as soon as syntax error is detected (but
 *       before recovery is attempted).  In the default implementation it
 *       invokes: report_error("Syntax error", null);
 *  <dt> void unrecovered_syntax_error(Symbol cur_token)
 *  <dd> This method is called if syntax error recovery fails.  In the default
 *       implementation it invokes:<br>
 *         report_fatal_error("Couldn't repair and continue parse", null);
 *  </dl>
 *
 * @see     com.sun.java_cup.internal.runtime.Symbol
 * @see     com.sun.java_cup.internal.runtime.Symbol
 * @see     com.sun.java_cup.internal.runtime.virtual_parse_stack
 * @author  Frank Flannery
 */
