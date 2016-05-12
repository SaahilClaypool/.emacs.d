_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
    @Override

    /**
     * Closes/pops all directories on the stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
    boolean isOpen() {

    /**
     * Returns {@code true} if the walker is open.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
    void skipRemainingSiblings() {

    /**
     * Skips the remaining entries in the directory at the top of the stack.
     * This method is a no-op if the stack is empty or the walker is closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
    void pop() {

    /**
     * Pops the directory node that is the current top of the stack so that
     * there are no more events for the directory (including no END_DIRECTORY)
     * event. This method is a no-op if the stack is empty or the walker is
     * closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
    Event next() {

    /**
     * Returns the next Event or {@code null} if there are no more events or
     * the walker is closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
    Event walk(Path file) {

    /**
     * Start walking from the given file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
    private Event visit(Path entry, boolean ignoreSecurityException, boolean canUseCached) {

    /**
     * Visits the given file, returning the {@code Event} corresponding to that
     * visit.
     *
     * The {@code ignoreSecurityException} parameter determines whether
     * any SecurityException should be ignored or not. If a SecurityException
     * is thrown, and is ignored, then this method returns {@code null} to
     * mean that there is no event corresponding to a visit to the file.
     *
     * The {@code canUseCached} parameter determines whether cached attributes
     * for the file can be used or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
    private boolean wouldLoop(Path dir, Object key) {

    /**
     * Returns true if walking into the given directory would result in a
     * file system loop/cycle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
    private BasicFileAttributes getAttributes(Path file, boolean canUseCached)

    /**
     * Returns the attributes of the given file, taking into account whether
     * the walk is following sym links is not. The {@code canUseCached}
     * argument determines whether this method can use cached attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
    FileTreeWalker(Collection<FileVisitOption> options, int maxDepth) {

    /**
     * Creates a {@code FileTreeWalker}.
     *
     * @throws  IllegalArgumentException
     *          if {@code maxDepth} is negative
     * @throws  ClassCastException
     *          if (@code options} contains an element that is not a
     *          {@code FileVisitOption}
     * @throws  NullPointerException
     *          if {@code options} is {@ocde null} or the options
     *          array contains a {@code null} element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
    static class Event {

    /**
     * Events returned by the {@link #walk} and {@link #next} methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
        END_DIRECTORY,

        /**
         * End of a directory
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
    static enum EventType {

    /**
     * The event types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
    private static class DirectoryNode {

    /**
     * The element on the walking stack corresponding to a directory node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileTreeWalker.java
class FileTreeWalker implements Closeable {

/**
 * Walks a file tree, generating a sequence of events corresponding to the files
 * in the tree.
 *
 * <pre>{@code
 *     Path top = ...
 *     Set<FileVisitOption> options = ...
 *     int maxDepth = ...
 *
 *     try (FileTreeWalker walker = new FileTreeWalker(options, maxDepth)) {
 *         FileTreeWalker.Event ev = walker.walk(top);
 *         do {
 *             process(ev);
 *             ev = walker.next();
 *         } while (ev != null);
 *     }
 * }</pre>
 *
 * @see Files#walkFileTree
 */
