_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/MergeCollation.java
    public PatternEntry getItemAt(int index) {

    /**
     * gets count of separate entries
     * @param index the offset of the desired pattern entry
     * @return the requested pattern entry
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/MergeCollation.java
    public int getCount() {

    /**
     * gets count of separate entries
     * @return the size of pattern entries
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/MergeCollation.java
    public void addPattern(String pattern) throws ParseException

    /**
     * adds a pattern to the current one.
     * @param pattern the new pattern to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/MergeCollation.java
    public void setPattern(String pattern) throws ParseException

    /**
     * sets the pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/MergeCollation.java
    public String emitPattern(boolean withWhiteSpace) {

    /**
     * emits the pattern for collation builder.
     * @param withWhiteSpace puts spacing around the entries, and \n
     * before & and <
     * @return emits the string in the format understable to the collation
     * builder.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/MergeCollation.java
    public String emitPattern() {

    /**
     * emits the pattern for collation builder.
     * @return emits the string in the format understable to the collation
     * builder.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/MergeCollation.java
    public String getPattern(boolean withWhiteSpace) {

    /**
     * recovers current pattern.
     * @param withWhiteSpace puts spacing around the entries, and \n
     * before & and <
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/MergeCollation.java
    public String getPattern() {

    /**
     * recovers current pattern
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/MergeCollation.java
    public MergeCollation(String pattern) throws ParseException

    /**
     * Creates from a pattern
     * @exception ParseException If the input pattern is incorrect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/MergeCollation.java
final class MergeCollation {

/**
 * Utility class for normalizing and merging patterns for collation.
 * Patterns are strings of the form <entry>*, where <entry> has the
 * form:
 * <pattern> := <entry>*
 * <entry> := <separator><chars>{"/"<extension>}
 * <separator> := "=", ",", ";", "<", "&"
 * <chars>, and <extension> are both arbitrary strings.
 * unquoted whitespaces are ignored.
 * 'xxx' can be used to quote characters
 * One difference from Collator is that & is used to reset to a current
 * point. Or, in other words, it introduces a new sequence which is to
 * be added to the old.
 * That is: "a < b < c < d" is the same as "a < b & b < c & c < d" OR
 * "a < b < d & b < c"
 * XXX: make '' be a single quote.
 * @see PatternEntry
 * @author             Mark Davis, Helena Shih
 */
