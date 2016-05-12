_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/LineMap.java
    long getColumnNumber(long pos);

    /**
     * Find the column for a character position.
     * Tab characters preceding the position on the same line
     * will be expanded when calculating the column number.
     *
     * @param  pos   character offset of the position
     * @return       the tab-expanded column number of pos (first column is 1)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/LineMap.java
    long getLineNumber(long pos);

    /**
     * Find the line containing a position; a line termination
     * character is on the line it terminates.
     *
     * @param   pos  character offset of the position
     * @return the line number of pos (first line is 1)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/LineMap.java
    long getPosition(long line, long column);

    /**
     * Find the position corresponding to a (line,column).
     *
     * @param   line    line number (beginning at 1)
     * @param   column  tab-expanded column number (beginning 1)
     *
     * @return  position of character
     * @throws  IndexOutOfBoundsException
     *           if {@code line < 1}
     *           if {@code line > no. of lines}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/LineMap.java
    long getStartPosition(long line);

    /**
     * Find the start position of a line.
     *
     * @param line line number (beginning at 1)
     * @return     position of first character in line
     * @throws  IndexOutOfBoundsException
     *           if {@code lineNumber < 1}
     *           if {@code lineNumber > no. of lines}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/LineMap.java
@jdk.Exported

/**
 * Provides methods to convert between character positions and line numbers
 * for a compilation unit.
 *
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/LineMap.java
    long getColumnNumber(long pos);

    /**
     * Find the column for a character position.
     * Tab characters preceding the position on the same line
     * will be expanded when calculating the column number.
     *
     * @param  pos   character offset of the position
     * @return       the tab-expanded column number of pos (first column is 1)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/LineMap.java
    long getLineNumber(long pos);

    /**
     * Find the line containing a position; a line termination
     * character is on the line it terminates.
     *
     * @param   pos  character offset of the position
     * @return the line number of pos (first line is 1)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/LineMap.java
    long getPosition(long line, long column);

    /**
     * Find the position corresponding to a (line,column).
     *
     * @param   line    line number (beginning at 1)
     * @param   column  tab-expanded column number (beginning 1)
     *
     * @return  position of character
     * @throws  IndexOutOfBoundsException
     *           if {@code line < 1}
     *           if {@code line > no. of lines}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/LineMap.java
    long getStartPosition(long line);

    /**
     * Find the start position of a line.
     *
     * @param line line number (beginning at 1)
     * @return     position of first character in line
     * @throws  IndexOutOfBoundsException
     *           if {@code lineNumber < 1}
     *           if {@code lineNumber > no. of lines}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/LineMap.java
@jdk.Exported

/**
 * Provides methods to convert between character positions and line numbers
 * for a compilation unit.
 *
 * @since 1.6
 */
