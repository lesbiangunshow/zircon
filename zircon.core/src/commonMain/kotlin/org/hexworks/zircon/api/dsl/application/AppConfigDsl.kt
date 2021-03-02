package org.hexworks.zircon.api.dsl.application

import org.hexworks.zircon.api.application.AppConfig
import org.hexworks.zircon.api.application.DebugConfig
import org.hexworks.zircon.api.application.ShortcutsConfig
import org.hexworks.zircon.api.builder.application.AppConfigBuilder
import org.hexworks.zircon.api.builder.application.DebugConfigBuilder
import org.hexworks.zircon.api.builder.application.ShortcutsConfigBuilder

fun appConfig(
    config: AppConfig = AppConfig.defaultConfiguration(),
    init: AppConfigBuilder.() -> Unit
): AppConfig =
    AppConfigBuilder(config).apply(init).build()

fun AppConfigBuilder.debugConfig(
    debugConfig: DebugConfig = DebugConfig.defaultConfig(),
    init: DebugConfigBuilder.() -> Unit) {
    withDebugConfig(
        DebugConfigBuilder(debugConfig).apply(init).build()
    )
}

fun AppConfigBuilder.shortcutsConfig(
    shortcutsConfig: ShortcutsConfig = ShortcutsConfig.defaultConfig(),
    init: ShortcutsConfigBuilder.() -> Unit) {
    withShortcutsConfig(
        ShortcutsConfigBuilder(shortcutsConfig).apply(init).build()
    )
}