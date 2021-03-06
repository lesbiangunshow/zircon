package org.hexworks.zircon.api

import java.util.function.BiConsumer
import java.util.function.Consumer

object Functions {

    @JvmStatic
    fun <T> fromConsumer(callable: Consumer<T>): Function1<T, Unit> {
        return { t ->
            callable.accept(t)
        }
    }

    @JvmStatic
    fun <T, U> fromBiConsumer(callable: BiConsumer<T, U>): Function2<T, U, Unit> {
        return { t, u ->
            callable.accept(t, u)
        }
    }
}
