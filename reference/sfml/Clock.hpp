_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp

////////////////////////////////////////////////////////////
/// \class sf::Clock
/// \ingroup system
///
/// sf::Clock is a lightweight class for measuring time.
///
/// Its provides the most precise time that the underlying
/// OS can achieve (generally microseconds or nanoseconds).
/// It also ensures monotonicity, which means that the returned
/// time can never go backward, even if the system time is
/// changed.
///
/// Usage example:
/// \code
/// sf::Clock clock;
/// ...
/// Time time1 = clock.getElapsedTime();
/// ...
/// Time time2 = clock.restart();
/// \endcode
///
/// The sf::Time value returned by the clock can then be
/// converted to a number of seconds, milliseconds or even
/// microseconds.
///
/// \see sf::Time
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
};

    ////////////////////////////////////////////////////////////
    Time m_startTime; ///< Time of last reset, in microseconds
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
    Time restart();

    ////////////////////////////////////////////////////////////
    /// \brief Restart the clock
    ///
    /// This function puts the time counter back to zero.
    /// It also returns the time elapsed since the clock was started.
    ///
    /// \return Time elapsed
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
    Time getElapsedTime() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the elapsed time
    ///
    /// This function returns the time elapsed since the last call
    /// to restart() (or the construction of the instance if restart()
    /// has not been called).
    ///
    /// \return Time elapsed
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
    Clock();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// The clock starts automatically after being constructed.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
class SFML_SYSTEM_API Clock

////////////////////////////////////////////////////////////
/// \brief Utility class that measures the elapsed time
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
#ifndef SFML_CLOCK_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp

////////////////////////////////////////////////////////////
/// \class sf::Clock
/// \ingroup system
///
/// sf::Clock is a lightweight class for measuring time.
///
/// Its provides the most precise time that the underlying
/// OS can achieve (generally microseconds or nanoseconds).
/// It also ensures monotonicity, which means that the returned
/// time can never go backward, even if the system time is
/// changed.
///
/// Usage example:
/// \code
/// sf::Clock clock;
/// ...
/// Time time1 = clock.getElapsedTime();
/// ...
/// Time time2 = clock.restart();
/// \endcode
///
/// The sf::Time value returned by the clock can then be
/// converted to a number of seconds, milliseconds or even
/// microseconds.
///
/// \see sf::Time
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
};

    ////////////////////////////////////////////////////////////
    Time m_startTime; ///< Time of last reset, in microseconds
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
    Time restart();

    ////////////////////////////////////////////////////////////
    /// \brief Restart the clock
    ///
    /// This function puts the time counter back to zero.
    /// It also returns the time elapsed since the clock was started.
    ///
    /// \return Time elapsed
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
    Time getElapsedTime() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the elapsed time
    ///
    /// This function returns the time elapsed since the last call
    /// to restart() (or the construction of the instance if restart()
    /// has not been called).
    ///
    /// \return Time elapsed
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
    Clock();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// The clock starts automatically after being constructed.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
class SFML_SYSTEM_API Clock

////////////////////////////////////////////////////////////
/// \brief Utility class that measures the elapsed time
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
#ifndef SFML_CLOCK_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Clock.hpp
//

////////////////////////////////////////////////////////////
