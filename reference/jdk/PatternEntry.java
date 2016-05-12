_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/PatternEntry.java
    final String getChars() {

    /**
     * Gets the core characters of the entry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/PatternEntry.java
    final String getExtension() {

    /**
     * Gets the expanding characters of the entry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/PatternEntry.java
    final int getStrength() {

    /**
     * Gets the strength of the entry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/PatternEntry.java
    public String toString() {

    /**
     * For debugging.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/PatternEntry.java
    public boolean equals(Object obj) {

    /**
     * WARNING this is used for searching in a Vector.
     * Because Vector.indexOf doesn't take a comparator,
     * this method is ill-defined and ignores strength.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/PatternEntry.java
    public void appendQuotedChars(StringBuffer toAddTo) {

    /**
     * Gets the current chars, quoted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/PatternEntry.java
class PatternEntry {

/**
 * Utility class for normalizing and merging patterns for collation.
 * This is to be used with MergeCollation for adding patterns to an
 * existing rule table.
 * @see        MergeCollation
 * @author     Mark Davis, Helena Shih
 */
