_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBCollationTables.java
    //shemran/Note: this is used for secondary order value reverse, no

    /**
     * Reverse a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBCollationTables.java
    int getUnicodeOrder(int ch) {

    /**
     * Get the comarison order of a character from the collation table.
     * @return the comparison order of a character.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBCollationTables.java
    final int[] getExpandValueList(int idx) {

    /**
     * Get the entry of hash table of the expanding string in the collation
     * table.
     * @param idx the index of the expanding string value list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBCollationTables.java
    int getMaxExpansion(int order) {

    /**
      * Return the maximum length of any expansion sequences that end
      * with the specified comparison order.
      *
      * @param order a collation order returned by previous or next.
      * @return the maximum length of any expansion seuences ending
      *         with the specified order.
      *
      * @see CollationElementIterator#getMaxExpansion
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBCollationTables.java
    boolean usedInContractSeq(int c) {

    /**
     * Returns true if this character appears anywhere in a contracting
     * character sequence.  (Used by CollationElementIterator.setOffset().)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBCollationTables.java
    Vector<EntryPair> getContractValues(int ch)

    /**
     *  Get the entry of hash table of the contracting string in the collation
     *  table.
     *  @param ch the starting character of the contracting string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBCollationTables.java
    public String getRules()

    /**
     * Gets the table-based rules for the collation object.
     * @return returns the collation rules that the table collation object
     * was created from.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBCollationTables.java
        void fillInTables(boolean f2ary,
                          boolean swap,
                          UCompactIntArray map,
                          Vector<Vector<EntryPair>> cTbl,
                          Vector<int[]> eTbl,
                          IntHashtable cFlgs,
                          short mso,
                          short mto) {

        /**
         * This function is used by RBTableBuilder to fill in all the members of this
         * object.  (Effectively, the builder class functions as a "friend" of this
         * class, but to avoid changing too much of the logic, it carries around "shadow"
         * copies of all these variables until the end of the build process and then
         * copies them en masse into the actual tables object once all the construction
         * logic is complete.  This function does that "copying en masse".
         * @param f2ary The value for frenchSec (the French-secondary flag)
         * @param swap The value for SE Asian swapping rule
         * @param map The collator's character-mapping table (the value for mapping)
         * @param cTbl The collator's contracting-character table (the value for contractTable)
         * @param eTbl The collator's expanding-character table (the value for expandTable)
         * @param cFlgs The hash table of characters that participate in contracting-
         *              character sequences (the value for contractFlags)
         * @param mso The value for maxSecOrder
         * @param mto The value for maxTerOrder
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBCollationTables.java
        private BuildAPI() {

        /**
         * Private constructor.  Prevents anyone else besides RBTableBuilder
         * from gaining direct access to the internals of this class.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/RBCollationTables.java
final class RBCollationTables {

/**
 * This class contains the static state of a RuleBasedCollator: The various
 * tables that are used by the collation routines.  Several RuleBasedCollators
 * can share a single RBCollationTables object, easing memory requirements and
 * improving performance.
 */
