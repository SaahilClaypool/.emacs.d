_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp

////////////////////////////////////////////////////////////
/// \class sf::Sound
/// \ingroup audio
///
/// sf::Sound is the class to use to play sounds.
/// It provides:
/// \li Control (play, pause, stop)
/// \li Ability to modify output parameters in real-time (pitch, volume, ...)
/// \li 3D spatial features (position, attenuation, ...).
///
/// sf::Sound is perfect for playing short sounds that can
/// fit in memory and require no latency, like foot steps or
/// gun shots. For longer sounds, like background musics
/// or long speeches, rather see sf::Music (which is based
/// on streaming).
///
/// In order to work, a sound must be given a buffer of audio
/// data to play. Audio data (samples) is stored in sf::SoundBuffer,
/// and attached to a sound with the setBuffer() function.
/// The buffer object attached to a sound must remain alive
/// as long as the sound uses it. Note that multiple sounds
/// can use the same sound buffer at the same time.
///
/// Usage example:
/// \code
/// sf::SoundBuffer buffer;
/// buffer.loadFromFile("sound.wav");
///
/// sf::Sound sound;
/// sound.setBuffer(buffer);
/// sound.play();
/// \endcode
///
/// \see sf::SoundBuffer, sf::Music
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
};

    ////////////////////////////////////////////////////////////
    const SoundBuffer* m_buffer; ///< Sound buffer bound to the source
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    void resetBuffer();

    ////////////////////////////////////////////////////////////
    /// \brief Reset the internal buffer of the sound
    ///
    /// This function is for internal use only, you don't have
    /// to use it. It is called by the sf::SoundBuffer that
    /// this sound uses, when it is destroyed in order to prevent
    /// the sound from using a dead buffer.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    Sound& operator =(const Sound& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of assignment operator
    ///
    /// \param right Instance to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    Status getStatus() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current status of the sound (stopped, paused, playing)
    ///
    /// \return Current status of the sound
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    Time getPlayingOffset() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current playing position of the sound
    ///
    /// \return Current playing position, from the beginning of the sound
    ///
    /// \see setPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    bool getLoop() const;

    ////////////////////////////////////////////////////////////
    /// \brief Tell whether or not the sound is in loop mode
    ///
    /// \return True if the sound is looping, false otherwise
    ///
    /// \see setLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    const SoundBuffer* getBuffer() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the audio buffer attached to the sound
    ///
    /// \return Sound buffer attached to the sound (can be NULL)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    void setPlayingOffset(Time timeOffset);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position of the sound
    ///
    /// The playing position can be changed when the sound is
    /// either paused or playing.
    ///
    /// \param timeOffset New playing position, from the beginning of the sound
    ///
    /// \see getPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    void setLoop(bool loop);

    ////////////////////////////////////////////////////////////
    /// \brief Set whether or not the sound should loop after reaching the end
    ///
    /// If set, the sound will restart from beginning after
    /// reaching the end and so on, until it is stopped or
    /// setLoop(false) is called.
    /// The default looping state for sound is false.
    ///
    /// \param loop True to play in loop, false to play once
    ///
    /// \see getLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    void setBuffer(const SoundBuffer& buffer);

    ////////////////////////////////////////////////////////////
    /// \brief Set the source buffer containing the audio data to play
    ///
    /// It is important to note that the sound buffer is not copied,
    /// thus the sf::SoundBuffer instance must remain alive as long
    /// as it is attached to the sound.
    ///
    /// \param buffer Sound buffer to attach to the sound
    ///
    /// \see getBuffer
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief stop playing the sound
    ///
    /// This function stops the sound if it was playing or paused,
    /// and does nothing if it was already stopped.
    /// It also resets the playing position (unlike pause()).
    ///
    /// \see play, pause
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    void pause();

    ////////////////////////////////////////////////////////////
    /// \brief Pause the sound
    ///
    /// This function pauses the sound if it was playing,
    /// otherwise (sound already paused or stopped) it has no effect.
    ///
    /// \see play, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    void play();

    ////////////////////////////////////////////////////////////
    /// \brief Start or resume playing the sound
    ///
    /// This function starts the stream if it was stopped, resumes
    /// it if it was paused, and restarts it from beginning if it
    /// was it already playing.
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the sound is played.
    ///
    /// \see pause, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    ~Sound();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    Sound(const Sound& copy);

    ////////////////////////////////////////////////////////////
    /// \brief Copy constructor
    ///
    /// \param copy Instance to copy
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    explicit Sound(const SoundBuffer& buffer);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the sound with a buffer
    ///
    /// \param buffer Sound buffer containing the audio data to play with the sound
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    Sound();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
class SFML_AUDIO_API Sound : public SoundSource

////////////////////////////////////////////////////////////
/// \brief Regular sound that can be played in the audio environment
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
#ifndef SFML_SOUND_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp

////////////////////////////////////////////////////////////
/// \class sf::Sound
/// \ingroup audio
///
/// sf::Sound is the class to use to play sounds.
/// It provides:
/// \li Control (play, pause, stop)
/// \li Ability to modify output parameters in real-time (pitch, volume, ...)
/// \li 3D spatial features (position, attenuation, ...).
///
/// sf::Sound is perfect for playing short sounds that can
/// fit in memory and require no latency, like foot steps or
/// gun shots. For longer sounds, like background musics
/// or long speeches, rather see sf::Music (which is based
/// on streaming).
///
/// In order to work, a sound must be given a buffer of audio
/// data to play. Audio data (samples) is stored in sf::SoundBuffer,
/// and attached to a sound with the setBuffer() function.
/// The buffer object attached to a sound must remain alive
/// as long as the sound uses it. Note that multiple sounds
/// can use the same sound buffer at the same time.
///
/// Usage example:
/// \code
/// sf::SoundBuffer buffer;
/// buffer.loadFromFile("sound.wav");
///
/// sf::Sound sound;
/// sound.setBuffer(buffer);
/// sound.play();
/// \endcode
///
/// \see sf::SoundBuffer, sf::Music
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
};

    ////////////////////////////////////////////////////////////
    const SoundBuffer* m_buffer; ///< Sound buffer bound to the source
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    void resetBuffer();

    ////////////////////////////////////////////////////////////
    /// \brief Reset the internal buffer of the sound
    ///
    /// This function is for internal use only, you don't have
    /// to use it. It is called by the sf::SoundBuffer that
    /// this sound uses, when it is destroyed in order to prevent
    /// the sound from using a dead buffer.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    Sound& operator =(const Sound& right);

    ////////////////////////////////////////////////////////////
    /// \brief Overload of assignment operator
    ///
    /// \param right Instance to assign
    ///
    /// \return Reference to self
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    Status getStatus() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current status of the sound (stopped, paused, playing)
    ///
    /// \return Current status of the sound
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    Time getPlayingOffset() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current playing position of the sound
    ///
    /// \return Current playing position, from the beginning of the sound
    ///
    /// \see setPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    bool getLoop() const;

    ////////////////////////////////////////////////////////////
    /// \brief Tell whether or not the sound is in loop mode
    ///
    /// \return True if the sound is looping, false otherwise
    ///
    /// \see setLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    const SoundBuffer* getBuffer() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the audio buffer attached to the sound
    ///
    /// \return Sound buffer attached to the sound (can be NULL)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    void setPlayingOffset(Time timeOffset);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current playing position of the sound
    ///
    /// The playing position can be changed when the sound is
    /// either paused or playing.
    ///
    /// \param timeOffset New playing position, from the beginning of the sound
    ///
    /// \see getPlayingOffset
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    void setLoop(bool loop);

    ////////////////////////////////////////////////////////////
    /// \brief Set whether or not the sound should loop after reaching the end
    ///
    /// If set, the sound will restart from beginning after
    /// reaching the end and so on, until it is stopped or
    /// setLoop(false) is called.
    /// The default looping state for sound is false.
    ///
    /// \param loop True to play in loop, false to play once
    ///
    /// \see getLoop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    void setBuffer(const SoundBuffer& buffer);

    ////////////////////////////////////////////////////////////
    /// \brief Set the source buffer containing the audio data to play
    ///
    /// It is important to note that the sound buffer is not copied,
    /// thus the sf::SoundBuffer instance must remain alive as long
    /// as it is attached to the sound.
    ///
    /// \param buffer Sound buffer to attach to the sound
    ///
    /// \see getBuffer
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief stop playing the sound
    ///
    /// This function stops the sound if it was playing or paused,
    /// and does nothing if it was already stopped.
    /// It also resets the playing position (unlike pause()).
    ///
    /// \see play, pause
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    void pause();

    ////////////////////////////////////////////////////////////
    /// \brief Pause the sound
    ///
    /// This function pauses the sound if it was playing,
    /// otherwise (sound already paused or stopped) it has no effect.
    ///
    /// \see play, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    void play();

    ////////////////////////////////////////////////////////////
    /// \brief Start or resume playing the sound
    ///
    /// This function starts the stream if it was stopped, resumes
    /// it if it was paused, and restarts it from beginning if it
    /// was it already playing.
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the sound is played.
    ///
    /// \see pause, stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    ~Sound();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    Sound(const Sound& copy);

    ////////////////////////////////////////////////////////////
    /// \brief Copy constructor
    ///
    /// \param copy Instance to copy
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    explicit Sound(const SoundBuffer& buffer);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the sound with a buffer
    ///
    /// \param buffer Sound buffer containing the audio data to play with the sound
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
    Sound();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
class SFML_AUDIO_API Sound : public SoundSource

////////////////////////////////////////////////////////////
/// \brief Regular sound that can be played in the audio environment
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
#ifndef SFML_SOUND_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/Sound.hpp
//

////////////////////////////////////////////////////////////
