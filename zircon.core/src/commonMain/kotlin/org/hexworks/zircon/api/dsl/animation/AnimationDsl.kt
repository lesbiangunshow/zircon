package org.hexworks.zircon.api.dsl.animation

import org.hexworks.zircon.api.animation.Animation
import org.hexworks.zircon.api.builder.animation.AnimationBuilder

fun animation(init: AnimationBuilder.() -> Unit): Animation =
    AnimationBuilder.newBuilder().apply(init).build()
