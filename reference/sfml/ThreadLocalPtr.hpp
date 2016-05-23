_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp

////////////////////////////////////////////////////////////
/// \class sf::ThreadLocalPtr
/// \ingroup system
///
/// sf::ThreadLocalPtr is a type-safe wrapper for storing
/// pointers to thread-local variables. A thread-local
/// variable holds a different value for each different
/// thread, unlike normal variable that are shared.
///
/// Its usage is completely transparent, so that it is similar
/// to manipulating the raw pointer directly (like any smart pointer).
///
/// Usage example:
/// \code
/// MyClass object1;
/// MyClass object2;
/// sf::ThreadLocalPtr<MyClass> objectPtr;
///
/// void thread1()
/// {
///     objectPtr = &object1; // doesn't impact thread2
///     ...
/// }
///
/// void thread2()
/// {
///     objectPtr = &object2; // doesn't impact thread1
///     ...
/// }
///
/// int main()
/// {
///     // Create and launch the two threads
///     sf::Thread t1(&thread1);
///     sf::Thread t2(&thread2);
///     t1.launch();
///     t2.launch();
///
///     return 0;
/// }
/// \endcode
///
/// ThreadLocalPtr is designed for internal use; however you
/// can use it if you feel like it fits well your implementation.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(const ThreadLocalPtr<T>& right);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a ThreadLocalPtr parameter
    ///
    /// \param right ThreadLocalPtr to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(T* value);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a raw pointer parameter
    ///
    /// \param value Pointer to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    operator T*() const;

    ////////////////////////////////////////////////////////////
    /// \brief Cast operator to implicitely convert the
    ///        pointer to its raw pointer type (T*)
    ///
    /// \return Pointer to the actual object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T* operator ->() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of operator ->
    ///
    /// Like raw pointers, applying the -> operator returns the
    /// pointed object.
    ///
    /// \return Pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T& operator *() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of unary operator *
    ///
    /// Like raw pointers, applying the * operator returns a
    /// reference to the pointed object.
    ///
    /// \return Reference to the pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr(T* value = NULL);

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// \param value Optional value to initalize the variable
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \brief Pointer to a thread-local variable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#include <SFML/System/ThreadLocal.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#ifndef SFML_THREADLOCALPTR_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp

////////////////////////////////////////////////////////////
/// \class sf::ThreadLocalPtr
/// \ingroup system
///
/// sf::ThreadLocalPtr is a type-safe wrapper for storing
/// pointers to thread-local variables. A thread-local
/// variable holds a different value for each different
/// thread, unlike normal variable that are shared.
///
/// Its usage is completely transparent, so that it is similar
/// to manipulating the raw pointer directly (like any smart pointer).
///
/// Usage example:
/// \code
/// MyClass object1;
/// MyClass object2;
/// sf::ThreadLocalPtr<MyClass> objectPtr;
///
/// void thread1()
/// {
///     objectPtr = &object1; // doesn't impact thread2
///     ...
/// }
///
/// void thread2()
/// {
///     objectPtr = &object2; // doesn't impact thread1
///     ...
/// }
///
/// int main()
/// {
///     // Create and launch the two threads
///     sf::Thread t1(&thread1);
///     sf::Thread t2(&thread2);
///     t1.launch();
///     t2.launch();
///
///     return 0;
/// }
/// \endcode
///
/// ThreadLocalPtr is designed for internal use; however you
/// can use it if you feel like it fits well your implementation.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(const ThreadLocalPtr<T>& right);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a ThreadLocalPtr parameter
    ///
    /// \param right ThreadLocalPtr to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(T* value);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a raw pointer parameter
    ///
    /// \param value Pointer to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    operator T*() const;

    ////////////////////////////////////////////////////////////
    /// \brief Cast operator to implicitely convert the
    ///        pointer to its raw pointer type (T*)
    ///
    /// \return Pointer to the actual object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T* operator ->() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of operator ->
    ///
    /// Like raw pointers, applying the -> operator returns the
    /// pointed object.
    ///
    /// \return Pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T& operator *() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of unary operator *
    ///
    /// Like raw pointers, applying the * operator returns a
    /// reference to the pointed object.
    ///
    /// \return Reference to the pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr(T* value = NULL);

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// \param value Optional value to initalize the variable
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \brief Pointer to a thread-local variable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#include <SFML/System/ThreadLocal.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#ifndef SFML_THREADLOCALPTR_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp

////////////////////////////////////////////////////////////
/// \class sf::ThreadLocalPtr
/// \ingroup system
///
/// sf::ThreadLocalPtr is a type-safe wrapper for storing
/// pointers to thread-local variables. A thread-local
/// variable holds a different value for each different
/// thread, unlike normal variable that are shared.
///
/// Its usage is completely transparent, so that it is similar
/// to manipulating the raw pointer directly (like any smart pointer).
///
/// Usage example:
/// \code
/// MyClass object1;
/// MyClass object2;
/// sf::ThreadLocalPtr<MyClass> objectPtr;
///
/// void thread1()
/// {
///     objectPtr = &object1; // doesn't impact thread2
///     ...
/// }
///
/// void thread2()
/// {
///     objectPtr = &object2; // doesn't impact thread1
///     ...
/// }
///
/// int main()
/// {
///     // Create and launch the two threads
///     sf::Thread t1(&thread1);
///     sf::Thread t2(&thread2);
///     t1.launch();
///     t2.launch();
///
///     return 0;
/// }
/// \endcode
///
/// ThreadLocalPtr is designed for internal use; however you
/// can use it if you feel like it fits well your implementation.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(const ThreadLocalPtr<T>& right);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a ThreadLocalPtr parameter
    ///
    /// \param right ThreadLocalPtr to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(T* value);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a raw pointer parameter
    ///
    /// \param value Pointer to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    operator T*() const;

    ////////////////////////////////////////////////////////////
    /// \brief Cast operator to implicitely convert the
    ///        pointer to its raw pointer type (T*)
    ///
    /// \return Pointer to the actual object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T* operator ->() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of operator ->
    ///
    /// Like raw pointers, applying the -> operator returns the
    /// pointed object.
    ///
    /// \return Pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T& operator *() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of unary operator *
    ///
    /// Like raw pointers, applying the * operator returns a
    /// reference to the pointed object.
    ///
    /// \return Reference to the pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr(T* value = NULL);

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// \param value Optional value to initalize the variable
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \brief Pointer to a thread-local variable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#include <SFML/System/ThreadLocal.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#ifndef SFML_THREADLOCALPTR_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp

////////////////////////////////////////////////////////////
/// \class sf::ThreadLocalPtr
/// \ingroup system
///
/// sf::ThreadLocalPtr is a type-safe wrapper for storing
/// pointers to thread-local variables. A thread-local
/// variable holds a different value for each different
/// thread, unlike normal variable that are shared.
///
/// Its usage is completely transparent, so that it is similar
/// to manipulating the raw pointer directly (like any smart pointer).
///
/// Usage example:
/// \code
/// MyClass object1;
/// MyClass object2;
/// sf::ThreadLocalPtr<MyClass> objectPtr;
///
/// void thread1()
/// {
///     objectPtr = &object1; // doesn't impact thread2
///     ...
/// }
///
/// void thread2()
/// {
///     objectPtr = &object2; // doesn't impact thread1
///     ...
/// }
///
/// int main()
/// {
///     // Create and launch the two threads
///     sf::Thread t1(&thread1);
///     sf::Thread t2(&thread2);
///     t1.launch();
///     t2.launch();
///
///     return 0;
/// }
/// \endcode
///
/// ThreadLocalPtr is designed for internal use; however you
/// can use it if you feel like it fits well your implementation.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(const ThreadLocalPtr<T>& right);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a ThreadLocalPtr parameter
    ///
    /// \param right ThreadLocalPtr to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(T* value);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a raw pointer parameter
    ///
    /// \param value Pointer to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    operator T*() const;

    ////////////////////////////////////////////////////////////
    /// \brief Cast operator to implicitely convert the
    ///        pointer to its raw pointer type (T*)
    ///
    /// \return Pointer to the actual object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T* operator ->() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of operator ->
    ///
    /// Like raw pointers, applying the -> operator returns the
    /// pointed object.
    ///
    /// \return Pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T& operator *() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of unary operator *
    ///
    /// Like raw pointers, applying the * operator returns a
    /// reference to the pointed object.
    ///
    /// \return Reference to the pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr(T* value = NULL);

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// \param value Optional value to initalize the variable
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \brief Pointer to a thread-local variable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#include <SFML/System/ThreadLocal.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#ifndef SFML_THREADLOCALPTR_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp

////////////////////////////////////////////////////////////
/// \class sf::ThreadLocalPtr
/// \ingroup system
///
/// sf::ThreadLocalPtr is a type-safe wrapper for storing
/// pointers to thread-local variables. A thread-local
/// variable holds a different value for each different
/// thread, unlike normal variable that are shared.
///
/// Its usage is completely transparent, so that it is similar
/// to manipulating the raw pointer directly (like any smart pointer).
///
/// Usage example:
/// \code
/// MyClass object1;
/// MyClass object2;
/// sf::ThreadLocalPtr<MyClass> objectPtr;
///
/// void thread1()
/// {
///     objectPtr = &object1; // doesn't impact thread2
///     ...
/// }
///
/// void thread2()
/// {
///     objectPtr = &object2; // doesn't impact thread1
///     ...
/// }
///
/// int main()
/// {
///     // Create and launch the two threads
///     sf::Thread t1(&thread1);
///     sf::Thread t2(&thread2);
///     t1.launch();
///     t2.launch();
///
///     return 0;
/// }
/// \endcode
///
/// ThreadLocalPtr is designed for internal use; however you
/// can use it if you feel like it fits well your implementation.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(const ThreadLocalPtr<T>& right);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a ThreadLocalPtr parameter
    ///
    /// \param right ThreadLocalPtr to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(T* value);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a raw pointer parameter
    ///
    /// \param value Pointer to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    operator T*() const;

    ////////////////////////////////////////////////////////////
    /// \brief Cast operator to implicitely convert the
    ///        pointer to its raw pointer type (T*)
    ///
    /// \return Pointer to the actual object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T* operator ->() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of operator ->
    ///
    /// Like raw pointers, applying the -> operator returns the
    /// pointed object.
    ///
    /// \return Pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T& operator *() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of unary operator *
    ///
    /// Like raw pointers, applying the * operator returns a
    /// reference to the pointed object.
    ///
    /// \return Reference to the pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr(T* value = NULL);

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// \param value Optional value to initalize the variable
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \brief Pointer to a thread-local variable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#include <SFML/System/ThreadLocal.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#ifndef SFML_THREADLOCALPTR_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp

////////////////////////////////////////////////////////////
/// \class sf::ThreadLocalPtr
/// \ingroup system
///
/// sf::ThreadLocalPtr is a type-safe wrapper for storing
/// pointers to thread-local variables. A thread-local
/// variable holds a different value for each different
/// thread, unlike normal variable that are shared.
///
/// Its usage is completely transparent, so that it is similar
/// to manipulating the raw pointer directly (like any smart pointer).
///
/// Usage example:
/// \code
/// MyClass object1;
/// MyClass object2;
/// sf::ThreadLocalPtr<MyClass> objectPtr;
///
/// void thread1()
/// {
///     objectPtr = &object1; // doesn't impact thread2
///     ...
/// }
///
/// void thread2()
/// {
///     objectPtr = &object2; // doesn't impact thread1
///     ...
/// }
///
/// int main()
/// {
///     // Create and launch the two threads
///     sf::Thread t1(&thread1);
///     sf::Thread t2(&thread2);
///     t1.launch();
///     t2.launch();
///
///     return 0;
/// }
/// \endcode
///
/// ThreadLocalPtr is designed for internal use; however you
/// can use it if you feel like it fits well your implementation.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(const ThreadLocalPtr<T>& right);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a ThreadLocalPtr parameter
    ///
    /// \param right ThreadLocalPtr to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(T* value);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a raw pointer parameter
    ///
    /// \param value Pointer to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    operator T*() const;

    ////////////////////////////////////////////////////////////
    /// \brief Cast operator to implicitely convert the
    ///        pointer to its raw pointer type (T*)
    ///
    /// \return Pointer to the actual object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T* operator ->() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of operator ->
    ///
    /// Like raw pointers, applying the -> operator returns the
    /// pointed object.
    ///
    /// \return Pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T& operator *() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of unary operator *
    ///
    /// Like raw pointers, applying the * operator returns a
    /// reference to the pointed object.
    ///
    /// \return Reference to the pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr(T* value = NULL);

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// \param value Optional value to initalize the variable
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \brief Pointer to a thread-local variable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#include <SFML/System/ThreadLocal.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#ifndef SFML_THREADLOCALPTR_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp

////////////////////////////////////////////////////////////
/// \class sf::ThreadLocalPtr
/// \ingroup system
///
/// sf::ThreadLocalPtr is a type-safe wrapper for storing
/// pointers to thread-local variables. A thread-local
/// variable holds a different value for each different
/// thread, unlike normal variable that are shared.
///
/// Its usage is completely transparent, so that it is similar
/// to manipulating the raw pointer directly (like any smart pointer).
///
/// Usage example:
/// \code
/// MyClass object1;
/// MyClass object2;
/// sf::ThreadLocalPtr<MyClass> objectPtr;
///
/// void thread1()
/// {
///     objectPtr = &object1; // doesn't impact thread2
///     ...
/// }
///
/// void thread2()
/// {
///     objectPtr = &object2; // doesn't impact thread1
///     ...
/// }
///
/// int main()
/// {
///     // Create and launch the two threads
///     sf::Thread t1(&thread1);
///     sf::Thread t2(&thread2);
///     t1.launch();
///     t2.launch();
///
///     return 0;
/// }
/// \endcode
///
/// ThreadLocalPtr is designed for internal use; however you
/// can use it if you feel like it fits well your implementation.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(const ThreadLocalPtr<T>& right);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a ThreadLocalPtr parameter
    ///
    /// \param right ThreadLocalPtr to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(T* value);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a raw pointer parameter
    ///
    /// \param value Pointer to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    operator T*() const;

    ////////////////////////////////////////////////////////////
    /// \brief Cast operator to implicitely convert the
    ///        pointer to its raw pointer type (T*)
    ///
    /// \return Pointer to the actual object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T* operator ->() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of operator ->
    ///
    /// Like raw pointers, applying the -> operator returns the
    /// pointed object.
    ///
    /// \return Pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T& operator *() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of unary operator *
    ///
    /// Like raw pointers, applying the * operator returns a
    /// reference to the pointed object.
    ///
    /// \return Reference to the pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr(T* value = NULL);

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// \param value Optional value to initalize the variable
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \brief Pointer to a thread-local variable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#include <SFML/System/ThreadLocal.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#ifndef SFML_THREADLOCALPTR_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp

////////////////////////////////////////////////////////////
/// \class sf::ThreadLocalPtr
/// \ingroup system
///
/// sf::ThreadLocalPtr is a type-safe wrapper for storing
/// pointers to thread-local variables. A thread-local
/// variable holds a different value for each different
/// thread, unlike normal variable that are shared.
///
/// Its usage is completely transparent, so that it is similar
/// to manipulating the raw pointer directly (like any smart pointer).
///
/// Usage example:
/// \code
/// MyClass object1;
/// MyClass object2;
/// sf::ThreadLocalPtr<MyClass> objectPtr;
///
/// void thread1()
/// {
///     objectPtr = &object1; // doesn't impact thread2
///     ...
/// }
///
/// void thread2()
/// {
///     objectPtr = &object2; // doesn't impact thread1
///     ...
/// }
///
/// int main()
/// {
///     // Create and launch the two threads
///     sf::Thread t1(&thread1);
///     sf::Thread t2(&thread2);
///     t1.launch();
///     t2.launch();
///
///     return 0;
/// }
/// \endcode
///
/// ThreadLocalPtr is designed for internal use; however you
/// can use it if you feel like it fits well your implementation.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(const ThreadLocalPtr<T>& right);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a ThreadLocalPtr parameter
    ///
    /// \param right ThreadLocalPtr to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(T* value);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a raw pointer parameter
    ///
    /// \param value Pointer to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    operator T*() const;

    ////////////////////////////////////////////////////////////
    /// \brief Cast operator to implicitely convert the
    ///        pointer to its raw pointer type (T*)
    ///
    /// \return Pointer to the actual object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T* operator ->() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of operator ->
    ///
    /// Like raw pointers, applying the -> operator returns the
    /// pointed object.
    ///
    /// \return Pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T& operator *() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of unary operator *
    ///
    /// Like raw pointers, applying the * operator returns a
    /// reference to the pointed object.
    ///
    /// \return Reference to the pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr(T* value = NULL);

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// \param value Optional value to initalize the variable
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \brief Pointer to a thread-local variable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#include <SFML/System/ThreadLocal.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#ifndef SFML_THREADLOCALPTR_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp

////////////////////////////////////////////////////////////
/// \class sf::ThreadLocalPtr
/// \ingroup system
///
/// sf::ThreadLocalPtr is a type-safe wrapper for storing
/// pointers to thread-local variables. A thread-local
/// variable holds a different value for each different
/// thread, unlike normal variable that are shared.
///
/// Its usage is completely transparent, so that it is similar
/// to manipulating the raw pointer directly (like any smart pointer).
///
/// Usage example:
/// \code
/// MyClass object1;
/// MyClass object2;
/// sf::ThreadLocalPtr<MyClass> objectPtr;
///
/// void thread1()
/// {
///     objectPtr = &object1; // doesn't impact thread2
///     ...
/// }
///
/// void thread2()
/// {
///     objectPtr = &object2; // doesn't impact thread1
///     ...
/// }
///
/// int main()
/// {
///     // Create and launch the two threads
///     sf::Thread t1(&thread1);
///     sf::Thread t2(&thread2);
///     t1.launch();
///     t2.launch();
///
///     return 0;
/// }
/// \endcode
///
/// ThreadLocalPtr is designed for internal use; however you
/// can use it if you feel like it fits well your implementation.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(const ThreadLocalPtr<T>& right);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a ThreadLocalPtr parameter
    ///
    /// \param right ThreadLocalPtr to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr<T>& operator =(T* value);

    ////////////////////////////////////////////////////////////
    /// \brief Assignment operator for a raw pointer parameter
    ///
    /// \param value Pointer to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    operator T*() const;

    ////////////////////////////////////////////////////////////
    /// \brief Cast operator to implicitely convert the
    ///        pointer to its raw pointer type (T*)
    ///
    /// \return Pointer to the actual object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T* operator ->() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of operator ->
    ///
    /// Like raw pointers, applying the -> operator returns the
    /// pointed object.
    ///
    /// \return Pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    T& operator *() const;

    ////////////////////////////////////////////////////////////
    /// \brief Overload of unary operator *
    ///
    /// Like raw pointers, applying the * operator returns a
    /// reference to the pointed object.
    ///
    /// \return Reference to the pointed object
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
    ThreadLocalPtr(T* value = NULL);

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// \param value Optional value to initalize the variable
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
template <typename T>

////////////////////////////////////////////////////////////
/// \brief Pointer to a thread-local variable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#include <SFML/System/ThreadLocal.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
#ifndef SFML_THREADLOCALPTR_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/ThreadLocalPtr.hpp
//

////////////////////////////////////////////////////////////
