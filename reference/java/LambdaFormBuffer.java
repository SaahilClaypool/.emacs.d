_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer insertParameter(int pos, Name param) {

    /** Insert a fresh parameter. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer insertExpression(int pos, Name expr) {

    /** Insert a fresh expression. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceParameterByCopy(int pos, int valuePos) {

    /** Replace a parameter by another parameter or expression already in the form. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceParameterByNewExpression(int pos, Name binding) {

    /** Replace a parameter by a fresh expression. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer renameParameter(int pos, Name newParam) {

    /** Replace a parameter by a fresh parameter. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceFunctions(NamedFunction[] oldFns, NamedFunction[] newFns,
                                      Object... forArguments) {

    /** Replace any Name whose function is in oldFns with a copy
     *  whose function is in the corresponding position in newFns.
     *  Only do this if the arguments are exactly equal to the given.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaForm endEdit() {

    /** Finish a transaction. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    void setResult(Name name) {

    /** Change the result name.  Null means a void result. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    void startEdit() {

    /** Create a private, writable copy of names.
     *  Preserve the original copy, for reference.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    private void clearDuplicatesAndNulls() {

    /** Replace duplicate names by nulls, and remove all nulls. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    private void noteDuplicate(int pos1, int pos2) {

    /** We have just overwritten the name at pos1 with the name at pos2.
     *  This means that there are two copies of the name, which we will have to fix later.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
final class LambdaFormBuffer {

/** Working storage for an LF that is being transformed.
 *  Similarly to a StringBuffer, the editing can take place in multiple steps.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer insertParameter(int pos, Name param) {

    /** Insert a fresh parameter. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer insertExpression(int pos, Name expr) {

    /** Insert a fresh expression. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceParameterByCopy(int pos, int valuePos) {

    /** Replace a parameter by another parameter or expression already in the form. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceParameterByNewExpression(int pos, Name binding) {

    /** Replace a parameter by a fresh expression. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer renameParameter(int pos, Name newParam) {

    /** Replace a parameter by a fresh parameter. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceFunctions(NamedFunction[] oldFns, NamedFunction[] newFns,
                                      Object... forArguments) {

    /** Replace any Name whose function is in oldFns with a copy
     *  whose function is in the corresponding position in newFns.
     *  Only do this if the arguments are exactly equal to the given.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaForm endEdit() {

    /** Finish a transaction. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    void setResult(Name name) {

    /** Change the result name.  Null means a void result. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    void startEdit() {

    /** Create a private, writable copy of names.
     *  Preserve the original copy, for reference.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    private void clearDuplicatesAndNulls() {

    /** Replace duplicate names by nulls, and remove all nulls. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    private void noteDuplicate(int pos1, int pos2) {

    /** We have just overwritten the name at pos1 with the name at pos2.
     *  This means that there are two copies of the name, which we will have to fix later.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
final class LambdaFormBuffer {

/** Working storage for an LF that is being transformed.
 *  Similarly to a StringBuffer, the editing can take place in multiple steps.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer insertParameter(int pos, Name param) {

    /** Insert a fresh parameter. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer insertExpression(int pos, Name expr) {

    /** Insert a fresh expression. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceParameterByCopy(int pos, int valuePos) {

    /** Replace a parameter by another parameter or expression already in the form. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceParameterByNewExpression(int pos, Name binding) {

    /** Replace a parameter by a fresh expression. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer renameParameter(int pos, Name newParam) {

    /** Replace a parameter by a fresh parameter. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceFunctions(NamedFunction[] oldFns, NamedFunction[] newFns,
                                      Object... forArguments) {

    /** Replace any Name whose function is in oldFns with a copy
     *  whose function is in the corresponding position in newFns.
     *  Only do this if the arguments are exactly equal to the given.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaForm endEdit() {

    /** Finish a transaction. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    void setResult(Name name) {

    /** Change the result name.  Null means a void result. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    void startEdit() {

    /** Create a private, writable copy of names.
     *  Preserve the original copy, for reference.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    private void clearDuplicatesAndNulls() {

    /** Replace duplicate names by nulls, and remove all nulls. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    private void noteDuplicate(int pos1, int pos2) {

    /** We have just overwritten the name at pos1 with the name at pos2.
     *  This means that there are two copies of the name, which we will have to fix later.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
final class LambdaFormBuffer {

/** Working storage for an LF that is being transformed.
 *  Similarly to a StringBuffer, the editing can take place in multiple steps.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer insertParameter(int pos, Name param) {

    /** Insert a fresh parameter. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer insertExpression(int pos, Name expr) {

    /** Insert a fresh expression. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceParameterByCopy(int pos, int valuePos) {

    /** Replace a parameter by another parameter or expression already in the form. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceParameterByNewExpression(int pos, Name binding) {

    /** Replace a parameter by a fresh expression. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer renameParameter(int pos, Name newParam) {

    /** Replace a parameter by a fresh parameter. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceFunctions(NamedFunction[] oldFns, NamedFunction[] newFns,
                                      Object... forArguments) {

    /** Replace any Name whose function is in oldFns with a copy
     *  whose function is in the corresponding position in newFns.
     *  Only do this if the arguments are exactly equal to the given.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaForm endEdit() {

    /** Finish a transaction. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    void setResult(Name name) {

    /** Change the result name.  Null means a void result. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    void startEdit() {

    /** Create a private, writable copy of names.
     *  Preserve the original copy, for reference.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    private void clearDuplicatesAndNulls() {

    /** Replace duplicate names by nulls, and remove all nulls. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    private void noteDuplicate(int pos1, int pos2) {

    /** We have just overwritten the name at pos1 with the name at pos2.
     *  This means that there are two copies of the name, which we will have to fix later.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
final class LambdaFormBuffer {

/** Working storage for an LF that is being transformed.
 *  Similarly to a StringBuffer, the editing can take place in multiple steps.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer insertParameter(int pos, Name param) {

    /** Insert a fresh parameter. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer insertExpression(int pos, Name expr) {

    /** Insert a fresh expression. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceParameterByCopy(int pos, int valuePos) {

    /** Replace a parameter by another parameter or expression already in the form. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceParameterByNewExpression(int pos, Name binding) {

    /** Replace a parameter by a fresh expression. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer renameParameter(int pos, Name newParam) {

    /** Replace a parameter by a fresh parameter. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaFormBuffer replaceFunctions(NamedFunction[] oldFns, NamedFunction[] newFns,
                                      Object... forArguments) {

    /** Replace any Name whose function is in oldFns with a copy
     *  whose function is in the corresponding position in newFns.
     *  Only do this if the arguments are exactly equal to the given.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    LambdaForm endEdit() {

    /** Finish a transaction. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    void setResult(Name name) {

    /** Change the result name.  Null means a void result. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    void startEdit() {

    /** Create a private, writable copy of names.
     *  Preserve the original copy, for reference.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    private void clearDuplicatesAndNulls() {

    /** Replace duplicate names by nulls, and remove all nulls. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
    private void noteDuplicate(int pos1, int pos2) {

    /** We have just overwritten the name at pos1 with the name at pos2.
     *  This means that there are two copies of the name, which we will have to fix later.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaFormBuffer.java
final class LambdaFormBuffer {

/** Working storage for an LF that is being transformed.
 *  Similarly to a StringBuffer, the editing can take place in multiple steps.
 */
