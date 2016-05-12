_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeIterator.java
    FileTreeIterator(Path start, int maxDepth, FileVisitOption... options)

    /**
     * Creates a new iterator to walk the file tree starting at the given file.
     *
     * @throws  IllegalArgumentException
     *          if {@code maxDepth} is negative
     * @throws  IOException
     *          if an I/O errors occurs opening the starting file
     * @throws  SecurityException
     *          if the security manager denies access to the starting file
     * @throws  NullPointerException
     *          if {@code start} or {@code options} is {@ocde null} or
     *          the options array contains a {@code null} element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeIterator.java
class FileTreeIterator implements Iterator<Event>, Closeable {

/**
 * An {@code Iterator to iterate over the nodes of a file tree.
 *
 * <pre>{@code
 *     try (FileTreeIterator iterator = new FileTreeIterator(start, maxDepth, options)) {
 *         while (iterator.hasNext()) {
 *             Event ev = iterator.next();
 *             Path path = ev.file();
 *             BasicFileAttributes attrs = ev.attributes();
 *         }
 *     }
 * }</pre>
 */
