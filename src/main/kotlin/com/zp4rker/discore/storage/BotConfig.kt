package com.zp4rker.discore.storage

import kotlinx.serialization.Serializable

/**
 * @author zp4rker
 */
@Serializable
data class BotConfig(
    val name: String = "disbot",
    val token: String = "token.here",
    val prefix: String = "/"
)