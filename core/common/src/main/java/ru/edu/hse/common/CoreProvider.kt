package ru.edu.hse.common

import kotlinx.coroutines.CoroutineScope

/**
 * Provides global entities.
 */
interface CoreProvider {

    val appRestarter: AppRestarter

    val errorHandler: ErrorHandler

    val globalScope: CoroutineScope

    val logger: Logger

    val resources: Resources

    val toaster: Toaster

    val remoteTimeoutMillis: Long get() = 10000L

    val appRestartTimeoutMillis: Long get() = 10000L
}