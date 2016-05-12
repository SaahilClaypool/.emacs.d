_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public Object clone() {

    /**
     * Create a copy of this iterator
     * @return A copy of this
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public int getIndex() {

    /**
     * Returns the current index.
     * @return the current index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public int getEndIndex() {

    /**
     * Returns the end index of the text.  This index is the index of the first
     * character following the end of the text.
     * @return the index after the last character in the text
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public int getBeginIndex() {

    /**
     * Returns the start index of the text.
     * @return the index at which the text begins.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public char setIndex(int position) {

    /**
     * Sets the position to the specified position in the text and returns that
     * character.
     * @param position the position within the text.  Valid values range from
     * getBeginIndex() to getEndIndex().  An IllegalArgumentException is thrown
     * if an invalid value is supplied.
     * @return the character at the specified position or DONE if the specified position is equal to getEndIndex()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public char previous() {

    /**
     * Decrements the iterator's index by one and returns the character
     * at the new index. If the current index is getBeginIndex(), the index
     * remains at getBeginIndex() and a value of DONE is returned.
     * @return the character at the new position or DONE if the current
     * position is equal to getBeginIndex().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public char next() {

    /**
     * Increments the iterator's index by one and returns the character
     * at the new index.  If the resulting index is greater or equal
     * to getEndIndex(), the current index is reset to getEndIndex() and
     * a value of DONE is returned.
     * @return the character at the new position or DONE if the new
     * position is off the end of the text range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public char current() {

    /**
     * Gets the character at the current position (as returned by getIndex()).
     * @return the character at the current position or DONE if the current
     * position is off the end of the text.
     * @see getIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public char last() {

    /**
     * Sets the position to getEndIndex()-1 (getEndIndex() if the text is empty)
     * and returns the character at that position.
     * @return the last character in the text, or DONE if the text is empty
     * @see getEndIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public char first() {

    /**
     * Sets the position to getBeginIndex() and returns the character at that
     * position.
     * @return the first character in the text, or DONE if the text is empty
     * @see getBeginIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public Object clone() {

    /**
     * Create a copy of this iterator
     * @return A copy of this
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public int getIndex() {

    /**
     * Returns the current index.
     * @return the current index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public int getEndIndex() {

    /**
     * Returns the end index of the text.  This index is the index of the first
     * character following the end of the text.
     * @return the index after the last character in the text
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public int getBeginIndex() {

    /**
     * Returns the start index of the text.
     * @return the index at which the text begins.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public char setIndex(int position) {

    /**
     * Sets the position to the specified position in the text and returns that
     * character.
     * @param position the position within the text.  Valid values range from
     * getBeginIndex() to getEndIndex().  An IllegalArgumentException is thrown
     * if an invalid value is supplied.
     * @return the character at the specified position or DONE if the specified position is equal to getEndIndex()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public char previous() {

    /**
     * Decrements the iterator's index by one and returns the character
     * at the new index. If the current index is getBeginIndex(), the index
     * remains at getBeginIndex() and a value of DONE is returned.
     * @return the character at the new position or DONE if the current
     * position is equal to getBeginIndex().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public char next() {

    /**
     * Increments the iterator's index by one and returns the character
     * at the new index.  If the resulting index is greater or equal
     * to getEndIndex(), the current index is reset to getEndIndex() and
     * a value of DONE is returned.
     * @return the character at the new position or DONE if the new
     * position is off the end of the text range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public char current() {

    /**
     * Gets the character at the current position (as returned by getIndex()).
     * @return the character at the current position or DONE if the current
     * position is off the end of the text.
     * @see getIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public char last() {

    /**
     * Sets the position to getEndIndex()-1 (getEndIndex() if the text is empty)
     * and returns the character at that position.
     * @return the last character in the text, or DONE if the text is empty
     * @see getEndIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/CharArrayIterator.java
    public char first() {

    /**
     * Sets the position to getBeginIndex() and returns the character at that
     * position.
     * @return the first character in the text, or DONE if the text is empty
     * @see getBeginIndex
     */
