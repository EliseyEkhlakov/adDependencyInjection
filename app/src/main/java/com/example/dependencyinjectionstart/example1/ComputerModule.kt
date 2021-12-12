package com.example.dependencyinjectionstart.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun providesStorage(): Storage{
        return Storage()
    }

    @Provides
    fun providesMemory(): Memory{
        return Memory()
    }

    @Provides
    fun providesProcessor(): Processor{
        return Processor()
    }

    @Provides
    fun providesMouse(): Mouse{
        return Mouse()
    }

    @Provides
    fun providesKeyboard(): Keyboard{
        return Keyboard()
    }


    @Provides
    fun provideComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ): ComputerTower {
        return ComputerTower(storage, memory, processor)
    }

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ): Computer {
        return Computer(monitor, computerTower, keyboard, mouse)
    }
}