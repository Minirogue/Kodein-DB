package org.kodein.db.model.cache

import org.kodein.db.Options
import org.kodein.db.Sized

interface ModelCache : ModelCacheBase {

    object Skip : Options.Read, Options.Write
    object Refresh : Options.Read
    data class CopyMaxSize(val size: Long) : Options.Read

    sealed class Entry<V : Any> {
        abstract val value: V?
        abstract val size: Int

        data class Cached<V : Any>(override val value: V, override val size: Int) : Entry<V>(), Sized<V>
        object Deleted : Entry<Nothing>() { override val value = null ; override val size: Int = 8 }
        object NotInCache : Entry<Nothing>() { override val value = null ; override val size: Int = 0 }
    }

    val entryCount: Int
    val size: Long
    val maxSize: Long

    val hitCount: Int
    val missCount: Int
    val retrieveCount: Int
    val putCount: Int
    val deleteCount: Int
    val evictionCount: Int

    fun newCopy(copyMaxSize: Long): ModelCache

    companion object

}