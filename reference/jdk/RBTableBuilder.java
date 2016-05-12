_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBTableBuilder.java
    private int addExpansion(int anOrder, String expandChars) {

    /**
     * Create a new entry in the expansion table that contains the orderings
     * for the given characers.  If anOrder is valid, it is added to the
     * beginning of the expanded list of orders.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBTableBuilder.java
    private final void addExpandOrder(String contractChars,
                                String expandChars,
                                int anOrder) throws ParseException

    /**
     *  Adds the expanding string into the collation table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBTableBuilder.java
    private Vector<EntryPair> getContractValues(int ch)

    /**
     *  Get the entry of hash table of the contracting string in the collation
     *  table.
     *  @param ch the starting character of the contracting string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBTableBuilder.java
    private int getContractOrder(String groupChars)

    /**
     * If the given string has been specified as a contracting string
     * in this collation table, return its ordering.
     * Otherwise return UNMAPPED.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBTableBuilder.java
    private final void addContractOrder(String groupChars, int anOrder,
                                          boolean fwd)

    /**
     *  Adds the contracting string into the collation table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBTableBuilder.java
    private final void addOrder(int ch, int anOrder)

    /**
     *  Adds a character and its designated order into the collation table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBTableBuilder.java
    private final int increment(int aStrength, int lastValue)

    /**
     *  Increment of the last order based on the comparison level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBTableBuilder.java
    private final void commit()

    /**
     * Look up for unmapped values in the expanded character table.
     *
     * When the expanding character tables are built by addExpandOrder,
     * it doesn't know what the final ordering of each character
     * in the expansion will be.  Instead, it just puts the raw character
     * code into the table, adding CHARINDEX as a flag.  Now that we've
     * finished building the mapping table, we can go back and look up
     * that character to see what its real collation order is and
     * stick that into the expansion table.  That lets us avoid doing
     * a two-stage lookup later.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBTableBuilder.java
    private void addComposedChars() throws ParseException {

    /** Add expanding entries for pre-composed unicode characters so that this
     * collator can be used reasonably well with decomposition turned off.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBTableBuilder.java
    public void build(String pattern, int decmp) throws ParseException

    /**
     * Create a table-based collation object with the given rules.
     * This is the main function that actually builds the tables and
     * stores them back in the RBCollationTables object.  It is called
     * ONLY by the RBCollationTables constructor.
     * @see RuleBasedCollator#RuleBasedCollator
     * @exception ParseException If the rules format is incorrect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBTableBuilder.java
final class RBTableBuilder {

/**
 * This class contains all the code to parse a RuleBasedCollator pattern
 * and build a RBCollationTables object from it.  A particular instance
 * of tis class exists only during the actual build process-- once an
 * RBCollationTables object has been built, the RBTableBuilder object
 * goes away.  This object carries all of the state which is only needed
 * during the build process, plus a "shadow" copy of all of the state
 * that will go into the tables object itself.  This object communicates
 * with RBCollationTables through a separate class, RBCollationTables.BuildAPI,
 * this is an inner class of RBCollationTables and provides a separate
 * private API for communication with RBTableBuilder.
 * This class isn't just an inner class of RBCollationTables itself because
 * of its large size.  For source-code readability, it seemed better for the
 * builder to have its own source file.
 */
