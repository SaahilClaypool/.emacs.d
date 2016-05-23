_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp

////////////////////////////////////////////////////////////
/// \class sf::NonCopyable
/// \ingroup system
///
/// This class makes its instances non-copyable, by explicitely
/// disabling its copy constructor and its assignment operator.
///
/// To create a non-copyable class, simply inherit from
/// sf::NonCopyable.
///
/// The type of inheritance (public or private) doesn't matter,
/// the copy constructor and assignment operator are declared private
/// in sf::NonCopyable so they will end up being inaccessible in both
/// cases. Thus you can use a shorter syntax for inheriting from it
/// (see below).
///
/// Usage example:
/// \code
/// class MyNonCopyableClass : sf::NonCopyable
/// {
///     ...
/// };
/// \endcode
///
/// Deciding whether the instances of a class can be copied
/// or not is a very important design choice. You are strongly
/// encouraged to think about it before writing a class,
/// and to use sf::NonCopyable when necessary to prevent
/// many potential future errors when using it. This is also
/// a very important indication to users of your class.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable& operator =(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled assignment operator
    ///
    /// By making the assignment operator private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled copy constructor
    ///
    /// By making the copy constructor private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable() {}

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Because this class has a copy constructor, the compiler
    /// will not automatically generate the default constructor.
    /// That's why we must define it explicitely.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
class SFML_SYSTEM_API NonCopyable

////////////////////////////////////////////////////////////
/// \brief Utility class that makes any derived
///        class non-copyable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#ifndef SFML_NONCOPYABLE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp

////////////////////////////////////////////////////////////
/// \class sf::NonCopyable
/// \ingroup system
///
/// This class makes its instances non-copyable, by explicitely
/// disabling its copy constructor and its assignment operator.
///
/// To create a non-copyable class, simply inherit from
/// sf::NonCopyable.
///
/// The type of inheritance (public or private) doesn't matter,
/// the copy constructor and assignment operator are declared private
/// in sf::NonCopyable so they will end up being inaccessible in both
/// cases. Thus you can use a shorter syntax for inheriting from it
/// (see below).
///
/// Usage example:
/// \code
/// class MyNonCopyableClass : sf::NonCopyable
/// {
///     ...
/// };
/// \endcode
///
/// Deciding whether the instances of a class can be copied
/// or not is a very important design choice. You are strongly
/// encouraged to think about it before writing a class,
/// and to use sf::NonCopyable when necessary to prevent
/// many potential future errors when using it. This is also
/// a very important indication to users of your class.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable& operator =(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled assignment operator
    ///
    /// By making the assignment operator private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled copy constructor
    ///
    /// By making the copy constructor private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable() {}

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Because this class has a copy constructor, the compiler
    /// will not automatically generate the default constructor.
    /// That's why we must define it explicitely.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
class SFML_SYSTEM_API NonCopyable

////////////////////////////////////////////////////////////
/// \brief Utility class that makes any derived
///        class non-copyable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#ifndef SFML_NONCOPYABLE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp

////////////////////////////////////////////////////////////
/// \class sf::NonCopyable
/// \ingroup system
///
/// This class makes its instances non-copyable, by explicitely
/// disabling its copy constructor and its assignment operator.
///
/// To create a non-copyable class, simply inherit from
/// sf::NonCopyable.
///
/// The type of inheritance (public or private) doesn't matter,
/// the copy constructor and assignment operator are declared private
/// in sf::NonCopyable so they will end up being inaccessible in both
/// cases. Thus you can use a shorter syntax for inheriting from it
/// (see below).
///
/// Usage example:
/// \code
/// class MyNonCopyableClass : sf::NonCopyable
/// {
///     ...
/// };
/// \endcode
///
/// Deciding whether the instances of a class can be copied
/// or not is a very important design choice. You are strongly
/// encouraged to think about it before writing a class,
/// and to use sf::NonCopyable when necessary to prevent
/// many potential future errors when using it. This is also
/// a very important indication to users of your class.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable& operator =(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled assignment operator
    ///
    /// By making the assignment operator private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled copy constructor
    ///
    /// By making the copy constructor private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable() {}

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Because this class has a copy constructor, the compiler
    /// will not automatically generate the default constructor.
    /// That's why we must define it explicitely.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
class SFML_SYSTEM_API NonCopyable

////////////////////////////////////////////////////////////
/// \brief Utility class that makes any derived
///        class non-copyable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#ifndef SFML_NONCOPYABLE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp

////////////////////////////////////////////////////////////
/// \class sf::NonCopyable
/// \ingroup system
///
/// This class makes its instances non-copyable, by explicitely
/// disabling its copy constructor and its assignment operator.
///
/// To create a non-copyable class, simply inherit from
/// sf::NonCopyable.
///
/// The type of inheritance (public or private) doesn't matter,
/// the copy constructor and assignment operator are declared private
/// in sf::NonCopyable so they will end up being inaccessible in both
/// cases. Thus you can use a shorter syntax for inheriting from it
/// (see below).
///
/// Usage example:
/// \code
/// class MyNonCopyableClass : sf::NonCopyable
/// {
///     ...
/// };
/// \endcode
///
/// Deciding whether the instances of a class can be copied
/// or not is a very important design choice. You are strongly
/// encouraged to think about it before writing a class,
/// and to use sf::NonCopyable when necessary to prevent
/// many potential future errors when using it. This is also
/// a very important indication to users of your class.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable& operator =(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled assignment operator
    ///
    /// By making the assignment operator private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled copy constructor
    ///
    /// By making the copy constructor private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable() {}

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Because this class has a copy constructor, the compiler
    /// will not automatically generate the default constructor.
    /// That's why we must define it explicitely.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
class SFML_SYSTEM_API NonCopyable

////////////////////////////////////////////////////////////
/// \brief Utility class that makes any derived
///        class non-copyable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#ifndef SFML_NONCOPYABLE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp

////////////////////////////////////////////////////////////
/// \class sf::NonCopyable
/// \ingroup system
///
/// This class makes its instances non-copyable, by explicitely
/// disabling its copy constructor and its assignment operator.
///
/// To create a non-copyable class, simply inherit from
/// sf::NonCopyable.
///
/// The type of inheritance (public or private) doesn't matter,
/// the copy constructor and assignment operator are declared private
/// in sf::NonCopyable so they will end up being inaccessible in both
/// cases. Thus you can use a shorter syntax for inheriting from it
/// (see below).
///
/// Usage example:
/// \code
/// class MyNonCopyableClass : sf::NonCopyable
/// {
///     ...
/// };
/// \endcode
///
/// Deciding whether the instances of a class can be copied
/// or not is a very important design choice. You are strongly
/// encouraged to think about it before writing a class,
/// and to use sf::NonCopyable when necessary to prevent
/// many potential future errors when using it. This is also
/// a very important indication to users of your class.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable& operator =(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled assignment operator
    ///
    /// By making the assignment operator private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled copy constructor
    ///
    /// By making the copy constructor private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable() {}

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Because this class has a copy constructor, the compiler
    /// will not automatically generate the default constructor.
    /// That's why we must define it explicitely.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
class SFML_SYSTEM_API NonCopyable

////////////////////////////////////////////////////////////
/// \brief Utility class that makes any derived
///        class non-copyable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#ifndef SFML_NONCOPYABLE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp

////////////////////////////////////////////////////////////
/// \class sf::NonCopyable
/// \ingroup system
///
/// This class makes its instances non-copyable, by explicitely
/// disabling its copy constructor and its assignment operator.
///
/// To create a non-copyable class, simply inherit from
/// sf::NonCopyable.
///
/// The type of inheritance (public or private) doesn't matter,
/// the copy constructor and assignment operator are declared private
/// in sf::NonCopyable so they will end up being inaccessible in both
/// cases. Thus you can use a shorter syntax for inheriting from it
/// (see below).
///
/// Usage example:
/// \code
/// class MyNonCopyableClass : sf::NonCopyable
/// {
///     ...
/// };
/// \endcode
///
/// Deciding whether the instances of a class can be copied
/// or not is a very important design choice. You are strongly
/// encouraged to think about it before writing a class,
/// and to use sf::NonCopyable when necessary to prevent
/// many potential future errors when using it. This is also
/// a very important indication to users of your class.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable& operator =(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled assignment operator
    ///
    /// By making the assignment operator private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled copy constructor
    ///
    /// By making the copy constructor private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable() {}

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Because this class has a copy constructor, the compiler
    /// will not automatically generate the default constructor.
    /// That's why we must define it explicitely.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
class SFML_SYSTEM_API NonCopyable

////////////////////////////////////////////////////////////
/// \brief Utility class that makes any derived
///        class non-copyable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#ifndef SFML_NONCOPYABLE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp

////////////////////////////////////////////////////////////
/// \class sf::NonCopyable
/// \ingroup system
///
/// This class makes its instances non-copyable, by explicitely
/// disabling its copy constructor and its assignment operator.
///
/// To create a non-copyable class, simply inherit from
/// sf::NonCopyable.
///
/// The type of inheritance (public or private) doesn't matter,
/// the copy constructor and assignment operator are declared private
/// in sf::NonCopyable so they will end up being inaccessible in both
/// cases. Thus you can use a shorter syntax for inheriting from it
/// (see below).
///
/// Usage example:
/// \code
/// class MyNonCopyableClass : sf::NonCopyable
/// {
///     ...
/// };
/// \endcode
///
/// Deciding whether the instances of a class can be copied
/// or not is a very important design choice. You are strongly
/// encouraged to think about it before writing a class,
/// and to use sf::NonCopyable when necessary to prevent
/// many potential future errors when using it. This is also
/// a very important indication to users of your class.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable& operator =(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled assignment operator
    ///
    /// By making the assignment operator private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled copy constructor
    ///
    /// By making the copy constructor private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable() {}

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Because this class has a copy constructor, the compiler
    /// will not automatically generate the default constructor.
    /// That's why we must define it explicitely.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
class SFML_SYSTEM_API NonCopyable

////////////////////////////////////////////////////////////
/// \brief Utility class that makes any derived
///        class non-copyable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#ifndef SFML_NONCOPYABLE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp

////////////////////////////////////////////////////////////
/// \class sf::NonCopyable
/// \ingroup system
///
/// This class makes its instances non-copyable, by explicitely
/// disabling its copy constructor and its assignment operator.
///
/// To create a non-copyable class, simply inherit from
/// sf::NonCopyable.
///
/// The type of inheritance (public or private) doesn't matter,
/// the copy constructor and assignment operator are declared private
/// in sf::NonCopyable so they will end up being inaccessible in both
/// cases. Thus you can use a shorter syntax for inheriting from it
/// (see below).
///
/// Usage example:
/// \code
/// class MyNonCopyableClass : sf::NonCopyable
/// {
///     ...
/// };
/// \endcode
///
/// Deciding whether the instances of a class can be copied
/// or not is a very important design choice. You are strongly
/// encouraged to think about it before writing a class,
/// and to use sf::NonCopyable when necessary to prevent
/// many potential future errors when using it. This is also
/// a very important indication to users of your class.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable& operator =(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled assignment operator
    ///
    /// By making the assignment operator private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled copy constructor
    ///
    /// By making the copy constructor private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable() {}

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Because this class has a copy constructor, the compiler
    /// will not automatically generate the default constructor.
    /// That's why we must define it explicitely.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
class SFML_SYSTEM_API NonCopyable

////////////////////////////////////////////////////////////
/// \brief Utility class that makes any derived
///        class non-copyable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#ifndef SFML_NONCOPYABLE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp

////////////////////////////////////////////////////////////
/// \class sf::NonCopyable
/// \ingroup system
///
/// This class makes its instances non-copyable, by explicitely
/// disabling its copy constructor and its assignment operator.
///
/// To create a non-copyable class, simply inherit from
/// sf::NonCopyable.
///
/// The type of inheritance (public or private) doesn't matter,
/// the copy constructor and assignment operator are declared private
/// in sf::NonCopyable so they will end up being inaccessible in both
/// cases. Thus you can use a shorter syntax for inheriting from it
/// (see below).
///
/// Usage example:
/// \code
/// class MyNonCopyableClass : sf::NonCopyable
/// {
///     ...
/// };
/// \endcode
///
/// Deciding whether the instances of a class can be copied
/// or not is a very important design choice. You are strongly
/// encouraged to think about it before writing a class,
/// and to use sf::NonCopyable when necessary to prevent
/// many potential future errors when using it. This is also
/// a very important indication to users of your class.
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable& operator =(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled assignment operator
    ///
    /// By making the assignment operator private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable(const NonCopyable&);

    ////////////////////////////////////////////////////////////
    /// \brief Disabled copy constructor
    ///
    /// By making the copy constructor private, the compiler will
    /// trigger an error if anyone outside tries to use it.
    /// To prevent NonCopyable or friend classes from using it,
    /// we also give no definition, so that the linker will
    /// produce an error if the first protection was inefficient.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
    NonCopyable() {}

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Because this class has a copy constructor, the compiler
    /// will not automatically generate the default constructor.
    /// That's why we must define it explicitely.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
class SFML_SYSTEM_API NonCopyable

////////////////////////////////////////////////////////////
/// \brief Utility class that makes any derived
///        class non-copyable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
#ifndef SFML_NONCOPYABLE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//System/NonCopyable.hpp
//

////////////////////////////////////////////////////////////
