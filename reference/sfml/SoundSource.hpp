_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundSource
/// \ingroup audio
///
/// sf::SoundSource is not meant to be used directly, it
/// only serves as a common base for all audio objects
/// that can live in the audio environment.
///
/// It defines several properties for the sound: pitch,
/// volume, position, attenuation, etc. All of them can be
/// changed at any time with no impact on performances.
///
/// \see sf::Sound, sf::SoundStream
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
};

    unsigned int m_source; ///< OpenAL source identifier
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    Status getStatus() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current status of the sound (stopped, paused, playing)
    ///
    /// \return Current status of the sound
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    SoundSource();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is meant ot be called by derived classes only.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    float getAttenuation() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the attenuation factor of the sound
    ///
    /// \return Attenuation factor of the sound
    ///
    /// \see setAttenuation, getMinDistance
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    float getMinDistance() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the minimum distance of the sound
    ///
    /// \return Minimum distance of the sound
    ///
    /// \see setMinDistance, getAttenuation
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    bool isRelativeToListener() const;

    ////////////////////////////////////////////////////////////
    /// \brief Tell whether the sound's position is relative to the
    ///        listener or is absolute
    ///
    /// \return True if the position is relative, false if it's absolute
    ///
    /// \see setRelativeToListener
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    Vector3f getPosition() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the 3D position of the sound in the audio scene
    ///
    /// \return Position of the sound
    ///
    /// \see setPosition
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    float getVolume() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the volume of the sound
    ///
    /// \return Volume of the sound, in the range [0, 100]
    ///
    /// \see setVolume
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    float getPitch() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the pitch of the sound
    ///
    /// \return Pitch of the sound
    ///
    /// \see setPitch
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    void setAttenuation(float attenuation);

    ////////////////////////////////////////////////////////////
    /// \brief Set the attenuation factor of the sound
    ///
    /// The attenuation is a multiplicative factor which makes
    /// the sound more or less loud according to its distance
    /// from the listener. An attenuation of 0 will produce a
    /// non-attenuated sound, i.e. its volume will always be the same
    /// whether it is heard from near or from far. On the other hand,
    /// an attenuation value such as 100 will make the sound fade out
    /// very quickly as it gets further from the listener.
    /// The default value of the attenuation is 1.
    ///
    /// \param attenuation New attenuation factor of the sound
    ///
    /// \see getAttenuation, setMinDistance
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    void setMinDistance(float distance);

    ////////////////////////////////////////////////////////////
    /// \brief Set the minimum distance of the sound
    ///
    /// The "minimum distance" of a sound is the maximum
    /// distance at which it is heard at its maximum volume. Further
    /// than the minimum distance, it will start to fade out according
    /// to its attenuation factor. A value of 0 ("inside the head
    /// of the listener") is an invalid value and is forbidden.
    /// The default value of the minimum distance is 1.
    ///
    /// \param distance New minimum distance of the sound
    ///
    /// \see getMinDistance, setAttenuation
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    void setRelativeToListener(bool relative);

    ////////////////////////////////////////////////////////////
    /// \brief Make the sound's position relative to the listener or absolute
    ///
    /// Making a sound relative to the listener will ensure that it will always
    /// be played the same way regardless the position of the listener.
    /// This can be useful for non-spatialized sounds, sounds that are
    /// produced by the listener, or sounds attached to it.
    /// The default value is false (position is absolute).
    ///
    /// \param relative True to set the position relative, false to set it absolute
    ///
    /// \see isRelativeToListener
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    void setPosition(const Vector3f& position);

    ////////////////////////////////////////////////////////////
    /// \brief Set the 3D position of the sound in the audio scene
    ///
    /// Only sounds with one channel (mono sounds) can be
    /// spatialized.
    /// The default position of a sound is (0, 0, 0).
    ///
    /// \param position Position of the sound in the scene
    ///
    /// \see getPosition
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    void setPosition(float x, float y, float z);

    ////////////////////////////////////////////////////////////
    /// \brief Set the 3D position of the sound in the audio scene
    ///
    /// Only sounds with one channel (mono sounds) can be
    /// spatialized.
    /// The default position of a sound is (0, 0, 0).
    ///
    /// \param x X coordinate of the position of the sound in the scene
    /// \param y Y coordinate of the position of the sound in the scene
    /// \param z Z coordinate of the position of the sound in the scene
    ///
    /// \see getPosition
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    void setVolume(float volume);

    ////////////////////////////////////////////////////////////
    /// \brief Set the volume of the sound
    ///
    /// The volume is a value between 0 (mute) and 100 (full volume).
    /// The default value for the volume is 100.
    ///
    /// \param volume Volume of the sound
    ///
    /// \see getVolume
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    void setPitch(float pitch);

    ////////////////////////////////////////////////////////////
    /// \brief Set the pitch of the sound
    ///
    /// The pitch represents the perceived fundamental frequency
    /// of a sound; thus you can make a sound more acute or grave
    /// by changing its pitch. A side effect of changing the pitch
    /// is to modify the playing speed of the sound as well.
    /// The default value for the pitch is 1.
    ///
    /// \param pitch New pitch to apply to the sound
    ///
    /// \see getPitch
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    virtual ~SoundSource();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    SoundSource(const SoundSource& copy);

    ////////////////////////////////////////////////////////////
    /// \brief Copy constructor
    ///
    /// \param copy Instance to copy
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    };

        Stopped, ///< Sound is not playing
        Paused,  ///< Sound is paused
        Playing  ///< Sound is playing
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
    enum Status

    ////////////////////////////////////////////////////////////
    /// \brief Enumeration of the sound source states
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
class SFML_AUDIO_API SoundSource

////////////////////////////////////////////////////////////
/// \brief Base class defining a sound's properties
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
#ifndef SFML_SOUNDSOURCE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundSource.hpp
//

////////////////////////////////////////////////////////////
