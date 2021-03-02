package org.hexworks.zircon.api.dsl.application

import org.hexworks.zircon.api.application.DebugConfig
import org.hexworks.zircon.api.builder.application.DebugConfigBuilder

fun debugConfig(
    debugConfig: DebugConfig = DebugConfig.defaultConfig(),
    init: DebugConfigBuilder.() -> Unit
): DebugConfig =
    DebugConfigBuilder(debugConfig).apply(init).build()

