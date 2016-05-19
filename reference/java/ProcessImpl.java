_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static native long openForAtomicAppend(String path)

    /**
     * Opens a file for atomic append. The file is created if it doesn't
     * already exist.
     *
     * @param file the file to open or create
     * @return the native HANDLE
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static synchronized native long create(String cmdstr,
                                      String envblock,
                                      String dir,
                                      long[] stdHandles,
                                      boolean redirectErrorStream)

    /**
     * Create a process using the win32 function CreateProcess.
     * The method is synchronized due to MS kb315939 problem.
     * All native handles should restore the inherit flag at the end of call.
     *
     * @param cmdstr the Windows command line
     * @param envblock NUL-separated, double-NUL-terminated list of
     *        environment strings in VAR=VALUE form
     * @param dir the working directory of the process, or null if
     *        inheriting the current directory from the parent process
     * @param stdHandles array of windows HANDLEs.  Indexes 0, 1, and
     *        2 correspond to standard input, standard output and
     *        standard error, respectively.  On input, a value of -1
     *        means to create a pipe to connect child and parent
     *        processes.  On output, a value which is not -1 is the
     *        parent pipe handle corresponding to the pipe which has
     *        been created.  An element of this array is -1 on input
     *        if and only if it is <em>not</em> -1 on output.
     * @param redirectErrorStream redirectErrorStream attribute
     * @return the native subprocess HANDLE returned by CreateProcess
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static FileOutputStream newFileOutputStream(File f, boolean append)

    /**
     * Open a file for writing. If {@code append} is {@code true} then the file
     * is opened for atomic append directly and a FileOutputStream constructed
     * with the resulting handle. This is because a FileOutputStream created
     * to append to a file does not open the file in a manner that guarantees
     * that writes by the child process will be atomic.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static native long openForAtomicAppend(String path)

    /**
     * Opens a file for atomic append. The file is created if it doesn't
     * already exist.
     *
     * @param file the file to open or create
     * @return the native HANDLE
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static synchronized native long create(String cmdstr,
                                      String envblock,
                                      String dir,
                                      long[] stdHandles,
                                      boolean redirectErrorStream)

    /**
     * Create a process using the win32 function CreateProcess.
     * The method is synchronized due to MS kb315939 problem.
     * All native handles should restore the inherit flag at the end of call.
     *
     * @param cmdstr the Windows command line
     * @param envblock NUL-separated, double-NUL-terminated list of
     *        environment strings in VAR=VALUE form
     * @param dir the working directory of the process, or null if
     *        inheriting the current directory from the parent process
     * @param stdHandles array of windows HANDLEs.  Indexes 0, 1, and
     *        2 correspond to standard input, standard output and
     *        standard error, respectively.  On input, a value of -1
     *        means to create a pipe to connect child and parent
     *        processes.  On output, a value which is not -1 is the
     *        parent pipe handle corresponding to the pipe which has
     *        been created.  An element of this array is -1 on input
     *        if and only if it is <em>not</em> -1 on output.
     * @param redirectErrorStream redirectErrorStream attribute
     * @return the native subprocess HANDLE returned by CreateProcess
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static FileOutputStream newFileOutputStream(File f, boolean append)

    /**
     * Open a file for writing. If {@code append} is {@code true} then the file
     * is opened for atomic append directly and a FileOutputStream constructed
     * with the resulting handle. This is because a FileOutputStream created
     * to append to a file does not open the file in a manner that guarantees
     * that writes by the child process will be atomic.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static native long openForAtomicAppend(String path)

    /**
     * Opens a file for atomic append. The file is created if it doesn't
     * already exist.
     *
     * @param file the file to open or create
     * @return the native HANDLE
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static synchronized native long create(String cmdstr,
                                      String envblock,
                                      String dir,
                                      long[] stdHandles,
                                      boolean redirectErrorStream)

    /**
     * Create a process using the win32 function CreateProcess.
     * The method is synchronized due to MS kb315939 problem.
     * All native handles should restore the inherit flag at the end of call.
     *
     * @param cmdstr the Windows command line
     * @param envblock NUL-separated, double-NUL-terminated list of
     *        environment strings in VAR=VALUE form
     * @param dir the working directory of the process, or null if
     *        inheriting the current directory from the parent process
     * @param stdHandles array of windows HANDLEs.  Indexes 0, 1, and
     *        2 correspond to standard input, standard output and
     *        standard error, respectively.  On input, a value of -1
     *        means to create a pipe to connect child and parent
     *        processes.  On output, a value which is not -1 is the
     *        parent pipe handle corresponding to the pipe which has
     *        been created.  An element of this array is -1 on input
     *        if and only if it is <em>not</em> -1 on output.
     * @param redirectErrorStream redirectErrorStream attribute
     * @return the native subprocess HANDLE returned by CreateProcess
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static FileOutputStream newFileOutputStream(File f, boolean append)

    /**
     * Open a file for writing. If {@code append} is {@code true} then the file
     * is opened for atomic append directly and a FileOutputStream constructed
     * with the resulting handle. This is because a FileOutputStream created
     * to append to a file does not open the file in a manner that guarantees
     * that writes by the child process will be atomic.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static native long openForAtomicAppend(String path)

    /**
     * Opens a file for atomic append. The file is created if it doesn't
     * already exist.
     *
     * @param file the file to open or create
     * @return the native HANDLE
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static synchronized native long create(String cmdstr,
                                      String envblock,
                                      String dir,
                                      long[] stdHandles,
                                      boolean redirectErrorStream)

    /**
     * Create a process using the win32 function CreateProcess.
     * The method is synchronized due to MS kb315939 problem.
     * All native handles should restore the inherit flag at the end of call.
     *
     * @param cmdstr the Windows command line
     * @param envblock NUL-separated, double-NUL-terminated list of
     *        environment strings in VAR=VALUE form
     * @param dir the working directory of the process, or null if
     *        inheriting the current directory from the parent process
     * @param stdHandles array of windows HANDLEs.  Indexes 0, 1, and
     *        2 correspond to standard input, standard output and
     *        standard error, respectively.  On input, a value of -1
     *        means to create a pipe to connect child and parent
     *        processes.  On output, a value which is not -1 is the
     *        parent pipe handle corresponding to the pipe which has
     *        been created.  An element of this array is -1 on input
     *        if and only if it is <em>not</em> -1 on output.
     * @param redirectErrorStream redirectErrorStream attribute
     * @return the native subprocess HANDLE returned by CreateProcess
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static FileOutputStream newFileOutputStream(File f, boolean append)

    /**
     * Open a file for writing. If {@code append} is {@code true} then the file
     * is opened for atomic append directly and a FileOutputStream constructed
     * with the resulting handle. This is because a FileOutputStream created
     * to append to a file does not open the file in a manner that guarantees
     * that writes by the child process will be atomic.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static native long openForAtomicAppend(String path)

    /**
     * Opens a file for atomic append. The file is created if it doesn't
     * already exist.
     *
     * @param file the file to open or create
     * @return the native HANDLE
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static synchronized native long create(String cmdstr,
                                      String envblock,
                                      String dir,
                                      long[] stdHandles,
                                      boolean redirectErrorStream)

    /**
     * Create a process using the win32 function CreateProcess.
     * The method is synchronized due to MS kb315939 problem.
     * All native handles should restore the inherit flag at the end of call.
     *
     * @param cmdstr the Windows command line
     * @param envblock NUL-separated, double-NUL-terminated list of
     *        environment strings in VAR=VALUE form
     * @param dir the working directory of the process, or null if
     *        inheriting the current directory from the parent process
     * @param stdHandles array of windows HANDLEs.  Indexes 0, 1, and
     *        2 correspond to standard input, standard output and
     *        standard error, respectively.  On input, a value of -1
     *        means to create a pipe to connect child and parent
     *        processes.  On output, a value which is not -1 is the
     *        parent pipe handle corresponding to the pipe which has
     *        been created.  An element of this array is -1 on input
     *        if and only if it is <em>not</em> -1 on output.
     * @param redirectErrorStream redirectErrorStream attribute
     * @return the native subprocess HANDLE returned by CreateProcess
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ProcessImpl.java
    private static FileOutputStream newFileOutputStream(File f, boolean append)

    /**
     * Open a file for writing. If {@code append} is {@code true} then the file
     * is opened for atomic append directly and a FileOutputStream constructed
     * with the resulting handle. This is because a FileOutputStream created
     * to append to a file does not open the file in a manner that guarantees
     * that writes by the child process will be atomic.
     */
