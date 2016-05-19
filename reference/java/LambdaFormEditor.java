_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    // Each editing method can (potentially) cache the edited LF so that it can be reused later.

    /// Editing methods for lambda forms.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private BoundMethodHandle.SpeciesData oldSpeciesData() {

    /// Editing methods for method handles.  These need to have fast paths.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private LambdaForm putInCache(Transform key, LambdaForm form) {

    /** Cache a transform with its result, and return that result.
     *  But if an equivalent transform has already been cached, return its result instead.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private static final int MIN_CACHE_ARRAY_SIZE = 4, MAX_CACHE_ARRAY_SIZE = 16;

    /** Arbitrary but reasonable limits on Transform[] size for cache. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private LambdaForm getInCache(Transform key) {

    /** Find a previously cached transform equivalent to the given one, and return its result. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private static final class Transform extends SoftReference<LambdaForm> {

    /** A description of a cached transform, possibly associated with the result of the transform.
     *  The logical content is a sequence of byte values, starting with a Kind.ordinal value.
     *  The sequence is unterminated, ending with an indefinite number of zero bytes.
     *  Sequences that are simple (short enough and with small enough values) pack into a 64-bit long.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
class LambdaFormEditor {

/** Transforms on LFs.
 *  A lambda-form editor can derive new LFs from its base LF.
 *  The editor can cache derived LFs, which simplifies the reuse of their underlying bytecodes.
 *  To support this caching, a LF has an optional pointer to its editor.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    // Each editing method can (potentially) cache the edited LF so that it can be reused later.

    /// Editing methods for lambda forms.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private BoundMethodHandle.SpeciesData oldSpeciesData() {

    /// Editing methods for method handles.  These need to have fast paths.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private LambdaForm putInCache(Transform key, LambdaForm form) {

    /** Cache a transform with its result, and return that result.
     *  But if an equivalent transform has already been cached, return its result instead.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private static final int MIN_CACHE_ARRAY_SIZE = 4, MAX_CACHE_ARRAY_SIZE = 16;

    /** Arbitrary but reasonable limits on Transform[] size for cache. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private LambdaForm getInCache(Transform key) {

    /** Find a previously cached transform equivalent to the given one, and return its result. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private static final class Transform extends SoftReference<LambdaForm> {

    /** A description of a cached transform, possibly associated with the result of the transform.
     *  The logical content is a sequence of byte values, starting with a Kind.ordinal value.
     *  The sequence is unterminated, ending with an indefinite number of zero bytes.
     *  Sequences that are simple (short enough and with small enough values) pack into a 64-bit long.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
class LambdaFormEditor {

/** Transforms on LFs.
 *  A lambda-form editor can derive new LFs from its base LF.
 *  The editor can cache derived LFs, which simplifies the reuse of their underlying bytecodes.
 *  To support this caching, a LF has an optional pointer to its editor.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    // Each editing method can (potentially) cache the edited LF so that it can be reused later.

    /// Editing methods for lambda forms.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private BoundMethodHandle.SpeciesData oldSpeciesData() {

    /// Editing methods for method handles.  These need to have fast paths.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private LambdaForm putInCache(Transform key, LambdaForm form) {

    /** Cache a transform with its result, and return that result.
     *  But if an equivalent transform has already been cached, return its result instead.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private static final int MIN_CACHE_ARRAY_SIZE = 4, MAX_CACHE_ARRAY_SIZE = 16;

    /** Arbitrary but reasonable limits on Transform[] size for cache. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private LambdaForm getInCache(Transform key) {

    /** Find a previously cached transform equivalent to the given one, and return its result. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private static final class Transform extends SoftReference<LambdaForm> {

    /** A description of a cached transform, possibly associated with the result of the transform.
     *  The logical content is a sequence of byte values, starting with a Kind.ordinal value.
     *  The sequence is unterminated, ending with an indefinite number of zero bytes.
     *  Sequences that are simple (short enough and with small enough values) pack into a 64-bit long.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
class LambdaFormEditor {

/** Transforms on LFs.
 *  A lambda-form editor can derive new LFs from its base LF.
 *  The editor can cache derived LFs, which simplifies the reuse of their underlying bytecodes.
 *  To support this caching, a LF has an optional pointer to its editor.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    // Each editing method can (potentially) cache the edited LF so that it can be reused later.

    /// Editing methods for lambda forms.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private BoundMethodHandle.SpeciesData oldSpeciesData() {

    /// Editing methods for method handles.  These need to have fast paths.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private LambdaForm putInCache(Transform key, LambdaForm form) {

    /** Cache a transform with its result, and return that result.
     *  But if an equivalent transform has already been cached, return its result instead.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private static final int MIN_CACHE_ARRAY_SIZE = 4, MAX_CACHE_ARRAY_SIZE = 16;

    /** Arbitrary but reasonable limits on Transform[] size for cache. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private LambdaForm getInCache(Transform key) {

    /** Find a previously cached transform equivalent to the given one, and return its result. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private static final class Transform extends SoftReference<LambdaForm> {

    /** A description of a cached transform, possibly associated with the result of the transform.
     *  The logical content is a sequence of byte values, starting with a Kind.ordinal value.
     *  The sequence is unterminated, ending with an indefinite number of zero bytes.
     *  Sequences that are simple (short enough and with small enough values) pack into a 64-bit long.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
class LambdaFormEditor {

/** Transforms on LFs.
 *  A lambda-form editor can derive new LFs from its base LF.
 *  The editor can cache derived LFs, which simplifies the reuse of their underlying bytecodes.
 *  To support this caching, a LF has an optional pointer to its editor.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    // Each editing method can (potentially) cache the edited LF so that it can be reused later.

    /// Editing methods for lambda forms.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private BoundMethodHandle.SpeciesData oldSpeciesData() {

    /// Editing methods for method handles.  These need to have fast paths.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private LambdaForm putInCache(Transform key, LambdaForm form) {

    /** Cache a transform with its result, and return that result.
     *  But if an equivalent transform has already been cached, return its result instead.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private static final int MIN_CACHE_ARRAY_SIZE = 4, MAX_CACHE_ARRAY_SIZE = 16;

    /** Arbitrary but reasonable limits on Transform[] size for cache. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private LambdaForm getInCache(Transform key) {

    /** Find a previously cached transform equivalent to the given one, and return its result. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
    private static final class Transform extends SoftReference<LambdaForm> {

    /** A description of a cached transform, possibly associated with the result of the transform.
     *  The logical content is a sequence of byte values, starting with a Kind.ordinal value.
     *  The sequence is unterminated, ending with an indefinite number of zero bytes.
     *  Sequences that are simple (short enough and with small enough values) pack into a 64-bit long.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormEditor.java
class LambdaFormEditor {

/** Transforms on LFs.
 *  A lambda-form editor can derive new LFs from its base LF.
 *  The editor can cache derived LFs, which simplifies the reuse of their underlying bytecodes.
 *  To support this caching, a LF has an optional pointer to its editor.
 */
