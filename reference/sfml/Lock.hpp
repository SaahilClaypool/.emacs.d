_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp

////////////////////////////////////////////////////////////
/// \class sf::Lock
/// \ingroup system
///
/// sf::Lock is a RAII wrapper for sf::Mutex. By unlocking
/// it in its destructor, it ensures that the mutex will
/// always be released when the current scope (most likely
/// a function) ends.
/// This is even more important when an exception or an early
/// return statement can interrupt the execution flow of the
/// function.
///
/// For maximum robustness, sf::Lock should always be used
/// to lock/unlock a mutex.
///
/// Usage example:
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     sf::Lock lock(mutex); // mutex is now locked
/// 
///     functionThatMayThrowAnException(); // mutex is unlocked if this function throws
/// 
///     if (someCondition)
///         return; // mutex is unlocked
/// 
/// } // mutex is unlocked
/// \endcode
///
/// Because the mutex is not explicitely unlocked in the code,
/// it may remain locked longer than needed. If the region
/// of the code that needs to be protected by the mutex is
/// not the entire function, a good practice is to create a
/// smaller, inner scope so that the lock is limited to this
/// part of the code.
///
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     {
///       sf::Lock lock(mutex);
///       codeThatRequiresProtection();
/// 
///     } // mutex is unlocked here
/// 
///     codeThatDoesntCareAboutTheMutex();
/// }
/// \endcode
///
/// Having a mutex locked longer than required is a bad practice
/// which can lead to bad performances. Don't forget that when
/// a mutex is locked, other threads may be waiting doing nothing
/// until it is released.
///
/// \see sf::Mutex
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
};

    ////////////////////////////////////////////////////////////
    Mutex& m_mutex; ///< Mutex to lock / unlock
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    ~Lock();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The destructor of sf::Lock automatically unlocks its mutex.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    explicit Lock(Mutex& mutex);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the lock with a target mutex
    ///
    /// The mutex passed to sf::Lock is automatically locked.
    ///
    /// \param mutex Mutex to lock
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
class SFML_SYSTEM_API Lock : NonCopyable

////////////////////////////////////////////////////////////
/// \brief Automatic wrapper for locking and unlocking mutexes
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#ifndef SFML_LOCK_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp

////////////////////////////////////////////////////////////
/// \class sf::Lock
/// \ingroup system
///
/// sf::Lock is a RAII wrapper for sf::Mutex. By unlocking
/// it in its destructor, it ensures that the mutex will
/// always be released when the current scope (most likely
/// a function) ends.
/// This is even more important when an exception or an early
/// return statement can interrupt the execution flow of the
/// function.
///
/// For maximum robustness, sf::Lock should always be used
/// to lock/unlock a mutex.
///
/// Usage example:
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     sf::Lock lock(mutex); // mutex is now locked
/// 
///     functionThatMayThrowAnException(); // mutex is unlocked if this function throws
/// 
///     if (someCondition)
///         return; // mutex is unlocked
/// 
/// } // mutex is unlocked
/// \endcode
///
/// Because the mutex is not explicitely unlocked in the code,
/// it may remain locked longer than needed. If the region
/// of the code that needs to be protected by the mutex is
/// not the entire function, a good practice is to create a
/// smaller, inner scope so that the lock is limited to this
/// part of the code.
///
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     {
///       sf::Lock lock(mutex);
///       codeThatRequiresProtection();
/// 
///     } // mutex is unlocked here
/// 
///     codeThatDoesntCareAboutTheMutex();
/// }
/// \endcode
///
/// Having a mutex locked longer than required is a bad practice
/// which can lead to bad performances. Don't forget that when
/// a mutex is locked, other threads may be waiting doing nothing
/// until it is released.
///
/// \see sf::Mutex
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
};

    ////////////////////////////////////////////////////////////
    Mutex& m_mutex; ///< Mutex to lock / unlock
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    ~Lock();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The destructor of sf::Lock automatically unlocks its mutex.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    explicit Lock(Mutex& mutex);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the lock with a target mutex
    ///
    /// The mutex passed to sf::Lock is automatically locked.
    ///
    /// \param mutex Mutex to lock
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
class SFML_SYSTEM_API Lock : NonCopyable

////////////////////////////////////////////////////////////
/// \brief Automatic wrapper for locking and unlocking mutexes
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#ifndef SFML_LOCK_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp

////////////////////////////////////////////////////////////
/// \class sf::Lock
/// \ingroup system
///
/// sf::Lock is a RAII wrapper for sf::Mutex. By unlocking
/// it in its destructor, it ensures that the mutex will
/// always be released when the current scope (most likely
/// a function) ends.
/// This is even more important when an exception or an early
/// return statement can interrupt the execution flow of the
/// function.
///
/// For maximum robustness, sf::Lock should always be used
/// to lock/unlock a mutex.
///
/// Usage example:
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     sf::Lock lock(mutex); // mutex is now locked
/// 
///     functionThatMayThrowAnException(); // mutex is unlocked if this function throws
/// 
///     if (someCondition)
///         return; // mutex is unlocked
/// 
/// } // mutex is unlocked
/// \endcode
///
/// Because the mutex is not explicitely unlocked in the code,
/// it may remain locked longer than needed. If the region
/// of the code that needs to be protected by the mutex is
/// not the entire function, a good practice is to create a
/// smaller, inner scope so that the lock is limited to this
/// part of the code.
///
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     {
///       sf::Lock lock(mutex);
///       codeThatRequiresProtection();
/// 
///     } // mutex is unlocked here
/// 
///     codeThatDoesntCareAboutTheMutex();
/// }
/// \endcode
///
/// Having a mutex locked longer than required is a bad practice
/// which can lead to bad performances. Don't forget that when
/// a mutex is locked, other threads may be waiting doing nothing
/// until it is released.
///
/// \see sf::Mutex
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
};

    ////////////////////////////////////////////////////////////
    Mutex& m_mutex; ///< Mutex to lock / unlock
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    ~Lock();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The destructor of sf::Lock automatically unlocks its mutex.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    explicit Lock(Mutex& mutex);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the lock with a target mutex
    ///
    /// The mutex passed to sf::Lock is automatically locked.
    ///
    /// \param mutex Mutex to lock
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
class SFML_SYSTEM_API Lock : NonCopyable

////////////////////////////////////////////////////////////
/// \brief Automatic wrapper for locking and unlocking mutexes
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#ifndef SFML_LOCK_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp

////////////////////////////////////////////////////////////
/// \class sf::Lock
/// \ingroup system
///
/// sf::Lock is a RAII wrapper for sf::Mutex. By unlocking
/// it in its destructor, it ensures that the mutex will
/// always be released when the current scope (most likely
/// a function) ends.
/// This is even more important when an exception or an early
/// return statement can interrupt the execution flow of the
/// function.
///
/// For maximum robustness, sf::Lock should always be used
/// to lock/unlock a mutex.
///
/// Usage example:
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     sf::Lock lock(mutex); // mutex is now locked
/// 
///     functionThatMayThrowAnException(); // mutex is unlocked if this function throws
/// 
///     if (someCondition)
///         return; // mutex is unlocked
/// 
/// } // mutex is unlocked
/// \endcode
///
/// Because the mutex is not explicitely unlocked in the code,
/// it may remain locked longer than needed. If the region
/// of the code that needs to be protected by the mutex is
/// not the entire function, a good practice is to create a
/// smaller, inner scope so that the lock is limited to this
/// part of the code.
///
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     {
///       sf::Lock lock(mutex);
///       codeThatRequiresProtection();
/// 
///     } // mutex is unlocked here
/// 
///     codeThatDoesntCareAboutTheMutex();
/// }
/// \endcode
///
/// Having a mutex locked longer than required is a bad practice
/// which can lead to bad performances. Don't forget that when
/// a mutex is locked, other threads may be waiting doing nothing
/// until it is released.
///
/// \see sf::Mutex
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
};

    ////////////////////////////////////////////////////////////
    Mutex& m_mutex; ///< Mutex to lock / unlock
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    ~Lock();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The destructor of sf::Lock automatically unlocks its mutex.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    explicit Lock(Mutex& mutex);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the lock with a target mutex
    ///
    /// The mutex passed to sf::Lock is automatically locked.
    ///
    /// \param mutex Mutex to lock
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
class SFML_SYSTEM_API Lock : NonCopyable

////////////////////////////////////////////////////////////
/// \brief Automatic wrapper for locking and unlocking mutexes
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#ifndef SFML_LOCK_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp

////////////////////////////////////////////////////////////
/// \class sf::Lock
/// \ingroup system
///
/// sf::Lock is a RAII wrapper for sf::Mutex. By unlocking
/// it in its destructor, it ensures that the mutex will
/// always be released when the current scope (most likely
/// a function) ends.
/// This is even more important when an exception or an early
/// return statement can interrupt the execution flow of the
/// function.
///
/// For maximum robustness, sf::Lock should always be used
/// to lock/unlock a mutex.
///
/// Usage example:
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     sf::Lock lock(mutex); // mutex is now locked
/// 
///     functionThatMayThrowAnException(); // mutex is unlocked if this function throws
/// 
///     if (someCondition)
///         return; // mutex is unlocked
/// 
/// } // mutex is unlocked
/// \endcode
///
/// Because the mutex is not explicitely unlocked in the code,
/// it may remain locked longer than needed. If the region
/// of the code that needs to be protected by the mutex is
/// not the entire function, a good practice is to create a
/// smaller, inner scope so that the lock is limited to this
/// part of the code.
///
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     {
///       sf::Lock lock(mutex);
///       codeThatRequiresProtection();
/// 
///     } // mutex is unlocked here
/// 
///     codeThatDoesntCareAboutTheMutex();
/// }
/// \endcode
///
/// Having a mutex locked longer than required is a bad practice
/// which can lead to bad performances. Don't forget that when
/// a mutex is locked, other threads may be waiting doing nothing
/// until it is released.
///
/// \see sf::Mutex
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
};

    ////////////////////////////////////////////////////////////
    Mutex& m_mutex; ///< Mutex to lock / unlock
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    ~Lock();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The destructor of sf::Lock automatically unlocks its mutex.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    explicit Lock(Mutex& mutex);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the lock with a target mutex
    ///
    /// The mutex passed to sf::Lock is automatically locked.
    ///
    /// \param mutex Mutex to lock
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
class SFML_SYSTEM_API Lock : NonCopyable

////////////////////////////////////////////////////////////
/// \brief Automatic wrapper for locking and unlocking mutexes
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#ifndef SFML_LOCK_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp

////////////////////////////////////////////////////////////
/// \class sf::Lock
/// \ingroup system
///
/// sf::Lock is a RAII wrapper for sf::Mutex. By unlocking
/// it in its destructor, it ensures that the mutex will
/// always be released when the current scope (most likely
/// a function) ends.
/// This is even more important when an exception or an early
/// return statement can interrupt the execution flow of the
/// function.
///
/// For maximum robustness, sf::Lock should always be used
/// to lock/unlock a mutex.
///
/// Usage example:
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     sf::Lock lock(mutex); // mutex is now locked
/// 
///     functionThatMayThrowAnException(); // mutex is unlocked if this function throws
/// 
///     if (someCondition)
///         return; // mutex is unlocked
/// 
/// } // mutex is unlocked
/// \endcode
///
/// Because the mutex is not explicitely unlocked in the code,
/// it may remain locked longer than needed. If the region
/// of the code that needs to be protected by the mutex is
/// not the entire function, a good practice is to create a
/// smaller, inner scope so that the lock is limited to this
/// part of the code.
///
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     {
///       sf::Lock lock(mutex);
///       codeThatRequiresProtection();
/// 
///     } // mutex is unlocked here
/// 
///     codeThatDoesntCareAboutTheMutex();
/// }
/// \endcode
///
/// Having a mutex locked longer than required is a bad practice
/// which can lead to bad performances. Don't forget that when
/// a mutex is locked, other threads may be waiting doing nothing
/// until it is released.
///
/// \see sf::Mutex
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
};

    ////////////////////////////////////////////////////////////
    Mutex& m_mutex; ///< Mutex to lock / unlock
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    ~Lock();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The destructor of sf::Lock automatically unlocks its mutex.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    explicit Lock(Mutex& mutex);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the lock with a target mutex
    ///
    /// The mutex passed to sf::Lock is automatically locked.
    ///
    /// \param mutex Mutex to lock
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
class SFML_SYSTEM_API Lock : NonCopyable

////////////////////////////////////////////////////////////
/// \brief Automatic wrapper for locking and unlocking mutexes
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#ifndef SFML_LOCK_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp

////////////////////////////////////////////////////////////
/// \class sf::Lock
/// \ingroup system
///
/// sf::Lock is a RAII wrapper for sf::Mutex. By unlocking
/// it in its destructor, it ensures that the mutex will
/// always be released when the current scope (most likely
/// a function) ends.
/// This is even more important when an exception or an early
/// return statement can interrupt the execution flow of the
/// function.
///
/// For maximum robustness, sf::Lock should always be used
/// to lock/unlock a mutex.
///
/// Usage example:
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     sf::Lock lock(mutex); // mutex is now locked
/// 
///     functionThatMayThrowAnException(); // mutex is unlocked if this function throws
/// 
///     if (someCondition)
///         return; // mutex is unlocked
/// 
/// } // mutex is unlocked
/// \endcode
///
/// Because the mutex is not explicitely unlocked in the code,
/// it may remain locked longer than needed. If the region
/// of the code that needs to be protected by the mutex is
/// not the entire function, a good practice is to create a
/// smaller, inner scope so that the lock is limited to this
/// part of the code.
///
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     {
///       sf::Lock lock(mutex);
///       codeThatRequiresProtection();
/// 
///     } // mutex is unlocked here
/// 
///     codeThatDoesntCareAboutTheMutex();
/// }
/// \endcode
///
/// Having a mutex locked longer than required is a bad practice
/// which can lead to bad performances. Don't forget that when
/// a mutex is locked, other threads may be waiting doing nothing
/// until it is released.
///
/// \see sf::Mutex
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
};

    ////////////////////////////////////////////////////////////
    Mutex& m_mutex; ///< Mutex to lock / unlock
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    ~Lock();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The destructor of sf::Lock automatically unlocks its mutex.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    explicit Lock(Mutex& mutex);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the lock with a target mutex
    ///
    /// The mutex passed to sf::Lock is automatically locked.
    ///
    /// \param mutex Mutex to lock
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
class SFML_SYSTEM_API Lock : NonCopyable

////////////////////////////////////////////////////////////
/// \brief Automatic wrapper for locking and unlocking mutexes
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#ifndef SFML_LOCK_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp

////////////////////////////////////////////////////////////
/// \class sf::Lock
/// \ingroup system
///
/// sf::Lock is a RAII wrapper for sf::Mutex. By unlocking
/// it in its destructor, it ensures that the mutex will
/// always be released when the current scope (most likely
/// a function) ends.
/// This is even more important when an exception or an early
/// return statement can interrupt the execution flow of the
/// function.
///
/// For maximum robustness, sf::Lock should always be used
/// to lock/unlock a mutex.
///
/// Usage example:
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     sf::Lock lock(mutex); // mutex is now locked
/// 
///     functionThatMayThrowAnException(); // mutex is unlocked if this function throws
/// 
///     if (someCondition)
///         return; // mutex is unlocked
/// 
/// } // mutex is unlocked
/// \endcode
///
/// Because the mutex is not explicitely unlocked in the code,
/// it may remain locked longer than needed. If the region
/// of the code that needs to be protected by the mutex is
/// not the entire function, a good practice is to create a
/// smaller, inner scope so that the lock is limited to this
/// part of the code.
///
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     {
///       sf::Lock lock(mutex);
///       codeThatRequiresProtection();
/// 
///     } // mutex is unlocked here
/// 
///     codeThatDoesntCareAboutTheMutex();
/// }
/// \endcode
///
/// Having a mutex locked longer than required is a bad practice
/// which can lead to bad performances. Don't forget that when
/// a mutex is locked, other threads may be waiting doing nothing
/// until it is released.
///
/// \see sf::Mutex
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
};

    ////////////////////////////////////////////////////////////
    Mutex& m_mutex; ///< Mutex to lock / unlock
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    ~Lock();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The destructor of sf::Lock automatically unlocks its mutex.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    explicit Lock(Mutex& mutex);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the lock with a target mutex
    ///
    /// The mutex passed to sf::Lock is automatically locked.
    ///
    /// \param mutex Mutex to lock
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
class SFML_SYSTEM_API Lock : NonCopyable

////////////////////////////////////////////////////////////
/// \brief Automatic wrapper for locking and unlocking mutexes
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#ifndef SFML_LOCK_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp

////////////////////////////////////////////////////////////
/// \class sf::Lock
/// \ingroup system
///
/// sf::Lock is a RAII wrapper for sf::Mutex. By unlocking
/// it in its destructor, it ensures that the mutex will
/// always be released when the current scope (most likely
/// a function) ends.
/// This is even more important when an exception or an early
/// return statement can interrupt the execution flow of the
/// function.
///
/// For maximum robustness, sf::Lock should always be used
/// to lock/unlock a mutex.
///
/// Usage example:
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     sf::Lock lock(mutex); // mutex is now locked
/// 
///     functionThatMayThrowAnException(); // mutex is unlocked if this function throws
/// 
///     if (someCondition)
///         return; // mutex is unlocked
/// 
/// } // mutex is unlocked
/// \endcode
///
/// Because the mutex is not explicitely unlocked in the code,
/// it may remain locked longer than needed. If the region
/// of the code that needs to be protected by the mutex is
/// not the entire function, a good practice is to create a
/// smaller, inner scope so that the lock is limited to this
/// part of the code.
///
/// \code
/// sf::Mutex mutex;
/// 
/// void function()
/// {
///     {
///       sf::Lock lock(mutex);
///       codeThatRequiresProtection();
/// 
///     } // mutex is unlocked here
/// 
///     codeThatDoesntCareAboutTheMutex();
/// }
/// \endcode
///
/// Having a mutex locked longer than required is a bad practice
/// which can lead to bad performances. Don't forget that when
/// a mutex is locked, other threads may be waiting doing nothing
/// until it is released.
///
/// \see sf::Mutex
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
};

    ////////////////////////////////////////////////////////////
    Mutex& m_mutex; ///< Mutex to lock / unlock
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    ~Lock();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The destructor of sf::Lock automatically unlocks its mutex.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
    explicit Lock(Mutex& mutex);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the lock with a target mutex
    ///
    /// The mutex passed to sf::Lock is automatically locked.
    ///
    /// \param mutex Mutex to lock
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
class SFML_SYSTEM_API Lock : NonCopyable

////////////////////////////////////////////////////////////
/// \brief Automatic wrapper for locking and unlocking mutexes
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
#ifndef SFML_LOCK_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/Lock.hpp
//

////////////////////////////////////////////////////////////
