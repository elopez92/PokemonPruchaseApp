package com.elopez.pokemonfeature.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Ability(
    val ability: AbilityX,
    val is_hidden: Boolean,
    val slot: Int
): Parcelable